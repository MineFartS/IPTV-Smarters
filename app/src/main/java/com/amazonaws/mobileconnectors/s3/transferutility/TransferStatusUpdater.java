package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class TransferStatusUpdater {
    public static final String TEMP_FILE_PREFIX = "aws-s3-d861b25a-1edf-11eb-adc1-0242ac120002";
    private static TransferDBUtil dbUtil;
    private static TransferStatusUpdater transferStatusUpdater;
    private final Handler mainHandler;
    private final Map<Integer, TransferRecord> transfers;
    private static final Log LOGGER = LogFactory.getLog((Class<?>) TransferStatusUpdater.class);
    private static final HashSet<TransferState> STATES_NOT_TO_NOTIFY = new HashSet<>(Arrays.asList(TransferState.PART_COMPLETED, TransferState.PENDING_CANCEL, TransferState.PENDING_PAUSE, TransferState.PENDING_NETWORK_DISCONNECT));
    public static final Map<Integer, List<TransferListener>> LISTENERS = new ConcurrentHashMap<Integer, List<TransferListener>>() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.1
    };

    public class TransferProgressListener implements ProgressListener {
        private long bytesTransferredSoFar;
        private final TransferRecord transfer;

        public TransferProgressListener(TransferRecord transferRecord) {
            this.transfer = transferRecord;
        }

        @Override // com.amazonaws.event.ProgressListener
        public synchronized void progressChanged(ProgressEvent progressEvent) {
            if (32 == progressEvent.getEventCode()) {
                TransferStatusUpdater.LOGGER.info("Reset Event triggered. Resetting the bytesCurrent to 0.");
                this.bytesTransferredSoFar = 0L;
            } else {
                long bytesTransferred = this.bytesTransferredSoFar + progressEvent.getBytesTransferred();
                this.bytesTransferredSoFar = bytesTransferred;
                TransferRecord transferRecord = this.transfer;
                if (bytesTransferred > transferRecord.bytesCurrent) {
                    transferRecord.bytesCurrent = bytesTransferred;
                    TransferStatusUpdater.this.updateProgress(transferRecord.id, bytesTransferred, transferRecord.bytesTotal, true);
                }
            }
        }
    }

    public TransferStatusUpdater(TransferDBUtil transferDBUtil) {
        dbUtil = transferDBUtil;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.transfers = new ConcurrentHashMap();
    }

    public static synchronized TransferStatusUpdater getInstance(Context context) {
        if (transferStatusUpdater == null) {
            TransferDBUtil transferDBUtil = new TransferDBUtil(context);
            dbUtil = transferDBUtil;
            transferStatusUpdater = new TransferStatusUpdater(transferDBUtil);
        }
        return transferStatusUpdater;
    }

    public static void registerListener(int i2, TransferListener transferListener) {
        if (transferListener == null) {
            throw new IllegalArgumentException("Listener can't be null");
        }
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            List<TransferListener> list = map.get(Integer.valueOf(i2));
            if (list == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                copyOnWriteArrayList.add(transferListener);
                map.put(Integer.valueOf(i2), copyOnWriteArrayList);
            } else if (!list.contains(transferListener)) {
                list.add(transferListener);
            }
        }
    }

    public static void unregisterListener(int i2, TransferListener transferListener) {
        if (transferListener == null) {
            throw new IllegalArgumentException("Listener can't be null");
        }
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            List<TransferListener> list = map.get(Integer.valueOf(i2));
            if (list != null && !list.isEmpty()) {
                list.remove(transferListener);
            }
        }
    }

    public synchronized void addTransfer(TransferRecord transferRecord) {
        this.transfers.put(Integer.valueOf(transferRecord.id), transferRecord);
    }

    public synchronized void clear() {
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            map.clear();
        }
        this.transfers.clear();
    }

    public synchronized TransferRecord getTransfer(int i2) {
        return this.transfers.get(Integer.valueOf(i2));
    }

    public synchronized Map<Integer, TransferRecord> getTransfers() {
        return Collections.unmodifiableMap(this.transfers);
    }

    public synchronized ProgressListener newProgressListener(int i2) {
        TransferRecord transfer;
        transfer = getTransfer(i2);
        if (transfer == null) {
            LOGGER.info("TransferStatusUpdater doesn't track the transfer: " + i2);
            throw new IllegalArgumentException("transfer " + i2 + " doesn't exist");
        }
        LOGGER.info("Creating a new progress listener for transfer: " + i2);
        return new TransferProgressListener(transfer);
    }

    public synchronized void removeTransfer(int i2) {
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            map.remove(Integer.valueOf(i2));
        }
        this.transfers.remove(Integer.valueOf(i2));
    }

    public synchronized void removeTransferRecordFromDB(int i2) {
        TransferRecord transferById = dbUtil.getTransferById(i2);
        if (transferById != null) {
            String str = transferById.file;
            if (new File(str).getName().startsWith(TEMP_FILE_PREFIX)) {
                new File(str).delete();
            }
        }
        S3ClientReference.remove(Integer.valueOf(i2));
        dbUtil.deleteTransferRecords(i2);
    }

    public void throwError(final int i2, final Exception exc) {
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            List<TransferListener> list = map.get(Integer.valueOf(i2));
            if (list != null && !list.isEmpty()) {
                for (final TransferListener transferListener : list) {
                    this.mainHandler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.4
                        @Override // java.lang.Runnable
                        public void run() {
                            transferListener.onError(i2, exc);
                        }
                    });
                }
            }
        }
    }

    public synchronized void updateProgress(final int i2, final long j2, final long j3, boolean z) {
        TransferRecord transferRecord = this.transfers.get(Integer.valueOf(i2));
        if (transferRecord != null) {
            transferRecord.bytesCurrent = j2;
            transferRecord.bytesTotal = j3;
        }
        dbUtil.updateBytesTransferred(i2, j2);
        if (z) {
            Map<Integer, List<TransferListener>> map = LISTENERS;
            synchronized (map) {
                List<TransferListener> list = map.get(Integer.valueOf(i2));
                if (list != null && !list.isEmpty()) {
                    for (Iterator<TransferListener> it = list.iterator(); it.hasNext(); it = it) {
                        final TransferListener next = it.next();
                        this.mainHandler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.3
                            @Override // java.lang.Runnable
                            public void run() {
                                next.onProgressChanged(i2, j2, j3);
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x00bd, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0015, B:7:0x001d, B:8:0x0030, B:16:0x005d, B:18:0x0065, B:19:0x0068, B:20:0x006a, B:45:0x00bc, B:9:0x0034, B:11:0x0045, B:21:0x006b, B:23:0x0077, B:26:0x007e, B:27:0x0082, B:29:0x0088, B:30:0x0099, B:32:0x00a1, B:34:0x00a9, B:37:0x00b4, B:36:0x00b1, B:40:0x00b7), top: B:52:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void updateState(final int r7, final com.amazonaws.mobileconnectors.s3.transferutility.TransferState r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.HashSet<com.amazonaws.mobileconnectors.s3.transferutility.TransferState> r0 = com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.STATES_NOT_TO_NOTIFY     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r0.contains(r8)     // Catch: java.lang.Throwable -> Lbd
            java.util.Map<java.lang.Integer, com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord> r1 = r6.transfers     // Catch: java.lang.Throwable -> Lbd
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> Lbd
            com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord r1 = (com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord) r1     // Catch: java.lang.Throwable -> Lbd
            if (r1 != 0) goto L34
            com.amazonaws.mobileconnectors.s3.transferutility.TransferDBUtil r1 = com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.dbUtil     // Catch: java.lang.Throwable -> Lbd
            int r1 = r1.updateState(r7, r8)     // Catch: java.lang.Throwable -> Lbd
            if (r1 != 0) goto L59
            com.amazonaws.logging.Log r1 = com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.LOGGER     // Catch: java.lang.Throwable -> Lbd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            r2.<init>()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r3 = "Failed to update the status of transfer "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lbd
            r2.append(r7)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lbd
        L30:
            r1.warn(r2)     // Catch: java.lang.Throwable -> Lbd
            goto L59
        L34:
            com.amazonaws.mobileconnectors.s3.transferutility.TransferState r2 = r1.state     // Catch: java.lang.Throwable -> Lbd
            boolean r2 = r8.equals(r2)     // Catch: java.lang.Throwable -> Lbd
            r0 = r0 | r2
            r1.state = r8     // Catch: java.lang.Throwable -> Lbd
            com.amazonaws.mobileconnectors.s3.transferutility.TransferDBUtil r2 = com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.dbUtil     // Catch: java.lang.Throwable -> Lbd
            int r1 = r2.updateTransferRecord(r1)     // Catch: java.lang.Throwable -> Lbd
            if (r1 != 0) goto L59
            com.amazonaws.logging.Log r1 = com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.LOGGER     // Catch: java.lang.Throwable -> Lbd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            r2.<init>()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r3 = "Failed to update the status of transfer "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lbd
            r2.append(r7)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lbd
            goto L30
        L59:
            if (r0 == 0) goto L5d
            monitor-exit(r6)
            return
        L5d:
            com.amazonaws.mobileconnectors.s3.transferutility.TransferState r0 = com.amazonaws.mobileconnectors.s3.transferutility.TransferState.COMPLETED     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r0.equals(r8)     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L68
            r6.removeTransferRecordFromDB(r7)     // Catch: java.lang.Throwable -> Lbd
        L68:
            java.util.Map<java.lang.Integer, java.util.List<com.amazonaws.mobileconnectors.s3.transferutility.TransferListener>> r0 = com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.LISTENERS     // Catch: java.lang.Throwable -> Lbd
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Lbd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> Lba
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lba
            if (r1 == 0) goto Lb7
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lba
            if (r2 == 0) goto L7e
            goto Lb7
        L7e:
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> Lba
        L82:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lba
            if (r3 == 0) goto L99
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lba
            com.amazonaws.mobileconnectors.s3.transferutility.TransferListener r3 = (com.amazonaws.mobileconnectors.s3.transferutility.TransferListener) r3     // Catch: java.lang.Throwable -> Lba
            android.os.Handler r4 = r6.mainHandler     // Catch: java.lang.Throwable -> Lba
            com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater$2 r5 = new com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater$2     // Catch: java.lang.Throwable -> Lba
            r5.<init>()     // Catch: java.lang.Throwable -> Lba
            r4.post(r5)     // Catch: java.lang.Throwable -> Lba
            goto L82
        L99:
            com.amazonaws.mobileconnectors.s3.transferutility.TransferState r7 = com.amazonaws.mobileconnectors.s3.transferutility.TransferState.COMPLETED     // Catch: java.lang.Throwable -> Lba
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> Lba
            if (r7 != 0) goto Lb1
            com.amazonaws.mobileconnectors.s3.transferutility.TransferState r7 = com.amazonaws.mobileconnectors.s3.transferutility.TransferState.FAILED     // Catch: java.lang.Throwable -> Lba
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> Lba
            if (r7 != 0) goto Lb1
            com.amazonaws.mobileconnectors.s3.transferutility.TransferState r7 = com.amazonaws.mobileconnectors.s3.transferutility.TransferState.CANCELED     // Catch: java.lang.Throwable -> Lba
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> Lba
            if (r7 == 0) goto Lb4
        Lb1:
            r1.clear()     // Catch: java.lang.Throwable -> Lba
        Lb4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r6)
            return
        Lb7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r6)
            return
        Lba:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lba
            throw r7     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r7 = move-exception
            monitor-exit(r6)
            goto Lc1
        Lc0:
            throw r7
        Lc1:
            goto Lc0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.updateState(int, com.amazonaws.mobileconnectors.s3.transferutility.TransferState):void");
    }
}

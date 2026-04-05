package com.amazonaws.mobileconnectors.s3.transferutility;

import android.database.Cursor;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class TransferObserver {
    private String bucket;
    private long bytesTotal;
    private long bytesTransferred;
    private final TransferDBUtil dbUtil;
    private String filePath;
    private final int id;
    private String key;
    private TransferStatusListener statusListener;
    private TransferListener transferListener;
    private TransferState transferState;

    public class TransferStatusListener implements TransferListener {
        private TransferStatusListener() {
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onError(int i2, Exception exc) {
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onProgressChanged(int i2, long j2, long j3) {
            TransferObserver.this.bytesTransferred = j2;
            TransferObserver.this.bytesTotal = j3;
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onStateChanged(int i2, TransferState transferState) {
            TransferObserver.this.transferState = transferState;
        }
    }

    public TransferObserver(int i2, TransferDBUtil transferDBUtil) {
        this.id = i2;
        this.dbUtil = transferDBUtil;
    }

    public TransferObserver(int i2, TransferDBUtil transferDBUtil, String str, String str2, File file) {
        this.id = i2;
        this.dbUtil = transferDBUtil;
        this.bucket = str;
        this.key = str2;
        this.filePath = file.getAbsolutePath();
        this.bytesTotal = file.length();
        this.transferState = TransferState.WAITING;
    }

    public TransferObserver(int i2, TransferDBUtil transferDBUtil, String str, String str2, File file, TransferListener transferListener) {
        this(i2, transferDBUtil, str, str2, file);
        setTransferListener(transferListener);
    }

    public void cleanTransferListener() {
        synchronized (this) {
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                TransferStatusUpdater.unregisterListener(this.id, transferListener);
                this.transferListener = null;
            }
            TransferStatusListener transferStatusListener = this.statusListener;
            if (transferStatusListener != null) {
                TransferStatusUpdater.unregisterListener(this.id, transferStatusListener);
                this.statusListener = null;
            }
        }
    }

    public String getAbsoluteFilePath() {
        return this.filePath;
    }

    public String getBucket() {
        return this.bucket;
    }

    public long getBytesTotal() {
        return this.bytesTotal;
    }

    public long getBytesTransferred() {
        return this.bytesTransferred;
    }

    public int getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public TransferState getState() {
        return this.transferState;
    }

    public void refresh() {
        Cursor cursorQueryTransferById = null;
        try {
            cursorQueryTransferById = this.dbUtil.queryTransferById(this.id);
            if (cursorQueryTransferById.moveToFirst()) {
                updateFromDB(cursorQueryTransferById);
            }
            cursorQueryTransferById.close();
        } catch (Throwable th) {
            if (cursorQueryTransferById != null) {
                cursorQueryTransferById.close();
            }
            throw th;
        }
    }

    public void setTransferListener(TransferListener transferListener) {
        if (transferListener != null) {
            synchronized (this) {
                cleanTransferListener();
                TransferStatusListener transferStatusListener = new TransferStatusListener();
                this.statusListener = transferStatusListener;
                TransferStatusUpdater.registerListener(this.id, transferStatusListener);
                this.transferListener = transferListener;
                TransferStatusUpdater.registerListener(this.id, transferListener);
            }
        }
    }

    public String toString() {
        return "TransferObserver{id=" + this.id + ", bucket='" + this.bucket + "', key='" + this.key + "', bytesTotal=" + this.bytesTotal + ", bytesTransferred=" + this.bytesTransferred + ", transferState=" + this.transferState + ", filePath='" + this.filePath + "'}";
    }

    public void updateFromDB(Cursor cursor) {
        this.bucket = cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BUCKET_NAME));
        this.key = cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_KEY));
        this.bytesTotal = cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL));
        this.bytesTransferred = cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_CURRENT));
        this.transferState = TransferState.getState(cursor.getString(cursor.getColumnIndexOrThrow("state")));
        this.filePath = cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_FILE));
    }
}

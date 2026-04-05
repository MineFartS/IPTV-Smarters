package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2F {
    public static C2F A05;
    public static byte[] A06;
    public static String[] A07;
    public static final Object A08;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<C2E>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<C2E>> A03 = new HashMap<>();
    public final ArrayList<C2D> A02 = new ArrayList<>();

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-116, -116, -78, -43, -40, -32, -47, -34, -116, -48, -43, -48, -116, -38, -37, -32, -116, -39, -51, -32, -49, -44, -90, -116, -111, -111, -73, -38, -35, -27, -42, -29, -111, -34, -46, -27, -44, -39, -42, -43, -110, -111, -111, -34, -46, -27, -44, -39, -82, -95, -23, -102, -23, -32, -102, -29, -24, -18, -33, -24, -18, -102, 126, -47, -63, -58, -61, -53, -61, 126, -88, -54, -37, -48, -42, -43, -121, -45, -48, -38, -37, -95, -121, 27, 62, 50, 48, 59, DateTimeFieldType.HOUR_OF_DAY, 65, 62, 48, 51, 50, 48, 66, 67, 28, 48, 61, 48, 54, 52, 65, -51, -31, -12, -29, -24, -23, -18, -25, -96, -31, -25, -31, -23, -18, -13, -12, -96, -26, -23, -20, -12, -27, -14, -96, -80, -61, -47, -51, -54, -44, -57, -52, -59, 126, -46, -41, -50, -61, 126, -19, -17, 0, -11, -5, -6, -3, -5, DateTimeFieldType.HOUR_OF_HALFDAY, -1, 1, 9, 12, DateTimeFieldType.MINUTE_OF_HOUR, 9, 6, 25, 6, 29, 34, 25, DateTimeFieldType.HOUR_OF_HALFDAY, -53, -60, -63, -60, -59, -51, -60, 118, -56, -69, -73, -55, -59, -60};
    }

    public static void A04() {
        A07 = new String[]{"JAgQ2spdQpH8xKgxtQcQLLz6sgGCkpe2", "SMfU9IuS4ycu6Y2ZHRBSqn3aWPXKMTOT", "55l84Ag1V6wgeVOPN73gijnv7nIwTIEx", "eOq258YlCb1TEbA", "VJMc46I8NXWnx7x8GW3WGk3ASQlYYFHT", "LoC5Exa7K60en74lmCNTJxDot4v0o8bM", "KRpLxkqJYlgWqGJZ48eoA1wpDd5KWG89", "Gt8Vn0C4eF81I9TsnyjdaH21jMiVX3Ky"};
    }

    static {
        A04();
        A03();
        A08 = new Object();
    }

    public C2F(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A01 = new Handler(mainLooper) { // from class: com.facebook.ads.redexgen.X.2C
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    this.A00.A02();
                }
            }
        };
    }

    public static C2F A00(Context context) {
        C2F c2f;
        synchronized (A08) {
            if (A05 == null) {
                A05 = new C2F(context.getApplicationContext());
            }
            c2f = A05;
        }
        return c2f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C2D[] c2dArr;
        while (true) {
            synchronized (this.A04) {
                int size = this.A02.size();
                if (size > 0) {
                    c2dArr = new C2D[size];
                    this.A02.toArray(c2dArr);
                    this.A02.clear();
                } else {
                    return;
                }
            }
            for (C2D c2d : c2dArr) {
                int size2 = c2d.A01.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C2E c2e = c2d.A01.get(i2);
                    if (!c2e.A01) {
                        c2e.A02.onReceive(this.A00, c2d.A00);
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<C2E> arrayListRemove = this.A04.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                C2E c2e = arrayListRemove.get(size);
                c2e.A01 = true;
                for (int i2 = 0; i2 < c2e.A03.countActions(); i2++) {
                    String action = c2e.A03.getAction(i2);
                    ArrayList<C2E> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            C2E c2e2 = arrayList.get(size2);
                            if (c2e2.A02 == broadcastReceiver) {
                                c2e2.A01 = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A07(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            C2E c2e = new C2E(intentFilter, broadcastReceiver);
            ArrayList<C2E> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c2e);
            for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                String action = intentFilter.getAction(i2);
                ArrayList<C2E> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(c2e);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:64:0x01be */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016a A[Catch: all -> 0x01ea, TryCatch #0 {, blocks: (B:4:0x0005, B:16:0x0087, B:19:0x0097, B:21:0x00b0, B:23:0x00b6, B:25:0x00be, B:26:0x00d8, B:59:0x01ae, B:29:0x00de, B:32:0x00f8, B:34:0x0116, B:35:0x011b, B:51:0x0160, B:56:0x0192, B:55:0x0189, B:52:0x016a, B:53:0x0174, B:54:0x017e, B:63:0x01ba, B:65:0x01c0, B:66:0x01cc, B:68:0x01df, B:69:0x01e4, B:72:0x01e7, B:15:0x004f), top: B:78:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A08(android.content.Intent r23) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2F.A08(android.content.Intent):boolean");
    }
}

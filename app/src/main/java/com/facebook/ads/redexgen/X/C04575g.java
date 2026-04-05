package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import java.lang.reflect.Method;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04575g {
    public static byte[] A00;
    public static String[] A01;
    public static final String A02;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        byte[] bArr = {112, 82, 93, 93, 92, 71, DateTimeFieldType.MINUTE_OF_HOUR, 84, 86, 71, DateTimeFieldType.MINUTE_OF_HOUR, 82, 87, 69, 86, 65, 71, 90, 64, 90, 93, 84, DateTimeFieldType.MINUTE_OF_HOUR, 90, 93, 85, 92, DateTimeFieldType.MINUTE_OF_HOUR, 92, 93, DateTimeFieldType.MINUTE_OF_HOUR, 94, 82, 90, 93, DateTimeFieldType.MINUTE_OF_HOUR, 71, 91, 65, 86, 82, 87, 29, 91, 87, 85, DateTimeFieldType.MILLIS_OF_DAY, 95, 87, 87, 95, 84, 93, DateTimeFieldType.MILLIS_OF_DAY, 89, 86, 92, 74, 87, 81, 92, DateTimeFieldType.MILLIS_OF_DAY, 95, 85, 75, 82, 94, 92, 31, 86, 94, 94, 86, 93, 84, 31, 80, 95, 85, 67, 94, 88, 85, 31, 86, 92, 66, 31, 80, 85, 66, 31, 88, 85, 84, 95, 69, 88, 87, 88, 84, 67, 31, 112, 85, 71, 84, 67, 69, 88, 66, 88, 95, 86, 120, 85, 114, 93, 88, 84, 95, 69, 109, 97, 99, 32, 105, 97, 97, 105, 98, 107, 32, 111, 96, 106, 124, 97, 103, 106, 32, 105, 99, 125, 32, 111, 106, 125, 32, 103, 106, 107, 96, 122, 103, 104, 103, 107, 124, 32, 125, 107, 124, 120, 103, 109, 107, 32, 93, 90, 79, 92, 90, DateTimeFieldType.MINUTE_OF_DAY, 30, 28, 95, DateTimeFieldType.MILLIS_OF_DAY, 30, 30, DateTimeFieldType.MILLIS_OF_DAY, 29, DateTimeFieldType.SECOND_OF_DAY, 95, DateTimeFieldType.CLOCKHOUR_OF_DAY, 31, DateTimeFieldType.SECOND_OF_MINUTE, 3, 30, 24, DateTimeFieldType.SECOND_OF_MINUTE, 95, DateTimeFieldType.MILLIS_OF_DAY, 28, 2, 95, DateTimeFieldType.MINUTE_OF_DAY, 30, 28, 28, 30, 31, 95, 54, 30, 30, DateTimeFieldType.MILLIS_OF_DAY, 29, DateTimeFieldType.SECOND_OF_DAY, 33, 29, DateTimeFieldType.CLOCKHOUR_OF_DAY, 8, 34, DateTimeFieldType.SECOND_OF_DAY, 3, 7, 24, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 2, 36, 5, 24, 29, 67, 65, 74, 65, 86, 77, 71, 106, 104, 121, 76, 105, 123, 104, 127, 121, 100, 126, 100, 99, 106, 68, 105, 68, 99, 107, 98, 123, 121, 104, 85, 120, 33, 59, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 39, 39, 47, 36, 45, 24, 36, 41, 49, 27, 45, 58, 62, 33, 43, 45, 59, 9, 62, 41, 33, 36, 41, 42, 36, 45, 43, 49, DateTimeFieldType.HOUR_OF_HALFDAY, 43, 47, 43, 54, 3, 38, DateTimeFieldType.MILLIS_OF_DAY, 48, 35, 33, 41, 43, 44, 37, 7, 44, 35, 32, 46, 39, 38};
        if (A01[0].charAt(25) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[7] = "5c2qL4dH8BvO0Uzn9h0t1hzuT";
        strArr[3] = "iopOujFX2mYmGwDZvEry";
        A00 = bArr;
    }

    public static void A06() {
        A01 = new String[]{"o8zuart55Bmx3Pw0EGryupigSLJoPiZx", "bq35BXrVyo2MmN2pvK0AAoIbsBJXmHFn", "Ag4UQwTEuL9TJhKNxG6", "PmxOul6ExA7xevKGmIJ7", "bJjslG0QPgIDYXjJzGe0RXJuWF5PAt6I", "GLZoSVJacutm5kJ9CSmVpuybEaBnhneX", "dIwLXajRtHFv7I4e8IdUhcaSFtkhp8vw", "TtnuuoV6cihzxwpt43jVepBLS"};
    }

    static {
        A06();
        A05();
        A02 = C5Y.class.getSimpleName();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C5Y A00(com.facebook.ads.redexgen.X.C8C r5) {
        /*
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 == r0) goto L50
            com.facebook.ads.redexgen.X.5Y r4 = A01(r5)
            if (r4 == 0) goto L3b
            java.lang.String r0 = r4.A03()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C04575g.A01
            r0 = 0
            r1 = r1[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            r0 = 76
            if (r1 == r0) goto L2d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C04575g.A01
            java.lang.String r1 = "uy9l7RLQ2P1HyKRuXc5qKTdvpqbxTZwF"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "uy9l7RLQ2P1HyKRuXc5qKTdvpqbxTZwF"
            r0 = 4
            r2[r0] = r1
            if (r3 == 0) goto L3f
        L3b:
            com.facebook.ads.redexgen.X.5Y r4 = A02(r5)
        L3f:
            if (r4 == 0) goto L4b
            java.lang.String r0 = r4.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L4f
        L4b:
            com.facebook.ads.redexgen.X.5Y r4 = A03(r5)
        L4f:
            return r4
        L50:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r2 = 0
            r1 = 43
            r0 = 9
            java.lang.String r0 = A04(r2, r1, r0)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C04575g.A00(com.facebook.ads.redexgen.X.8C):com.facebook.ads.redexgen.X.5Y");
    }

    @Nullable
    @VisibleForTesting
    public static C5Y A01(C8C c8c) {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(c8c);
        if (advertisingIdInfoDirectly != null) {
            return new C5Y(advertisingIdInfoDirectly.getId(), advertisingIdInfoDirectly.isLimitAdTracking(), C5X.A03);
        }
        return null;
    }

    @Nullable
    @VisibleForTesting
    public static C5Y A02(C8C c8c) {
        Object objA00;
        Method methodA02;
        Object objA002;
        Method methodA022 = C04585h.A02(A04(173, 52, 75), A04(257, 29, 114), Context.class);
        if (methodA022 == null || (objA00 = C04585h.A00(null, methodA022, c8c)) == null || ((Integer) objA00).intValue() != 0 || (methodA02 = C04585h.A02(A04(65, 57, 11), A04(232, 20, 55), Context.class)) == null || (objA002 = C04585h.A00(null, methodA02, c8c)) == null) {
            return null;
        }
        Method methodA01 = C04585h.A01(objA002.getClass(), A04(252, 5, 38), new Class[0]);
        Method methodA012 = C04585h.A01(objA002.getClass(), A04(286, 24, 120), new Class[0]);
        if (methodA01 == null || methodA012 == null) {
            return null;
        }
        String id = (String) C04585h.A00(objA002, methodA01, new Object[0]);
        Boolean bool = (Boolean) C04585h.A00(objA002, methodA012, new Object[0]);
        if (id == null) {
            return null;
        }
        return new C5Y(id, bool != null && bool.booleanValue(), C5X.A07);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo] */
    @SuppressLint({"CatchGeneralException"})
    @VisibleForTesting
    public static C5Y A03(C8C c8c) {
        ServiceConnectionC04565f serviceConnectionC04565f = new ServiceConnectionC04565f();
        Intent intent = new Intent(A04(122, 51, 52));
        intent.setPackage(A04(43, 22, 2));
        if (c8c.bindService(intent, serviceConnectionC04565f, 1)) {
            try {
                final IBinder iBinderA02 = serviceConnectionC04565f.A02();
                ?? r1 = new IInterface(iBinderA02) { // from class: com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo
                    public static byte[] A01;
                    public static String[] A02;
                    public IBinder A00;

                    static {
                        A02();
                        A01();
                    }

                    public static String A00(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                        int i5 = 0;
                        while (true) {
                            int length = bArrCopyOfRange.length;
                            String[] strArr = A02;
                            if (strArr[5].length() != strArr[0].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A02;
                            strArr2[3] = BuildConfig.FLAVOR;
                            strArr2[3] = BuildConfig.FLAVOR;
                            if (i5 >= length) {
                                return new String(bArrCopyOfRange);
                            }
                            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 80);
                            i5++;
                        }
                    }

                    public static void A01() {
                        A01 = new byte[]{11, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_MINUTE, -42, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, -42, 9, DateTimeFieldType.MILLIS_OF_DAY, 12, 26, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HOUR_OF_DAY, 12, -42, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 27, -42, 9, 12, 27, -42, DateTimeFieldType.HOUR_OF_DAY, 12, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 28, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 26, -42, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 28, DateTimeFieldType.HALFDAY_OF_DAY, 26, DateTimeFieldType.MILLIS_OF_DAY, 9, DateTimeFieldType.SECOND_OF_DAY, -42, -15, -23, 12, 30, DateTimeFieldType.HALFDAY_OF_DAY, 26, 28, DateTimeFieldType.HOUR_OF_DAY, 27, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -15, 12, -5, DateTimeFieldType.HALFDAY_OF_DAY, 26, 30, DateTimeFieldType.HOUR_OF_DAY, 11, DateTimeFieldType.HALFDAY_OF_DAY};
                    }

                    public static void A02() {
                        A02 = new String[]{BuildConfig.FLAVOR, "dlCQJjSx2v0yIAE7uR5", "YVJONne7N3U8xm", BuildConfig.FLAVOR, "eKTK4BSI8P33PVYq98zfXeBzSnXDY", BuildConfig.FLAVOR, "Oc9p6kWmaRe51UGQv0AehnzsYEIJ", "vamZVSY5oxMc9Fm9XA4FwhL"};
                    }

                    {
                        this.A00 = iBinderA02;
                    }

                    public final String A03() throws RemoteException {
                        Parcel reply = Parcel.obtain();
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            reply.writeInterfaceToken(A00(0, 68, 88));
                            this.A00.transact(1, reply, parcelObtain, 0);
                            parcelObtain.readException();
                            return parcelObtain.readString();
                        } finally {
                            parcelObtain.recycle();
                            reply.recycle();
                        }
                    }

                    public final boolean A04() throws RemoteException {
                        Parcel reply = Parcel.obtain();
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            reply.writeInterfaceToken(A00(0, 68, 88));
                            boolean z = true;
                            reply.writeInt(1);
                            this.A00.transact(2, reply, parcelObtain, 0);
                            parcelObtain.readException();
                            if (parcelObtain.readInt() == 0) {
                                z = false;
                            }
                            return z;
                        } finally {
                            parcelObtain.recycle();
                            reply.recycle();
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.A00;
                    }
                };
                return new C5Y(r1.A03(), r1.A04(), C5X.A08);
            } catch (Throwable th) {
                try {
                    c8c.A04().A86(A04(225, 7, 30), C05228d.A17, new C05238e(th));
                } finally {
                    c8c.unbindService(serviceConnectionC04565f);
                }
            }
        }
        return null;
    }
}

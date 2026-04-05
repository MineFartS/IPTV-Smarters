package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8X {

    @VisibleForTesting
    public static SparseIntArray A00;

    @VisibleForTesting
    public static Executor A01;
    public static boolean A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05;
    public static final List<Integer> A06;
    public static final List<C8Y> A07;
    public static final AtomicBoolean A08;
    public static final AtomicInteger A09;
    public static final AtomicReference<C8V> A0A;
    public static final AtomicReference<C8W> A0B;
    public static final AtomicReference<Boolean> A0C;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-93, -105, -40, -37, -37, -32, -21, -32, -26, -27, -40, -29, -64, -27, -35, -26, -105, -76, -105, -110, -122, -45, -53, -39, -39, -57, -51, -53, -122, -93, -122, 91, 79, -94, -92, -111, -93, -88, -97, -108, 114, -98, -109, -108, 79, 108, 79, 116, -66, -36, -23, -94, -17, -101, -25, -22, -30, -101, -65, -32, -35, -16, -30, -101, -64, -15, -32, -23, -17, -87, -101, -66, -22, -23, -17, -32, -13, -17, -101, -28, -18, -101, -23, -16, -25, -25, -87, 119, -93, -87, -94, -88, -103, -90, 110, 84, -79, -46, -49, -30, -44, -115, -48, -33, -50, -32, -43, -115, -49, -46, -48, -50, -30, -32, -46, -115, -36, -45, -115, -46, -29, -46, -37, -31, -115, -28, -42, -31, -43, -115, -32, -30, -49, -31, -26, -35, -46, -115, -86, -115, 108, -97, -118, -116, -116, -117, -116, -117, 71, -112, -107, 84, -108, -116, -108, -106, -103, -96, 71, -109, -106, -114, 71, -109, -112, -108, -112, -101, 72, 71, 115, -120, -102, -101, 71, -116, -99, -116, -107, -101, 97, 71, -108, -57, -78, -76, -65, -61, -72, -66, -67, 111, -109, -76, -79, -60, -74, 111, -108, -59, -76, -67, -61, 111, -58, -72, -61, -73, 111, -62, -60, -79, -61, -56, -65, -76, 111, -116, 111, -97, -46, -67, -65, -54, -50, -61, -55, -56, 122, -66, -49, -52, -61, -56, -63, 122, -58, -55, -63, -63, -61, -56, -63, 122, -66, -65, -68, -49, -63, 122, -65, -48, -65, -56, -50, -120, -27, 24, 3, 5, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 9, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, -64, DateTimeFieldType.MINUTE_OF_HOUR, 8, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 12, 4, -64, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, -64, 8, 1, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 5, DateTimeFieldType.HOUR_OF_HALFDAY, -64, 8, 5, DateTimeFieldType.MINUTE_OF_DAY, 5, -50, -101, -105, -106, -54, -71, -66, -70, -61, -72, -70, -93, -70, -55, -52, -60, -57, -64, -28, 9, 1, 10, -69, -33, 0, -3, DateTimeFieldType.CLOCKHOUR_OF_DAY, 2, -69, -32, DateTimeFieldType.HOUR_OF_DAY, 0, 9, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -69, DateTimeFieldType.MINUTE_OF_DAY, 4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 3, -69, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, -3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, 11, 0, -69, -40, -69, -53, -26, -26, -105, -28, -40, -27, -16, -105, -36, -19, -36, -27, -21, -22, -105, -26, -35, -105, -22, -20, -39, -21, -16, -25, -36, -105, -38, -26, -37, -36, -79, -105, -101, -99, -104, -99, -102, -83, -102, -104, -91, -88, -96, -96, -94, -89, -96, -21, -8, -3, -24, -19, -18, -3, -18, -20, -3, -14, -8, -9, -24, 0, -8, -24, -4, -14, -16, -9, -22, -11, -24, -19, -22, -3, -22, -24, -11, -8, -16, -16, -14, -9, -16, -62, -64, -62, -57, -60, -57, -56, -62, -49, -46, -54, -54, -52, -47, -54, -2, DateTimeFieldType.HALFDAY_OF_DAY, 6, 6, -3, 4, -49, -42, -55, -59, -36, -57, -46, -49, -54, -57, -38, -49, -43, -44, -36, -45, -30, -27, -35, -32, -39};
    }

    public static void A05() {
        A05 = new String[]{"lfqbOpCQc8eNVWWSF0ti", "aQ5ZOD0I", "7f7up0GBGRCd1p0enpCjG4lcj76", "dHBYXWbpLBdqteinvxBO5bOixoP3oT04", "DPNUUQYEctncegz3shse9IBb8Vdl47", "4q0rwT09y0cbatV7Yp", "6l64E9SK9p5G", "edaEIeRSccYYgTnyelVwcwdzoe4C2sfO"};
    }

    static {
        A05();
        A04();
        A00 = new SparseIntArray();
        A03 = false;
        A0B = new AtomicReference<>();
        A0A = new AtomicReference<>();
        A01 = Executors.newSingleThreadExecutor();
        A06 = Arrays.asList(10, 50, 100, 1000);
        A07 = Collections.synchronizedList(new ArrayList());
        A09 = new AtomicInteger();
        A08 = new AtomicBoolean();
        A0C = new AtomicReference<>();
        A02 = false;
    }

    public static int A00(String str, int i2, C8C c8c) {
        if ((A01(457, 7, 71).equals(str) && C05228d.A1e == i2) || A01(422, 5, 56).equals(str) || A01(437, 6, 113).equals(str)) {
            return 200;
        }
        if (A01(386, 36, 98).equals(str)) {
            return 50;
        }
        if (A01(371, 15, 18).equals(str)) {
            return JU.A05(c8c);
        }
        if (A05[3].charAt(3) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[7] = "MSKlPe4okWTggpeViHGlBF3nlCraGBz9";
        strArr[7] = "MSKlPe4okWTggpeViHGlBF3nlCraGBz9";
        return -1;
    }

    public static /* synthetic */ List A02() {
        List<C8Y> list = A07;
        String[] strArr = A05;
        if (strArr[4].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[1] = "TV2BvPAOYvnRV0R5I88rwwfNZOOU8";
        strArr2[1] = "TV2BvPAOYvnRV0R5I88rwwfNZOOU8";
        return list;
    }

    public static void A06(C8C c8c, int i2, int i3) {
        c8c.A04().A86(A01(427, 10, 60), C05228d.A28, new C05238e(A01(338, 33, 80) + i2, A01(87, 9, 13) + i3));
    }

    @Deprecated
    public static void A07(@Nullable C8C c8c, String str, int i2, C05238e c05238e) {
        if (c8c == null) {
            A0G(new RuntimeException(A01(48, 39, 84)));
            return;
        }
        C8B.A01(c8c.A00());
        if (A02 && c05238e.A00() == 0) {
            A0E(new RuntimeException(A01(96, 44, 70) + str + A01(31, 16, 8) + i2, c05238e));
        }
        try {
            if (A0I(c8c, str, i2, Math.random(), c05238e)) {
                A0A(c8c, str, i2, c05238e);
            }
        } catch (Throwable th) {
            A0G(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    @Deprecated
    public static void A08(C8C c8c, String str, int i2, C05238e c05238e) {
        try {
            c05238e.A03(2);
            c05238e.A07(false);
            c05238e.A04(1);
            if (JU.A0R(c8c)) {
                c05238e.A06(true);
            } else {
                c05238e.A06(false);
            }
            A07(c8c, str, i2, c05238e);
        } catch (Throwable th) {
            A0G(th);
        }
    }

    @Deprecated
    public static void A09(C8C c8c, String str, int i2, C05238e c05238e) {
        try {
            c05238e.A03(2);
            c05238e.A06(false);
            A07(c8c, str, i2, c05238e);
        } catch (Throwable th) {
            A0G(th);
        }
    }

    public static void A0A(C8C c8c, String str, int i2, C05238e c05238e) {
        synchronized (C8X.class) {
            if (!A03) {
                int iA01 = JU.A01(c8c);
                if (A09.getAndIncrement() < iA01 - 1) {
                    A07.add(new C8Y(str, i2, c05238e));
                } else if (A09.get() == iA01) {
                    A07.add(new C8Y(A01(427, 10, 60), C05228d.A25, new C05238e(A01(140, 42, 0) + str + A01(47, 1, 19) + i2)));
                }
            } else {
                A0B(c8c, str, i2, c05238e, true);
            }
        }
    }

    public static void A0B(C8C c8c, String str, int i2, C05238e c05238e, boolean z) {
        C8W c8w = A0B.get();
        boolean z2 = c8w != null && c8w.A7o();
        if (A08.get() || z2) {
            int iA00 = c05238e.A00();
            String strA01 = A01(289, 17, 46);
            String strA012 = A01(31, 16, 8);
            if (iA00 == 0) {
                Log.e(strA01, A01(182, 37, 40) + str + strA012 + i2, c05238e);
            } else {
                Log.i(strA01, A01(306, 32, 116) + str + strA012 + i2 + A01(19, 12, 63) + c05238e.getMessage() + A01(0, 19, 80) + c05238e.A02());
            }
        }
        XH xh = new XH(c8c, str, i2, c05238e, c8w);
        if (z) {
            A01.execute(xh);
        } else {
            xh.run();
        }
    }

    public static void A0D(X3 x3, C8W c8w, C8V c8v, boolean z) {
        A0A.set(c8v);
        A0B.set(c8w);
        A08.set(z);
        synchronized (C8X.class) {
            if (!A03) {
                A03 = true;
                A01.execute(new XG(x3));
            }
        }
    }

    public static void A0E(final RuntimeException runtimeException) {
        if (A02) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8U
                @Override // java.lang.Runnable
                public final void run() {
                    throw runtimeException;
                }
            });
        }
    }

    @Deprecated
    public static void A0F(Throwable th) {
        if (A02) {
            A0E(new RuntimeException(A01(256, 33, 121), th));
        }
    }

    public static void A0G(Throwable th) {
        Log.e(A01(289, 17, 46), A01(219, 37, 51), th);
        if (A02) {
            A0E(new RuntimeException(th));
        }
    }

    @SuppressLint({"CatchGeneralException"})
    @VisibleForTesting
    public static boolean A0I(C8C c8c, String str, int i2, double d2, C05238e c05238e) {
        double logProbability;
        int iA0E;
        try {
            int iA04 = JU.A04(c8c);
            if (iA04 < 1) {
                return false;
            }
            HashMap<String, Integer> mapA0M = JU.A0M(c8c);
            Set<String> setKeySet = mapA0M.keySet();
            String str2 = str + A01(47, 1, 19) + i2;
            boolean zContains = setKeySet.contains(str2);
            if (zContains) {
                Integer num = mapA0M.get(str2);
                int iIntValue = num != null ? num.intValue() : -1;
                if (iIntValue == 0) {
                    return false;
                }
                if (iIntValue > 0) {
                    return d2 <= 1.0d / ((double) iIntValue);
                }
                int iA03 = JU.A03(c8c);
                if (iA03 < 1) {
                    return false;
                }
                logProbability = ((double) (iA04 * iA03)) / 10000.0d;
            } else if (!c05238e.A08()) {
                logProbability = 0.0d;
            } else {
                double logProbability2 = iA04;
                logProbability = logProbability2 / 100.0d;
            }
            double dA00 = c8c.A05().A00();
            if (A01(422, 5, 56).equals(str)) {
                if (BuildConfigApi.isDebug()) {
                    return true;
                }
                int iA06 = JU.A06(c8c);
                if (iA06 == 0) {
                    return false;
                }
                if (iA06 > 0) {
                    double d3 = 1.0d / ((double) iA06);
                    return zContains ? dA00 <= d3 * logProbability : dA00 <= d3;
                }
            }
            if (A01(457, 7, 71).equals(str) && C05228d.A1e == i2) {
                if (!A08.get()) {
                    iA0E = JU.A0E(c8c);
                } else {
                    iA0E = 1;
                }
                if (iA0E == 0) {
                    return false;
                }
                if (iA0E > 0) {
                    double d4 = 1.0d / ((double) iA0E);
                    return zContains ? dA00 <= d4 * logProbability : dA00 <= d4;
                }
            }
            if (A01(437, 6, 113).equals(str)) {
                Boolean bool = A0C.get();
                if (bool != null) {
                    return bool.booleanValue();
                }
                int iA0A = JU.A0A(c8c);
                if (iA0A == 0) {
                    A0C.set(false);
                    return false;
                }
                if (iA0A > 0) {
                    double d5 = 1.0d / ((double) iA0A);
                    return zContains ? dA00 <= d5 * logProbability : dA00 <= d5;
                }
            }
            if (A01(443, 14, 63).equals(str)) {
                if (BuildConfigApi.isDebug()) {
                    return true;
                }
                int iA0B = JU.A0B(c8c);
                if (iA0B == 0) {
                    return false;
                }
                if (iA0B > 0) {
                    double d6 = 1.0d / ((double) iA0B);
                    return zContains ? dA00 <= d6 * logProbability : dA00 <= d6;
                }
            }
            double d7 = 1.0d - logProbability;
            if (A05[3].charAt(3) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[4] = "UKJjq974XMuOG6VE2UuXyW1KY5FJsZ";
            strArr[0] = "9oDF6i4FckldRw4UZ809";
            return d2 >= d7;
        } catch (Throwable th) {
            A0G(th);
            return false;
        }
    }

    @VisibleForTesting
    public static boolean A0J(C8C c8c, String str, int eventsLimit, C05238e c05238e) {
        if (!JU.A0Q(c8c)) {
            return true;
        }
        int i2 = A00.get(eventsLimit);
        int iA00 = JU.A00(c8c);
        if (c05238e.A01() != -1) {
            iA00 = c05238e.A01();
        } else {
            int iA002 = A00(str, eventsLimit, c8c);
            if (iA00 < iA002) {
                iA00 = iA002;
            }
        }
        if (i2 >= iA00) {
            if (A06.contains(Integer.valueOf(i2))) {
                boolean zA09 = c05238e.A09();
                if (A05[3].charAt(3) != 'Y') {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[5] = "DtDXz8TrFQQZw1pkgy";
                strArr[2] = "wKGFu6BM2pQR03pr0dyvmA98nTz";
                if (!zA09) {
                    A06(c8c, eventsLimit, i2);
                }
            }
            A00.put(eventsLimit, i2 + 1);
            return true;
        }
        A00.put(eventsLimit, i2 + 1);
        return false;
    }
}

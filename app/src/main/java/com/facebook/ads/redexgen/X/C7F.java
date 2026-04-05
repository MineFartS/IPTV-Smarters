package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7F {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-120, -90, -88, -83, -86, 101, -87, -82, -72, -80, 101, -85, -90, -82, -79, -70, -73, -86, 115, -63, -33, -31, -26, -29, -98, -30, -25, -15, -23, -98, -15, -13, -31, -31, -29, -15, -15, -84, -63, -33, -31, -26, -29, -98, -30, -19, -11, -20, -22, -19, -33, -30, -98, -28, -33, -25, -22, -13, -16, -29, -84, -127, -97, -95, -90, -93, 94, -90, -89, -78, 108, -72, -42, -40, -35, -38, -107, -30, -34, -24, -24, -93, -83, -80, -85, -81, -66, -79, -83, -64, -75, -62, -79, -85, -65, -75, -58, -79, -85, -82, -59, -64, -79, -65, -55, -52, -57, -53, -38, -51, -55, -36, -47, -34, -51, -57, -36, -31, -40, -51, -95, -92, -97, -90, -81, -78, -83, -95, -76, -97, -76, -71, -80, -91, DateTimeFieldType.SECOND_OF_MINUTE, 24, DateTimeFieldType.MINUTE_OF_HOUR, 38, 25, 37, 41, 25, 39, 40, DateTimeFieldType.MINUTE_OF_HOUR, 29, 24, -79, -60, -60, -75, -67, -64, -60, -78, -80, -78, -73, -76, 24, DateTimeFieldType.MILLIS_OF_DAY, 24, 29, 26, DateTimeFieldType.SECOND_OF_DAY, 24, 36, 35, 41, 26, 45, 41, -50, -55, -47, -44, -35, -38, -51, -57, -38, -51, -55, -37, -41, -42, DateTimeFieldType.MILLIS_OF_DAY, 26, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 11, DateTimeFieldType.HOUR_OF_HALFDAY, 0, 3, -2, DateTimeFieldType.MINUTE_OF_HOUR, 8, 12, 4, 5, 2, -4};
    }

    static {
        A01();
        A09 = C7F.class.getSimpleName();
        A05 = C05228d.A0d;
        A06 = C05228d.A0h;
        A02 = C05228d.A0a;
        A01 = C05228d.A0Z;
        A03 = C05228d.A0b;
        A00 = C05228d.A0X;
        A04 = C05228d.A0c;
        A07 = C05228d.A0i;
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A02(C8C c8c, AnonymousClass75 anonymousClass75, int i2, String str, long j2) {
        if (!A06(c8c)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), anonymousClass75.A00);
            jSONObject.put(A00(134, 13, 118), anonymousClass75.A01);
            if (j2 > 0) {
                jSONObject.put(A00(191, 9, 97), C0848Lr.A06(System.currentTimeMillis() - j2));
            }
            C05238e c05238e = new C05238e(str);
            c05238e.A05(jSONObject);
            c05238e.A03(1);
            c8c.A04().A87(A00(154, 5, 17), i2, c05238e);
        } catch (Throwable th) {
            c8c.A04().A3S(th);
        }
    }

    public static void A03(C8C c8c, AnonymousClass79 anonymousClass79, String str, int i2, @Nullable String str2, @Nullable Integer num, @Nullable Long l2) {
        if (A06(c8c)) {
            A05(c8c, anonymousClass79.A05, anonymousClass79.A06, anonymousClass79.A07, A00(186, 5, 111), str, i2, str2, num, l2, null);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A04(C8C c8c, C7E c7e, boolean z) {
        if (!A06(c8c)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), c7e.A00);
            jSONObject.put(A00(134, 13, 118), c7e.A03);
            jSONObject.put(A00(104, 16, 42), c7e.A02);
            jSONObject.put(A00(159, 13, 119), c7e.A01);
            if (JT.A1G(c8c)) {
                jSONObject.put(A00(200, 3, 82), c7e.A04);
            }
            String strA00 = z ? A00(61, 10, 0) : A00(71, 11, 55);
            int i2 = z ? A05 : A06;
            C05238e c05238e = new C05238e(strA00);
            c05238e.A05(jSONObject);
            c05238e.A03(1);
            c8c.A04().A87(A00(154, 5, 17), i2, c05238e);
        } catch (Throwable th) {
            c8c.A04().A3S(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A05(C8C c8c, String str, String str2, String str3, String str4, String str5, int i2, @Nullable String str6, @Nullable Integer num, @Nullable Long l2, @Nullable Integer num2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), str);
            jSONObject.put(A00(134, 13, 118), str2);
            jSONObject.put(A00(104, 16, 42), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 42), str6);
            }
            if (num != null) {
                jSONObject.put(A00(82, 22, 14), String.valueOf(num));
            }
            if (l2 != null) {
                jSONObject.put(A00(191, 9, 97), String.valueOf(l2));
            }
            if (num2 != null) {
                jSONObject.put(A00(147, 7, 18), String.valueOf(num2));
            }
            jSONObject.put(A00(159, 13, 119), str5);
            if (JT.A1G(c8c)) {
                jSONObject.put(A00(200, 3, 82), str3);
            }
            String strA00 = A00(19, 19, 64);
            if (i2 == A03) {
                strA00 = A00(38, 23, 64);
            } else if (i2 == A01) {
                strA00 = A00(0, 19, 7);
            }
            C05238e c05238e = new C05238e(strA00);
            c05238e.A05(jSONObject);
            c05238e.A03(1);
            c8c.A04().A87(A00(154, 5, 17), i2, c05238e);
        } catch (Throwable th) {
            c8c.A04().A3S(th);
        }
    }

    public static boolean A06(C8C c8c) {
        int iA06;
        if (c8c.A03().A7c()) {
            iA06 = 1;
        } else {
            iA06 = JU.A06(c8c);
        }
        if (iA06 == 0) {
            return false;
        }
        return iA06 <= 0 || c8c.A05().A00() <= 1.0d / ((double) iA06);
    }
}

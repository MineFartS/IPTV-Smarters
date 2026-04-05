package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2G {
    public static byte[] A00;
    public static String[] A01;
    public static final ThreadLocal<double[]> A02;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-104, -93, -89, -97, -104, 87, -92, -84, -86, -85, 87, -103, -100, 87, -103, -100, -85, -82, -100, -100, -91, 87, 103, 87, -104, -91, -101, 87, 105, 108, 108, 101, -59, -53, -54, -82, -49, -48, 118, -61, -53, -55, -54, 118, -66, -73, -52, -69, 118, -73, 118, -62, -69, -60, -67, -54, -66, 118, -59, -68, 118, -119, -124};
    }

    public static void A05() {
        A01 = new String[]{"5xFyhJyAmXwpndJ9EoKqTFqqLI0O0t2g", "XKBE22ujheeLcTYagdBtfv4d5l35c1GL", "dLXeMiu6Rni", "1iBW7", "i8dAz", "3kaHypJVzQjnFbgNDhrnWnyYOdOCg92b", "E8vO87QQkuay4qK7aMyGFQLc0ZjeOzJS", "6MpCOYCclTS"};
    }

    static {
        A05();
        A04();
        A02 = new ThreadLocal<>();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static double A00(@ColorInt int i2) {
        double[] dArrA08 = A08();
        A07(i2, dArrA08);
        return dArrA08[1] / 100.0d;
    }

    @ColorInt
    public static int A01(@ColorInt int i2, @IntRange(from = 0, to = IjkMediaMeta.AV_CH_LAYOUT_7POINT1_WIDE_BACK) int i3) {
        if (i3 >= 0) {
            String[] strArr = A01;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "QbRpT";
            strArr2[3] = "VTwjf";
            if (i3 <= 255) {
                return (16777215 & i2) | (i3 << 24);
            }
        }
        throw new IllegalArgumentException(A03(0, 32, 3));
    }

    @ColorInt
    public static int A02(@ColorInt int i2, @ColorInt int i3, @FloatRange(from = 0.0d, to = 1.0d) float r) {
        float g2 = 1.0f - r;
        return Color.argb((int) ((Color.alpha(i2) * g2) + (Color.alpha(i3) * r)), (int) ((Color.red(i2) * g2) + (Color.red(i3) * r)), (int) ((Color.green(i2) * g2) + (Color.green(i3) * r)), (int) ((Color.blue(i2) * g2) + (Color.blue(i3) * r)));
    }

    public static void A06(@IntRange(from = 0, to = IjkMediaMeta.AV_CH_LAYOUT_7POINT1_WIDE_BACK) int i2, @IntRange(from = 0, to = IjkMediaMeta.AV_CH_LAYOUT_7POINT1_WIDE_BACK) int i3, @IntRange(from = 0, to = IjkMediaMeta.AV_CH_LAYOUT_7POINT1_WIDE_BACK) int i4, @NonNull double[] dArr) {
        double dPow;
        double dPow2;
        if (dArr.length == 3) {
            double d2 = ((double) i2) / 255.0d;
            if (d2 < 0.04045d) {
                dPow = d2 / 12.92d;
            } else {
                dPow = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            }
            double d3 = ((double) i3) / 255.0d;
            if (d3 < 0.04045d) {
                dPow2 = d3 / 12.92d;
            } else {
                dPow2 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            }
            double sb = ((double) i4) / 255.0d;
            double sb2 = sb < 0.04045d ? sb / 12.92d : Math.pow((0.055d + sb) / 1.055d, 2.4d);
            double sg = 0.3576d * dPow2;
            double d4 = (0.4124d * dPow) + sg;
            double sg2 = 0.1805d * sb2;
            dArr[0] = (d4 + sg2) * 100.0d;
            double sg3 = 0.7152d * dPow2;
            double d5 = (0.2126d * dPow) + sg3;
            double sg4 = 0.0722d * sb2;
            dArr[1] = (d5 + sg4) * 100.0d;
            double sg5 = 0.1192d * dPow2;
            double d6 = (0.0193d * dPow) + sg5;
            double sg6 = 0.9505d * sb2;
            dArr[2] = (d6 + sg6) * 100.0d;
            return;
        }
        throw new IllegalArgumentException(A03(32, 31, 34));
    }

    public static void A07(@ColorInt int i2, @NonNull double[] dArr) {
        A06(Color.red(i2), Color.green(i2), Color.blue(i2), dArr);
    }

    public static double[] A08() {
        double[] dArr = A02.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            A02.set(dArr2);
            return dArr2;
        }
        return dArr;
    }
}

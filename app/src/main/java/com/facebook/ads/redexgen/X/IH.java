package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IH {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-40, -21, -30, -46, -33, -40, -31, -10, 9, 0, -16, 3, -10, -11, -6, 3};
    }

    public static long A00(IG ig) {
        return ig.A5E(A02(0, 7, 27), -1L);
    }

    @Nullable
    public static Uri A01(IG ig) {
        String strA5F = ig.A5F(A02(7, 9, 57), (String) null);
        if (strA5F == null) {
            return null;
        }
        return Uri.parse(strA5F);
    }

    public static void A04(II ii) {
        ii.A02(A02(7, 9, 57));
    }

    public static void A05(II ii, long j2) {
        ii.A03(A02(0, 7, 27), j2);
    }

    public static void A06(II ii, Uri uri) {
        ii.A04(A02(7, 9, 57), uri.toString());
    }
}

package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9H, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9H {
    public static byte[] A00;
    public static final String A01;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, -15, -17, -5, -2, -16, -21, -16, -19, 0, -19, -18, -19, -1, -15};
    }

    static {
        A03();
        A01 = C9H.class.getSimpleName();
    }

    public static C9J A00(X3 x3) {
        try {
            return new C1148Xj(x3);
        } catch (IOException e2) {
            x3.A04().A86(A02(0, 15, 89), C05228d.A1v, new C05238e(e2));
            return new C1145Xg();
        }
    }

    public static DJ A01(X3 x3) {
        return new DJ(x3);
    }
}

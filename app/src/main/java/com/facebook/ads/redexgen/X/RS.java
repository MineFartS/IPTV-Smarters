package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RS extends AbstractC03300f {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 115, 123, 126, 119, 118, 50, -122, -127, 50, -127, -126, 119, -128, 50, 126, 123, -128, 125, 50, -121, -124, 126, 76, 50, -89, -102, -103, -98, -89, -102, -104, -87, -106, -104, -87, -98, -92, -93, -113, 117};
    }

    static {
        A01();
        A02 = RS.class.getSimpleName();
    }

    public RS(X2 x2, JZ jz, String str, Uri uri) {
        super(x2, jz, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03300f
    public final void A0D() {
        try {
            Log.w(A00(25, 16, 84), this.A00.toString());
            LH.A09(new LH(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 17) + this.A00.toString();
        }
    }
}

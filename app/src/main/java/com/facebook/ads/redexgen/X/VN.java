package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VN implements InterfaceC04806d {
    public final /* synthetic */ VS A00;

    public VN(VS vs) {
        this.A00 = vs;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        return this.A00.A0D(new HashMap<String, Integer>() { // from class: com.facebook.ads.redexgen.X.6W
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i2, int i3, int i4) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                    bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 15);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{123, -13};
            }

            {
                put(A00(1, 1, 109), Integer.valueOf(this.A00.A00.A01.widthPixels));
                put(A00(0, 1, 4), Integer.valueOf(this.A00.A00.A01.heightPixels));
            }
        });
    }
}

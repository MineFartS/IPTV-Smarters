package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YV extends AbstractRunnableC0829Kx {
    public static byte[] A01;
    public final /* synthetic */ YL A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{100, 91, 86, 87, 93, DateTimeFieldType.MINUTE_OF_DAY, 92, 87, 68, 87, 64, DateTimeFieldType.MINUTE_OF_DAY, 65, 70, 83, 64, 70, 87, 86, DateTimeFieldType.MINUTE_OF_DAY, 66, 94, 83, 75, 91, 92, 85};
    }

    public YV(YL yl) {
        this.A00 = yl;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        if (!this.A00.A0J) {
            this.A00.A0e(A00(0, 27, 112));
        }
    }
}

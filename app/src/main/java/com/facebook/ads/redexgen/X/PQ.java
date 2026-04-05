package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PQ extends AbstractRunnableC0829Kx {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass80 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{100, 91, 86, 87, 93, DateTimeFieldType.MINUTE_OF_DAY, 69, 83, 65, DateTimeFieldType.MINUTE_OF_DAY, 92, 87, 68, 87, 64, DateTimeFieldType.MINUTE_OF_DAY, 66, 64, 87, 66, 83, 64, 87, 86};
    }

    public PQ(AnonymousClass80 anonymousClass80) {
        this.A00 = anonymousClass80;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        if (!this.A00.A06) {
            this.A00.A0H(A00(0, 24, 76));
        }
    }
}

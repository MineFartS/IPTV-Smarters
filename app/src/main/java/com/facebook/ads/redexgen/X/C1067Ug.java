package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1067Ug implements InterfaceC04806d {
    public static byte[] A01;
    public final /* synthetic */ C1074Un A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 6, 6, 4, 5};
    }

    public C1067Ug(C1074Un c1074Un) {
        this.A00 = c1074Un;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        return this.A00.A0B(A00(0, 7, 69), Integer.MIN_VALUE);
    }
}

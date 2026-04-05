package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1136Wx extends AbstractRunnableC0829Kx {
    public static byte[] A02;
    public final /* synthetic */ C1137Wy A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{117, 87, 85, 94, 83, DateTimeFieldType.MILLIS_OF_DAY, 80, 87, 95, 90, 24, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public C1136Wx(C1137Wy c1137Wy, AtomicBoolean atomicBoolean) {
        this.A00 = c1137Wy;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0G(EnumC0788Jf.A0H);
                C7F.A02(this.A00.A02.A04, this.A00.A01, C7F.A00, A00(11, 14, 17), this.A00.A02.A00);
                this.A00.A02.A0N();
                this.A00.A00.A9I();
                return;
            }
            this.A00.A02.A0G(EnumC0788Jf.A0G);
            C7F.A02(this.A00.A02.A04, this.A00.A01, C7F.A04, A00(0, 11, 41), this.A00.A02.A00);
            this.A00.A02.A0O();
            this.A00.A00.A9B();
        }
    }
}

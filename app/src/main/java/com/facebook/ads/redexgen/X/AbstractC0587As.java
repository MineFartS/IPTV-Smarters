package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.As, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0587As extends YJ<C0580Al, AW, C0709Gc> implements InterfaceC1265aq {
    public static byte[] A01;
    public final String A00;

    static {
        A0K();
    }

    public static String A0J(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0K() {
        A01 = new byte[]{63, 88, 79, 98, 90, 79, 77, 94, 79, 78, 10, 78, 79, 77, 89, 78, 79, 10, 79, 92, 92, 89, 92};
    }

    public abstract InterfaceC0708Gb A0d(byte[] bArr, int i2, boolean z) throws C0709Gc;

    public AbstractC0587As(String str) {
        super(new C0580Al[2], new AW[2]);
        this.A00 = str;
        A0a(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.YJ
    /* JADX INFO: renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final C0709Gc A0Y(C0580Al c0580Al, AW aw, boolean z) {
        try {
            ByteBuffer byteBuffer = c0580Al.A01;
            aw.A09(((YH) c0580Al).A00, A0d(byteBuffer.array(), byteBuffer.limit(), z), c0580Al.A00);
            aw.A01(Integer.MIN_VALUE);
            return null;
        } catch (C0709Gc e2) {
            return e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.YJ
    /* JADX INFO: renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final C0709Gc A0Z(Throwable th) {
        return new C0709Gc(A0J(0, 23, 109), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.YJ
    /* JADX INFO: renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final C0580Al A0V() {
        return new C0580Al();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.YJ
    /* JADX INFO: renamed from: A0I, reason: merged with bridge method [inline-methods] */
    public final AW A0X() {
        return new AW(this) { // from class: com.facebook.ads.redexgen.X.3E
            public final AbstractC0587As A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.X.AW
            public final void A08() {
                this.A00.A0c(this);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.YJ
    /* JADX INFO: renamed from: A0e, reason: merged with bridge method [inline-methods] */
    public final void A0c(AW aw) {
        super.A0c(aw);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1265aq
    public final void AD7(long j2) {
    }
}

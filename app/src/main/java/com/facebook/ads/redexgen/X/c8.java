package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class c8 extends AbstractC03390o {
    public static byte[] A01;
    public final /* synthetic */ C1320bj A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 109);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{DateTimeFieldType.MILLIS_OF_SECOND, 42, 61, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, 61, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public c8(C1320bj c1320bj) {
        this.A00 = c1320bj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0A(C0986Rb c0986Rb) {
        this.A00.A0d(c0986Rb, true);
        if (this.A00.A0F != null && c0986Rb.A0V() != null) {
            c7 c7Var = new c7(this);
            Iterator<C1320bj> it = c0986Rb.A0V().iterator();
            while (it.hasNext()) {
                it.next().A0e(c7Var);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0B() {
        if (this.A00.A0F != null) {
            this.A00.A0F.A8o();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0C() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0E(InterfaceC03380n interfaceC03380n) {
        if (this.A00.A09 != null) {
            this.A00.A09.A0K();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0F(K7 k7) {
        this.A00.A0x().A0A().A2d(C0848Lr.A01(this.A00.A00), k7.A04().getErrorCode(), k7.A05());
        if (this.A00.A0F != null) {
            this.A00.A0F.A9b(k7);
        }
    }
}

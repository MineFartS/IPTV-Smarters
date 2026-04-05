package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1183Ys extends AbstractC0616Cg {
    public static byte[] A03;
    public final long A00;
    public final List<C1183Ys> A01;
    public final List<C1184Yt> A02;

    static {
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{0, 67, 79, 78, 84, 65, 73, 78, 69, 82, 83, 26, 0, -110, -34, -41, -45, -24, -41, -27, -84, -110};
    }

    public C1183Ys(int i2, long j2) {
        super(i2);
        this.A00 = j2;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C1183Ys A06(int i2) {
        int size = this.A01.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1183Ys c1183Ys = this.A01.get(i3);
            if (((AbstractC0616Cg) c1183Ys).A00 == i2) {
                return c1183Ys;
            }
        }
        return null;
    }

    public final C1184Yt A07(int i2) {
        int size = this.A02.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1184Yt c1184Yt = this.A02.get(i3);
            if (((AbstractC0616Cg) c1184Yt).A00 == i2) {
                return c1184Yt;
            }
        }
        return null;
    }

    public final void A08(C1183Ys c1183Ys) {
        this.A01.add(c1183Ys);
    }

    public final void A09(C1184Yt c1184Yt) {
        this.A02.add(c1184Yt);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0616Cg
    public final String toString() {
        return AbstractC0616Cg.A02(super.A00) + A04(13, 9, 15) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 125) + Arrays.toString(this.A01.toArray());
    }
}

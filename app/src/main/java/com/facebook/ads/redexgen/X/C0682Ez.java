package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0682Ez extends AbstractC0995Rk {
    public static byte[] A02;
    public final X2 A00;
    public final C0805Jw A01;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-33, -35, -24, -24, -37, -16, -21, -37, -35, -33, -16, -27, -21, -22, 3, 0, -4, -1, 7, 4, 9, 0, -61, -64, -59, -62, -74, -69, -68, -54, -70, -55, -64, -57, -53, -64, -58, -59};
    }

    public C0682Ez(X2 x2, C1U c1u, List<C1320bj> list, @Nullable C0805Jw c0805Jw) {
        super(c1u, list, x2);
        this.A00 = x2;
        this.A01 = c0805Jw == null ? new C0805Jw() : c0805Jw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1219a6 A07(ViewGroup viewGroup, int i2) {
        return new C1219a6(new MT(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0995Rk, com.facebook.ads.redexgen.X.AnonymousClass43
    /* JADX INFO: renamed from: A0I */
    public final void A0F(C1219a6 c1219a6, int i2) {
        super.A0F(c1219a6, i2);
        MT mt = (MT) c1219a6.A0m();
        A0G(mt.getImageCardView(), i2);
        mt.setTitle(((AbstractC0995Rk) this).A01.get(i2).A1B(A02(14, 8, 98)));
        mt.setSubtitle(((AbstractC0995Rk) this).A01.get(i2).A1B(A02(22, 16, 30)));
        mt.setButtonText(((AbstractC0995Rk) this).A01.get(i2).A1B(A02(0, 14, 67)));
        C1320bj c1320bj = ((AbstractC0995Rk) this).A01.get(i2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(mt);
        c1320bj.A1I(mt, mt, arrayList);
    }
}

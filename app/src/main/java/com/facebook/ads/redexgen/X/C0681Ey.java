package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0681Ey extends AbstractC0995Rk {
    public final X2 A00;

    public C0681Ey(C1U c1u, List<C1320bj> list, X2 x2) {
        super(c1u, list, x2);
        this.A00 = x2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1219a6 A07(ViewGroup viewGroup, int i2) {
        return new C1219a6(new MX(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0995Rk, com.facebook.ads.redexgen.X.AnonymousClass43
    /* JADX INFO: renamed from: A0I */
    public final void A0F(C1219a6 c1219a6, int i2) {
        super.A0F(c1219a6, i2);
        MX mx = (MX) c1219a6.A0m();
        C0869Mm c0869Mm = (C0869Mm) mx.getImageCardView();
        c0869Mm.setImageDrawable(null);
        A0G(c0869Mm, i2);
        C1320bj c1320bj = ((AbstractC0995Rk) this).A01.get(i2);
        c1320bj.A0x().A0D(this.A00);
        c1320bj.A1H(mx, mx);
    }
}

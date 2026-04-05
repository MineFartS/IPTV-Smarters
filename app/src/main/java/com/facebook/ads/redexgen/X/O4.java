package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class O4 extends AnonymousClass43<C0883Nb> {
    public static final int A05 = (int) (C0856Lz.A01 * 250.0f);
    public int A00 = 0;
    public boolean A01 = false;
    public final int A02;
    public final X2 A03;
    public final List<String> A04;

    public O4(X2 x2, List<String> list, int i2) {
        this.A04 = list;
        this.A02 = i2;
        this.A03 = x2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0883Nb A07(ViewGroup viewGroup, int i2) {
        return new C0883Nb(new C0899Nr(this.A03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0F(C0883Nb c0883Nb, int startSpacing) {
        int i2;
        int i3;
        String str = this.A04.get(startSpacing);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        if (this.A00 == 2 && this.A01) {
            i2 = A05;
        } else {
            int leftMargin = this.A02;
            i2 = leftMargin * 4;
        }
        if (startSpacing != 0) {
            i2 = this.A02;
        }
        int leftMargin2 = A0E();
        if (startSpacing >= leftMargin2 - 1) {
            int leftMargin3 = this.A02;
            i3 = leftMargin3 * 4;
        } else {
            i3 = this.A02;
        }
        marginLayoutParams.setMargins(i2, 0, i3, 0);
        c0883Nb.A0m().setLayoutParams(marginLayoutParams);
        c0883Nb.A0m().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    public final int A0E() {
        return this.A04.size();
    }

    public final void A0G(int i2, boolean z) {
        this.A00 = i2;
        this.A01 = z;
    }
}

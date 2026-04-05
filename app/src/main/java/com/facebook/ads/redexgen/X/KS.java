package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class KS extends RelativeLayout implements PE {

    @Nullable
    public C0854Lx A00;

    public KS(X2 x2) {
        super(x2);
    }

    public KS(X2 x2, AttributeSet attributeSet, int i2) {
        super(x2, attributeSet, i2);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void A7w(C0854Lx c0854Lx) {
        this.A00 = c0854Lx;
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void ADd(C0854Lx c0854Lx) {
        A08();
        this.A00 = null;
    }

    @Nullable
    public C0854Lx getVideoView() {
        return this.A00;
    }
}

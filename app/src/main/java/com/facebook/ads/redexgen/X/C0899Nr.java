package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0899Nr extends O1 {
    public final ImageView A00;
    public final X2 A01;

    public C0899Nr(X2 x2) {
        super(x2);
        this.A01 = x2;
        this.A00 = new ImageView(x2);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        XE xe = new XE(this.A00, this.A01);
        xe.A05();
        xe.A08(str);
    }
}

package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MX extends AdNativeComponentView {
    public static final int A01 = (int) (C0856Lz.A01 * 1.0f);
    public final ImageView A00;

    public MX(X2 x2) {
        super(x2);
        this.A00 = new C0869Mm(x2);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        LX.A04(this.A00, LX.A0A);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        C0856Lz.A0P(this.A00, -2130706433);
        int i2 = A01;
        setPadding(i2, i2, i2, i2);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}

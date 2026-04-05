package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TW implements C5E {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C5G A01;
    public final /* synthetic */ C1320bj A02;

    public TW(C5G c5g, ImageView imageView, C1320bj c1320bj) {
        this.A01 = c5g;
        this.A00 = imageView;
        this.A02 = c1320bj;
    }

    @Override // com.facebook.ads.redexgen.X.C5E
    public final void A9l(@Nullable Drawable drawable) {
        C1320bj.A0Z(drawable, this.A00);
        this.A02.A1E(drawable);
    }
}

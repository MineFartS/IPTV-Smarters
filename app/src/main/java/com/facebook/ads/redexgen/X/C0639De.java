package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.De, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0639De extends TP {
    public P3 A00;

    public final void A05(NativeAdLayout nativeAdLayout, X2 x2, NativeAd nativeAd, C0805Jw c0805Jw) {
        O0 o0 = new O0(x2);
        MediaView mediaView = new MediaView(x2);
        AdOptionsView adOptionsView = new AdOptionsView(x2, nativeAd, nativeAdLayout);
        c0805Jw.A09(adOptionsView, 28);
        this.A00 = new C0874Ms(x2, nativeAd, c0805Jw, C1320bj.A0J(nativeAd.getInternalNativeAd()).A13(), o0, mediaView, adOptionsView);
        C0856Lz.A0P(nativeAdLayout, c0805Jw.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, o0, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass51, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}

package com.facebook.ads.redexgen.X;

import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0976Qr extends AnimationAnimationListenerC0855Ly {
    public final /* synthetic */ C0972Qn A00;

    public C0976Qr(C0972Qn c0972Qn) {
        this.A00 = c0972Qn;
    }

    @Override // com.facebook.ads.redexgen.X.AnimationAnimationListenerC0855Ly, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C0856Lz.A0K(this.A00.A01);
        this.A00.A00.A9x();
    }
}

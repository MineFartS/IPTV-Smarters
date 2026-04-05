package com.facebook.ads.redexgen.X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0972Qn extends AbstractRunnableC0829Kx {
    public final /* synthetic */ InterfaceC0909Ob A00;
    public final /* synthetic */ C0910Oc A01;

    public C0972Qn(C0910Oc c0910Oc, InterfaceC0909Ob interfaceC0909Ob) {
        this.A01 = c0910Oc;
        this.A00 = interfaceC0909Ob;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C0976Qr(this));
        this.A01.startAnimation(alphaAnimation);
    }
}

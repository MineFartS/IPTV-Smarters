package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OJ extends AnimatorListenerAdapter {
    public final /* synthetic */ R8 A00;
    public final /* synthetic */ boolean A01;

    public OJ(R8 r8, boolean z) {
        this.A00 = r8;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0F.setTranslationY(0.0f);
        this.A00.A0K();
        if (this.A01 || this.A00.A0D == null) {
            return;
        }
        this.A00.A0D.destroy();
    }
}

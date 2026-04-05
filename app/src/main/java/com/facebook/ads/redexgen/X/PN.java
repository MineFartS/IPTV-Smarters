package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PN extends AnimatorListenerAdapter {
    public final /* synthetic */ C7X A00;

    public PN(C7X c7x) {
        this.A00 = c7x;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.A04.postDelayed(new Hp(this), 2000L);
    }
}

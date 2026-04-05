package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PO extends AnimatorListenerAdapter {
    public final /* synthetic */ C0745Hn A00;

    public PO(C0745Hn c0745Hn) {
        this.A00 = c0745Hn;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.setVisibility(8);
    }
}

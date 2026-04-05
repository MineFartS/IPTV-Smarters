package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OI implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ R8 A00;

    public OI(R8 r8) {
        this.A00 = r8;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A06.getLayoutParams().height = num.intValue();
        this.A00.A06.requestLayout();
    }
}

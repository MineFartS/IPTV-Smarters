package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MY implements Animation.AnimationListener {
    public final /* synthetic */ C04484w A00;
    public final /* synthetic */ AbstractC1212Zy A01;
    public final /* synthetic */ AbstractC1212Zy A02;

    public MY(AbstractC1212Zy abstractC1212Zy, AbstractC1212Zy abstractC1212Zy2, C04484w c04484w) {
        this.A01 = abstractC1212Zy;
        this.A02 = abstractC1212Zy2;
        this.A00 = c04484w;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A04 = false;
        C0856Lz.A0K(this.A02);
        new Handler().postDelayed(new C1217a3(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}

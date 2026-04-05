package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class P5 implements View.OnTouchListener {
    public final /* synthetic */ C0854Lx A00;

    public P5(C0854Lx c0854Lx) {
        this.A00 = c0854Lx;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0B.A03(new C0757Ia(view, motionEvent));
        return false;
    }
}

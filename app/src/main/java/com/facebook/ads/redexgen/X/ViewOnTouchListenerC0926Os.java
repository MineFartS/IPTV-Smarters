package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Os, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0926Os implements View.OnTouchListener {
    public final /* synthetic */ Ot A00;

    public ViewOnTouchListenerC0926Os(Ot ot) {
        this.A00 = ot;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            Ot.A00(this.A00);
            this.A00.A06.A8E(this.A00.A03.A0Q(), new C0897Np().A04(this.A00.getViewabilityChecker()).A03(this.A00.getTouchDataRecorder()).A06());
            return false;
        }
        return false;
    }
}

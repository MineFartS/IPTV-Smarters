package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NQ implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            C0856Lz.A0P(view, NU.A08);
        } else if (action == 1) {
            C0856Lz.A0P(view, 0);
        }
        return false;
    }
}

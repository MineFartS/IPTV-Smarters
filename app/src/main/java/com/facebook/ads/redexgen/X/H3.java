package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class H3 implements PZ {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;
    public final View A07;
    public final Handler A06 = new Handler();
    public PY A02 = PY.A05;

    public H3(View view, int i2, Drawable drawable, Drawable drawable2) {
        this.A03 = i2;
        this.A07 = view;
        this.A05 = drawable;
        this.A04 = drawable2;
        this.A01 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A01.setCrossFadeEnabled(true);
        this.A00 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00.setCrossFadeEnabled(true);
        C0856Lz.A0W(this.A07, this.A01);
    }

    private void A04(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = PY.A06;
            C0856Lz.A0W(this.A07, this.A00);
            this.A00.startTransition(this.A03);
            this.A06.postDelayed(new H6(this), this.A03);
            return;
        }
        C0856Lz.A0W(this.A07, this.A05);
        this.A02 = PY.A05;
    }

    private void A05(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = PY.A04;
            C0856Lz.A0W(this.A07, this.A01);
            this.A01.startTransition(this.A03);
            this.A06.postDelayed(new H7(this), this.A03);
            return;
        }
        C0856Lz.A0W(this.A07, this.A04);
        this.A02 = PY.A03;
    }

    @Override // com.facebook.ads.redexgen.X.PZ
    public final void A3O(boolean z, boolean z2) {
        if (z2) {
            A04(z);
        } else {
            A05(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PZ
    public final PY A76() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.PZ
    public final void cancel() {
        this.A06.removeCallbacksAndMessages(null);
        this.A01.resetTransition();
        this.A00.resetTransition();
        this.A02 = this.A02 == PY.A04 ? PY.A05 : PY.A03;
    }
}

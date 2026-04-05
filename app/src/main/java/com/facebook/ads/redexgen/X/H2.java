package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class H2 implements PZ {
    public int A00;

    @Nullable
    public ValueAnimator A01;
    public PY A02 = PY.A05;
    public final int A03;
    public final int A04;
    public final View A05;

    public H2(View view, int i2, int i3, int i4) {
        this.A05 = view;
        this.A03 = i2;
        this.A00 = i3;
        this.A04 = i4;
    }

    private ValueAnimator A00(int i2, int i3, View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.setDuration(this.A03);
        valueAnimatorOfInt.addUpdateListener(new C0935Pc(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z) {
        if (z) {
            this.A02 = PY.A06;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new C0934Pb(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        C0856Lz.A0K(this.A05);
        this.A02 = PY.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        C0856Lz.A0O(this.A05);
        if (z) {
            this.A02 = PY.A04;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new C0933Pa(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = PY.A03;
    }

    public final void A09(int i2) {
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.PZ
    public final void A3O(boolean z, boolean z2) {
        if (z2) {
            A07(z);
        } else {
            A08(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PZ
    public final PY A76() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.PZ
    public final void cancel() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}

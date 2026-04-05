package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class O5 extends AbstractC0900Ns {
    public static final int A04 = (int) (C0856Lz.A01 * 12.0f);
    public static final int A05 = (int) (C0856Lz.A01 * 16.0f);
    public int A00;
    public boolean A01;
    public boolean A02;
    public final O6 A03;

    public O5(X2 x2, int i2, C1H c1h, JZ jz, MR mr, boolean z, boolean z2, Q2 q2, C0849Ls c0849Ls, boolean z3) {
        super(x2, i2, c1h, PF.A04.A02(), jz, mr, q2, c0849Ls);
        this.A02 = false;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams.addRule(9);
        layoutParams.setMargins(0, 0, A04, 0);
        if (z2) {
            this.A04.setVisibility(8);
        }
        this.A00 = C0856Lz.A03(x2);
        this.A01 = z3;
        boolean z4 = (this.A00 == 2) && this.A01;
        this.A03 = new O6(x2, c1h, true, z4 || z, true);
        this.A03.setUseNewLandscapeEndCard(this.A01);
        this.A03.setAlignment(8388611);
        if (JT.A1J(super.A02)) {
            this.A03.setDescriptionVisibility(8);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.A04.getId());
        if (!this.A01) {
            layoutParams.addRule(15);
            layoutParams2.addRule(15);
        }
        super.A01.addView(this.A04, layoutParams);
        super.A01.addView(this.A03, layoutParams2);
        if (z4) {
            addView(super.A01, new LinearLayout.LayoutParams(-2, -1, 0.7f));
            return;
        }
        addView(super.A01, new LinearLayout.LayoutParams(-2, -2));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -15658735});
        gradientDrawable.setCornerRadius(0.0f);
        C0856Lz.A0W(this, gradientDrawable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0900Ns
    public final void A0D(int i2) {
        LinearLayout.LayoutParams layoutParams;
        C0856Lz.A0M(super.A03);
        int i3 = 1;
        boolean z = i2 == 1;
        boolean isPortrait = this.A01;
        if (isPortrait) {
            this.A00 = i2;
            setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            boolean isPortrait2 = this.A02;
            if (isPortrait2 && !z) {
                layoutParams2.weight = 0.7f;
                setBackgroundResource(0);
                C0856Lz.A0P(this, -447721392);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -15658735});
                gradientDrawable.setCornerRadius(0.0f);
                C0856Lz.A0W(this, gradientDrawable);
            }
            super.A01.setLayoutParams(layoutParams2);
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, A05, 0, 0);
            bringToFront();
        } else {
            if (!z) {
                i3 = 0;
            }
            setOrientation(i3);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z ? -1 : 0, -2);
            layoutParams3.weight = 1.0f;
            super.A01.setLayoutParams(layoutParams3);
            layoutParams = new LinearLayout.LayoutParams(z ? -1 : -2, -2);
            layoutParams.setMargins(z ? 0 : A05, z ? A05 : 0, 0, 0);
        }
        layoutParams.gravity = 80;
        addView(super.A03, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0900Ns
    public final void A0E(boolean z) {
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0900Ns
    public void setInfo(C1G c1g, C1I c1i, String str, String str2, @Nullable InterfaceC0903Nv interfaceC0903Nv) {
        super.setInfo(c1g, c1i, str, str2, interfaceC0903Nv);
        this.A03.A02(c1g.A06(), c1g.A05(), null, false, false);
        if (TextUtils.isEmpty(c1i.A03())) {
            C0856Lz.A0K(super.A03);
        }
    }
}

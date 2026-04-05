package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class O2 extends LinearLayout {
    public static final int A06 = (int) (C0856Lz.A01 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final X2 A04;
    public final O3[] A05;

    public O2(X2 x2, int i2, int i3, int i4, int i5) {
        super(x2);
        this.A00 = A06;
        this.A04 = x2;
        setOrientation(0);
        this.A03 = i2;
        this.A01 = i4;
        this.A02 = i5;
        this.A05 = new O3[i3];
        for (int i6 = 0; i6 < i3; i6++) {
            this.A05[i6] = A00();
            addView(this.A05[i6]);
        }
        A01();
    }

    private O3 A00() {
        O3 o3 = new O3(this.A04, this.A01, this.A02);
        int i2 = this.A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        o3.setLayoutParams(layoutParams);
        return o3;
    }

    private void A01() {
        int i2 = 0;
        while (true) {
            O3[] o3Arr = this.A05;
            if (i2 < o3Arr.length) {
                ((LinearLayout.LayoutParams) o3Arr[i2].getLayoutParams()).leftMargin = i2 == 0 ? 0 : this.A00;
                i2++;
            } else {
                requestLayout();
                return;
            }
        }
    }

    private void A02(float f2) {
        for (int i2 = 0; i2 < this.A05.length; i2++) {
            float fMin = Math.min(1.0f, f2 - i2);
            if (fMin < 0.0f) {
                fMin = 0.0f;
            }
            this.A05[i2].setFillRatio(fMin);
        }
    }

    public void setItemSpacing(int i2) {
        this.A00 = i2;
        A01();
    }

    public void setRating(float f2) {
        A02(f2);
    }
}

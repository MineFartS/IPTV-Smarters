package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MN implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ C1234aL A00;

    public MN(C1234aL c1234aL) {
        this.A00 = c1234aL;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i2) {
        RelativeLayout.LayoutParams layoutParams;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z = this.A00.getResources().getConfiguration().orientation == 1;
        if (z) {
            layoutParams = this.A00.A09;
        } else {
            layoutParams = this.A00.A08;
        }
        if ((i2 & 2) == 0) {
            this.A00.A02 = true;
            if (!z) {
                i6 = 0;
            } else {
                i6 = C1234aL.A0M;
            }
            if (!z) {
                i7 = 0;
            } else {
                i7 = C1234aL.A0M;
            }
            if (!z) {
                i8 = 0;
            } else {
                i8 = C1234aL.A0M * 3;
            }
            layoutParams.setMargins(i6, 0, i7, i8);
        } else {
            this.A00.A02 = false;
            if (!z) {
                i3 = 0;
            } else {
                i3 = C1234aL.A0M;
            }
            if (!z) {
                i4 = 0;
            } else {
                i4 = C1234aL.A0M;
            }
            if (!z) {
                i5 = 0;
            } else {
                i5 = C1234aL.A0M;
            }
            layoutParams.setMargins(i3, 0, i4, i5);
        }
        this.A00.setLayoutParams(layoutParams);
    }
}

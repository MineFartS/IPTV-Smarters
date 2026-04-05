package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0918Ok extends LinearLayout {
    public static final int A04 = (int) (C0856Lz.A01 * 32.0f);
    public static final int A05 = (int) (C0856Lz.A01 * 8.0f);
    public TextView A00;
    public TextView A01;
    public O0 A02;
    public final X2 A03;

    public C0918Ok(X2 x2) {
        super(x2);
        this.A03 = x2;
        A00(x2);
    }

    private final void A00(X2 x2) {
        setGravity(16);
        this.A02 = new O0(x2);
        this.A02.setFullCircleCorners(true);
        int i2 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.setMargins(0, 0, A05, 0);
        addView(this.A02, layoutParams);
        LinearLayout linearLayout = new LinearLayout(x2);
        linearLayout.setOrientation(1);
        this.A00 = new TextView(x2);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        C0856Lz.A0b(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(x2);
        C0856Lz.A0b(this.A01, false, 14);
        linearLayout.addView(this.A00);
        linearLayout.addView(this.A01);
        addView(linearLayout, layoutParams2);
    }

    public final void A01(int i2, int i3) {
        this.A00.setTextColor(i2);
        this.A01.setTextColor(i3);
    }

    public void setPageDetails(C1Q c1q) {
        XE xe = new XE(this.A02, this.A03);
        int i2 = A04;
        xe.A06(i2, i2);
        xe.A08(c1q.A01());
        this.A00.setText(c1q.A02());
        this.A01.setText(c1q.A03());
    }
}

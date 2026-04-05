package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1157Xs extends N1 {
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final X2 A04;
    public static final int A07 = (int) (C0856Lz.A01 * 4.0f);
    public static final int A06 = (int) (C0856Lz.A01 * 10.0f);
    public static final int A05 = (int) (C0856Lz.A01 * 44.0f);

    public C1157Xs(X2 x2, JZ jz, String str) {
        super(x2, jz, str);
        this.A04 = x2;
        this.A01 = new ImageView(getContext());
        ImageView imageView = this.A01;
        int i2 = A06;
        imageView.setPadding(i2, i2, i2, i2);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        int i3 = A05;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        C0856Lz.A0P(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void A0K() {
        this.A01.setImageBitmap(M8.A00(M7.CROSS));
        this.A01.setOnClickListener(new NA(this));
        N5 n5 = new N5(this.A04);
        n5.setData(AnonymousClass23.A0B(this.A04.A00()), M7.HIDE_AD);
        n5.setOnClickListener(new NB(this, n5));
        N5 n52 = new N5(this.A04);
        n52.setData(AnonymousClass23.A0F(this.A04.A00()), M7.REPORT_AD);
        n52.setOnClickListener(new NC(this, n52));
        N5 n53 = new N5(this.A04);
        n53.setData(AnonymousClass23.A0G(this.A04.A00()), M7.AD_CHOICES_ICON);
        n53.setOnClickListener(new ND(this, n53));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A07;
        layoutParams.setMargins(0, i2, i2, i2);
        C0856Lz.A0X(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(n5, layoutParams);
        this.A02.addView(n52, layoutParams);
        this.A02.addView(n53, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void A0L() {
        C0856Lz.A0L(this);
        C0856Lz.A0M(this);
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void A0M(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        C0856Lz.A0b(textView, true, 14);
        textView.setText(AnonymousClass23.A07(this.A04.A00()));
        textView.setGravity(17);
        C0856Lz.A0X(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void A0N(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24) {
        C0856Lz.A0X(this.A03);
        this.A01.setImageBitmap(M8.A00(M7.BACK_ARROW));
        this.A01.setOnClickListener(new NE(this));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A07;
        layoutParams.setMargins(0, i2, i2, i2);
        for (AnonymousClass26 anonymousClass262 : anonymousClass26.A05()) {
            N5 n5 = new N5(this.A04);
            n5.setData(anonymousClass262.A04(), null);
            n5.setOnClickListener(new NF(this, n5, anonymousClass262));
            this.A02.addView(n5, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final boolean A0O() {
        return true;
    }
}

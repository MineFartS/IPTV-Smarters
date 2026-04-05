package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1154Xp extends N1 {
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final X2 A03;
    public static final int A06 = (int) (C0856Lz.A01 * 8.0f);
    public static final int A05 = (int) (C0856Lz.A01 * 10.0f);
    public static final int A04 = (int) (C0856Lz.A01 * 44.0f);

    public C1154Xp(X2 x2, JZ jz, String str) {
        super(x2, jz, str);
        this.A03 = x2;
        this.A00 = new ImageView(getContext());
        ImageView imageView = this.A00;
        int i2 = A05;
        imageView.setPadding(i2, i2, i2, i2);
        this.A00.setColorFilter(-10459280);
        int i3 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        C0856Lz.A0P(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        LinearLayout linearLayout = this.A01;
        int i4 = A06;
        linearLayout.setPadding(i4, i4, i4, i4);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void A0K() {
        this.A00.setImageBitmap(M8.A00(M7.CROSS));
        this.A00.setOnClickListener(new NK(this));
        N5 n5 = new N5(this.A03);
        n5.setData(AnonymousClass23.A0B(this.A03.A00()), M7.HIDE_AD);
        n5.setOnClickListener(new NL(this, n5));
        N5 n52 = new N5(this.A03);
        n52.setData(AnonymousClass23.A0F(this.A03.A00()), M7.REPORT_AD);
        n52.setOnClickListener(new NM(this, n52));
        N5 n53 = new N5(this.A03);
        n53.setData(AnonymousClass23.A0G(this.A03.A00()), M7.AD_CHOICES_ICON);
        n53.setOnClickListener(new NN(this, n53));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A06;
        layoutParams.setMargins(i2, i2, i2, i2);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, 0);
        layoutParams2.gravity = 17;
        layoutParams2.weight = 1.0f;
        C0856Lz.A0X(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams2);
        linearLayout.addView(n5, layoutParams);
        linearLayout.addView(n52, layoutParams);
        linearLayout.addView(n53, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void A0L() {
        C0856Lz.A0L(this);
        C0856Lz.A0M(this);
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void A0M(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24) {
        String strA0B;
        M7 m7;
        int i2;
        this.A00.setOnClickListener(null);
        if (anonymousClass24 == AnonymousClass24.A05) {
            strA0B = AnonymousClass23.A09(this.A03.A00());
            m7 = M7.REPORT_AD;
            i2 = -552389;
        } else {
            strA0B = AnonymousClass23.A0B(this.A03.A00());
            m7 = M7.HIDE_AD;
            i2 = -13272859;
        }
        N0 n0A0M = new C0881Mz(this.A03, this.A0A).A0I(strA0B).A0H(AnonymousClass23.A07(this.A03.A00())).A0F(anonymousClass26.A04()).A0K(false).A0E(m7).A0D(i2).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        C0856Lz.A0X(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(n0A0M, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void A0N(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24) {
        NJ nj = new NJ(this.A03, anonymousClass26, this.A0A, anonymousClass24 == AnonymousClass24.A05 ? M7.REPORT_AD : M7.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(M8.A00(M7.BACK_ARROW));
        this.A00.setOnClickListener(new NO(this));
        C0856Lz.A0X(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(nj, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final boolean A0O() {
        return true;
    }
}

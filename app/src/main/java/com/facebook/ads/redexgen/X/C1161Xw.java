package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1161Xw extends N1 {
    public static String[] A02;
    public static final int A03;
    public final RelativeLayout A00;
    public final X2 A01;

    public static void A0C() {
        A02 = new String[]{"ixUXsyhysd", "OPv8qP0MhbtkKZTtC7nh2I9a6WHAwpWs", "vXGbyjT4IhQUpn", "fkCzuvVfwHm7OJpjmgBYeP3AajMmrNF6", "BQFEEs7xBV9CwTHtkGRziYqWB8GhQG3x", "ODdJk2", BuildConfig.FLAVOR, "xXrbtEFvrY2"};
    }

    static {
        A0C();
        A03 = (int) (C0856Lz.A01 * 8.0f);
    }

    public C1161Xw(X2 x2, JZ jz, String str, C1Q c1q, MS ms, MR mr) {
        super(x2, jz, str, c1q, ms, mr);
        this.A01 = x2;
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        C0856Lz.A0P(this.A00, -1728053248);
        this.A00.setOnClickListener(new N6(this));
    }

    public static RelativeLayout.LayoutParams A0A(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        if (A02[7].length() == 30) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "p8zovDyK5QtHis";
        strArr[0] = "GXgRrx0bJv";
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0B() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            C0856Lz.A0Z(this, transitionSet);
            return;
        }
        C0856Lz.A0X(this);
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void A0K() {
        AnonymousClass26 anonymousClass26A03 = AnonymousClass23.A03(this.A01.A00());
        NG adChoicesView = new NG(this.A01);
        adChoicesView.setInfo(M7.HIDE_AD, AnonymousClass23.A0B(this.A01.A00()), AnonymousClass23.A0A(this.A01.A00()));
        adChoicesView.setOnClickListener(new N7(this));
        AnonymousClass26 anonymousClass26A04 = AnonymousClass23.A04(this.A01.A00());
        NG ng = new NG(this.A01);
        ng.setInfo(M7.REPORT_AD, AnonymousClass23.A0F(this.A01.A00()), AnonymousClass23.A0E(this.A01.A00()));
        ng.setOnClickListener(new N8(this));
        NG ng2 = new NG(this.A01);
        ng2.setInfo(M7.AD_CHOICES_ICON, AnonymousClass23.A0G(this.A01.A00()), BuildConfig.FLAVOR);
        ng2.setOnClickListener(new N9(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i2 = A03;
        linearLayout.setPadding(i2 * 2, i2, i2 * 2, i2);
        C0856Lz.A0P(linearLayout, -1);
        if (!anonymousClass26A03.A05().isEmpty()) {
            linearLayout.addView(adChoicesView, layoutParams);
        }
        if (!anonymousClass26A04.A05().isEmpty()) {
            linearLayout.addView(ng, layoutParams);
        }
        linearLayout.addView(ng2, layoutParams);
        A0B();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0A(false));
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void A0L() {
        C0856Lz.A0L(this);
        this.A00.removeAllViews();
        C0856Lz.A0M(this);
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void A0M(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24) {
        String strA08;
        String strA01;
        if (anonymousClass24 == AnonymousClass24.A04) {
            return;
        }
        boolean z = anonymousClass24 == AnonymousClass24.A05;
        C0881Mz c0881Mz = new C0881Mz(this.A01, this.A0A);
        if (z) {
            strA08 = AnonymousClass23.A09(this.A01.A00());
        } else {
            strA08 = AnonymousClass23.A08(this.A01.A00());
        }
        C0881Mz c0881MzA0D = c0881Mz.A0I(strA08).A0H(AnonymousClass23.A07(this.A01.A00())).A0F(anonymousClass26.A04()).A0E(z ? M7.REPORT_AD : M7.HIDE_AD).A0D(z ? -552389 : -13272859);
        if (this.A09 != null) {
            strA01 = this.A09.A01();
        } else {
            strA01 = BuildConfig.FLAVOR;
        }
        N0 n0A0M = c0881MzA0D.A0G(strA01).A0M();
        C0856Lz.A0P(n0A0M, -1);
        C0856Lz.A0X(this);
        this.A00.removeAllViews();
        this.A00.addView(n0A0M, A0A(true));
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void A0N(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24) {
        String strA0B;
        boolean z = anonymousClass24 == AnonymousClass24.A05;
        X2 x2 = this.A01;
        N3 n3 = this.A0A;
        if (z) {
            strA0B = AnonymousClass23.A0F(this.A01.A00());
        } else {
            strA0B = AnonymousClass23.A0B(this.A01.A00());
        }
        NJ nj = new NJ(x2, anonymousClass26, n3, strA0B, z ? M7.REPORT_AD : M7.HIDE_AD);
        nj.setClickable(true);
        C0856Lz.A0P(nj, -1);
        int i2 = A03;
        nj.setPadding(i2 * 2, i2, i2 * 2, i2);
        A0B();
        this.A00.removeAllViews();
        this.A00.addView(nj, A0A(false));
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final boolean A0O() {
        return false;
    }
}

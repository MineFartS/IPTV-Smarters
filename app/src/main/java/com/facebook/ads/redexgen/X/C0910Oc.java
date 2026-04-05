package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0910Oc extends LinearLayout {

    @Nullable
    public LinearLayout A00;
    public final int A01;
    public final X2 A02;
    public final O0 A03;
    public final O6 A04;
    public static final int A07 = (int) (C0856Lz.A01 * 16.0f);
    public static final int A08 = (int) (C0856Lz.A01 * 16.0f);
    public static final int A06 = (int) (C0856Lz.A01 * 8.0f);
    public static final int A05 = (int) (C0856Lz.A01 * 72.0f);

    public C0910Oc(C0908Oa c0908Oa) {
        super(c0908Oa.A06);
        this.A02 = c0908Oa.A06;
        this.A03 = new O0(this.A02);
        this.A04 = new O6(this.A02, c0908Oa.A01, true, false, true);
        this.A01 = c0908Oa.A00;
        A03(c0908Oa);
    }

    public /* synthetic */ C0910Oc(C0908Oa c0908Oa, C0972Qn c0972Qn) {
        this(c0908Oa);
    }

    private void A00() {
        A01(this.A03, 150);
        A01(this.A04, 170);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, 190);
        }
    }

    private void A01(View view, int i2) {
        view.setTranslationY(i2);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i2).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(C0908Oa c0908Oa) {
        if (!TextUtils.isEmpty(c0908Oa.A03)) {
            this.A00 = new LinearLayout(getContext());
            this.A00.setGravity(17);
            LinearLayout linearLayout = this.A00;
            int i2 = A08;
            linearLayout.setPadding(i2, i2 / 2, i2, i2 / 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, A08 / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            C0856Lz.A0b(textView, false, 16);
            textView.setText(c0908Oa.A03);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            new XE(imageView, this.A02).A05().A08(c0908Oa.A02);
            int i3 = A07;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i3, i3);
            layoutParams3.setMargins(0, 0, A08 / 2, 0);
            this.A00.addView(imageView, layoutParams3);
            this.A00.addView(textView, layoutParams2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(100.0f);
            gradientDrawable.setColor(469762047);
            C0856Lz.A0W(this.A00, gradientDrawable);
            addView(this.A00, layoutParams);
        }
    }

    private void A03(C0908Oa c0908Oa) {
        C0856Lz.A0P(this.A03, 0);
        this.A03.setRadius(50);
        if (c0908Oa.A04.A00() == C1E.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        new XE(this.A03, this.A02).A05().A08(c0908Oa.A05.A01());
        this.A04.A02(c0908Oa.A04.A06(), c0908Oa.A05.A03(), null, false, true);
        this.A04.getDescriptionTextView().setAlpha(0.8f);
        this.A04.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A08;
        layoutParams.setMargins(0, i2, 0, i2 / 2);
        View view = this.A03;
        int i3 = A05;
        addView(view, new LinearLayout.LayoutParams(i3, i3));
        addView(this.A04, layoutParams);
        A02(c0908Oa);
        C0856Lz.A0P(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(InterfaceC0909Ob interfaceC0909Ob) {
        A00();
        postDelayed(new C0972Qn(this, interfaceC0909Ob), this.A01);
    }
}

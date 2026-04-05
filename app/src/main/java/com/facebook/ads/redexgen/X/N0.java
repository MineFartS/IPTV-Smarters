package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class N0 extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final X2 A02;
    public final N3 A03;
    public final boolean A04;
    public static final int A08 = (int) (C0856Lz.A01 * 16.0f);
    public static final int A09 = (int) (C0856Lz.A01 * 8.0f);
    public static final int A0C = (int) (C0856Lz.A01 * 44.0f);
    public static final int A07 = (int) (C0856Lz.A01 * 10.0f);
    public static final int A06 = A08 - A07;
    public static final int A0D = (int) (C0856Lz.A01 * 75.0f);
    public static final int A0A = (int) (C0856Lz.A01 * 25.0f);
    public static final int A0E = (int) (C0856Lz.A01 * 45.0f);
    public static final int A0B = (int) (C0856Lz.A01 * 15.0f);
    public static final int A05 = (int) (C0856Lz.A01 * 16.0f);

    public N0(C0881Mz c0881Mz) {
        super(c0881Mz.A0C);
        this.A02 = c0881Mz.A0C;
        this.A03 = c0881Mz.A02;
        this.A01 = c0881Mz.A0B ? A0D : A0E;
        this.A00 = c0881Mz.A0B ? A0A : A0B;
        this.A04 = c0881Mz.A07;
        setClickable(true);
        View viewA01 = A01(c0881Mz);
        View viewA00 = A00(c0881Mz);
        View footerView = getFooterView();
        C0856Lz.A0N(viewA01);
        C0856Lz.A0N(viewA00);
        C0856Lz.A0N(footerView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        layoutParams2.addRule(3, viewA01.getId());
        layoutParams2.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12);
        int i2 = A08;
        layoutParams3.setMargins(i2, 0, i2, i2);
        addView(viewA01, layoutParams);
        addView(viewA00, layoutParams2);
        addView(footerView, layoutParams3);
        footerView.setVisibility(c0881Mz.A08 ? 0 : 8);
    }

    public /* synthetic */ N0(C0881Mz c0881Mz, ViewOnClickListenerC0879Mx viewOnClickListenerC0879Mx) {
        this(c0881Mz);
    }

    private View A00(C0881Mz c0881Mz) {
        ImageView imageView = new ImageView(getContext());
        int i2 = this.A00;
        imageView.setPadding(i2, i2, i2, i2);
        imageView.setImageBitmap(M8.A00(c0881Mz.A01));
        imageView.setColorFilter(-1);
        int i3 = this.A01;
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(i3, i3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(c0881Mz.A00);
        C0856Lz.A0W(imageView, gradientDrawable);
        titleParams.gravity = 17;
        int i4 = A08;
        titleParams.setMargins(i4, 0, i4, i4);
        TextView textView = new TextView(getContext());
        C0856Lz.A0b(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(c0881Mz.A06);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i5 = A08;
        layoutParams.setMargins(i5, 0, i5, i5);
        TextView textView2 = new TextView(getContext());
        C0856Lz.A0b(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(c0881Mz.A05);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i6 = A08;
        layoutParams2.setMargins(i6, 0, i6, i6);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        linearLayout.addView(textView2, layoutParams2);
        if (c0881Mz.A09) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(c0881Mz.A04)) {
                O0 o0 = new O0(this.A02);
                int i7 = A0E;
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i7, i7);
                layoutParams3.setMargins(0, 0, A09, 0);
                o0.setFullCircleCorners(true);
                XE xe = new XE(o0, this.A02);
                int i8 = A0E;
                xe.A06(i8, i8).A08(c0881Mz.A04);
                linearLayout2.addView(o0, layoutParams3);
            }
            N5 n5 = new N5(this.A02);
            n5.setData(c0881Mz.A03, M7.CHECKMARK);
            n5.setSelected(true);
            LinearLayout.LayoutParams selectedOptionParams = new LinearLayout.LayoutParams(-2, -2);
            linearLayout2.addView(n5, selectedOptionParams);
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C0881Mz c0881Mz) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (c0881Mz.A0A) {
            ImageView imageView = new ImageView(getContext());
            int i2 = A07;
            imageView.setPadding(i2, i2, i2, i2);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(M8.A00(M7.CROSS));
            imageView.setOnClickListener(new ViewOnClickListenerC0879Mx(this));
            int i3 = A0C;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
            int i4 = A06;
            layoutParams.setMargins(i4, i4, i4, i4);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(M8.A00(M7.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i2 = A05;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        C0856Lz.A0b(textView, false, 16);
        textView.setTextColor(-13272859);
        int i3 = A09;
        textView.setPadding(i3, i3, i3, i3);
        textView.setText(AnonymousClass23.A0D(this.A02.A00()));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ViewOnClickListenerC0880My(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }
}

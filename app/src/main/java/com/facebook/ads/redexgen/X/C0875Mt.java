package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0875Mt extends LinearLayout implements P3 {
    public final NativeBannerAd A00;
    public final X2 A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (C0856Lz.A01 * 42.0f);
    public static final int A03 = (int) (C0856Lz.A01 * 48.0f);
    public static final int A05 = (int) (C0856Lz.A01 * 54.0f);
    public static final int A07 = (int) (C0856Lz.A01 * 4.0f);
    public static final int A06 = (int) (C0856Lz.A01 * 8.0f);

    public C0875Mt(X2 x2, NativeBannerAd nativeBannerAd, C0805Jw c0805Jw, EnumC0806Jx enumC0806Jx, MediaView mediaView, AdOptionsView adOptionsView) {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        super(x2);
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = x2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int iA00 = A00(enumC0806Jx);
        O1 o1 = new O1(this.A01);
        o1.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iA00, iA00);
        layoutParams3.gravity = 16;
        o1.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(o1, layoutParams3);
        P0 p0 = new P0(x2, this.A00, enumC0806Jx, c0805Jw, adOptionsView);
        p0.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.gravity = 16;
        linearLayout.addView(p0, layoutParams4);
        if (enumC0806Jx == EnumC0806Jx.A0A) {
            int i2 = A07;
            setPadding(i2, i2, i2, i2);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            int i3 = A06;
            setPadding(i3, i3, i3, i3);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        int iconSize = A06;
        int i4 = A07;
        textView.setPadding(iconSize, i4, iconSize, i4);
        c0805Jw.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, layoutParams2);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(EnumC0806Jx enumC0806Jx) {
        int i2 = P1.A00[enumC0806Jx.ordinal()];
        if (i2 == 1) {
            return A04;
        }
        if (i2 != 2) {
            return A05;
        }
        return A03;
    }

    @Override // com.facebook.ads.redexgen.X.P3
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.P3
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.P3
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}

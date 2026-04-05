package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0874Ms extends FrameLayout implements P3 {
    public static String[] A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;

    @Nullable
    public TextView A00;

    @Nullable
    public TextView A01;

    @Nullable
    public TextView A02;

    @Nullable
    public TextView A03;
    public final MediaView A04;
    public final NativeAd A05;
    public final P4 A06;
    public final ArrayList<View> A07;

    public static void A02() {
        A08 = new String[]{"LrUXeZd5oXG5wJ7", "S6ePTdxfK6c7yhvbHMQjZqIgQsLDz3QO", "YqVXoEdDoNpK3nL0El5", "Exhg7LXIw6HgSAmcccR052cOKtX3WF", "LN", "59F20xOEewuTmZzPatOKMeF6XI6ZvB1j", "IRBrDKvf2o0dBHWjf99N02m12yrR0Bg7", "KZ90h8EmVWfLUNKv0pT"};
    }

    static {
        A02();
        A0E = (int) (C0856Lz.A01 * 6.0f);
        A0D = (int) (C0856Lz.A01 * 8.0f);
        A0C = (int) (C0856Lz.A01 * 12.0f);
        A0A = (int) (C0856Lz.A01 * 350.0f);
        A09 = (int) (C0856Lz.A01 * 250.0f);
        A0B = (int) (C0856Lz.A01 * 175.0f);
    }

    public C0874Ms(X2 x2, NativeAd nativeAd, C0805Jw c0805Jw, EnumC0806Jx enumC0806Jx, O0 o0, MediaView mediaView, AdOptionsView adOptionsView) {
        super(x2);
        this.A07 = new ArrayList<>();
        this.A05 = nativeAd;
        this.A04 = mediaView;
        this.A06 = new P4(x2, this.A05, c0805Jw, o0, adOptionsView);
        P4 p4 = this.A06;
        int i2 = A0C;
        p4.setPadding(i2, i2, i2, A0E);
        addView(this.A06, new FrameLayout.LayoutParams(-1, -2));
        if (enumC0806Jx == EnumC0806Jx.A09 || enumC0806Jx == EnumC0806Jx.A0B) {
            A08(c0805Jw);
        }
        addView(this.A04, new FrameLayout.LayoutParams(-1, -2));
        if (enumC0806Jx != EnumC0806Jx.A0B || this.A05.getAdCreativeType() != NativeAd.AdCreativeType.CAROUSEL) {
            A07(c0805Jw);
            A05(c0805Jw);
            A06(c0805Jw);
        }
        this.A07.add(o0);
        this.A07.add(mediaView);
    }

    private int A00() {
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        TextView textView = this.A03;
        int titleHeight = 0;
        if (textView != null && textView.getVisibility() == 0) {
            measuredHeight = this.A03.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        TextView textView2 = this.A02;
        if (A08[1].charAt(0) == 'k') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[6] = "SrhbzBCrZmwJCsE1GN19GBhRpshhKBl4";
        strArr[5] = "lZXGEU0s5y97LRskCQS4IC0Q6rEMlB8o";
        if (textView2 != null && textView2.getVisibility() == 0) {
            measuredHeight2 = this.A02.getMeasuredHeight();
        } else {
            measuredHeight2 = 0;
        }
        TextView textView3 = this.A00;
        if (textView3 != null && textView3.getVisibility() == 0) {
            measuredHeight3 = this.A00.getMeasuredHeight();
        } else {
            measuredHeight3 = 0;
        }
        TextView textView4 = this.A01;
        if (A08[1].charAt(0) == 'k') {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[6] = "nRuc5lutSXPKh9f7kKzdW2kIhLu3nB9m";
        strArr2[5] = "FuxAmHJZMOFMUG38wB3yXnFuBZuRMBRE";
        if (textView4 != null) {
            int subtitleHeight = textView4.getVisibility();
            if (subtitleHeight == 0) {
                int titleHeight2 = this.A01.getMeasuredHeight();
                int subtitleHeight2 = A0C;
                int titleHeight3 = titleHeight2 + subtitleHeight2;
                int subtitleHeight3 = A0D;
                titleHeight = titleHeight3 + subtitleHeight3;
            }
        }
        int measuredHeight4 = getMeasuredHeight();
        int ctaHeight = this.A06.getMeasuredHeight();
        return ((((measuredHeight4 - ctaHeight) - measuredHeight) - measuredHeight2) - measuredHeight3) - titleHeight;
    }

    private void A01() {
        TextView textView = this.A03;
        if (textView != null) {
            textView.setLines(1);
        }
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.setLines(1);
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            textView3.setLines(1);
        }
    }

    private void A03(int i2) {
        C0856Lz.A0Q(this.A04, i2 > A0B ? 0 : 8);
        C0856Lz.A0Q(this.A03, i2 > A0A ? 0 : 8);
        C0856Lz.A0Q(this.A00, i2 <= A09 ? 8 : 0);
    }

    public static void A04(int i2, int i3, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null && textView.getVisibility() == 0) {
                int iA05 = C0856Lz.A05(textView, i3);
                textView.setLines(iA05 + 1);
                textView.measure(i2, View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight() + (textView.getLineHeight() * iA05), 1073741824));
                i3 -= textView.getLineHeight() * iA05;
            }
        }
    }

    private void A05(C0805Jw c0805Jw) {
        if (this.A05.getAdBodyText() != null && !this.A05.getAdBodyText().trim().isEmpty()) {
            this.A00 = new TextView(getContext());
            c0805Jw.A06(this.A00);
            this.A00.setText(this.A05.getAdBodyText());
            TextView textView = this.A00;
            int i2 = A0C;
            textView.setPadding(i2, 0, i2, 0);
            addView(this.A00, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A06(C0805Jw c0805Jw) {
        if (this.A05.hasCallToAction()) {
            this.A01 = new TextView(getContext());
            C0856Lz.A0N(this.A01);
            c0805Jw.A05(this.A01);
            this.A01.setText(this.A05.getAdCallToAction());
            TextView textView = this.A01;
            int i2 = A0D;
            textView.setPadding(i2, i2, i2, i2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            int i3 = A0D;
            layoutParams.setMargins(i3, 0, i3, 0);
            addView(this.A01, layoutParams);
            this.A07.add(this.A01);
        }
    }

    private void A07(C0805Jw c0805Jw) {
        if (this.A05.getAdHeadline() != null && !this.A05.getAdHeadline().trim().isEmpty()) {
            this.A02 = new TextView(getContext());
            c0805Jw.A07(this.A02);
            this.A02.setText(this.A05.getAdHeadline());
            TextView textView = this.A02;
            int i2 = A0C;
            textView.setPadding(i2, A0D, i2, 0);
            addView(this.A02, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A08(C0805Jw c0805Jw) {
        if (this.A05.getAdLinkDescription() != null && !this.A05.getAdLinkDescription().trim().isEmpty()) {
            this.A03 = new TextView(getContext());
            c0805Jw.A06(this.A03);
            this.A03.setText(this.A05.getAdLinkDescription());
            TextView textView = this.A03;
            int i2 = A0C;
            textView.setPadding(i2, 0, i2, A0D);
            addView(this.A03, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.P3
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.P3
    public ArrayList<View> getViewsForInteraction() {
        return this.A07;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        P4 p4 = this.A06;
        p4.layout(i2, i3, i4, p4.getMeasuredHeight() + i3);
        int measuredHeight = i3 + this.A06.getMeasuredHeight();
        TextView textView = this.A03;
        if (textView != null && textView.getVisibility() == 0) {
            int measuredHeight2 = this.A03.getMeasuredHeight();
            this.A03.layout(i2, measuredHeight, i4, measuredHeight + measuredHeight2);
            measuredHeight += measuredHeight2;
        }
        MediaView mediaView = this.A04;
        mediaView.layout(i2, measuredHeight, i4, mediaView.getMeasuredHeight() + measuredHeight);
        int measuredHeight3 = measuredHeight + this.A04.getMeasuredHeight();
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.layout(i2, measuredHeight3, i4, textView2.getMeasuredHeight() + measuredHeight3);
            measuredHeight3 += this.A02.getMeasuredHeight();
        }
        TextView textView3 = this.A00;
        if (textView3 != null && textView3.getVisibility() == 0) {
            TextView textView4 = this.A00;
            if (A08[1].charAt(0) == 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[3] = "gjv6mmFqHT0";
            strArr[3] = "gjv6mmFqHT0";
            textView4.layout(i2, measuredHeight3, i4, textView4.getMeasuredHeight() + measuredHeight3);
        }
        TextView textView5 = this.A01;
        if (textView5 != null) {
            int i6 = A0C + i2;
            int measuredHeight4 = i5 - textView5.getMeasuredHeight();
            int i7 = A0C;
            textView5.layout(i6, measuredHeight4 - i7, i4 - i7, i5 - i7);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int iMin;
        A03(View.MeasureSpec.getSize(i3));
        A01();
        super.onMeasure(i2, i3);
        int iA00 = A00();
        if (this.A04.getMediaWidth() == 0 || this.A04.getMediaHeight() == 0) {
            iMin = iA00;
        } else {
            iMin = Math.min((int) (this.A04.getMeasuredWidth() * (this.A04.getMediaHeight() / this.A04.getMediaWidth())), iA00);
        }
        this.A04.measure(i2, View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
        if (iMin < iA00) {
            A04(i2, iA00 - iMin, this.A02, this.A00, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.P3
    public final void unregisterView() {
        this.A05.unregisterView();
    }
}

package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MK extends LinearLayout {
    public static byte[] A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final ImageView A01;
    public final X2 A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{118, 83};
    }

    static {
        A02();
        A07 = (int) (C0856Lz.A01 * 50.0f);
        A04 = (int) (C0856Lz.A01 * 10.0f);
        A05 = (int) (C0856Lz.A01 * 20.0f);
        A08 = (int) (C0856Lz.A01 * 4.0f);
        A06 = (int) (C0856Lz.A01 * 12.0f);
    }

    public MK(X2 x2, int i2) {
        super(x2);
        this.A02 = x2;
        setOrientation(0);
        this.A00 = new ImageView(x2);
        this.A01 = new ImageView(x2);
        A03(i2);
    }

    private void A03(int i2) {
        A04(this.A00, M7.AD_CHOICES_ICON);
        if (i2 == 2) {
            int i3 = A04;
            setPadding(i3, i3 / 3, i3, i3 / 3);
            TextView textView = new TextView(this.A02);
            textView.setText(A01(0, 2, 108));
            textView.setTextColor(-1);
            int i4 = A04;
            textView.setPadding(0, i4 / 2, i4 / 2, i4 / 2);
            C0856Lz.A0b(textView, true, 13);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            addView(textView, layoutParams);
            int i5 = A06;
            LinearLayout.LayoutParams adChoicesIconParams = new LinearLayout.LayoutParams(i5, i5);
            adChoicesIconParams.gravity = 16;
            addView(this.A00, adChoicesIconParams);
            return;
        }
        int i6 = A04;
        setPadding(i6, i6, i6, i6);
        A04(this.A01, i2 == 1 ? M7.AN_INFO_ICON : M7.DEFAULT_INFO_ICON);
        int i7 = A05;
        LinearLayout.LayoutParams infoButtonParams = new LinearLayout.LayoutParams(i7, i7);
        infoButtonParams.gravity = 17;
        addView(this.A01, infoButtonParams);
        int i8 = A05;
        LinearLayout.LayoutParams infoButtonParams2 = new LinearLayout.LayoutParams(i8, i8);
        infoButtonParams2.setMargins(A08, 0, 0, 0);
        infoButtonParams2.gravity = 17;
        addView(this.A00, infoButtonParams2);
    }

    public static void A04(ImageView imageView, M7 m7) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(M8.A00(m7));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C1Q c1q, String str, C0789Jg c0789Jg, MR mr) {
        setOnClickListener(new MJ(this, c0789Jg, mr, str, c1q));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A07);
        gradientDrawable.setColor(i2);
        C0856Lz.A0W(this, gradientDrawable);
    }

    public void setIconColors(int i2) {
        this.A00.setColorFilter(i2);
        this.A01.setColorFilter(i2);
    }
}

package com.facebook.ads.redexgen.X;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;
import org.achartengine.renderer.DefaultRenderer;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OM extends FrameLayout {
    public static byte[] A04;
    public static String[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public final int A00;
    public final RelativeLayout A01;
    public final XD A02;
    public final OD A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {69, 73, 75, 8, 64, 71, 69, 67, 68, 73, 73, 77, 8, 71, 66, 85, 8, 79, 72, 82, 67, 84, 85, 82, 79, 82, 79, 71, 74, 8, 69, 74, 79, 69, 77, 67, 66, 7, DateTimeFieldType.CLOCKHOUR_OF_DAY, 2, DateTimeFieldType.SECOND_OF_DAY, 7, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 42, 3, 28, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 26};
        String[] strArr = A05;
        if (strArr[3].charAt(15) != strArr[4].charAt(15)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[5] = "M6cOBFfgZV5WrXqkO4ySzzXWKNERUvDd";
        strArr2[1] = "WlW2JqkldnDOleaZiTbYh0p7usvkNGUh";
        A04 = bArr;
    }

    public static void A02() {
        A05 = new String[]{"ETopWcrKoMciXJ", "1fAm0Qu4GTtFv02w82npEu9QoUOkP81a", "kVTrWQ9", "rJ2v45uLjqrwh5Cb8v0uvinsp2r56JAZ", "ea7XoHjS0E3igDkbOVl09dybSdR2gWYC", "2SqEzPP8dz4OE7L9BTgTSspAixKmYBe2", "Gvao2GnTf255Ph834nKKQFNtQ7sU5Fe8", "O3MbW7jFVfRGmhn"};
    }

    static {
        A02();
        A01();
        A09 = (int) (C0856Lz.A01 * 36.0f);
        A0A = (int) (C0856Lz.A01 * 36.0f);
        A06 = (int) (C0856Lz.A01 * 23.0f);
        A08 = (int) (C0856Lz.A01 * 8.0f);
        A07 = (int) (C0856Lz.A01 * 3.0f);
        A0B = (int) (C0856Lz.A01 * 4.0f);
    }

    public OM(OD od, String str, C1H c1h, InterfaceC0903Nv interfaceC0903Nv) {
        String strA00;
        super(od.A05());
        this.A03 = od;
        this.A00 = c1h.A08(true);
        this.A01 = new RelativeLayout(od.A05());
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A04(str, c1h, JT.A1T(this.A03.A05()));
        if (od.A04().A0T().equals(A00(37, 14, 107))) {
            strA00 = PF.A04.A02();
        } else {
            strA00 = A00(0, 37, 56);
        }
        this.A02 = new XD(od.A05(), strA00, null, od.A06(), od.A09(), od.A0B(), od.A07());
        this.A02.setCta(od.A04().A0M().A0G(), od.A04().A0Q(), new HashMap(), interfaceC0903Nv);
        this.A02.setIsInAppBrowser(true);
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A03(View view, boolean z) {
        ImageView imageView = new ImageView(this.A03.A05());
        imageView.setImageBitmap(M8.A00(M7.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        int i2 = 0;
        imageView.setClickable(false);
        if (z) {
            imageView.setColorFilter(this.A00);
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(this.A00);
            gradientDrawable.setShape(1);
            imageView.setBackgroundDrawable(gradientDrawable);
        }
        int i3 = A06;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i3);
        int i4 = A07;
        imageView.setPadding(i4, i4, i4, i4);
        if (!z) {
            i2 = A08;
        }
        layoutParams.bottomMargin = i2;
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A04(String str, C1H c1h, boolean z) {
        TextView textView;
        if (z) {
            textView = new Button(this.A03.A05());
        } else {
            textView = new TextView(this.A03.A05());
        }
        C0856Lz.A0N(textView);
        int i2 = A0A;
        textView.setPadding(i2, 0, i2, 0);
        if (z) {
            str = str.toUpperCase();
        }
        textView.setText(str);
        textView.setTextSize(14.0f);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        if (z) {
            int i3 = this.A00;
            String[] strArr = A05;
            if (strArr[3].charAt(15) != strArr[4].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[7] = "TjZ";
            strArr2[7] = "TjZ";
            C0856Lz.A0S(textView, i3, A0B);
            textView.setTextColor(DefaultRenderer.BACKGROUND_COLOR);
        } else {
            textView.setTextColor(this.A00);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, A09);
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        this.A01.addView(textView, layoutParams);
        A03(textView, z);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }
}

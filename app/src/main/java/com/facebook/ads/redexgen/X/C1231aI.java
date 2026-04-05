package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1231aI extends C0870Mo {
    public static byte[] A00;
    public static String[] A01;
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-18, 6, 4, 11};
    }

    public static void A02() {
        A01 = new String[]{"eX0NjQS6Cv0cdupm07HV5hzKAxMqH0d", "wx0dbtAc6pD49FoTqFpKctGdSqsA8n1n", "9JOMWIFuCKG1ze3B51PWtKtXX7g1EywZ", "gAmwb49m1jF7v3L1lyLoTXmCcSr8lTwL", "cJX3oWeWBOAhIZgSwLbGNRfmWHdVGE1s", "ih2ASPIbB6Mipq7FMEYWa4gJohMeYNDI", "rzdVRvGtIJZPIPQmsJTUAvMIxIP5Lc8q", "0g5ABkfLP1KnY0Lvl5QhU96hc6mXXT01"};
    }

    static {
        A02();
        A01();
        A02 = (int) (C0856Lz.A01 * 10.0f);
        A05 = (int) (C0856Lz.A01 * 24.0f);
        A03 = (int) (C0856Lz.A01 * 30.0f);
        A06 = (int) (C0856Lz.A01 * 30.0f);
        A04 = (int) (C0856Lz.A01 * 50.0f);
    }

    public C1231aI(X2 x2, int i2) {
        super(x2, i2);
        int i3 = A02;
        super.setPadding(i3, 0, i3, 0);
        LinearLayout linearLayout = this.A02;
        int i4 = A02;
        linearLayout.setPadding(i4, i4 / 3, i4, i4 / 3);
        this.A03.setTextSize(13.0f);
        TextView textView = this.A03;
        int i5 = A02;
        textView.setPadding(i5 / 4, i5 / 2, i5 / 4, i5 / 2);
        this.A03.setTextColor(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        int i6 = A06;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i6, i6);
        layoutParams2.gravity = 16;
        C0905Nx c0905Nx = this.A04;
        int i7 = A02;
        c0905Nx.setPadding(i7 / 3, i7 / 3, i7 / 3, i7 / 3);
        this.A04.A02(C2G.A01(-1, 77), -1);
        int i8 = A05;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i8, i8);
        layoutParams3.setMargins(0, 0, 0, 0);
        layoutParams3.gravity = 16;
        this.A01.setPadding(0, 0, 0, 0);
        super.removeAllViews();
        super.addView(this.A02, layoutParams);
        this.A02.removeAllViews();
        this.A02.addView(this.A04, layoutParams2);
        this.A02.addView(this.A03, layoutParams);
        this.A02.addView(this.A01, layoutParams3);
        setToolbarActionMode(i2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A04);
        gradientDrawable.setColor(i2);
        C0856Lz.A0W(this.A02, gradientDrawable);
    }

    @Override // com.facebook.ads.redexgen.X.C0870Mo
    public void setToolbarActionMode(int i2) {
        M7 m7;
        this.A00 = i2;
        this.A04.setVisibility(i2 == 2 ? 0 : 8);
        this.A01.setVisibility(i2 == 2 ? 8 : 0);
        setVisibility(0);
        if (i2 == 0) {
            m7 = M7.CROSS_APP_INSTALL;
            LinearLayout linearLayout = this.A02;
            int i3 = A02;
            linearLayout.setPadding(i3 / 3, i3 / 3, i3 / 3, i3 / 3);
            ViewGroup.LayoutParams layoutParams = this.A01.getLayoutParams();
            if (layoutParams != null) {
                int i4 = A03;
                layoutParams.height = i4;
                layoutParams.width = i4;
                this.A01.setLayoutParams(layoutParams);
            }
            this.A03.setVisibility(8);
        } else {
            if (A01[6].charAt(19) != 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[0] = "gbryvxzxWbgdISpi68yKK";
            strArr[0] = "gbryvxzxWbgdISpi68yKK";
            if (i2 != 1) {
                if (i2 != 2) {
                    m7 = M7.CROSS_APP_INSTALL;
                    String[] strArr2 = A01;
                    if (strArr2[2].charAt(9) != strArr2[1].charAt(9)) {
                        String[] strArr3 = A01;
                        strArr3[5] = "UrnokoQiBoDCm04uktVsKTex7gx9vt3n";
                        strArr3[4] = "egtCMqV5BxdQcc2mWmQaAJ5IHSQPeiLw";
                        setVisibility(8);
                    } else {
                        String[] strArr4 = A01;
                        strArr4[6] = "dtJQOcGhcOIZshHIUvOU7iXJcRU71ekd";
                        strArr4[6] = "dtJQOcGhcOIZshHIUvOU7iXJcRU71ekd";
                        setVisibility(8);
                    }
                } else {
                    m7 = M7.CROSS_APP_INSTALL;
                    this.A01.setVisibility(8);
                    this.A03.setVisibility(8);
                }
            } else {
                m7 = M7.SKIP_ARROW_APP_INSTALL;
                this.A03.setVisibility(0);
                setToolbarMessage(A00(0, 4, 106));
            }
        }
        this.A01.setImageBitmap(M8.A00(m7));
        C0856Lz.A0J(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, this.A01);
    }
}

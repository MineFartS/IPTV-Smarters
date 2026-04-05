package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class O6 extends LinearLayout {
    public static String[] A04;
    public static final float A05;
    public static final int A06;
    public static final int A07;
    public boolean A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;

    public static void A00() {
        A04 = new String[]{"lF8IVPZcS3mZAefsIaNZ6E9xMmjOqdH7", "idkW2", "HbWJiF6R60B06srsOI5ot4Pv3KsUxfPN", "7f3O1w3Qg3dv0DYXPvEPDd2nNc", "nnNATfNTHr6hSEkqMWy2MP3i9vksRg0T", "pai30RxYeYeDatKriEp6xPPXjxDmZE6E", "MhBAxeK5XElhMNsb", "N4hTYih9SgQSzhMEA04rsaAJRIerHLwS"};
    }

    static {
        A00();
        A05 = Resources.getSystem().getDisplayMetrics().density;
        float f2 = A05;
        A07 = (int) (6.0f * f2);
        A06 = (int) (f2 * 8.0f);
    }

    public O6(X2 x2, C1H c1h, boolean z, int i2, int i3, int i4) {
        super(x2);
        this.A00 = false;
        setOrientation(1);
        this.A03 = new TextView(x2);
        C0856Lz.A0b(this.A03, true, i2);
        this.A03.setEllipsize(TextUtils.TruncateAt.END);
        this.A03.setLineSpacing(A07, 1.0f);
        this.A02 = new TextView(x2);
        this.A01 = new TextView(x2);
        C0856Lz.A0b(this.A01, false, i3);
        this.A01.setEllipsize(TextUtils.TruncateAt.END);
        this.A01.setLineSpacing(A07, 1.0f);
        addView(this.A03, new LinearLayout.LayoutParams(-1, -2));
        addView(this.A02, new LinearLayout.LayoutParams(-1, -2));
        this.A02.setVisibility(8);
        A01(c1h, z);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i4, 0, 0);
        addView(this.A01, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public O6(X2 x2, C1H c1h, boolean z, boolean z2, boolean z3) {
        int i2 = z2 ? 18 : 22;
        int i3 = z2 ? 14 : 16;
        int i4 = A06;
        this(x2, c1h, z, i2, i3, z3 ? i4 / 2 : i4);
    }

    public final void A01(C1H c1h, boolean z) {
        this.A03.setTextColor(c1h.A06(z));
        this.A02.setTextColor(c1h.A04(z));
        this.A01.setTextColor(c1h.A05(z));
    }

    public final void A02(String str, String str2, @Nullable String str3, boolean z, boolean z2) {
        boolean z3 = !TextUtils.isEmpty(str);
        boolean z4 = !TextUtils.isEmpty(str2);
        TextView textView = this.A03;
        if (!z3) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A02.setText(str3);
        }
        TextView textView2 = this.A01;
        if (!z3) {
            str2 = BuildConfig.FLAVOR;
        }
        textView2.setText(str2);
        if (A04[4].charAt(18) != 'y') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[4] = "cGsHRNQKRzUTXMDBZCyzngEN4Bg1pclE";
        strArr[4] = "cGsHRNQKRzUTXMDBZCyzngEN4Bg1pclE";
        int i2 = 3;
        if (!z3 || !z4) {
            TextView textView3 = this.A03;
            if (z) {
                i2 = 2;
            } else if (z2) {
                i2 = 4;
            }
            textView3.setMaxLines(i2);
            return;
        }
        this.A03.setMaxLines(z ? 1 : 2);
        this.A01.setMaxLines(z ? 1 : z2 ? 3 : 2);
    }

    public TextView getDescriptionTextView() {
        return this.A01;
    }

    public TextView getTitleTextView() {
        return this.A03;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.A00) {
            return;
        }
        boolean z = configuration.orientation == 2;
        this.A03.setTextSize(z ? 18.0f : 22.0f);
        this.A01.setTextSize(z ? 14.0f : 16.0f);
    }

    public void setAlignment(int i2) {
        this.A03.setGravity(i2);
        this.A01.setGravity(i2);
    }

    public void setDescriptionVisibility(int i2) {
        this.A01.setVisibility(i2);
    }

    public void setUseNewLandscapeEndCard(boolean z) {
        this.A00 = z;
    }
}

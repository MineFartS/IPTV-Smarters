package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdError;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0870Mo extends LinearLayout {
    public static String[] A05;
    public static final int A06;
    public static final int A07;
    public int A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final TextView A03;
    public final C0905Nx A04;

    public static void A01() {
        A05 = new String[]{"RdKbZKE5ShqjtspsYuId0BpVT", "jFs6Ox2yxsj", BuildConfig.FLAVOR, "O0DGVMIkWcl", "ZjYxtVw01iwSMNXN0b17Jtyc9gHU9Z2d", "b1LSaO6GQJOSELIr8C99", BuildConfig.FLAVOR, "wukZGaaSm"};
    }

    static {
        A01();
        A06 = (int) (C0856Lz.A01 * 10.0f);
        A07 = (int) (C0856Lz.A01 * 44.0f);
    }

    public C0870Mo(X2 x2, int i2) {
        super(x2);
        this.A01 = new ImageView(x2);
        ImageView imageView = this.A01;
        int i3 = A06;
        imageView.setPadding(i3, i3, i3, i3);
        this.A04 = new C0905Nx(x2);
        this.A04.setProgress(0.0f);
        C0905Nx c0905Nx = this.A04;
        int i4 = A06;
        c0905Nx.setPadding(i4, i4, i4, i4);
        this.A03 = new TextView(x2);
        setOrientation(0);
        this.A02 = new LinearLayout(x2);
        this.A00 = i2;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        int i2 = A07;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
        C0856Lz.A0b(this.A03, true, 16);
        this.A03.setTextColor(-1);
        this.A03.setVisibility(8);
        this.A02.addView(this.A01, layoutParams2);
        this.A02.addView(this.A04, layoutParams2);
        addView(this.A02, layoutParams);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        addView(this.A03, layoutParams3);
    }

    public final boolean A02() {
        return !this.A03.getText().toString().isEmpty();
    }

    public final boolean A03() {
        int i2 = this.A00;
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setColors(int i2) {
        this.A04.A02(C2G.A01(i2, 77), i2);
        this.A01.setColorFilter(i2);
    }

    public void setInitialUnskippableSeconds(int i2) {
        if (i2 > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f2) {
        this.A04.setProgressWithAnimation(f2);
    }

    public void setToolbarActionMode(int i2) {
        M7 m7;
        this.A00 = i2;
        this.A04.setVisibility(i2 == 2 ? 0 : 8);
        this.A01.setVisibility(i2 == 2 ? 8 : 0);
        setVisibility(0);
        if (i2 == 0) {
            m7 = M7.CROSS;
        } else if (i2 == 1) {
            m7 = M7.SKIP_ARROW;
        } else if (i2 == 3) {
            m7 = M7.MINIMIZE_ARROW;
        } else if (i2 != 4) {
            m7 = M7.CROSS;
        } else {
            m7 = M7.CROSS;
            if (A05[4].charAt(13) == 'C') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = BuildConfig.FLAVOR;
            strArr[2] = BuildConfig.FLAVOR;
            this.A01.setVisibility(8);
            setVisibility(8);
        }
        this.A01.setImageBitmap(M8.A00(m7));
        C0856Lz.A0J(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, this.A01);
    }

    public void setToolbarMessage(String str) {
        this.A03.setText(str);
        this.A03.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z) {
        this.A03.setVisibility(z ? 0 : 4);
    }
}

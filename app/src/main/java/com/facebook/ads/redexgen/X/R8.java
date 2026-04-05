package com.facebook.ads.redexgen.X;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class R8 extends O9 {

    @Nullable
    public static R8 A0O;
    public static byte[] A0P;
    public static String[] A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public TextView A09;
    public AnonymousClass16 A0A;
    public NU A0B;
    public NV A0C;

    @Nullable
    public C1153Xo A0D;
    public OD A0E;
    public OM A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final View A0K;
    public final AbstractC03300f A0L;
    public final C0789Jg A0M;
    public final H8 A0N;

    public static String A0B(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0P, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A0P = new byte[]{36};
    }

    public static void A0N() {
        A0Q = new String[]{"E7d9V", "HfiTPdnQE6JsOHdYoOA4lRNnbQ3", "7AVXCU5oRbsgBqmorHmAVCwb6r5tuTQ8", "hoWzaZbN7yXesQFa", "a3ZYa3", "EXUfJIeYYGyfdCGOPOS2l0on83CPH94Z", "MYJwByDzw5bCUSkxw6qgTJ7WJbI", "X3l5ZIwYV4"};
    }

    static {
        A0N();
        A0M();
        A0T = (int) (C0856Lz.A01 * 26.0f);
        A0R = (int) (C0856Lz.A01 * 4.0f);
        A0V = (int) (C0856Lz.A01 * 8.0f);
        A0S = C2G.A01(-1, 77);
        A0U = (int) (C0856Lz.A01 * 12.0f);
        A0O = null;
    }

    public R8(OD od, boolean z) {
        super(od, true);
        this.A01 = 0;
        this.A0G = false;
        this.A0I = false;
        this.A0J = false;
        this.A0E = od;
        this.A0A = this.A0E.A04();
        this.A0M = new C0789Jg(od.A04().A0Q(), od.A06());
        this.A0N = this.A0E.A0A();
        H8 h8 = this.A0N;
        if (h8 != null) {
            C0856Lz.A0N(h8);
        }
        this.A0K = this.A0E.A03();
        this.A0L = C03310g.A01(od.A05(), od.A06(), od.A04().A0Q(), Uri.parse(od.A04().A0M().A0G().A04()), new HashMap(), false, true);
        O7.A00(od.A05(), this, od.A04().A0M().A0E().A07());
        setupLayoutConfiguration(z);
        A0J();
        A0D();
        A0E();
        postDelayed(new C1025Sp(this), 1000L);
    }

    public static R8 A09(OD od, boolean z) {
        R8 r8 = A0O;
        if (r8 == null || !r8.getUrl().equals(od.A04().A0M().A0G().A04())) {
            A0O = new R8(od, z);
        } else {
            R8 r82 = A0O;
            r82.A0E = od;
            r82.A0T(z);
        }
        A0O.A0G();
        A0O.A0F();
        A0O.A0H();
        return A0O;
    }

    private void A0C() {
        C0856Lz.A0M(this.A08);
        this.A08 = new LinearLayout(this.A0E.A05());
        C0856Lz.A0V(this.A08, getAdContextWrapper());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0G ? this.A02 / 4 : this.A02 / 5);
        layoutParams.addRule(12);
        this.A08.setLayoutParams(layoutParams);
        addView(this.A08, 2);
    }

    private void A0D() {
        C0856Lz.A0M(this.A07);
        this.A07 = new LinearLayout(this.A0E.A05());
        this.A07.setOrientation(1);
        C0856Lz.A0N(this.A07);
        A0K();
        this.A07.setBackgroundColor(-1);
        addView(this.A07);
    }

    private void A0E() {
        C0856Lz.A0M(this.A0B);
        this.A0B = new NU(this.A0E.A05());
        C0856Lz.A0N(this.A0B);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0B.setListener(new C1014Se(this));
        this.A0B.setOnTouchListener(new OH(this));
        this.A07.addView(this.A0B, layoutParams);
        C0856Lz.A0M(this.A0C);
        this.A0C = new NV(this.A0E.A05(), null, R.attr.progressBarStyleHorizontal);
        this.A07.addView(this.A0C, new LinearLayout.LayoutParams(-1, A0R));
    }

    private void A0F() {
        View view = this.A0K;
        if (view != null) {
            C0856Lz.A0M(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(O9.A0A, O9.A0A);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(O9.A09, this.A05, O9.A09, O9.A09);
            addView(this.A0K, layoutParams);
        }
    }

    private void A0G() {
        H8 h8 = this.A0N;
        if (h8 != null) {
            C0856Lz.A0M(h8);
            H8 h82 = this.A0N;
            int i2 = A0U;
            h82.setPadding(i2, i2, i2, i2);
            this.A0N.A0A(-1, A0S);
            this.A0N.setTranslationY(0.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0T);
            if (this.A0H) {
                layoutParams.addRule(8, this.A06.getId());
            } else {
                String[] strArr = A0Q;
                if (strArr[3].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0Q;
                strArr2[3] = "zjul6o0OG2Ezis8Q";
                strArr2[0] = "LmcEL";
                layoutParams.addRule(12);
            }
            addView(this.A0N, layoutParams);
        }
    }

    private void A0H() {
        MM mmA08 = this.A0E.A08();
        if (mmA08 == null) {
            return;
        }
        mmA08.setPageDetailsVisible((this.A0H || mmA08.A07()) ? false : true);
    }

    private void A0J() {
        this.A06 = this.A0E.A02();
        C0856Lz.A0M(this.A06);
        C0856Lz.A0N(this.A06);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        addView(this.A06, 1, layoutParams);
        this.A09 = new TextView(this.A0E.A05());
        C0856Lz.A0N(this.A09);
        this.A09.setGravity(17);
        this.A09.setTextColor(getColors().A05(true));
        this.A09.setEllipsize(TextUtils.TruncateAt.END);
        this.A09.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        int i2 = A0V;
        layoutParams2.setMargins(i2, i2 / 2, i2, this.A0N == null ? i2 : A0T);
        addView(this.A09, layoutParams2);
        C0856Lz.A0N(this.A09);
        OD od = this.A0E;
        this.A0F = new OM(od, od.A04().A0M().A0G().A03(), getColors(), new C1021Sl(this));
        C0856Lz.A0J(AdError.NO_FILL_ERROR_CODE, this.A0F);
        addView(this.A0F);
        A0L();
        A0C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (this.A03 * 4) / 5);
        if (A0e()) {
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.addRule(12);
            LinearLayout linearLayout = this.A07;
            String[] strArr = A0Q;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Q;
            strArr2[7] = "mOqhFUC5R4";
            strArr2[4] = "x2rQdK";
            linearLayout.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A03 + 1, 0, 0);
        }
        this.A07.setTranslationY(0.0f);
        this.A07.setLayoutParams(layoutParams);
    }

    private void A0L() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0G ? this.A02 / 4 : this.A02 / 5);
        layoutParams.addRule(14);
        String[] strArr = A0Q;
        if (strArr[6].length() == strArr[1].length()) {
            String[] strArr2 = A0Q;
            strArr2[6] = "SHdOplU7mObztTib9yLp7cTgFqT";
            strArr2[1] = "8sjFKcaHqREVec5LNIXiQvlIl9H";
            layoutParams.addRule(2, this.A09.getId());
            layoutParams.setMargins(0, 0, 0, 0);
            this.A0F.setLayoutParams(layoutParams);
            if (!this.A0A.A0f()) {
                C0856Lz.A0M(this.A0F);
                String[] strArr3 = A0Q;
                if (strArr3[6].length() == strArr3[1].length()) {
                    String[] strArr4 = A0Q;
                    strArr4[2] = "bVoeq9MG5etfSqxTxXE6PlzRTEtccpLF";
                    strArr4[2] = "bVoeq9MG5etfSqxTxXE6PlzRTEtccpLF";
                    addView(this.A0F, 3);
                    return;
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(String str) {
        C0856Lz.A0M(this.A0D);
        this.A0D = new C1153Xo(this.A0E.A05(), new RA(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A07.addView(this.A0D, layoutParams);
        this.A0D.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0S(boolean z) {
        ObjectAnimator objectAnimatorOfFloat;
        int i2;
        int i3;
        long j2;
        int i4;
        this.A0H = z;
        postDelayed(new R9(this, z), 250L);
        ObjectAnimator ctaTransAnim = null;
        String strA0B = A0B(0, 1, 39);
        if (z) {
            OM om = this.A0F;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(om, strA0B, om.getY(), this.A03 / 5);
        } else {
            objectAnimatorOfFloat = null;
        }
        LinearLayout linearLayout = this.A07;
        float[] fArr = new float[2];
        fArr[0] = linearLayout.getY();
        int i5 = this.A03;
        if (z) {
            i5 /= 5;
        }
        fArr[1] = i5;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, strA0B, fArr);
        objectAnimatorOfFloat2.setDuration(500L);
        int i6 = (this.A03 / 2) - (this.A01 / 2);
        View view = this.A06;
        float[] fArr2 = new float[2];
        fArr2[0] = view.getY();
        fArr2[1] = (z || this.A0G) ? 0.0f : i6;
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(view, strA0B, fArr2);
        browserTransAnim.setDuration(500L);
        H8 h8 = this.A0N;
        int height = h8 == null ? 0 : h8.getHeight();
        if (z) {
            int i7 = this.A02;
            String[] strArr = A0Q;
            if (strArr[6].length() == strArr[1].length()) {
                String[] strArr2 = A0Q;
                strArr2[7] = "g83HcTndNM";
                strArr2[4] = "KO02it";
                i2 = (i7 / 5) - height;
            }
            throw new RuntimeException();
        }
        i2 = (this.A03 - A0T) - A0V;
        H8 h82 = this.A0N;
        if (h82 != null) {
            float[] fArr3 = new float[2];
            fArr3[0] = h82.getY();
            String[] strArr3 = A0Q;
            if (strArr3[6].length() == strArr3[1].length()) {
                String[] strArr4 = A0Q;
                strArr4[2] = "uMAfPHErUq8gYLqYGWwvrPw2H7I5hxcd";
                strArr4[2] = "uMAfPHErUq8gYLqYGWwvrPw2H7I5hxcd";
                fArr3[1] = i2;
                ctaTransAnim = ObjectAnimator.ofFloat(h82, strA0B, fArr3);
            }
            throw new RuntimeException();
        }
        int[] iArr = new int[2];
        iArr[0] = this.A06.getHeight();
        if (z) {
            i3 = this.A03 / 5;
        } else {
            i3 = this.A01;
        }
        iArr[1] = i3;
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(500L);
        duration.addUpdateListener(new OI(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat2, browserTransAnim, duration);
        if (objectAnimatorOfFloat != null) {
            j2 = 500;
            objectAnimatorOfFloat.setDuration(500L);
            i4 = 1;
            animatorSet.playTogether(objectAnimatorOfFloat);
        } else {
            j2 = 500;
            i4 = 1;
        }
        if (ctaTransAnim != null) {
            ctaTransAnim.setDuration(j2);
            Animator[] animatorArr = new Animator[i4];
            animatorArr[0] = ctaTransAnim;
            animatorSet.playTogether(animatorArr);
        }
        animatorSet.addListener(new OJ(this, z));
        animatorSet.start();
    }

    private void A0T(boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z);
        C0856Lz.A0M(this.A06);
        this.A06 = this.A0E.A02();
        C0856Lz.A0N(this.A06);
        if (this.A0H) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A03 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0D();
            A0E();
        }
        this.A06.setTranslationY(0.0f);
        String[] strArr = A0Q;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Q;
        strArr2[7] = "FZuJEB1DgE";
        strArr2[4] = "ioAK5D";
        addView(this.A06, 1, layoutParams);
        A0C();
        A0L();
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void A0W() {
        super.A0W();
        A0O = null;
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void A0X() {
        MM mmA08 = this.A0E.A08();
        if (mmA08 == null) {
            return;
        }
        mmA08.setPageDetailsVisible((A0e() || mmA08.A07()) ? false : true);
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void A0Y() {
        if (this.A0E.A08() != null) {
            MM mmA08 = this.A0E.A08();
            String[] strArr = A0Q;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Q;
            strArr2[3] = "MMiJw7TNUivh7iTB";
            strArr2[0] = "GEB80";
            mmA08.setPageDetailsVisible(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void A0Z() {
        this.A0J = false;
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void A0a() {
        this.A0J = true;
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void A0b(AnonymousClass19 anonymousClass19, String str, double d2, @Nullable Bundle bundle) {
        super.A0b(anonymousClass19, str, d2, bundle);
        String strA05 = anonymousClass19.A0F().A05();
        if (strA05 == null || strA05.trim().length() == 0) {
            C0856Lz.A0Q(this.A08, 8);
        } else {
            this.A09.setText(strA05);
        }
        if (d2 > 0.0d) {
            this.A01 = (int) (((double) this.A04) / d2);
        }
        this.A01 = this.A0G ? this.A02 : this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final boolean A0c() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final boolean A0d(boolean z) {
        if (!A0e()) {
            return false;
        }
        A0S(false);
        return true;
    }

    public final boolean A0e() {
        return this.A0H;
    }

    @Override // com.facebook.ads.redexgen.X.O9
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        if (A0e()) {
            return 3;
        }
        if (this.A0J) {
            return 2;
        }
        return super.getCloseButtonStyle();
    }

    private String getUrl() {
        return this.A0E.A04().A0M().A0G().A04();
    }

    @Override // com.facebook.ads.redexgen.X.O9, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0A.A0f()) {
            A09(this.A0E, A0e());
        }
        setupLayoutConfiguration(A0e());
        A0K();
    }

    private void setupLayoutConfiguration(boolean z) {
        this.A0G = getResources().getConfiguration().orientation == 2;
        this.A05 = this.A0E.A08() == null ? 0 : this.A0E.A08().getToolbarHeight();
        this.A0H = z;
        this.A02 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A04 = Resources.getSystem().getDisplayMetrics().widthPixels;
        this.A03 = this.A02 + (this.A0G ? 0 : this.A05);
        if (this.A0A.A0f()) {
            this.A01 = this.A02;
        }
    }
}

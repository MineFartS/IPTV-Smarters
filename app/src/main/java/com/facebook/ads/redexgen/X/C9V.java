package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9V, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9V extends X4 implements InterfaceC0868Ml {
    public static byte[] A0D;
    public static String[] A0E;

    @Nullable
    public View A00;
    public View A01;

    @Nullable
    public ImageView A02;
    public X2 A03;

    @Nullable
    public MM A04;
    public C0931Oy A05;

    @Nullable
    public GZ A06;
    public boolean A07;
    public final FrameLayout A08;
    public final MR A09;
    public final C0854Lx A0A;
    public final H8 A0B;
    public final AtomicBoolean A0C;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0D = new byte[]{-53, -60, -39, -56, -30, -42, -41, -60, -43, -41, -52, -47, -54, -30, -60, -47, -52, -48, -60, -41, -52, -46, -47, -42, -30, -45, -49, -60, -36, -56, -57, -51, -48, -44, -58, -32, -45, -58, -40, -62, -45, -59, -32, -44, -60, -45, -58, -58, -49, -32, -44, -55, -48, -40, -49, -53, -75, -57, -45, -71, -62, -72, -45, -73, -75, -58, -72, -45, -57, -68, -61, -53, -62, -86, -74, -76, 117, -83, -88, -86, -84, -87, -74, -74, -78, 117, -88, -85, -70, 117, -80, -75, -69, -84, -71, -70, -69, -80, -69, -80, -88, -77, 117, -83, -80, -75, -80, -70, -81, -90, -88, -86, -69, -80, -67, -80, -69, -64};
    }

    public static void A0F() {
        A0E = new String[]{"QUFYIN7o4MSHfMbcaqgxGqdg8oING", "Qixa92rp7KQSHPhBId3L5m9SXc6gxNRP", "TUKhftCqFUFv9xNbjbPA3CLhBIkdW", "aNiMBj1VMT3xct4Co4hWzqTsg", "QYSCqyZ4CS", "VjIbmM2G6pRRrYhuKIf6SOzC6eQUF7eo", "KFJXOgKoK7JNlCBWMf", "dachHr6cLZKwbIDqTeRsc0FgbmZCJ"};
    }

    static {
        A0F();
        A0E();
    }

    public C9V(OD od) {
        super(od, false);
        this.A0C = new AtomicBoolean(false);
        this.A07 = false;
        this.A03 = od.A05();
        this.A04 = od.A08();
        this.A01 = new View(this.A03);
        C0856Lz.A0N(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A09();
        this.A09 = od.A09();
        O7.A00(od.A05(), this, getAdInfo().A0E().A07());
        this.A0A = A02(od);
        getAdDetailsView().bringToFront();
        this.A0B = A04(od);
        A0f();
        this.A05 = new C0931Oy(this.A03, od.A06(), getAdDataBundle());
        this.A08 = new FrameLayout(getContext());
        if (!JT.A1O(this.A03)) {
            A07();
        }
    }

    private C0854Lx A02(OD od) {
        C0854Lx c0854Lx = (C0854Lx) od.A02();
        int iA0e = A0e(od.A08());
        ImageView imageView = (ImageView) od.A03();
        imageView.setPadding(X4.A0D, X4.A0D, X4.A0D, X4.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(X4.A0E, X4.A0E);
        layoutParams.setMargins(0, iA0e, X4.A0C, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        if (JT.A1K(this.A03)) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            AbstractC0900Ns adDetailsView = getAdDetailsView();
            RelativeLayout.LayoutParams simpleVideoViewParams = adDetailsView.A0C(this.A01);
            adDetailsView.setLayoutParams(simpleVideoViewParams);
            if (getResources().getConfiguration().orientation == 1) {
                layoutParams2.addRule(13);
            } else {
                layoutParams2.addRule(0, this.A01.getId());
                layoutParams2.setMargins(0, 0, 0, 0);
            }
            this.A02 = imageView;
            addView(c0854Lx, layoutParams2);
            addView(imageView, layoutParams);
        } else {
            RelativeLayout.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
            videoViewParams.addRule(13);
            addView(c0854Lx, videoViewParams);
            c0854Lx.addView(imageView, layoutParams);
        }
        return c0854Lx;
    }

    private H8 A04(OD od) {
        H8 h8A0A = od.A0A();
        h8A0A.A0A(-1, X4.A09);
        if (JT.A1K(this.A03)) {
            if (getResources().getConfiguration().orientation == 1) {
                setUpPortraitAdDetails(h8A0A);
            } else {
                setUpLandscapeAdDetails(h8A0A);
            }
        } else {
            h8A0A.setPadding(X4.A0H, X4.A0H, X4.A0H, X4.A0H);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, X4.A0G);
            layoutParams.addRule(12);
            addView(h8A0A, layoutParams);
        }
        return h8A0A;
    }

    private void A07() {
        String title;
        RewardData rewardDataA0K = getAdDataBundle().A0K();
        if (rewardDataA0K == null) {
            title = getAdDataBundle().A0N().A06();
        } else {
            title = getAdDataBundle().A0N().A07(rewardDataA0K.getCurrency(), rewardDataA0K.getQuantity());
        }
        C0857Ma c0857Ma = new C0857Ma(getAdContextWrapper(), -1, DefaultRenderer.BACKGROUND_COLOR, title, null, getAdDataBundle().A0N().A05(), getAdDataBundle().A0N().A04(), M8.A00(M7.REWARD_ICON));
        c0857Ma.A02.setOnClickListener(new OE(this));
        c0857Ma.A01.setOnClickListener(new OF(this));
        this.A08.addView(c0857Ma, new RelativeLayout.LayoutParams(-1, -1));
    }

    private void A08() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0F();
            this.A0A.A0a(getAnimationPlugin());
        }
    }

    private void A09() {
        MM mm = this.A04;
        if (mm == null) {
            return;
        }
        this.A06 = new GZ(mm, 400, -mm.getToolbarHeight(), 0);
    }

    private void A0A() {
        new C0789Jg(getAdDataBundle().A0Q(), getAdEventManager()).A03(EnumC0788Jf.A0n, null);
        if (!getAdInfo().A0N()) {
            return;
        }
        this.A0C.set(true);
        C0856Lz.A0X(this);
        C0856Lz.A0K(this.A0A);
        C0856Lz.A0d(this.A0A, this.A0B, this.A08, this.A00);
        C0856Lz.A0O(this.A04);
        C0931Oy c0931Oy = this.A05;
        XD ctaButton = getCtaButton();
        String[] strArr = A0E;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        strArr2[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        Pair<EnumC0930Ox, View> pairA03 = c0931Oy.A03(ctaButton);
        this.A00 = (View) pairA03.second;
        int i2 = OG.A00[((EnumC0930Ox) pairA03.first).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            C0856Lz.A0d(getAdDetailsView());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(X4.A0F, X4.A0F, X4.A0F, X4.A0F);
            addView(this.A00, layoutParams);
            return;
        }
        getAdDetailsView().setVisibility(0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if (JT.A1K(this.A03)) {
            ImageView imageView = this.A02;
            if (imageView != null) {
                String[] strArr3 = A0E;
                if (strArr3[2].length() != strArr3[0].length()) {
                    String[] strArr4 = A0E;
                    strArr4[7] = "RenllHEOEhUEXuJGVHYKXOkiOEbWR";
                    strArr4[4] = "Ez9H6xpGZ9";
                    imageView.setVisibility(8);
                } else {
                    String[] strArr5 = A0E;
                    strArr5[2] = "KicgKgsrHX1lzbvbA0fubHpFySDNt";
                    strArr5[0] = "T8uqPR7oq7Ja3xFAu7WdainZogpwN";
                    imageView.setVisibility(8);
                }
            }
            getAdDetailsView().setLayoutParams(getAdDetailsView().A0B(this.A01));
            if (getResources().getConfiguration().orientation == 1) {
                layoutParams2.setMargins(0, A0e(this.A04), 0, O9.A09);
                layoutParams2.addRule(2, getAdDetailsView().getId());
            } else {
                layoutParams2.setMargins(0, O9.A09, 0, O9.A09);
                layoutParams2.addRule(0, this.A01.getId());
            }
        } else {
            layoutParams2.setMargins(0, A0e(this.A04), 0, 0);
            layoutParams2.addRule(2, getAdDetailsView().getId());
        }
        addView(this.A00, layoutParams2);
    }

    private void A0B() {
        MM mm;
        if (!this.A0A.A0g()) {
            this.A0A.A0c(false, false, 11);
        }
        if (JT.A1O(this.A03) && (mm = this.A04) != null) {
            mm.A06(this);
        } else {
            MM mm2 = this.A04;
            if (mm2 != null) {
                C0856Lz.A0K(mm2);
            }
            C0856Lz.A0Q(this.A0A, 4);
            C0856Lz.A0Q(this.A0B, 4);
            C0856Lz.A0Q(getAdDetailsView(), 4);
            addView(this.A08, new RelativeLayout.LayoutParams(-1, -1));
        }
        this.A07 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        if (getAdInfo().A0N()) {
            this.A0A.A0X(P9.A05);
            return;
        }
        MR mr = this.A09;
        if (A0E[3].length() != 25) {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[1] = "Zliat4mU5XNL19AyOd3jcD22cYPYEARz";
        strArr[1] = "Zliat4mU5XNL19AyOd3jcD22cYPYEARz";
        mr.A3s(A06(73, 45, 58));
    }

    private void A0D() {
        GZ gz = this.A06;
        if (gz != null) {
            gz.A3O(true, false);
        }
        if (getAdDetailsAnimation() != null) {
            getAdDetailsAnimation().A3O(true, false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void A0K(C7q c7q) {
        super.A0K(c7q);
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void A0L(C05127n c05127n) {
        super.A0L(c05127n);
        int duration = this.A0A.getDuration() - c05127n.A00();
        if (getAnimationPlugin() != null) {
            int remainingVideoTimeInMillis = A0E[1].charAt(18);
            if (remainingVideoTimeInMillis != 51) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            strArr[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            if (duration < 3000 && getAnimationPlugin().A0K()) {
                getAnimationPlugin().A0G();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void A0W() {
        super.A0W();
        A08();
        this.A04 = null;
    }

    @Override // com.facebook.ads.redexgen.X.X4, com.facebook.ads.redexgen.X.O9
    public final void A0b(AnonymousClass19 anonymousClass19, String str, double d2, @Nullable Bundle bundle) {
        super.A0b(anonymousClass19, str, d2, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A06(0, 31, 118), false)) {
            A0D();
        }
        if (bundle.getBoolean(A06(55, 18, 103), false)) {
            A0A();
        }
        if (bundle.getBoolean(A06(31, 24, 116), false)) {
            A0B();
        }
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final boolean A0c() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    @Override // com.facebook.ads.redexgen.X.O9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0d(boolean r6) {
        /*
            r5 = this;
            r4 = 1
            if (r6 == 0) goto L31
            boolean r0 = r5.A07
            if (r0 != 0) goto L31
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0C
            boolean r3 = r0.get()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C9V.A0E
            r0 = 7
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L68
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C9V.A0E
            java.lang.String r1 = "IfEmWBIDBUNw5tL7YhS4lNzldGhzw"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "8CoNQoXVMdzgwU1krh95bRLsSKKH4"
            r0 = 0
            r2[r0] = r1
            if (r3 != 0) goto L31
            r5.A0B()
            return r4
        L31:
            com.facebook.ads.redexgen.X.19 r0 = r5.getAdInfo()
            boolean r3 = r0.A0N()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C9V.A0E
            r0 = 5
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 107(0x6b, float:1.5E-43)
            if (r1 == r0) goto L68
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C9V.A0E
            java.lang.String r1 = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor"
            r0 = 1
            r2[r0] = r1
            if (r3 == 0) goto L66
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0C
            boolean r0 = r0.get()
            if (r0 != 0) goto L66
            com.facebook.ads.redexgen.X.Lx r1 = r5.A0A
            com.facebook.ads.redexgen.X.P9 r0 = com.facebook.ads.redexgen.X.P9.A06
            r1.A0X(r0)
            return r4
        L66:
            r0 = 0
            return r0
        L68:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C9V.A0d(boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.X4
    public final void A0f() {
        super.A0f();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A7w(this.A0A);
        }
    }

    public final boolean A0g() {
        return getAdInfo().A0N();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0868Ml
    public final void A8s() {
        this.A07 = false;
        this.A0A.A0Y(PD.A03, 15);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0868Ml
    public final void A8t() {
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.O9
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        if (A0g() && !this.A0C.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.X.X4, com.facebook.ads.redexgen.X.O9, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (JT.A1K(this.A03)) {
            boolean z = configuration.orientation == 1;
            if (!this.A0C.get()) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                if (z) {
                    setUpPortraitAdDetails(this.A0B);
                    layoutParams.addRule(13);
                } else {
                    setUpLandscapeAdDetails(this.A0B);
                    layoutParams.addRule(0, this.A01.getId());
                    layoutParams.setMargins(0, 0, 0, 0);
                }
                C0854Lx c0854Lx = this.A0A;
                String[] strArr = A0E;
                if (strArr[7].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[1] = "DO7In235juv9PXUKV934zSaX5akZYCRG";
                strArr2[1] = "DO7In235juv9PXUKV934zSaX5akZYCRG";
                c0854Lx.setLayoutParams(layoutParams);
                return;
            }
            if (this.A00 == null) {
                return;
            }
            ImageView imageView = this.A02;
            if (A0E[5].charAt(17) == 'k') {
                throw new RuntimeException();
            }
            String[] strArr3 = A0E;
            strArr3[5] = "g7uXpIwsYCOJvIzf4Zz9qplJQO82wATZ";
            strArr3[5] = "g7uXpIwsYCOJvIzf4Zz9qplJQO82wATZ";
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            getAdDetailsView().setVisibility(0);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            getAdDetailsView().setLayoutParams(getAdDetailsView().A0B(this.A01));
            if (z) {
                layoutParams2.setMargins(0, A0e(this.A04), 0, O9.A09);
                layoutParams2.addRule(2, getAdDetailsView().getId());
            } else {
                layoutParams2.setMargins(0, O9.A09, 0, O9.A09);
                layoutParams2.addRule(0, this.A01.getId());
            }
            this.A00.setLayoutParams(layoutParams2);
        }
    }

    private void setUpLandscapeAdDetails(H8 h8) {
        getAdDetailsView().removeAllViews();
        removeView(h8);
        getAdDetailsView().setLayoutParams(getAdDetailsView().A0C(this.A01));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C1234aL.A0G);
        layoutParams.addRule(12);
        addView(h8, layoutParams);
    }

    private void setUpPortraitAdDetails(H8 h8) {
        getAdDetailsView().removeAllViews();
        removeView(h8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C1234aL.A0H);
        layoutParams.setMargins(0, 0, 0, C1234aL.A0I);
        getAdDetailsView().addView(h8, layoutParams);
        getAdDetailsView().setLayoutParams(getAdDetailsView().A0C(this.A01));
    }
}

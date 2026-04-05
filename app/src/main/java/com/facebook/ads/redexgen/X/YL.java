package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardData;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.achartengine.renderer.DefaultRenderer;
import org.joda.time.DateTimeFieldType;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YL extends RelativeLayout implements MS, InterfaceC0868Ml {
    public static byte[] A0j;
    public static String[] A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final RelativeLayout.LayoutParams A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public static final int A0w;
    public int A00;
    public int A01;

    @Nullable
    public View A02;
    public View A03;

    @Nullable
    public MM A04;

    @Nullable
    public MR A05;

    @Nullable
    public AbstractC0900Ns A06;
    public C0931Oy A07;
    public C0932Oz A08;

    @Nullable
    public C0854Lx A09;

    @Nullable
    public PD A0A;
    public I3 A0B;

    @Nullable
    public C0745Hn A0C;

    @Nullable
    public AnonymousClass76 A0D;

    @Nullable
    public H2 A0E;
    public GZ A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final int A0K;
    public final Handler A0L;
    public final Handler A0M;
    public final RelativeLayout A0N;
    public final C1H A0O;
    public final C0997Rm A0P;
    public final InterfaceC04464u A0Q;
    public final X2 A0R;
    public final JZ A0S;
    public final C0789Jg A0T;
    public final ViewOnSystemUiVisibilityChangeListenerC0844Ln A0U;
    public final C0849Ls A0V;
    public final C7r A0W;
    public final KQ A0X;
    public final KO A0Y;
    public final KE A0Z;
    public final AbstractC0787Je A0a;
    public final AbstractC0785Jc A0b;
    public final C0743Hk A0c;
    public final H8 A0d;

    @DoNotStrip
    public final Q1 A0e;
    public final Q2 A0f;
    public final AtomicBoolean A0g;
    public final boolean A0h;
    public final boolean A0i;

    public static String A0F(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0j, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0S() {
        A0j = new byte[]{29, DateTimeFieldType.CLOCKHOUR_OF_DAY, 11, 12, DateTimeFieldType.MILLIS_OF_DAY};
    }

    public static void A0T() {
        A0k = new String[]{"vsdEBwVgd8xuD4acIyCMTbEVgnYoxSzn", "ksTg5", "PS2LqNPtHz7Bj2TqhJ7TZjs4LL9ATMRr", "qSNvo2HWKXxTUkx77WQBoFZa4uZWek8Z", "kV", "kWwRq1ENXLXBTFEhopAwPvilnneCtOoi", "1j3TsCoxoqnujqaJP1b9vcmgNjtc01PK", "DySaXvgrVXG8E60xfPO0YxcmTr0eS0sa"};
    }

    static {
        A0T();
        A0S();
        A0n = (int) (C0856Lz.A01 * 10.0f);
        A0o = (int) (C0856Lz.A01 * 18.0f);
        A0q = (int) (C0856Lz.A01 * 16.0f);
        A0m = (int) (C0856Lz.A01 * 48.0f);
        A0p = (int) (C0856Lz.A01 * 28.0f);
        A0l = (int) (C0856Lz.A01 * 250.0f);
        A0w = (int) (C0856Lz.A01 * 12.0f);
        A0v = (int) (C0856Lz.A01 * 26.0f);
        A0s = (int) (C0856Lz.A01 * 4.0f);
        A0t = C2G.A01(-1, 77);
        A0u = C2G.A01(A0t, 90);
        A0r = new RelativeLayout.LayoutParams(-1, -1);
    }

    public YL(X2 x2, JZ jz, C0854Lx c0854Lx, MR mr, C0997Rm c0997Rm) {
        super(x2);
        this.A0L = new Handler(Looper.getMainLooper());
        this.A0Q = new YT(this);
        this.A0X = new KQ() { // from class: com.facebook.ads.redexgen.X.9n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(C7q c7q) {
                this.A00.A0d(c7q);
            }
        };
        this.A0Y = new KO() { // from class: com.facebook.ads.redexgen.X.9m
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i2, int i3, int i4) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                    bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 4);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{-108, -89, -94, -93, -83, -114, -86, -97, -73, -128, -97, -95, -87, -125, -80, -80, -83, -80};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A04(KP kp) {
                this.A00.A0e(A00(0, 18, 58));
            }
        };
        this.A0a = new AbstractC0787Je() { // from class: com.facebook.ads.redexgen.X.9l
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(K5 k5) {
                if (this.A00.A09 == null) {
                    return;
                }
                this.A00.A0G = true;
                if (!this.A00.A0P.A0M().A0O()) {
                    this.A00.A0P();
                }
                this.A00.A0g.set(this.A00.A09.A0d());
                this.A00.A0R();
            }
        };
        this.A0Z = new KE() { // from class: com.facebook.ads.redexgen.X.9k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(KJ kj) {
                if (this.A00.A0J) {
                    return;
                }
                this.A00.A0f.A0W();
                this.A00.A0J = true;
            }
        };
        this.A0b = new C05539j(this);
        this.A0V = new C0849Ls();
        this.A0g = new AtomicBoolean(false);
        this.A0M = new Handler();
        this.A0I = false;
        this.A0H = false;
        this.A0G = false;
        this.A0J = false;
        this.A01 = -1;
        this.A0R = x2;
        this.A0h = false;
        this.A0i = JT.A1d(this.A0R);
        this.A05 = mr;
        this.A0S = jz;
        this.A0P = c0997Rm;
        this.A0T = new C0789Jg(this.A0P.A0Q(), this.A0S);
        this.A09 = c0854Lx;
        this.A09.setFunnelLoggingHandler(this.A0T);
        this.A0O = this.A0P.A0L().A01();
        this.A0N = new RelativeLayout(x2);
        this.A0d = new H8(this.A0R);
        this.A0c = new C0743Hk(this.A0R, this.A0T);
        C1C c1cA0E = this.A0P.A0M().A0E();
        this.A0K = Math.min(c1cA0E.A02(), c1cA0E.A04());
        this.A09.setVolume(c1cA0E.A09() ? 0.0f : 1.0f);
        this.A03 = new View(this.A0R);
        C0856Lz.A0N(this.A03);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        this.A03.setLayoutParams(layoutParams);
        this.A0e = new YQ(this);
        this.A0f = new Q2(this, 1, new WeakReference(this.A0e), x2);
        this.A0f.A0Y(250);
        this.A0W = new C7r(this.A0R, this.A0S, this.A09, this.A0P.A0Q());
        this.A07 = new C0931Oy(this.A0R, this.A0S, this.A0P);
        this.A08 = new C0932Oz(this.A0R, new C1164Xz(), this.A0P.A0V(), this.A05);
        new XE(this, x2).A08(c1cA0E.A07());
        this.A09.setVideoProgressReportIntervalMs(c0997Rm.A0F());
        this.A09.getEventBus().A04(this.A0X, this.A0Y, this.A0a, this.A0Z, this.A0b);
        x2.A0A().A2q();
        this.A0U = new ViewOnSystemUiVisibilityChangeListenerC0844Ln(this);
        this.A0U.A05(EnumC0843Lm.A03);
    }

    private void A0H() {
        X2 x2 = this.A0R;
        if (x2 == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(x2);
        frameLayout.setLayoutParams(A0r);
        C0856Lz.A0P(frameLayout, 1711276032);
        this.A0N.addView(frameLayout, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        MR mr = this.A05;
        if (mr == null) {
            return;
        }
        mr.A3s(PF.A08.A02());
    }

    private void A0J() {
        AbstractC0900Ns abstractC0900Ns = this.A06;
        if (abstractC0900Ns != null) {
            abstractC0900Ns.removeAllViews();
            this.A0N.removeView(this.A0d);
            AbstractC0900Ns abstractC0900Ns2 = this.A06;
            abstractC0900Ns2.setLayoutParams(abstractC0900Ns2.A0C(this.A03));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C1234aL.A0G);
            layoutParams.addRule(12);
            this.A0N.addView(this.A0d, layoutParams);
        }
    }

    private void A0K() {
        AbstractC0900Ns abstractC0900Ns = this.A06;
        if (abstractC0900Ns != null) {
            abstractC0900Ns.removeAllViews();
            this.A0N.removeView(this.A0d);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C1234aL.A0H);
            layoutParams.setMargins(0, 0, 0, C1234aL.A0I);
            this.A06.addView(this.A0d, layoutParams);
            AbstractC0900Ns abstractC0900Ns2 = this.A06;
            abstractC0900Ns2.setLayoutParams(abstractC0900Ns2.A0C(this.A03));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        this.A0I = true;
        C0856Lz.A0X(this.A0N);
        C0854Lx c0854Lx = this.A09;
        if (c0854Lx != null) {
            c0854Lx.A0U();
            this.A09.setVisibility(4);
        }
        MM mm = this.A04;
        if (mm == null) {
            return;
        }
        mm.setPageDetailsVisible(false);
        this.A04.setToolbarActionMode(0);
        this.A04.setToolbarActionMessage(A0F(0, 0, 87));
        C0856Lz.A0d(this.A09, this.A0c, this.A0d);
        Pair<EnumC0930Ox, View> pairA03 = this.A07.A03(getCTAButton());
        this.A02 = (View) pairA03.second;
        int i2 = C0863Mg.A00[((EnumC0930Ox) pairA03.first).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            C0856Lz.A0d(this.A06);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            int i3 = A0q;
            layoutParams.setMargins(i3, i3, i3, i3);
            this.A0N.addView((View) pairA03.second, layoutParams);
            this.A0V.A06();
            return;
        }
        if (JT.A1K(this.A0R) && this.A06 != null) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            AbstractC0900Ns abstractC0900Ns = this.A06;
            RelativeLayout.LayoutParams screenshotParams = abstractC0900Ns.A0B(this.A03);
            abstractC0900Ns.setLayoutParams(screenshotParams);
            if (getResources().getConfiguration().orientation == 1) {
                layoutParams2.setMargins(0, this.A04.getToolbarHeight(), 0, A0n);
                layoutParams2.addRule(2, this.A06.getId());
            } else {
                int i4 = A0n;
                layoutParams2.setMargins(0, i4, 0, i4);
                layoutParams2.addRule(0, this.A03.getId());
            }
            this.A0N.addView((View) pairA03.second, layoutParams2);
        } else if (!this.A0i) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams3.setMargins(0, this.A04.getToolbarHeight(), 0, 0);
            this.A0N.addView((View) pairA03.second, layoutParams3);
            AbstractC0900Ns abstractC0900Ns2 = this.A06;
            if (abstractC0900Ns2 != null) {
                int id = abstractC0900Ns2.getId();
                if (A0k[4].length() != 2) {
                    throw new RuntimeException();
                }
                String[] strArr = A0k;
                strArr[2] = "unAGmyqFwvprojiFSqdEJubKYqzfvtr5";
                strArr[2] = "unAGmyqFwvprojiFSqdEJubKYqzfvtr5";
                layoutParams3.addRule(2, id);
            }
        } else {
            this.A0N.addView((View) pairA03.second);
        }
        AbstractC0900Ns abstractC0900Ns3 = this.A06;
        if (abstractC0900Ns3 != null) {
            abstractC0900Ns3.setVisibility(0);
            this.A06.A0E(true);
        }
        A0Q();
        this.A0V.A06();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0M() {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.YL.A0M():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        String strA07;
        if (JT.A1O(this.A0R)) {
            this.A04.A06(this);
            return;
        }
        RewardData rewardDataA0K = this.A0P.A0K();
        if (rewardDataA0K == null) {
            strA07 = this.A0P.A0N().A06();
        } else {
            strA07 = this.A0P.A0N().A07(rewardDataA0K.getCurrency(), rewardDataA0K.getQuantity());
        }
        C0857Ma c0857Ma = new C0857Ma(this.A0R, -1, DefaultRenderer.BACKGROUND_COLOR, strA07, null, this.A0P.A0N().A05(), this.A0P.A0N().A04(), M8.A00(M7.REWARD_ICON));
        c0857Ma.A02.setOnClickListener(new ViewOnClickListenerC0861Me(this, c0857Ma));
        c0857Ma.A01.setOnClickListener(new ViewOnClickListenerC0862Mf(this, c0857Ma));
        C0856Lz.A0K(this.A0N);
        C0856Lz.A0K(this.A04);
        C0856Lz.A0P(c0857Ma, 1711276032);
        c0857Ma.setClickable(true);
        C0854Lx c0854Lx = this.A09;
        if (c0854Lx != null && !c0854Lx.A0g()) {
            this.A09.A0c(false, false, 16);
        }
        addView(c0857Ma, new RelativeLayout.LayoutParams(-1, -1));
        c0857Ma.bringToFront();
    }

    private void A0O() {
        if (this.A0P.A0M().A0O() && this.A05 != null) {
            C0910Oc c0910OcA0B = new C0908Oa(this.A0R, this.A0P.A0M().A0F(), this.A0P.A0O()).A08(this.A0P.A0L().A01()).A0B();
            C0791Ji.A04(c0910OcA0B, this.A0T, EnumC0788Jf.A0U);
            this.A05.A3K(c0910OcA0B, 1, A0r);
            c0910OcA0B.bringToFront();
            c0910OcA0B.A04(new YM(this));
            this.A0R.A0A().A2b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P() {
        C0854Lx c0854Lx = this.A09;
        if (c0854Lx == null) {
            return;
        }
        c0854Lx.A0Y(PD.A03, 22);
        postDelayed(new YV(this), JT.A0H(getContext()));
    }

    private void A0Q() {
        C0931Oy c0931Oy;
        if (this.A0i && this.A02 != null && (c0931Oy = this.A07) != null && c0931Oy.A04() == EnumC0930Ox.A04) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            boolean z = this.A00 == 2;
            layoutParams.setMargins(0, !z ? getToolbarHeight() : A0n, 0, !z ? 0 : A0n);
            O4 o4 = (O4) ((C0660Eb) this.A02).getAdapter();
            o4.A08();
            int i2 = this.A00;
            boolean isLandscape = this.A0i;
            o4.A0G(i2, isLandscape);
            AbstractC0900Ns abstractC0900Ns = this.A06;
            if (abstractC0900Ns != null) {
                if (z) {
                    abstractC0900Ns.A0D(this.A00);
                } else {
                    int id = abstractC0900Ns.getId();
                    String[] strArr = A0k;
                    if (strArr[5].charAt(31) == strArr[3].charAt(31)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0k;
                    strArr2[0] = "LwDo8VVUwsuJrlNU8QrzJ41vhXhK4VzE";
                    strArr2[7] = "9aOkUkxqZvQgWgLWjLrmfK9aYM0kVuqh";
                    layoutParams.addRule(2, id);
                }
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(!z ? -1 : A0l, z ? -1 : -2);
                layoutParams2.addRule(12);
                AbstractC0900Ns abstractC0900Ns2 = this.A06;
                int i3 = A0q;
                int toolbarHeight = !z ? i3 : getToolbarHeight() + i3;
                int i4 = A0q;
                abstractC0900Ns2.setPadding(i3, toolbarHeight, i4, i4);
                this.A06.setLayoutParams(layoutParams2);
            }
            this.A02.setLayoutParams(layoutParams);
            this.A02.setOverScrollMode(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R() {
        this.A0c.setVisibility(this.A0g.get() ? 0 : 8);
        this.A0c.A0A();
    }

    private final void A0U() {
        if (this.A06 == null) {
            return;
        }
        this.A0B = new I3(true);
        H2 h2 = this.A0E;
        if (h2 != null) {
            this.A0B.A0J(h2);
        }
        C1H c1hA01 = this.A0P.A0L().A01();
        this.A0B.A0J(new C0712Gf(this.A06.getCTAButton(), IjkMediaCodecInfo.RANK_SECURE, c1hA01.A08(true), -14934495));
        this.A0B.A0J(new H3(this.A06.getCTAButton(), IjkMediaCodecInfo.RANK_SECURE, C0856Lz.A09(A0t, A0u, A0s), C0856Lz.A06(c1hA01.A08(true), A0s)));
        this.A0B.A0J(new H1(this.A06.getExpandableLayout(), 150, false));
        this.A0B.A0I(2300);
        this.A0B.A7w(this.A09);
    }

    private final void A0V() {
        C0854Lx c0854Lx = this.A09;
        if (c0854Lx != null) {
            c0854Lx.A0W(2);
            this.A09.A0S();
        }
        Q2 q2 = this.A0f;
        if (q2 != null) {
            q2.A0X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d(C7q c7q) {
        if (this.A0I) {
            return;
        }
        this.A08.A06();
        A0L();
        MR mr = this.A05;
        if (mr != null) {
            mr.A3t(PF.A06.A02(), c7q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0e(String str) {
        this.A0R.A0A().A2r(str);
        int currentPositionInMillis = 0;
        int duration = 0;
        C0854Lx c0854Lx = this.A09;
        if (c0854Lx != null) {
            currentPositionInMillis = c0854Lx.getCurrentPositionInMillis();
            duration = this.A09.getDuration();
        }
        A0V();
        this.A0R.A04().A86(A0F(0, 5, 84), C05228d.A2A, new C05238e(str));
        if (JT.A0v(this.A0R)) {
            A0d(new C7q(currentPositionInMillis, duration));
            return;
        }
        MR mr = this.A05;
        if (mr == null) {
            return;
        }
        mr.A3s(PF.A09.A02());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0f() {
        C0854Lx c0854Lx = this.A09;
        return c0854Lx != null && c0854Lx.getCurrentPositionInMillis() / 1000 >= this.A0P.A0M().A0E().A02();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void A7v(Intent intent, Bundle bundle, C04484w c04484w) {
        if (this.A09 != null) {
            MR mr = this.A05;
            if (A0k[2].charAt(24) == 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A0k;
            strArr[0] = "e6V6RqcsweZ5TPTb9FgQuQ0pryALZ0j5";
            strArr[7] = "lv4Tf42JMHAUVPcypCqljFxIq3tnjr4p";
            if (mr == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 19) {
                this.A0U.A05(EnumC0843Lm.A04);
            }
            A0M();
            c04484w.A0L(this.A0Q);
            this.A09.setVideoURI(new C7C(this.A0R).A0M(this.A0P.A0M().A0E().A08()));
            setUpContentLayoutForVideo(c04484w.A0I().getResources().getConfiguration().orientation);
            addView(this.A0N, A0r);
            MM mm = this.A04;
            if (mm != null) {
                C0856Lz.A0N(mm);
                this.A04.A05(this.A0O, true);
                addView(this.A04, new RelativeLayout.LayoutParams(-1, this.A04.getToolbarHeight()));
            }
            this.A05.A3K(this, 0, A0r);
            A0O();
            postDelayed(new YP(this), JT.A0I(getContext()));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0868Ml
    public final void A8s() {
        C0854Lx c0854Lx = this.A09;
        if (c0854Lx != null) {
            PD pd = PD.A03;
            if (A0k[6].charAt(1) != 'j') {
                throw new RuntimeException();
            }
            String[] strArr = A0k;
            strArr[6] = "Tj2Tj3snk4deQrW2TFaqKUqYHOA0aFA3";
            strArr[6] = "Tj2Tj3snk4deQrW2TFaqKUqYHOA0aFA3";
            c0854Lx.A0Y(pd, 23);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0868Ml
    public final void A8t() {
        A0L();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AAQ(boolean z) {
        C0854Lx c0854Lx = this.A09;
        if (c0854Lx == null || c0854Lx.A0f()) {
            return;
        }
        this.A0A = this.A09.getVideoStartReason();
        this.A0H = z;
        C0854Lx c0854Lx2 = this.A09;
        if (A0k[1].length() != 5) {
            throw new RuntimeException();
        }
        String[] strArr = A0k;
        strArr[4] = "af";
        strArr[4] = "af";
        c0854Lx2.A0b(false, 14);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AAn(boolean z) {
        C0854Lx c0854Lx = this.A09;
        if (c0854Lx == null || c0854Lx.A0g() || this.A0I || this.A09.getState() == EnumC0958Pz.A06 || this.A0A == null) {
            return;
        }
        if (!this.A0H || z) {
            C0854Lx c0854Lx2 = this.A09;
            String[] strArr = A0k;
            if (strArr[0].charAt(9) == strArr[7].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0k;
            strArr2[1] = "7lFur";
            strArr2[1] = "7lFur";
            c0854Lx2.A0Y(this.A0A, 21);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ACj(Bundle bundle) {
    }

    @Nullable
    private XD getCTAButton() {
        if (this.A05 == null) {
            return null;
        }
        XD xd = new XD(this.A0R, PF.A04.A02(), this.A0O, this.A0S, this.A05, this.A0f, this.A0V);
        xd.setRoundedCornersEnabled(true);
        xd.setViewShowsOverMedia(true);
        C0856Lz.A0J(AdError.NO_FILL_ERROR_CODE, xd);
        xd.setCta(this.A0P.A0M().A0G(), this.A0P.A0Q(), new HashMap());
        return xd;
    }

    private int getToolbarHeight() {
        MM mm = this.A04;
        return mm == null ? MM.A00 : mm.getToolbarHeight();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        H2 h2;
        if (JT.A1K(this.A0R) && this.A06 != null) {
            boolean z = configuration.orientation == 1;
            if (this.A02 != null && this.A04 != null) {
                this.A06.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                AbstractC0900Ns abstractC0900Ns = this.A06;
                abstractC0900Ns.setLayoutParams(abstractC0900Ns.A0B(this.A03));
                if (z) {
                    layoutParams.setMargins(0, this.A04.getToolbarHeight(), 0, A0n);
                    layoutParams.addRule(2, this.A06.getId());
                } else {
                    int i2 = A0n;
                    layoutParams.setMargins(0, i2, 0, i2);
                    layoutParams.addRule(0, this.A03.getId());
                }
                this.A02.setLayoutParams(layoutParams);
            } else if (this.A09 != null) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                if (z) {
                    A0K();
                    layoutParams2.addRule(13);
                } else {
                    A0J();
                    layoutParams2.addRule(0, this.A03.getId());
                    layoutParams2.setMargins(0, 0, 0, 0);
                }
                this.A09.setLayoutParams(layoutParams2);
            }
        } else {
            AbstractC0900Ns abstractC0900Ns2 = this.A06;
            if (A0k[1].length() != 5) {
                throw new RuntimeException();
            }
            String[] strArr = A0k;
            strArr[2] = "taNSjGkhdG2DcrPTICkef1XKgKxpKPDd";
            strArr[2] = "taNSjGkhdG2DcrPTICkef1XKgKxpKPDd";
            if (abstractC0900Ns2 != null) {
                abstractC0900Ns2.A0D(configuration.orientation);
                if (this.A0h && (h2 = this.A0E) != null) {
                    h2.A09(this.A06.A09(configuration.orientation));
                }
            }
        }
        this.A00 = configuration.orientation;
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
        this.A0U.A03();
        A0V();
        C0854Lx c0854Lx = this.A09;
        if (c0854Lx != null) {
            c0854Lx.getEventBus().A05(this.A0X, this.A0Y, this.A0a, this.A0Z, this.A0b);
        }
        if (!TextUtils.isEmpty(this.A0P.A0Q())) {
            this.A0S.A84(this.A0P.A0Q(), new C0897Np().A04(this.A0f).A03(this.A0V).A06());
        }
        MM mm = this.A04;
        if (mm != null) {
            mm.setToolbarListener(null);
        }
        this.A0W.A0h();
        this.A09 = null;
        this.A06 = null;
        this.A0C = null;
        this.A05 = null;
        this.A0d.A09();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0V.A07(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        View expandableLayout = this.A06.getExpandableLayout();
        if (expandableLayout != null && this.A0h && z && this.A0E == null) {
            this.A0E = new H2(expandableLayout, IjkMediaCodecInfo.RANK_SECURE, expandableLayout.getHeight(), 0);
            this.A0B.A0J(this.A0E);
            this.A0B.A0H();
        }
    }

    public void setListener(MR mr) {
    }

    @VisibleForTesting
    public void setServerSideRewardHandler(C0932Oz c0932Oz) {
        this.A08 = c0932Oz;
    }

    private void setUpContentLayoutForVideo(int i2) {
        this.A0N.removeAllViews();
        A0H();
        if (this.A06 != null) {
            X2 x2 = this.A0R;
            if (A0k[2].charAt(24) == 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A0k;
            strArr[5] = "4i2csOaoNdqQlmOU4oeneSGIvSddu1uE";
            strArr[3] = "nuT450uQsQsD47HYSiniJ05GRT2hP0Qn";
            if (JT.A1K(x2)) {
                this.A0N.addView(this.A03);
                this.A0d.A0A(-1, A0t);
                if (i2 == 1) {
                    A0K();
                    this.A0N.addView(this.A09, A0r);
                } else {
                    A0J();
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(0, this.A03.getId());
                    layoutParams.setMargins(0, 0, 0, 0);
                    this.A0N.addView(this.A09, layoutParams);
                }
                this.A0N.addView(this.A06);
            } else {
                this.A0N.addView(this.A09, A0r);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(12);
                this.A06.A0E(false);
                C0856Lz.A0N(this.A06);
                this.A06.A0D(i2);
                AbstractC0900Ns abstractC0900Ns = this.A06;
                int i3 = A0q;
                abstractC0900Ns.setPadding(i3, i3, i3, i3);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, this.A0h ? A0v : -2);
                if (this.A0h) {
                    int i4 = A0q;
                    layoutParams2.setMargins(i4, i4, i4, i4);
                    H8 h8 = this.A0d;
                    int i5 = A0w;
                    h8.setPadding(i5, i5, i5, i5);
                    this.A0d.A0A(-1, A0t);
                }
                layoutParams3.addRule(12);
                this.A0N.addView(this.A0d, layoutParams3);
                this.A0N.addView(this.A06, layoutParams2);
            }
        }
        int i6 = A0p;
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(i6, i6);
        layoutParams4.addRule(10);
        layoutParams4.addRule(11);
        int i7 = A0n;
        layoutParams4.setMargins(i7, getToolbarHeight() + i7, A0n, A0o);
        this.A0N.addView(this.A0c, layoutParams4);
        A0R();
    }
}

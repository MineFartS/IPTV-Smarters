package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.80, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass80 extends AbstractC0980Qv {
    public static byte[] A0K;
    public static String[] A0L;

    @Nullable
    public O9 A00;

    @Nullable
    public PD A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final InterfaceC04464u A08;
    public final C0932Oz A09;
    public final C0854Lx A0A;
    public final C7r A0B;
    public final KQ A0C;
    public final KO A0D;
    public final KK A0E;
    public final KE A0F;
    public final AbstractC0787Je A0G;
    public final AbstractC0785Jc A0H;
    public final C0743Hk A0I;
    public final H8 A0J;

    static {
        A09();
        A08();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0K = new byte[]{-3, DateTimeFieldType.SECOND_OF_MINUTE, 7, 5, DateTimeFieldType.SECOND_OF_MINUTE, -1, -38, -51, -56, -55, -45};
    }

    public static void A09() {
        A0L = new String[]{"Mriq29lS8vjEPztqvg4mnlhqPa1pf4jw", "J0ebGdEZD5oKohgNzUxMA3JiHaSF4bRJ", "IT9tvlYp44pYwsfxgtsksFS", "El43mrOkb3qqMjbYlNbneDDC3riKbt8u", "SsyQgLhJr8BA6K4Jeu0226NIXlotTSUK", "5pKSfcHcmxRzGJ6MCKbxSHPk9j0pnkgf", "vZ9Xs81YGHnjRjGsoTeSsIOHxP", "Y9Sammkz"};
    }

    public AnonymousClass80(X2 x2, InterfaceC0878Mw interfaceC0878Mw, JZ jz, AnonymousClass16 anonymousClass16, C7C c7c, MR mr) {
        super(x2, interfaceC0878Mw, jz, anonymousClass16, c7c, mr);
        this.A08 = new PT(this);
        this.A0G = new AbstractC0787Je() { // from class: com.facebook.ads.redexgen.X.8Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(K5 k5) {
                this.A00.A06 = true;
            }
        };
        this.A0F = new KE() { // from class: com.facebook.ads.redexgen.X.88
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(KJ kj) {
                this.A00.A07 = true;
                this.A00.A0Q();
            }
        };
        this.A0E = new KK() { // from class: com.facebook.ads.redexgen.X.85
            @Override // com.facebook.ads.redexgen.X.C9F
            public final /* bridge */ /* synthetic */ void A04(C9D c9d) {
            }
        };
        this.A0H = new AbstractC0785Jc() { // from class: com.facebook.ads.redexgen.X.83
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(C05127n c05127n) {
                this.A00.A0G(c05127n);
                this.A00.A0F(c05127n);
                this.A00.A00.A0L(c05127n);
            }
        };
        this.A0C = new KQ() { // from class: com.facebook.ads.redexgen.X.82
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(C7q c7q) {
                AnonymousClass80 anonymousClass80 = this.A00;
                anonymousClass80.A0E(c7q, anonymousClass80.A0A.getState() != EnumC0958Pz.A06);
            }
        };
        this.A0D = new AnonymousClass81(this);
        boolean z = false;
        this.A06 = false;
        this.A07 = false;
        this.A05 = false;
        this.A03 = false;
        this.A0A = new C0854Lx(super.A03);
        this.A0A.setFunnelLoggingHandler(super.A05);
        this.A0A.getEventBus().A04(this.A0G, this.A0F, this.A0E, this.A0H, this.A0C, this.A0D);
        this.A0B = new C7r(super.A03, super.A04, this.A0A, super.A01.A0Q());
        this.A09 = new C0932Oz(super.A03, super.A09, super.A01.A0V(), mr);
        this.A0I = new C0743Hk(super.A03, super.A05);
        this.A0J = new H8(super.A03);
        A07();
        this.A0A.setVideoURI(super.A02.A0M(super.A01.A0M().A0E().A08()));
        A05();
        this.A04 = super.A01.A0M().A0E().A03() <= 0;
        if (super.A01.A0M().A0L() && super.A01.A0M().A0E().A02() > 0) {
            z = true;
        }
        this.A02 = z;
        C0856Lz.A0P(this, super.A01.A0L().A01().A07(true));
    }

    private O9 A00(int i2) {
        return OA.A00(new OC(super.A03, super.A04, super.A08, super.A01, this.A0A, super.A0A, super.A06).A0D(super.A07.getToolbarHeight()).A0F(super.A07).A0C(i2).A0E(this.A0I).A0G(this.A0J).A0H(), null, true);
    }

    private void A04() {
        this.A0A.postDelayed(new PS(this), JT.A0H(super.A03));
    }

    private void A05() {
        this.A0A.postDelayed(new PQ(this), JT.A0I(super.A03));
    }

    private void A06() {
        this.A04 = true;
        O9 o9 = this.A00;
        if (o9 != null) {
            o9.A0Z();
        }
    }

    private void A07() {
        this.A0A.A0Z(this.A0J);
        this.A0A.A0Z(this.A0I);
        if (!TextUtils.isEmpty(super.A01.A0M().A0E().A07())) {
            C7V c7v = new C7V(super.A03);
            this.A0A.A0Z(c7v);
            c7v.setImage(super.A01.A0M().A0E().A07());
        }
        AnonymousClass76 anonymousClass76 = new AnonymousClass76(super.A03, true, super.A05);
        this.A0A.A0Z(anonymousClass76);
        this.A0A.A0Z(new C0745Hn(anonymousClass76, PP.A03, true));
        this.A0A.A0Z(new C7M(super.A03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C7q c7q, boolean z) {
        if (this.A05) {
            return;
        }
        this.A05 = true;
        if (!this.A04) {
            A06();
        }
        O9 o9 = this.A00;
        if (A0L[6].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[1] = "skYYV88BTcDGkk1Ge0IaKZH0HqJ76mgM";
        strArr[1] = "skYYV88BTcDGkk1Ge0IaKZH0HqJ76mgM";
        if (o9 != null) {
            o9.A0K(c7q);
        }
        super.A07.setToolbarActionMode(getCloseButtonStyle());
        super.A07.setToolbarActionMessage(A03(0, 0, 25));
        A0I(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(C05127n c05127n) {
        if (this.A0A.getState() == EnumC0958Pz.A02 && JT.A0u(super.A03)) {
            this.A0A.postDelayed(new Q4(this, c05127n), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(C05127n c05127n) {
        int iA00 = c05127n.A00();
        float fMin = iA00 / Math.min(super.A01.A0M().A0E().A03() * 1000.0f, this.A0A.getDuration());
        super.A07.setProgress(100.0f * fMin);
        if (fMin >= 1.0f && !this.A04) {
            A06();
            super.A07.setToolbarActionMode(getCloseButtonStyle());
        }
        if (this.A02) {
            int totalSecondsForReward = iA00 / 1000;
            int iA02 = super.A01.A0M().A0E().A02() - totalSecondsForReward;
            if (iA02 > 0) {
                AnonymousClass16 anonymousClass16 = super.A01;
                String[] strArr = A0L;
                String str = strArr[2];
                String str2 = strArr[7];
                int length = str.length();
                int remainingSecondsForReward = str2.length();
                if (length == remainingSecondsForReward) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0L;
                strArr2[0] = "PXM0w4DTcyhv6xVVxlaJPbpxowOdlGPl";
                strArr2[4] = "ZagmJHoPVKqTZKI94Zh80WtjAbW4VeCE";
                super.A07.setToolbarActionMessage(anonymousClass16.A0P().A00().replace(A03(0, 6, 74), String.valueOf(iA02)));
                return;
            }
            super.A07.setToolbarActionMessage(A03(0, 0, 25));
            A0I(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(String str) {
        int currentPositionInMillis = 0;
        int duration = 0;
        C0854Lx c0854Lx = this.A0A;
        if (c0854Lx != null) {
            currentPositionInMillis = c0854Lx.getCurrentPositionInMillis();
            duration = this.A0A.getDuration();
        }
        super.A03.A04().A86(A03(6, 5, 12), C05228d.A2A, new C05238e(str));
        if (JT.A0v(super.A03)) {
            A0E(new C7q(currentPositionInMillis, duration), false);
            return;
        }
        MR mr = super.A08;
        if (A0L[3].charAt(0) == 'z') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[3] = "uhCmlX27t5rzSWT78KYVdoY12DutI5Be";
        strArr[3] = "uhCmlX27t5rzSWT78KYVdoY12DutI5Be";
        mr.A3s(super.A09.A6E());
        super.A08.A3s(super.A09.A69());
    }

    private synchronized void A0I(boolean z) {
        boolean z2 = this.A02;
        String[] strArr = A0L;
        if (strArr[2].length() != strArr[7].length()) {
            String[] strArr2 = A0L;
            strArr2[6] = "RUkVKvLXKou3DkajJbljeqXSK8";
            strArr2[6] = "RUkVKvLXKou3DkajJbljeqXSK8";
            if (z2 && !z) {
                super.A08.A3s(super.A09.A5G());
                this.A09.A06();
                this.A02 = false;
                if (this.A00 != null) {
                    this.A00.A0X();
                }
                return;
            }
            this.A02 = false;
            String[] strArr3 = A0L;
            if (strArr3[2].length() != strArr3[7].length()) {
                String[] strArr4 = A0L;
                strArr4[6] = "pCCqOlrdcXyBK9Nv0jyTBmGbmh";
                strArr4[6] = "pCCqOlrdcXyBK9Nv0jyTBmGbmh";
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0980Qv
    public final void A0R() {
        C0856Lz.A0O(this.A00);
        C0856Lz.A0O(super.A07);
        this.A0A.setVolume(super.A01.A0M().A0E().A09() ? 0.0f : 1.0f);
        this.A0A.A0Y(PD.A03, 20);
        O9 o9 = this.A00;
        if (o9 != null && this.A02) {
            o9.A0Y();
        }
        O9 o92 = this.A00;
        if (o92 != null && !this.A04) {
            o92.A0a();
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0980Qv
    public final void A0T(C04484w c04484w) {
        c04484w.A0L(this.A08);
        this.A00 = A00(c04484w.A0I().getResources().getConfiguration().orientation);
        addView(this.A00, AbstractC0980Qv.A0D);
        addView(super.A07, new FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        C0856Lz.A0K(this.A00);
        C0856Lz.A0K(super.A07);
        O9 o9 = this.A00;
        setUpFullscreenMode(o9 != null && o9.A0c());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0980Qv
    public final boolean A0U() {
        O9 o9 = this.A00;
        return o9 != null && o9.A0d(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AAQ(boolean z) {
        if (this.A0A.A0f()) {
            return;
        }
        this.A01 = this.A0A.getVideoStartReason();
        this.A03 = z;
        this.A0A.A0b(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AAn(boolean z) {
        if (this.A0A.A0g() || this.A05 || this.A0A.getState() == EnumC0958Pz.A06 || this.A01 == null) {
            return;
        }
        if (!this.A03 || z) {
            C0854Lx c0854Lx = this.A0A;
            PD pd = this.A01;
            String[] strArr = A0L;
            if (strArr[0].charAt(8) == strArr[4].charAt(8)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[1] = "5vrQw9TAnlgebYwA7tbvLzoGHglPMjBr";
            strArr2[1] = "5vrQw9TAnlgebYwA7tbvLzoGHglPMjBr";
            c0854Lx.A0Y(pd, 19);
        }
    }

    private int getCloseButtonStyle() {
        O9 o9 = this.A00;
        if (o9 != null) {
            return o9.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0980Qv, com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
        super.onDestroy();
        O9 o9 = this.A00;
        if (o9 != null) {
            o9.A0W();
        }
        C0854Lx c0854Lx = this.A0A;
        if (c0854Lx != null) {
            if (!this.A05) {
                c0854Lx.A0X(P9.A03);
            }
            this.A0A.getEventBus().A05(this.A0G, this.A0F, this.A0E, this.A0H, this.A0C, this.A0D);
            this.A0A.A0S();
        }
        this.A0B.A0h();
    }
}

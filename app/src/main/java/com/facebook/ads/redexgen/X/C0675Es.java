package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Es, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0675Es extends SB {
    public static String[] A03;

    @VisibleForTesting
    public static final InterfaceC03701t A04;

    @Nullable
    public SG A00;
    public final C03691s A01;
    public final X2 A02;

    public static void A00() {
        A03 = new String[]{"Wdifh5HSN4RyvogFUrIVqQJQULlKdEei", "S34yOHPbjBOZXrhEKXqsFwPvtnd1qciy", "vu9eRI", "x0OqZ", "VYF0eZRg0jpnLcLhIoRoBnoO3djZf6SI", "33GTCt01Ki3rQT8tpwoWMPFpMqFvVQrj", "pa13jV0ykdfTm6Oo414mEZE7qu5xzGka", "tj8XsVszyFe6dIsjKXzcwTwgC3z6jHVp"};
    }

    static {
        A00();
        A04 = new SL();
    }

    public C0675Es(C03691s c03691s) {
        super(c03691s.A05(), A04.A4N(c03691s));
        this.A01 = c03691s;
        this.A02 = c03691s.A05();
    }

    @Override // com.facebook.ads.redexgen.X.SB
    public final void A05() {
        SG sg = this.A00;
        if (sg != null) {
            sg.A0A();
        }
        InterfaceC03661p interfaceC03661p = super.A00;
        EnumC03651o enumC03651o = EnumC03651o.A04;
        if (A03[1].charAt(8) == 'f') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "bjBCaQy28rNQq0pISHtZZouKJ3cbndZJ";
        strArr[4] = "bjBCaQy28rNQq0pISHtZZouKJ3cbndZJ";
        interfaceC03661p.ACw(enumC03651o);
    }

    public final void A07() {
        this.A00 = new SG(this.A01, this, super.A02);
        this.A00.A0B(this.A01.A0A(), this.A01.A06());
    }

    public final void A08(InterstitialAd interstitialAd, EnumSet<CacheFlag> enumSet, @Nullable String str) {
        if (super.A00.A52()) {
            return;
        }
        this.A01.A0C(interstitialAd);
        SG sg = this.A00;
        if (sg != null) {
            sg.A0B(enumSet, str);
            return;
        }
        this.A01.A0J(enumSet);
        this.A01.A0G(str);
        A07();
    }

    public final boolean A09() {
        SG sg = this.A00;
        if (sg != null) {
            return sg.A0C();
        }
        if (this.A01.A00() > 0) {
            long jA00 = C0848Lr.A00();
            long jA002 = this.A01.A00();
            if (A03[0].charAt(6) == 'y') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "spPOKGUnJm6foAMMjUQWH3rPbfiGZlB3";
            strArr[4] = "spPOKGUnJm6foAMMjUQWH3rPbfiGZlB3";
            if (jA00 > jA002) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0A() {
        SG sg = this.A00;
        if (sg != null) {
            return sg.A0D();
        }
        return super.A00.A5J() == EnumC03651o.A06;
    }

    public final boolean A0B(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A53()) {
            return false;
        }
        this.A01.A0C(interstitialAd);
        SG sg = this.A00;
        if (sg != null) {
            return sg.A0E();
        }
        this.A00 = new SG(this.A01, this, super.A02);
        this.A00.A0E();
        return false;
    }
}

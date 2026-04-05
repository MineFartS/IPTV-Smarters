package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0674Er extends SB {

    @Nullable
    public SJ A00;
    public final C03731w A01;

    public C0674Er(C03731w c03731w) {
        super(c03731w.A0B, A00(c03731w));
        this.A01 = c03731w;
    }

    public static InterfaceC03721v A00(C03731w c03731w) {
        return new SO(c03731w);
    }

    @Override // com.facebook.ads.redexgen.X.SB
    public final void A05() {
        SJ sj = this.A00;
        if (sj != null) {
            sj.A0D();
        }
        super.A00.ACw(EnumC03651o.A04);
    }

    public final void A07() {
        this.A00 = new SJ(this.A01, this, this.A02);
        this.A00.A0F(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    public final void A08(RewardData rewardData) {
        this.A01.A03 = rewardData;
        SJ sj = this.A00;
        if (sj != null) {
            sj.A0E(rewardData);
        }
    }

    public final void A09(RewardedVideoAd rewardedVideoAd, @Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        if (super.A00.A52()) {
            return;
        }
        this.A01.A02(rewardedVideoAd);
        SJ sj = this.A00;
        if (sj != null) {
            sj.A0F(str, adExperienceType, z);
            return;
        }
        C03731w c03731w = this.A01;
        c03731w.A05 = str;
        c03731w.A02 = adExperienceType;
        c03731w.A08 = z;
        A07();
    }

    public final boolean A0A() {
        SJ sj = this.A00;
        if (sj != null) {
            return sj.A0G();
        }
        return this.A01.A01 > 0 && C0848Lr.A00() > this.A01.A01;
    }

    public final boolean A0B() {
        SJ sj = this.A00;
        if (sj != null) {
            return sj.A0H();
        }
        return super.A00.A5J() == EnumC03651o.A06;
    }

    public final boolean A0C(RewardedVideoAd rewardedVideoAd, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int iA00 = ((C5O) rewardedVideoShowAdConfig).A00();
        if (super.A00.A53()) {
            return false;
        }
        this.A01.A02(rewardedVideoAd);
        SJ sj = this.A00;
        if (sj != null) {
            return sj.A0I(iA00);
        }
        this.A00 = new SJ(this.A01, this, this.A02);
        this.A00.A0I(iA00);
        return false;
    }
}

package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03611k {
    public int A00;

    @Nullable
    public RewardData A01;

    @Nullable
    public EnumC0798Jp A02;

    @Nullable
    public String A03;

    @Nullable
    public String A04;
    public boolean A05;
    public final KC A06;
    public final KD A07;
    public final String A08;

    @Nullable
    public final EnumSet<CacheFlag> A09;
    public final int A0A;
    public final AdPlacementType A0B;

    public C03611k(String str, KD kd, AdPlacementType adPlacementType, KC kc, int i2) {
        this(str, kd, adPlacementType, kc, i2, EnumSet.of(CacheFlag.NONE));
    }

    public C03611k(String str, KD kd, AdPlacementType adPlacementType, KC kc, int i2, @Nullable EnumSet<CacheFlag> enumSet) {
        this.A08 = str;
        this.A0B = adPlacementType;
        this.A06 = kc;
        this.A0A = i2;
        this.A09 = enumSet;
        this.A07 = kd;
        this.A00 = -1;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0B;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        KC kc = this.A06;
        if (kc == null) {
            return AdPlacementType.NATIVE;
        }
        if (kc == KC.A08) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final KX A01(X2 x2, KI ki, @Nullable AdExperienceType adExperienceType) {
        C0834Lc c0834Lc;
        String str = this.A08;
        KC kc = this.A06;
        if (kc != null) {
            c0834Lc = new C0834Lc(kc.getHeight(), this.A06.getWidth());
        } else {
            c0834Lc = null;
        }
        return new KX(x2, str, c0834Lc, this.A07, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, this.A0A, AdSettings.isTestMode(x2), AdSettings.isChildDirected() || AdSettings.isMixedAudience(), ki, C0839Li.A01(JT.A0G(x2)), this.A03, adExperienceType);
    }

    public final void A02(int i2) {
        this.A00 = i2;
    }

    public final void A03(@Nullable RewardData rewardData) {
        this.A01 = rewardData;
    }

    public final void A04(@Nullable EnumC0798Jp enumC0798Jp) {
        this.A02 = enumC0798Jp;
    }

    public final void A05(@Nullable String str) {
        this.A03 = str;
    }

    public final void A06(@Nullable String str) {
        this.A04 = str;
    }

    public final void A07(boolean z) {
        this.A05 = z;
    }
}

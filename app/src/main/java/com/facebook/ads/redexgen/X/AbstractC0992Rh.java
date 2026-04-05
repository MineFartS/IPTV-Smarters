package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0992Rh implements InterfaceC03380n {
    public int A00;
    public RewardData A01;

    public abstract int A0B();

    public abstract boolean A0C();

    public final void A00(int i2) {
        this.A00 = i2;
    }

    public final void A01(RewardData rewardData) {
        this.A01 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03380n
    public final AdPlacementType A6l() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}

package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZA implements InterfaceC0925Or {
    public final /* synthetic */ YW A00;

    public ZA(YW yw) {
        this.A00 = yw;
    }

    public /* synthetic */ ZA(YW yw, C1207Zt c1207Zt) {
        this(yw);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0925Or
    public final void A9K() {
        this.A00.A0V(true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0925Or
    public final void A9m() {
        if (!TextUtils.isEmpty(this.A00.A09.A0Q())) {
            this.A00.A0D.A8A(this.A00.A09.A0Q(), new C0897Np().A04(this.A00.A06.getViewabilityChecker()).A03(this.A00.A06.getTouchDataRecorder()).A06());
            this.A00.A0C.A0A().A2a();
        }
        this.A00.A0H.A3s(this.A00.A0I.A6Q());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0925Or
    public final void AA6() {
        this.A00.A0H.A3s(this.A00.A0I.A6E());
    }
}

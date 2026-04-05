package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0700Ft implements InterfaceC0970Ql {
    public final EnumC0962Qd A00;
    public final AnonymousClass48 A01;

    public AbstractC0700Ft(AnonymousClass48 anonymousClass48, EnumC0962Qd enumC0962Qd) {
        this.A01 = anonymousClass48;
        this.A00 = enumC0962Qd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0970Ql
    public void A3P(Map<QW, EnumC0975Qq> map, Map<InterfaceC0703Fw, EnumC0962Qd> map2) {
        map2.put(this.A01, this.A00);
    }
}

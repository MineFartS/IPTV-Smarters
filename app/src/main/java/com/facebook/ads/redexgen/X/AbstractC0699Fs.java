package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0699Fs implements InterfaceC0970Ql {
    public final C0704Fx A00;
    public final EnumC0975Qq A01;

    public AbstractC0699Fs(C0704Fx c0704Fx, EnumC0975Qq enumC0975Qq) {
        this.A00 = c0704Fx;
        this.A01 = enumC0975Qq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0970Ql
    public void A3P(Map<QW, EnumC0975Qq> map, Map<InterfaceC0703Fw, EnumC0962Qd> map2) {
        map.put(this.A00, this.A01);
    }
}

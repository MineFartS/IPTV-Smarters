package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class XX implements C8G {
    public final /* synthetic */ C8C A00;
    public final /* synthetic */ C1140Xb A01;

    public XX(C1140Xb c1140Xb, C8C c8c) {
        this.A01 = c1140Xb;
        this.A00 = c8c;
    }

    @Override // com.facebook.ads.redexgen.X.C8G
    public final String A6J() {
        return C0812Ke.A04(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C8G
    public final boolean A7c() {
        return BuildConfigApi.isDebug();
    }
}

package com.facebook.ads.redexgen.X;

import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RN implements C0V {
    public final C0T A00;

    public RN(C0T c0t) {
        this.A00 = c0t;
    }

    public final void A00(C0U c0u, JSONObject jSONObject) {
        this.A00.A5C(c0u, jSONObject);
    }

    @Override // com.facebook.ads.redexgen.X.C0V
    public final RK A8U() {
        return new C0695Fo(this);
    }

    @Override // com.facebook.ads.redexgen.X.C0V
    public final C0S A8V() {
        return new RL(this);
    }
}

package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TY extends AbstractRunnableC0817Kk {
    public final /* synthetic */ C5L A00;

    public TY(C5L c5l) {
        this.A00 = c5l;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0817Kk
    public final void A04() {
        if (this.A00.A01 != null) {
            this.A00.A01.onError(this.A00.A03, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
        }
    }
}

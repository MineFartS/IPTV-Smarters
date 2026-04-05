package com.facebook.ads.redexgen.X;

import android.os.SystemClock;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WG implements InterfaceC04806d {
    public final /* synthetic */ WI A00;

    public WG(WI wi) {
        this.A00 = wi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        return this.A00.A04(SystemClock.elapsedRealtime() / 1000.0f);
    }
}

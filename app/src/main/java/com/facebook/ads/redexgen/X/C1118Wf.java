package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1118Wf implements InterfaceC04806d {
    public final /* synthetic */ C1121Wi A00;

    public C1118Wf(C1121Wi c1121Wi) {
        this.A00 = c1121Wi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        return this.A00.A07(AnonymousClass71.A02(TrafficStats.getMobileTxBytes()));
    }
}

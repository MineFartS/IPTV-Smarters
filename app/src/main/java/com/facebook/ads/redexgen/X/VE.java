package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VE implements InterfaceC04806d {
    public final /* synthetic */ VJ A00;

    public VE(VJ vj) {
        this.A00 = vj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        return this.A00.A09(Build.DISPLAY);
    }
}

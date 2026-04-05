package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class W6 implements InterfaceC04806d {
    public final /* synthetic */ W9 A00;

    public W6(W9 w9) {
        this.A00 = w9;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A00 == null || Build.VERSION.SDK_INT < 7) {
            return this.A00.A08(EnumC04916o.A07);
        }
        W9 w9 = this.A00;
        return w9.A0G(w9.A04());
    }
}

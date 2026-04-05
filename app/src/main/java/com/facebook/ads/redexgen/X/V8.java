package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class V8 implements InterfaceC04806d {
    public final /* synthetic */ VJ A00;

    public V8(VJ vj) {
        this.A00 = vj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.A00.A08(EnumC04916o.A05);
        }
        return this.A00.A09(Build.VERSION.SECURITY_PATCH);
    }
}

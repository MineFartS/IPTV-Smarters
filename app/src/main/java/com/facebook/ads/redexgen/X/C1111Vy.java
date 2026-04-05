package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1111Vy implements InterfaceC04806d {
    public final /* synthetic */ W5 A00;

    public C1111Vy(W5 w5) {
        this.A00 = w5;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A01 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        if (Build.VERSION.SDK_INT < 28) {
            W5 w5 = this.A00;
            return w5.A05(w5.A01.versionCode);
        }
        W5 w52 = this.A00;
        return w52.A07(w52.A01.getLongVersionCode());
    }
}

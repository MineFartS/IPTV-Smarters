package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class U6 implements InterfaceC04806d {
    public final /* synthetic */ U7 A00;

    public U6(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A02 != null) {
            return this.A00.A0G(ActivityManager.isRunningInTestHarness());
        }
        return this.A00.A08(EnumC04916o.A07);
    }
}

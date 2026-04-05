package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WT implements InterfaceC04806d {
    public final /* synthetic */ WZ A00;

    public WT(WZ wz) {
        this.A00 = wz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.A00.A08(EnumC04916o.A05);
        }
        if (this.A00.A00 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        WZ wz = this.A00;
        return wz.A05(wz.A00.getPhoneCount());
    }
}

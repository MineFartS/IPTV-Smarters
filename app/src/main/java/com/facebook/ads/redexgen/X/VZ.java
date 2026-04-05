package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VZ implements InterfaceC04806d {
    public final /* synthetic */ C1090Vd A00;

    public VZ(C1090Vd c1090Vd) {
        this.A00 = c1090Vd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 22) {
            return this.A00.A08(EnumC04916o.A05);
        }
        if (this.A00.A00 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        C1090Vd c1090Vd = this.A00;
        return c1090Vd.A0G(c1090Vd.A00.isDeviceLocked());
    }
}

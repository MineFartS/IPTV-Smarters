package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1089Vc implements InterfaceC04806d {
    public final /* synthetic */ C1090Vd A00;

    public C1089Vc(C1090Vd c1090Vd) {
        this.A00 = c1090Vd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 16) {
            return this.A00.A08(EnumC04916o.A05);
        }
        if (this.A00.A00 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        C1090Vd c1090Vd = this.A00;
        return c1090Vd.A0G(c1090Vd.A00.isKeyguardSecure());
    }
}

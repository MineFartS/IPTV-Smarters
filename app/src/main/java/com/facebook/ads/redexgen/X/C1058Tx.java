package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1058Tx implements InterfaceC04806d {
    public final /* synthetic */ U7 A00;

    public C1058Tx(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.A00.A08(EnumC04916o.A05);
        }
        if (this.A00.A02 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        U7 u7 = this.A00;
        return u7.A05(u7.A02.getLockTaskModeState());
    }
}

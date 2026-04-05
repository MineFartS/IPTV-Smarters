package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1085Uy implements InterfaceC04806d {
    public final /* synthetic */ VJ A00;

    public C1085Uy(VJ vj) {
        this.A00 = vj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 26) {
            return this.A00.A09(Build.SERIAL);
        }
        return this.A00.A09(Build.getSerial());
    }
}

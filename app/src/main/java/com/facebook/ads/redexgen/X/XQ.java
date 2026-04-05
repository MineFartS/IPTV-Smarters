package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class XQ implements InterfaceC0820Kn {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0820Kn
    public final void ACU(Throwable th, Object obj) {
        if (obj instanceof C8A) {
            X2 x2A5H = ((C8A) obj).A5H();
            if (x2A5H != null) {
                x2A5H.A0E(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof X2)) {
            return;
        }
        ((X2) context).A0E(th);
    }
}

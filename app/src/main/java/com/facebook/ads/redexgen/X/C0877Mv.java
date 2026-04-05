package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0877Mv extends View {
    public InterfaceC0876Mu A00;

    public C0877Mv(X2 x2, InterfaceC0876Mu interfaceC0876Mu) {
        super(x2);
        this.A00 = interfaceC0876Mu;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        InterfaceC0876Mu interfaceC0876Mu = this.A00;
    }
}

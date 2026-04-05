package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1034Sz implements InterfaceC04264a {
    public final /* synthetic */ C4F A00;

    public C1034Sz(C4F c4f) {
        this.A00 = c4f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04264a
    public final View A5f(int i2) {
        return this.A00.A0u(i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04264a
    public final int A5h(View view) {
        return this.A00.A0o(view) + ((C4G) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04264a
    public final int A5i(View view) {
        return this.A00.A0l(view) - ((C4G) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04264a
    public final int A6h() {
        return this.A00.A0i() - this.A00.A0g();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04264a
    public final int A6i() {
        return this.A00.A0f();
    }
}

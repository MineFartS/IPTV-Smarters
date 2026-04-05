package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class T0 implements InterfaceC04264a {
    public final /* synthetic */ C4F A00;

    public T0(C4F c4f) {
        this.A00 = c4f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04264a
    public final View A5f(int i2) {
        return this.A00.A0u(i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04264a
    public final int A5h(View view) {
        return this.A00.A0k(view) + ((C4G) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04264a
    public final int A5i(View view) {
        return this.A00.A0p(view) - ((C4G) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04264a
    public final int A6h() {
        return this.A00.A0Y() - this.A00.A0e();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04264a
    public final int A6i() {
        return this.A00.A0h();
    }
}

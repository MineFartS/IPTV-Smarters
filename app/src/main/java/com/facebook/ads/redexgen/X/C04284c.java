package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04284c {
    public C4Z A00 = new C4Z();
    public final InterfaceC04264a A01;

    public C04284c(InterfaceC04264a interfaceC04264a) {
        this.A01 = interfaceC04264a;
    }

    public final View A00(int end, int next, int i2, int i3) {
        int childStart = this.A01.A6i();
        int iA6h = this.A01.A6h();
        int i4 = next > end ? 1 : -1;
        View view = null;
        while (end != next) {
            View viewA5f = this.A01.A5f(end);
            this.A00.A04(childStart, iA6h, this.A01.A5i(viewA5f), this.A01.A5h(viewA5f));
            if (i2 != 0) {
                this.A00.A02();
                this.A00.A03(i2);
                if (this.A00.A05()) {
                    return viewA5f;
                }
            }
            if (i3 != 0) {
                this.A00.A02();
                this.A00.A03(i3);
                if (this.A00.A05()) {
                    view = viewA5f;
                }
            }
            end += i4;
        }
        return view;
    }
}

package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class X1 implements InterfaceC0948Pp {
    public final /* synthetic */ AnonymousClass77 A00;

    public X1(AnonymousClass77 anonymousClass77) {
        this.A00 = anonymousClass77;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0948Pp
    public final void A9R() {
        try {
            this.A00.A00.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0948Pp
    public final void A9a() {
        try {
            this.A00.A00.put(false);
        } catch (InterruptedException unused) {
        }
    }
}

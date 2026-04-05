package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1246aX implements InterfaceC0837Lg {
    public final C0836Lf A00;
    public final InterfaceC0837Lg A01;

    public C1246aX(InterfaceC0837Lg interfaceC0837Lg, int i2, int i3) {
        this.A01 = interfaceC0837Lg;
        this.A00 = new C0836Lf(i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Lg
    public final void ABp(String str) {
        this.A00.A05(str);
        if (this.A00.A03() != null && C0839Li.A08(this.A00)) {
            this.A01.ABp(this.A00.A03());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Lg
    public final void flush() {
        this.A00.A04();
        while (this.A00.A03() != null) {
            if (C0839Li.A08(this.A00)) {
                this.A01.ABp(this.A00.A03());
            }
            this.A00.A04();
        }
    }
}

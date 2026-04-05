package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1247aY implements InterfaceC0837Lg {
    public int A00;
    public final InterfaceC0837Lg A01;

    public C1247aY(InterfaceC0837Lg interfaceC0837Lg, int i2) {
        this.A01 = interfaceC0837Lg;
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Lg
    public final void ABp(String str) {
        if (this.A00 > 0) {
            this.A01.ABp(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Lg
    public final void flush() {
        this.A01.flush();
    }
}

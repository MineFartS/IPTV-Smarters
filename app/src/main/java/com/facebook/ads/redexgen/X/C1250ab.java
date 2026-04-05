package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1250ab implements InterfaceC0837Lg {
    public int A00;
    public final InterfaceC0837Lg A01;
    public final InterfaceC0837Lg A02;

    public C1250ab(InterfaceC0837Lg interfaceC0837Lg, int i2, InterfaceC0837Lg interfaceC0837Lg2) {
        this.A01 = interfaceC0837Lg;
        this.A00 = i2;
        this.A02 = interfaceC0837Lg2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Lg
    public final void ABp(String str) {
        if (this.A00 > 0) {
            this.A01.ABp(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.ABp(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Lg
    public final void flush() {
        this.A02.flush();
    }
}

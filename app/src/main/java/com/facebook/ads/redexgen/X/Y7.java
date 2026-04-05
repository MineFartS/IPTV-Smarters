package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Y7 implements BK {
    public final YD A00 = new YD();
    public final YF A01 = new YF();
    public final InterfaceC0593Ay[] A02;

    public Y7(InterfaceC0593Ay... interfaceC0593AyArr) {
        this.A02 = (InterfaceC0593Ay[]) Arrays.copyOf(interfaceC0593AyArr, interfaceC0593AyArr.length + 2);
        InterfaceC0593Ay[] interfaceC0593AyArr2 = this.A02;
        interfaceC0593AyArr2[interfaceC0593AyArr.length] = this.A00;
        interfaceC0593AyArr2[interfaceC0593AyArr.length + 1] = this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.BK
    public final AK A3R(AK ak) {
        this.A00.A0C(ak.A02);
        return new AK(this.A01.A02(ak.A01), this.A01.A01(ak.A00), ak.A02);
    }

    @Override // com.facebook.ads.redexgen.X.BK
    public final InterfaceC0593Ay[] A5R() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.BK
    public final long A6a(long j2) {
        return this.A01.A03(j2);
    }

    @Override // com.facebook.ads.redexgen.X.BK
    public final long A74() {
        return this.A00.A0B();
    }
}

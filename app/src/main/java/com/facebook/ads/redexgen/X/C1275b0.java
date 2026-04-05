package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1275b0 implements InterfaceC0708Gb {
    public static final C1275b0 A01 = new C1275b0();
    public final List<C0707Ga> A00;

    public C1275b0() {
        this.A00 = Collections.emptyList();
    }

    public C1275b0(C0707Ga c0707Ga) {
        this.A00 = Collections.singletonList(c0707Ga);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final List<C0707Ga> A5r(long j2) {
        return j2 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final long A6G(int i2) {
        IM.A03(i2 == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final int A6H() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final int A6b(long j2) {
        return j2 < 0 ? 0 : -1;
    }
}

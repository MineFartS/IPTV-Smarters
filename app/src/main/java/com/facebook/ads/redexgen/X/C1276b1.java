package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1276b1 implements InterfaceC0708Gb {
    public final List<C0707Ga> A00;

    public C1276b1(List<C0707Ga> list) {
        this.A00 = Collections.unmodifiableList(list);
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

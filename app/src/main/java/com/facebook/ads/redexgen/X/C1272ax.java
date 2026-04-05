package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1272ax implements InterfaceC0708Gb {
    public final long[] A00;
    public final C0707Ga[] A01;

    public C1272ax(C0707Ga[] c0707GaArr, long[] jArr) {
        this.A01 = c0707GaArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final List<C0707Ga> A5r(long j2) {
        int iA0B = J1.A0B(this.A00, j2, true, false);
        if (iA0B != -1) {
            C0707Ga[] c0707GaArr = this.A01;
            if (c0707GaArr[iA0B] != null) {
                return Collections.singletonList(c0707GaArr[iA0B]);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final long A6G(int i2) {
        boolean z = true;
        IM.A03(i2 >= 0);
        if (i2 >= this.A00.length) {
            z = false;
        }
        IM.A03(z);
        return this.A00[i2];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final int A6H() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final int A6b(long j2) {
        int iA0A = J1.A0A(this.A00, j2, false, false);
        if (iA0A < this.A00.length) {
            return iA0A;
        }
        return -1;
    }
}

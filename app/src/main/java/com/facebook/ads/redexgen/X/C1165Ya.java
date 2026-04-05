package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1165Ya implements CR {
    @Override // com.facebook.ads.redexgen.X.CR
    public final void A5B(Format format) {
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final int ACg(CG cg, int i2, boolean z) throws InterruptedException, IOException {
        int iADG = cg.ADG(i2);
        if (iADG == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return iADG;
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final void ACh(C0768Il c0768Il, int i2) {
        c0768Il.A0a(i2);
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final void ACi(long j2, int i2, int i3, int i4, CQ cq) {
    }
}

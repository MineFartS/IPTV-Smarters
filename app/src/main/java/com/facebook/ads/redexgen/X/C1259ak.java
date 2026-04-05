package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1259ak extends GP implements GC {
    public final AbstractC1261am A00;

    public C1259ak(String str, long j2, Format format, String str2, AbstractC1261am abstractC1261am, List<GK> list) {
        super(str, j2, format, str2, abstractC1261am, list);
        this.A00 = abstractC1261am;
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final GC A05() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final GN A07() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final String A08() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final long A6L() {
        return this.A00.A03();
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final int A6w(long j2) {
        return this.A00.A02(j2);
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final GN A6x(long j2) {
        return this.A00.A05(this, j2);
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final long A7B(long j2) {
        return this.A00.A04(j2);
    }
}

package com.facebook.ads.redexgen.X;

import com.amazonaws.services.s3.internal.Constants;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1279b4 implements HS {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final InterfaceC0735Hc A06;
    public final IP A07;

    public C1279b4(InterfaceC0735Hc interfaceC0735Hc) {
        this(interfaceC0735Hc, Constants.MAXIMUM_UPLOAD_PARTS, 25000, 25000, 0.75f, 0.75f, 2000L, IP.A00);
    }

    public C1279b4(InterfaceC0735Hc interfaceC0735Hc, int i2, int i3, int i4, float f2, float f3, long j2, IP ip) {
        this.A06 = interfaceC0735Hc;
        this.A03 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A00 = f2;
        this.A01 = f3;
        this.A05 = j2;
        this.A07 = ip;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.HS
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final AO A4U(TrackGroup trackGroup, int... iArr) {
        return new AO(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}

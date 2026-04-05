package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1239aQ implements InterfaceC0751Hu {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Format A04;
    public final C0744Hl A05;

    @Nullable
    public final Object A06;
    public final InterfaceC0740Hh A07;

    public AbstractC1239aQ(InterfaceC0740Hh interfaceC0740Hh, C0744Hl c0744Hl, int i2, Format format, int i3, @Nullable Object obj, long j2, long j3) {
        this.A07 = (InterfaceC0740Hh) IM.A01(interfaceC0740Hh);
        this.A05 = (C0744Hl) IM.A01(c0744Hl);
        this.A01 = i2;
        this.A04 = format;
        this.A00 = i3;
        this.A06 = obj;
        this.A03 = j2;
        this.A02 = j3;
    }
}

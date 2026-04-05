package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AJ {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AbstractC0573Ae A03;
    public final FB A04;
    public final TrackGroupArray A05;
    public final HX A06;

    @Nullable
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public AJ(AbstractC0573Ae abstractC0573Ae, long j2, TrackGroupArray trackGroupArray, HX hx) {
        this(abstractC0573Ae, null, new FB(0), j2, -9223372036854775807L, 1, false, trackGroupArray, hx);
    }

    public AJ(AbstractC0573Ae abstractC0573Ae, @Nullable Object obj, FB fb, long j2, long j3, int i2, boolean z, TrackGroupArray trackGroupArray, HX hx) {
        this.A03 = abstractC0573Ae;
        this.A07 = obj;
        this.A04 = fb;
        this.A02 = j2;
        this.A01 = j3;
        this.A0A = j2;
        this.A09 = j2;
        this.A00 = i2;
        this.A08 = z;
        this.A05 = trackGroupArray;
        this.A06 = hx;
    }

    public static void A00(AJ aj, AJ aj2) {
        aj2.A0A = aj.A0A;
        aj2.A09 = aj.A09;
    }

    public final AJ A01(int i2) {
        AJ aj = new AJ(this.A03, this.A07, this.A04.A01(i2), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, aj);
        return aj;
    }

    public final AJ A02(int i2) {
        AJ aj = new AJ(this.A03, this.A07, this.A04, this.A02, this.A01, i2, this.A08, this.A05, this.A06);
        A00(this, aj);
        return aj;
    }

    public final AJ A03(AbstractC0573Ae abstractC0573Ae, Object obj) {
        AJ aj = new AJ(abstractC0573Ae, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, aj);
        return aj;
    }

    public final AJ A04(FB fb, long j2, long j3) {
        long j4 = j3;
        AbstractC0573Ae abstractC0573Ae = this.A03;
        Object obj = this.A07;
        if (!fb.A02()) {
            j4 = -9223372036854775807L;
        }
        return new AJ(abstractC0573Ae, obj, fb, j2, j4, this.A00, this.A08, this.A05, this.A06);
    }

    public final AJ A05(TrackGroupArray trackGroupArray, HX hx) {
        AJ aj = new AJ(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, hx);
        A00(this, aj);
        return aj;
    }

    public final AJ A06(boolean z) {
        AJ aj = new AJ(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z, this.A05, this.A06);
        A00(this, aj);
        return aj;
    }
}

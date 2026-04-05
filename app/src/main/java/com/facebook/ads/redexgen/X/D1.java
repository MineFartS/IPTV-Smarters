package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D1 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final Format A07;

    @Nullable
    public final long[] A08;

    @Nullable
    public final long[] A09;

    @Nullable
    public final D2[] A0A;

    public D1(int i2, int i3, long j2, long j3, long j4, Format format, int i4, @Nullable D2[] d2Arr, int i5, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.A00 = i2;
        this.A03 = i3;
        this.A06 = j2;
        this.A05 = j3;
        this.A04 = j4;
        this.A07 = format;
        this.A02 = i4;
        this.A0A = d2Arr;
        this.A01 = i5;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final D2 A00(int i2) {
        D2[] d2Arr = this.A0A;
        if (d2Arr == null) {
            return null;
        }
        return d2Arr[i2];
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long[] f23100a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f23101b = new byte[8];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23103d;

    public static int b(int i2) {
        int i3 = 0;
        while (i3 < 8) {
            long j2 = f23100a[i3] & ((long) i2);
            i3++;
            if (j2 != 0) {
                return i3;
            }
        }
        return -1;
    }

    public static long c(byte[] bArr, int i2, boolean z) {
        long j2 = ((long) bArr[0]) & 255;
        if (z) {
            j2 &= f23100a[i2 - 1] ^ (-1);
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (((long) bArr[i3]) & 255);
        }
        return j2;
    }

    public final int a() {
        return this.f23103d;
    }

    public final long d(rk rkVar, boolean z, boolean z2, int i2) {
        if (this.f23102c == 0) {
            if (!rkVar.m(this.f23101b, 0, 1, z)) {
                return -1L;
            }
            int iB = b(this.f23101b[0] & 255);
            this.f23103d = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f23102c = 1;
        }
        int i3 = this.f23103d;
        if (i3 > i2) {
            this.f23102c = 0;
            return -2L;
        }
        if (i3 != 1) {
            rkVar.h(this.f23101b, 1, i3 - 1);
        }
        this.f23102c = 0;
        return c(this.f23101b, this.f23103d, z2);
    }

    public final void e() {
        this.f23102c = 0;
        this.f23103d = 0;
    }
}

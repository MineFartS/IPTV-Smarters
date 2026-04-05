package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class amu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f20171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f20175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f20176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f20177g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20178h;

    private static int g(long j2) {
        return (int) (j2 % 15);
    }

    public final long a() {
        long j2 = this.f20175e;
        if (j2 == 0) {
            return 0L;
        }
        return this.f20176f / j2;
    }

    public final long b() {
        return this.f20176f;
    }

    public final void c(long j2) {
        int i2;
        long j3 = this.f20174d;
        if (j3 == 0) {
            this.f20171a = j2;
        } else if (j3 == 1) {
            long j4 = j2 - this.f20171a;
            this.f20172b = j4;
            this.f20176f = j4;
            this.f20175e = 1L;
        } else {
            long j5 = j2 - this.f20173c;
            int iG = g(j3);
            if (Math.abs(j5 - this.f20172b) <= 1000000) {
                this.f20175e++;
                this.f20176f += j5;
                boolean[] zArr = this.f20177g;
                if (zArr[iG]) {
                    zArr[iG] = false;
                    i2 = this.f20178h - 1;
                    this.f20178h = i2;
                }
            } else {
                boolean[] zArr2 = this.f20177g;
                if (!zArr2[iG]) {
                    zArr2[iG] = true;
                    i2 = this.f20178h + 1;
                    this.f20178h = i2;
                }
            }
        }
        this.f20174d++;
        this.f20173c = j2;
    }

    public final void d() {
        this.f20174d = 0L;
        this.f20175e = 0L;
        this.f20176f = 0L;
        this.f20178h = 0;
        Arrays.fill(this.f20177g, false);
    }

    public final boolean e() {
        long j2 = this.f20174d;
        if (j2 == 0) {
            return false;
        }
        return this.f20177g[g(j2 - 1)];
    }

    public final boolean f() {
        return this.f20174d > 15 && this.f20178h == 0;
    }
}

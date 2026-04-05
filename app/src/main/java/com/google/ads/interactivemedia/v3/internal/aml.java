package com.google.ads.interactivemedia.v3.internal;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class aml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f20130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20133d = -9223372036854775807L;

    public aml(long j2) {
        this.f20131b = j2;
    }

    public static long f(long j2) {
        return (j2 * 1000000) / 90000;
    }

    public static long g(long j2) {
        return (j2 * 90000) / 1000000;
    }

    public final synchronized long a(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f20133d != -9223372036854775807L) {
            this.f20133d = j2;
        } else {
            long j3 = this.f20131b;
            if (j3 != Long.MAX_VALUE) {
                this.f20132c = j3 - j2;
            }
            this.f20133d = j2;
            notifyAll();
        }
        return j2 + this.f20132c;
    }

    public final synchronized long b(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f20133d;
        if (j3 != -9223372036854775807L) {
            long jG = g(j3);
            long j4 = (IjkMediaMeta.AV_CH_WIDE_RIGHT + jG) / IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
            long j5 = (((-1) + j4) * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT) + j2;
            j2 += j4 * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
            if (Math.abs(j5 - jG) < Math.abs(j2 - jG)) {
                j2 = j5;
            }
        }
        return a(f(j2));
    }

    public final synchronized long c() {
        return this.f20131b;
    }

    public final synchronized long d() {
        long j2 = this.f20133d;
        long j3 = -9223372036854775807L;
        if (j2 != -9223372036854775807L) {
            j3 = this.f20132c + j2;
        } else {
            long j4 = this.f20131b;
            if (j4 != Long.MAX_VALUE) {
                return j4;
            }
        }
        return j3;
    }

    public final synchronized long e() {
        long j2 = -9223372036854775807L;
        if (this.f20131b == Long.MAX_VALUE) {
            j2 = 0;
        } else if (this.f20133d != -9223372036854775807L) {
            return this.f20132c;
        }
        return j2;
    }

    public final synchronized void h(long j2) {
        this.f20131b = j2;
        this.f20133d = -9223372036854775807L;
        this.f20130a = false;
    }

    public final synchronized void i(boolean z, long j2) {
        if (z) {
            if (!this.f20130a) {
                this.f20131b = j2;
                this.f20130a = true;
            }
            if (j2 != this.f20131b) {
            }
        }
        while (this.f20133d == -9223372036854775807L) {
            wait();
        }
    }
}

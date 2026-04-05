package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class afc extends afh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<aff> f19473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f19475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f19476f;

    public afc(aey aeyVar, long j2, long j3, long j4, long j5, List<aff> list, long j6, long j7, long j8) {
        super(aeyVar, j2, j3);
        this.f19471a = j4;
        this.f19472b = j5;
        this.f19473c = list;
        this.f19474d = j6;
        this.f19475e = j7;
        this.f19476f = j8;
    }

    public final long a(long j2, long j3) {
        long jC = c(j2);
        return jC != -1 ? jC : (int) (e((j3 - this.f19476f) + this.f19474d, j2) - b(j2, j3));
    }

    public final long b(long j2, long j3) {
        if (c(j2) == -1) {
            long j4 = this.f19475e;
            if (j4 != -9223372036854775807L) {
                return Math.max(this.f19471a, e((j3 - this.f19476f) - j4, j2));
            }
        }
        return this.f19471a;
    }

    public abstract long c(long j2);

    public final long d(long j2, long j3) {
        List<aff> list = this.f19473c;
        if (list != null) {
            return (list.get((int) (j2 - this.f19471a)).f19482b * 1000000) / this.f19486i;
        }
        long jC = c(j3);
        return (jC == -1 || j2 != (this.f19471a + jC) + (-1)) ? (this.f19472b * 1000000) / this.f19486i : j3 - f(j2);
    }

    public final long e(long j2, long j3) {
        long j4 = this.f19471a;
        long jC = c(j3);
        if (jC == 0) {
            return j4;
        }
        if (this.f19473c == null) {
            long j5 = this.f19471a + (j2 / ((this.f19472b * 1000000) / this.f19486i));
            return j5 < j4 ? j4 : jC != -1 ? Math.min(j5, (j4 + jC) - 1) : j5;
        }
        long j6 = (jC + j4) - 1;
        long j7 = j4;
        while (j7 <= j6) {
            long j8 = ((j6 - j7) / 2) + j7;
            long jF = f(j8);
            if (jF < j2) {
                j7 = 1 + j8;
            } else {
                if (jF <= j2) {
                    return j8;
                }
                j6 = j8 - 1;
            }
        }
        return j7 == j4 ? j7 : j6;
    }

    public final long f(long j2) {
        List<aff> list = this.f19473c;
        return amn.q(list != null ? list.get((int) (j2 - this.f19471a)).f19481a - this.f19487j : (j2 - this.f19471a) * this.f19472b, 1000000L, this.f19486i);
    }

    public abstract aey g(afb afbVar, long j2);

    public boolean h() {
        return this.f19473c != null;
    }
}

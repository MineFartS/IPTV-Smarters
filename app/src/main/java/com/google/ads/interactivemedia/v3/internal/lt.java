package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class lt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lt f22343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lt f22344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22346d;

    static {
        lt ltVar = new lt(0L, 0L);
        f22343a = ltVar;
        new lt(Long.MAX_VALUE, Long.MAX_VALUE);
        new lt(Long.MAX_VALUE, 0L);
        new lt(0L, Long.MAX_VALUE);
        f22344b = ltVar;
    }

    public lt(long j2, long j3) {
        ajr.d(j2 >= 0);
        ajr.d(j3 >= 0);
        this.f22345c = j2;
        this.f22346d = j3;
    }

    public final long a(long j2, long j3, long j4) {
        long j5 = this.f22345c;
        if (j5 == 0 && this.f22346d == 0) {
            return j2;
        }
        long jAq = amn.aq(j2, j5);
        long jAg = amn.ag(j2, this.f22346d);
        boolean z = jAq <= j3 && j3 <= jAg;
        boolean z2 = jAq <= j4 && j4 <= jAg;
        return (z && z2) ? Math.abs(j3 - j2) <= Math.abs(j4 - j2) ? j3 : j4 : z ? j3 : z2 ? j4 : jAq;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lt.class == obj.getClass()) {
            lt ltVar = (lt) obj;
            if (this.f22345c == ltVar.f22345c && this.f22346d == ltVar.f22346d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f22345c) * 31) + ((int) this.f22346d);
    }
}

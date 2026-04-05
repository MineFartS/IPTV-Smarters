package c.f.a.b.j3;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Long> f9287d = new ThreadLocal<>();

    public u0(long j2) {
        g(j2);
    }

    public static long f(long j2) {
        return (j2 * 1000000) / 90000;
    }

    public static long i(long j2) {
        return (j2 * 90000) / 1000000;
    }

    public static long j(long j2) {
        return i(j2) % IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
    }

    public synchronized long a(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f9285b == -9223372036854775807L) {
            long jLongValue = this.f9284a;
            if (jLongValue == 9223372036854775806L) {
                jLongValue = ((Long) g.e(this.f9287d.get())).longValue();
            }
            this.f9285b = jLongValue - j2;
            notifyAll();
        }
        this.f9286c = j2;
        return j2 + this.f9285b;
    }

    public synchronized long b(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f9286c;
        if (j3 != -9223372036854775807L) {
            long jI = i(j3);
            long j4 = (IjkMediaMeta.AV_CH_WIDE_RIGHT + jI) / IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
            long j5 = ((j4 - 1) * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT) + j2;
            j2 += j4 * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
            if (Math.abs(j5 - jI) < Math.abs(j2 - jI)) {
                j2 = j5;
            }
        }
        return a(f(j2));
    }

    public synchronized long c() {
        long j2;
        j2 = this.f9284a;
        if (j2 == Long.MAX_VALUE || j2 == 9223372036854775806L) {
            j2 = -9223372036854775807L;
        }
        return j2;
    }

    public synchronized long d() {
        long j2;
        j2 = this.f9286c;
        return j2 != -9223372036854775807L ? j2 + this.f9285b : c();
    }

    public synchronized long e() {
        return this.f9285b;
    }

    public synchronized void g(long j2) {
        this.f9284a = j2;
        this.f9285b = j2 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f9286c = -9223372036854775807L;
    }

    public synchronized void h(boolean z, long j2) {
        g.g(this.f9284a == 9223372036854775806L);
        if (this.f9285b != -9223372036854775807L) {
            return;
        }
        if (z) {
            this.f9287d.set(Long.valueOf(j2));
        } else {
            while (this.f9285b == -9223372036854775807L) {
                wait();
            }
        }
    }
}

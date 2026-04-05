package c.f.a.b.z2;

import c.f.a.b.j3.x0;
import c.f.a.b.z2.x;

/* JADX INFO: loaded from: classes2.dex */
public class f implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10726f;

    public f(long j2, long j3, int i2, int i3) {
        long jE;
        this.f10721a = j2;
        this.f10722b = j3;
        this.f10723c = i3 == -1 ? 1 : i3;
        this.f10725e = i2;
        if (j2 == -1) {
            this.f10724d = -1L;
            jE = -9223372036854775807L;
        } else {
            this.f10724d = j2 - j3;
            jE = e(j2, j3, i2);
        }
        this.f10726f = jE;
    }

    public static long e(long j2, long j3, int i2) {
        return ((Math.max(0L, j2 - j3) * 8) * 1000000) / ((long) i2);
    }

    public final long a(long j2) {
        long j3 = (j2 * ((long) this.f10725e)) / 8000000;
        int i2 = this.f10723c;
        return this.f10722b + x0.s((j3 / ((long) i2)) * ((long) i2), 0L, this.f10724d - ((long) i2));
    }

    public long c(long j2) {
        return e(j2, this.f10722b, this.f10725e);
    }

    @Override // c.f.a.b.z2.x
    public boolean f() {
        return this.f10724d != -1;
    }

    @Override // c.f.a.b.z2.x
    public x.a h(long j2) {
        if (this.f10724d == -1) {
            return new x.a(new y(0L, this.f10722b));
        }
        long jA = a(j2);
        long jC = c(jA);
        y yVar = new y(jC, jA);
        if (jC < j2) {
            int i2 = this.f10723c;
            if (((long) i2) + jA < this.f10721a) {
                long j3 = jA + ((long) i2);
                return new x.a(yVar, new y(c(j3), j3));
            }
        }
        return new x.a(yVar);
    }

    @Override // c.f.a.b.z2.x
    public long i() {
        return this.f10726f;
    }
}

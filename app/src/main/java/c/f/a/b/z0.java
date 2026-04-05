package c.f.a.b;

import android.os.SystemClock;
import c.f.a.b.p1;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f10604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f10608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f10611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f10612o;
    public float p;
    public long q;
    public long r;
    public long s;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f10613a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f10614b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f10615c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f10616d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f10617e = w0.d(20);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f10618f = w0.d(500);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f10619g = 0.999f;

        public z0 a() {
            return new z0(this.f10613a, this.f10614b, this.f10615c, this.f10616d, this.f10617e, this.f10618f, this.f10619g);
        }
    }

    public z0(float f2, float f3, long j2, float f4, long j3, long j4, float f5) {
        this.f10598a = f2;
        this.f10599b = f3;
        this.f10600c = j2;
        this.f10601d = f4;
        this.f10602e = j3;
        this.f10603f = j4;
        this.f10604g = f5;
        this.f10605h = -9223372036854775807L;
        this.f10606i = -9223372036854775807L;
        this.f10608k = -9223372036854775807L;
        this.f10609l = -9223372036854775807L;
        this.f10612o = f2;
        this.f10611n = f3;
        this.p = 1.0f;
        this.q = -9223372036854775807L;
        this.f10607j = -9223372036854775807L;
        this.f10610m = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
    }

    public static long h(long j2, long j3, float f2) {
        return (long) ((j2 * f2) + ((1.0f - f2) * j3));
    }

    @Override // c.f.a.b.n1
    public void a(p1.f fVar) {
        this.f10605h = w0.d(fVar.f9680c);
        this.f10608k = w0.d(fVar.f9681d);
        this.f10609l = w0.d(fVar.f9682e);
        float f2 = fVar.f9683f;
        if (f2 == -3.4028235E38f) {
            f2 = this.f10598a;
        }
        this.f10612o = f2;
        float f3 = fVar.f9684g;
        if (f3 == -3.4028235E38f) {
            f3 = this.f10599b;
        }
        this.f10611n = f3;
        g();
    }

    @Override // c.f.a.b.n1
    public float b(long j2, long j3) {
        if (this.f10605h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j2, j3);
        if (this.q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.q < this.f10600c) {
            return this.p;
        }
        this.q = SystemClock.elapsedRealtime();
        f(j2);
        long j4 = j2 - this.f10610m;
        if (Math.abs(j4) < this.f10602e) {
            this.p = 1.0f;
        } else {
            this.p = c.f.a.b.j3.x0.q((this.f10601d * j4) + 1.0f, this.f10612o, this.f10611n);
        }
        return this.p;
    }

    @Override // c.f.a.b.n1
    public long c() {
        return this.f10610m;
    }

    @Override // c.f.a.b.n1
    public void d() {
        long j2 = this.f10610m;
        if (j2 == -9223372036854775807L) {
            return;
        }
        long j3 = j2 + this.f10603f;
        this.f10610m = j3;
        long j4 = this.f10609l;
        if (j4 != -9223372036854775807L && j3 > j4) {
            this.f10610m = j4;
        }
        this.q = -9223372036854775807L;
    }

    @Override // c.f.a.b.n1
    public void e(long j2) {
        this.f10606i = j2;
        g();
    }

    public final void f(long j2) {
        long j3 = this.r + (this.s * 3);
        if (this.f10610m > j3) {
            float fD = w0.d(this.f10600c);
            this.f10610m = c.f.b.f.d.c(j3, this.f10607j, this.f10610m - (((long) ((this.p - 1.0f) * fD)) + ((long) ((this.f10611n - 1.0f) * fD))));
            return;
        }
        long jS = c.f.a.b.j3.x0.s(j2 - ((long) (Math.max(0.0f, this.p - 1.0f) / this.f10601d)), this.f10610m, j3);
        this.f10610m = jS;
        long j4 = this.f10609l;
        if (j4 == -9223372036854775807L || jS <= j4) {
            return;
        }
        this.f10610m = j4;
    }

    public final void g() {
        long j2 = this.f10605h;
        if (j2 != -9223372036854775807L) {
            long j3 = this.f10606i;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            long j4 = this.f10608k;
            if (j4 != -9223372036854775807L && j2 < j4) {
                j2 = j4;
            }
            long j5 = this.f10609l;
            if (j5 != -9223372036854775807L && j2 > j5) {
                j2 = j5;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (this.f10607j == j2) {
            return;
        }
        this.f10607j = j2;
        this.f10610m = j2;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    public final void i(long j2, long j3) {
        long jH;
        long j4 = j2 - j3;
        long j5 = this.r;
        if (j5 == -9223372036854775807L) {
            this.r = j4;
            jH = 0;
        } else {
            long jMax = Math.max(j4, h(j5, j4, this.f10604g));
            this.r = jMax;
            jH = h(this.s, Math.abs(j4 - jMax), this.f10604g);
        }
        this.s = jH;
    }
}

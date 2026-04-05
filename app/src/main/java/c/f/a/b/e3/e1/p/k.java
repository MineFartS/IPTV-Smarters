package c.f.a.b.e3.e1.p;

import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f7215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7217c;

    public static abstract class a extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f7218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f7219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<d> f7220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f7221g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f7222h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f7223i;

        public a(i iVar, long j2, long j3, long j4, long j5, List<d> list, long j6, long j7, long j8) {
            super(iVar, j2, j3);
            this.f7218d = j4;
            this.f7219e = j5;
            this.f7220f = list;
            this.f7223i = j6;
            this.f7221g = j7;
            this.f7222h = j8;
        }

        public long c(long j2, long j3) {
            long jG = g(j2);
            return jG != -1 ? jG : (int) (i((j3 - this.f7222h) + this.f7223i, j2) - d(j2, j3));
        }

        public long d(long j2, long j3) {
            if (g(j2) == -1) {
                long j4 = this.f7221g;
                if (j4 != -9223372036854775807L) {
                    return Math.max(e(), i((j3 - this.f7222h) - j4, j2));
                }
            }
            return e();
        }

        public long e() {
            return this.f7218d;
        }

        public long f(long j2, long j3) {
            if (this.f7220f != null) {
                return -9223372036854775807L;
            }
            long jD = d(j2, j3) + c(j2, j3);
            return (j(jD) + h(jD, j2)) - this.f7223i;
        }

        public abstract long g(long j2);

        public final long h(long j2, long j3) {
            List<d> list = this.f7220f;
            if (list != null) {
                return (list.get((int) (j2 - this.f7218d)).f7229b * 1000000) / this.f7216b;
            }
            long jG = g(j3);
            return (jG == -1 || j2 != (e() + jG) - 1) ? (this.f7219e * 1000000) / this.f7216b : j3 - j(j2);
        }

        public long i(long j2, long j3) {
            long jE = e();
            long jG = g(j3);
            if (jG == 0) {
                return jE;
            }
            if (this.f7220f == null) {
                long j4 = this.f7218d + (j2 / ((this.f7219e * 1000000) / this.f7216b));
                return j4 < jE ? jE : jG == -1 ? j4 : Math.min(j4, (jE + jG) - 1);
            }
            long j5 = (jG + jE) - 1;
            long j6 = jE;
            while (j6 <= j5) {
                long j7 = ((j5 - j6) / 2) + j6;
                long j8 = j(j7);
                if (j8 < j2) {
                    j6 = j7 + 1;
                } else {
                    if (j8 <= j2) {
                        return j7;
                    }
                    j5 = j7 - 1;
                }
            }
            return j6 == jE ? j6 : j5;
        }

        public final long j(long j2) {
            List<d> list = this.f7220f;
            return x0.P0(list != null ? list.get((int) (j2 - this.f7218d)).f7228a - this.f7217c : (j2 - this.f7218d) * this.f7219e, 1000000L, this.f7216b);
        }

        public abstract i k(j jVar, long j2);

        public boolean l() {
            return this.f7220f != null;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List<i> f7224j;

        public b(i iVar, long j2, long j3, long j4, long j5, List<d> list, long j6, List<i> list2, long j7, long j8) {
            super(iVar, j2, j3, j4, j5, list, j6, j7, j8);
            this.f7224j = list2;
        }

        @Override // c.f.a.b.e3.e1.p.k.a
        public long g(long j2) {
            return this.f7224j.size();
        }

        @Override // c.f.a.b.e3.e1.p.k.a
        public i k(j jVar, long j2) {
            return this.f7224j.get((int) (j2 - this.f7218d));
        }

        @Override // c.f.a.b.e3.e1.p.k.a
        public boolean l() {
            return true;
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final n f7225j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final n f7226k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f7227l;

        public c(i iVar, long j2, long j3, long j4, long j5, long j6, List<d> list, long j7, n nVar, n nVar2, long j8, long j9) {
            super(iVar, j2, j3, j4, j6, list, j7, j8, j9);
            this.f7225j = nVar;
            this.f7226k = nVar2;
            this.f7227l = j5;
        }

        @Override // c.f.a.b.e3.e1.p.k
        public i a(j jVar) {
            n nVar = this.f7225j;
            if (nVar == null) {
                return super.a(jVar);
            }
            k1 k1Var = jVar.f7204b;
            return new i(nVar.a(k1Var.f9327b, 0L, k1Var.f9334i, 0L), 0L, -1L);
        }

        @Override // c.f.a.b.e3.e1.p.k.a
        public long g(long j2) {
            if (this.f7220f != null) {
                return r0.size();
            }
            long j3 = this.f7227l;
            if (j3 != -1) {
                return (j3 - this.f7218d) + 1;
            }
            if (j2 != -9223372036854775807L) {
                return c.f.b.e.a.a(BigInteger.valueOf(j2).multiply(BigInteger.valueOf(this.f7216b)), BigInteger.valueOf(this.f7219e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // c.f.a.b.e3.e1.p.k.a
        public i k(j jVar, long j2) {
            List<d> list = this.f7220f;
            long j3 = list != null ? list.get((int) (j2 - this.f7218d)).f7228a : (j2 - this.f7218d) * this.f7219e;
            n nVar = this.f7226k;
            k1 k1Var = jVar.f7204b;
            return new i(nVar.a(k1Var.f9327b, j2, k1Var.f9334i, j3), 0L, -1L);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7229b;

        public d(long j2, long j3) {
            this.f7228a = j2;
            this.f7229b = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f7228a == dVar.f7228a && this.f7229b == dVar.f7229b;
        }

        public int hashCode() {
            return (((int) this.f7228a) * 31) + ((int) this.f7229b);
        }
    }

    public static class e extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f7230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f7231e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(i iVar, long j2, long j3, long j4, long j5) {
            super(iVar, j2, j3);
            this.f7230d = j4;
            this.f7231e = j5;
        }

        public i c() {
            long j2 = this.f7231e;
            if (j2 <= 0) {
                return null;
            }
            return new i(null, this.f7230d, j2);
        }
    }

    public k(i iVar, long j2, long j3) {
        this.f7215a = iVar;
        this.f7216b = j2;
        this.f7217c = j3;
    }

    public i a(j jVar) {
        return this.f7215a;
    }

    public long b() {
        return x0.P0(this.f7217c, 1000000L, this.f7216b);
    }
}

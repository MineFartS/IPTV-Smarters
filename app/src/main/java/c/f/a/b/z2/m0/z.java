package c.f.a.b.z2.m0;

import c.f.a.b.j3.u0;
import c.f.a.b.j3.x0;
import c.f.a.b.z2.b;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends c.f.a.b.z2.b {

    public static final class b implements b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u0 f11447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.f.a.b.j3.i0 f11448b;

        public b(u0 u0Var) {
            this.f11447a = u0Var;
            this.f11448b = new c.f.a.b.j3.i0();
        }

        public static void d(c.f.a.b.j3.i0 i0Var) {
            int iK;
            int iF = i0Var.f();
            if (i0Var.a() < 10) {
                i0Var.P(iF);
                return;
            }
            i0Var.Q(9);
            int iD = i0Var.D() & 7;
            if (i0Var.a() < iD) {
                i0Var.P(iF);
                return;
            }
            i0Var.Q(iD);
            if (i0Var.a() < 4) {
                i0Var.P(iF);
                return;
            }
            if (z.k(i0Var.d(), i0Var.e()) == 443) {
                i0Var.Q(4);
                int iJ = i0Var.J();
                if (i0Var.a() < iJ) {
                    i0Var.P(iF);
                    return;
                }
                i0Var.Q(iJ);
            }
            while (i0Var.a() >= 4 && (iK = z.k(i0Var.d(), i0Var.e())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                i0Var.Q(4);
                if (i0Var.a() < 2) {
                    i0Var.P(iF);
                    return;
                }
                i0Var.P(Math.min(i0Var.f(), i0Var.e() + i0Var.J()));
            }
        }

        @Override // c.f.a.b.z2.b.f
        public void a() {
            this.f11448b.M(x0.f9301f);
        }

        @Override // c.f.a.b.z2.b.f
        public b.e b(c.f.a.b.z2.k kVar, long j2) {
            long position = kVar.getPosition();
            int iMin = (int) Math.min(20000L, kVar.getLength() - position);
            this.f11448b.L(iMin);
            kVar.u(this.f11448b.d(), 0, iMin);
            return c(this.f11448b, j2, position);
        }

        public final b.e c(c.f.a.b.j3.i0 i0Var, long j2, long j3) {
            int iE = -1;
            long j4 = -9223372036854775807L;
            int iE2 = -1;
            while (i0Var.a() >= 4) {
                if (z.k(i0Var.d(), i0Var.e()) != 442) {
                    i0Var.Q(1);
                } else {
                    i0Var.Q(4);
                    long jL = a0.l(i0Var);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f11447a.b(jL);
                        if (jB > j2) {
                            return j4 == -9223372036854775807L ? b.e.d(jB, j3) : b.e.e(j3 + ((long) iE2));
                        }
                        if (100000 + jB > j2) {
                            return b.e.e(j3 + ((long) i0Var.e()));
                        }
                        iE2 = i0Var.e();
                        j4 = jB;
                    }
                    d(i0Var);
                    iE = i0Var.e();
                }
            }
            return j4 != -9223372036854775807L ? b.e.f(j4, j3 + ((long) iE)) : b.e.f10649a;
        }
    }

    public z(u0 u0Var, long j2, long j3) {
        super(new b.C0145b(), new b(u0Var), j2, 0L, j2 + 1, 0L, j3, 188L, 1000);
    }

    public static int k(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }
}

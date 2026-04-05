package c.f.a.b.z2.m0;

import c.f.a.b.j3.u0;
import c.f.a.b.j3.x0;
import c.f.a.b.z2.b;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends c.f.a.b.z2.b {

    public static final class a implements b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u0 f11151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.f.a.b.j3.i0 f11152b = new c.f.a.b.j3.i0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f11154d;

        public a(int i2, u0 u0Var, int i3) {
            this.f11153c = i2;
            this.f11151a = u0Var;
            this.f11154d = i3;
        }

        @Override // c.f.a.b.z2.b.f
        public void a() {
            this.f11152b.M(x0.f9301f);
        }

        @Override // c.f.a.b.z2.b.f
        public b.e b(c.f.a.b.z2.k kVar, long j2) {
            long position = kVar.getPosition();
            int iMin = (int) Math.min(this.f11154d, kVar.getLength() - position);
            this.f11152b.L(iMin);
            kVar.u(this.f11152b.d(), 0, iMin);
            return c(this.f11152b, j2, position);
        }

        public final b.e c(c.f.a.b.j3.i0 i0Var, long j2, long j3) {
            int iA;
            int iA2;
            int iF = i0Var.f();
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (i0Var.a() >= 188 && (iA2 = (iA = j0.a(i0Var.d(), i0Var.e(), iF)) + 188) <= iF) {
                long jC = j0.c(i0Var, iA, this.f11153c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f11151a.b(jC);
                    if (jB > j2) {
                        return j6 == -9223372036854775807L ? b.e.d(jB, j3) : b.e.e(j3 + j5);
                    }
                    if (100000 + jB > j2) {
                        return b.e.e(j3 + ((long) iA));
                    }
                    j5 = iA;
                    j6 = jB;
                }
                i0Var.P(iA2);
                j4 = iA2;
            }
            return j6 != -9223372036854775807L ? b.e.f(j6, j3 + j4) : b.e.f10649a;
        }
    }

    public f0(u0 u0Var, long j2, long j3, int i2, int i3) {
        super(new b.C0145b(), new a(i2, u0Var, i3), j2, 0L, j2 + 1, 0L, j3, 188L, 940);
    }
}

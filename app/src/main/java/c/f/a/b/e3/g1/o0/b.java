package c.f.a.b.e3.g1.o0;

import c.f.a.b.e3.g1.q;
import c.f.a.b.j3.g;
import c.f.a.b.j3.h0;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.l;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f7630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f7631b = new h0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f7637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7638i;

    public b(q qVar) {
        int i2;
        this.f7630a = qVar;
        this.f7632c = qVar.f7662b;
        String str = (String) g.e(qVar.f7664d.get("mode"));
        if (c.f.b.a.b.a(str, "AAC-hbr")) {
            this.f7633d = 13;
            i2 = 3;
        } else {
            if (!c.f.b.a.b.a(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f7633d = 6;
            i2 = 2;
        }
        this.f7634e = i2;
        this.f7635f = this.f7634e + this.f7633d;
    }

    public static void e(a0 a0Var, long j2, int i2) {
        a0Var.d(j2, 1, i2, 0, null);
    }

    public static long f(long j2, long j3, long j4, int i2) {
        return j2 + x0.P0(j3 - j4, 1000000L, i2);
    }

    @Override // c.f.a.b.e3.g1.o0.e
    public void a(long j2, long j3) {
        this.f7636g = j2;
        this.f7638i = j3;
    }

    @Override // c.f.a.b.e3.g1.o0.e
    public void b(i0 i0Var, long j2, int i2, boolean z) {
        g.e(this.f7637h);
        short sZ = i0Var.z();
        int i3 = sZ / this.f7635f;
        long jF = f(this.f7638i, j2, this.f7636g, this.f7632c);
        this.f7631b.m(i0Var);
        if (i3 == 1) {
            int iH = this.f7631b.h(this.f7633d);
            this.f7631b.r(this.f7634e);
            this.f7637h.c(i0Var, i0Var.a());
            if (z) {
                e(this.f7637h, jF, iH);
                return;
            }
            return;
        }
        i0Var.Q((sZ + 7) / 8);
        for (int i4 = 0; i4 < i3; i4++) {
            int iH2 = this.f7631b.h(this.f7633d);
            this.f7631b.r(this.f7634e);
            this.f7637h.c(i0Var, iH2);
            e(this.f7637h, jF, iH2);
            jF += x0.P0(i3, 1000000L, this.f7632c);
        }
    }

    @Override // c.f.a.b.e3.g1.o0.e
    public void c(long j2, int i2) {
        this.f7636g = j2;
    }

    @Override // c.f.a.b.e3.g1.o0.e
    public void d(l lVar, int i2) {
        a0 a0VarE = lVar.e(i2, 1);
        this.f7637h = a0VarE;
        a0VarE.e(this.f7630a.f7663c);
    }
}

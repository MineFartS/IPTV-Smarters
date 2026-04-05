package c.f.a.b.e3;

import c.f.a.b.e3.f0;
import c.f.a.b.e3.i0;
import c.f.a.b.m2;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements f0, f0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.a f6910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.i3.f f6912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i0 f6913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f0 f6914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0.a f6915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f6916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f6918j = -9223372036854775807L;

    public interface a {
        void a(i0.a aVar);

        void b(i0.a aVar, IOException iOException);
    }

    public b0(i0.a aVar, c.f.a.b.i3.f fVar, long j2) {
        this.f6910b = aVar;
        this.f6912d = fVar;
        this.f6911c = j2;
    }

    public void a(i0.a aVar) {
        long jP = p(this.f6911c);
        f0 f0VarA = ((i0) c.f.a.b.j3.g.e(this.f6913e)).a(aVar, this.f6912d, jP);
        this.f6914f = f0VarA;
        if (this.f6915g != null) {
            f0VarA.r(this, jP);
        }
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long b() {
        return ((f0) c.f.a.b.j3.x0.i(this.f6914f)).b();
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean c(long j2) {
        f0 f0Var = this.f6914f;
        return f0Var != null && f0Var.c(j2);
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean d() {
        f0 f0Var = this.f6914f;
        return f0Var != null && f0Var.d();
    }

    public long e() {
        return this.f6918j;
    }

    @Override // c.f.a.b.e3.f0
    public long f(long j2, m2 m2Var) {
        return ((f0) c.f.a.b.j3.x0.i(this.f6914f)).f(j2, m2Var);
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long g() {
        return ((f0) c.f.a.b.j3.x0.i(this.f6914f)).g();
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public void h(long j2) {
        ((f0) c.f.a.b.j3.x0.i(this.f6914f)).h(j2);
    }

    @Override // c.f.a.b.e3.f0.a
    public void k(f0 f0Var) {
        ((f0.a) c.f.a.b.j3.x0.i(this.f6915g)).k(this);
        a aVar = this.f6916h;
        if (aVar != null) {
            aVar.a(this.f6910b);
        }
    }

    @Override // c.f.a.b.e3.f0
    public /* synthetic */ List l(List list) {
        return e0.a(this, list);
    }

    public long m() {
        return this.f6911c;
    }

    @Override // c.f.a.b.e3.f0
    public void n() throws IOException {
        try {
            f0 f0Var = this.f6914f;
            if (f0Var != null) {
                f0Var.n();
            } else {
                i0 i0Var = this.f6913e;
                if (i0Var != null) {
                    i0Var.l();
                }
            }
        } catch (IOException e2) {
            a aVar = this.f6916h;
            if (aVar == null) {
                throw e2;
            }
            if (this.f6917i) {
                return;
            }
            this.f6917i = true;
            aVar.b(this.f6910b, e2);
        }
    }

    @Override // c.f.a.b.e3.f0
    public long o(long j2) {
        return ((f0) c.f.a.b.j3.x0.i(this.f6914f)).o(j2);
    }

    public final long p(long j2) {
        long j3 = this.f6918j;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // c.f.a.b.e3.f0
    public long q() {
        return ((f0) c.f.a.b.j3.x0.i(this.f6914f)).q();
    }

    @Override // c.f.a.b.e3.f0
    public void r(f0.a aVar, long j2) {
        this.f6915g = aVar;
        f0 f0Var = this.f6914f;
        if (f0Var != null) {
            f0Var.r(this, p(this.f6911c));
        }
    }

    @Override // c.f.a.b.e3.f0
    public long s(c.f.a.b.g3.h[] hVarArr, boolean[] zArr, s0[] s0VarArr, boolean[] zArr2, long j2) {
        long j3;
        long j4 = this.f6918j;
        if (j4 == -9223372036854775807L || j2 != this.f6911c) {
            j3 = j2;
        } else {
            this.f6918j = -9223372036854775807L;
            j3 = j4;
        }
        return ((f0) c.f.a.b.j3.x0.i(this.f6914f)).s(hVarArr, zArr, s0VarArr, zArr2, j3);
    }

    @Override // c.f.a.b.e3.f0
    public a1 t() {
        return ((f0) c.f.a.b.j3.x0.i(this.f6914f)).t();
    }

    @Override // c.f.a.b.e3.t0.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void i(f0 f0Var) {
        ((f0.a) c.f.a.b.j3.x0.i(this.f6915g)).i(this);
    }

    @Override // c.f.a.b.e3.f0
    public void v(long j2, boolean z) {
        ((f0) c.f.a.b.j3.x0.i(this.f6914f)).v(j2, z);
    }

    public void w(long j2) {
        this.f6918j = j2;
    }

    public void x() {
        if (this.f6914f != null) {
            ((i0) c.f.a.b.j3.g.e(this.f6913e)).o(this.f6914f);
        }
    }

    public void y(i0 i0Var) {
        c.f.a.b.j3.g.g(this.f6913e == null);
        this.f6913e = i0Var;
    }

    public void z(a aVar) {
        this.f6916h = aVar;
    }
}

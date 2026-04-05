package c.f.a.b.z2.k0;

import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.k;
import c.f.a.b.z2.l;
import c.f.a.b.z2.w;
import c.f.a.b.z2.x;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f11077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f11078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f11079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11084i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f11086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11088m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f11076a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f11085j = new b();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k1 f11089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f11090b;
    }

    public static final class c implements g {
        public c() {
        }

        @Override // c.f.a.b.z2.k0.g
        public long a(k kVar) {
            return -1L;
        }

        @Override // c.f.a.b.z2.k0.g
        public x b() {
            return new x.b(-9223372036854775807L);
        }

        @Override // c.f.a.b.z2.k0.g
        public void c(long j2) {
        }
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    public final void a() {
        c.f.a.b.j3.g.i(this.f11077b);
        x0.i(this.f11078c);
    }

    public long b(long j2) {
        return (j2 * 1000000) / ((long) this.f11084i);
    }

    public long c(long j2) {
        return (((long) this.f11084i) * j2) / 1000000;
    }

    public void d(l lVar, a0 a0Var) {
        this.f11078c = lVar;
        this.f11077b = a0Var;
        l(true);
    }

    public void e(long j2) {
        this.f11082g = j2;
    }

    public abstract long f(i0 i0Var);

    public final int g(k kVar, w wVar) {
        a();
        int i2 = this.f11083h;
        if (i2 == 0) {
            return j(kVar);
        }
        if (i2 == 1) {
            kVar.s((int) this.f11081f);
            this.f11083h = 2;
            return 0;
        }
        if (i2 == 2) {
            x0.i(this.f11079d);
            return k(kVar, wVar);
        }
        if (i2 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    public final boolean h(k kVar) {
        while (this.f11076a.d(kVar)) {
            this.f11086k = kVar.getPosition() - this.f11081f;
            if (!i(this.f11076a.c(), this.f11081f, this.f11085j)) {
                return true;
            }
            this.f11081f = kVar.getPosition();
        }
        this.f11083h = 3;
        return false;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean i(i0 i0Var, long j2, b bVar);

    @RequiresNonNull({"trackOutput"})
    public final int j(k kVar) {
        if (!h(kVar)) {
            return -1;
        }
        k1 k1Var = this.f11085j.f11089a;
        this.f11084i = k1Var.A;
        if (!this.f11088m) {
            this.f11077b.e(k1Var);
            this.f11088m = true;
        }
        g cVar = this.f11085j.f11090b;
        if (cVar != null) {
            this.f11079d = cVar;
        } else if (kVar.getLength() == -1) {
            cVar = new c();
            this.f11079d = cVar;
        } else {
            f fVarB = this.f11076a.b();
            this.f11079d = new c.f.a.b.z2.k0.b(this, this.f11081f, kVar.getLength(), fVarB.f11070h + fVarB.f11071i, fVarB.f11065c, (fVarB.f11064b & 4) != 0);
        }
        this.f11083h = 2;
        this.f11076a.f();
        return 0;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    public final int k(k kVar, w wVar) {
        long jA = this.f11079d.a(kVar);
        if (jA >= 0) {
            wVar.f11506a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.f11087l) {
            this.f11078c.i((x) c.f.a.b.j3.g.i(this.f11079d.b()));
            this.f11087l = true;
        }
        if (this.f11086k <= 0 && !this.f11076a.d(kVar)) {
            this.f11083h = 3;
            return -1;
        }
        this.f11086k = 0L;
        i0 i0VarC = this.f11076a.c();
        long jF = f(i0VarC);
        if (jF >= 0) {
            long j2 = this.f11082g;
            if (j2 + jF >= this.f11080e) {
                long jB = b(j2);
                this.f11077b.c(i0VarC, i0VarC.f());
                this.f11077b.d(jB, 1, i0VarC.f(), 0, null);
                this.f11080e = -1L;
            }
        }
        this.f11082g += jF;
        return 0;
    }

    public void l(boolean z) {
        int i2;
        if (z) {
            this.f11085j = new b();
            this.f11081f = 0L;
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.f11083h = i2;
        this.f11080e = -1L;
        this.f11082g = 0L;
    }

    public final void m(long j2, long j3) {
        this.f11076a.e();
        if (j2 == 0) {
            l(!this.f11087l);
        } else if (this.f11083h != 0) {
            this.f11080e = c(j3);
            ((g) x0.i(this.f11079d)).c(this.f11080e);
            this.f11083h = 2;
        }
    }
}

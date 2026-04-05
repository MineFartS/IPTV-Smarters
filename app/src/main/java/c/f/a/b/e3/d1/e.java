package c.f.a.b.e3.d1;

import android.util.SparseArray;
import c.f.a.b.e3.d1.g;
import c.f.a.b.j3.d0;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.w;
import c.f.a.b.z2.x;
import c.f.a.b.z2.z;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements c.f.a.b.z2.l, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g.a f7004b = new g.a() { // from class: c.f.a.b.e3.d1.a
        @Override // c.f.a.b.e3.d1.g.a
        public final g a(int i2, k1 k1Var, boolean z, List list, a0 a0Var) {
            return e.f(i2, k1Var, z, list, a0Var);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f7005c = new w();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.z2.j f7006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f7008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray<a> f7009g = new SparseArray<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g.b f7011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f7012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x f7013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k1[] f7014l;

    public static final class a implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k1 f7017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c.f.a.b.z2.i f7018d = new c.f.a.b.z2.i();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public k1 f7019e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public a0 f7020f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f7021g;

        public a(int i2, int i3, k1 k1Var) {
            this.f7015a = i2;
            this.f7016b = i3;
            this.f7017c = k1Var;
        }

        @Override // c.f.a.b.z2.a0
        public int a(c.f.a.b.i3.l lVar, int i2, boolean z, int i3) {
            return ((a0) x0.i(this.f7020f)).b(lVar, i2, z);
        }

        @Override // c.f.a.b.z2.a0
        public /* synthetic */ int b(c.f.a.b.i3.l lVar, int i2, boolean z) {
            return z.a(this, lVar, i2, z);
        }

        @Override // c.f.a.b.z2.a0
        public /* synthetic */ void c(i0 i0Var, int i2) {
            z.b(this, i0Var, i2);
        }

        @Override // c.f.a.b.z2.a0
        public void d(long j2, int i2, int i3, int i4, a0.a aVar) {
            long j3 = this.f7021g;
            if (j3 != -9223372036854775807L && j2 >= j3) {
                this.f7020f = this.f7018d;
            }
            ((a0) x0.i(this.f7020f)).d(j2, i2, i3, i4, aVar);
        }

        @Override // c.f.a.b.z2.a0
        public void e(k1 k1Var) {
            k1 k1Var2 = this.f7017c;
            if (k1Var2 != null) {
                k1Var = k1Var.h(k1Var2);
            }
            this.f7019e = k1Var;
            ((a0) x0.i(this.f7020f)).e(this.f7019e);
        }

        @Override // c.f.a.b.z2.a0
        public void f(i0 i0Var, int i2, int i3) {
            ((a0) x0.i(this.f7020f)).c(i0Var, i2);
        }

        public void g(g.b bVar, long j2) {
            if (bVar == null) {
                this.f7020f = this.f7018d;
                return;
            }
            this.f7021g = j2;
            a0 a0VarE = bVar.e(this.f7015a, this.f7016b);
            this.f7020f = a0VarE;
            k1 k1Var = this.f7019e;
            if (k1Var != null) {
                a0VarE.e(k1Var);
            }
        }
    }

    public e(c.f.a.b.z2.j jVar, int i2, k1 k1Var) {
        this.f7006d = jVar;
        this.f7007e = i2;
        this.f7008f = k1Var;
    }

    public static /* synthetic */ g f(int i2, k1 k1Var, boolean z, List list, a0 a0Var) {
        c.f.a.b.z2.j iVar;
        String str = k1Var.f9337l;
        if (d0.r(str)) {
            if (!"application/x-rawcc".equals(str)) {
                return null;
            }
            iVar = new c.f.a.b.z2.l0.a(k1Var);
        } else if (d0.q(str)) {
            iVar = new c.f.a.b.z2.h0.e(1);
        } else {
            iVar = new c.f.a.b.z2.j0.i(z ? 4 : 0, null, null, list, a0Var);
        }
        return new e(iVar, i2, k1Var);
    }

    @Override // c.f.a.b.e3.d1.g
    public boolean a(c.f.a.b.z2.k kVar) {
        int iG = this.f7006d.g(kVar, f7005c);
        c.f.a.b.j3.g.g(iG != 1);
        return iG == 0;
    }

    @Override // c.f.a.b.e3.d1.g
    public k1[] b() {
        return this.f7014l;
    }

    @Override // c.f.a.b.e3.d1.g
    public void c(g.b bVar, long j2, long j3) {
        this.f7011i = bVar;
        this.f7012j = j3;
        if (!this.f7010h) {
            this.f7006d.c(this);
            if (j2 != -9223372036854775807L) {
                this.f7006d.a(0L, j2);
            }
            this.f7010h = true;
            return;
        }
        c.f.a.b.z2.j jVar = this.f7006d;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        jVar.a(0L, j2);
        for (int i2 = 0; i2 < this.f7009g.size(); i2++) {
            this.f7009g.valueAt(i2).g(bVar, j3);
        }
    }

    @Override // c.f.a.b.e3.d1.g
    public c.f.a.b.z2.e d() {
        x xVar = this.f7013k;
        if (xVar instanceof c.f.a.b.z2.e) {
            return (c.f.a.b.z2.e) xVar;
        }
        return null;
    }

    @Override // c.f.a.b.z2.l
    public a0 e(int i2, int i3) {
        a aVar = this.f7009g.get(i2);
        if (aVar == null) {
            c.f.a.b.j3.g.g(this.f7014l == null);
            aVar = new a(i2, i3, i3 == this.f7007e ? this.f7008f : null);
            aVar.g(this.f7011i, this.f7012j);
            this.f7009g.put(i2, aVar);
        }
        return aVar;
    }

    @Override // c.f.a.b.z2.l
    public void i(x xVar) {
        this.f7013k = xVar;
    }

    @Override // c.f.a.b.z2.l
    public void p() {
        k1[] k1VarArr = new k1[this.f7009g.size()];
        for (int i2 = 0; i2 < this.f7009g.size(); i2++) {
            k1VarArr[i2] = (k1) c.f.a.b.j3.g.i(this.f7009g.valueAt(i2).f7019e);
        }
        this.f7014l = k1VarArr;
    }

    @Override // c.f.a.b.e3.d1.g
    public void release() {
        this.f7006d.release();
    }
}

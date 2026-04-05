package c.f.a.b.z2.m0;

import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.t2.n;
import c.f.a.b.z2.m0.i0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.b.j3.h0 f11155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.f.a.b.z2.a0 f11159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k1 f11164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11166l;

    public g() {
        this(null);
    }

    public g(String str) {
        c.f.a.b.j3.h0 h0Var = new c.f.a.b.j3.h0(new byte[128]);
        this.f11155a = h0Var;
        this.f11156b = new c.f.a.b.j3.i0(h0Var.f9198a);
        this.f11160f = 0;
        this.f11157c = str;
    }

    public final boolean a(c.f.a.b.j3.i0 i0Var, byte[] bArr, int i2) {
        int iMin = Math.min(i0Var.a(), i2 - this.f11161g);
        i0Var.j(bArr, this.f11161g, iMin);
        int i3 = this.f11161g + iMin;
        this.f11161g = i3;
        return i3 == i2;
    }

    @Override // c.f.a.b.z2.m0.o
    public void b(c.f.a.b.j3.i0 i0Var) {
        c.f.a.b.j3.g.i(this.f11159e);
        while (i0Var.a() > 0) {
            int i2 = this.f11160f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int iMin = Math.min(i0Var.a(), this.f11165k - this.f11161g);
                        this.f11159e.c(i0Var, iMin);
                        int i3 = this.f11161g + iMin;
                        this.f11161g = i3;
                        int i4 = this.f11165k;
                        if (i3 == i4) {
                            this.f11159e.d(this.f11166l, 1, i4, 0, null);
                            this.f11166l += this.f11163i;
                            this.f11160f = 0;
                        }
                    }
                } else if (a(i0Var, this.f11156b.d(), 128)) {
                    g();
                    this.f11156b.P(0);
                    this.f11159e.c(this.f11156b, 128);
                    this.f11160f = 2;
                }
            } else if (h(i0Var)) {
                this.f11160f = 1;
                this.f11156b.d()[0] = 11;
                this.f11156b.d()[1] = 119;
                this.f11161g = 2;
            }
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void c() {
        this.f11160f = 0;
        this.f11161g = 0;
        this.f11162h = false;
    }

    @Override // c.f.a.b.z2.m0.o
    public void d() {
    }

    @Override // c.f.a.b.z2.m0.o
    public void e(c.f.a.b.z2.l lVar, i0.d dVar) {
        dVar.a();
        this.f11158d = dVar.b();
        this.f11159e = lVar.e(dVar.c(), 1);
    }

    @Override // c.f.a.b.z2.m0.o
    public void f(long j2, int i2) {
        this.f11166l = j2;
    }

    @RequiresNonNull({"output"})
    public final void g() {
        this.f11155a.p(0);
        n.b bVarE = c.f.a.b.t2.n.e(this.f11155a);
        k1 k1Var = this.f11164j;
        if (k1Var == null || bVarE.f10138d != k1Var.z || bVarE.f10137c != k1Var.A || !x0.b(bVarE.f10135a, k1Var.f9338m)) {
            k1 k1VarE = new k1.b().S(this.f11158d).e0(bVarE.f10135a).H(bVarE.f10138d).f0(bVarE.f10137c).V(this.f11157c).E();
            this.f11164j = k1VarE;
            this.f11159e.e(k1VarE);
        }
        this.f11165k = bVarE.f10139e;
        this.f11163i = (((long) bVarE.f10140f) * 1000000) / ((long) this.f11164j.A);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(c.f.a.b.j3.i0 r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6.a()
            r1 = 0
            if (r0 <= 0) goto L26
            boolean r0 = r5.f11162h
            r2 = 11
            r3 = 1
            if (r0 != 0) goto L18
            int r0 = r6.D()
            if (r0 != r2) goto L15
        L14:
            r1 = 1
        L15:
            r5.f11162h = r1
            goto L0
        L18:
            int r0 = r6.D()
            r4 = 119(0x77, float:1.67E-43)
            if (r0 != r4) goto L23
            r5.f11162h = r1
            return r3
        L23:
            if (r0 != r2) goto L15
            goto L14
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.m0.g.h(c.f.a.b.j3.i0):boolean");
    }
}

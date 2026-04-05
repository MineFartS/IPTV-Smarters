package c.f.a.b.z2.m0;

import c.f.a.b.k1;
import c.f.a.b.t2.o;
import c.f.a.b.z2.m0.i0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.b.j3.h0 f11202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.f.a.b.z2.a0 f11206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f11211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k1 f11212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11214m;

    public i() {
        this(null);
    }

    public i(String str) {
        c.f.a.b.j3.h0 h0Var = new c.f.a.b.j3.h0(new byte[16]);
        this.f11202a = h0Var;
        this.f11203b = new c.f.a.b.j3.i0(h0Var.f9198a);
        this.f11207f = 0;
        this.f11208g = 0;
        this.f11209h = false;
        this.f11210i = false;
        this.f11204c = str;
    }

    public final boolean a(c.f.a.b.j3.i0 i0Var, byte[] bArr, int i2) {
        int iMin = Math.min(i0Var.a(), i2 - this.f11208g);
        i0Var.j(bArr, this.f11208g, iMin);
        int i3 = this.f11208g + iMin;
        this.f11208g = i3;
        return i3 == i2;
    }

    @Override // c.f.a.b.z2.m0.o
    public void b(c.f.a.b.j3.i0 i0Var) {
        c.f.a.b.j3.g.i(this.f11206e);
        while (i0Var.a() > 0) {
            int i2 = this.f11207f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int iMin = Math.min(i0Var.a(), this.f11213l - this.f11208g);
                        this.f11206e.c(i0Var, iMin);
                        int i3 = this.f11208g + iMin;
                        this.f11208g = i3;
                        int i4 = this.f11213l;
                        if (i3 == i4) {
                            this.f11206e.d(this.f11214m, 1, i4, 0, null);
                            this.f11214m += this.f11211j;
                            this.f11207f = 0;
                        }
                    }
                } else if (a(i0Var, this.f11203b.d(), 16)) {
                    g();
                    this.f11203b.P(0);
                    this.f11206e.c(this.f11203b, 16);
                    this.f11207f = 2;
                }
            } else if (h(i0Var)) {
                this.f11207f = 1;
                this.f11203b.d()[0] = -84;
                this.f11203b.d()[1] = (byte) (this.f11210i ? 65 : 64);
                this.f11208g = 2;
            }
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void c() {
        this.f11207f = 0;
        this.f11208g = 0;
        this.f11209h = false;
        this.f11210i = false;
    }

    @Override // c.f.a.b.z2.m0.o
    public void d() {
    }

    @Override // c.f.a.b.z2.m0.o
    public void e(c.f.a.b.z2.l lVar, i0.d dVar) {
        dVar.a();
        this.f11205d = dVar.b();
        this.f11206e = lVar.e(dVar.c(), 1);
    }

    @Override // c.f.a.b.z2.m0.o
    public void f(long j2, int i2) {
        this.f11214m = j2;
    }

    @RequiresNonNull({"output"})
    public final void g() {
        this.f11202a.p(0);
        o.b bVarD = c.f.a.b.t2.o.d(this.f11202a);
        k1 k1Var = this.f11212k;
        if (k1Var == null || bVarD.f10151c != k1Var.z || bVarD.f10150b != k1Var.A || !"audio/ac4".equals(k1Var.f9338m)) {
            k1 k1VarE = new k1.b().S(this.f11205d).e0("audio/ac4").H(bVarD.f10151c).f0(bVarD.f10150b).V(this.f11204c).E();
            this.f11212k = k1VarE;
            this.f11206e.e(k1VarE);
        }
        this.f11213l = bVarD.f10152d;
        this.f11211j = (((long) bVarD.f10153e) * 1000000) / ((long) this.f11212k.A);
    }

    public final boolean h(c.f.a.b.j3.i0 i0Var) {
        int iD;
        while (true) {
            if (i0Var.a() <= 0) {
                return false;
            }
            if (this.f11209h) {
                iD = i0Var.D();
                this.f11209h = iD == 172;
                if (iD == 64 || iD == 65) {
                    break;
                }
            } else {
                this.f11209h = i0Var.D() == 172;
            }
        }
        this.f11210i = iD == 65;
        return true;
    }
}

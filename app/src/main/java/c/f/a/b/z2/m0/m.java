package c.f.a.b.z2.m0;

import c.f.a.b.k1;
import c.f.a.b.z2.m0.i0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.f.a.b.z2.a0 f11262d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k1 f11267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f11269k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11259a = new c.f.a.b.j3.i0(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11263e = 0;

    public m(String str) {
        this.f11260b = str;
    }

    public final boolean a(c.f.a.b.j3.i0 i0Var, byte[] bArr, int i2) {
        int iMin = Math.min(i0Var.a(), i2 - this.f11264f);
        i0Var.j(bArr, this.f11264f, iMin);
        int i3 = this.f11264f + iMin;
        this.f11264f = i3;
        return i3 == i2;
    }

    @Override // c.f.a.b.z2.m0.o
    public void b(c.f.a.b.j3.i0 i0Var) {
        c.f.a.b.j3.g.i(this.f11262d);
        while (i0Var.a() > 0) {
            int i2 = this.f11263e;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(i0Var.a(), this.f11268j - this.f11264f);
                    this.f11262d.c(i0Var, iMin);
                    int i3 = this.f11264f + iMin;
                    this.f11264f = i3;
                    int i4 = this.f11268j;
                    if (i3 == i4) {
                        this.f11262d.d(this.f11269k, 1, i4, 0, null);
                        this.f11269k += this.f11266h;
                        this.f11263e = 0;
                    }
                } else if (a(i0Var, this.f11259a.d(), 18)) {
                    g();
                    this.f11259a.P(0);
                    this.f11262d.c(this.f11259a, 18);
                    this.f11263e = 2;
                }
            } else if (h(i0Var)) {
                this.f11263e = 1;
            }
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void c() {
        this.f11263e = 0;
        this.f11264f = 0;
        this.f11265g = 0;
    }

    @Override // c.f.a.b.z2.m0.o
    public void d() {
    }

    @Override // c.f.a.b.z2.m0.o
    public void e(c.f.a.b.z2.l lVar, i0.d dVar) {
        dVar.a();
        this.f11261c = dVar.b();
        this.f11262d = lVar.e(dVar.c(), 1);
    }

    @Override // c.f.a.b.z2.m0.o
    public void f(long j2, int i2) {
        this.f11269k = j2;
    }

    @RequiresNonNull({"output"})
    public final void g() {
        byte[] bArrD = this.f11259a.d();
        if (this.f11267i == null) {
            k1 k1VarG = c.f.a.b.t2.e0.g(bArrD, this.f11261c, this.f11260b, null);
            this.f11267i = k1VarG;
            this.f11262d.e(k1VarG);
        }
        this.f11268j = c.f.a.b.t2.e0.a(bArrD);
        this.f11266h = (int) ((((long) c.f.a.b.t2.e0.f(bArrD)) * 1000000) / ((long) this.f11267i.A));
    }

    public final boolean h(c.f.a.b.j3.i0 i0Var) {
        while (i0Var.a() > 0) {
            int i2 = this.f11265g << 8;
            this.f11265g = i2;
            int iD = i2 | i0Var.D();
            this.f11265g = iD;
            if (c.f.a.b.t2.e0.d(iD)) {
                byte[] bArrD = this.f11259a.d();
                int i3 = this.f11265g;
                bArrD[0] = (byte) ((i3 >> 24) & 255);
                bArrD[1] = (byte) ((i3 >> 16) & 255);
                bArrD[2] = (byte) ((i3 >> 8) & 255);
                bArrD[3] = (byte) (i3 & 255);
                this.f11264f = 4;
                this.f11265g = 0;
                return true;
            }
        }
        return false;
    }
}

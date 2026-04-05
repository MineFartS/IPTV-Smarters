package c.f.a.b.z2.l0;

import c.f.a.b.j3.g;
import c.f.a.b.j3.i0;
import c.f.a.b.k1;
import c.f.a.b.w1;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.j;
import c.f.a.b.z2.k;
import c.f.a.b.z2.l;
import c.f.a.b.z2.w;
import c.f.a.b.z2.x;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f11098a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f11100c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11105h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f11099b = new i0(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11101d = 0;

    public a(k1 k1Var) {
        this.f11098a = k1Var;
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        this.f11101d = 0;
    }

    public final boolean b(k kVar) throws IOException {
        this.f11099b.L(8);
        if (!kVar.d(this.f11099b.d(), 0, 8, true)) {
            return false;
        }
        if (this.f11099b.n() != 1380139777) {
            throw new IOException("Input not RawCC");
        }
        this.f11102e = this.f11099b.D();
        return true;
    }

    @Override // c.f.a.b.z2.j
    public void c(l lVar) {
        lVar.i(new x.b(-9223372036854775807L));
        a0 a0VarE = lVar.e(0, 3);
        this.f11100c = a0VarE;
        a0VarE.e(this.f11098a);
        lVar.p();
    }

    @RequiresNonNull({"trackOutput"})
    public final void d(k kVar) {
        while (this.f11104g > 0) {
            this.f11099b.L(3);
            kVar.l(this.f11099b.d(), 0, 3);
            this.f11100c.c(this.f11099b, 3);
            this.f11105h += 3;
            this.f11104g--;
        }
        int i2 = this.f11105h;
        if (i2 > 0) {
            this.f11100c.d(this.f11103f, 1, i2, 0, null);
        }
    }

    @Override // c.f.a.b.z2.j
    public boolean e(k kVar) {
        this.f11099b.L(8);
        kVar.u(this.f11099b.d(), 0, 8);
        return this.f11099b.n() == 1380139777;
    }

    public final boolean f(k kVar) throws w1 {
        long jW;
        int i2 = this.f11102e;
        if (i2 == 0) {
            this.f11099b.L(5);
            if (!kVar.d(this.f11099b.d(), 0, 5, true)) {
                return false;
            }
            jW = (this.f11099b.F() * 1000) / 45;
        } else {
            if (i2 != 1) {
                throw w1.a("Unsupported version number: " + this.f11102e, null);
            }
            this.f11099b.L(9);
            if (!kVar.d(this.f11099b.d(), 0, 9, true)) {
                return false;
            }
            jW = this.f11099b.w();
        }
        this.f11103f = jW;
        this.f11104g = this.f11099b.D();
        this.f11105h = 0;
        return true;
    }

    @Override // c.f.a.b.z2.j
    public int g(k kVar, w wVar) {
        g.i(this.f11100c);
        while (true) {
            int i2 = this.f11101d;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                    d(kVar);
                    this.f11101d = 1;
                    return 0;
                }
                if (!f(kVar)) {
                    this.f11101d = 0;
                    return -1;
                }
                this.f11101d = 2;
            } else {
                if (!b(kVar)) {
                    return -1;
                }
                this.f11101d = 1;
            }
        }
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }
}

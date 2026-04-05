package c.f.a.b.z2.m0;

import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.t2.m;
import c.f.a.b.z2.m0.i0;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f11240a = {73, 68, 51};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.j3.h0 f11242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.f.a.b.z2.a0 f11246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.f.a.b.z2.a0 f11247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11254o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public c.f.a.b.z2.a0 u;
    public long v;

    public k(boolean z) {
        this(z, null);
    }

    public k(boolean z, String str) {
        this.f11242c = new c.f.a.b.j3.h0(new byte[7]);
        this.f11243d = new c.f.a.b.j3.i0(Arrays.copyOf(f11240a, 10));
        s();
        this.f11253n = -1;
        this.f11254o = -1;
        this.r = -9223372036854775807L;
        this.f11241b = z;
        this.f11244e = str;
    }

    public static boolean m(int i2) {
        return (i2 & 65526) == 65520;
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    public final void a() {
        c.f.a.b.j3.g.e(this.f11246g);
        x0.i(this.u);
        x0.i(this.f11247h);
    }

    @Override // c.f.a.b.z2.m0.o
    public void b(c.f.a.b.j3.i0 i0Var) {
        a();
        while (i0Var.a() > 0) {
            int i2 = this.f11248i;
            if (i2 == 0) {
                j(i0Var);
            } else if (i2 == 1) {
                g(i0Var);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (i(i0Var, this.f11242c.f9198a, this.f11251l ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException();
                    }
                    p(i0Var);
                }
            } else if (i(i0Var, this.f11243d.d(), 10)) {
                o();
            }
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void c() {
        q();
    }

    @Override // c.f.a.b.z2.m0.o
    public void d() {
    }

    @Override // c.f.a.b.z2.m0.o
    public void e(c.f.a.b.z2.l lVar, i0.d dVar) {
        dVar.a();
        this.f11245f = dVar.b();
        c.f.a.b.z2.a0 a0VarE = lVar.e(dVar.c(), 1);
        this.f11246g = a0VarE;
        this.u = a0VarE;
        if (!this.f11241b) {
            this.f11247h = new c.f.a.b.z2.i();
            return;
        }
        dVar.a();
        c.f.a.b.z2.a0 a0VarE2 = lVar.e(dVar.c(), 5);
        this.f11247h = a0VarE2;
        a0VarE2.e(new k1.b().S(dVar.b()).e0("application/id3").E());
    }

    @Override // c.f.a.b.z2.m0.o
    public void f(long j2, int i2) {
        this.t = j2;
    }

    public final void g(c.f.a.b.j3.i0 i0Var) {
        if (i0Var.a() == 0) {
            return;
        }
        this.f11242c.f9198a[0] = i0Var.d()[i0Var.e()];
        this.f11242c.p(2);
        int iH = this.f11242c.h(4);
        int i2 = this.f11254o;
        if (i2 != -1 && iH != i2) {
            q();
            return;
        }
        if (!this.f11252m) {
            this.f11252m = true;
            this.f11253n = this.p;
            this.f11254o = iH;
        }
        t();
    }

    public final boolean h(c.f.a.b.j3.i0 i0Var, int i2) {
        i0Var.P(i2 + 1);
        if (!w(i0Var, this.f11242c.f9198a, 1)) {
            return false;
        }
        this.f11242c.p(4);
        int iH = this.f11242c.h(1);
        int i3 = this.f11253n;
        if (i3 != -1 && iH != i3) {
            return false;
        }
        if (this.f11254o != -1) {
            if (!w(i0Var, this.f11242c.f9198a, 1)) {
                return true;
            }
            this.f11242c.p(2);
            if (this.f11242c.h(4) != this.f11254o) {
                return false;
            }
            i0Var.P(i2 + 2);
        }
        if (!w(i0Var, this.f11242c.f9198a, 4)) {
            return true;
        }
        this.f11242c.p(14);
        int iH2 = this.f11242c.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrD = i0Var.d();
        int iF = i0Var.f();
        int i4 = i2 + iH2;
        if (i4 >= iF) {
            return true;
        }
        if (bArrD[i4] == -1) {
            int i5 = i4 + 1;
            if (i5 == iF) {
                return true;
            }
            return l((byte) -1, bArrD[i5]) && ((bArrD[i5] & 8) >> 3) == iH;
        }
        if (bArrD[i4] != 73) {
            return false;
        }
        int i6 = i4 + 1;
        if (i6 == iF) {
            return true;
        }
        if (bArrD[i6] != 68) {
            return false;
        }
        int i7 = i4 + 2;
        return i7 == iF || bArrD[i7] == 51;
    }

    public final boolean i(c.f.a.b.j3.i0 i0Var, byte[] bArr, int i2) {
        int iMin = Math.min(i0Var.a(), i2 - this.f11249j);
        i0Var.j(bArr, this.f11249j, iMin);
        int i3 = this.f11249j + iMin;
        this.f11249j = i3;
        return i3 == i2;
    }

    public final void j(c.f.a.b.j3.i0 i0Var) {
        int i2;
        byte[] bArrD = i0Var.d();
        int iE = i0Var.e();
        int iF = i0Var.f();
        while (iE < iF) {
            int i3 = iE + 1;
            int i4 = bArrD[iE] & 255;
            if (this.f11250k == 512 && l((byte) -1, (byte) i4) && (this.f11252m || h(i0Var, i3 - 2))) {
                this.p = (i4 & 8) >> 3;
                this.f11251l = (i4 & 1) == 0;
                if (this.f11252m) {
                    t();
                } else {
                    r();
                }
                i0Var.P(i3);
                return;
            }
            int i5 = this.f11250k;
            int i6 = i4 | i5;
            if (i6 != 329) {
                if (i6 == 511) {
                    this.f11250k = IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                } else if (i6 == 836) {
                    i2 = 1024;
                } else if (i6 == 1075) {
                    u();
                    i0Var.P(i3);
                    return;
                } else if (i5 != 256) {
                    this.f11250k = 256;
                    i3--;
                }
                iE = i3;
            } else {
                i2 = 768;
            }
            this.f11250k = i2;
            iE = i3;
        }
        i0Var.P(iE);
    }

    public long k() {
        return this.r;
    }

    public final boolean l(byte b2, byte b3) {
        return m(((b2 & 255) << 8) | (b3 & 255));
    }

    @RequiresNonNull({"output"})
    public final void n() {
        this.f11242c.p(0);
        if (this.q) {
            this.f11242c.r(10);
        } else {
            int iH = this.f11242c.h(2) + 1;
            if (iH != 2) {
                c.f.a.b.j3.z.i("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
                iH = 2;
            }
            this.f11242c.r(5);
            byte[] bArrB = c.f.a.b.t2.m.b(iH, this.f11254o, this.f11242c.h(3));
            m.b bVarG = c.f.a.b.t2.m.g(bArrB);
            k1 k1VarE = new k1.b().S(this.f11245f).e0("audio/mp4a-latm").I(bVarG.f10114c).H(bVarG.f10113b).f0(bVarG.f10112a).T(Collections.singletonList(bArrB)).V(this.f11244e).E();
            this.r = 1024000000 / ((long) k1VarE.A);
            this.f11246g.e(k1VarE);
            this.q = true;
        }
        this.f11242c.r(4);
        int iH2 = (this.f11242c.h(13) - 2) - 5;
        if (this.f11251l) {
            iH2 -= 2;
        }
        v(this.f11246g, this.r, 0, iH2);
    }

    @RequiresNonNull({"id3Output"})
    public final void o() {
        this.f11247h.c(this.f11243d, 10);
        this.f11243d.P(6);
        v(this.f11247h, 0L, 10, this.f11243d.C() + 10);
    }

    @RequiresNonNull({"currentOutput"})
    public final void p(c.f.a.b.j3.i0 i0Var) {
        int iMin = Math.min(i0Var.a(), this.s - this.f11249j);
        this.u.c(i0Var, iMin);
        int i2 = this.f11249j + iMin;
        this.f11249j = i2;
        int i3 = this.s;
        if (i2 == i3) {
            this.u.d(this.t, 1, i3, 0, null);
            this.t += this.v;
            s();
        }
    }

    public final void q() {
        this.f11252m = false;
        s();
    }

    public final void r() {
        this.f11248i = 1;
        this.f11249j = 0;
    }

    public final void s() {
        this.f11248i = 0;
        this.f11249j = 0;
        this.f11250k = 256;
    }

    public final void t() {
        this.f11248i = 3;
        this.f11249j = 0;
    }

    public final void u() {
        this.f11248i = 2;
        this.f11249j = f11240a.length;
        this.s = 0;
        this.f11243d.P(0);
    }

    public final void v(c.f.a.b.z2.a0 a0Var, long j2, int i2, int i3) {
        this.f11248i = 4;
        this.f11249j = i2;
        this.u = a0Var;
        this.v = j2;
        this.s = i3;
    }

    public final boolean w(c.f.a.b.j3.i0 i0Var, byte[] bArr, int i2) {
        if (i0Var.a() < i2) {
            return false;
        }
        i0Var.j(bArr, 0, i2);
        return true;
    }
}

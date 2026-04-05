package c.f.a.b.z2.f0;

import c.f.a.b.j3.e0;
import c.f.a.b.j3.i0;
import c.f.a.b.k1;
import c.f.a.b.k3.m;
import c.f.a.b.w1;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.f0.e;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f10751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f10752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10756g;

    public f(a0 a0Var) {
        super(a0Var);
        this.f10751b = new i0(e0.f9165a);
        this.f10752c = new i0(4);
    }

    @Override // c.f.a.b.z2.f0.e
    public boolean b(i0 i0Var) throws e.a {
        int iD = i0Var.D();
        int i2 = (iD >> 4) & 15;
        int i3 = iD & 15;
        if (i3 == 7) {
            this.f10756g = i2;
            return i2 != 5;
        }
        throw new e.a("Video format not supported: " + i3);
    }

    @Override // c.f.a.b.z2.f0.e
    public boolean c(i0 i0Var, long j2) throws w1 {
        int iD = i0Var.D();
        long jO = j2 + (((long) i0Var.o()) * 1000);
        if (iD == 0 && !this.f10754e) {
            i0 i0Var2 = new i0(new byte[i0Var.a()]);
            i0Var.j(i0Var2.d(), 0, i0Var.a());
            m mVarB = m.b(i0Var2);
            this.f10753d = mVarB.f9482b;
            this.f10750a.e(new k1.b().e0("video/avc").I(mVarB.f9486f).j0(mVarB.f9483c).Q(mVarB.f9484d).a0(mVarB.f9485e).T(mVarB.f9481a).E());
            this.f10754e = true;
            return false;
        }
        if (iD != 1 || !this.f10754e) {
            return false;
        }
        int i2 = this.f10756g == 1 ? 1 : 0;
        if (!this.f10755f && i2 == 0) {
            return false;
        }
        byte[] bArrD = this.f10752c.d();
        bArrD[0] = 0;
        bArrD[1] = 0;
        bArrD[2] = 0;
        int i3 = 4 - this.f10753d;
        int i4 = 0;
        while (i0Var.a() > 0) {
            i0Var.j(this.f10752c.d(), i3, this.f10753d);
            this.f10752c.P(0);
            int iH = this.f10752c.H();
            this.f10751b.P(0);
            this.f10750a.c(this.f10751b, 4);
            this.f10750a.c(i0Var, iH);
            i4 = i4 + 4 + iH;
        }
        this.f10750a.d(jO, i2, i4, 0, null);
        this.f10755f = true;
        return true;
    }
}

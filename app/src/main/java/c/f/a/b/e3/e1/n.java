package c.f.a.b.e3.e1;

import c.f.a.b.e3.s0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.l1;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f7121b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f7123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.f.a.b.e3.e1.p.f f7125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7127h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.b3.j.c f7122c = new c.f.a.b.b3.j.c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7128i = -9223372036854775807L;

    public n(c.f.a.b.e3.e1.p.f fVar, k1 k1Var, boolean z) {
        this.f7121b = k1Var;
        this.f7125f = fVar;
        this.f7123d = fVar.f7185b;
        d(fVar, z);
    }

    @Override // c.f.a.b.e3.s0
    public void a() {
    }

    public String b() {
        return this.f7125f.a();
    }

    public void c(long j2) {
        int iD = x0.d(this.f7123d, j2, true, false);
        this.f7127h = iD;
        if (!(this.f7124e && iD == this.f7123d.length)) {
            j2 = -9223372036854775807L;
        }
        this.f7128i = j2;
    }

    public void d(c.f.a.b.e3.e1.p.f fVar, boolean z) {
        int i2 = this.f7127h;
        long j2 = i2 == 0 ? -9223372036854775807L : this.f7123d[i2 - 1];
        this.f7124e = z;
        this.f7125f = fVar;
        long[] jArr = fVar.f7185b;
        this.f7123d = jArr;
        long j3 = this.f7128i;
        if (j3 != -9223372036854775807L) {
            c(j3);
        } else if (j2 != -9223372036854775807L) {
            this.f7127h = x0.d(jArr, j2, false, false);
        }
    }

    @Override // c.f.a.b.e3.s0
    public boolean e() {
        return true;
    }

    @Override // c.f.a.b.e3.s0
    public int i(l1 l1Var, c.f.a.b.v2.f fVar, int i2) {
        int i3 = this.f7127h;
        boolean z = i3 == this.f7123d.length;
        if (z && !this.f7124e) {
            fVar.setFlags(4);
            return -4;
        }
        if ((i2 & 2) != 0 || !this.f7126g) {
            l1Var.f9575b = this.f7121b;
            this.f7126g = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        this.f7127h = i3 + 1;
        byte[] bArrA = this.f7122c.a(this.f7125f.f7184a[i3]);
        fVar.i(bArrA.length);
        fVar.f10276c.put(bArrA);
        fVar.f10278e = this.f7123d[i3];
        fVar.setFlags(1);
        return -4;
    }

    @Override // c.f.a.b.e3.s0
    public int p(long j2) {
        int iMax = Math.max(this.f7127h, x0.d(this.f7123d, j2, true, false));
        int i2 = iMax - this.f7127h;
        this.f7127h = iMax;
        return i2;
    }
}

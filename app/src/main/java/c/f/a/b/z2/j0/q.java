package c.f.a.b.z2.j0;

import c.f.a.b.j3.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f11011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11016f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11023m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p f11025o;
    public boolean q;
    public long r;
    public boolean s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f11017g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f11018h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f11019i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f11020j = new int[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f11021k = new long[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean[] f11022l = new boolean[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean[] f11024n = new boolean[0];
    public final i0 p = new i0();

    public void a(c.f.a.b.z2.k kVar) {
        kVar.l(this.p.d(), 0, this.p.f());
        this.p.P(0);
        this.q = false;
    }

    public void b(i0 i0Var) {
        i0Var.j(this.p.d(), 0, this.p.f());
        this.p.P(0);
        this.q = false;
    }

    public long c(int i2) {
        return this.f11021k[i2] + ((long) this.f11020j[i2]);
    }

    public void d(int i2) {
        this.p.L(i2);
        this.f11023m = true;
        this.q = true;
    }

    public void e(int i2, int i3) {
        this.f11015e = i2;
        this.f11016f = i3;
        if (this.f11018h.length < i2) {
            this.f11017g = new long[i2];
            this.f11018h = new int[i2];
        }
        if (this.f11019i.length < i3) {
            int i4 = (i3 * 125) / 100;
            this.f11019i = new int[i4];
            this.f11020j = new int[i4];
            this.f11021k = new long[i4];
            this.f11022l = new boolean[i4];
            this.f11024n = new boolean[i4];
        }
    }

    public void f() {
        this.f11015e = 0;
        this.r = 0L;
        this.s = false;
        this.f11023m = false;
        this.q = false;
        this.f11025o = null;
    }

    public boolean g(int i2) {
        return this.f11023m && this.f11024n[i2];
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class vl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sf f23332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private rm f23333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private vh f23334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f23335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f23336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f23337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23339i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f23341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23343m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vf f23331a = new vf();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private vj f23340j = new vj();

    public abstract long a(alx alxVar);

    public void b(boolean z) {
        int i2;
        if (z) {
            this.f23340j = new vj();
            this.f23336f = 0L;
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.f23338h = i2;
        this.f23335e = -1L;
        this.f23337g = 0L;
    }

    public abstract boolean c(alx alxVar, long j2, vj vjVar);

    public final int e(rk rkVar, rz rzVar) {
        ajr.c(this.f23332b);
        int i2 = amn.f20135a;
        int i3 = this.f23338h;
        if (i3 == 0) {
            while (this.f23331a.e(rkVar)) {
                this.f23341k = rkVar.e() - this.f23336f;
                if (!c(this.f23331a.b(), this.f23336f, this.f23340j)) {
                    ke keVar = this.f23340j.f23329a;
                    this.f23339i = keVar.z;
                    if (!this.f23343m) {
                        this.f23332b.b(keVar);
                        this.f23343m = true;
                    }
                    vh vhVar = this.f23340j.f23330b;
                    if (vhVar != null) {
                        this.f23334d = vhVar;
                    } else if (rkVar.c() == -1) {
                        this.f23334d = new vk(null);
                    } else {
                        vg vgVarA = this.f23331a.a();
                        this.f23334d = new va(this, this.f23336f, rkVar.c(), vgVarA.f23323e + vgVarA.f23324f, vgVarA.f23321c, (vgVarA.f23320b & 4) != 0);
                    }
                    this.f23338h = 2;
                    this.f23331a.d();
                    return 0;
                }
                this.f23336f = rkVar.e();
            }
            this.f23338h = 3;
            return -1;
        }
        if (i3 == 1) {
            rkVar.j((int) this.f23336f);
            this.f23338h = 2;
            return 0;
        }
        if (i3 != 2) {
            return -1;
        }
        long jD = this.f23334d.d(rkVar);
        if (jD >= 0) {
            rzVar.f22929a = jD;
            return 1;
        }
        if (jD < -1) {
            i(-(jD + 2));
        }
        if (!this.f23342l) {
            sc scVarE = this.f23334d.e();
            ajr.c(scVarE);
            this.f23333c.bb(scVarE);
            this.f23342l = true;
        }
        if (this.f23341k <= 0 && !this.f23331a.e(rkVar)) {
            this.f23338h = 3;
            return -1;
        }
        this.f23341k = 0L;
        alx alxVarB = this.f23331a.b();
        long jA = a(alxVarB);
        if (jA >= 0) {
            long j2 = this.f23337g;
            if (j2 + jA >= this.f23335e) {
                long jF = f(j2);
                this.f23332b.c(alxVarB, alxVarB.d());
                this.f23332b.d(jF, 1, alxVarB.d(), 0, null);
                this.f23335e = -1L;
            }
        }
        this.f23337g += jA;
        return 0;
    }

    public final long f(long j2) {
        return (j2 * 1000000) / ((long) this.f23339i);
    }

    public final long g(long j2) {
        return (((long) this.f23339i) * j2) / 1000000;
    }

    public final void h(rm rmVar, sf sfVar) {
        this.f23333c = rmVar;
        this.f23332b = sfVar;
        b(true);
    }

    public void i(long j2) {
        this.f23337g = j2;
    }

    public final void j(long j2, long j3) {
        this.f23331a.c();
        if (j2 == 0) {
            b(!this.f23342l);
            return;
        }
        if (this.f23338h != 0) {
            long jG = g(j3);
            this.f23335e = jG;
            vh vhVar = this.f23334d;
            int i2 = amn.f20135a;
            vhVar.g(jG);
            this.f23338h = 2;
        }
    }
}

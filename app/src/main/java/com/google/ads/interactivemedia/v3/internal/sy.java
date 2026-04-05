package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class sy implements rj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rm f23020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23023e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private zw f23025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private rk f23026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private tb f23027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private uq f23028j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final alx f23019a = new alx(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f23024f = -1;

    private final int e(rk rkVar) {
        this.f23019a.E(2);
        rkVar.g(this.f23019a.K(), 0, 2);
        return this.f23019a.o();
    }

    private final void g() {
        h(new yr[0]);
        rm rmVar = this.f23020b;
        ajr.b(rmVar);
        rmVar.ba();
        this.f23020b.bb(new sb(-9223372036854775807L));
        this.f23021c = 6;
    }

    private final void h(yr... yrVarArr) {
        rm rmVar = this.f23020b;
        ajr.b(rmVar);
        sf sfVarAZ = rmVar.aZ(1024, 4);
        kd kdVar = new kd();
        kdVar.X(new ys(yrVarArr));
        sfVarAZ.b(kdVar.s());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    @Override // com.google.ads.interactivemedia.v3.internal.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.google.ads.interactivemedia.v3.internal.rk r24, com.google.ads.interactivemedia.v3.internal.rz r25) throws com.google.ads.interactivemedia.v3.internal.lb {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.sy.a(com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.rz):int");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        this.f23020b = rmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        if (j2 == 0) {
            this.f23021c = 0;
            this.f23028j = null;
        } else if (this.f23021c == 5) {
            uq uqVar = this.f23028j;
            ajr.b(uqVar);
            uqVar.d(j2, j3);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final boolean f(rk rkVar) {
        if (e(rkVar) != 65496) {
            return false;
        }
        int iE = e(rkVar);
        this.f23022d = iE;
        if (iE == 65504) {
            this.f23019a.E(2);
            rkVar.g(this.f23019a.K(), 0, 2);
            rkVar.f(this.f23019a.o() - 2);
            iE = e(rkVar);
            this.f23022d = iE;
        }
        if (iE != 65505) {
            return false;
        }
        rkVar.f(2);
        this.f23019a.E(6);
        rkVar.g(this.f23019a.K(), 0, 6);
        return this.f23019a.s() == 1165519206 && this.f23019a.o() == 0;
    }
}

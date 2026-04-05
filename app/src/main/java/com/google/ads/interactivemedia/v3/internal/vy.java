package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vy implements vz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<xd> f23439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sf[] f23440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f23444f;

    public vy(List<xd> list) {
        this.f23439a = list;
        this.f23440b = new sf[list.size()];
    }

    private final boolean f(alx alxVar, int i2) {
        if (alxVar.a() == 0) {
            return false;
        }
        if (alxVar.k() != i2) {
            this.f23441c = false;
        }
        this.f23442d--;
        return this.f23441c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void a(alx alxVar) {
        if (this.f23441c) {
            if (this.f23442d != 2 || f(alxVar, 32)) {
                if (this.f23442d != 1 || f(alxVar, 0)) {
                    int iC = alxVar.c();
                    int iA = alxVar.a();
                    for (sf sfVar : this.f23440b) {
                        alxVar.I(iC);
                        sfVar.c(alxVar, iA);
                    }
                    this.f23443e += iA;
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void b(rm rmVar, xg xgVar) {
        for (int i2 = 0; i2 < this.f23440b.length; i2++) {
            xd xdVar = this.f23439a.get(i2);
            xgVar.c();
            sf sfVarAZ = rmVar.aZ(xgVar.a(), 3);
            kd kdVar = new kd();
            kdVar.S(xgVar.b());
            kdVar.ae("application/dvbsubs");
            kdVar.T(Collections.singletonList(xdVar.f23694b));
            kdVar.V(xdVar.f23693a);
            sfVarAZ.b(kdVar.s());
            this.f23440b[i2] = sfVarAZ;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void c() {
        if (this.f23441c) {
            for (sf sfVar : this.f23440b) {
                sfVar.d(this.f23444f, 1, this.f23443e, 0, null);
            }
            this.f23441c = false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void d(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f23441c = true;
        this.f23444f = j2;
        this.f23443e = 0;
        this.f23442d = 2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void e() {
        this.f23441c = false;
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class wo implements wu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ke f23601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aml f23602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sf f23603c;

    public wo(String str) {
        kd kdVar = new kd();
        kdVar.ae(str);
        this.f23601a = kdVar.s();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wu
    public final void a(alx alxVar) {
        ajr.c(this.f23602b);
        int i2 = amn.f20135a;
        long jE = this.f23602b.e();
        if (jE == -9223372036854775807L) {
            return;
        }
        ke keVar = this.f23601a;
        if (jE != keVar.p) {
            kd kdVarB = keVar.b();
            kdVarB.ai(jE);
            ke keVarS = kdVarB.s();
            this.f23601a = keVarS;
            this.f23603c.b(keVarS);
        }
        int iA = alxVar.a();
        this.f23603c.c(alxVar, iA);
        this.f23603c.d(this.f23602b.d(), 1, iA, 0, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wu
    public final void b(aml amlVar, rm rmVar, xg xgVar) {
        this.f23602b = amlVar;
        xgVar.c();
        sf sfVarAZ = rmVar.aZ(xgVar.a(), 5);
        this.f23603c = sfVarAZ;
        sfVarAZ.b(this.f23601a);
    }
}

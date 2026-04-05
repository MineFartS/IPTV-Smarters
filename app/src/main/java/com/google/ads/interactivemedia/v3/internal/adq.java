package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class adq extends acx {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f19296m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ke f19297n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f19298o;
    private boolean p;

    public adq(ajh ajhVar, ajl ajlVar, ke keVar, int i2, long j2, long j3, long j4, int i3, ke keVar2) {
        super(ajhVar, ajlVar, keVar, i2, j2, j3, -9223372036854775807L, -9223372036854775807L, j4);
        this.f19296m = i3;
        this.f19297n = keVar2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void h() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void i() {
        acz aczVarB = b();
        aczVarB.a(0L);
        sf sfVarC = aczVarB.c(this.f19296m);
        sfVarC.b(this.f19297n);
        try {
            long jA = this.f19262k.a(this.f19255d.a(this.f19298o));
            if (jA != -1) {
                jA += this.f19298o;
            }
            rg rgVar = new rg(this.f19262k, this.f19298o, jA);
            for (int iA = 0; iA != -1; iA = sfVarC.a(rgVar, Integer.MAX_VALUE, true)) {
                this.f19298o += (long) iA;
            }
            sfVarC.d(this.f19260i, 1, (int) this.f19298o, 0, null);
            amn.K(this.f19262k);
            this.p = true;
        } catch (Throwable th) {
            amn.K(this.f19262k);
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adn
    public final boolean j() {
        return this.p;
    }
}

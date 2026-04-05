package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class adk extends acx {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f19285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f19286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ade f19287o;
    private long p;
    private volatile boolean q;
    private boolean r;

    public adk(ajh ajhVar, ajl ajlVar, ke keVar, int i2, long j2, long j3, long j4, long j5, long j6, int i3, long j7, ade adeVar) {
        super(ajhVar, ajlVar, keVar, i2, j2, j3, j4, j5, j6);
        this.f19285m = i3;
        this.f19286n = j7;
        this.f19287o = adeVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adn
    public final long g() {
        return this.f19294l + ((long) this.f19285m);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void h() {
        this.q = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void i() {
        if (this.p == 0) {
            acz aczVarB = b();
            aczVarB.a(this.f19286n);
            ade adeVar = this.f19287o;
            long j2 = this.f19221a;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.f19286n;
            long j4 = this.f19222b;
            adeVar.h(aczVarB, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.f19286n);
        }
        try {
            ajl ajlVarA = this.f19255d.a(this.p);
            akp akpVar = this.f19262k;
            rg rgVar = new rg(akpVar, ajlVarA.f19901e, akpVar.a(ajlVarA));
            do {
                try {
                    if (this.q) {
                        break;
                    }
                } finally {
                    this.p = rgVar.e() - this.f19255d.f19901e;
                }
            } while (this.f19287o.f(rgVar));
            amn.K(this.f19262k);
            this.r = !this.q;
        } catch (Throwable th) {
            amn.K(this.f19262k);
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adn
    public final boolean j() {
        return this.r;
    }
}

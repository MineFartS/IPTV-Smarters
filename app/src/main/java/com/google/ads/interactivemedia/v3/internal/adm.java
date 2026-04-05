package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class adm extends add {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ade f19290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f19291b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f19292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private acz f19293m;

    public adm(ajh ajhVar, ajl ajlVar, ke keVar, int i2, ade adeVar) {
        super(ajhVar, ajlVar, 2, keVar, i2, -9223372036854775807L, -9223372036854775807L);
        this.f19290a = adeVar;
    }

    public final void a(acz aczVar) {
        this.f19293m = aczVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void h() {
        this.f19292l = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void i() {
        if (this.f19291b == 0) {
            this.f19290a.h(this.f19293m, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            ajl ajlVarA = this.f19255d.a(this.f19291b);
            akp akpVar = this.f19262k;
            rg rgVar = new rg(akpVar, ajlVarA.f19901e, akpVar.a(ajlVarA));
            while (!this.f19292l && this.f19290a.f(rgVar)) {
                try {
                } finally {
                    this.f19291b = rgVar.e() - this.f19255d.f19901e;
                }
            }
        } finally {
            amn.K(this.f19262k);
        }
    }
}

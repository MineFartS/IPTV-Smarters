package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class xa implements wu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc f23671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final alw f23672b = new alw(new byte[4]);

    public xa(xc xcVar) {
        this.f23671a = xcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wu
    public final void a(alx alxVar) {
        if (alxVar.k() == 0 && (alxVar.k() & 128) != 0) {
            alxVar.J(6);
            int iA = alxVar.a() / 4;
            for (int i2 = 0; i2 < iA; i2++) {
                alxVar.C(this.f23672b, 4);
                int iC = this.f23672b.c(16);
                this.f23672b.i(3);
                if (iC == 0) {
                    this.f23672b.i(13);
                } else {
                    int iC2 = this.f23672b.c(13);
                    if (this.f23671a.f23685h.get(iC2) == null) {
                        this.f23671a.f23685h.put(iC2, new wv(new xb(this.f23671a, iC2)));
                        xc.r(this.f23671a);
                    }
                }
            }
            if (this.f23671a.f23679b != 2) {
                this.f23671a.f23685h.remove(0);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wu
    public final void b(aml amlVar, rm rmVar, xg xgVar) {
    }
}

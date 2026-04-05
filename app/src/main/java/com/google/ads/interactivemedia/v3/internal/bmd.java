package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bmd<T> implements bmk<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final blz f21396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bni f21398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final blt f21399d;

    private bmd(bni bniVar, blt bltVar, blz blzVar, byte[] bArr, byte[] bArr2) {
        this.f21398c = bniVar;
        this.f21397b = blt.g(blzVar);
        this.f21399d = bltVar;
        this.f21396a = blzVar;
    }

    public static <T> bmd<T> c(bni bniVar, blt bltVar, blz blzVar) {
        return new bmd<>(bniVar, bltVar, blzVar, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmk
    public final int a(T t) {
        int iB = ((bmz) this.f21398c.j(t)).b();
        if (!this.f21397b) {
            return iB;
        }
        blt.e(t);
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmk
    public final int b(T t) {
        int iHashCode = this.f21398c.j(t).hashCode();
        if (!this.f21397b) {
            return iHashCode;
        }
        blt.e(t);
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmk
    public final T e() {
        return (T) this.f21396a.aS().ae();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmk
    public final void f(T t) {
        this.f21398c.k(t);
        this.f21399d.c(t);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmk
    public final void g(T t, T t2) {
        bmm.Y(this.f21398c, t, t2);
        if (this.f21397b) {
            bmm.aa(this.f21399d, t2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmk
    public final void h(T t, bmj bmjVar, bkm bkmVar) {
        boolean zQ;
        bni bniVar = this.f21398c;
        Object objI = bniVar.i(t);
        blt.f(t);
        while (bmjVar.c() != Integer.MAX_VALUE) {
            try {
                int iD = bmjVar.d();
                if (iD != bnp.f21483a) {
                    if (bnp.b(iD) == 2) {
                        Object objD = blt.d(bkmVar, this.f21396a, bnp.a(iD));
                        if (objD != null) {
                            blt.i(objD);
                        } else {
                            zQ = bniVar.h(objI, bmjVar);
                        }
                    } else {
                        zQ = bmjVar.Q();
                    }
                    if (!zQ) {
                        return;
                    }
                } else {
                    int iJ = 0;
                    Object objD2 = null;
                    bkd bkdVarP = null;
                    while (bmjVar.c() != Integer.MAX_VALUE) {
                        int iD2 = bmjVar.d();
                        if (iD2 == bnp.f21485c) {
                            iJ = bmjVar.j();
                            objD2 = blt.d(bkmVar, this.f21396a, iJ);
                        } else if (iD2 == bnp.f21486d) {
                            if (objD2 != null) {
                                blt.i(objD2);
                            } else {
                                bkdVarP = bmjVar.p();
                            }
                        } else if (!bmjVar.Q()) {
                            break;
                        }
                    }
                    if (bmjVar.d() != bnp.f21484b) {
                        throw blf.b();
                    }
                    if (bkdVarP != null) {
                        if (objD2 != null) {
                            blt.j(objD2);
                        } else {
                            bni.q(objI, iJ, bkdVarP);
                        }
                    }
                }
            } finally {
                bniVar.l(t, objI);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bmk
    public final void i(T t, byte[] bArr, int i2, int i3, bjt bjtVar) {
        bkx bkxVar = (bkx) t;
        if (bkxVar.f21334c == bmz.c()) {
            bkxVar.f21334c = bmz.e();
        }
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmk
    public final void j(T t, bnq bnqVar) {
        blt.e(t);
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmk
    public final boolean k(T t, T t2) {
        if (!this.f21398c.j(t).equals(this.f21398c.j(t2))) {
            return false;
        }
        if (!this.f21397b) {
            return true;
        }
        blt.e(t);
        blt.e(t2);
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bmk
    public final boolean l(T t) {
        blt.e(t);
        throw null;
    }
}

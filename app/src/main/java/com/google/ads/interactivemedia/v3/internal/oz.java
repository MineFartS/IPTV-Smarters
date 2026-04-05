package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class oz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nz[] f22671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pp f22672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pr f22673c;

    public oz(nz... nzVarArr) {
        pp ppVar = new pp();
        pr prVar = new pr();
        nz[] nzVarArr2 = {ppVar, prVar};
        this.f22671a = nzVarArr2;
        System.arraycopy(nzVarArr, 0, nzVarArr2, 0, 0);
        this.f22672b = ppVar;
        this.f22673c = prVar;
    }

    public final long a(long j2) {
        return this.f22673c.i(j2);
    }

    public final long b() {
        return this.f22672b.o();
    }

    public final nz[] c() {
        return this.f22671a;
    }

    public final void d(le leVar) {
        this.f22673c.k(leVar.f22307b);
        this.f22673c.j(leVar.f22308c);
    }

    public final void e(boolean z) {
        this.f22672b.p(z);
    }
}

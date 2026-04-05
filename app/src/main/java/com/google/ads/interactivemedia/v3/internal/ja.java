package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ja implements all {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final amg f22031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iz f22032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lq f22033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private all f22034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22035e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22036f;

    public ja(iz izVar, akt aktVar) {
        this.f22032b = izVar;
        this.f22031a = new amg(aktVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.all
    public final long a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(boolean r6) {
        /*
            r5 = this;
            com.google.ads.interactivemedia.v3.internal.lq r0 = r5.f22033c
            if (r0 == 0) goto L66
            boolean r0 = r0.M()
            if (r0 != 0) goto L66
            com.google.ads.interactivemedia.v3.internal.lq r0 = r5.f22033c
            boolean r0 = r0.N()
            if (r0 != 0) goto L1d
            if (r6 != 0) goto L66
            com.google.ads.interactivemedia.v3.internal.lq r6 = r5.f22033c
            boolean r6 = r6.F()
            if (r6 == 0) goto L1d
            goto L66
        L1d:
            com.google.ads.interactivemedia.v3.internal.all r6 = r5.f22034d
            com.google.ads.interactivemedia.v3.internal.ajr.b(r6)
            long r0 = r6.a()
            boolean r2 = r5.f22035e
            if (r2 == 0) goto L46
            com.google.ads.interactivemedia.v3.internal.amg r2 = r5.f22031a
            long r2 = r2.a()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L3a
            com.google.ads.interactivemedia.v3.internal.amg r6 = r5.f22031a
            r6.e()
            goto L72
        L3a:
            r2 = 0
            r5.f22035e = r2
            boolean r2 = r5.f22036f
            if (r2 == 0) goto L46
            com.google.ads.interactivemedia.v3.internal.amg r2 = r5.f22031a
            r2.d()
        L46:
            com.google.ads.interactivemedia.v3.internal.amg r2 = r5.f22031a
            r2.b(r0)
            com.google.ads.interactivemedia.v3.internal.le r6 = r6.c()
            com.google.ads.interactivemedia.v3.internal.amg r0 = r5.f22031a
            com.google.ads.interactivemedia.v3.internal.le r0 = r0.c()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L72
            com.google.ads.interactivemedia.v3.internal.amg r0 = r5.f22031a
            r0.g(r6)
            com.google.ads.interactivemedia.v3.internal.iz r0 = r5.f22032b
            r0.a(r6)
            goto L72
        L66:
            r6 = 1
            r5.f22035e = r6
            boolean r6 = r5.f22036f
            if (r6 == 0) goto L72
            com.google.ads.interactivemedia.v3.internal.amg r6 = r5.f22031a
            r6.d()
        L72:
            boolean r6 = r5.f22035e
            if (r6 == 0) goto L7d
            com.google.ads.interactivemedia.v3.internal.amg r6 = r5.f22031a
            long r0 = r6.a()
            goto L86
        L7d:
            com.google.ads.interactivemedia.v3.internal.all r6 = r5.f22034d
            com.google.ads.interactivemedia.v3.internal.ajr.b(r6)
            long r0 = r6.a()
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ja.b(boolean):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.all
    public final le c() {
        all allVar = this.f22034d;
        return allVar != null ? allVar.c() : this.f22031a.c();
    }

    public final void d(lq lqVar) {
        if (lqVar == this.f22033c) {
            this.f22034d = null;
            this.f22033c = null;
            this.f22035e = true;
        }
    }

    public final void e(lq lqVar) throws jb {
        all allVar;
        all allVarM = lqVar.m();
        if (allVarM == null || allVarM == (allVar = this.f22034d)) {
            return;
        }
        if (allVar != null) {
            throw jb.e(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f22034d = allVarM;
        this.f22033c = lqVar;
        allVarM.g(this.f22031a.c());
    }

    public final void f(long j2) {
        this.f22031a.b(j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.all
    public final void g(le leVar) {
        all allVar = this.f22034d;
        if (allVar != null) {
            allVar.g(leVar);
            leVar = this.f22034d.c();
        }
        this.f22031a.g(leVar);
    }

    public final void h() {
        this.f22036f = true;
        this.f22031a.d();
    }

    public final void i() {
        this.f22036f = false;
        this.f22031a.e();
    }
}

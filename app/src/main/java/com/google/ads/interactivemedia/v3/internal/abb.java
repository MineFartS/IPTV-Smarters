package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class abb extends aak<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final abi f19041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mf f19043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final me f19044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private aaz f19045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private aay f19046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19049i;

    public abb(abi abiVar, boolean z) {
        this.f19041a = abiVar;
        boolean z2 = false;
        if (z && abiVar.t()) {
            z2 = true;
        }
        this.f19042b = z2;
        this.f19043c = new mf();
        this.f19044d = new me();
        mg mgVarY = abiVar.Y();
        if (mgVarY == null) {
            this.f19045e = aaz.b(abiVar.V());
        } else {
            this.f19045e = aaz.c(mgVarY, null, null);
            this.f19049i = true;
        }
    }

    private final Object F(Object obj) {
        return (this.f19045e.f19033e == null || !obj.equals(aaz.f19031c)) ? obj : this.f19045e.f19033e;
    }

    private final void G(long j2) {
        aay aayVar = this.f19046f;
        int iG = this.f19045e.g(aayVar.f19024a.f19056a);
        if (iG == -1) {
            return;
        }
        long j3 = this.f19045e.y(iG, this.f19044d).f22397d;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        aayVar.s(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    @Override // com.google.ads.interactivemedia.v3.internal.aak
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void C(java.lang.Void r11, com.google.ads.interactivemedia.v3.internal.mg r12) {
        /*
            r10 = this;
            r0 = r11
            java.lang.Void r0 = (java.lang.Void) r0
            boolean r0 = r10.f19048h
            r6 = 0
            if (r0 == 0) goto L1d
            com.google.ads.interactivemedia.v3.internal.aaz r0 = r10.f19045e
            com.google.ads.interactivemedia.v3.internal.aaz r0 = r0.a(r12)
            r10.f19045e = r0
            com.google.ads.interactivemedia.v3.internal.aay r0 = r10.f19046f
            if (r0 == 0) goto La9
            long r0 = r0.o()
            r10.G(r0)
            goto La9
        L1d:
            boolean r0 = r12.A()
            if (r0 == 0) goto L3a
            boolean r0 = r10.f19049i
            if (r0 == 0) goto L2e
            com.google.ads.interactivemedia.v3.internal.aaz r0 = r10.f19045e
            com.google.ads.interactivemedia.v3.internal.aaz r0 = r0.a(r12)
            goto L36
        L2e:
            java.lang.Object r0 = com.google.ads.interactivemedia.v3.internal.mf.f22401a
            java.lang.Object r1 = com.google.ads.interactivemedia.v3.internal.aaz.f19031c
            com.google.ads.interactivemedia.v3.internal.aaz r0 = com.google.ads.interactivemedia.v3.internal.aaz.c(r12, r0, r1)
        L36:
            r10.f19045e = r0
            goto La9
        L3a:
            com.google.ads.interactivemedia.v3.internal.mf r0 = r10.f19043c
            r1 = 0
            r12.z(r1, r0)
            com.google.ads.interactivemedia.v3.internal.mf r0 = r10.f19043c
            long r2 = r0.f22413m
            java.lang.Object r7 = r0.f22402b
            com.google.ads.interactivemedia.v3.internal.aay r0 = r10.f19046f
            if (r0 == 0) goto L70
            long r4 = r0.q()
            com.google.ads.interactivemedia.v3.internal.aaz r0 = r10.f19045e
            com.google.ads.interactivemedia.v3.internal.aay r8 = r10.f19046f
            com.google.ads.interactivemedia.v3.internal.abg r8 = r8.f19024a
            java.lang.Object r8 = r8.f19056a
            com.google.ads.interactivemedia.v3.internal.me r9 = r10.f19044d
            r0.k(r8, r9)
            com.google.ads.interactivemedia.v3.internal.me r0 = r10.f19044d
            long r8 = r0.f22398e
            long r8 = r8 + r4
            com.google.ads.interactivemedia.v3.internal.aaz r0 = r10.f19045e
            com.google.ads.interactivemedia.v3.internal.mf r4 = r10.f19043c
            com.google.ads.interactivemedia.v3.internal.mf r0 = r0.z(r1, r4)
            long r0 = r0.f22413m
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 == 0) goto L70
            r4 = r8
            goto L71
        L70:
            r4 = r2
        L71:
            com.google.ads.interactivemedia.v3.internal.mf r1 = r10.f19043c
            com.google.ads.interactivemedia.v3.internal.me r2 = r10.f19044d
            r3 = 0
            r0 = r12
            android.util.Pair r0 = r0.w(r1, r2, r3, r4)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r10.f19049i
            if (r0 == 0) goto L90
            com.google.ads.interactivemedia.v3.internal.aaz r0 = r10.f19045e
            com.google.ads.interactivemedia.v3.internal.aaz r0 = r0.a(r12)
            goto L94
        L90:
            com.google.ads.interactivemedia.v3.internal.aaz r0 = com.google.ads.interactivemedia.v3.internal.aaz.c(r12, r7, r1)
        L94:
            r10.f19045e = r0
            com.google.ads.interactivemedia.v3.internal.aay r0 = r10.f19046f
            if (r0 == 0) goto La9
            r10.G(r2)
            com.google.ads.interactivemedia.v3.internal.abg r0 = r0.f19024a
            java.lang.Object r1 = r0.f19056a
            java.lang.Object r1 = r10.F(r1)
            com.google.ads.interactivemedia.v3.internal.abg r6 = r0.c(r1)
        La9:
            r0 = 1
            r10.f19049i = r0
            r10.f19048h = r0
            com.google.ads.interactivemedia.v3.internal.aaz r0 = r10.f19045e
            r10.n(r0)
            if (r6 == 0) goto Lbd
            com.google.ads.interactivemedia.v3.internal.aay r0 = r10.f19046f
            com.google.ads.interactivemedia.v3.internal.ajr.b(r0)
            r0.r(r6)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.abb.C(java.lang.Object, com.google.ads.interactivemedia.v3.internal.mg):void");
    }

    public final mg D() {
        return this.f19045e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final aay X(abg abgVar, ajm ajmVar, long j2) {
        aay aayVar = new aay(abgVar, ajmVar, j2);
        aayVar.u(this.f19041a);
        if (this.f19048h) {
            aayVar.r(abgVar.c(F(abgVar.f19056a)));
        } else {
            this.f19046f = aayVar;
            if (!this.f19047g) {
                this.f19047g = true;
                A(null, this.f19041a);
            }
        }
        return aayVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final kn V() {
        return this.f19041a.V();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void W(abe abeVar) {
        ((aay) abeVar).t();
        if (abeVar == this.f19046f) {
            this.f19046f = null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aak, com.google.ads.interactivemedia.v3.internal.aac
    public final void m(akq akqVar) {
        super.m(akqVar);
        if (this.f19042b) {
            return;
        }
        this.f19047g = true;
        A(null, this.f19041a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aak, com.google.ads.interactivemedia.v3.internal.aac
    public final void p() {
        this.f19048h = false;
        this.f19047g = false;
        super.p();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aak
    public final /* bridge */ /* synthetic */ abg w(Void r2, abg abgVar) {
        Object obj = abgVar.f19056a;
        if (this.f19045e.f19033e != null && this.f19045e.f19033e.equals(obj)) {
            obj = aaz.f19031c;
        }
        return abgVar.c(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aak, com.google.ads.interactivemedia.v3.internal.abi
    public final void z() {
    }
}

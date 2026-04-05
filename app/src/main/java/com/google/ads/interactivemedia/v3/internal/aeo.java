package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aeo implements sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aep f19394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final acj f19395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kf f19396c = new kf();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pz f19398e = new pz();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19397d = -9223372036854775807L;

    public aeo(aep aepVar, ajm ajmVar) {
        this.f19394a = aepVar;
        this.f19395b = acj.M(ajmVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final /* synthetic */ int a(aje ajeVar, int i2, boolean z) {
        return us.h(this, ajeVar, i2, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final void b(ke keVar) {
        this.f19395b.b(keVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final /* synthetic */ void c(alx alxVar, int i2) {
        us.i(this, alxVar, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x000a A[SYNTHETIC] */
    @Override // com.google.ads.interactivemedia.v3.internal.sf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r8, int r10, int r11, int r12, com.google.ads.interactivemedia.v3.internal.se r13) {
        /*
            r7 = this;
            com.google.ads.interactivemedia.v3.internal.acj r0 = r7.f19395b
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.d(r1, r3, r4, r5, r6)
        La:
            com.google.ads.interactivemedia.v3.internal.acj r8 = r7.f19395b
            r9 = 0
            boolean r8 = r8.I(r9)
            if (r8 == 0) goto L9c
            com.google.ads.interactivemedia.v3.internal.pz r8 = r7.f19398e
            r8.b()
            com.google.ads.interactivemedia.v3.internal.acj r8 = r7.f19395b
            com.google.ads.interactivemedia.v3.internal.kf r10 = r7.f19396c
            com.google.ads.interactivemedia.v3.internal.pz r11 = r7.f19398e
            int r8 = r8.l(r10, r11, r9, r9)
            r10 = -4
            if (r8 != r10) goto L2d
            com.google.ads.interactivemedia.v3.internal.pz r8 = r7.f19398e
            r8.j()
            com.google.ads.interactivemedia.v3.internal.pz r8 = r7.f19398e
            goto L2e
        L2d:
            r8 = 0
        L2e:
            if (r8 == 0) goto La
            long r10 = r8.f22803d
            com.google.ads.interactivemedia.v3.internal.aep r12 = r7.f19394a
            com.google.ads.interactivemedia.v3.internal.yw r12 = com.google.ads.interactivemedia.v3.internal.aep.b(r12)
            com.google.ads.interactivemedia.v3.internal.ys r8 = r12.a(r8)
            if (r8 == 0) goto La
            com.google.ads.interactivemedia.v3.internal.yr r8 = r8.b(r9)
            com.google.ads.interactivemedia.v3.internal.yv r8 = (com.google.ads.interactivemedia.v3.internal.yv) r8
            java.lang.String r12 = r8.f23809a
            java.lang.String r13 = r8.f23810b
            java.lang.String r0 = "urn:mpeg:dash:event:2012"
            boolean r12 = r0.equals(r12)
            r0 = 1
            if (r12 == 0) goto L6b
            java.lang.String r12 = "1"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L6a
            java.lang.String r12 = "2"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L6a
            java.lang.String r12 = "3"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L6b
            goto L6d
        L6a:
            r9 = 1
        L6b:
            if (r9 == 0) goto La
        L6d:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            byte[] r8 = r8.f23813e     // Catch: com.google.ads.interactivemedia.v3.internal.lb -> L7d
            java.lang.String r8 = com.google.ads.interactivemedia.v3.internal.amn.C(r8)     // Catch: com.google.ads.interactivemedia.v3.internal.lb -> L7d
            long r8 = com.google.ads.interactivemedia.v3.internal.amn.o(r8)     // Catch: com.google.ads.interactivemedia.v3.internal.lb -> L7d
            goto L7e
        L7d:
            r8 = r12
        L7e:
            int r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r1 == 0) goto La
            com.google.ads.interactivemedia.v3.internal.aem r12 = new com.google.ads.interactivemedia.v3.internal.aem
            r12.<init>(r10, r8)
            com.google.ads.interactivemedia.v3.internal.aep r8 = r7.f19394a
            android.os.Handler r8 = com.google.ads.interactivemedia.v3.internal.aep.a(r8)
            com.google.ads.interactivemedia.v3.internal.aep r9 = r7.f19394a
            android.os.Handler r9 = com.google.ads.interactivemedia.v3.internal.aep.a(r9)
            android.os.Message r9 = r9.obtainMessage(r0, r12)
            r8.sendMessage(r9)
            goto La
        L9c:
            com.google.ads.interactivemedia.v3.internal.acj r8 = r7.f19395b
            r8.t()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aeo.d(long, int, int, int, com.google.ads.interactivemedia.v3.internal.se):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final int e(aje ajeVar, int i2, boolean z) {
        return us.h(this.f19395b, ajeVar, i2, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final void f(alx alxVar, int i2) {
        us.i(this.f19395b, alxVar, i2);
    }

    public final void g(add addVar) {
        long j2 = this.f19397d;
        if (j2 == -9223372036854775807L || addVar.f19261j > j2) {
            this.f19397d = addVar.f19261j;
        }
        this.f19394a.h();
    }

    public final void h() {
        this.f19395b.y();
    }

    public final boolean i(add addVar) {
        long j2 = this.f19397d;
        boolean z = false;
        if (j2 != -9223372036854775807L && j2 < addVar.f19260i) {
            z = true;
        }
        return this.f19394a.g(z);
    }
}

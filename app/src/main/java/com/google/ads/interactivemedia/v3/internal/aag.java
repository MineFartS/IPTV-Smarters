package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aag implements abe, abd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final abe f18969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private abd f18971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private aaf[] f18972d = new aaf[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f18973e = 0;

    public aag(abe abeVar, long j2) {
        this.f18969a = abeVar;
        this.f18970b = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long a(long j2, lt ltVar) {
        if (j2 == 0) {
            return 0L;
        }
        long jK = amn.k(ltVar.f22345c, 0L, j2);
        long j3 = ltVar.f22346d;
        long j4 = this.f18970b;
        long jK2 = amn.k(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j2);
        if (jK != ltVar.f22345c || jK2 != ltVar.f22346d) {
            ltVar = new lt(jK, jK2);
        }
        return this.f18969a.a(j2, ltVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final long bc() {
        long jBc = this.f18969a.bc();
        if (jBc != Long.MIN_VALUE) {
            long j2 = this.f18970b;
            if (j2 == Long.MIN_VALUE || jBc < j2) {
                return jBc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final long c() {
        long jC = this.f18969a.c();
        if (jC != Long.MIN_VALUE) {
            long j2 = this.f18970b;
            if (j2 == Long.MIN_VALUE || jC < j2) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long d() {
        if (o()) {
            long j2 = this.f18973e;
            this.f18973e = -9223372036854775807L;
            long jD = d();
            return jD != -9223372036854775807L ? jD : j2;
        }
        long jD2 = this.f18969a.d();
        if (jD2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        ajr.f(jD2 >= 0);
        long j3 = this.f18970b;
        ajr.f(j3 == Long.MIN_VALUE || jD2 <= j3);
        return jD2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // com.google.ads.interactivemedia.v3.internal.abe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f18973e = r0
            com.google.ads.interactivemedia.v3.internal.aaf[] r0 = r7.f18972d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.c()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.ads.interactivemedia.v3.internal.abe r0 = r7.f18969a
            long r0 = r0.e(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L35
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L36
            long r8 = r7.f18970b
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L35
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L36
        L35:
            r2 = 1
        L36:
            com.google.ads.interactivemedia.v3.internal.ajr.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aag.e(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // com.google.ads.interactivemedia.v3.internal.abe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(com.google.ads.interactivemedia.v3.internal.aii[] r14, boolean[] r15, com.google.ads.interactivemedia.v3.internal.ack[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = 2
            com.google.ads.interactivemedia.v3.internal.aaf[] r2 = new com.google.ads.interactivemedia.v3.internal.aaf[r1]
            r0.f18972d = r2
            com.google.ads.interactivemedia.v3.internal.ack[] r2 = new com.google.ads.interactivemedia.v3.internal.ack[r1]
            r10 = 0
            r3 = 0
        La:
            r11 = 0
            if (r3 >= r1) goto L1e
            com.google.ads.interactivemedia.v3.internal.aaf[] r4 = r0.f18972d
            r5 = r16[r3]
            com.google.ads.interactivemedia.v3.internal.aaf r5 = (com.google.ads.interactivemedia.v3.internal.aaf) r5
            r4[r3] = r5
            if (r5 == 0) goto L19
            com.google.ads.interactivemedia.v3.internal.ack r11 = r5.f18966a
        L19:
            r2[r3] = r11
            int r3 = r3 + 1
            goto La
        L1e:
            com.google.ads.interactivemedia.v3.internal.abe r3 = r0.f18969a
            r4 = r14
            r5 = r15
            r6 = r2
            r7 = r17
            r8 = r18
            long r3 = r3.f(r4, r5, r6, r7, r8)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f18973e = r5
            r5 = 1
            int r6 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r6 == 0) goto L4b
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 < 0) goto L4a
            long r6 = r0.f18970b
            r8 = -9223372036854775808
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 == 0) goto L4b
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 > 0) goto L4a
            goto L4b
        L4a:
            r5 = 0
        L4b:
            com.google.ads.interactivemedia.v3.internal.ajr.f(r5)
        L4e:
            if (r10 >= r1) goto L73
            r5 = r2[r10]
            if (r5 != 0) goto L59
            com.google.ads.interactivemedia.v3.internal.aaf[] r5 = r0.f18972d
            r5[r10] = r11
            goto L6a
        L59:
            com.google.ads.interactivemedia.v3.internal.aaf[] r6 = r0.f18972d
            r7 = r6[r10]
            if (r7 == 0) goto L63
            com.google.ads.interactivemedia.v3.internal.ack r7 = r7.f18966a
            if (r7 == r5) goto L6a
        L63:
            com.google.ads.interactivemedia.v3.internal.aaf r7 = new com.google.ads.interactivemedia.v3.internal.aaf
            r7.<init>(r13, r5)
            r6[r10] = r7
        L6a:
            com.google.ads.interactivemedia.v3.internal.aaf[] r5 = r0.f18972d
            r5 = r5[r10]
            r16[r10] = r5
            int r10 = r10 + 1
            goto L4e
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aag.f(com.google.ads.interactivemedia.v3.internal.aii[], boolean[], com.google.ads.interactivemedia.v3.internal.ack[], boolean[], long):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acl
    public final /* bridge */ /* synthetic */ void g(acm acmVar) {
        abd abdVar = this.f18971c;
        ajr.b(abdVar);
        abdVar.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final act h() {
        return this.f18969a.h();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abd
    public final void i(abe abeVar) {
        abd abdVar = this.f18971c;
        ajr.b(abdVar);
        abdVar.i(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final void j() {
        this.f18969a.j();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final void k(abd abdVar, long j2) {
        this.f18971c = abdVar;
        this.f18969a.k(this, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final void l(long j2) {
        this.f18969a.l(j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final boolean m(long j2) {
        return this.f18969a.m(j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final boolean n() {
        return this.f18969a.n();
    }

    public final boolean o() {
        return this.f18973e != -9223372036854775807L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final void p(long j2) {
        this.f18969a.p(j2);
    }

    public final void q(long j2) {
        this.f18970b = j2;
    }
}

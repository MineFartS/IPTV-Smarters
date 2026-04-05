package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class adx extends mg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f19328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f19329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f19330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final aer f19331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final kn f19332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final kl f19333k;

    public adx(long j2, long j3, long j4, int i2, long j5, long j6, long j7, aer aerVar, kn knVar, kl klVar) {
        ajr.f(aerVar.f19418d == (klVar != null));
        this.f19324b = j2;
        this.f19325c = j3;
        this.f19326d = j4;
        this.f19327e = i2;
        this.f19328f = j5;
        this.f19329g = j6;
        this.f19330h = j7;
        this.f19331i = aerVar;
        this.f19332j = knVar;
        this.f19333k = klVar;
    }

    private static boolean a(aer aerVar) {
        return aerVar.f19418d && aerVar.f19419e != -9223372036854775807L && aerVar.f19416b == -9223372036854775807L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int g(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f19327e) >= 0 && iIntValue < s()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final me j(int i2, me meVar, boolean z) {
        ajr.g(i2, s());
        return meVar.k(z ? this.f19331i.e(i2).f19447a : null, z ? Integer.valueOf(this.f19327e + i2) : null, this.f19331i.d(i2), iw.b(this.f19331i.e(i2).f19448b - this.f19331i.e(0).f19448b) - this.f19328f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[PHI: r1
  0x002b: PHI (r1v2 long) = (r1v1 long), (r1v5 long) binds: [B:6:0x001b, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.ads.interactivemedia.v3.internal.mg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.ads.interactivemedia.v3.internal.mf l(int r26, com.google.ads.interactivemedia.v3.internal.mf r27, long r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = 1
            r2 = r26
            com.google.ads.interactivemedia.v3.internal.ajr.g(r2, r1)
            long r1 = r0.f19330h
            com.google.ads.interactivemedia.v3.internal.aer r3 = r0.f19331i
            boolean r3 = a(r3)
            r4 = -1
            if (r3 != 0) goto L17
        L13:
            r18 = r1
            goto L9b
        L17:
            r5 = 0
            int r3 = (r28 > r5 ? 1 : (r28 == r5 ? 0 : -1))
            if (r3 <= 0) goto L2b
            long r1 = r1 + r28
            long r7 = r0.f19329g
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto L2b
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L13
        L2b:
            long r7 = r0.f19328f
            long r7 = r7 + r1
            com.google.ads.interactivemedia.v3.internal.aer r3 = r0.f19331i
            r9 = 0
            long r10 = r3.d(r9)
            r3 = 0
        L36:
            com.google.ads.interactivemedia.v3.internal.aer r12 = r0.f19331i
            int r12 = r12.b()
            int r12 = r12 + r4
            if (r3 >= r12) goto L4d
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 < 0) goto L4d
            long r7 = r7 - r10
            int r3 = r3 + 1
            com.google.ads.interactivemedia.v3.internal.aer r10 = r0.f19331i
            long r10 = r10.d(r3)
            goto L36
        L4d:
            com.google.ads.interactivemedia.v3.internal.aer r12 = r0.f19331i
            com.google.ads.interactivemedia.v3.internal.aew r3 = r12.e(r3)
            java.util.List<com.google.ads.interactivemedia.v3.internal.aeq> r12 = r3.f19449c
            int r12 = r12.size()
            r13 = 0
        L5a:
            if (r13 >= r12) goto L6c
            java.util.List<com.google.ads.interactivemedia.v3.internal.aeq> r14 = r3.f19449c
            java.lang.Object r14 = r14.get(r13)
            com.google.ads.interactivemedia.v3.internal.aeq r14 = (com.google.ads.interactivemedia.v3.internal.aeq) r14
            int r14 = r14.f19410b
            r15 = 2
            if (r14 == r15) goto L6d
            int r13 = r13 + 1
            goto L5a
        L6c:
            r13 = -1
        L6d:
            if (r13 != r4) goto L70
            goto L13
        L70:
            java.util.List<com.google.ads.interactivemedia.v3.internal.aeq> r3 = r3.f19449c
            java.lang.Object r3 = r3.get(r13)
            com.google.ads.interactivemedia.v3.internal.aeq r3 = (com.google.ads.interactivemedia.v3.internal.aeq) r3
            java.util.List<com.google.ads.interactivemedia.v3.internal.afb> r3 = r3.f19411c
            java.lang.Object r3 = r3.get(r9)
            com.google.ads.interactivemedia.v3.internal.afb r3 = (com.google.ads.interactivemedia.v3.internal.afb) r3
            com.google.ads.interactivemedia.v3.internal.aef r3 = r3.k()
            if (r3 == 0) goto L13
            long r12 = r3.f(r10)
            int r9 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r9 != 0) goto L8f
            goto L13
        L8f:
            long r5 = r3.g(r7, r10)
            long r5 = r3.h(r5)
            long r1 = r1 + r5
            long r1 = r1 - r7
            goto L13
        L9b:
            java.lang.Object r6 = com.google.ads.interactivemedia.v3.internal.mf.f22401a
            com.google.ads.interactivemedia.v3.internal.kn r7 = r0.f19332j
            com.google.ads.interactivemedia.v3.internal.aer r1 = r0.f19331i
            r8 = r1
            long r9 = r0.f19324b
            long r11 = r0.f19325c
            long r13 = r0.f19326d
            r15 = 1
            boolean r16 = a(r1)
            com.google.ads.interactivemedia.v3.internal.kl r1 = r0.f19333k
            r17 = r1
            long r1 = r0.f19329g
            r20 = r1
            int r1 = r25.s()
            int r22 = r1 + (-1)
            long r1 = r0.f19328f
            r23 = r1
            r5 = r27
            r5.c(r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r23)
            return r27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.adx.l(int, com.google.ads.interactivemedia.v3.internal.mf, long):com.google.ads.interactivemedia.v3.internal.mf");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final Object q(int i2) {
        ajr.g(i2, s());
        return Integer.valueOf(this.f19327e + i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int s() {
        return this.f19331i.b();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int t() {
        return 1;
    }
}

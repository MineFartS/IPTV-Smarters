package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aae implements abr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rp f18963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rj f18964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private rk f18965c;

    public aae(rp rpVar) {
        this.f18963a = rpVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abr
    public final int a(rz rzVar) {
        rj rjVar = this.f18964b;
        ajr.b(rjVar);
        rk rkVar = this.f18965c;
        ajr.b(rkVar);
        return rjVar.a(rkVar, rzVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abr
    public final long b() {
        rk rkVar = this.f18965c;
        if (rkVar != null) {
            return rkVar.e();
        }
        return -1L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abr
    public final void c() {
        rj rjVar = this.f18964b;
        if (rjVar instanceof tt) {
            ((tt) rjVar).e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    @Override // com.google.ads.interactivemedia.v3.internal.abr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.ads.interactivemedia.v3.internal.aje r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.google.ads.interactivemedia.v3.internal.rm r15) throws com.google.ads.interactivemedia.v3.internal.acu {
        /*
            r7 = this;
            com.google.ads.interactivemedia.v3.internal.rg r6 = new com.google.ads.interactivemedia.v3.internal.rg
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f18965c = r6
            com.google.ads.interactivemedia.v3.internal.rj r8 = r7.f18964b
            if (r8 == 0) goto L10
            return
        L10:
            com.google.ads.interactivemedia.v3.internal.rp r8 = r7.f18963a
            com.google.ads.interactivemedia.v3.internal.rj[] r8 = r8.b(r9, r10)
            int r9 = r8.length
            r10 = 0
            r13 = 1
            if (r9 != r13) goto L20
            r8 = r8[r10]
            r7.f18964b = r8
            goto L74
        L20:
            r14 = 0
        L21:
            if (r14 >= r9) goto L70
            r0 = r8[r14]
            boolean r1 = r0.f(r6)     // Catch: java.lang.Throwable -> L41 java.io.EOFException -> L56
            if (r1 == 0) goto L34
            r7.f18964b = r0     // Catch: java.lang.Throwable -> L41 java.io.EOFException -> L56
            com.google.ads.interactivemedia.v3.internal.ajr.f(r13)
            r6.i()
            goto L70
        L34:
            com.google.ads.interactivemedia.v3.internal.rj r0 = r7.f18964b
            if (r0 != 0) goto L66
            long r0 = r6.e()
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L64
            goto L66
        L41:
            r8 = move-exception
            com.google.ads.interactivemedia.v3.internal.rj r9 = r7.f18964b
            if (r9 != 0) goto L4e
            long r14 = r6.e()
            int r9 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r9 != 0) goto L4f
        L4e:
            r10 = 1
        L4f:
            com.google.ads.interactivemedia.v3.internal.ajr.f(r10)
            r6.i()
            throw r8
        L56:
            com.google.ads.interactivemedia.v3.internal.rj r0 = r7.f18964b
            if (r0 != 0) goto L66
            long r0 = r6.e()
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L64
            goto L66
        L64:
            r0 = 0
            goto L67
        L66:
            r0 = 1
        L67:
            com.google.ads.interactivemedia.v3.internal.ajr.f(r0)
            r6.i()
            int r14 = r14 + 1
            goto L21
        L70:
            com.google.ads.interactivemedia.v3.internal.rj r9 = r7.f18964b
            if (r9 == 0) goto L7a
        L74:
            com.google.ads.interactivemedia.v3.internal.rj r8 = r7.f18964b
            r8.b(r15)
            return
        L7a:
            com.google.ads.interactivemedia.v3.internal.acu r9 = new com.google.ads.interactivemedia.v3.internal.acu
            java.lang.String r8 = com.google.ads.interactivemedia.v3.internal.amn.F(r8)
            java.lang.String r10 = java.lang.String.valueOf(r8)
            int r10 = r10.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r10 = r10 + 58
            r11.<init>(r10)
            java.lang.String r10 = "None of the available extractors ("
            r11.append(r10)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            goto La5
        La4:
            throw r9
        La5:
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aae.d(com.google.ads.interactivemedia.v3.internal.aje, android.net.Uri, java.util.Map, long, long, com.google.ads.interactivemedia.v3.internal.rm):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abr
    public final void e() {
        if (this.f18964b != null) {
            this.f18964b = null;
        }
        this.f18965c = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abr
    public final void f(long j2, long j3) {
        rj rjVar = this.f18964b;
        ajr.b(rjVar);
        rjVar.d(j2, j3);
    }
}

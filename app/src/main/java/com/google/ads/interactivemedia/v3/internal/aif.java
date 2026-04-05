package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aif implements Comparable<aif> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aia f19821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19826g;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aif(com.google.ads.interactivemedia.v3.internal.ke r7, com.google.ads.interactivemedia.v3.internal.aia r8, int r9, boolean r10) {
        /*
            r6 = this;
            r6.<init>()
            r6.f19821b = r8
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1
            r2 = -1
            r3 = 0
            if (r10 == 0) goto L33
            int r4 = r7.q
            if (r4 == r2) goto L14
            int r5 = r8.f19780b
            if (r4 > r5) goto L33
        L14:
            int r4 = r7.r
            if (r4 == r2) goto L1c
            int r5 = r8.f19781c
            if (r4 > r5) goto L33
        L1c:
            float r4 = r7.s
            int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r5 == 0) goto L29
            int r5 = r8.f19782d
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L33
        L29:
            int r4 = r7.f22152h
            if (r4 == r2) goto L31
            int r5 = r8.f19783e
            if (r4 > r5) goto L33
        L31:
            r4 = 1
            goto L34
        L33:
            r4 = 0
        L34:
            r6.f19820a = r4
            if (r10 == 0) goto L5e
            int r10 = r7.q
            if (r10 == r2) goto L40
            int r4 = r8.f19784f
            if (r10 < r4) goto L5e
        L40:
            int r10 = r7.r
            if (r10 == r2) goto L48
            int r4 = r8.f19785g
            if (r10 < r4) goto L5e
        L48:
            float r10 = r7.s
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L55
            int r0 = r8.f19786h
            float r0 = (float) r0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5e
        L55:
            int r10 = r7.f22152h
            if (r10 == r2) goto L5f
            int r0 = r8.f19787i
            if (r10 < r0) goto L5e
            goto L5f
        L5e:
            r1 = 0
        L5f:
            r6.f19822c = r1
            boolean r9 = com.google.ads.interactivemedia.v3.internal.aig.e(r9, r3)
            r6.f19823d = r9
            int r9 = r7.f22152h
            r6.f19824e = r9
            int r9 = r7.a()
            r6.f19825f = r9
        L71:
            com.google.ads.interactivemedia.v3.internal.aty<java.lang.String> r9 = r8.p
            int r9 = r9.size()
            if (r3 >= r9) goto L8d
            java.lang.String r9 = r7.f22156l
            if (r9 == 0) goto L8a
            com.google.ads.interactivemedia.v3.internal.aty<java.lang.String> r10 = r8.p
            java.lang.Object r10 = r10.get(r3)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L8a
            goto L90
        L8a:
            int r3 = r3 + 1
            goto L71
        L8d:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L90:
            r6.f19826g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aif.<init>(com.google.ads.interactivemedia.v3.internal.ke, com.google.ads.interactivemedia.v3.internal.aia, int, boolean):void");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(aif aifVar) {
        ave aveVarA = (this.f19820a && this.f19823d) ? aig.f19829c : aig.f19829c.a();
        return ate.j().d(this.f19823d, aifVar.f19823d).d(this.f19820a, aifVar.f19820a).d(this.f19822c, aifVar.f19822c).c(Integer.valueOf(this.f19826g), Integer.valueOf(aifVar.f19826g), ave.c().a()).c(Integer.valueOf(this.f19824e), Integer.valueOf(aifVar.f19824e), this.f19821b.x ? aig.f19829c.a() : aig.f19830d).c(Integer.valueOf(this.f19825f), Integer.valueOf(aifVar.f19825f), aveVarA).c(Integer.valueOf(this.f19824e), Integer.valueOf(aifVar.f19824e), aveVarA).a();
    }
}

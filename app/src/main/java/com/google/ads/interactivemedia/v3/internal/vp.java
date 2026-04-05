package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class vp implements rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23361a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vq f23362b = new vq();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final alx f23363c = new alx(2786);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23364d;

    static {
        vr vrVar = vr.f23377a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final int a(rk rkVar, rz rzVar) {
        int iB = rkVar.b(this.f23363c.K(), 0, 2786);
        if (iB == -1) {
            return -1;
        }
        this.f23363c.I(0);
        this.f23363c.H(iB);
        if (!this.f23364d) {
            this.f23362b.d(0L, 4);
            this.f23364d = true;
        }
        this.f23362b.a(this.f23363c);
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        this.f23362b.b(rmVar, new xg(0, 1));
        rmVar.ba();
        rmVar.bb(new sb(-9223372036854775807L));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        this.f23364d = false;
        this.f23362b.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r8.i();
        r4 = r4 + 1;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(com.google.ads.interactivemedia.v3.internal.rk r8) {
        /*
            r7 = this;
            com.google.ads.interactivemedia.v3.internal.alx r0 = new com.google.ads.interactivemedia.v3.internal.alx
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.K()
            r8.g(r4, r2, r1)
            r0.I(r2)
            int r4 = r0.m()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L5f
            r8.i()
            r8.f(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.K()
            r6 = 6
            r8.g(r5, r2, r6)
            r0.I(r2)
            int r5 = r0.o()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L47
            r8.i()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L43
            return r2
        L43:
            r8.f(r4)
            goto L23
        L47:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L4d
            return r5
        L4d:
            byte[] r5 = r0.K()
            int r5 = com.google.ads.interactivemedia.v3.internal.nr.b(r5)
            r6 = -1
            if (r5 != r6) goto L59
            return r2
        L59:
            int r5 = r5 + (-6)
            r8.f(r5)
            goto L24
        L5f:
            r4 = 3
            r0.J(r4)
            int r4 = r0.j()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.f(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.vp.f(com.google.ads.interactivemedia.v3.internal.rk):boolean");
    }
}

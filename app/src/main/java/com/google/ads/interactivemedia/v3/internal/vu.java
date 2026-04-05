package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class vu implements rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23400a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vv f23401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final alx f23402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final alx f23403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final alw f23404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private rm f23405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f23406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f23407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23410k;

    static {
        vr vrVar = vr.f23377a;
    }

    public vu() {
        this(null);
    }

    public vu(byte[] bArr) {
        this.f23401b = new vv(true, null);
        this.f23402c = new alx(2048);
        this.f23408i = -1;
        this.f23407h = -1L;
        alx alxVar = new alx(10);
        this.f23403d = alxVar;
        this.f23404e = new alw(alxVar.K());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final int a(rk rkVar, rz rzVar) {
        ajr.c(this.f23405f);
        int iB = rkVar.b(this.f23402c.K(), 0, 2048);
        if (!this.f23410k) {
            this.f23405f.bb(new sb(-9223372036854775807L));
            this.f23410k = true;
        }
        if (iB == -1) {
            return -1;
        }
        this.f23402c.I(0);
        this.f23402c.H(iB);
        if (!this.f23409j) {
            this.f23401b.d(this.f23406g, 4);
            this.f23409j = true;
        }
        this.f23401b.a(this.f23402c);
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        this.f23405f = rmVar;
        this.f23401b.b(rmVar, new xg(0, 1));
        rmVar.ba();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        this.f23409j = false;
        this.f23401b.e();
        this.f23406g = j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        r9.i();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if ((r3 - r1) < 8192) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        return false;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(com.google.ads.interactivemedia.v3.internal.rk r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.ads.interactivemedia.v3.internal.alx r2 = r8.f23403d
            byte[] r2 = r2.K()
            r3 = 10
            r9.g(r2, r0, r3)
            com.google.ads.interactivemedia.v3.internal.alx r2 = r8.f23403d
            r2.I(r0)
            com.google.ads.interactivemedia.v3.internal.alx r2 = r8.f23403d
            int r2 = r2.m()
            r3 = 4801587(0x494433, float:6.728456E-39)
            if (r2 == r3) goto L8a
            r9.i()
            r9.f(r1)
            long r2 = r8.f23407h
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L2e
            long r2 = (long) r1
            r8.f23407h = r2
        L2e:
            r3 = r1
        L2f:
            r2 = 0
            r4 = 0
        L31:
            com.google.ads.interactivemedia.v3.internal.alx r5 = r8.f23403d
            byte[] r5 = r5.K()
            r6 = 2
            r9.g(r5, r0, r6)
            com.google.ads.interactivemedia.v3.internal.alx r5 = r8.f23403d
            r5.I(r0)
            com.google.ads.interactivemedia.v3.internal.alx r5 = r8.f23403d
            int r5 = r5.o()
            boolean r5 = com.google.ads.interactivemedia.v3.internal.vv.f(r5)
            if (r5 != 0) goto L5c
            r9.i()
            int r3 = r3 + 1
            int r2 = r3 - r1
            r4 = 8192(0x2000, float:1.148E-41)
            if (r2 < r4) goto L58
            return r0
        L58:
            r9.f(r3)
            goto L2f
        L5c:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L67
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 > r7) goto L66
            goto L67
        L66:
            return r5
        L67:
            com.google.ads.interactivemedia.v3.internal.alx r5 = r8.f23403d
            byte[] r5 = r5.K()
            r9.g(r5, r0, r6)
            com.google.ads.interactivemedia.v3.internal.alw r5 = r8.f23404e
            r6 = 14
            r5.g(r6)
            com.google.ads.interactivemedia.v3.internal.alw r5 = r8.f23404e
            r6 = 13
            int r5 = r5.c(r6)
            r6 = 6
            if (r5 > r6) goto L83
            return r0
        L83:
            int r6 = r5 + (-6)
            r9.f(r6)
            int r4 = r4 + r5
            goto L31
        L8a:
            com.google.ads.interactivemedia.v3.internal.alx r2 = r8.f23403d
            r3 = 3
            r2.J(r3)
            com.google.ads.interactivemedia.v3.internal.alx r2 = r8.f23403d
            int r2 = r2.j()
            int r3 = r2 + 10
            int r1 = r1 + r3
            r9.f(r2)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.vu.f(com.google.ads.interactivemedia.v3.internal.rk):boolean");
    }
}

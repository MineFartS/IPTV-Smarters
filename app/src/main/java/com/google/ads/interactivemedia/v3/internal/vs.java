package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class vs implements rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23383a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vt f23384b = new vt(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final alx f23385c = new alx(16384);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23386d;

    static {
        vr vrVar = vr.f23377a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final int a(rk rkVar, rz rzVar) {
        int iB = rkVar.b(this.f23385c.K(), 0, 16384);
        if (iB == -1) {
            return -1;
        }
        this.f23385c.I(0);
        this.f23385c.H(iB);
        if (!this.f23386d) {
            this.f23384b.d(0L, 4);
            this.f23386d = true;
        }
        this.f23384b.a(this.f23385c);
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        this.f23384b.b(rmVar, new xg(0, 1));
        rmVar.ba();
        rmVar.bb(new sb(-9223372036854775807L));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        this.f23386d = false;
        this.f23384b.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        r15.i();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if ((r4 - r3) < 8192) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        return false;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(com.google.ads.interactivemedia.v3.internal.rk r15) {
        /*
            r14 = this;
            com.google.ads.interactivemedia.v3.internal.alx r0 = new com.google.ads.interactivemedia.v3.internal.alx
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.K()
            r15.g(r4, r2, r1)
            r0.I(r2)
            int r4 = r0.m()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L96
            r15.i()
            r15.f(r3)
            r4 = r3
        L24:
            r1 = 0
        L25:
            byte[] r5 = r0.K()
            r7 = 7
            r15.g(r5, r2, r7)
            r0.I(r2)
            int r5 = r0.o()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r8) goto L4e
            if (r5 == r9) goto L4e
            r15.i()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L4a
            return r2
        L4a:
            r15.f(r4)
            goto L24
        L4e:
            r8 = 1
            int r1 = r1 + r8
            r10 = 4
            if (r1 < r10) goto L54
            return r8
        L54:
            byte[] r8 = r0.K()
            int r11 = com.google.ads.interactivemedia.v3.internal.nt.f22563a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r7) goto L60
            r11 = -1
            goto L8d
        L60:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r6]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L87
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L88
        L87:
            r7 = 4
        L88:
            if (r5 != r9) goto L8c
            int r7 = r7 + 2
        L8c:
            int r11 = r11 + r7
        L8d:
            if (r11 != r12) goto L90
            return r2
        L90:
            int r11 = r11 + (-7)
            r15.f(r11)
            goto L25
        L96:
            r0.J(r6)
            int r4 = r0.j()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r15.f(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.vs.f(com.google.ads.interactivemedia.v3.internal.rk):boolean");
    }
}

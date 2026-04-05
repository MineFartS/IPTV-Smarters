package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class afz extends adn {
    private static final AtomicInteger p = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private agk C;
    private int D;
    private boolean E;
    private volatile boolean F;
    private boolean G;
    private aty<Integer> H;
    private boolean I;
    private boolean J;
    private final afn K;
    private afn L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19539b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f19540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f19541n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f19542o;
    private final ajh q;
    private final ajl r;
    private final boolean s;
    private final boolean t;
    private final aml u;
    private final afy v;
    private final List<ke> w;
    private final qg x;
    private final zn y;
    private final alx z;

    private afz(afy afyVar, ajh ajhVar, ajl ajlVar, ke keVar, boolean z, ajh ajhVar2, ajl ajlVar2, boolean z2, Uri uri, List list, int i2, long j2, long j3, long j4, int i3, boolean z3, int i4, boolean z4, boolean z5, aml amlVar, qg qgVar, afn afnVar, zn znVar, alx alxVar, boolean z6) {
        super(ajhVar, ajlVar, keVar, i2, j2, j3, j4);
        this.A = z;
        this.f19542o = i3;
        this.J = z3;
        this.f19539b = i4;
        this.r = ajlVar2;
        this.q = ajhVar2;
        this.E = ajlVar2 != null;
        this.B = z2;
        this.f19540m = uri;
        this.s = z5;
        this.u = amlVar;
        this.t = z4;
        this.v = afyVar;
        this.w = list;
        this.x = qgVar;
        this.K = afnVar;
        this.y = znVar;
        this.z = alxVar;
        this.f19541n = z6;
        this.H = aty.n();
        this.f19538a = p.getAndIncrement();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r5.u != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m(com.google.ads.interactivemedia.v3.internal.afz r3, android.net.Uri r4, com.google.ads.interactivemedia.v3.internal.ahf r5, com.google.ads.interactivemedia.v3.internal.afw r6, long r7) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.net.Uri r1 = r3.f19540m
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L12
            boolean r4 = r3.G
            if (r4 != 0) goto L11
            goto L12
        L11:
            return r0
        L12:
            com.google.ads.interactivemedia.v3.internal.ahd r4 = r6.f19518a
            long r1 = r4.f19693g
            long r7 = r7 + r1
            boolean r1 = r4 instanceof com.google.ads.interactivemedia.v3.internal.aha
            r2 = 1
            if (r1 == 0) goto L2f
            com.google.ads.interactivemedia.v3.internal.aha r4 = (com.google.ads.interactivemedia.v3.internal.aha) r4
            boolean r4 = r4.f19683a
            if (r4 != 0) goto L2d
            int r4 = r6.f19520c
            if (r4 != 0) goto L2b
            boolean r4 = r5.u
            if (r4 == 0) goto L3b
            goto L2d
        L2b:
            r4 = 0
            goto L31
        L2d:
            r4 = 1
            goto L31
        L2f:
            boolean r4 = r5.u
        L31:
            if (r4 == 0) goto L3b
            long r3 = r3.f19261j
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L3a
            goto L3b
        L3a:
            return r0
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.afz.m(com.google.ads.interactivemedia.v3.internal.afz, android.net.Uri, com.google.ads.interactivemedia.v3.internal.ahf, com.google.ads.interactivemedia.v3.internal.afw, long):boolean");
    }

    public static afz n(afy afyVar, ajh ajhVar, ke keVar, long j2, ahf ahfVar, afw afwVar, Uri uri, List<ke> list, int i2, boolean z, agp agpVar, afz afzVar, byte[] bArr, byte[] bArr2, boolean z2) {
        byte[] bArrR;
        ajh ajhVarP;
        ajl ajlVar;
        boolean z3;
        zn znVar;
        afn afnVar;
        alx alxVar;
        byte[] bArrR2;
        ahd ahdVar = afwVar.f19518a;
        ajk ajkVar = new ajk();
        ajkVar.f(arj.l(ahfVar.s, ahdVar.f19689c));
        ajkVar.e(ahdVar.f19697k);
        ajkVar.d(ahdVar.f19698l);
        ajkVar.b(true != afwVar.f19521d ? 0 : 8);
        ajl ajlVarA = ajkVar.a();
        boolean z4 = bArr != null;
        if (z4) {
            String str = ahdVar.f19696j;
            ajr.b(str);
            bArrR = r(str);
        } else {
            bArrR = null;
        }
        ajh ajhVarP2 = p(ajhVar, bArr, bArrR);
        ahc ahcVar = ahdVar.f19690d;
        if (ahcVar != null) {
            boolean z5 = bArr2 != null;
            if (z5) {
                String str2 = ahcVar.f19696j;
                ajr.b(str2);
                bArrR2 = r(str2);
            } else {
                bArrR2 = null;
            }
            ajl ajlVar2 = new ajl(arj.l(ahfVar.s, ahcVar.f19689c), ahcVar.f19697k, ahcVar.f19698l);
            z3 = z5;
            ajhVarP = p(ajhVar, bArr2, bArrR2);
            ajlVar = ajlVar2;
        } else {
            ajhVarP = null;
            ajlVar = null;
            z3 = false;
        }
        long j3 = j2 + ahdVar.f19693g;
        long j4 = j3 + ahdVar.f19691e;
        int i3 = ahfVar.f19710f + ahdVar.f19692f;
        if (afzVar != null) {
            boolean z6 = uri.equals(afzVar.f19540m) && afzVar.G;
            znVar = afzVar.y;
            alxVar = afzVar.z;
            afnVar = (z6 && !afzVar.I && afzVar.f19539b == i3) ? afzVar.L : null;
        } else {
            znVar = new zn(null);
            afnVar = null;
            alxVar = new alx(10);
        }
        return new afz(afyVar, ajhVarP2, ajlVarA, keVar, z4, ajhVarP, ajlVar, z3, uri, list, i2, j3, j4, afwVar.f19519b, afwVar.f19520c, !afwVar.f19521d, i3, ahdVar.f19699m, z, agpVar.a(i3), ahdVar.f19694h, afnVar, znVar, alxVar, z2);
    }

    private final long o(rk rkVar) throws Throwable {
        rkVar.i();
        try {
            this.z.E(10);
            rkVar.g(this.z.K(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.z.m() != 4801587) {
            return -9223372036854775807L;
        }
        this.z.J(3);
        int iJ = this.z.j();
        int i2 = iJ + 10;
        if (i2 > this.z.b()) {
            byte[] bArrK = this.z.K();
            this.z.E(i2);
            System.arraycopy(bArrK, 0, this.z.K(), 0, 10);
        }
        rkVar.g(this.z.K(), 10, iJ);
        ys ysVarC = this.y.c(this.z.K(), iJ);
        if (ysVarC == null) {
            return -9223372036854775807L;
        }
        int iA = ysVarC.a();
        for (int i3 = 0; i3 < iA; i3++) {
            yr yrVarB = ysVarC.b(i3);
            if (yrVarB instanceof zr) {
                zr zrVar = (zr) yrVarB;
                if ("com.apple.streaming.transportStreamTimestamp".equals(zrVar.f23879a)) {
                    System.arraycopy(zrVar.f23880b, 0, this.z.K(), 0, 8);
                    this.z.I(0);
                    this.z.H(8);
                    return this.z.r() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private static ajh p(ajh ajhVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return ajhVar;
        }
        ajr.b(bArr2);
        return new afm(ajhVar, bArr, bArr2);
    }

    private final void q(ajh ajhVar, ajl ajlVar, boolean z) {
        ajl ajlVarA;
        ajh ajhVar2;
        rg rgVar;
        long jE;
        long j2;
        afn afnVarA;
        int i2 = this.D;
        if (z) {
            z = i2 != 0;
            ajhVar2 = ajhVar;
            ajlVarA = ajlVar;
        } else {
            ajlVarA = ajlVar.a(i2);
            ajhVar2 = ajhVar;
        }
        try {
            rg rgVar2 = new rg(ajhVar, ajlVarA.f19901e, ajhVar2.a(ajlVarA));
            if (this.L == null) {
                long jO = o(rgVar2);
                rgVar2.i();
                afn afnVar = this.K;
                if (afnVar != null) {
                    afnVarA = afnVar.c();
                    rgVar = rgVar2;
                } else {
                    rgVar = rgVar2;
                    afnVarA = ((afp) this.v).a(ajlVarA.f19897a, this.f19257f, this.w, this.u, ajhVar.d(), rgVar);
                }
                this.L = afnVarA;
                rj rjVar = afnVarA.f19505a;
                if ((rjVar instanceof vu) || (rjVar instanceof vp) || (rjVar instanceof vs) || (rjVar instanceof tt)) {
                    this.C.w(jO != -9223372036854775807L ? this.u.b(jO) : this.f19260i);
                } else {
                    this.C.w(0L);
                }
                this.C.q();
                this.L.f19505a.b(this.C);
            } else {
                rgVar = rgVar2;
            }
            this.C.t(this.x);
            if (z) {
                rgVar.j(this.D);
            }
            while (!this.F && this.L.b(rgVar)) {
                try {
                    try {
                    } catch (Throwable th) {
                        this.D = (int) (rgVar.e() - ajlVar.f19901e);
                        throw th;
                    }
                } catch (EOFException e2) {
                    if ((this.f19257f.f22149e & 16384) == 0) {
                        throw e2;
                    }
                    this.L.f19505a.d(0L, 0L);
                    jE = rgVar.e();
                    j2 = ajlVar.f19901e;
                }
            }
            jE = rgVar.e();
            j2 = ajlVar.f19901e;
            this.D = (int) (jE - j2);
        } finally {
            amn.K(ajhVar);
        }
    }

    private static byte[] r(String str) {
        if (arq.b(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length;
        int i2 = length > 16 ? length - 16 : 0;
        System.arraycopy(byteArray, i2, bArr, (16 - length) + i2, length - i2);
        return bArr;
    }

    public final int a(int i2) {
        ajr.f(!this.f19541n);
        if (i2 >= this.H.size()) {
            return 0;
        }
        return this.H.get(i2).intValue();
    }

    public final void b(agk agkVar, aty<Integer> atyVar) {
        this.C = agkVar;
        this.H = atyVar;
    }

    public final void c() {
        this.I = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void h() {
        this.F = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void i() throws InterruptedIOException {
        afn afnVar;
        ajr.b(this.C);
        if (this.L == null && (afnVar = this.K) != null && afnVar.a()) {
            this.L = this.K;
            this.E = false;
        }
        if (this.E) {
            ajr.b(this.q);
            ajr.b(this.r);
            q(this.q, this.r, this.B);
            this.D = 0;
            this.E = false;
        }
        if (this.F) {
            return;
        }
        if (!this.t) {
            try {
                this.u.i(this.s, this.f19260i);
                q(this.f19262k, this.f19255d, this.A);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        this.G = !this.F;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adn
    public final boolean j() {
        return this.G;
    }

    public final void k() {
        this.J = true;
    }

    public final boolean l() {
        return this.J;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class acj implements sf {
    private boolean A;
    private ke B;
    private ke C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final acf f19166a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qq f19169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qk f19170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Looper f19171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private aci f19172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ke f19173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private qi f19174i;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final acg f19167b = new acg();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19175j = 1000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f19176k = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long[] f19177l = new long[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long[] f19180o = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f19179n = new int[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f19178m = new int[1000];
    private se[] p = new se[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final acq<ach> f19168c = new acq<>(acp.f19197b);
    private long u = Long.MIN_VALUE;
    private long v = Long.MIN_VALUE;
    private long w = Long.MIN_VALUE;
    private boolean z = true;
    private boolean y = true;

    public acj(ajm ajmVar, Looper looper, qq qqVar, qk qkVar) {
        this.f19171f = looper;
        this.f19169d = qqVar;
        this.f19170e = qkVar;
        this.f19166a = new acf(ajmVar);
    }

    public static acj L(ajm ajmVar, Looper looper, qq qqVar, qk qkVar) {
        ajr.b(looper);
        ajr.b(qqVar);
        return new acj(ajmVar, looper, qqVar, qkVar);
    }

    public static acj M(ajm ajmVar) {
        return new acj(ajmVar, null, null, null);
    }

    private final int O(int i2, int i3, long j2, boolean z) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = this.f19180o[i2];
            if (j3 > j2) {
                return i4;
            }
            if (!z || (this.f19179n[i2] & 1) != 0) {
                if (j3 == j2) {
                    return i5;
                }
                i4 = i5;
            }
            i2++;
            if (i2 == this.f19175j) {
                i2 = 0;
            }
        }
        return i4;
    }

    private final int P(int i2) {
        int i3 = this.s + i2;
        int i4 = this.f19175j;
        return i3 < i4 ? i3 : i3 - i4;
    }

    private final synchronized int Q(kf kfVar, pz pzVar, boolean z, boolean z2, acg acgVar) {
        pzVar.f22802c = false;
        if (!aa()) {
            if (!z2 && !this.x) {
                ke keVar = this.C;
                if (keVar == null || (!z && keVar == this.f19173h)) {
                    return -3;
                }
                ajr.b(keVar);
                W(keVar, kfVar);
                return -5;
            }
            pzVar.c(4);
            return -4;
        }
        ke keVar2 = this.f19168c.a(h()).f19164a;
        if (!z && keVar2 == this.f19173h) {
            int iP = P(this.t);
            if (!ab(iP)) {
                pzVar.f22802c = true;
                return -3;
            }
            pzVar.c(this.f19179n[iP]);
            long j2 = this.f19180o[iP];
            pzVar.f22803d = j2;
            if (j2 < this.u) {
                pzVar.a(Integer.MIN_VALUE);
            }
            acgVar.f19161a = this.f19178m[iP];
            acgVar.f19162b = this.f19177l[iP];
            acgVar.f19163c = this.p[iP];
            return -4;
        }
        W(keVar2, kfVar);
        return -5;
    }

    private final synchronized long R() {
        int i2 = this.q;
        if (i2 == 0) {
            return -1L;
        }
        return S(i2);
    }

    private final long S(int i2) {
        this.v = Math.max(this.v, U(i2));
        this.q -= i2;
        int i3 = this.r + i2;
        this.r = i3;
        int i4 = this.s + i2;
        this.s = i4;
        int i5 = this.f19175j;
        if (i4 >= i5) {
            this.s = i4 - i5;
        }
        int i6 = this.t - i2;
        this.t = i6;
        if (i6 < 0) {
            this.t = 0;
        }
        this.f19168c.f(i3);
        if (this.q != 0) {
            return this.f19177l[this.s];
        }
        int i7 = this.s;
        if (i7 == 0) {
            i7 = this.f19175j;
        }
        int i8 = i7 - 1;
        return this.f19177l[i8] + ((long) this.f19178m[i8]);
    }

    private final long T(int i2) {
        int iJ = j() - i2;
        ajr.d(iJ >= 0 && iJ <= this.q - this.t);
        int i3 = this.q - iJ;
        this.q = i3;
        this.w = Math.max(this.v, U(i3));
        this.x = iJ == 0 && this.x;
        this.f19168c.e(i2);
        int i4 = this.q;
        if (i4 == 0) {
            return 0L;
        }
        int iP = P(i4 - 1);
        return this.f19177l[iP] + ((long) this.f19178m[iP]);
    }

    private final long U(int i2) {
        long jMax = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int iP = P(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            jMax = Math.max(jMax, this.f19180o[iP]);
            if ((this.f19179n[iP] & 1) != 0) {
                break;
            }
            iP--;
            if (iP == -1) {
                iP = this.f19175j - 1;
            }
        }
        return jMax;
    }

    private final synchronized void V(long j2, int i2, long j3, int i3, se seVar) {
        qp qpVarB;
        int i4 = this.q;
        if (i4 > 0) {
            int iP = P(i4 - 1);
            ajr.d(this.f19177l[iP] + ((long) this.f19178m[iP]) <= j3);
        }
        this.x = (536870912 & i2) != 0;
        this.w = Math.max(this.w, j2);
        int iP2 = P(this.q);
        this.f19180o[iP2] = j2;
        this.f19177l[iP2] = j3;
        this.f19178m[iP2] = i3;
        this.f19179n[iP2] = i2;
        this.p[iP2] = seVar;
        this.f19176k[iP2] = this.D;
        if (this.f19168c.g() || !this.f19168c.b().f19164a.equals(this.C)) {
            qq qqVar = this.f19169d;
            if (qqVar != null) {
                Looper looper = this.f19171f;
                ajr.b(looper);
                qpVarB = qqVar.b(looper, this.f19170e, this.C);
            } else {
                qpVarB = qp.f22832b;
            }
            acq<ach> acqVar = this.f19168c;
            int iJ = j();
            ke keVar = this.C;
            ajr.b(keVar);
            acqVar.c(iJ, new ach(keVar, qpVarB));
        }
        int i5 = this.q + 1;
        this.q = i5;
        int i6 = this.f19175j;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            se[] seVarArr = new se[i7];
            int i8 = this.s;
            int i9 = i6 - i8;
            System.arraycopy(this.f19177l, i8, jArr, 0, i9);
            System.arraycopy(this.f19180o, this.s, jArr2, 0, i9);
            System.arraycopy(this.f19179n, this.s, iArr2, 0, i9);
            System.arraycopy(this.f19178m, this.s, iArr3, 0, i9);
            System.arraycopy(this.p, this.s, seVarArr, 0, i9);
            System.arraycopy(this.f19176k, this.s, iArr, 0, i9);
            int i10 = this.s;
            System.arraycopy(this.f19177l, 0, jArr, i9, i10);
            System.arraycopy(this.f19180o, 0, jArr2, i9, i10);
            System.arraycopy(this.f19179n, 0, iArr2, i9, i10);
            System.arraycopy(this.f19178m, 0, iArr3, i9, i10);
            System.arraycopy(this.p, 0, seVarArr, i9, i10);
            System.arraycopy(this.f19176k, 0, iArr, i9, i10);
            this.f19177l = jArr;
            this.f19180o = jArr2;
            this.f19179n = iArr2;
            this.f19178m = iArr3;
            this.p = seVarArr;
            this.f19176k = iArr;
            this.s = 0;
            this.f19175j = i7;
        }
    }

    private final void W(ke keVar, kf kfVar) {
        ke keVar2 = this.f19173h;
        qg qgVar = keVar2 == null ? null : keVar2.f22159o;
        this.f19173h = keVar;
        qg qgVar2 = keVar.f22159o;
        qq qqVar = this.f19169d;
        kfVar.f22161b = qqVar != null ? keVar.c(qqVar.c(keVar)) : keVar;
        kfVar.f22160a = this.f19174i;
        if (this.f19169d == null) {
            return;
        }
        if (keVar2 == null || !amn.O(qgVar, qgVar2)) {
            qi qiVar = this.f19174i;
            qq qqVar2 = this.f19169d;
            Looper looper = this.f19171f;
            ajr.b(looper);
            qi qiVarA = qqVar2.a(looper, this.f19170e, keVar);
            this.f19174i = qiVarA;
            kfVar.f22160a = qiVarA;
            if (qiVar != null) {
                qiVar.f(this.f19170e);
            }
        }
    }

    private final void X() {
        qi qiVar = this.f19174i;
        if (qiVar != null) {
            qiVar.f(this.f19170e);
            this.f19174i = null;
            this.f19173h = null;
        }
    }

    private final synchronized void Y() {
        this.t = 0;
        this.f19166a.h();
    }

    private final synchronized boolean Z(long j2) {
        if (this.q == 0) {
            return j2 > this.v;
        }
        if (p() >= j2) {
            return false;
        }
        int i2 = this.q;
        int iP = P(i2 - 1);
        while (i2 > this.t && this.f19180o[iP] >= j2) {
            i2--;
            iP--;
            if (iP == -1) {
                iP = this.f19175j - 1;
            }
        }
        T(this.r + i2);
        return true;
    }

    private final boolean aa() {
        return this.t != this.q;
    }

    private final boolean ab(int i2) {
        qi qiVar = this.f19174i;
        return qiVar == null || qiVar.a() == 4 || ((this.f19179n[i2] & 1073741824) == 0 && this.f19174i.g());
    }

    private final synchronized boolean ac(ke keVar) {
        this.z = false;
        if (amn.O(keVar, this.C)) {
            return false;
        }
        if (!this.f19168c.g() && this.f19168c.b().f19164a.equals(keVar)) {
            keVar = this.f19168c.b().f19164a;
        }
        this.C = keVar;
        ke keVar2 = this.C;
        this.E = alo.k(keVar2.f22156l, keVar2.f22153i);
        this.F = false;
        return true;
    }

    private final synchronized long ad(long j2, boolean z) {
        int i2;
        int i3 = this.q;
        if (i3 != 0) {
            long[] jArr = this.f19180o;
            int i4 = this.s;
            if (j2 >= jArr[i4]) {
                if (z && (i2 = this.t) != i3) {
                    i3 = i2 + 1;
                }
                int iO = O(i4, i3, j2, false);
                if (iO == -1) {
                    return -1L;
                }
                return S(iO);
            }
        }
        return -1L;
    }

    public final void A(boolean z) {
        this.f19166a.g();
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.y = true;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.x = false;
        this.f19168c.d();
        if (z) {
            this.B = null;
            this.C = null;
            this.z = true;
        }
    }

    public final void B(long j2) {
        if (this.G != j2) {
            this.G = j2;
            v();
        }
    }

    public final void C(long j2) {
        this.u = j2;
    }

    public final void D(aci aciVar) {
        this.f19172g = aciVar;
    }

    public final synchronized void E(int i2) {
        boolean z = false;
        if (i2 >= 0) {
            try {
                if (this.t + i2 <= this.q) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ajr.d(z);
        this.t += i2;
    }

    public final void F(int i2) {
        this.D = i2;
    }

    public final void G() {
        this.H = true;
    }

    public final synchronized boolean H() {
        return this.x;
    }

    public final synchronized boolean I(boolean z) {
        boolean z2 = true;
        if (aa()) {
            if (this.f19168c.a(h()).f19164a != this.f19173h) {
                return true;
            }
            return ab(P(this.t));
        }
        if (!z && !this.x) {
            ke keVar = this.C;
            if (keVar == null) {
                z2 = false;
            } else if (keVar == this.f19173h) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean J(int i2) {
        boolean z;
        Y();
        int i3 = this.r;
        if (i2 < i3 || i2 > this.q + i3) {
            z = false;
        } else {
            this.u = Long.MIN_VALUE;
            this.t = i2 - i3;
            z = true;
        }
        return z;
    }

    public final synchronized boolean K(long j2, boolean z) {
        Y();
        int iP = P(this.t);
        if (!aa() || j2 < this.f19180o[iP] || (j2 > this.w && !z)) {
            return false;
        }
        int iO = O(iP, this.q - this.t, j2, true);
        if (iO == -1) {
            return false;
        }
        this.u = j2;
        this.t += iO;
        return true;
    }

    public final void N(long j2, boolean z) {
        this.f19166a.c(ad(j2, z));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final /* synthetic */ int a(aje ajeVar, int i2, boolean z) {
        return us.h(this, ajeVar, i2, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final void b(ke keVar) {
        ke keVarQ = q(keVar);
        this.A = false;
        this.B = keVar;
        boolean zAc = ac(keVarQ);
        aci aciVar = this.f19172g;
        if (aciVar == null || !zAc) {
            return;
        }
        aciVar.I();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final /* synthetic */ void c(alx alxVar, int i2) {
        us.i(this, alxVar, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    @Override // com.google.ads.interactivemedia.v3.internal.sf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r12, int r14, int r15, int r16, com.google.ads.interactivemedia.v3.internal.se r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.A
            if (r0 == 0) goto Ld
            com.google.ads.interactivemedia.v3.internal.ke r0 = r8.B
            com.google.ads.interactivemedia.v3.internal.ajr.c(r0)
            r11.b(r0)
        Ld:
            r0 = r14 & 1
            boolean r1 = r8.y
            r2 = 0
            if (r1 == 0) goto L19
            if (r0 != 0) goto L17
            return
        L17:
            r8.y = r2
        L19:
            long r3 = r8.G
            long r3 = r3 + r12
            boolean r1 = r8.E
            if (r1 == 0) goto L56
            long r5 = r8.u
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L27
            return
        L27:
            if (r0 != 0) goto L56
            boolean r1 = r8.F
            if (r1 != 0) goto L52
            com.google.ads.interactivemedia.v3.internal.ke r1 = r8.C
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r5 = r1.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 50
            r6.<init>(r5)
            java.lang.String r5 = "Overriding unexpected non-sync sample for format: "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r5 = "SampleQueue"
            android.util.Log.w(r5, r1)
            r1 = 1
            r8.F = r1
        L52:
            r1 = r14 | 1
            r5 = r1
            goto L57
        L56:
            r5 = r14
        L57:
            boolean r1 = r8.H
            if (r1 == 0) goto L68
            if (r0 == 0) goto L67
            boolean r0 = r11.Z(r3)
            if (r0 != 0) goto L64
            goto L67
        L64:
            r8.H = r2
            goto L68
        L67:
            return
        L68:
            com.google.ads.interactivemedia.v3.internal.acf r0 = r8.f19166a
            long r0 = r0.b()
            r6 = r15
            long r9 = (long) r6
            long r0 = r0 - r9
            r2 = r16
            long r9 = (long) r2
            long r9 = r0 - r9
            r0 = r11
            r1 = r3
            r3 = r5
            r4 = r9
            r7 = r17
            r0.V(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.acj.d(long, int, int, int, com.google.ads.interactivemedia.v3.internal.se):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final int e(aje ajeVar, int i2, boolean z) {
        return this.f19166a.a(ajeVar, i2, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final void f(alx alxVar, int i2) {
        this.f19166a.i(alxVar, i2);
    }

    public final int g() {
        return this.r;
    }

    public final int h() {
        return this.r + this.t;
    }

    public final synchronized int i(long j2, boolean z) {
        int iP = P(this.t);
        if (aa() && j2 >= this.f19180o[iP]) {
            if (j2 > this.w && z) {
                return this.q - this.t;
            }
            int iO = O(iP, this.q - this.t, j2, true);
            if (iO == -1) {
                return 0;
            }
            return iO;
        }
        return 0;
    }

    public final int j() {
        return this.r + this.q;
    }

    public final synchronized int k() {
        return aa() ? this.f19176k[P(this.t)] : this.D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(com.google.ads.interactivemedia.v3.internal.kf r9, com.google.ads.interactivemedia.v3.internal.pz r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = 1
            goto L9
        L7:
            r0 = 0
            r5 = 0
        L9:
            com.google.ads.interactivemedia.v3.internal.acg r7 = r8.f19167b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.Q(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.g()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.ads.interactivemedia.v3.internal.acf r9 = r8.f19166a
            com.google.ads.interactivemedia.v3.internal.acg r11 = r8.f19167b
            r9.e(r10, r11)
            goto L3d
        L2c:
            com.google.ads.interactivemedia.v3.internal.acf r9 = r8.f19166a
            com.google.ads.interactivemedia.v3.internal.acg r11 = r8.f19167b
            r9.f(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.t
            int r9 = r9 + r1
            r8.t = r9
            return r12
        L3d:
            r9 = -4
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.acj.l(com.google.ads.interactivemedia.v3.internal.kf, com.google.ads.interactivemedia.v3.internal.pz, int, boolean):int");
    }

    public final synchronized long m() {
        int i2 = this.t;
        if (i2 == 0) {
            return -1L;
        }
        return S(i2);
    }

    public final synchronized long n() {
        if (this.q == 0) {
            return Long.MIN_VALUE;
        }
        return this.f19180o[this.s];
    }

    public final synchronized long o() {
        return this.w;
    }

    public final synchronized long p() {
        return Math.max(this.v, U(this.t));
    }

    public ke q(ke keVar) {
        if (this.G == 0 || keVar.p == Long.MAX_VALUE) {
            return keVar;
        }
        kd kdVarB = keVar.b();
        kdVarB.ai(keVar.p + this.G);
        return kdVarB.s();
    }

    public final synchronized ke r() {
        if (this.z) {
            return null;
        }
        return this.C;
    }

    public final void s() {
        this.f19166a.c(R());
    }

    public final void t() {
        this.f19166a.c(m());
    }

    public final void u(int i2) {
        this.f19166a.d(T(i2));
    }

    public final void v() {
        this.A = true;
    }

    public final void w() {
        qi qiVar = this.f19174i;
        if (qiVar == null || qiVar.a() != 1) {
            return;
        }
        qh qhVarB = this.f19174i.b();
        ajr.b(qhVarB);
        throw qhVarB;
    }

    public final void x() {
        s();
        X();
    }

    public final void y() {
        A(true);
        X();
    }

    public final void z() {
        A(false);
    }
}

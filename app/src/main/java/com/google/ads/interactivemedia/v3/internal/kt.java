package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class kt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final me f22241a = new me();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mf f22242b = new mf();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nl f22243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f22244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f22245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private kq f22248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private kq f22249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private kq f22250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f22251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Object f22252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f22253m;

    public kt(nl nlVar, Handler handler) {
        this.f22243c = nlVar;
        this.f22244d = handler;
    }

    private final boolean A(mg mgVar, abg abgVar) {
        if (C(abgVar)) {
            return mgVar.z(mgVar.k(abgVar.f19056a, this.f22241a).f22396c, this.f22242b).p == mgVar.g(abgVar.f19056a);
        }
        return false;
    }

    private final boolean B(mg mgVar) {
        kq kqVarH = this.f22248h;
        if (kqVarH == null) {
            return true;
        }
        int iG = mgVar.g(kqVarH.f22215b);
        while (true) {
            iG = mgVar.v(iG, this.f22241a, this.f22242b, this.f22246f, this.f22247g);
            while (kqVarH.h() != null && !kqVarH.f22219f.f22235g) {
                kqVarH = kqVarH.h();
            }
            kq kqVarH2 = kqVarH.h();
            if (iG == -1 || kqVarH2 == null || mgVar.g(kqVarH2.f22215b) != iG) {
                break;
            }
            kqVarH = kqVarH2;
        }
        boolean zM = m(kqVarH);
        kqVarH.f22219f = g(mgVar, kqVarH.f22219f);
        return !zM;
    }

    private static final boolean C(abg abgVar) {
        return !abgVar.b() && abgVar.f19060e == -1;
    }

    private final long s(mg mgVar, Object obj, int i2) {
        mgVar.k(obj, this.f22241a);
        this.f22241a.g(i2);
        this.f22241a.i(i2);
        return 0L;
    }

    private final kr t(mg mgVar, kq kqVar, long j2) {
        long j3;
        kr krVar = kqVar.f22219f;
        long jD = (kqVar.d() + krVar.f22233e) - j2;
        if (krVar.f22235g) {
            long j4 = 0;
            int iV = mgVar.v(mgVar.g(krVar.f22229a.f19056a), this.f22241a, this.f22242b, this.f22246f, this.f22247g);
            if (iV == -1) {
                return null;
            }
            int i2 = mgVar.j(iV, this.f22241a, true).f22396c;
            Object obj = this.f22241a.f22395b;
            long j5 = krVar.f22229a.f19059d;
            if (mgVar.z(i2, this.f22242b).f22415o == iV) {
                Pair<Object, Long> pairX = mgVar.x(this.f22242b, this.f22241a, i2, -9223372036854775807L, Math.max(0L, jD));
                if (pairX == null) {
                    return null;
                }
                obj = pairX.first;
                long jLongValue = ((Long) pairX.second).longValue();
                kq kqVarH = kqVar.h();
                if (kqVarH == null || !kqVarH.f22215b.equals(obj)) {
                    j5 = this.f22245e;
                    this.f22245e = 1 + j5;
                } else {
                    j5 = kqVarH.f22219f.f22229a.f19059d;
                }
                j3 = jLongValue;
                j4 = -9223372036854775807L;
            } else {
                j3 = 0;
            }
            return u(mgVar, x(mgVar, obj, j3, j5, this.f22241a), j4, j3);
        }
        abg abgVar = krVar.f22229a;
        mgVar.k(abgVar.f19056a, this.f22241a);
        if (!abgVar.b()) {
            int iD = this.f22241a.d(abgVar.f19060e);
            if (iD != this.f22241a.a(abgVar.f19060e)) {
                return v(mgVar, abgVar.f19056a, abgVar.f19060e, iD, krVar.f22233e, abgVar.f19059d);
            }
            s(mgVar, abgVar.f19056a, abgVar.f19060e);
            return w(mgVar, abgVar.f19056a, 0L, krVar.f22233e, abgVar.f19059d);
        }
        int i3 = abgVar.f19057b;
        if (this.f22241a.a(i3) == -1) {
            return null;
        }
        int iE = this.f22241a.e(i3, abgVar.f19058c);
        if (iE < 0) {
            return v(mgVar, abgVar.f19056a, i3, iE, krVar.f22231c, abgVar.f19059d);
        }
        long jLongValue2 = krVar.f22231c;
        if (jLongValue2 == -9223372036854775807L) {
            mf mfVar = this.f22242b;
            me meVar = this.f22241a;
            Pair<Object, Long> pairX2 = mgVar.x(mfVar, meVar, meVar.f22396c, -9223372036854775807L, Math.max(0L, jD));
            if (pairX2 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairX2.second).longValue();
        }
        s(mgVar, abgVar.f19056a, abgVar.f19057b);
        return w(mgVar, abgVar.f19056a, Math.max(0L, jLongValue2), krVar.f22231c, abgVar.f19059d);
    }

    private final kr u(mg mgVar, abg abgVar, long j2, long j3) {
        mgVar.k(abgVar.f19056a, this.f22241a);
        boolean zB = abgVar.b();
        Object obj = abgVar.f19056a;
        return zB ? v(mgVar, obj, abgVar.f19057b, abgVar.f19058c, j2, abgVar.f19059d) : w(mgVar, obj, j3, j2, abgVar.f19059d);
    }

    private final kr v(mg mgVar, Object obj, int i2, int i3, long j2, long j3) {
        abg abgVar = new abg(obj, i2, i3, j3);
        long jF = mgVar.k(abgVar.f19056a, this.f22241a).f(abgVar.f19057b, abgVar.f19058c);
        if (i3 == this.f22241a.d(i2)) {
            this.f22241a.h();
        }
        this.f22241a.j(abgVar.f19057b);
        long jMax = 0;
        if (jF != -9223372036854775807L && jF <= 0) {
            jMax = Math.max(0L, (-1) + jF);
        }
        return new kr(abgVar, jMax, j2, -9223372036854775807L, jF, false, false, false, false);
    }

    private final kr w(mg mgVar, Object obj, long j2, long j3, long j4) {
        long j5;
        long jMax = j2;
        mgVar.k(obj, this.f22241a);
        int iB = this.f22241a.b(jMax);
        abg abgVar = new abg(obj, j4, iB);
        boolean zC = C(abgVar);
        boolean zA = A(mgVar, abgVar);
        boolean z = z(mgVar, abgVar, zC);
        if (iB != -1) {
            this.f22241a.j(iB);
        }
        if (iB != -1) {
            this.f22241a.g(iB);
            j5 = 0;
        } else {
            j5 = -9223372036854775807L;
        }
        long j6 = j5 != -9223372036854775807L ? j5 : this.f22241a.f22397d;
        if (j6 != -9223372036854775807L && jMax >= j6) {
            jMax = Math.max(0L, (-1) + j6);
        }
        return new kr(abgVar, jMax, j3, j5, j6, false, zC, zA, z);
    }

    private static abg x(mg mgVar, Object obj, long j2, long j3, me meVar) {
        mgVar.k(obj, meVar);
        int iC = meVar.c(j2);
        return iC == -1 ? new abg(obj, j3, meVar.b(j2)) : new abg(obj, iC, meVar.d(iC), j3);
    }

    private final void y() {
        final atu atuVarI = aty.i();
        for (kq kqVarH = this.f22248h; kqVarH != null; kqVarH = kqVarH.h()) {
            atuVarI.d(kqVarH.f22219f.f22229a);
        }
        kq kqVar = this.f22249i;
        final abg abgVar = kqVar == null ? null : kqVar.f22219f.f22229a;
        this.f22244d.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ks
            @Override // java.lang.Runnable
            public final void run() {
                this.f22238a.j(atuVarI, abgVar);
            }
        });
    }

    private final boolean z(mg mgVar, abg abgVar, boolean z) {
        int iG = mgVar.g(abgVar.f19056a);
        return !mgVar.z(mgVar.y(iG, this.f22241a).f22396c, this.f22242b).f22409i && mgVar.v(iG, this.f22241a, this.f22242b, this.f22246f, this.f22247g) == -1 && z;
    }

    public final kq a() {
        kq kqVar = this.f22248h;
        if (kqVar == null) {
            return null;
        }
        if (kqVar == this.f22249i) {
            this.f22249i = kqVar.h();
        }
        this.f22248h.o();
        int i2 = this.f22251k - 1;
        this.f22251k = i2;
        if (i2 == 0) {
            this.f22250j = null;
            kq kqVar2 = this.f22248h;
            this.f22252l = kqVar2.f22215b;
            this.f22253m = kqVar2.f22219f.f22229a.f19059d;
        }
        this.f22248h = this.f22248h.h();
        y();
        return this.f22248h;
    }

    public final kq b() {
        kq kqVar = this.f22249i;
        boolean z = false;
        if (kqVar != null && kqVar.h() != null) {
            z = true;
        }
        ajr.f(z);
        this.f22249i = this.f22249i.h();
        y();
        return this.f22249i;
    }

    public final kq c() {
        return this.f22250j;
    }

    public final kq d() {
        return this.f22248h;
    }

    public final kq e() {
        return this.f22249i;
    }

    public final kr f(long j2, ld ldVar) {
        kq kqVar = this.f22250j;
        return kqVar == null ? u(ldVar.f22291a, ldVar.f22292b, ldVar.f22293c, ldVar.s) : t(ldVar.f22291a, kqVar, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.ads.interactivemedia.v3.internal.kr g(com.google.ads.interactivemedia.v3.internal.mg r19, com.google.ads.interactivemedia.v3.internal.kr r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.ads.interactivemedia.v3.internal.abg r3 = r2.f22229a
            boolean r12 = C(r3)
            boolean r13 = r0.A(r1, r3)
            boolean r14 = r0.z(r1, r3, r12)
            com.google.ads.interactivemedia.v3.internal.abg r4 = r2.f22229a
            java.lang.Object r4 = r4.f19056a
            com.google.ads.interactivemedia.v3.internal.me r5 = r0.f22241a
            r1.k(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L36
            int r1 = r3.f19060e
            if (r1 != r4) goto L2e
            goto L36
        L2e:
            com.google.ads.interactivemedia.v3.internal.me r7 = r0.f22241a
            r7.g(r1)
            r7 = 0
            goto L37
        L36:
            r7 = r5
        L37:
            boolean r1 = r3.b()
            if (r1 == 0) goto L49
            com.google.ads.interactivemedia.v3.internal.me r1 = r0.f22241a
            int r5 = r3.f19057b
            int r6 = r3.f19058c
            long r5 = r1.f(r5, r6)
        L47:
            r9 = r5
            goto L54
        L49:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L4f
            r9 = r7
            goto L54
        L4f:
            com.google.ads.interactivemedia.v3.internal.me r1 = r0.f22241a
            long r5 = r1.f22397d
            goto L47
        L54:
            boolean r1 = r3.b()
            if (r1 == 0) goto L62
            com.google.ads.interactivemedia.v3.internal.me r1 = r0.f22241a
            int r4 = r3.f19057b
            r1.j(r4)
            goto L6b
        L62:
            int r1 = r3.f19060e
            if (r1 == r4) goto L6b
            com.google.ads.interactivemedia.v3.internal.me r4 = r0.f22241a
            r4.j(r1)
        L6b:
            com.google.ads.interactivemedia.v3.internal.kr r15 = new com.google.ads.interactivemedia.v3.internal.kr
            long r4 = r2.f22230b
            long r1 = r2.f22231c
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.kt.g(com.google.ads.interactivemedia.v3.internal.mg, com.google.ads.interactivemedia.v3.internal.kr):com.google.ads.interactivemedia.v3.internal.kr");
    }

    public final abg h(mg mgVar, Object obj, long j2) {
        long j3;
        int iG;
        int i2 = mgVar.k(obj, this.f22241a).f22396c;
        Object obj2 = this.f22252l;
        if (obj2 == null || (iG = mgVar.g(obj2)) == -1 || mgVar.y(iG, this.f22241a).f22396c != i2) {
            kq kqVarH = this.f22248h;
            while (true) {
                if (kqVarH == null) {
                    kqVarH = this.f22248h;
                    while (kqVarH != null) {
                        int iG2 = mgVar.g(kqVarH.f22215b);
                        if (iG2 == -1 || mgVar.y(iG2, this.f22241a).f22396c != i2) {
                            kqVarH = kqVarH.h();
                        }
                    }
                    j3 = this.f22245e;
                    this.f22245e = 1 + j3;
                    if (this.f22248h == null) {
                        this.f22252l = obj;
                        this.f22253m = j3;
                    }
                } else {
                    if (kqVarH.f22215b.equals(obj)) {
                        break;
                    }
                    kqVarH = kqVarH.h();
                }
            }
            j3 = kqVarH.f22219f.f22229a.f19059d;
        } else {
            j3 = this.f22253m;
        }
        return x(mgVar, obj, j2, j3, this.f22241a);
    }

    public final void i() {
        if (this.f22251k == 0) {
            return;
        }
        kq kqVarH = this.f22248h;
        ajr.c(kqVarH);
        this.f22252l = kqVarH.f22215b;
        this.f22253m = kqVarH.f22219f.f22229a.f19059d;
        while (kqVarH != null) {
            kqVarH.o();
            kqVarH = kqVarH.h();
        }
        this.f22248h = null;
        this.f22250j = null;
        this.f22249i = null;
        this.f22251k = 0;
        y();
    }

    public final /* synthetic */ void j(atu atuVar, abg abgVar) {
        this.f22243c.Z(atuVar.c(), abgVar);
    }

    public final void k(long j2) {
        kq kqVar = this.f22250j;
        if (kqVar != null) {
            kqVar.n(j2);
        }
    }

    public final boolean l(abe abeVar) {
        kq kqVar = this.f22250j;
        return kqVar != null && kqVar.f22214a == abeVar;
    }

    public final boolean m(kq kqVar) {
        boolean z = false;
        ajr.f(kqVar != null);
        if (kqVar.equals(this.f22250j)) {
            return false;
        }
        this.f22250j = kqVar;
        while (kqVar.h() != null) {
            kqVar = kqVar.h();
            if (kqVar == this.f22249i) {
                this.f22249i = this.f22248h;
                z = true;
            }
            kqVar.o();
            this.f22251k--;
        }
        this.f22250j.p(null);
        y();
        return z;
    }

    public final boolean n() {
        kq kqVar = this.f22250j;
        if (kqVar != null) {
            return !kqVar.f22219f.f22237i && kqVar.r() && this.f22250j.f22219f.f22233e != -9223372036854775807L && this.f22251k < 100;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(com.google.ads.interactivemedia.v3.internal.mg r17, long r18, long r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.ads.interactivemedia.v3.internal.kq r2 = r0.f22248h
            r3 = 0
        L7:
            r4 = 1
            if (r2 == 0) goto L96
            com.google.ads.interactivemedia.v3.internal.kr r5 = r2.f22219f
            r6 = 0
            if (r3 != 0) goto L16
            com.google.ads.interactivemedia.v3.internal.kr r3 = r0.g(r1, r5)
            r7 = r18
            goto L39
        L16:
            r7 = r18
            com.google.ads.interactivemedia.v3.internal.kr r9 = r0.t(r1, r3, r7)
            if (r9 != 0) goto L26
            boolean r1 = r0.m(r3)
            if (r1 != 0) goto L25
            return r4
        L25:
            return r6
        L26:
            long r10 = r5.f22230b
            long r12 = r9.f22230b
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L8e
            com.google.ads.interactivemedia.v3.internal.abg r10 = r5.f22229a
            com.google.ads.interactivemedia.v3.internal.abg r11 = r9.f22229a
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L8e
            r3 = r9
        L39:
            long r9 = r5.f22231c
            com.google.ads.interactivemedia.v3.internal.kr r9 = r3.a(r9)
            r2.f22219f = r9
            long r9 = r5.f22233e
            long r11 = r3.f22233e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 == 0) goto L85
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L85
        L53:
            r2.q()
            long r7 = r3.f22233e
            int r1 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r1 != 0) goto L62
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L66
        L62:
            long r7 = r2.g(r7)
        L66:
            com.google.ads.interactivemedia.v3.internal.kq r1 = r0.f22249i
            if (r2 != r1) goto L7a
            com.google.ads.interactivemedia.v3.internal.kr r1 = r2.f22219f
            boolean r1 = r1.f22234f
            r9 = -9223372036854775808
            int r1 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r1 == 0) goto L78
            int r1 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r1 < 0) goto L7a
        L78:
            r1 = 1
            goto L7b
        L7a:
            r1 = 0
        L7b:
            boolean r2 = r0.m(r2)
            if (r2 != 0) goto L84
            if (r1 != 0) goto L84
            return r4
        L84:
            return r6
        L85:
            com.google.ads.interactivemedia.v3.internal.kq r3 = r2.h()
            r15 = r3
            r3 = r2
            r2 = r15
            goto L7
        L8e:
            boolean r1 = r0.m(r3)
            if (r1 != 0) goto L95
            return r4
        L95:
            return r6
        L96:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.kt.o(com.google.ads.interactivemedia.v3.internal.mg, long, long):boolean");
    }

    public final boolean p(mg mgVar, int i2) {
        this.f22246f = i2;
        return B(mgVar);
    }

    public final boolean q(mg mgVar, boolean z) {
        this.f22247g = z;
        return B(mgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.ads.interactivemedia.v3.internal.kq r(com.google.ads.interactivemedia.v3.internal.lr[] r12, com.google.ads.interactivemedia.v3.internal.aip r13, com.google.ads.interactivemedia.v3.internal.ajm r14, com.google.ads.interactivemedia.v3.internal.la r15, com.google.ads.interactivemedia.v3.internal.kr r16, com.google.ads.interactivemedia.v3.internal.aiq r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.google.ads.interactivemedia.v3.internal.kq r1 = r0.f22250j
            r2 = 0
            if (r1 != 0) goto L20
            com.google.ads.interactivemedia.v3.internal.abg r1 = r8.f22229a
            boolean r1 = r1.b()
            if (r1 == 0) goto L1e
            long r4 = r8.f22231c
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L1e
            r3 = r4
            goto L2f
        L1e:
            r3 = r2
            goto L2f
        L20:
            long r1 = r1.d()
            com.google.ads.interactivemedia.v3.internal.kq r3 = r0.f22250j
            com.google.ads.interactivemedia.v3.internal.kr r3 = r3.f22219f
            long r3 = r3.f22233e
            long r1 = r1 + r3
            long r3 = r8.f22230b
            long r1 = r1 - r3
            r3 = r1
        L2f:
            com.google.ads.interactivemedia.v3.internal.kq r10 = new com.google.ads.interactivemedia.v3.internal.kq
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.google.ads.interactivemedia.v3.internal.kq r1 = r0.f22250j
            if (r1 == 0) goto L45
            r1.p(r10)
            goto L49
        L45:
            r0.f22248h = r10
            r0.f22249i = r10
        L49:
            r1 = 0
            r0.f22252l = r1
            r0.f22250j = r10
            int r1 = r0.f22251k
            int r1 = r1 + 1
            r0.f22251k = r1
            r11.y()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.kt.r(com.google.ads.interactivemedia.v3.internal.lr[], com.google.ads.interactivemedia.v3.internal.aip, com.google.ads.interactivemedia.v3.internal.ajm, com.google.ads.interactivemedia.v3.internal.la, com.google.ads.interactivemedia.v3.internal.kr, com.google.ads.interactivemedia.v3.internal.aiq):com.google.ads.interactivemedia.v3.internal.kq");
    }
}

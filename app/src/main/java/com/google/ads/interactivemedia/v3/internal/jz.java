package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class jz implements Handler.Callback, abd, kz, iz, ll {
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private jy F;
    private long G;
    private int H;
    private boolean I;
    private jb J;
    private final iy K;
    private final jd L;
    private final ix M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lq[] f22113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lr[] f22114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aip f22115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aiq f22116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final aja f22117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final alc f22118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HandlerThread f22119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Looper f22120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final mf f22121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final me f22122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f22123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ja f22124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList<jv> f22125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final akt f22126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final kt f22127o;
    private final la p;
    private lt r;
    private ld s;
    private jw t;
    private boolean u;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z = 0;
    private boolean A = false;
    private final long q = 500;
    private boolean v = false;

    public jz(lq[] lqVarArr, aip aipVar, aiq aiqVar, iy iyVar, aja ajaVar, nl nlVar, lt ltVar, ix ixVar, long j2, Looper looper, akt aktVar, jd jdVar) {
        this.L = jdVar;
        this.f22113a = lqVarArr;
        this.f22115c = aipVar;
        this.f22116d = aiqVar;
        this.K = iyVar;
        this.f22117e = ajaVar;
        this.r = ltVar;
        this.M = ixVar;
        this.f22126n = aktVar;
        this.f22123k = iyVar.a();
        ld ldVarH = ld.h(aiqVar);
        this.s = ldVarH;
        this.t = new jw(ldVarH);
        int length = lqVarArr.length;
        this.f22114b = new lr[2];
        for (int i2 = 0; i2 < 2; i2++) {
            lqVarArr[i2].B(i2);
            this.f22114b[i2] = lqVarArr[i2].j();
        }
        this.f22124l = new ja(this, aktVar);
        this.f22125m = new ArrayList<>();
        this.f22121i = new mf();
        this.f22122j = new me();
        aipVar.i(ajaVar);
        this.I = true;
        Handler handler = new Handler(looper);
        this.f22127o = new kt(nlVar, handler);
        this.p = new la(this, nlVar, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f22119g = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f22120h = looper2;
        this.f22118f = aktVar.b(looper2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:225:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A() throws com.google.ads.interactivemedia.v3.internal.jb {
        /*
            Method dump skipped, instruction units count: 1311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.jz.A():void");
    }

    private final void B() throws jb {
        int length = this.f22113a.length;
        C(new boolean[2]);
    }

    private final void C(boolean[] zArr) throws jb {
        kq kqVarE = this.f22127o.e();
        aiq aiqVarJ = kqVarE.j();
        int i2 = 0;
        while (true) {
            int length = this.f22113a.length;
            if (i2 >= 2) {
                break;
            }
            if (!aiqVarJ.b(i2)) {
                this.f22113a[i2].y();
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            int length2 = this.f22113a.length;
            if (i3 >= 2) {
                kqVarE.f22220g = true;
                return;
            }
            if (aiqVarJ.b(i3)) {
                boolean z = zArr[i3];
                lq lqVar = this.f22113a[i3];
                if (!ac(lqVar)) {
                    kq kqVarE2 = this.f22127o.e();
                    boolean z2 = kqVarE2 == this.f22127o.d();
                    aiq aiqVarJ2 = kqVarE2.j();
                    ls lsVar = aiqVarJ2.f19846b[i3];
                    ke[] keVarArrAi = ai(aiqVarJ2.f19847c[i3]);
                    boolean z3 = ag() && this.s.f22295e == 3;
                    boolean z4 = !z && z3;
                    this.E++;
                    lqVar.o(lsVar, keVarArrAi, kqVarE2.f22216c[i3], this.G, z4, z2, kqVarE2.e(), kqVarE2.d());
                    lqVar.p(103, new js(this));
                    this.f22124l.e(lqVar);
                    if (z3) {
                        lqVar.D();
                    }
                }
            }
            i3++;
        }
    }

    private final void D(IOException iOException, int i2) {
        jb jbVarD = jb.d(iOException, i2);
        kq kqVarD = this.f22127o.d();
        if (kqVarD != null) {
            jbVarD = jbVarD.a(kqVarD.f22219f.f22229a);
        }
        alj.a("ExoPlayerImplInternal", "Playback error", jbVarD);
        U(false, false);
        this.s = this.s.e(jbVarD);
    }

    private final void E(boolean z) {
        kq kqVarC = this.f22127o.c();
        abg abgVar = kqVarC == null ? this.s.f22292b : kqVarC.f22219f.f22229a;
        boolean z2 = !this.s.f22301k.equals(abgVar);
        if (z2) {
            this.s = this.s.a(abgVar);
        }
        ld ldVar = this.s;
        ldVar.q = kqVarC == null ? ldVar.s : kqVarC.b();
        this.s.r = s();
        if ((z2 || z) && kqVarC != null && kqVarC.f22217d) {
            Y(kqVarC.i(), kqVarC.j());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03cb  */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.ads.interactivemedia.v3.internal.jy] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v2, types: [long] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r36v0, types: [com.google.ads.interactivemedia.v3.internal.jz] */
    /* JADX WARN: Type inference failed for: r5v36, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void F(com.google.ads.interactivemedia.v3.internal.mg r37, boolean r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.jz.F(com.google.ads.interactivemedia.v3.internal.mg, boolean):void");
    }

    private final void G(le leVar, boolean z) {
        H(leVar, leVar.f22307b, true, z);
    }

    private final void H(le leVar, float f2, boolean z, boolean z2) {
        int i2;
        jz jzVar = this;
        if (z) {
            if (z2) {
                jzVar.t.a(1);
            }
            ld ldVar = jzVar.s;
            jzVar = this;
            jzVar.s = new ld(ldVar.f22291a, ldVar.f22292b, ldVar.f22293c, ldVar.f22294d, ldVar.f22295e, ldVar.f22296f, ldVar.f22297g, ldVar.f22298h, ldVar.f22299i, ldVar.f22300j, ldVar.f22301k, ldVar.f22302l, ldVar.f22303m, leVar, ldVar.q, ldVar.r, ldVar.s, ldVar.f22305o, ldVar.p);
        }
        float f3 = leVar.f22307b;
        kq kqVarD = jzVar.f22127o.d();
        while (true) {
            i2 = 0;
            if (kqVarD == null) {
                break;
            }
            aii[] aiiVarArr = kqVarD.j().f19847c;
            int length = aiiVarArr.length;
            while (i2 < length) {
                aii aiiVar = aiiVarArr[i2];
                if (aiiVar != null) {
                    aiiVar.i(f3);
                }
                i2++;
            }
            kqVarD = kqVarD.h();
        }
        lq[] lqVarArr = jzVar.f22113a;
        int length2 = lqVarArr.length;
        while (i2 < 2) {
            lq lqVar = lqVarArr[i2];
            if (lqVar != null) {
                lqVar.C(f2, leVar.f22307b);
            }
            i2++;
        }
    }

    private final void I() {
        boolean zH;
        if (ab()) {
            kq kqVarC = this.f22127o.c();
            long jT = t(kqVarC.c());
            if (kqVarC == this.f22127o.d()) {
                kqVarC.f(this.G);
            } else {
                kqVarC.f(this.G);
                long j2 = kqVarC.f22219f.f22230b;
            }
            zH = this.K.h(jT, this.f22124l.c().f22307b);
        } else {
            zH = false;
        }
        this.y = zH;
        if (zH) {
            this.f22127o.c().l(this.G);
        }
        W();
    }

    private final void J() {
        this.t.c(this.s);
        if (this.t.f22103g) {
            this.L.a(this.t);
            this.t = new jw(this.s);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void K(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.jz.K(boolean, boolean, boolean, boolean):void");
    }

    private final void L() {
        kq kqVarD = this.f22127o.d();
        boolean z = false;
        if (kqVarD != null && kqVarD.f22219f.f22236h && this.v) {
            z = true;
        }
        this.w = z;
    }

    private final void M(long j2) {
        kq kqVarD = this.f22127o.d();
        if (kqVarD != null) {
            j2 = kqVarD.g(j2);
        }
        this.G = j2;
        this.f22124l.f(j2);
        lq[] lqVarArr = this.f22113a;
        int length = lqVarArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            lq lqVar = lqVarArr[i2];
            if (ac(lqVar)) {
                lqVar.z(this.G);
            }
        }
        for (kq kqVarD2 = this.f22127o.d(); kqVarD2 != null; kqVarD2 = kqVarD2.h()) {
            for (aii aiiVar : kqVarD2.j().f19847c) {
            }
        }
    }

    private final void N(mg mgVar, mg mgVar2) {
        if (mgVar.A() && mgVar2.A()) {
            return;
        }
        int size = this.f22125m.size();
        while (true) {
            size--;
            if (size < 0) {
                Collections.sort(this.f22125m);
                return;
            } else if (!af(this.f22125m.get(size), mgVar, mgVar2, this.z, this.A, this.f22121i, this.f22122j)) {
                this.f22125m.get(size).f22093a.h(false);
                this.f22125m.remove(size);
            }
        }
    }

    private final void O(long j2, long j3) {
        this.f22118f.h();
        this.f22118f.j(j2 + j3);
    }

    private final void P(boolean z) throws jb {
        abg abgVar = this.f22127o.d().f22219f.f22229a;
        long jV = v(abgVar, this.s.s, true, false);
        if (jV != this.s.s) {
            ld ldVar = this.s;
            this.s = y(abgVar, jV, ldVar.f22293c, ldVar.f22294d, z, 5);
        }
    }

    private final void Q(ln lnVar) {
        if (lnVar.d() != this.f22120h) {
            this.f22118f.b(15, lnVar).a();
            return;
        }
        aj(lnVar);
        int i2 = this.s.f22295e;
        if (i2 == 3 || i2 == 2) {
            this.f22118f.i(2);
        }
    }

    private final void R(boolean z, int i2, boolean z2, int i3) {
        this.t.a(z2 ? 1 : 0);
        this.t.b(i3);
        this.s = this.s.d(z, i2);
        this.x = false;
        for (kq kqVarD = this.f22127o.d(); kqVarD != null; kqVarD = kqVarD.h()) {
            for (aii aiiVar : kqVarD.j().f19847c) {
            }
        }
        if (!ag()) {
            V();
            Z();
            return;
        }
        int i4 = this.s.f22295e;
        if (i4 == 3) {
            T();
            this.f22118f.i(2);
        } else if (i4 == 2) {
            this.f22118f.i(2);
        }
    }

    private final void S(int i2) {
        ld ldVar = this.s;
        if (ldVar.f22295e != i2) {
            this.s = ldVar.f(i2);
        }
    }

    private final void T() {
        this.x = false;
        this.f22124l.h();
        lq[] lqVarArr = this.f22113a;
        int length = lqVarArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            lq lqVar = lqVarArr[i2];
            if (ac(lqVar)) {
                lqVar.D();
            }
        }
    }

    private final void U(boolean z, boolean z2) {
        K(z || !this.B, false, true, false);
        this.t.a(z2 ? 1 : 0);
        this.K.d();
        S(1);
    }

    private final void V() {
        this.f22124l.i();
        lq[] lqVarArr = this.f22113a;
        int length = lqVarArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            lq lqVar = lqVarArr[i2];
            if (ac(lqVar)) {
                ak(lqVar);
            }
        }
    }

    private final void W() {
        kq kqVarC = this.f22127o.c();
        boolean z = this.y || (kqVarC != null && kqVarC.f22214a.n());
        ld ldVar = this.s;
        if (z != ldVar.f22297g) {
            this.s = new ld(ldVar.f22291a, ldVar.f22292b, ldVar.f22293c, ldVar.f22294d, ldVar.f22295e, ldVar.f22296f, z, ldVar.f22298h, ldVar.f22299i, ldVar.f22300j, ldVar.f22301k, ldVar.f22302l, ldVar.f22303m, ldVar.f22304n, ldVar.q, ldVar.r, ldVar.s, ldVar.f22305o, ldVar.p);
        }
    }

    private final void X(mg mgVar, abg abgVar, mg mgVar2, abg abgVar2, long j2) {
        if (mgVar.A() || !ah(mgVar, abgVar)) {
            float f2 = this.f22124l.c().f22307b;
            le leVar = this.s.f22304n;
            if (f2 != leVar.f22307b) {
                this.f22124l.g(leVar);
                return;
            }
            return;
        }
        mgVar.z(mgVar.k(abgVar.f19056a, this.f22122j).f22396c, this.f22121i);
        ix ixVar = this.M;
        kl klVar = this.f22121i.f22411k;
        int i2 = amn.f20135a;
        ixVar.d(klVar);
        if (j2 != -9223372036854775807L) {
            this.M.e(r(mgVar, abgVar.f19056a, j2));
            return;
        }
        if (amn.O(!mgVar2.A() ? mgVar2.z(mgVar2.k(abgVar2.f19056a, this.f22122j).f22396c, this.f22121i).f22402b : null, this.f22121i.f22402b)) {
            return;
        }
        this.M.e(-9223372036854775807L);
    }

    private final void Y(act actVar, aiq aiqVar) {
        this.K.g(this.f22113a, aiqVar.f19847c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r5 > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        r7 = r12.f22125m.get(r5 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r7 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        r8 = r7.f22094b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        if (r8 > r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (r8 != r4) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (r7.f22095c <= r2) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
    
        if (r5 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
    
        if (r5 >= r12.f22125m.size()) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        r7 = r12.f22125m.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        if (r7 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        if (r7.f22096d == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
    
        r8 = r7.f22094b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        if (r8 < r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        if (r8 != r4) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        if (r7.f22095c > r2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d3, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
    
        if (r5 >= r12.f22125m.size()) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
    
        if (r7 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e2, code lost:
    
        if (r7.f22096d == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e6, code lost:
    
        if (r7.f22094b != r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e8, code lost:
    
        r8 = r7.f22095c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ec, code lost:
    
        if (r8 <= r2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f0, code lost:
    
        if (r8 > r0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f2, code lost:
    
        Q(r7.f22093a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f7, code lost:
    
        r7.f22093a.i();
        r12.f22125m.remove(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0107, code lost:
    
        if (r5 >= r12.f22125m.size()) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0109, code lost:
    
        r7 = r12.f22125m.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0112, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0114, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0115, code lost:
    
        r7.f22093a.i();
        r12.f22125m.remove(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0120, code lost:
    
        r12.H = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x009c, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00c1, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ac -> B:28:0x0090). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00db -> B:41:0x00b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Z() {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.jz.Z():void");
    }

    private final synchronized void aa(aru<Boolean> aruVar, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 500;
        boolean z = false;
        for (long jElapsedRealtime2 = 500; !aruVar.a().booleanValue() && jElapsedRealtime2 > 0; jElapsedRealtime2 = jElapsedRealtime - SystemClock.elapsedRealtime()) {
            try {
                wait(jElapsedRealtime2);
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean ab() {
        kq kqVarC = this.f22127o.c();
        return (kqVarC == null || kqVarC.c() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean ac(lq lqVar) {
        return lqVar.aW() != 0;
    }

    private final boolean ad() {
        kq kqVarD = this.f22127o.d();
        long j2 = kqVarD.f22219f.f22233e;
        if (kqVarD.f22217d) {
            return j2 == -9223372036854775807L || this.s.s < j2 || !ag();
        }
        return false;
    }

    private static boolean ae(ld ldVar, me meVar) {
        abg abgVar = ldVar.f22292b;
        mg mgVar = ldVar.f22291a;
        return mgVar.A() || mgVar.k(abgVar.f19056a, meVar).f22399f;
    }

    private static boolean af(jv jvVar, mg mgVar, mg mgVar2, int i2, boolean z, mf mfVar, me meVar) {
        Object obj = jvVar.f22096d;
        if (obj == null) {
            jvVar.f22093a.c();
            jvVar.f22093a.c();
            Pair<Object, Long> pairX = x(mgVar, new jy(jvVar.f22093a.f(), jvVar.f22093a.b(), iw.b(-9223372036854775807L)), false, i2, z, mfVar, meVar);
            if (pairX == null) {
                return false;
            }
            jvVar.a(mgVar.g(pairX.first), ((Long) pairX.second).longValue(), pairX.first);
            jvVar.f22093a.c();
            return true;
        }
        int iG = mgVar.g(obj);
        if (iG == -1) {
            return false;
        }
        jvVar.f22093a.c();
        jvVar.f22094b = iG;
        mgVar2.k(jvVar.f22096d, meVar);
        if (meVar.f22399f && mgVar2.z(meVar.f22396c, mfVar).f22415o == mgVar2.g(jvVar.f22096d)) {
            Pair<Object, Long> pairW = mgVar.w(mfVar, meVar, mgVar.k(jvVar.f22096d, meVar).f22396c, jvVar.f22095c + meVar.f22398e);
            jvVar.a(mgVar.g(pairW.first), ((Long) pairW.second).longValue(), pairW.first);
        }
        return true;
    }

    private final boolean ag() {
        ld ldVar = this.s;
        return ldVar.f22302l && ldVar.f22303m == 0;
    }

    private final boolean ah(mg mgVar, abg abgVar) {
        if (!abgVar.b() && !mgVar.A()) {
            mgVar.z(mgVar.k(abgVar.f19056a, this.f22122j).f22396c, this.f22121i);
            if (this.f22121i.b()) {
                mf mfVar = this.f22121i;
                if (mfVar.f22409i && mfVar.f22406f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static ke[] ai(aii aiiVar) {
        int iN = aiiVar != null ? aiiVar.n() : 0;
        ke[] keVarArr = new ke[iN];
        for (int i2 = 0; i2 < iN; i2++) {
            keVarArr[i2] = aiiVar.o(i2);
        }
        return keVarArr;
    }

    private static final void aj(ln lnVar) {
        lnVar.k();
        try {
            lnVar.e().p(lnVar.a(), lnVar.g());
        } finally {
            lnVar.h(true);
        }
    }

    private static final void ak(lq lqVar) {
        if (lqVar.aW() == 2) {
            lqVar.E();
        }
    }

    private static final void al(lq lqVar) {
        lqVar.A();
        if (lqVar instanceof ahq) {
            throw null;
        }
    }

    public static Object e(mf mfVar, me meVar, int i2, boolean z, Object obj, mg mgVar, mg mgVar2) {
        int iG = mgVar.g(obj);
        int iS = mgVar.s();
        int i3 = 0;
        int iV = iG;
        int iG2 = -1;
        while (true) {
            if (i3 >= iS || iG2 != -1) {
                break;
            }
            iV = mgVar.v(iV, meVar, mfVar, i2, z);
            if (iV == -1) {
                iG2 = -1;
                break;
            }
            iG2 = mgVar2.g(mgVar.q(iV));
            i3++;
        }
        if (iG2 == -1) {
            return null;
        }
        return mgVar2.q(iG2);
    }

    private final long r(mg mgVar, Object obj, long j2) {
        mgVar.z(mgVar.k(obj, this.f22122j).f22396c, this.f22121i);
        mf mfVar = this.f22121i;
        if (mfVar.f22406f != -9223372036854775807L && mfVar.b()) {
            mf mfVar2 = this.f22121i;
            if (mfVar2.f22409i) {
                return iw.b(amn.m(mfVar2.f22407g) - this.f22121i.f22406f) - (j2 + this.f22122j.f22398e);
            }
        }
        return -9223372036854775807L;
    }

    private final long s() {
        return t(this.s.q);
    }

    private final long t(long j2) {
        kq kqVarC = this.f22127o.c();
        if (kqVarC == null) {
            return 0L;
        }
        return Math.max(0L, j2 - kqVarC.f(this.G));
    }

    private final long u(abg abgVar, long j2, boolean z) {
        return v(abgVar, j2, this.f22127o.d() != this.f22127o.e(), z);
    }

    private final long v(abg abgVar, long j2, boolean z, boolean z2) throws jb {
        V();
        this.x = false;
        if (z2 || this.s.f22295e == 3) {
            S(2);
        }
        kq kqVarD = this.f22127o.d();
        kq kqVarH = kqVarD;
        while (kqVarH != null && !abgVar.equals(kqVarH.f22219f.f22229a)) {
            kqVarH = kqVarH.h();
        }
        if (z || kqVarD != kqVarH || (kqVarH != null && kqVarH.g(j2) < 0)) {
            lq[] lqVarArr = this.f22113a;
            int length = lqVarArr.length;
            for (int i2 = 0; i2 < 2; i2++) {
                z(lqVarArr[i2]);
            }
            if (kqVarH != null) {
                while (this.f22127o.d() != kqVarH) {
                    this.f22127o.a();
                }
                this.f22127o.m(kqVarH);
                kqVarH.t();
                B();
            }
        }
        kt ktVar = this.f22127o;
        if (kqVarH != null) {
            ktVar.m(kqVarH);
            if (kqVarH.f22217d) {
                long j3 = kqVarH.f22219f.f22233e;
                if (j3 != -9223372036854775807L && j2 >= j3) {
                    j2 = Math.max(0L, j3 - 1);
                }
                if (kqVarH.f22218e) {
                    long jE = kqVarH.f22214a.e(j2);
                    kqVarH.f22214a.p(jE - this.f22123k);
                    j2 = jE;
                }
            } else {
                kqVarH.f22219f = kqVarH.f22219f.b(j2);
            }
            M(j2);
            I();
        } else {
            ktVar.i();
            M(j2);
        }
        E(false);
        this.f22118f.i(2);
        return j2;
    }

    private final Pair<abg, Long> w(mg mgVar) {
        long j2 = 0;
        if (mgVar.A()) {
            return Pair.create(ld.i(), 0L);
        }
        Pair<Object, Long> pairW = mgVar.w(this.f22121i, this.f22122j, mgVar.e(this.A), -9223372036854775807L);
        abg abgVarH = this.f22127o.h(mgVar, pairW.first, 0L);
        long jLongValue = ((Long) pairW.second).longValue();
        if (abgVarH.b()) {
            mgVar.k(abgVarH.f19056a, this.f22122j);
            if (abgVarH.f19058c == this.f22122j.d(abgVarH.f19057b)) {
                this.f22122j.h();
            }
        } else {
            j2 = jLongValue;
        }
        return Pair.create(abgVarH, Long.valueOf(j2));
    }

    private static Pair<Object, Long> x(mg mgVar, jy jyVar, boolean z, int i2, boolean z2, mf mfVar, me meVar) {
        Pair<Object, Long> pairW;
        Object objE;
        int i3;
        long j2;
        mg mgVar2 = jyVar.f22110a;
        if (mgVar.A()) {
            return null;
        }
        mg mgVar3 = true == mgVar2.A() ? mgVar : mgVar2;
        try {
            pairW = mgVar3.w(mfVar, meVar, jyVar.f22111b, jyVar.f22112c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (mgVar.equals(mgVar3)) {
            return pairW;
        }
        if (mgVar.g(pairW.first) == -1) {
            if (z && (objE = e(mfVar, meVar, i2, z2, pairW.first, mgVar3, mgVar)) != null) {
                i3 = mgVar.k(objE, meVar).f22396c;
                j2 = -9223372036854775807L;
            }
            return null;
        }
        if (!mgVar3.k(pairW.first, meVar).f22399f || mgVar3.z(meVar.f22396c, mfVar).f22415o != mgVar3.g(pairW.first)) {
            return pairW;
        }
        i3 = mgVar.k(pairW.first, meVar).f22396c;
        j2 = jyVar.f22112c;
        return mgVar.w(mfVar, meVar, i3, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.ads.interactivemedia.v3.internal.ld y(com.google.ads.interactivemedia.v3.internal.abg r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.jz.y(com.google.ads.interactivemedia.v3.internal.abg, long, long, long, boolean, int):com.google.ads.interactivemedia.v3.internal.ld");
    }

    private final void z(lq lqVar) {
        if (ac(lqVar)) {
            this.f22124l.d(lqVar);
            ak(lqVar);
            lqVar.n();
            this.E--;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.iz
    public final void a(le leVar) {
        this.f22118f.b(16, leVar).a();
    }

    public final Looper b() {
        return this.f22120h;
    }

    public final /* synthetic */ Boolean d() {
        return Boolean.valueOf(this.u);
    }

    public final /* synthetic */ void f(ln lnVar) {
        try {
            aj(lnVar);
        } catch (jb e2) {
            alj.a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acl
    public final /* bridge */ /* synthetic */ void g(acm acmVar) {
        this.f22118f.b(9, (abe) acmVar).a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.kz
    public final void h() {
        this.f22118f.i(22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27, types: [com.google.ads.interactivemedia.v3.internal.aja, com.google.ads.interactivemedia.v3.internal.akq] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        lb lbVar;
        int i2;
        jb jbVarA;
        IOException iOException;
        int i3;
        boolean z;
        kq kqVarE;
        RuntimeException runtimeException;
        boolean z2;
        long j2;
        boolean z3;
        abg abgVar;
        long jLongValue;
        Throwable th;
        long j3;
        long jA;
        long jU;
        boolean z4;
        long j4;
        ld ldVar;
        int i4;
        ld ldVarY;
        int i5;
        mg mgVarK;
        Message message2 = message;
        try {
            try {
            } catch (jb e2) {
                i2 = 1;
                jbVarA = e2;
            } catch (lb e3) {
                lbVar = e3;
            } catch (RuntimeException e4) {
                e = e4;
                message2 = null;
            }
        } catch (aad e5) {
            iOException = e5;
            i3 = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
            D(iOException, i3);
        } catch (ajy e6) {
            iOException = e6;
            i3 = 2005;
            D(iOException, i3);
        } catch (IOException e7) {
            iOException = e7;
            i3 = 1000;
            D(iOException, i3);
        }
        try {
            try {
                try {
                } catch (jb e8) {
                    jbVarA = e8;
                    i2 = 1;
                    if (jbVarA.f22037a == i2 && (kqVarE = this.f22127o.e()) != null) {
                        jbVarA = jbVarA.a(kqVarE.f22219f.f22229a);
                    }
                    if (!jbVarA.f22043g || this.J != null) {
                        if (this.J != null) {
                            jbVarA = this.J;
                        }
                        alj.a("ExoPlayerImplInternal", "Playback error", jbVarA);
                        z = true;
                        U(true, false);
                        this.s = this.s.e(jbVarA);
                        J();
                        return z;
                    }
                    alj.b("ExoPlayerImplInternal", "Recoverable renderer error", jbVarA);
                    this.J = jbVarA;
                    alc alcVar = this.f22118f;
                    alcVar.k(alcVar.b(25, jbVarA));
                } catch (lb e9) {
                    lbVar = e9;
                    D(lbVar, lbVar.f22288b == 1 ? true != lbVar.f22287a ? 3003 : AdError.MEDIATION_ERROR_CODE : 1000);
                }
            } catch (RuntimeException e10) {
                runtimeException = e10;
                z2 = 0;
                jb jbVarE = jb.e(runtimeException);
                alj.a("ExoPlayerImplInternal", "Playback error", jbVarE);
                U(true, z2);
                this.s = this.s.e(jbVarE);
            }
        } catch (RuntimeException e11) {
            e = e11;
            runtimeException = e;
            z2 = message2;
            jb jbVarE2 = jb.e(runtimeException);
            alj.a("ExoPlayerImplInternal", "Playback error", jbVarE2);
            U(true, z2);
            this.s = this.s.e(jbVarE2);
            z = true;
            J();
            return z;
        }
        switch (message2.what) {
            case 0:
                this.t.a(1);
                K(false, false, false, true);
                this.K.b();
                S(true != this.s.f22291a.A() ? 2 : 4);
                this.p.e(this.f22117e);
                this.f22118f.i(2);
                z = true;
                J();
                return z;
            case 1:
                R(message2.arg1 != 0, message2.arg2, true, 1);
                z = true;
                J();
                return z;
            case 2:
                A();
                z = true;
                J();
                return z;
            case 3:
                jy jyVar = (jy) message2.obj;
                this.t.a(1);
                Pair<Object, Long> pairX = x(this.s.f22291a, jyVar, true, this.z, this.A, this.f22121i, this.f22122j);
                if (pairX == null) {
                    Pair<abg, Long> pairW = w(this.s.f22291a);
                    abg abgVar2 = (abg) pairW.first;
                    j2 = -9223372036854775807L;
                    jLongValue = ((Long) pairW.second).longValue();
                    z3 = !this.s.f22291a.A();
                    abgVar = abgVar2;
                } else {
                    Object obj = pairX.first;
                    long jLongValue2 = ((Long) pairX.second).longValue();
                    j2 = jyVar.f22112c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
                    abg abgVarH = this.f22127o.h(this.s.f22291a, obj, jLongValue2);
                    if (abgVarH.b()) {
                        this.s.f22291a.k(abgVarH.f19056a, this.f22122j);
                        if (this.f22122j.d(abgVarH.f19057b) == abgVarH.f19058c) {
                            this.f22122j.h();
                        }
                        jLongValue = 0;
                        abgVar = abgVarH;
                        z3 = true;
                    } else {
                        j2 = j2;
                        z3 = jyVar.f22112c == -9223372036854775807L;
                        abgVar = abgVarH;
                        jLongValue = jLongValue2;
                    }
                }
                try {
                    if (this.s.f22291a.A()) {
                        this.F = jyVar;
                    } else if (pairX == null) {
                        if (this.s.f22295e != 1) {
                            S(4);
                        }
                        K(false, true, false, true);
                    } else {
                        try {
                            if (abgVar.equals(this.s.f22292b)) {
                                kq kqVarD = this.f22127o.d();
                                jA = (kqVarD == null || !kqVarD.f22217d || jLongValue == 0) ? jLongValue : kqVarD.f22214a.a(jLongValue, this.r);
                                if (iw.c(jA) == iw.c(this.s.s) && ((i4 = (ldVar = this.s).f22295e) == 2 || i4 == 3)) {
                                    long j5 = ldVar.s;
                                    ldVarY = y(abgVar, j5, j2, j5, z3, 2);
                                    this.s = ldVarY;
                                    z = true;
                                    J();
                                    return z;
                                }
                            } else {
                                jA = jLongValue;
                            }
                            ld ldVar2 = this.s;
                            mg mgVar = ldVar2.f22291a;
                            X(mgVar, abgVar, mgVar, ldVar2.f22292b, j2);
                            z3 = z4;
                            j4 = jU;
                            ldVarY = y(abgVar, j4, j2, j4, z3, 2);
                            this.s = ldVarY;
                            z = true;
                            J();
                            return z;
                        } catch (Throwable th2) {
                            z3 = z4;
                            j3 = jU;
                            th = th2;
                            this.s = y(abgVar, j3, j2, j3, z3, 2);
                            throw th;
                        }
                        jU = u(abgVar, jA, this.s.f22295e == 4);
                        z4 = z3 | (jLongValue != jU);
                    }
                    j4 = jLongValue;
                    ldVarY = y(abgVar, j4, j2, j4, z3, 2);
                    this.s = ldVarY;
                    z = true;
                    J();
                    return z;
                } catch (Throwable th3) {
                    th = th3;
                    j3 = jLongValue;
                }
                break;
            case 4:
                this.f22124l.g((le) message2.obj);
                G(this.f22124l.c(), true);
                z = true;
                J();
                return z;
            case 5:
                this.r = (lt) message2.obj;
                z = true;
                J();
                return z;
            case 6:
                U(false, true);
                z = true;
                J();
                return z;
            case 7:
                K(true, false, true, false);
                this.K.c();
                S(1);
                this.f22119g.quit();
                synchronized (this) {
                    this.u = true;
                    notifyAll();
                    break;
                }
                return true;
            case 8:
                if (this.f22127o.l((abe) message2.obj)) {
                    kq kqVarC = this.f22127o.c();
                    kqVarC.m(this.f22124l.c().f22307b, this.s.f22291a);
                    Y(kqVarC.i(), kqVarC.j());
                    if (kqVarC == this.f22127o.d()) {
                        M(kqVarC.f22219f.f22230b);
                        B();
                        ld ldVar3 = this.s;
                        abg abgVar3 = ldVar3.f22292b;
                        long j6 = kqVarC.f22219f.f22230b;
                        this.s = y(abgVar3, j6, ldVar3.f22293c, j6, false, 5);
                    }
                    I();
                }
                z = true;
                J();
                return z;
            case 9:
                if (this.f22127o.l((abe) message2.obj)) {
                    this.f22127o.k(this.G);
                    I();
                }
                z = true;
                J();
                return z;
            case 10:
                float f2 = this.f22124l.c().f22307b;
                kq kqVarD2 = this.f22127o.d();
                kq kqVarE2 = this.f22127o.e();
                boolean z5 = true;
                while (kqVarD2 != null && kqVarD2.f22217d) {
                    aiq aiqVarK = kqVarD2.k(f2, this.s.f22291a);
                    aiq aiqVarJ = kqVarD2.j();
                    if (aiqVarJ != null && aiqVarJ.f19847c.length == aiqVarK.f19847c.length) {
                        for (int i6 = 0; i6 < aiqVarK.f19847c.length; i6++) {
                            if (aiqVarK.a(aiqVarJ, i6)) {
                            }
                        }
                        z5 &= kqVarD2 != kqVarE2;
                        kqVarD2 = kqVarD2.h();
                    }
                    if (z5) {
                        kq kqVarD3 = this.f22127o.d();
                        boolean zM = this.f22127o.m(kqVarD3);
                        int length = this.f22113a.length;
                        boolean[] zArr = new boolean[2];
                        long jA2 = kqVarD3.a(aiqVarK, this.s.s, zM, zArr);
                        ld ldVar4 = this.s;
                        boolean z6 = (ldVar4.f22295e == 4 || jA2 == ldVar4.s) ? false : true;
                        ld ldVar5 = this.s;
                        i5 = 2;
                        this.s = y(ldVar5.f22292b, jA2, ldVar5.f22293c, ldVar5.f22294d, z6, 5);
                        if (z6) {
                            M(jA2);
                        }
                        int length2 = this.f22113a.length;
                        boolean[] zArr2 = new boolean[2];
                        int i7 = 0;
                        while (true) {
                            lq[] lqVarArr = this.f22113a;
                            int length3 = lqVarArr.length;
                            if (i7 < 2) {
                                lq lqVar = lqVarArr[i7];
                                boolean zAc = ac(lqVar);
                                zArr2[i7] = zAc;
                                ack ackVar = kqVarD3.f22216c[i7];
                                if (zAc) {
                                    if (ackVar != lqVar.l()) {
                                        z(lqVar);
                                    } else if (zArr[i7]) {
                                        lqVar.z(this.G);
                                    }
                                }
                                i7++;
                            } else {
                                C(zArr2);
                            }
                        }
                    } else {
                        i5 = 2;
                        this.f22127o.m(kqVarD2);
                        if (kqVarD2.f22217d) {
                            kqVarD2.s(aiqVarK, Math.max(kqVarD2.f22219f.f22230b, kqVarD2.f(this.G)));
                        }
                    }
                    E(true);
                    if (this.s.f22295e != 4) {
                        I();
                        Z();
                        this.f22118f.i(i5);
                    }
                }
                z = true;
                J();
                return z;
            case 11:
                int i8 = message2.arg1;
                this.z = i8;
                if (!this.f22127o.p(this.s.f22291a, i8)) {
                    P(true);
                }
                E(false);
                z = true;
                J();
                return z;
            case 12:
                boolean z7 = message2.arg1 != 0;
                this.A = z7;
                if (!this.f22127o.q(this.s.f22291a, z7)) {
                    P(true);
                }
                E(false);
                z = true;
                J();
                return z;
            case 13:
                boolean z8 = message2.arg1 != 0;
                AtomicBoolean atomicBoolean = (AtomicBoolean) message2.obj;
                if (this.B != z8) {
                    this.B = z8;
                    if (!z8) {
                        lq[] lqVarArr2 = this.f22113a;
                        int length4 = lqVarArr2.length;
                        for (int i9 = 0; i9 < 2; i9++) {
                            lq lqVar2 = lqVarArr2[i9];
                            if (!ac(lqVar2)) {
                                lqVar2.y();
                            }
                        }
                    }
                }
                if (atomicBoolean != null) {
                    synchronized (this) {
                        atomicBoolean.set(true);
                        notifyAll();
                        break;
                    }
                }
                z = true;
                J();
                return z;
            case 14:
                ln lnVar = (ln) message2.obj;
                lnVar.c();
                Q(lnVar);
                z = true;
                J();
                return z;
            case 15:
                final ln lnVar2 = (ln) message2.obj;
                Looper looperD = lnVar2.d();
                if (looperD.getThread().isAlive()) {
                    this.f22126n.b(looperD, null).f(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.jr
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f22082a.f(lnVar2);
                        }
                    });
                } else {
                    Log.w("TAG", "Trying to send message on a dead thread.");
                    lnVar2.h(false);
                }
                z = true;
                J();
                return z;
            case 16:
                G((le) message2.obj, false);
                z = true;
                J();
                return z;
            case 17:
                jt jtVar = (jt) message2.obj;
                this.t.a(1);
                if (jtVar.f22086b != -1) {
                    this.F = new jy(new lo(jtVar.f22085a, jtVar.f22088d), jtVar.f22086b, jtVar.f22087c);
                }
                mgVarK = this.p.k(jtVar.f22085a, jtVar.f22088d);
                F(mgVarK, false);
                z = true;
                J();
                return z;
            case 18:
                jt jtVar2 = (jt) message2.obj;
                int iA = message2.arg1;
                this.t.a(1);
                la laVar = this.p;
                if (iA == -1) {
                    iA = laVar.a();
                }
                mgVarK = laVar.i(iA, jtVar2.f22085a, jtVar2.f22088d);
                F(mgVarK, false);
                z = true;
                J();
                return z;
            case 19:
                ju juVar = (ju) message2.obj;
                this.t.a(1);
                la laVar2 = this.p;
                int i10 = juVar.f22089a;
                mgVarK = laVar2.o();
                F(mgVarK, false);
                z = true;
                J();
                return z;
            case 20:
                int i11 = message2.arg1;
                int i12 = message2.arg2;
                acn acnVar = (acn) message2.obj;
                this.t.a(1);
                mgVarK = this.p.j(i11, i12, acnVar);
                F(mgVarK, false);
                z = true;
                J();
                return z;
            case 21:
                acn acnVar2 = (acn) message2.obj;
                this.t.a(1);
                mgVarK = this.p.l(acnVar2);
                F(mgVarK, false);
                z = true;
                J();
                return z;
            case 22:
                F(this.p.b(), true);
                z = true;
                J();
                return z;
            case 23:
                this.v = message2.arg1 != 0;
                L();
                if (this.w && this.f22127o.e() != this.f22127o.d()) {
                    P(true);
                    E(false);
                }
                z = true;
                J();
                return z;
            case 24:
                boolean z9 = message2.arg1 == 1;
                if (z9 != this.D) {
                    this.D = z9;
                    ld ldVar6 = this.s;
                    int i13 = ldVar6.f22295e;
                    if (!z9 && i13 != 4 && i13 != 1) {
                        this.f22118f.i(2);
                    }
                    ldVarY = ldVar6.c(z9);
                    this.s = ldVarY;
                }
                z = true;
                J();
                return z;
            case 25:
                P(true);
                z = true;
                J();
                return z;
            default:
                return false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abd
    public final void i(abe abeVar) {
        this.f22118f.b(8, abeVar).a();
    }

    public final void j() {
        this.f22118f.a(0).a();
    }

    public final void k(mg mgVar, int i2, long j2) {
        this.f22118f.b(3, new jy(mgVar, i2, j2)).a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ll
    public final synchronized void l(ln lnVar) {
        if (!this.u && this.f22119g.isAlive()) {
            this.f22118f.b(14, lnVar).a();
            return;
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        lnVar.h(false);
    }

    public final void m(boolean z, int i2) {
        this.f22118f.e(z ? 1 : 0, i2).a();
    }

    public final void n() {
        this.f22118f.a(6).a();
    }

    public final synchronized boolean o() {
        if (!this.u && this.f22119g.isAlive()) {
            this.f22118f.i(7);
            aa(new aru() { // from class: com.google.ads.interactivemedia.v3.internal.jq
                @Override // com.google.ads.interactivemedia.v3.internal.aru
                public final Object a() {
                    return this.f22081a.d();
                }
            }, 500L);
            return this.u;
        }
        return true;
    }

    public final void p(List<ky> list, int i2, long j2, acn acnVar) {
        this.f22118f.b(17, new jt(list, acnVar, i2, j2)).a();
    }
}

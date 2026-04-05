package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class jp extends iu implements lk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aiq f22067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lg f22068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aip f22069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final alc f22070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final jz f22071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ali<lh> f22072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet<jc> f22073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final me f22074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<jo> f22075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f22076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final nl f22077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Looper f22078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final aja f22079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final akt f22080o;
    private int p;
    private int q;
    private boolean r;
    private int s;
    private lg t;
    private kp u;
    private ld v;
    private int w;
    private long x;
    private final jd y;
    private acn z;

    @SuppressLint({"HandlerLeak"})
    public jp(lq[] lqVarArr, aip aipVar, iy iyVar, aja ajaVar, nl nlVar, boolean z, lt ltVar, ix ixVar, long j2, akt aktVar, Looper looper, final lk lkVar, lg lgVar) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = amn.f20139e;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.14.0] [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        int length = lqVarArr.length;
        ajr.f(true);
        ajr.b(aipVar);
        this.f22069d = aipVar;
        this.f22079n = ajaVar;
        this.f22077l = nlVar;
        this.f22076k = true;
        this.f22078m = looper;
        this.f22080o = aktVar;
        this.f22072g = new ali<>(looper, aktVar, new alg() { // from class: com.google.ads.interactivemedia.v3.internal.ji
            @Override // com.google.ads.interactivemedia.v3.internal.alg
            public final void a(Object obj, ala alaVar) {
                new li(alaVar);
                ((lh) obj).v();
            }
        });
        this.f22073h = new CopyOnWriteArraySet<>();
        this.f22075j = new ArrayList();
        this.z = new acn();
        aiq aiqVar = new aiq(new ls[2], new aii[2], null);
        this.f22067b = aiqVar;
        this.f22074i = new me();
        lf lfVar = new lf();
        lfVar.d(1, 2, 8, 9, 10, 11, 12, 13, 14, 15);
        lfVar.c(lgVar);
        lg lgVarA = lfVar.a();
        this.f22068c = lgVarA;
        lf lfVar2 = new lf();
        lfVar2.c(lgVarA);
        lfVar2.b(3);
        lfVar2.b(7);
        this.t = lfVar2.a();
        this.u = kp.f22205a;
        this.w = -1;
        this.f22070e = aktVar.b(looper, null);
        jd jdVar = new jd(this);
        this.y = jdVar;
        this.v = ld.h(aiqVar);
        nlVar.Y(lkVar, looper);
        p(nlVar);
        ajaVar.b(new Handler(looper), nlVar);
        this.f22071f = new jz(lqVarArr, aipVar, aiqVar, iyVar, ajaVar, nlVar, ltVar, ixVar, 500L, looper, aktVar, jdVar);
    }

    private final int G() {
        if (this.v.f22291a.A()) {
            return this.w;
        }
        ld ldVar = this.v;
        return ldVar.f22291a.k(ldVar.f22292b.f19056a, this.f22074i).f22396c;
    }

    private final long H(ld ldVar) {
        return ldVar.f22291a.A() ? iw.b(this.x) : ldVar.f22292b.b() ? ldVar.s : J(ldVar.f22291a, ldVar.f22292b, ldVar.s);
    }

    private static long I(ld ldVar) {
        mf mfVar = new mf();
        me meVar = new me();
        ldVar.f22291a.k(ldVar.f22292b.f19056a, meVar);
        long j2 = ldVar.f22293c;
        return j2 == -9223372036854775807L ? ldVar.f22291a.z(meVar.f22396c, mfVar).f22413m : meVar.f22398e + j2;
    }

    private final long J(mg mgVar, abg abgVar, long j2) {
        mgVar.k(abgVar.f19056a, this.f22074i);
        return j2 + this.f22074i.f22398e;
    }

    private final Pair<Object, Long> K(mg mgVar, int i2, long j2) {
        if (mgVar.A()) {
            this.w = i2;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.x = j2;
            return null;
        }
        if (i2 == -1 || i2 >= mgVar.t()) {
            i2 = mgVar.e(false);
            j2 = mgVar.z(i2, this.f21983a).a();
        }
        return mgVar.w(this.f21983a, this.f22074i, i2, iw.b(j2));
    }

    private final ld L(ld ldVar, mg mgVar, Pair<Object, Long> pair) {
        long jF;
        ld ldVarB;
        ajr.d(mgVar.A() || pair != null);
        mg mgVar2 = ldVar.f22291a;
        ld ldVarG = ldVar.g(mgVar);
        if (mgVar.A()) {
            abg abgVarI = ld.i();
            long jB = iw.b(this.x);
            ld ldVarA = ldVarG.b(abgVarI, jB, jB, jB, 0L, act.f19206a, this.f22067b, aty.n()).a(abgVarI);
            ldVarA.q = ldVarA.s;
            return ldVarA;
        }
        Object obj = ldVarG.f22292b.f19056a;
        int i2 = amn.f20135a;
        boolean z = !obj.equals(pair.first);
        abg abgVar = z ? new abg(pair.first) : ldVarG.f22292b;
        long jLongValue = ((Long) pair.second).longValue();
        long jB2 = iw.b(h());
        if (!mgVar2.A()) {
            jB2 -= mgVar2.k(obj, this.f22074i).f22398e;
        }
        if (z || jLongValue < jB2) {
            ajr.f(!abgVar.b());
            ld ldVarA2 = ldVarG.b(abgVar, jLongValue, jLongValue, jLongValue, 0L, z ? act.f19206a : ldVarG.f22298h, z ? this.f22067b : ldVarG.f22299i, z ? aty.n() : ldVarG.f22300j).a(abgVar);
            ldVarA2.q = jLongValue;
            return ldVarA2;
        }
        if (jLongValue == jB2) {
            int iG = mgVar.g(ldVarG.f22301k.f19056a);
            if (iG != -1 && mgVar.y(iG, this.f22074i).f22396c == mgVar.k(abgVar.f19056a, this.f22074i).f22396c) {
                return ldVarG;
            }
            mgVar.k(abgVar.f19056a, this.f22074i);
            jF = abgVar.b() ? this.f22074i.f(abgVar.f19057b, abgVar.f19058c) : this.f22074i.f22397d;
            ldVarB = ldVarG.b(abgVar, ldVarG.s, ldVarG.s, ldVarG.f22294d, jF - ldVarG.s, ldVarG.f22298h, ldVarG.f22299i, ldVarG.f22300j).a(abgVar);
        } else {
            ajr.f(!abgVar.b());
            long jMax = Math.max(0L, ldVarG.r - (jLongValue - jB2));
            jF = ldVarG.q;
            if (ldVarG.f22301k.equals(ldVarG.f22292b)) {
                jF = jLongValue + jMax;
            }
            ldVarB = ldVarG.b(abgVar, jLongValue, jLongValue, jLongValue, jMax, ldVarG.f22298h, ldVarG.f22299i, ldVarG.f22300j);
        }
        ldVarB.q = jF;
        return ldVarB;
    }

    private final void M(final ld ldVar, int i2, int i3, boolean z, boolean z2, final int i4, long j2, int i5) {
        Pair pair;
        int i6;
        final kn knVar;
        int i7;
        Object obj;
        Object obj2;
        int iG;
        long jI;
        long jI2;
        Object obj3;
        Object obj4;
        int iG2;
        ld ldVar2 = this.v;
        this.v = ldVar;
        int i8 = 1;
        boolean z3 = !ldVar2.f22291a.equals(ldVar.f22291a);
        mg mgVar = ldVar2.f22291a;
        mg mgVar2 = ldVar.f22291a;
        if (mgVar2.A() && mgVar.A()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (mgVar2.A() != mgVar.A()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (mgVar.z(mgVar.k(ldVar2.f22292b.f19056a, this.f22074i).f22396c, this.f21983a).f22402b.equals(mgVar2.z(mgVar2.k(ldVar.f22292b.f19056a, this.f22074i).f22396c, this.f21983a).f22402b)) {
            pair = (z2 && i4 == 0 && ldVar2.f22292b.f19059d < ldVar.f22292b.f19059d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z2 && i4 == 0) {
                i6 = 1;
            } else if (z2 && i4 == 1) {
                i6 = 2;
            } else {
                if (!z3) {
                    throw new IllegalStateException();
                }
                i6 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i6));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        kp kpVarA = this.u;
        if (zBooleanValue) {
            knVar = !ldVar.f22291a.A() ? ldVar.f22291a.z(ldVar.f22291a.k(ldVar.f22292b.f19056a, this.f22074i).f22396c, this.f21983a).f22403c : null;
            this.u = knVar != null ? knVar.f22195d : kp.f22205a;
        } else {
            knVar = null;
        }
        if (!ldVar2.f22300j.equals(ldVar.f22300j)) {
            ko koVar = new ko(kpVarA);
            List<ys> list = ldVar.f22300j;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ys ysVar = list.get(i9);
                for (int i10 = 0; i10 < ysVar.a(); i10++) {
                    ysVar.b(i10).a(koVar);
                }
            }
            kpVarA = koVar.a();
        }
        boolean z4 = !kpVarA.equals(this.u);
        this.u = kpVarA;
        if (!ldVar2.f22291a.equals(ldVar.f22291a)) {
            this.f22072g.d(0, new jf(ldVar, i2));
        }
        if (z2) {
            me meVar = new me();
            if (ldVar2.f22291a.A()) {
                i7 = i5;
                obj = null;
                obj2 = null;
                iG = -1;
            } else {
                Object obj5 = ldVar2.f22292b.f19056a;
                ldVar2.f22291a.k(obj5, meVar);
                int i11 = meVar.f22396c;
                obj2 = obj5;
                i7 = i11;
                iG = ldVar2.f22291a.g(obj5);
                obj = ldVar2.f22291a.z(i11, this.f21983a).f22402b;
            }
            if (i4 == 0) {
                jI = meVar.f22398e + meVar.f22397d;
                if (ldVar2.f22292b.b()) {
                    abg abgVar = ldVar2.f22292b;
                    jI = meVar.f(abgVar.f19057b, abgVar.f19058c);
                    jI2 = I(ldVar2);
                } else {
                    if (ldVar2.f22292b.f19060e != -1 && this.v.f22292b.b()) {
                        jI = I(this.v);
                    }
                    jI2 = jI;
                }
            } else if (ldVar2.f22292b.b()) {
                jI = ldVar2.s;
                jI2 = I(ldVar2);
            } else {
                jI = meVar.f22398e + ldVar2.s;
                jI2 = jI;
            }
            long jC = iw.c(jI);
            abg abgVar2 = ldVar2.f22292b;
            final lj ljVar = new lj(obj, i7, obj2, iG, jC, iw.c(jI2), abgVar2.f19057b, abgVar2.f19058c);
            int iF = f();
            if (this.v.f22291a.A()) {
                obj3 = null;
                obj4 = null;
                iG2 = -1;
            } else {
                ld ldVar3 = this.v;
                Object obj6 = ldVar3.f22292b.f19056a;
                ldVar3.f22291a.k(obj6, this.f22074i);
                iG2 = this.v.f22291a.g(obj6);
                obj4 = obj6;
                obj3 = this.v.f22291a.z(iF, this.f21983a).f22402b;
            }
            long jC2 = iw.c(j2);
            long jC3 = this.v.f22292b.b() ? iw.c(I(this.v)) : jC2;
            abg abgVar3 = this.v.f22292b;
            final lj ljVar2 = new lj(obj3, iF, obj4, iG2, jC2, jC3, abgVar3.f19057b, abgVar3.f19058c);
            this.f22072g.d(12, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.jk
                @Override // com.google.ads.interactivemedia.v3.internal.alf
                public final void a(Object obj7) {
                    int i12 = i4;
                    lj ljVar3 = ljVar;
                    lj ljVar4 = ljVar2;
                    lh lhVar = (lh) obj7;
                    lhVar.x();
                    lhVar.q(ljVar3, ljVar4, i12);
                }
            });
        }
        if (zBooleanValue) {
            this.f22072g.d(1, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.jm
                @Override // com.google.ads.interactivemedia.v3.internal.alf
                public final void a(Object obj7) {
                    ((lh) obj7).i(knVar, iIntValue);
                }
            });
        }
        jb jbVar = ldVar2.f22296f;
        jb jbVar2 = ldVar.f22296f;
        int i12 = 5;
        if (jbVar != jbVar2 && jbVar2 != null) {
            this.f22072g.d(11, new je(ldVar, i12));
        }
        aiq aiqVar = ldVar2.f22299i;
        aiq aiqVar2 = ldVar.f22299i;
        if (aiqVar != aiqVar2) {
            Object obj7 = aiqVar2.f19848d;
            final aim aimVar = new aim(aiqVar2.f19847c);
            this.f22072g.d(2, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.jg
                @Override // com.google.ads.interactivemedia.v3.internal.alf
                public final void a(Object obj8) {
                    ld ldVar4 = ldVar;
                    ((lh) obj8).t(ldVar4.f22298h, aimVar);
                }
            });
        }
        int i13 = 6;
        if (!ldVar2.f22300j.equals(ldVar.f22300j)) {
            this.f22072g.d(3, new je(ldVar, i13));
        }
        if (z4) {
            final kp kpVar = this.u;
            this.f22072g.d(15, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.jn
                @Override // com.google.ads.interactivemedia.v3.internal.alf
                public final void a(Object obj8) {
                    ((lh) obj8).j(kpVar);
                }
            });
        }
        int i14 = 4;
        int i15 = 7;
        if (ldVar2.f22297g != ldVar.f22297g) {
            this.f22072g.d(4, new je(ldVar, i15));
        }
        if (ldVar2.f22295e != ldVar.f22295e || ldVar2.f22302l != ldVar.f22302l) {
            this.f22072g.d(-1, new je(ldVar, i8));
        }
        if (ldVar2.f22295e != ldVar.f22295e) {
            this.f22072g.d(5, new je(ldVar));
        }
        if (ldVar2.f22302l != ldVar.f22302l) {
            this.f22072g.d(6, new jf(ldVar, i3, 1));
        }
        if (ldVar2.f22303m != ldVar.f22303m) {
            this.f22072g.d(7, new je(ldVar, 2));
        }
        if (N(ldVar2) != N(ldVar)) {
            this.f22072g.d(8, new je(ldVar, 3));
        }
        if (!ldVar2.f22304n.equals(ldVar.f22304n)) {
            this.f22072g.d(13, new je(ldVar, i14));
        }
        if (z) {
            this.f22072g.d(-1, jh.f22052a);
        }
        lg lgVar = this.t;
        lg lgVarA = a(this.f22068c);
        this.t = lgVarA;
        if (!lgVarA.equals(lgVar)) {
            this.f22072g.d(14, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.jl
                @Override // com.google.ads.interactivemedia.v3.internal.alf
                public final void a(Object obj8) {
                    this.f22061a.s((lh) obj8);
                }
            });
        }
        this.f22072g.c();
        if (ldVar2.f22305o != ldVar.f22305o) {
            Iterator<jc> it = this.f22073h.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
        if (ldVar2.p != ldVar.p) {
            Iterator<jc> it2 = this.f22073h.iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
        }
    }

    private static boolean N(ld ldVar) {
        return ldVar.f22295e == 3 && ldVar.f22302l && ldVar.f22303m == 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final void A() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final void B() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final void C(int i2) {
        mg mgVar = this.v.f22291a;
        if (i2 < 0 || (!mgVar.A() && i2 >= mgVar.t())) {
            throw new kg();
        }
        this.p++;
        if (z()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            jw jwVar = new jw(this.v);
            jwVar.a(1);
            this.y.a(jwVar);
            return;
        }
        int i3 = g() != 1 ? 2 : 1;
        int iF = f();
        ld ldVarL = L(this.v.f(i3), mgVar, K(mgVar, i2, 0L));
        this.f22071f.k(mgVar, i2, iw.b(0L));
        M(ldVarL, 0, 1, true, true, 1, H(ldVarL), iF);
    }

    public final void D(List<abi> list) {
        G();
        i();
        this.p++;
        if (!this.f22075j.isEmpty()) {
            int size = this.f22075j.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                this.f22075j.remove(i2);
            }
            this.z = this.z.h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ky kyVar = new ky(list.get(i3), this.f22076k);
            arrayList.add(kyVar);
            this.f22075j.add(i3, new jo(kyVar.f22263b, kyVar.f22262a.D()));
        }
        this.z = this.z.g(0, arrayList.size());
        lo loVar = new lo(this.f22075j, this.z);
        if (!loVar.A() && loVar.t() < 0) {
            throw new kg();
        }
        int iE = loVar.e(false);
        ld ldVarL = L(this.v, loVar, K(loVar, iE, -9223372036854775807L));
        int i4 = ldVarL.f22295e;
        if (iE != -1 && i4 != 1) {
            i4 = (loVar.A() || iE >= loVar.t()) ? 4 : 2;
        }
        ld ldVarF = ldVarL.f(i4);
        this.f22071f.p(arrayList, iE, iw.b(-9223372036854775807L), this.z);
        M(ldVarF, 0, 1, false, (this.v.f22292b.f19056a.equals(ldVarF.f22292b.f19056a) || this.v.f22291a.A()) ? false : true, 4, H(ldVarF), -1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final void E() {
        F(null);
    }

    public final void F(jb jbVar) {
        ld ldVar = this.v;
        ld ldVarA = ldVar.a(ldVar.f22292b);
        ldVarA.q = ldVarA.s;
        ldVarA.r = 0L;
        ld ldVarF = ldVarA.f(1);
        if (jbVar != null) {
            ldVarF = ldVarF.e(jbVar);
        }
        ld ldVar2 = ldVarF;
        this.p++;
        this.f22071f.n();
        M(ldVar2, 0, 1, false, ldVar2.f22291a.A() && !this.v.f22291a.A(), 4, H(ldVar2), -1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final int c() {
        if (z()) {
            return this.v.f22292b.f19057b;
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final int d() {
        if (z()) {
            return this.v.f22292b.f19058c;
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final int e() {
        if (this.v.f22291a.A()) {
            return 0;
        }
        ld ldVar = this.v;
        return ldVar.f22291a.g(ldVar.f22292b.f19056a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final int f() {
        int iG = G();
        if (iG == -1) {
            return 0;
        }
        return iG;
    }

    public final int g() {
        return this.v.f22295e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final long h() {
        if (!z()) {
            return i();
        }
        ld ldVar = this.v;
        ldVar.f22291a.k(ldVar.f22292b.f19056a, this.f22074i);
        ld ldVar2 = this.v;
        return ldVar2.f22293c == -9223372036854775807L ? ldVar2.f22291a.z(f(), this.f21983a).a() : iw.c(this.f22074i.f22398e) + iw.c(this.v.f22293c);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final long i() {
        return iw.c(H(this.v));
    }

    public final long j() {
        long jF;
        if (z()) {
            ld ldVar = this.v;
            abg abgVar = ldVar.f22292b;
            ldVar.f22291a.k(abgVar.f19056a, this.f22074i);
            jF = this.f22074i.f(abgVar.f19057b, abgVar.f19058c);
        } else {
            mg mgVarN = n();
            if (mgVarN.A()) {
                return -9223372036854775807L;
            }
            jF = mgVarN.z(f(), this.f21983a).f22414n;
        }
        return iw.c(jF);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final long k() {
        return iw.c(this.v.r);
    }

    public final Looper l() {
        return this.f22078m;
    }

    public final ln m(lm lmVar) {
        return new ln(this.f22071f, lmVar, this.v.f22291a, f(), this.f22080o, this.f22071f.b());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final mg n() {
        return this.v.f22291a;
    }

    public final void o(jc jcVar) {
        this.f22073h.add(jcVar);
    }

    public final void p(lh lhVar) {
        this.f22072g.b(lhVar);
    }

    public final /* synthetic */ void q(jw jwVar) {
        long j2;
        boolean z;
        long J;
        int i2 = this.p - jwVar.f22098b;
        this.p = i2;
        boolean z2 = true;
        if (jwVar.f22099c) {
            this.q = jwVar.f22100d;
            this.r = true;
        }
        if (jwVar.f22101e) {
            this.s = jwVar.f22102f;
        }
        if (i2 == 0) {
            mg mgVar = jwVar.f22097a.f22291a;
            if (!this.v.f22291a.A() && mgVar.A()) {
                this.w = -1;
                this.x = 0L;
            }
            if (!mgVar.A()) {
                List<mg> listU = ((lo) mgVar).u();
                ajr.f(listU.size() == this.f22075j.size());
                for (int i3 = 0; i3 < listU.size(); i3++) {
                    this.f22075j.get(i3).f22066b = listU.get(i3);
                }
            }
            if (this.r) {
                if (jwVar.f22097a.f22292b.equals(this.v.f22292b) && jwVar.f22097a.f22294d == this.v.s) {
                    z2 = false;
                }
                if (z2) {
                    if (mgVar.A() || jwVar.f22097a.f22292b.b()) {
                        J = jwVar.f22097a.f22294d;
                    } else {
                        ld ldVar = jwVar.f22097a;
                        J = J(mgVar, ldVar.f22292b, ldVar.f22294d);
                    }
                    j2 = J;
                } else {
                    j2 = -9223372036854775807L;
                }
                z = z2;
            } else {
                j2 = -9223372036854775807L;
                z = false;
            }
            this.r = false;
            M(jwVar.f22097a, 1, this.s, false, z, this.q, j2, -1);
        }
    }

    public final /* synthetic */ void r(final jw jwVar) {
        this.f22070e.f(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.jj
            @Override // java.lang.Runnable
            public final void run() {
                this.f22056a.q(jwVar);
            }
        });
    }

    public final /* synthetic */ void s(lh lhVar) {
        lhVar.u();
    }

    public final void u() {
        ld ldVar = this.v;
        if (ldVar.f22295e != 1) {
            return;
        }
        ld ldVarE = ldVar.e(null);
        ld ldVarF = ldVarE.f(true != ldVarE.f22291a.A() ? 2 : 4);
        this.p++;
        this.f22071f.j();
        M(ldVarF, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void v() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = amn.f20139e;
        String strA = ka.a();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str).length() + String.valueOf(strA).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.14.0] [");
        sb.append(str);
        sb.append("] [");
        sb.append(strA);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        if (!this.f22071f.o()) {
            this.f22072g.g(11, jh.f22053b);
        }
        this.f22072g.e();
        this.f22070e.g();
        nl nlVar = this.f22077l;
        if (nlVar != null) {
            this.f22079n.c(nlVar);
        }
        ld ldVarF = this.v.f(1);
        this.v = ldVarF;
        ld ldVarA = ldVarF.a(ldVarF.f22292b);
        this.v = ldVarA;
        ldVarA.q = ldVarA.s;
        this.v.r = 0L;
    }

    public final void w(boolean z, int i2, int i3) {
        ld ldVar = this.v;
        if (ldVar.f22302l == z && ldVar.f22303m == i2) {
            return;
        }
        this.p++;
        ld ldVarD = ldVar.d(z, i2);
        this.f22071f.m(z, i2);
        M(ldVarD, 0, i3, false, false, 5, -9223372036854775807L, -1);
    }

    public final boolean x() {
        return this.v.p;
    }

    public final boolean y() {
        return this.v.f22302l;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final boolean z() {
        return this.v.f22292b.b();
    }
}

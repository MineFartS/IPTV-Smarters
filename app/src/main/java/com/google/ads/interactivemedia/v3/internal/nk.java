package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final me f22518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aty<abg> f22519b = aty.n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private aud<abg, mg> f22520c = aud.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private abg f22521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private abg f22522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private abg f22523f;

    public nk(me meVar) {
        this.f22518a = meVar;
    }

    private static abg j(lk lkVar, aty<abg> atyVar, abg abgVar, me meVar) {
        mg mgVarN = lkVar.n();
        int iE = lkVar.e();
        Object objQ = mgVarN.A() ? null : mgVarN.q(iE);
        int iB = (lkVar.z() || mgVarN.A()) ? -1 : mgVarN.y(iE, meVar).b(iw.b(lkVar.i()) - meVar.f22398e);
        for (int i2 = 0; i2 < atyVar.size(); i2++) {
            abg abgVar2 = atyVar.get(i2);
            if (m(abgVar2, objQ, lkVar.z(), lkVar.c(), lkVar.d(), iB)) {
                return abgVar2;
            }
        }
        if (atyVar.isEmpty() && abgVar != null) {
            if (m(abgVar, objQ, lkVar.z(), lkVar.c(), lkVar.d(), iB)) {
                return abgVar;
            }
        }
        return null;
    }

    private final void k(aub<abg, mg> aubVar, abg abgVar, mg mgVar) {
        if (abgVar == null) {
            return;
        }
        if (mgVar.g(abgVar.f19056a) != -1) {
            aubVar.b(abgVar, mgVar);
            return;
        }
        mg mgVar2 = this.f22520c.get(abgVar);
        if (mgVar2 != null) {
            aubVar.b(abgVar, mgVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(com.google.ads.interactivemedia.v3.internal.mg r4) {
        /*
            r3 = this;
            com.google.ads.interactivemedia.v3.internal.aub r0 = com.google.ads.interactivemedia.v3.internal.aud.c()
            com.google.ads.interactivemedia.v3.internal.aty<com.google.ads.interactivemedia.v3.internal.abg> r1 = r3.f22519b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L35
            com.google.ads.interactivemedia.v3.internal.abg r1 = r3.f22522e
            r3.k(r0, r1, r4)
            com.google.ads.interactivemedia.v3.internal.abg r1 = r3.f22523f
            com.google.ads.interactivemedia.v3.internal.abg r2 = r3.f22522e
            boolean r1 = com.google.ads.interactivemedia.v3.internal.auv.w(r1, r2)
            if (r1 != 0) goto L20
            com.google.ads.interactivemedia.v3.internal.abg r1 = r3.f22523f
            r3.k(r0, r1, r4)
        L20:
            com.google.ads.interactivemedia.v3.internal.abg r1 = r3.f22521d
            com.google.ads.interactivemedia.v3.internal.abg r2 = r3.f22522e
            boolean r1 = com.google.ads.interactivemedia.v3.internal.auv.w(r1, r2)
            if (r1 != 0) goto L5b
            com.google.ads.interactivemedia.v3.internal.abg r1 = r3.f22521d
            com.google.ads.interactivemedia.v3.internal.abg r2 = r3.f22523f
            boolean r1 = com.google.ads.interactivemedia.v3.internal.auv.w(r1, r2)
            if (r1 != 0) goto L5b
            goto L56
        L35:
            r1 = 0
        L36:
            com.google.ads.interactivemedia.v3.internal.aty<com.google.ads.interactivemedia.v3.internal.abg> r2 = r3.f22519b
            int r2 = r2.size()
            if (r1 >= r2) goto L4c
            com.google.ads.interactivemedia.v3.internal.aty<com.google.ads.interactivemedia.v3.internal.abg> r2 = r3.f22519b
            java.lang.Object r2 = r2.get(r1)
            com.google.ads.interactivemedia.v3.internal.abg r2 = (com.google.ads.interactivemedia.v3.internal.abg) r2
            r3.k(r0, r2, r4)
            int r1 = r1 + 1
            goto L36
        L4c:
            com.google.ads.interactivemedia.v3.internal.aty<com.google.ads.interactivemedia.v3.internal.abg> r1 = r3.f22519b
            com.google.ads.interactivemedia.v3.internal.abg r2 = r3.f22521d
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L5b
        L56:
            com.google.ads.interactivemedia.v3.internal.abg r1 = r3.f22521d
            r3.k(r0, r1, r4)
        L5b:
            com.google.ads.interactivemedia.v3.internal.aud r4 = r0.a()
            r3.f22520c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.nk.l(com.google.ads.interactivemedia.v3.internal.mg):void");
    }

    private static boolean m(abg abgVar, Object obj, boolean z, int i2, int i3, int i4) {
        if (!abgVar.f19056a.equals(obj)) {
            return false;
        }
        if (z) {
            if (abgVar.f19057b != i2 || abgVar.f19058c != i3) {
                return false;
            }
        } else if (abgVar.f19057b != -1 || abgVar.f19060e != i4) {
            return false;
        }
        return true;
    }

    public final mg a(abg abgVar) {
        return this.f22520c.get(abgVar);
    }

    public final abg b() {
        return this.f22521d;
    }

    public final abg c() {
        if (this.f22519b.isEmpty()) {
            return null;
        }
        return (abg) auv.r(this.f22519b);
    }

    public final abg d() {
        return this.f22522e;
    }

    public final abg e() {
        return this.f22523f;
    }

    public final void g(lk lkVar) {
        this.f22521d = j(lkVar, this.f22519b, this.f22522e, this.f22518a);
    }

    public final void h(List<abg> list, abg abgVar, lk lkVar) {
        this.f22519b = aty.l(list);
        if (!list.isEmpty()) {
            this.f22522e = list.get(0);
            ajr.b(abgVar);
            this.f22523f = abgVar;
        }
        if (this.f22521d == null) {
            this.f22521d = j(lkVar, this.f22519b, this.f22522e, this.f22518a);
        }
        l(lkVar.n());
    }

    public final void i(lk lkVar) {
        this.f22521d = j(lkVar, this.f22519b, this.f22522e, this.f22518a);
        l(lkVar.n());
    }
}

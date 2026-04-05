package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class afx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final afy f19522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ajh f19523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ajh f19524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final agp f19525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri[] f19526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ke[] f19527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ahp f19528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final acr f19529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<ke> f19530i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19532k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IOException f19534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Uri f19535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19536o;
    private aii p;
    private boolean r;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final afr f19531j = new afr();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f19533l = amn.f20140f;
    private long q = -9223372036854775807L;

    public afx(afy afyVar, ahp ahpVar, Uri[] uriArr, ke[] keVarArr, afo afoVar, akq akqVar, agp agpVar, List list) {
        this.f19522a = afyVar;
        this.f19528g = ahpVar;
        this.f19526e = uriArr;
        this.f19527f = keVarArr;
        this.f19525d = agpVar;
        this.f19530i = list;
        ajh ajhVarA = afoVar.a();
        this.f19523b = ajhVarA;
        if (akqVar != null) {
            ajhVarA.e(akqVar);
        }
        this.f19524c = afoVar.a();
        this.f19529h = new acr(keVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            if ((keVarArr[i2].f22149e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        this.p = new afv(this.f19529h, awa.b(arrayList));
    }

    private static Uri o(ahf ahfVar, ahd ahdVar) {
        String str;
        if (ahdVar == null || (str = ahdVar.f19695i) == null) {
            return null;
        }
        return arj.l(ahfVar.s, str);
    }

    private final Pair<Long, Integer> p(afz afzVar, boolean z, ahf ahfVar, long j2, long j3) {
        boolean z2 = true;
        if (afzVar != null && !z) {
            if (!afzVar.j()) {
                return new Pair<>(Long.valueOf(afzVar.f19294l), Integer.valueOf(afzVar.f19542o));
            }
            Long lValueOf = Long.valueOf(afzVar.f19542o == -1 ? afzVar.g() : afzVar.f19294l);
            int i2 = afzVar.f19542o;
            return new Pair<>(lValueOf, Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
        }
        long j4 = ahfVar.q + j2;
        if (afzVar != null && !this.f19536o) {
            j3 = afzVar.f19260i;
        }
        if (!ahfVar.f19715k && j3 >= j4) {
            return new Pair<>(Long.valueOf(ahfVar.f19711g + ((long) ahfVar.f19718n.size())), -1);
        }
        long j5 = j3 - j2;
        List<ahc> list = ahfVar.f19718n;
        Long lValueOf2 = Long.valueOf(j5);
        int i3 = 0;
        if (this.f19528g.t() && afzVar != null) {
            z2 = false;
        }
        int iAi = amn.ai(list, lValueOf2, z2);
        long j6 = ((long) iAi) + ahfVar.f19711g;
        if (iAi >= 0) {
            ahc ahcVar = ahfVar.f19718n.get(iAi);
            List<aha> list2 = j5 < ahcVar.f19693g + ahcVar.f19691e ? ahcVar.f19688b : ahfVar.f19719o;
            while (true) {
                if (i3 >= list2.size()) {
                    break;
                }
                aha ahaVar = list2.get(i3);
                if (j5 >= ahaVar.f19693g + ahaVar.f19691e) {
                    i3++;
                } else if (ahaVar.f19683a) {
                    j6 += list2 == ahfVar.f19719o ? 1L : 0L;
                    i = i3;
                }
            }
        }
        return new Pair<>(Long.valueOf(j6), Integer.valueOf(i));
    }

    private final add q(Uri uri, int i2) {
        if (uri == null) {
            return null;
        }
        byte[] bArrB = this.f19531j.b(uri);
        if (bArrB != null) {
            this.f19531j.c(uri, bArrB);
            return null;
        }
        ajk ajkVar = new ajk();
        ajkVar.f(uri);
        ajkVar.b(1);
        ajl ajlVarA = ajkVar.a();
        ajh ajhVar = this.f19524c;
        ke keVar = this.f19527f[i2];
        int iB = this.p.b();
        this.p.c();
        return new afs(ajhVar, ajlVarA, keVar, iB, this.f19533l);
    }

    public final int a(afz afzVar) {
        if (afzVar.f19542o == -1) {
            return 1;
        }
        ahf ahfVarH = this.f19528g.h(this.f19526e[this.f19529h.a(afzVar.f19257f)], false);
        ajr.b(ahfVarH);
        int i2 = (int) (afzVar.f19294l - ahfVarH.f19711g);
        if (i2 < 0) {
            return 1;
        }
        List<aha> list = i2 < ahfVarH.f19718n.size() ? ahfVarH.f19718n.get(i2).f19688b : ahfVarH.f19719o;
        if (afzVar.f19542o >= list.size()) {
            return 2;
        }
        aha ahaVar = list.get(afzVar.f19542o);
        if (ahaVar.f19684b) {
            return 0;
        }
        return amn.O(Uri.parse(arj.m(ahfVarH.s, ahaVar.f19689c)), afzVar.f19255d.f19897a) ? 1 : 2;
    }

    public final int b(long j2, List<? extends adn> list) {
        return (this.f19534m != null || this.p.n() < 2) ? list.size() : this.p.e(j2, list);
    }

    public final acr c() {
        return this.f19529h;
    }

    public final aii d() {
        return this.p;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r30, long r32, java.util.List<com.google.ads.interactivemedia.v3.internal.afz> r34, boolean r35, com.google.ads.interactivemedia.v3.internal.aft r36) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.afx.e(long, long, java.util.List, boolean, com.google.ads.interactivemedia.v3.internal.aft):void");
    }

    public final void f() {
        IOException iOException = this.f19534m;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f19535n;
        if (uri == null || !this.r) {
            return;
        }
        this.f19528g.l(uri);
    }

    public final void g(add addVar) {
        if (addVar instanceof afs) {
            afs afsVar = (afs) addVar;
            this.f19533l = afsVar.b();
            this.f19531j.c(afsVar.f19255d.f19897a, (byte[]) ajr.b(afsVar.c()));
        }
    }

    public final void h() {
        this.f19534m = null;
    }

    public final void i(boolean z) {
        this.f19532k = z;
    }

    public final void j(aii aiiVar) {
        this.p = aiiVar;
    }

    public final boolean k(add addVar, long j2) {
        aii aiiVar = this.p;
        return aiiVar.r(aiiVar.l(this.f19529h.a(addVar.f19257f)), j2);
    }

    public final boolean l(Uri uri, long j2) {
        int iL;
        int i2 = 0;
        while (true) {
            Uri[] uriArr = this.f19526e;
            if (i2 >= uriArr.length) {
                i2 = -1;
                break;
            }
            if (uriArr[i2].equals(uri)) {
                break;
            }
            i2++;
        }
        if (i2 == -1 || (iL = this.p.l(i2)) == -1) {
            return true;
        }
        this.r = uri.equals(this.f19535n) | this.r;
        return j2 == -9223372036854775807L || this.p.r(iL, j2);
    }

    public final adp[] m(afz afzVar, long j2) {
        int i2;
        List listN;
        int iA = afzVar == null ? -1 : this.f19529h.a(afzVar.f19257f);
        int iN = this.p.n();
        adp[] adpVarArr = new adp[iN];
        boolean z = false;
        int i3 = 0;
        while (i3 < iN) {
            int iJ = this.p.j(i3);
            Uri uri = this.f19526e[iJ];
            if (this.f19528g.v(uri)) {
                ahf ahfVarH = this.f19528g.h(uri, z);
                ajr.b(ahfVarH);
                i2 = i3;
                long jA = ahfVarH.f19708d - this.f19528g.a();
                Pair<Long, Integer> pairP = p(afzVar, iJ != iA, ahfVarH, jA, j2);
                long jLongValue = ((Long) pairP.first).longValue();
                int iIntValue = ((Integer) pairP.second).intValue();
                int i4 = (int) (jLongValue - ahfVarH.f19711g);
                if (i4 < 0 || ahfVarH.f19718n.size() < i4) {
                    listN = aty.n();
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i4 < ahfVarH.f19718n.size()) {
                        if (iIntValue != -1) {
                            ahc ahcVar = ahfVarH.f19718n.get(i4);
                            if (iIntValue == 0) {
                                arrayList.add(ahcVar);
                            } else if (iIntValue < ahcVar.f19688b.size()) {
                                List<aha> list = ahcVar.f19688b;
                                arrayList.addAll(list.subList(iIntValue, list.size()));
                            }
                            i4++;
                        }
                        List<ahc> list2 = ahfVarH.f19718n;
                        arrayList.addAll(list2.subList(i4, list2.size()));
                        iIntValue = 0;
                    }
                    if (ahfVarH.f19714j != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < ahfVarH.f19719o.size()) {
                            List<aha> list3 = ahfVarH.f19719o;
                            arrayList.addAll(list3.subList(iIntValue, list3.size()));
                        }
                    }
                    listN = Collections.unmodifiableList(arrayList);
                }
                adpVarArr[i2] = new afu(jA, listN);
            } else {
                adpVarArr[i3] = adp.f19295a;
                i2 = i3;
            }
            i3 = i2 + 1;
            z = false;
        }
        return adpVarArr;
    }

    public final void n(long j2, add addVar, List<? extends adn> list) {
        if (this.f19534m != null) {
            return;
        }
        this.p.t();
    }
}

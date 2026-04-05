package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aek implements adr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aei[] f19372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final akk f19373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f19374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ajh f19376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f19377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final aeo f19378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private aii f19379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private aer f19380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19381j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private IOException f19382k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19383l;

    public aek(akk akkVar, aer aerVar, int i2, int[] iArr, aii aiiVar, int i3, ajh ajhVar, long j2, boolean z, List list, aeo aeoVar) {
        rj ulVar;
        this.f19373b = akkVar;
        this.f19380i = aerVar;
        this.f19374c = iArr;
        this.f19379h = aiiVar;
        this.f19375d = i3;
        this.f19376e = ajhVar;
        this.f19381j = i2;
        this.f19377f = j2;
        this.f19378g = aeoVar;
        long jD = aerVar.d(i2);
        ArrayList<afb> arrayListL = l();
        this.f19372a = new aei[aiiVar.n()];
        int i4 = 0;
        while (i4 < this.f19372a.length) {
            afb afbVar = arrayListL.get(aiiVar.j(i4));
            aei[] aeiVarArr = this.f19372a;
            ke keVar = afbVar.f19467b;
            String str = keVar.f22155k;
            adc adcVar = null;
            if (alo.o(str)) {
                if ("application/x-rawcc".equals(str)) {
                    ulVar = new vo(keVar);
                } else {
                    int i5 = i4;
                    aeiVarArr[i5] = new aei(jD, afbVar, adcVar, 0L, afbVar.k());
                    i4 = i5 + 1;
                }
            } else if (alo.n(str)) {
                ulVar = new tm(1);
            } else {
                ulVar = new ul(true != z ? 0 : 4, null, list, aeoVar);
                adcVar = new adc(ulVar, i3, keVar);
                int i52 = i4;
                aeiVarArr[i52] = new aei(jD, afbVar, adcVar, 0L, afbVar.k());
                i4 = i52 + 1;
            }
            adcVar = new adc(ulVar, i3, keVar);
            int i522 = i4;
            aeiVarArr[i522] = new aei(jD, afbVar, adcVar, 0L, afbVar.k());
            i4 = i522 + 1;
        }
    }

    private final long k(long j2) {
        aer aerVar = this.f19380i;
        long j3 = aerVar.f19415a;
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 - iw.b(j3 + aerVar.e(this.f19381j).f19448b);
    }

    private final ArrayList<afb> l() {
        List<aeq> list = this.f19380i.e(this.f19381j).f19449c;
        ArrayList<afb> arrayList = new ArrayList<>();
        for (int i2 : this.f19374c) {
            arrayList.addAll(list.get(i2).f19411c);
        }
        return arrayList;
    }

    private static final long m(aei aeiVar, adn adnVar, long j2, long j3, long j4) {
        return adnVar != null ? adnVar.g() : amn.k(aeiVar.g(j2), j3, j4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adj
    public final int a(long j2, List<? extends adn> list) {
        return (this.f19382k != null || this.f19379h.n() < 2) ? list.size() : this.f19379h.e(j2, list);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adj
    public final long b(long j2, lt ltVar) {
        for (aei aeiVar : this.f19372a) {
            if (aeiVar.f19368c != null) {
                long jG = aeiVar.g(j2);
                long jH = aeiVar.h(jG);
                long jE = aeiVar.e();
                return ltVar.a(j2, jH, (jH >= j2 || (jE != -1 && jG >= (aeiVar.c() + jE) + (-1))) ? jH : aeiVar.h(jG + 1));
            }
        }
        return j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adj
    public final void c(long j2, long j3, List<? extends adn> list, adf adfVar) {
        add adkVar;
        int i2;
        long j4;
        adp[] adpVarArr;
        int i3;
        if (this.f19382k != null) {
            return;
        }
        long j5 = j3 - j2;
        long jB = iw.b(this.f19380i.f19415a) + iw.b(this.f19380i.e(this.f19381j).f19448b) + j3;
        aeo aeoVar = this.f19378g;
        if (aeoVar == null || !aeoVar.f19394a.f(jB)) {
            long jB2 = iw.b(amn.m(this.f19377f));
            long jK = k(jB2);
            adn adnVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int iN = this.f19379h.n();
            adp[] adpVarArr2 = new adp[iN];
            int i4 = 0;
            while (i4 < iN) {
                aei aeiVar = this.f19372a[i4];
                if (aeiVar.f19368c == null) {
                    adpVarArr2[i4] = adp.f19295a;
                    i2 = i4;
                    i3 = iN;
                    j4 = jK;
                    adpVarArr = adpVarArr2;
                } else {
                    long jB3 = aeiVar.b(jB2);
                    long jD = aeiVar.d(jB2);
                    i2 = i4;
                    j4 = jK;
                    adpVarArr = adpVarArr2;
                    i3 = iN;
                    long jM = m(aeiVar, adnVar, j3, jB3, jD);
                    if (jM < jB3) {
                        adpVarArr[i2] = adp.f19295a;
                    } else {
                        adpVarArr[i2] = new aej(aeiVar, jM, jD);
                    }
                }
                i4 = i2 + 1;
                adpVarArr2 = adpVarArr;
                jK = j4;
                iN = i3;
            }
            long j6 = jK;
            this.f19379h.d(j5, !this.f19380i.f19418d ? -9223372036854775807L : Math.max(0L, Math.min(k(jB2), this.f19372a[0].f(this.f19372a[0].d(jB2))) - j2), list, adpVarArr2);
            aei aeiVar2 = this.f19372a[this.f19379h.a()];
            ade adeVar = aeiVar2.f19366a;
            if (adeVar != null) {
                afb afbVar = aeiVar2.f19367b;
                aey aeyVarN = adeVar.g() == null ? afbVar.n() : null;
                aey aeyVarL = aeiVar2.f19368c == null ? afbVar.l() : null;
                if (aeyVarN != null || aeyVarL != null) {
                    ajh ajhVar = this.f19376e;
                    ke keVarP = this.f19379h.p();
                    int iB = this.f19379h.b();
                    this.f19379h.c();
                    afb afbVar2 = aeiVar2.f19367b;
                    if (aeyVarN == null || (aeyVarL = aeyVarN.b(aeyVarL, afbVar2.f19468c)) != null) {
                        aeyVarN = aeyVarL;
                    }
                    adfVar.f19263a = new adm(ajhVar, agg.a(afbVar2, aeyVarN, 0), keVarP, iB, aeiVar2.f19366a);
                    return;
                }
            }
            long j7 = aeiVar2.f19369d;
            boolean z = j7 != -9223372036854775807L;
            if (aeiVar2.e() == 0) {
                adfVar.f19264b = z;
                return;
            }
            long jB4 = aeiVar2.b(jB2);
            long jD2 = aeiVar2.d(jB2);
            boolean z2 = z;
            long jM2 = m(aeiVar2, adnVar, j3, jB4, jD2);
            if (jM2 < jB4) {
                this.f19382k = new aad();
                return;
            }
            if (jM2 > jD2 || (this.f19383l && jM2 >= jD2)) {
                adfVar.f19264b = z2;
                return;
            }
            if (z2 && aeiVar2.h(jM2) >= j7) {
                adfVar.f19264b = true;
                return;
            }
            int iMin = (int) Math.min(1L, (jD2 - jM2) + 1);
            if (j7 != -9223372036854775807L) {
                while (iMin > 1 && aeiVar2.h((((long) iMin) + jM2) - 1) >= j7) {
                    iMin--;
                }
            }
            long j8 = true != list.isEmpty() ? -9223372036854775807L : j3;
            ajh ajhVar2 = this.f19376e;
            int i5 = this.f19375d;
            ke keVarP2 = this.f19379h.p();
            int iB2 = this.f19379h.b();
            this.f19379h.c();
            afb afbVar3 = aeiVar2.f19367b;
            long jH = aeiVar2.h(jM2);
            aey aeyVarK = aeiVar2.k(jM2);
            String str = afbVar3.f19468c;
            if (aeiVar2.f19366a == null) {
                adkVar = new adq(ajhVar2, agg.a(afbVar3, aeyVarK, true != aeiVar2.l(jM2, j6) ? 8 : 0), keVarP2, iB2, jH, aeiVar2.f(jM2), jM2, i5, keVarP2);
            } else {
                int i6 = 1;
                int i7 = 1;
                while (i6 < iMin) {
                    aey aeyVarB = aeyVarK.b(aeiVar2.k(((long) i6) + jM2), str);
                    if (aeyVarB == null) {
                        break;
                    }
                    i7++;
                    i6++;
                    aeyVarK = aeyVarB;
                }
                long j9 = (((long) i7) + jM2) - 1;
                long jF = aeiVar2.f(j9);
                long j10 = aeiVar2.f19369d;
                adkVar = new adk(ajhVar2, agg.a(afbVar3, aeyVarK, true != aeiVar2.l(j9, j6) ? 8 : 0), keVarP2, iB2, jH, jF, j8, (j10 == -9223372036854775807L || j10 > jF) ? -9223372036854775807L : j10, jM2, i7, -afbVar3.f19469d, aeiVar2.f19366a);
            }
            adfVar.f19263a = adkVar;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adj
    public final void d() throws IOException {
        IOException iOException = this.f19382k;
        if (iOException != null) {
            throw iOException;
        }
        this.f19373b.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adj
    public final void e(add addVar) {
        re reVarD;
        if (addVar instanceof adm) {
            int iM = this.f19379h.m(((adm) addVar).f19257f);
            aei aeiVar = this.f19372a[iM];
            if (aeiVar.f19368c == null && (reVarD = aeiVar.f19366a.d()) != null) {
                this.f19372a[iM] = aeiVar.j(new aeg(reVarD, aeiVar.f19367b.f19469d));
            }
        }
        aeo aeoVar = this.f19378g;
        if (aeoVar != null) {
            aeoVar.g(addVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adj
    public final void f() {
        for (aei aeiVar : this.f19372a) {
            ade adeVar = aeiVar.f19366a;
            if (adeVar != null) {
                adeVar.e();
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adj
    public final boolean g(add addVar, boolean z, Exception exc, long j2) {
        if (!z) {
            return false;
        }
        aeo aeoVar = this.f19378g;
        if (aeoVar != null && aeoVar.i(addVar)) {
            return true;
        }
        if (!this.f19380i.f19418d && (addVar instanceof adn) && (exc instanceof ajy) && ((ajy) exc).f19959a == 404) {
            long jE = this.f19372a[this.f19379h.m(addVar.f19257f)].e();
            if (jE != -1 && jE != 0) {
                if (((adn) addVar).g() > (r10.c() + jE) - 1) {
                    this.f19383l = true;
                    return true;
                }
            }
        }
        if (j2 != -9223372036854775807L) {
            aii aiiVar = this.f19379h;
            if (aiiVar.r(aiiVar.m(addVar.f19257f), j2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adj
    public final void h(long j2, add addVar, List<? extends adn> list) {
        if (this.f19382k != null) {
            return;
        }
        this.f19379h.t();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void i(aer aerVar, int i2) {
        try {
            this.f19380i = aerVar;
            this.f19381j = i2;
            long jD = aerVar.d(i2);
            ArrayList<afb> arrayListL = l();
            for (int i3 = 0; i3 < this.f19372a.length; i3++) {
                afb afbVar = arrayListL.get(this.f19379h.j(i3));
                aei[] aeiVarArr = this.f19372a;
                aeiVarArr[i3] = aeiVarArr[i3].i(jD, afbVar);
            }
        } catch (aad e2) {
            this.f19382k = e2;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void j(aii aiiVar) {
        this.f19379h = aiiVar;
    }
}

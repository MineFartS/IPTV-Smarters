package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class adu implements abe, acl, adh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f19306b = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f19307c = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19308a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final akq f19309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qq f19310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f19311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final akk f19312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final act f19313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final adt[] f19314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final aep f19315j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final abo f19317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final qk f19318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private abd f19319n;
    private aer r;
    private int s;
    private List<aev> t;
    private final aeh u;
    private final ajm v;
    private final ajr w;
    private final awa x;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private adi<adr>[] f19320o = new adi[0];
    private ael[] p = new ael[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IdentityHashMap<adi<adr>, aeo> f19316k = new IdentityHashMap<>();
    private acm q = awa.e(this.f19320o);

    public adu(int i2, aer aerVar, int i3, aeh aehVar, akq akqVar, qq qqVar, qk qkVar, ajr ajrVar, abo aboVar, long j2, akk akkVar, ajm ajmVar, awa awaVar, aen aenVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int[][] iArr;
        List<aeq> list;
        int i4;
        int i5;
        boolean[] zArr;
        ke[] keVarArrU;
        ke keVarS;
        Pattern pattern;
        aeu aeuVarS;
        qq qqVar2 = qqVar;
        this.f19308a = i2;
        this.r = aerVar;
        this.s = i3;
        this.u = aehVar;
        this.f19309d = akqVar;
        this.f19310e = qqVar2;
        this.f19318m = qkVar;
        this.w = ajrVar;
        this.f19317l = aboVar;
        this.f19311f = j2;
        this.f19312g = akkVar;
        this.v = ajmVar;
        this.x = awaVar;
        this.f19315j = new aep(aerVar, aenVar, ajmVar);
        int i6 = 0;
        aew aewVarE = aerVar.e(i3);
        List<aev> list2 = aewVarE.f19450d;
        this.t = list2;
        List<aeq> list3 = aewVarE.f19449c;
        int size = list3.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            sparseIntArray.put(list3.get(i7).f19409a, i7);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i7));
            arrayList.add(arrayList2);
            sparseArray.put(i7, arrayList2);
        }
        for (int i8 = 0; i8 < size; i8++) {
            aeq aeqVar = list3.get(i8);
            aeu aeuVarT = t(aeqVar.f19413e);
            aeuVarT = aeuVarT == null ? t(aeqVar.f19414f) : aeuVarT;
            int iMin = (aeuVarT == null || (iMin = sparseIntArray.get(Integer.parseInt(aeuVarT.f19441b), -1)) == -1) ? i8 : iMin;
            if (iMin == i8 && (aeuVarS = s(aeqVar.f19414f, "urn:mpeg:dash:adaptation-set-switching:2016")) != null) {
                for (String str : amn.ad(aeuVarS.f19441b, ",")) {
                    int i9 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i9 != -1) {
                        iMin = Math.min(iMin, i9);
                    }
                }
            }
            if (iMin != i8) {
                List list4 = (List) sparseArray.get(i8);
                List list5 = (List) sparseArray.get(iMin);
                list5.addAll(list4);
                sparseArray.put(i8, list5);
                arrayList.remove(list4);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i10 = 0; i10 < size2; i10++) {
            int[] iArrB = awa.b((Collection) arrayList.get(i10));
            iArr2[i10] = iArrB;
            Arrays.sort(iArrB);
        }
        boolean[] zArr2 = new boolean[size2];
        ke[][] keVarArr = new ke[size2][];
        int i11 = 0;
        int i12 = 0;
        while (i11 < size2) {
            int[] iArr3 = iArr2[i11];
            int length = iArr3.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                List<afb> list6 = list3.get(iArr3[i13]).f19411c;
                while (i6 < list6.size()) {
                    if (!list6.get(i6).f19470e.isEmpty()) {
                        zArr2[i11] = true;
                        i12++;
                        break;
                    }
                    i6++;
                }
                i13++;
                i6 = 0;
            }
            int[] iArr4 = iArr2[i11];
            int length2 = iArr4.length;
            int i14 = 0;
            while (i14 < length2) {
                int i15 = iArr4[i14];
                aeq aeqVar2 = list3.get(i15);
                List<aeu> list7 = list3.get(i15).f19412d;
                int[] iArr5 = iArr4;
                int i16 = 0;
                while (i16 < list7.size()) {
                    aeu aeuVar = list7.get(i16);
                    int i17 = length2;
                    List<aeu> list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(aeuVar.f19440a)) {
                        kd kdVar = new kd();
                        kdVar.ae("application/cea-608");
                        int i18 = aeqVar2.f19409a;
                        StringBuilder sb = new StringBuilder(18);
                        sb.append(i18);
                        sb.append(":cea608");
                        kdVar.S(sb.toString());
                        keVarS = kdVar.s();
                        pattern = f19306b;
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(aeuVar.f19440a)) {
                        kd kdVar2 = new kd();
                        kdVar2.ae("application/cea-708");
                        int i19 = aeqVar2.f19409a;
                        StringBuilder sb2 = new StringBuilder(18);
                        sb2.append(i19);
                        sb2.append(":cea708");
                        kdVar2.S(sb2.toString());
                        keVarS = kdVar2.s();
                        pattern = f19307c;
                    } else {
                        i16++;
                        length2 = i17;
                        list7 = list8;
                    }
                    keVarArrU = u(aeuVar, pattern, keVarS);
                }
                i14++;
                iArr4 = iArr5;
            }
            keVarArrU = new ke[0];
            keVarArr[i11] = keVarArrU;
            if (keVarArrU.length != 0) {
                i12++;
            }
            i11++;
            i6 = 0;
        }
        int size3 = i12 + size2 + list2.size();
        acr[] acrVarArr = new acr[size3];
        adt[] adtVarArr = new adt[size3];
        int i20 = 0;
        int i21 = 0;
        while (i20 < size2) {
            int[] iArr6 = iArr2[i20];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr6.length;
            int i22 = size2;
            int i23 = 0;
            while (true) {
                iArr = iArr2;
                if (i23 >= length3) {
                    break;
                }
                arrayList3.addAll(list3.get(iArr6[i23]).f19411c);
                i23++;
                iArr2 = iArr;
            }
            int size4 = arrayList3.size();
            ke[] keVarArr2 = new ke[size4];
            int i24 = 0;
            while (i24 < size4) {
                int i25 = size4;
                ke keVar = ((afb) arrayList3.get(i24)).f19467b;
                keVarArr2[i24] = keVar.c(qqVar2.c(keVar));
                i24++;
                size4 = i25;
                arrayList3 = arrayList3;
            }
            aeq aeqVar3 = list3.get(iArr6[0]);
            int i26 = i21 + 1;
            if (zArr2[i20]) {
                list = list3;
                i4 = i26;
                i26++;
            } else {
                list = list3;
                i4 = -1;
            }
            if (keVarArr[i20].length != 0) {
                int i27 = i26;
                i26++;
                i5 = i27;
            } else {
                i5 = -1;
            }
            acrVarArr[i21] = new acr(keVarArr2);
            adtVarArr[i21] = adt.d(aeqVar3.f19410b, iArr6, i21, i4, i5);
            int i28 = -1;
            if (i4 != -1) {
                kd kdVar3 = new kd();
                int i29 = aeqVar3.f19409a;
                zArr = zArr2;
                StringBuilder sb3 = new StringBuilder(16);
                sb3.append(i29);
                sb3.append(":emsg");
                kdVar3.S(sb3.toString());
                kdVar3.ae("application/x-emsg");
                acrVarArr[i4] = new acr(kdVar3.s());
                adtVarArr[i4] = adt.b(iArr6, i21);
                i28 = -1;
            } else {
                zArr = zArr2;
            }
            if (i5 != i28) {
                acrVarArr[i5] = new acr(keVarArr[i20]);
                adtVarArr[i5] = adt.a(iArr6, i21);
            }
            i20++;
            size2 = i22;
            iArr2 = iArr;
            qqVar2 = qqVar;
            zArr2 = zArr;
            i21 = i26;
            list3 = list;
        }
        int i30 = 0;
        while (i30 < list2.size()) {
            aev aevVar = list2.get(i30);
            kd kdVar4 = new kd();
            kdVar4.S(aevVar.a());
            kdVar4.ae("application/x-emsg");
            acrVarArr[i21] = new acr(kdVar4.s());
            adtVarArr[i21] = adt.c(i30);
            i30++;
            i21++;
        }
        Pair pairCreate = Pair.create(new act(acrVarArr), adtVarArr);
        this.f19313h = (act) pairCreate.first;
        this.f19314i = (adt[]) pairCreate.second;
    }

    private final int r(int i2, int[] iArr) {
        int i3 = iArr[i2];
        if (i3 == -1) {
            return -1;
        }
        int i4 = this.f19314i[i3].f19303e;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 == i4 && this.f19314i[i6].f19301c == 0) {
                return i5;
            }
        }
        return -1;
    }

    private static aeu s(List<aeu> list, String str) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            aeu aeuVar = list.get(i2);
            if (str.equals(aeuVar.f19440a)) {
                return aeuVar;
            }
        }
        return null;
    }

    private static aeu t(List<aeu> list) {
        return s(list, "http://dashif.org/guidelines/trickmode");
    }

    private static ke[] u(aeu aeuVar, Pattern pattern, ke keVar) {
        String str = aeuVar.f19441b;
        if (str == null) {
            return new ke[]{keVar};
        }
        String[] strArrAd = amn.ad(str, ";");
        ke[] keVarArr = new ke[strArrAd.length];
        for (int i2 = 0; i2 < strArrAd.length; i2++) {
            Matcher matcher = pattern.matcher(strArrAd[i2]);
            if (!matcher.matches()) {
                return new ke[]{keVar};
            }
            int i3 = Integer.parseInt(matcher.group(1));
            kd kdVarB = keVar.b();
            String str2 = keVar.f22145a;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
            sb.append(str2);
            sb.append(":");
            sb.append(i3);
            kdVarB.S(sb.toString());
            kdVarB.F(i3);
            kdVarB.V(matcher.group(2));
            keVarArr[i2] = kdVarB.s();
        }
        return keVarArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long a(long j2, lt ltVar) {
        for (adi<adr> adiVar : this.f19320o) {
            if (adiVar.f19270a == 2) {
                return adiVar.g(j2, ltVar);
            }
        }
        return j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final long bc() {
        return this.q.bc();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final long c() {
        return this.q.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long d() {
        return -9223372036854775807L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long e(long j2) {
        for (adi<adr> adiVar : this.f19320o) {
            adiVar.o(j2);
        }
        for (ael aelVar : this.p) {
            aelVar.f(j2);
        }
        return j2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.ads.interactivemedia.v3.internal.adj, com.google.ads.interactivemedia.v3.internal.adr] */
    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long f(aii[] aiiVarArr, boolean[] zArr, ack[] ackVarArr, boolean[] zArr2, long j2) {
        int i2;
        boolean z;
        int[] iArr;
        int i3;
        int[] iArr2;
        adu aduVar;
        acr acrVarB;
        int i4;
        acr acrVarB2;
        int i5;
        adu aduVar2 = this;
        aii[] aiiVarArr2 = aiiVarArr;
        int[] iArr3 = new int[aiiVarArr2.length];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = -1;
            if (i7 >= aiiVarArr2.length) {
                break;
            }
            aii aiiVar = aiiVarArr2[i7];
            if (aiiVar != null) {
                iArr3[i7] = aduVar2.f19313h.a(aiiVar.q());
            } else {
                iArr3[i7] = -1;
            }
            i7++;
        }
        for (int i8 = 0; i8 < aiiVarArr2.length; i8++) {
            if (aiiVarArr2[i8] == null || !zArr[i8]) {
                ack ackVar = ackVarArr[i8];
                if (ackVar instanceof adi) {
                    ((adi) ackVar).k(aduVar2);
                } else if (ackVar instanceof adg) {
                    ((adg) ackVar).c();
                }
                ackVarArr[i8] = null;
            }
        }
        int i9 = 0;
        while (true) {
            z = true;
            boolean z2 = true;
            if (i9 >= aiiVarArr2.length) {
                break;
            }
            ack ackVar2 = ackVarArr[i9];
            if ((ackVar2 instanceof aat) || (ackVar2 instanceof adg)) {
                int iR = aduVar2.r(i9, iArr3);
                if (iR == -1) {
                    z2 = ackVarArr[i9] instanceof aat;
                } else {
                    ack ackVar3 = ackVarArr[i9];
                    if (!(ackVar3 instanceof adg) || ((adg) ackVar3).f19265a != ackVarArr[iR]) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    ack ackVar4 = ackVarArr[i9];
                    if (ackVar4 instanceof adg) {
                        ((adg) ackVar4).c();
                    }
                    ackVarArr[i9] = null;
                }
            }
            i9++;
        }
        int i10 = 0;
        while (i10 < aiiVarArr2.length) {
            aii aiiVar2 = aiiVarArr2[i10];
            if (aiiVar2 == null) {
                i3 = i10;
                iArr2 = iArr3;
                aduVar = aduVar2;
            } else {
                ack ackVar5 = ackVarArr[i10];
                if (ackVar5 == null) {
                    zArr2[i10] = z;
                    adt adtVar = aduVar2.f19314i[iArr3[i10]];
                    int i11 = adtVar.f19301c;
                    if (i11 == 0) {
                        int i12 = adtVar.f19304f;
                        boolean z3 = i12 != i2;
                        if (z3) {
                            acrVarB = aduVar2.f19313h.b(i12);
                            i4 = 1;
                        } else {
                            acrVarB = null;
                            i4 = 0;
                        }
                        int i13 = adtVar.f19305g;
                        if (i13 != i2) {
                            acrVarB2 = aduVar2.f19313h.b(i13);
                            i4 += acrVarB2.f19202a;
                        } else {
                            acrVarB2 = null;
                        }
                        ke[] keVarArr = new ke[i4];
                        int[] iArr4 = new int[i4];
                        if (z3) {
                            keVarArr[i6] = acrVarB.b(i6);
                            iArr4[i6] = 5;
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (i13 != i2) {
                            for (int i14 = 0; i14 < acrVarB2.f19202a; i14++) {
                                ke keVarB = acrVarB2.b(i14);
                                keVarArr[i5] = keVarB;
                                iArr4[i5] = 3;
                                arrayList.add(keVarB);
                                i5 += z ? 1 : 0;
                            }
                        }
                        aeo aeoVarC = (aduVar2.r.f19418d && z3) ? aduVar2.f19315j.c() : null;
                        i3 = i10;
                        aeo aeoVar = aeoVarC;
                        iArr2 = iArr3;
                        adi<adr> adiVar = new adi<>(adtVar.f19300b, iArr4, keVarArr, aduVar2.u.a(aduVar2.f19312g, aduVar2.r, aduVar2.s, adtVar.f19299a, aiiVar2, adtVar.f19300b, aduVar2.f19311f, z3, arrayList, aeoVarC, aduVar2.f19309d), this, aduVar2.v, j2, aduVar2.f19310e, aduVar2.f19318m, aduVar2.w, aduVar2.f19317l, null, null, null);
                        aduVar = this;
                        synchronized (this) {
                            aduVar.f19316k.put(adiVar, aeoVar);
                        }
                        ackVarArr[i3] = adiVar;
                    } else {
                        i3 = i10;
                        iArr2 = iArr3;
                        aduVar = aduVar2;
                        if (i11 == 2) {
                            ackVarArr[i3] = new ael(aduVar.t.get(adtVar.f19302d), aiiVar2.q().b(0), aduVar.r.f19418d);
                        }
                    }
                } else {
                    i3 = i10;
                    iArr2 = iArr3;
                    aduVar = aduVar2;
                    if (ackVar5 instanceof adi) {
                        ((adi) ackVar5).j().j(aiiVar2);
                    }
                }
                i10 = i3 + 1;
                aiiVarArr2 = aiiVarArr;
                aduVar2 = aduVar;
                iArr3 = iArr2;
                z = true;
                i2 = -1;
                i6 = 0;
            }
            i10 = i3 + 1;
            aiiVarArr2 = aiiVarArr;
            aduVar2 = aduVar;
            iArr3 = iArr2;
            z = true;
            i2 = -1;
            i6 = 0;
        }
        int[] iArr5 = iArr3;
        adu aduVar3 = aduVar2;
        int i15 = 0;
        while (i15 < aiiVarArr.length) {
            if (ackVarArr[i15] != null || aiiVarArr[i15] == null) {
                iArr = iArr5;
            } else {
                iArr = iArr5;
                adt adtVar2 = aduVar3.f19314i[iArr[i15]];
                if (adtVar2.f19301c == 1) {
                    int iR2 = aduVar3.r(i15, iArr);
                    if (iR2 == -1) {
                        ackVarArr[i15] = new aat();
                    } else {
                        ackVarArr[i15] = ((adi) ackVarArr[iR2]).i(j2, adtVar2.f19300b);
                    }
                    i15++;
                    iArr5 = iArr;
                }
            }
            i15++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i16 = 0; i16 < 2; i16++) {
            ack ackVar6 = ackVarArr[i16];
            if (ackVar6 instanceof adi) {
                arrayList2.add((adi) ackVar6);
            } else if (ackVar6 instanceof ael) {
                arrayList3.add((ael) ackVar6);
            }
        }
        adi<adr>[] adiVarArr = new adi[arrayList2.size()];
        aduVar3.f19320o = adiVarArr;
        arrayList2.toArray(adiVarArr);
        ael[] aelVarArr = new ael[arrayList3.size()];
        aduVar3.p = aelVarArr;
        arrayList3.toArray(aelVarArr);
        aduVar3.q = awa.e(aduVar3.f19320o);
        return j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acl
    public final /* bridge */ /* synthetic */ void g(acm acmVar) {
        this.f19319n.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final act h() {
        return this.f19313h;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adh
    public final synchronized void i(adi<adr> adiVar) {
        aeo aeoVarRemove = this.f19316k.remove(adiVar);
        if (aeoVarRemove != null) {
            aeoVarRemove.h();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final void j() {
        this.f19312g.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final void k(abd abdVar, long j2) {
        this.f19319n = abdVar;
        abdVar.i(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final void l(long j2) {
        this.q.l(j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final boolean m(long j2) {
        return this.q.m(j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final boolean n() {
        return this.q.n();
    }

    public final void o() {
        this.f19315j.d();
        for (adi<adr> adiVar : this.f19320o) {
            adiVar.k(this);
        }
        this.f19319n = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final void p(long j2) {
        for (adi<adr> adiVar : this.f19320o) {
            adiVar.t(j2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.ads.interactivemedia.v3.internal.adj, com.google.ads.interactivemedia.v3.internal.adr] */
    public final void q(aer aerVar, int i2) {
        this.r = aerVar;
        this.s = i2;
        this.f19315j.e(aerVar);
        adi<adr>[] adiVarArr = this.f19320o;
        if (adiVarArr != null) {
            for (adi<adr> adiVar : adiVarArr) {
                adiVar.j().i(aerVar, i2);
            }
            this.f19319n.g(this);
        }
        this.t = aerVar.e(i2).f19450d;
        for (ael aelVar : this.p) {
            Iterator<aev> it = this.t.iterator();
            while (true) {
                if (it.hasNext()) {
                    aev next = it.next();
                    if (next.a().equals(aelVar.c())) {
                        aelVar.g(next, aerVar.f19418d && i2 == aerVar.b() + (-1));
                    }
                }
            }
        }
    }
}

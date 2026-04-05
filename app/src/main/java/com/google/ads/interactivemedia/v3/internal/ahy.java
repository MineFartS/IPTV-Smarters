package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ahy implements Comparable<ahy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aia f19764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f19770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f19771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f19772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f19773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f19774m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f19775n;

    public ahy(ke keVar, aia aiaVar, int i2) {
        int i3;
        int iA;
        int iA2;
        this.f19764c = aiaVar;
        this.f19763b = aig.d(keVar.f22147c);
        int i4 = 0;
        this.f19765d = aig.e(i2, false);
        int i5 = 0;
        while (true) {
            i3 = Integer.MAX_VALUE;
            if (i5 >= aiaVar.D.size()) {
                i5 = Integer.MAX_VALUE;
                iA = 0;
                break;
            } else {
                iA = aig.a(keVar, aiaVar.D.get(i5), false);
                if (iA > 0) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        this.f19767f = i5;
        this.f19766e = iA;
        this.f19768g = Integer.bitCount(keVar.f22149e & aiaVar.E);
        boolean z = true;
        this.f19771j = 1 == (keVar.f22148d & 1);
        int i6 = keVar.y;
        this.f19772k = i6;
        this.f19773l = keVar.z;
        int i7 = keVar.f22152h;
        this.f19774m = i7;
        if ((i7 != -1 && i7 > aiaVar.r) || (i6 != -1 && i6 > aiaVar.q)) {
            z = false;
        }
        this.f19762a = z;
        String[] strArrAc = amn.ac();
        int i8 = 0;
        while (true) {
            if (i8 >= strArrAc.length) {
                i8 = Integer.MAX_VALUE;
                iA2 = 0;
                break;
            } else {
                iA2 = aig.a(keVar, strArrAc[i8], false);
                if (iA2 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f19769h = i8;
        this.f19770i = iA2;
        while (true) {
            if (i4 < aiaVar.w.size()) {
                String str = keVar.f22156l;
                if (str != null && str.equals(aiaVar.w.get(i4))) {
                    i3 = i4;
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        this.f19775n = i3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ahy ahyVar) {
        ave aveVarA = (this.f19762a && this.f19765d) ? aig.f19829c : aig.f19829c.a();
        ate ateVarC = ate.j().d(this.f19765d, ahyVar.f19765d).c(Integer.valueOf(this.f19767f), Integer.valueOf(ahyVar.f19767f), ave.c().a()).b(this.f19766e, ahyVar.f19766e).b(this.f19768g, ahyVar.f19768g).d(this.f19762a, ahyVar.f19762a).c(Integer.valueOf(this.f19775n), Integer.valueOf(ahyVar.f19775n), ave.c().a()).c(Integer.valueOf(this.f19774m), Integer.valueOf(ahyVar.f19774m), this.f19764c.x ? aig.f19829c.a() : aig.f19830d).d(this.f19771j, ahyVar.f19771j).c(Integer.valueOf(this.f19769h), Integer.valueOf(ahyVar.f19769h), ave.c().a()).b(this.f19770i, ahyVar.f19770i).c(Integer.valueOf(this.f19772k), Integer.valueOf(ahyVar.f19772k), aveVarA).c(Integer.valueOf(this.f19773l), Integer.valueOf(ahyVar.f19773l), aveVarA);
        Integer numValueOf = Integer.valueOf(this.f19774m);
        Integer numValueOf2 = Integer.valueOf(ahyVar.f19774m);
        if (!amn.O(this.f19763b, ahyVar.f19763b)) {
            aveVarA = aig.f19830d;
        }
        return ateVarC.c(numValueOf, numValueOf2, aveVarA).a();
    }
}

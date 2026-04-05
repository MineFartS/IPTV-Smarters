package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class aie implements Comparable<aie> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f19819i;

    public aie(ke keVar, aia aiaVar, int i2, String str) {
        int iA;
        boolean z = false;
        this.f19812b = aig.e(i2, false);
        int i3 = keVar.f22148d & (aiaVar.I ^ (-1));
        this.f19813c = 1 == (i3 & 1);
        this.f19814d = (i3 & 2) != 0;
        aty<String> atyVarO = aiaVar.F.isEmpty() ? aty.o(BuildConfig.FLAVOR) : aiaVar.F;
        int i4 = 0;
        while (true) {
            if (i4 >= atyVarO.size()) {
                i4 = Integer.MAX_VALUE;
                iA = 0;
                break;
            } else {
                iA = aig.a(keVar, atyVarO.get(i4), aiaVar.H);
                if (iA > 0) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        this.f19815e = i4;
        this.f19816f = iA;
        int iBitCount = Integer.bitCount(keVar.f22149e & aiaVar.G);
        this.f19817g = iBitCount;
        this.f19819i = (keVar.f22149e & 1088) != 0;
        int iA2 = aig.a(keVar, str, aig.d(str) == null);
        this.f19818h = iA2;
        if (iA > 0 || ((aiaVar.F.isEmpty() && iBitCount > 0) || this.f19813c || (this.f19814d && iA2 > 0))) {
            z = true;
        }
        this.f19811a = z;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(aie aieVar) {
        ate ateVarB = ate.j().d(this.f19812b, aieVar.f19812b).c(Integer.valueOf(this.f19815e), Integer.valueOf(aieVar.f19815e), ave.c().a()).b(this.f19816f, aieVar.f19816f).b(this.f19817g, aieVar.f19817g).d(this.f19813c, aieVar.f19813c).c(Boolean.valueOf(this.f19814d), Boolean.valueOf(aieVar.f19814d), this.f19816f == 0 ? ave.c() : ave.c().a()).b(this.f19818h, aieVar.f19818h);
        if (this.f19817g == 0) {
            ateVarB = ateVarB.e(this.f19819i, aieVar.f19819i);
        }
        return ateVarB.a();
    }
}

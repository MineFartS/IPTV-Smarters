package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wh implements vz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ww f23521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23523c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f23527g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f23529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private sf f23530j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private wg f23531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f23533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f23534n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f23528h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wn f23524d = new wn(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wn f23525e = new wn(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wn f23526f = new wn(6);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final alx f23535o = new alx();

    public wh(ww wwVar, boolean z, boolean z2) {
        this.f23521a = wwVar;
        this.f23522b = z;
        this.f23523c = z2;
    }

    private final void f(byte[] bArr, int i2, int i3) {
        if (!this.f23532l || this.f23531k.g()) {
            this.f23524d.a(bArr, i2, i3);
            this.f23525e.a(bArr, i2, i3);
        }
        this.f23526f.a(bArr, i2, i3);
        this.f23531k.a(bArr, i2, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void a(alx alxVar) {
        wn wnVar;
        ajr.c(this.f23530j);
        int i2 = amn.f20135a;
        int iC = alxVar.c();
        int iD = alxVar.d();
        byte[] bArrK = alxVar.K();
        this.f23527g += (long) alxVar.a();
        this.f23530j.c(alxVar, alxVar.a());
        while (true) {
            int iA = alr.a(bArrK, iC, iD, this.f23528h);
            if (iA == iD) {
                f(bArrK, iC, iD);
                return;
            }
            int i3 = iA + 3;
            int i4 = bArrK[i3] & 31;
            int i5 = iA - iC;
            if (i5 > 0) {
                f(bArrK, iC, iA);
            }
            int i6 = iD - iA;
            long j2 = this.f23527g - ((long) i6);
            int i7 = i5 < 0 ? -i5 : 0;
            long j3 = this.f23533m;
            if (!this.f23532l || this.f23531k.g()) {
                this.f23524d.d(i7);
                this.f23525e.d(i7);
                if (this.f23532l) {
                    if (this.f23524d.e()) {
                        wn wnVar2 = this.f23524d;
                        this.f23531k.c(alr.c(wnVar2.f23596a, 3, wnVar2.f23597b));
                        wnVar = this.f23524d;
                    } else if (this.f23525e.e()) {
                        wn wnVar3 = this.f23525e;
                        this.f23531k.b(alr.e(wnVar3.f23596a, wnVar3.f23597b));
                        wnVar = this.f23525e;
                    }
                } else if (this.f23524d.e() && this.f23525e.e()) {
                    ArrayList arrayList = new ArrayList();
                    wn wnVar4 = this.f23524d;
                    arrayList.add(Arrays.copyOf(wnVar4.f23596a, wnVar4.f23597b));
                    wn wnVar5 = this.f23525e;
                    arrayList.add(Arrays.copyOf(wnVar5.f23596a, wnVar5.f23597b));
                    wn wnVar6 = this.f23524d;
                    alq alqVarC = alr.c(wnVar6.f23596a, 3, wnVar6.f23597b);
                    wn wnVar7 = this.f23525e;
                    alp alpVarE = alr.e(wnVar7.f23596a, wnVar7.f23597b);
                    String strA = aku.a(alqVarC.f20056a, alqVarC.f20057b, alqVarC.f20058c);
                    sf sfVar = this.f23530j;
                    kd kdVar = new kd();
                    kdVar.S(this.f23529i);
                    kdVar.ae("video/avc");
                    kdVar.I(strA);
                    kdVar.aj(alqVarC.f20060e);
                    kdVar.Q(alqVarC.f20061f);
                    kdVar.aa(alqVarC.f20062g);
                    kdVar.T(arrayList);
                    sfVar.b(kdVar.s());
                    this.f23532l = true;
                    this.f23531k.c(alqVarC);
                    this.f23531k.b(alpVarE);
                    this.f23524d.b();
                    wnVar = this.f23525e;
                }
                wnVar.b();
            }
            if (this.f23526f.d(i7)) {
                wn wnVar8 = this.f23526f;
                this.f23535o.G(this.f23526f.f23596a, alr.b(wnVar8.f23596a, wnVar8.f23597b));
                this.f23535o.I(4);
                this.f23521a.a(j3, this.f23535o);
            }
            if (this.f23531k.f(j2, i6, this.f23532l, this.f23534n)) {
                this.f23534n = false;
            }
            long j4 = this.f23533m;
            if (!this.f23532l || this.f23531k.g()) {
                this.f23524d.c(i4);
                this.f23525e.c(i4);
            }
            this.f23526f.c(i4);
            this.f23531k.e(j2, i4, j4);
            iC = i3;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void b(rm rmVar, xg xgVar) {
        xgVar.c();
        this.f23529i = xgVar.b();
        sf sfVarAZ = rmVar.aZ(xgVar.a(), 2);
        this.f23530j = sfVarAZ;
        this.f23531k = new wg(sfVarAZ, this.f23522b, this.f23523c);
        this.f23521a.b(rmVar, xgVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void d(long j2, int i2) {
        this.f23533m = j2;
        this.f23534n |= (i2 & 2) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void e() {
        this.f23527g = 0L;
        this.f23534n = false;
        alr.d(this.f23528h);
        this.f23524d.b();
        this.f23525e.b();
        this.f23526f.b();
        wg wgVar = this.f23531k;
        if (wgVar != null) {
            wgVar.d();
        }
    }
}

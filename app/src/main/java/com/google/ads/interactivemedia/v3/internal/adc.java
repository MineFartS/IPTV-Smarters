package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class adc implements rm, ade {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ada f19243b = ada.f19235a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final rz f19244c = new rz();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rj f19245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ke f19247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray<adb> f19248g = new SparseArray<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private sc f19251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ke[] f19252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private acz f19253l;

    public adc(rj rjVar, int i2, ke keVar) {
        this.f19245d = rjVar;
        this.f19246e = i2;
        this.f19247f = keVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rm
    public final sf aZ(int i2, int i3) {
        adb adbVar = this.f19248g.get(i2);
        if (adbVar == null) {
            ajr.f(this.f19252k == null);
            adbVar = new adb(i2, i3, i3 == this.f19246e ? this.f19247f : null);
            adbVar.g(this.f19253l, this.f19250i);
            this.f19248g.put(i2, adbVar);
        }
        return adbVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rm
    public final void ba() {
        ke[] keVarArr = new ke[this.f19248g.size()];
        for (int i2 = 0; i2 < this.f19248g.size(); i2++) {
            ke keVar = this.f19248g.valueAt(i2).f19236a;
            ajr.c(keVar);
            keVarArr[i2] = keVar;
        }
        this.f19252k = keVarArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rm
    public final void bb(sc scVar) {
        this.f19251j = scVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ade
    public final re d() {
        sc scVar = this.f19251j;
        if (scVar instanceof re) {
            return (re) scVar;
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ade
    public final void e() {
        this.f19245d.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ade
    public final boolean f(rk rkVar) {
        int iA = this.f19245d.a(rkVar, f19244c);
        ajr.f(iA != 1);
        return iA == 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ade
    public final ke[] g() {
        return this.f19252k;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ade
    public final void h(acz aczVar, long j2, long j3) {
        this.f19253l = aczVar;
        this.f19250i = j3;
        if (!this.f19249h) {
            this.f19245d.b(this);
            if (j2 != -9223372036854775807L) {
                this.f19245d.d(0L, j2);
            }
            this.f19249h = true;
            return;
        }
        rj rjVar = this.f19245d;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        rjVar.d(0L, j2);
        for (int i2 = 0; i2 < this.f19248g.size(); i2++) {
            this.f19248g.valueAt(i2).g(aczVar, j3);
        }
    }
}

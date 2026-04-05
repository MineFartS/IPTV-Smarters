package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private alq f23493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23503m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23504n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23505o;
    private int p;

    private wf() {
    }

    public /* synthetic */ wf(byte[] bArr) {
    }

    public static /* synthetic */ boolean d(wf wfVar, wf wfVar2) {
        int i2;
        int i3;
        int i4;
        boolean z;
        if (!wfVar.f23491a) {
            return false;
        }
        if (!wfVar2.f23491a) {
            return true;
        }
        alq alqVar = wfVar.f23493c;
        ajr.c(alqVar);
        alq alqVar2 = wfVar2.f23493c;
        ajr.c(alqVar2);
        return (wfVar.f23496f == wfVar2.f23496f && wfVar.f23497g == wfVar2.f23497g && wfVar.f23498h == wfVar2.f23498h && (!wfVar.f23499i || !wfVar2.f23499i || wfVar.f23500j == wfVar2.f23500j) && (((i2 = wfVar.f23494d) == (i3 = wfVar2.f23494d) || (i2 != 0 && i3 != 0)) && ((i4 = alqVar.f20066k) != 0 ? !(i4 == 1 && alqVar2.f20066k == 1 && (wfVar.f23505o != wfVar2.f23505o || wfVar.p != wfVar2.p)) : alqVar2.f20066k != 0 || (wfVar.f23503m == wfVar2.f23503m && wfVar.f23504n == wfVar2.f23504n)) && (z = wfVar.f23501k) == wfVar2.f23501k && (!z || wfVar.f23502l == wfVar2.f23502l))) ? false : true;
    }

    public final void a() {
        this.f23492b = false;
        this.f23491a = false;
    }

    public final void b(alq alqVar, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, int i6, int i7, int i8, int i9, int i10) {
        this.f23493c = alqVar;
        this.f23494d = i2;
        this.f23495e = i3;
        this.f23496f = i4;
        this.f23497g = i5;
        this.f23498h = z;
        this.f23499i = z2;
        this.f23500j = z3;
        this.f23501k = z4;
        this.f23502l = i6;
        this.f23503m = i7;
        this.f23504n = i8;
        this.f23505o = i9;
        this.p = i10;
        this.f23491a = true;
        this.f23492b = true;
    }

    public final void c(int i2) {
        this.f23495e = i2;
        this.f23492b = true;
    }

    public final boolean e() {
        int i2;
        return this.f23492b && ((i2 = this.f23495e) == 7 || i2 == 2);
    }
}

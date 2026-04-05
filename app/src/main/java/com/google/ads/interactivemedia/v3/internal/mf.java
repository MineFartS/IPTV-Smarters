package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f22401a = new Object();
    private static final kn r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22402b = f22401a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kn f22403c = r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f22404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public boolean f22410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public kl f22411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f22413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f22414n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22415o;
    public int p;
    public long q;

    static {
        ki kiVar = new ki();
        kiVar.c("com.google.android.exoplayer2.Timeline");
        kiVar.f(Uri.EMPTY);
        r = kiVar.a();
    }

    public final long a() {
        return iw.c(this.f22413m);
    }

    public final boolean b() {
        ajr.f(this.f22410j == (this.f22411k != null));
        return this.f22411k != null;
    }

    public final void c(Object obj, kn knVar, Object obj2, long j2, long j3, long j4, boolean z, boolean z2, kl klVar, long j5, long j6, int i2, long j7) {
        this.f22402b = obj;
        this.f22403c = knVar != null ? knVar : r;
        this.f22404d = obj2;
        this.f22405e = j2;
        this.f22406f = j3;
        this.f22407g = j4;
        this.f22408h = z;
        this.f22409i = z2;
        this.f22410j = klVar != null;
        this.f22411k = klVar;
        this.f22413m = j5;
        this.f22414n = j6;
        this.f22415o = 0;
        this.p = i2;
        this.q = j7;
        this.f22412l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mf.class.equals(obj.getClass())) {
            mf mfVar = (mf) obj;
            if (amn.O(this.f22402b, mfVar.f22402b) && amn.O(this.f22403c, mfVar.f22403c) && amn.O(this.f22404d, mfVar.f22404d) && amn.O(this.f22411k, mfVar.f22411k) && this.f22405e == mfVar.f22405e && this.f22406f == mfVar.f22406f && this.f22407g == mfVar.f22407g && this.f22408h == mfVar.f22408h && this.f22409i == mfVar.f22409i && this.f22412l == mfVar.f22412l && this.f22413m == mfVar.f22413m && this.f22414n == mfVar.f22414n && this.f22415o == mfVar.f22415o && this.p == mfVar.p && this.q == mfVar.q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f22402b.hashCode() + 217) * 31) + this.f22403c.hashCode()) * 31;
        Object obj = this.f22404d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        kl klVar = this.f22411k;
        int iHashCode3 = klVar != null ? klVar.hashCode() : 0;
        long j2 = this.f22405e;
        long j3 = this.f22406f;
        long j4 = this.f22407g;
        boolean z = this.f22408h;
        boolean z2 = this.f22409i;
        boolean z3 = this.f22412l;
        long j5 = this.f22413m;
        long j6 = this.f22414n;
        int i2 = this.f22415o;
        int i3 = this.p;
        long j7 = this.q;
        return ((((((((((((((((((((((iHashCode2 + iHashCode3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + i2) * 31) + i3) * 31) + ((int) ((j7 >>> 32) ^ j7));
    }
}

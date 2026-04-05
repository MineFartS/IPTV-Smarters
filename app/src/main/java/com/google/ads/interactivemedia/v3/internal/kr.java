package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class kr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final abg f22229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f22236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f22237i;

    public kr(abg abgVar, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4) {
        ajr.d(!z4 || z2);
        ajr.d(!z3 || z2);
        ajr.d(true);
        this.f22229a = abgVar;
        this.f22230b = j2;
        this.f22231c = j3;
        this.f22232d = j4;
        this.f22233e = j5;
        this.f22234f = false;
        this.f22235g = z2;
        this.f22236h = z3;
        this.f22237i = z4;
    }

    public final kr a(long j2) {
        return j2 == this.f22231c ? this : new kr(this.f22229a, this.f22230b, j2, this.f22232d, this.f22233e, false, this.f22235g, this.f22236h, this.f22237i);
    }

    public final kr b(long j2) {
        return j2 == this.f22230b ? this : new kr(this.f22229a, j2, this.f22231c, this.f22232d, this.f22233e, false, this.f22235g, this.f22236h, this.f22237i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kr.class == obj.getClass()) {
            kr krVar = (kr) obj;
            if (this.f22230b == krVar.f22230b && this.f22231c == krVar.f22231c && this.f22232d == krVar.f22232d && this.f22233e == krVar.f22233e && this.f22235g == krVar.f22235g && this.f22236h == krVar.f22236h && this.f22237i == krVar.f22237i && amn.O(this.f22229a, krVar.f22229a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f22229a.hashCode() + 527) * 31) + ((int) this.f22230b)) * 31) + ((int) this.f22231c)) * 31) + ((int) this.f22232d)) * 31) + ((int) this.f22233e)) * 961) + (this.f22235g ? 1 : 0)) * 31) + (this.f22236h ? 1 : 0)) * 31) + (this.f22237i ? 1 : 0);
    }
}

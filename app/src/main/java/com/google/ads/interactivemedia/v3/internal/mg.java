package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mg f22416a = new md();

    public final boolean A() {
        return t() == 0;
    }

    public int e(boolean z) {
        return A() ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg)) {
            return false;
        }
        mg mgVar = (mg) obj;
        if (mgVar.t() != t() || mgVar.s() != s()) {
            return false;
        }
        mf mfVar = new mf();
        me meVar = new me();
        mf mfVar2 = new mf();
        me meVar2 = new me();
        for (int i2 = 0; i2 < t(); i2++) {
            if (!z(i2, mfVar).equals(mgVar.z(i2, mfVar2))) {
                return false;
            }
        }
        for (int i3 = 0; i3 < s(); i3++) {
            if (!j(i3, meVar, true).equals(mgVar.j(i3, meVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public abstract int g(Object obj);

    public int h(boolean z) {
        if (A()) {
            return -1;
        }
        return t() - 1;
    }

    public final int hashCode() {
        int i2;
        mf mfVar = new mf();
        me meVar = new me();
        int iT = t() + 217;
        int i3 = 0;
        while (true) {
            i2 = iT * 31;
            if (i3 >= t()) {
                break;
            }
            iT = i2 + z(i3, mfVar).hashCode();
            i3++;
        }
        int iS = i2 + s();
        for (int i4 = 0; i4 < s(); i4++) {
            iS = (iS * 31) + j(i4, meVar, true).hashCode();
        }
        return iS;
    }

    public int i(int i2, int i3, boolean z) {
        if (i3 == 0) {
            if (i2 == h(z)) {
                return -1;
            }
            return i2 + 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == h(z) ? e(z) : i2 + 1;
        }
        throw new IllegalStateException();
    }

    public abstract me j(int i2, me meVar, boolean z);

    public me k(Object obj, me meVar) {
        return j(g(obj), meVar, true);
    }

    public abstract mf l(int i2, mf mfVar, long j2);

    public abstract Object q(int i2);

    public int r(int i2) {
        if (i2 == e(false)) {
            return -1;
        }
        return i2 - 1;
    }

    public abstract int s();

    public abstract int t();

    public final int v(int i2, me meVar, mf mfVar, int i3, boolean z) {
        int i4 = y(i2, meVar).f22396c;
        if (z(i4, mfVar).p != i2) {
            return i2 + 1;
        }
        int i5 = i(i4, i3, z);
        if (i5 == -1) {
            return -1;
        }
        return z(i5, mfVar).f22415o;
    }

    public final Pair<Object, Long> w(mf mfVar, me meVar, int i2, long j2) {
        Pair<Object, Long> pairX = x(mfVar, meVar, i2, j2, 0L);
        ajr.b(pairX);
        return pairX;
    }

    public final Pair<Object, Long> x(mf mfVar, me meVar, int i2, long j2, long j3) {
        ajr.g(i2, t());
        l(i2, mfVar, j3);
        if (j2 == -9223372036854775807L) {
            j2 = mfVar.f22413m;
            if (j2 == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = mfVar.f22415o;
        y(i3, meVar);
        while (i3 < mfVar.p && meVar.f22398e != j2) {
            int i4 = i3 + 1;
            if (y(i4, meVar).f22398e > j2) {
                break;
            }
            i3 = i4;
        }
        j(i3, meVar, true);
        long j4 = meVar.f22398e;
        Object obj = meVar.f22395b;
        ajr.b(obj);
        return Pair.create(obj, Long.valueOf(j2 - j4));
    }

    public final me y(int i2, me meVar) {
        return j(i2, meVar, false);
    }

    public final mf z(int i2, mf mfVar) {
        return l(i2, mfVar, 0L);
    }
}

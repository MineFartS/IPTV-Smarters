package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class im extends mg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final acn f21965c;

    public im(acn acnVar) {
        this.f21965c = acnVar;
        this.f21964b = acnVar.c();
    }

    private final int B(int i2, boolean z) {
        if (z) {
            return this.f21965c.e(i2);
        }
        if (i2 <= 0) {
            return -1;
        }
        return i2 - 1;
    }

    public static Object n(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object o(Object obj) {
        return ((Pair) obj).first;
    }

    private final int u(int i2, boolean z) {
        if (z) {
            return this.f21965c.d(i2);
        }
        if (i2 >= this.f21964b - 1) {
            return -1;
        }
        return i2 + 1;
    }

    public abstract int a(Object obj);

    public abstract int b(int i2);

    public abstract int c(int i2);

    public abstract int d(int i2);

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int e(boolean z) {
        if (this.f21964b == 0) {
            return -1;
        }
        int iA = z ? this.f21965c.a() : 0;
        while (m(iA).A()) {
            iA = u(iA, z);
            if (iA == -1) {
                return -1;
            }
        }
        return f(iA) + m(iA).e(z);
    }

    public abstract int f(int i2);

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int g(Object obj) {
        int iG;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objO = o(obj);
        Object objN = n(obj);
        int iA = a(objO);
        if (iA == -1 || (iG = m(iA).g(objN)) == -1) {
            return -1;
        }
        return d(iA) + iG;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int h(boolean z) {
        int i2 = this.f21964b;
        if (i2 == 0) {
            return -1;
        }
        int iB = z ? this.f21965c.b() : i2 - 1;
        while (m(iB).A()) {
            iB = B(iB, z);
            if (iB == -1) {
                return -1;
            }
        }
        return f(iB) + m(iB).h(z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int i(int i2, int i3, boolean z) {
        int iC = c(i2);
        int iF = f(iC);
        int i4 = m(iC).i(i2 - iF, i3 == 2 ? 0 : i3, z);
        if (i4 != -1) {
            return iF + i4;
        }
        int iU = u(iC, z);
        while (iU != -1 && m(iU).A()) {
            iU = u(iU, z);
        }
        if (iU != -1) {
            return f(iU) + m(iU).e(z);
        }
        if (i3 == 2) {
            return e(z);
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final me j(int i2, me meVar, boolean z) {
        int iB = b(i2);
        int iF = f(iB);
        m(iB).j(i2 - d(iB), meVar, z);
        meVar.f22396c += iF;
        if (z) {
            Object objP = p(iB);
            Object obj = meVar.f22395b;
            ajr.b(obj);
            meVar.f22395b = Pair.create(objP, obj);
        }
        return meVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final me k(Object obj, me meVar) {
        Object objO = o(obj);
        Object objN = n(obj);
        int iA = a(objO);
        int iF = f(iA);
        m(iA).k(objN, meVar);
        meVar.f22396c += iF;
        meVar.f22395b = obj;
        return meVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final mf l(int i2, mf mfVar, long j2) {
        int iC = c(i2);
        int iF = f(iC);
        int iD = d(iC);
        m(iC).l(i2 - iF, mfVar, j2);
        Object objP = p(iC);
        if (!mf.f22401a.equals(mfVar.f22402b)) {
            objP = Pair.create(objP, mfVar.f22402b);
        }
        mfVar.f22402b = objP;
        mfVar.f22415o += iD;
        mfVar.p += iD;
        return mfVar;
    }

    public abstract mg m(int i2);

    public abstract Object p(int i2);

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final Object q(int i2) {
        int iB = b(i2);
        return Pair.create(p(iB), m(iB).q(i2 - d(iB)));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int r(int i2) {
        int iC = c(i2);
        int iF = f(iC);
        int iR = m(iC).r(i2 - iF);
        if (iR != -1) {
            return iF + iR;
        }
        do {
            iC = B(iC, false);
            if (iC == -1) {
                break;
            }
        } while (m(iC).A());
        if (iC != -1) {
            return f(iC) + m(iC).h(false);
        }
        return -1;
    }
}

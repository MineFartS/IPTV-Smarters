package c.f.a.b;

import android.util.Pair;
import c.f.a.b.p2;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 extends p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.e3.u0 f9727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9728e;

    public q0(boolean z, c.f.a.b.e3.u0 u0Var) {
        this.f9728e = z;
        this.f9727d = u0Var;
        this.f9726c = u0Var.getLength();
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int A(int i2);

    public final int B(int i2, boolean z) {
        if (z) {
            return this.f9727d.d(i2);
        }
        if (i2 < this.f9726c - 1) {
            return i2 + 1;
        }
        return -1;
    }

    public final int C(int i2, boolean z) {
        if (z) {
            return this.f9727d.c(i2);
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        return -1;
    }

    public abstract p2 D(int i2);

    @Override // c.f.a.b.p2
    public int a(boolean z) {
        if (this.f9726c == 0) {
            return -1;
        }
        if (this.f9728e) {
            z = false;
        }
        int iB = z ? this.f9727d.b() : 0;
        while (D(iB).q()) {
            iB = B(iB, z);
            if (iB == -1) {
                return -1;
            }
        }
        return A(iB) + D(iB).a(z);
    }

    @Override // c.f.a.b.p2
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        if (iS == -1 || (iB = D(iS).b(objV)) == -1) {
            return -1;
        }
        return z(iS) + iB;
    }

    @Override // c.f.a.b.p2
    public int c(boolean z) {
        int i2 = this.f9726c;
        if (i2 == 0) {
            return -1;
        }
        if (this.f9728e) {
            z = false;
        }
        int iF = z ? this.f9727d.f() : i2 - 1;
        while (D(iF).q()) {
            iF = C(iF, z);
            if (iF == -1) {
                return -1;
            }
        }
        return A(iF) + D(iF).c(z);
    }

    @Override // c.f.a.b.p2
    public int e(int i2, int i3, boolean z) {
        if (this.f9728e) {
            if (i3 == 1) {
                i3 = 2;
            }
            z = false;
        }
        int iU = u(i2);
        int iA = A(iU);
        int iE = D(iU).e(i2 - iA, i3 != 2 ? i3 : 0, z);
        if (iE != -1) {
            return iA + iE;
        }
        int iB = B(iU, z);
        while (iB != -1 && D(iB).q()) {
            iB = B(iB, z);
        }
        if (iB != -1) {
            return A(iB) + D(iB).a(z);
        }
        if (i3 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // c.f.a.b.p2
    public final p2.b g(int i2, p2.b bVar, boolean z) {
        int iT = t(i2);
        int iA = A(iT);
        D(iT).g(i2 - z(iT), bVar, z);
        bVar.f9704d += iA;
        if (z) {
            bVar.f9703c = y(x(iT), c.f.a.b.j3.g.e(bVar.f9703c));
        }
        return bVar;
    }

    @Override // c.f.a.b.p2
    public final p2.b h(Object obj, p2.b bVar) {
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        int iA = A(iS);
        D(iS).h(objV, bVar);
        bVar.f9704d += iA;
        bVar.f9703c = obj;
        return bVar;
    }

    @Override // c.f.a.b.p2
    public int l(int i2, int i3, boolean z) {
        if (this.f9728e) {
            if (i3 == 1) {
                i3 = 2;
            }
            z = false;
        }
        int iU = u(i2);
        int iA = A(iU);
        int iL = D(iU).l(i2 - iA, i3 != 2 ? i3 : 0, z);
        if (iL != -1) {
            return iA + iL;
        }
        int iC = C(iU, z);
        while (iC != -1 && D(iC).q()) {
            iC = C(iC, z);
        }
        if (iC != -1) {
            return A(iC) + D(iC).c(z);
        }
        if (i3 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // c.f.a.b.p2
    public final Object m(int i2) {
        int iT = t(i2);
        return y(x(iT), D(iT).m(i2 - z(iT)));
    }

    @Override // c.f.a.b.p2
    public final p2.c o(int i2, p2.c cVar, long j2) {
        int iU = u(i2);
        int iA = A(iU);
        int iZ = z(iU);
        D(iU).o(i2 - iA, cVar, j2);
        Object objX = x(iU);
        if (!p2.c.f9709a.equals(cVar.f9713e)) {
            objX = y(objX, cVar.f9713e);
        }
        cVar.f9713e = objX;
        cVar.s += iZ;
        cVar.t += iZ;
        return cVar;
    }

    public abstract int s(Object obj);

    public abstract int t(int i2);

    public abstract int u(int i2);

    public abstract Object x(int i2);

    public abstract int z(int i2);
}

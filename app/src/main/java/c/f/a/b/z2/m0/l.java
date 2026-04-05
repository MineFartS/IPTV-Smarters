package c.f.a.b.z2.m0;

import android.util.SparseArray;
import c.f.a.b.k1;
import c.f.a.b.z2.m0.i0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements i0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<k1> f11258b;

    public l(int i2) {
        this(i2, c.f.b.b.t.J());
    }

    public l(int i2, List<k1> list) {
        this.f11257a = i2;
        this.f11258b = list;
    }

    @Override // c.f.a.b.z2.m0.i0.c
    public i0 a(int i2, i0.b bVar) {
        if (i2 == 2) {
            return new y(new p(d(bVar)));
        }
        if (i2 == 3 || i2 == 4) {
            return new y(new v(bVar.f11219b));
        }
        if (i2 == 21) {
            return new y(new t());
        }
        if (i2 == 27) {
            if (f(4)) {
                return null;
            }
            return new y(new r(c(bVar), f(1), f(8)));
        }
        if (i2 == 36) {
            return new y(new s(c(bVar)));
        }
        if (i2 == 89) {
            return new y(new n(bVar.f11220c));
        }
        if (i2 != 138) {
            if (i2 == 172) {
                return new y(new i(bVar.f11219b));
            }
            if (i2 == 257) {
                return new d0(new x("application/vnd.dvb.ait"));
            }
            if (i2 != 129) {
                if (i2 != 130) {
                    if (i2 == 134) {
                        if (f(16)) {
                            return null;
                        }
                        return new d0(new x("application/x-scte35"));
                    }
                    if (i2 != 135) {
                        switch (i2) {
                            case 15:
                                if (f(2)) {
                                    return null;
                                }
                                return new y(new k(false, bVar.f11219b));
                            case 16:
                                return new y(new q(d(bVar)));
                            case 17:
                                if (f(2)) {
                                    return null;
                                }
                                return new y(new u(bVar.f11219b));
                            default:
                                return null;
                        }
                    }
                } else if (!f(64)) {
                    return null;
                }
            }
            return new y(new g(bVar.f11219b));
        }
        return new y(new m(bVar.f11219b));
    }

    @Override // c.f.a.b.z2.m0.i0.c
    public SparseArray<i0> b() {
        return new SparseArray<>();
    }

    public final e0 c(i0.b bVar) {
        return new e0(e(bVar));
    }

    public final k0 d(i0.b bVar) {
        return new k0(e(bVar));
    }

    public final List<k1> e(i0.b bVar) {
        String str;
        int i2;
        if (f(32)) {
            return this.f11258b;
        }
        c.f.a.b.j3.i0 i0Var = new c.f.a.b.j3.i0(bVar.f11221d);
        List<k1> arrayList = this.f11258b;
        while (i0Var.a() > 0) {
            int iD = i0Var.D();
            int iE = i0Var.e() + i0Var.D();
            if (iD == 134) {
                arrayList = new ArrayList<>();
                int iD2 = i0Var.D() & 31;
                for (int i3 = 0; i3 < iD2; i3++) {
                    String strA = i0Var.A(3);
                    int iD3 = i0Var.D();
                    boolean z = (iD3 & 128) != 0;
                    if (z) {
                        i2 = iD3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte bD = (byte) i0Var.D();
                    i0Var.Q(1);
                    List<byte[]> listB = null;
                    if (z) {
                        listB = c.f.a.b.j3.j.b((bD & 64) != 0);
                    }
                    arrayList.add(new k1.b().e0(str).V(strA).F(i2).T(listB).E());
                }
            }
            i0Var.P(iE);
        }
        return arrayList;
    }

    public final boolean f(int i2) {
        return (i2 & this.f11257a) != 0;
    }
}

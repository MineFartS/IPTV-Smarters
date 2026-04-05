package a.g.b.k.m;

import a.g.b.k.d;
import a.g.b.k.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<a.g.b.k.e> f1433a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f1434b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.g.b.k.f f1435c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e.b f1436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e.b f1437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1442g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f1443h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f1444i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f1445j;
    }

    /* JADX INFO: renamed from: a.g.b.k.m.b$b, reason: collision with other inner class name */
    public interface InterfaceC0023b {
        void a();

        void b(a.g.b.k.e eVar, a aVar);
    }

    public b(a.g.b.k.f fVar) {
        this.f1435c = fVar;
    }

    public final boolean a(InterfaceC0023b interfaceC0023b, a.g.b.k.e eVar, boolean z) {
        this.f1434b.f1436a = eVar.w();
        this.f1434b.f1437b = eVar.K();
        this.f1434b.f1438c = eVar.N();
        this.f1434b.f1439d = eVar.t();
        a aVar = this.f1434b;
        aVar.f1444i = false;
        aVar.f1445j = z;
        e.b bVar = aVar.f1436a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z2 = bVar == bVar2;
        boolean z3 = aVar.f1437b == bVar2;
        boolean z4 = z2 && eVar.R > 0.0f;
        boolean z5 = z3 && eVar.R > 0.0f;
        if (z4 && eVar.f1428o[0] == 4) {
            aVar.f1436a = e.b.FIXED;
        }
        if (z5 && eVar.f1428o[1] == 4) {
            aVar.f1437b = e.b.FIXED;
        }
        interfaceC0023b.b(eVar, aVar);
        eVar.B0(this.f1434b.f1440e);
        eVar.e0(this.f1434b.f1441f);
        eVar.d0(this.f1434b.f1443h);
        eVar.Y(this.f1434b.f1442g);
        a aVar2 = this.f1434b;
        aVar2.f1445j = false;
        return aVar2.f1444i;
    }

    public final void b(a.g.b.k.f fVar) {
        int size = fVar.w0.size();
        InterfaceC0023b interfaceC0023bR0 = fVar.R0();
        for (int i2 = 0; i2 < size; i2++) {
            a.g.b.k.e eVar = fVar.w0.get(i2);
            if (!(eVar instanceof a.g.b.k.g) && (!eVar.f1419f.f1487e.f1466j || !eVar.f1420g.f1487e.f1466j)) {
                e.b bVarQ = eVar.q(0);
                e.b bVarQ2 = eVar.q(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarQ == bVar && eVar.f1426m != 1 && bVarQ2 == bVar && eVar.f1427n != 1) {
                    continue;
                } else {
                    a(interfaceC0023bR0, eVar, false);
                    if (fVar.B0 != null) {
                        throw null;
                    }
                }
            }
        }
        interfaceC0023bR0.a();
    }

    public final void c(a.g.b.k.f fVar, String str, int i2, int i3) {
        int iC = fVar.C();
        int iB = fVar.B();
        fVar.r0(0);
        fVar.q0(0);
        fVar.B0(i2);
        fVar.e0(i3);
        fVar.r0(iC);
        fVar.q0(iB);
        this.f1435c.H0();
    }

    public long d(a.g.b.k.f fVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        boolean zO0;
        int i11;
        boolean z;
        boolean z2;
        int i12;
        int i13;
        InterfaceC0023b interfaceC0023b;
        int i14;
        boolean z3;
        boolean zQ0;
        int i15;
        InterfaceC0023b interfaceC0023bR0 = fVar.R0();
        int size = fVar.w0.size();
        int iN = fVar.N();
        int iT = fVar.t();
        boolean zB = a.g.b.k.j.b(i2, 128);
        boolean z4 = zB || a.g.b.k.j.b(i2, 64);
        if (z4) {
            for (int i16 = 0; i16 < size; i16++) {
                a.g.b.k.e eVar = fVar.w0.get(i16);
                e.b bVarW = eVar.w();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z5 = (bVarW == bVar) && (eVar.K() == bVar) && eVar.r() > 0.0f;
                if ((eVar.T() && z5) || ((eVar.V() && z5) || (eVar instanceof a.g.b.k.k) || eVar.T() || eVar.V())) {
                    z4 = false;
                    break;
                }
            }
        }
        if (z4 && a.g.b.d.f1335b != null) {
            throw null;
        }
        if (z4 && ((i5 == 1073741824 && i7 == 1073741824) || zB)) {
            int iMin = Math.min(fVar.A(), i6);
            int iMin2 = Math.min(fVar.z(), i8);
            if (i5 == 1073741824 && fVar.N() != iMin) {
                fVar.B0(iMin);
                fVar.T0();
            }
            if (i7 == 1073741824 && fVar.t() != iMin2) {
                fVar.e0(iMin2);
                fVar.T0();
            }
            if (i5 == 1073741824 && i7 == 1073741824) {
                zO0 = fVar.O0(zB);
                i11 = 2;
            } else {
                boolean zP0 = fVar.P0(zB);
                if (i5 == 1073741824) {
                    zQ0 = zP0 & fVar.Q0(zB, 0);
                    i15 = 1;
                } else {
                    zQ0 = zP0;
                    i15 = 0;
                }
                if (i7 == 1073741824) {
                    boolean zQ02 = fVar.Q0(zB, 1) & zQ0;
                    i11 = i15 + 1;
                    zO0 = zQ02;
                } else {
                    i11 = i15;
                    zO0 = zQ0;
                }
            }
            if (zO0) {
                fVar.F0(i5 == 1073741824, i7 == 1073741824);
            }
        } else {
            zO0 = false;
            i11 = 0;
        }
        if (zO0 && i11 == 2) {
            return 0L;
        }
        if (size > 0) {
            b(fVar);
        }
        int iS0 = fVar.S0();
        int size2 = this.f1433a.size();
        if (size > 0) {
            c(fVar, "First pass", iN, iT);
        }
        if (size2 > 0) {
            e.b bVarW2 = fVar.w();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z6 = bVarW2 == bVar2;
            boolean z7 = fVar.K() == bVar2;
            int iMax = Math.max(fVar.N(), this.f1435c.C());
            int iMax2 = Math.max(fVar.t(), this.f1435c.B());
            int i17 = 0;
            boolean zA = false;
            while (i17 < size2) {
                a.g.b.k.e eVar2 = this.f1433a.get(i17);
                if (eVar2 instanceof a.g.b.k.k) {
                    int iN2 = eVar2.N();
                    int iT2 = eVar2.t();
                    i14 = iS0;
                    boolean zA2 = zA | a(interfaceC0023bR0, eVar2, true);
                    if (fVar.B0 != null) {
                        throw null;
                    }
                    int iN3 = eVar2.N();
                    int iT3 = eVar2.t();
                    if (iN3 != iN2) {
                        eVar2.B0(iN3);
                        if (z6 && eVar2.G() > iMax) {
                            iMax = Math.max(iMax, eVar2.G() + eVar2.k(d.b.RIGHT).b());
                        }
                        z3 = true;
                    } else {
                        z3 = zA2;
                    }
                    if (iT3 != iT2) {
                        eVar2.e0(iT3);
                        if (z7 && eVar2.n() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.n() + eVar2.k(d.b.BOTTOM).b());
                        }
                        z3 = true;
                    }
                    zA = z3 | ((a.g.b.k.k) eVar2).I0();
                } else {
                    i14 = iS0;
                }
                i17++;
                iS0 = i14;
            }
            int i18 = iS0;
            int i19 = 0;
            int i20 = 2;
            while (i19 < i20) {
                int i21 = 0;
                while (i21 < size2) {
                    a.g.b.k.e eVar3 = this.f1433a.get(i21);
                    if (((eVar3 instanceof a.g.b.k.h) && !(eVar3 instanceof a.g.b.k.k)) || (eVar3 instanceof a.g.b.k.g) || eVar3.M() == 8 || ((eVar3.f1419f.f1487e.f1466j && eVar3.f1420g.f1487e.f1466j) || (eVar3 instanceof a.g.b.k.k))) {
                        i13 = i19;
                        i12 = size2;
                        interfaceC0023b = interfaceC0023bR0;
                    } else {
                        int iN4 = eVar3.N();
                        int iT4 = eVar3.t();
                        i12 = size2;
                        int iL = eVar3.l();
                        i13 = i19;
                        zA |= a(interfaceC0023bR0, eVar3, true);
                        if (fVar.B0 != null) {
                            throw null;
                        }
                        int iN5 = eVar3.N();
                        interfaceC0023b = interfaceC0023bR0;
                        int iT5 = eVar3.t();
                        if (iN5 != iN4) {
                            eVar3.B0(iN5);
                            if (z6 && eVar3.G() > iMax) {
                                iMax = Math.max(iMax, eVar3.G() + eVar3.k(d.b.RIGHT).b());
                            }
                            zA = true;
                        }
                        if (iT5 != iT4) {
                            eVar3.e0(iT5);
                            if (z7 && eVar3.n() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.n() + eVar3.k(d.b.BOTTOM).b());
                            }
                            zA = true;
                        }
                        if (eVar3.Q() && iL != eVar3.l()) {
                            zA = true;
                        }
                    }
                    i21++;
                    size2 = i12;
                    interfaceC0023bR0 = interfaceC0023b;
                    i19 = i13;
                }
                int i22 = i19;
                int i23 = size2;
                InterfaceC0023b interfaceC0023b2 = interfaceC0023bR0;
                if (zA) {
                    c(fVar, "intermediate pass", iN, iT);
                    zA = false;
                }
                interfaceC0023bR0 = interfaceC0023b2;
                i19 = i22 + 1;
                i20 = 2;
                size2 = i23;
            }
            if (zA) {
                c(fVar, "2nd pass", iN, iT);
                if (fVar.N() < iMax) {
                    fVar.B0(iMax);
                    z = true;
                } else {
                    z = false;
                }
                if (fVar.t() < iMax2) {
                    fVar.e0(iMax2);
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (z2) {
                    c(fVar, "3rd pass", iN, iT);
                }
            }
            iS0 = i18;
        }
        fVar.c1(iS0);
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(a.g.b.k.f r7) {
        /*
            r6 = this;
            java.util.ArrayList<a.g.b.k.e> r0 = r6.f1433a
            r0.clear()
            java.util.ArrayList<a.g.b.k.e> r0 = r7.w0
            int r0 = r0.size()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L3a
            java.util.ArrayList<a.g.b.k.e> r2 = r7.w0
            java.lang.Object r2 = r2.get(r1)
            a.g.b.k.e r2 = (a.g.b.k.e) r2
            a.g.b.k.e$b r3 = r2.w()
            a.g.b.k.e$b r4 = a.g.b.k.e.b.MATCH_CONSTRAINT
            if (r3 == r4) goto L32
            a.g.b.k.e$b r3 = r2.w()
            a.g.b.k.e$b r5 = a.g.b.k.e.b.MATCH_PARENT
            if (r3 == r5) goto L32
            a.g.b.k.e$b r3 = r2.K()
            if (r3 == r4) goto L32
            a.g.b.k.e$b r3 = r2.K()
            if (r3 != r5) goto L37
        L32:
            java.util.ArrayList<a.g.b.k.e> r3 = r6.f1433a
            r3.add(r2)
        L37:
            int r1 = r1 + 1
            goto Lc
        L3a:
            r7.T0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.k.m.b.e(a.g.b.k.f):void");
    }
}

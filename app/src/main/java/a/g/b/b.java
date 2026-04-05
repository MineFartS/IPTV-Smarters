package a.g.b;

import a.g.b.d;
import a.g.b.i;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f1328e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f1324a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1325b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1326c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<i> f1327d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1329f = false;

    public interface a {
        int a();

        i b(int i2);

        void c();

        void clear();

        float d(int i2);

        void e(i iVar, float f2, boolean z);

        float f(i iVar);

        boolean g(i iVar);

        float h(b bVar, boolean z);

        void i(i iVar, float f2);

        float j(i iVar, boolean z);

        void k(float f2);
    }

    public b() {
    }

    public b(c cVar) {
        this.f1328e = new a.g.b.a(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.b.A():java.lang.String");
    }

    public void B(d dVar, i iVar, boolean z) {
        if (iVar.f1369h) {
            this.f1325b += iVar.f1368g * this.f1328e.f(iVar);
            this.f1328e.j(iVar, z);
            if (z) {
                iVar.c(this);
            }
        }
    }

    public void C(b bVar, boolean z) {
        this.f1325b += bVar.f1325b * this.f1328e.h(bVar, z);
        if (z) {
            bVar.f1324a.c(this);
        }
    }

    public void D(d dVar) {
        if (dVar.f1344k.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int iA = this.f1328e.a();
            for (int i2 = 0; i2 < iA; i2++) {
                i iVarB = this.f1328e.b(i2);
                if (iVarB.f1366e != -1 || iVarB.f1369h) {
                    this.f1327d.add(iVarB);
                }
            }
            if (this.f1327d.size() > 0) {
                for (i iVar : this.f1327d) {
                    if (iVar.f1369h) {
                        B(dVar, iVar, true);
                    } else {
                        C(dVar.f1344k[iVar.f1366e], true);
                    }
                }
                this.f1327d.clear();
            } else {
                z = true;
            }
        }
    }

    @Override // a.g.b.d.a
    public void a(i iVar) {
        int i2 = iVar.f1367f;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f1328e.i(iVar, f2);
    }

    @Override // a.g.b.d.a
    public i b(d dVar, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // a.g.b.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f1324a = null;
            this.f1328e.clear();
            for (int i2 = 0; i2 < bVar.f1328e.a(); i2++) {
                this.f1328e.e(bVar.f1328e.b(i2), bVar.f1328e.d(i2), true);
            }
        }
    }

    @Override // a.g.b.d.a
    public void clear() {
        this.f1328e.clear();
        this.f1324a = null;
        this.f1325b = 0.0f;
    }

    public b d(d dVar, int i2) {
        this.f1328e.i(dVar.o(i2, "ep"), 1.0f);
        this.f1328e.i(dVar.o(i2, "em"), -1.0f);
        return this;
    }

    public b e(i iVar, int i2) {
        this.f1328e.i(iVar, i2);
        return this;
    }

    public boolean f(d dVar) {
        boolean z;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z = true;
        } else {
            y(iVarG);
            z = false;
        }
        if (this.f1328e.a() == 0) {
            this.f1329f = true;
        }
        return z;
    }

    public i g(d dVar) {
        int iA = this.f1328e.a();
        i iVar = null;
        i iVar2 = null;
        boolean zV = false;
        boolean zV2 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < iA; i2++) {
            float fD = this.f1328e.d(i2);
            i iVarB = this.f1328e.b(i2);
            if (iVarB.f1372k == i.a.UNRESTRICTED) {
                if (iVar == null || f2 > fD) {
                    zV = v(iVarB, dVar);
                    f2 = fD;
                    iVar = iVarB;
                } else if (!zV && v(iVarB, dVar)) {
                    f2 = fD;
                    iVar = iVarB;
                    zV = true;
                }
            } else if (iVar == null && fD < 0.0f) {
                if (iVar2 == null || f3 > fD) {
                    zV2 = v(iVarB, dVar);
                    f3 = fD;
                    iVar2 = iVarB;
                } else if (!zV2 && v(iVarB, dVar)) {
                    f3 = fD;
                    iVar2 = iVarB;
                    zV2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // a.g.b.d.a
    public i getKey() {
        return this.f1324a;
    }

    public b h(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3) {
        float f3;
        int i4;
        if (iVar2 == iVar3) {
            this.f1328e.i(iVar, 1.0f);
            this.f1328e.i(iVar4, 1.0f);
            this.f1328e.i(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f1328e.i(iVar, 1.0f);
            this.f1328e.i(iVar2, -1.0f);
            this.f1328e.i(iVar3, -1.0f);
            this.f1328e.i(iVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                i4 = (-i2) + i3;
                f3 = i4;
            }
            return this;
        }
        if (f2 <= 0.0f) {
            this.f1328e.i(iVar, -1.0f);
            this.f1328e.i(iVar2, 1.0f);
            f3 = i2;
        } else {
            if (f2 < 1.0f) {
                float f4 = 1.0f - f2;
                this.f1328e.i(iVar, f4 * 1.0f);
                this.f1328e.i(iVar2, f4 * (-1.0f));
                this.f1328e.i(iVar3, (-1.0f) * f2);
                this.f1328e.i(iVar4, 1.0f * f2);
                if (i2 > 0 || i3 > 0) {
                    f3 = ((-i2) * f4) + (i3 * f2);
                }
                return this;
            }
            this.f1328e.i(iVar4, -1.0f);
            this.f1328e.i(iVar3, 1.0f);
            i4 = -i3;
            f3 = i4;
        }
        this.f1325b = f3;
        return this;
    }

    public b i(i iVar, int i2) {
        this.f1324a = iVar;
        float f2 = i2;
        iVar.f1368g = f2;
        this.f1325b = f2;
        this.f1329f = true;
        return this;
    }

    public b j(i iVar, i iVar2, float f2) {
        this.f1328e.i(iVar, -1.0f);
        this.f1328e.i(iVar2, f2);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f1328e.i(iVar, -1.0f);
        this.f1328e.i(iVar2, 1.0f);
        this.f1328e.i(iVar3, f2);
        this.f1328e.i(iVar4, -f2);
        return this;
    }

    public b l(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f1325b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f1328e.i(iVar, 1.0f);
            this.f1328e.i(iVar2, -1.0f);
            this.f1328e.i(iVar4, 1.0f);
            this.f1328e.i(iVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f1328e.i(iVar, 1.0f);
            this.f1328e.i(iVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f1328e.i(iVar3, 1.0f);
            this.f1328e.i(iVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f1328e.i(iVar, 1.0f);
            this.f1328e.i(iVar2, -1.0f);
            this.f1328e.i(iVar4, f5);
            this.f1328e.i(iVar3, -f5);
        }
        return this;
    }

    public b m(i iVar, int i2) {
        a aVar;
        float f2;
        if (i2 < 0) {
            this.f1325b = i2 * (-1);
            aVar = this.f1328e;
            f2 = 1.0f;
        } else {
            this.f1325b = i2;
            aVar = this.f1328e;
            f2 = -1.0f;
        }
        aVar.i(iVar, f2);
        return this;
    }

    public b n(i iVar, i iVar2, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1325b = i2;
        }
        if (z) {
            this.f1328e.i(iVar, 1.0f);
            this.f1328e.i(iVar2, -1.0f);
        } else {
            this.f1328e.i(iVar, -1.0f);
            this.f1328e.i(iVar2, 1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1325b = i2;
        }
        if (z) {
            this.f1328e.i(iVar, 1.0f);
            this.f1328e.i(iVar2, -1.0f);
            this.f1328e.i(iVar3, -1.0f);
        } else {
            this.f1328e.i(iVar, -1.0f);
            this.f1328e.i(iVar2, 1.0f);
            this.f1328e.i(iVar3, 1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1325b = i2;
        }
        if (z) {
            this.f1328e.i(iVar, 1.0f);
            this.f1328e.i(iVar2, -1.0f);
            this.f1328e.i(iVar3, 1.0f);
        } else {
            this.f1328e.i(iVar, -1.0f);
            this.f1328e.i(iVar2, 1.0f);
            this.f1328e.i(iVar3, -1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f1328e.i(iVar3, 0.5f);
        this.f1328e.i(iVar4, 0.5f);
        this.f1328e.i(iVar, -0.5f);
        this.f1328e.i(iVar2, -0.5f);
        this.f1325b = -f2;
        return this;
    }

    public void r() {
        float f2 = this.f1325b;
        if (f2 < 0.0f) {
            this.f1325b = f2 * (-1.0f);
            this.f1328e.c();
        }
    }

    public boolean s() {
        i iVar = this.f1324a;
        return iVar != null && (iVar.f1372k == i.a.UNRESTRICTED || this.f1325b >= 0.0f);
    }

    public boolean t(i iVar) {
        return this.f1328e.g(iVar);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        return this.f1324a == null && this.f1325b == 0.0f && this.f1328e.a() == 0;
    }

    public final boolean v(i iVar, d dVar) {
        return iVar.f1375n <= 1;
    }

    public i w(i iVar) {
        return x(null, iVar);
    }

    public final i x(boolean[] zArr, i iVar) {
        i.a aVar;
        int iA = this.f1328e.a();
        i iVar2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < iA; i2++) {
            float fD = this.f1328e.d(i2);
            if (fD < 0.0f) {
                i iVarB = this.f1328e.b(i2);
                if ((zArr == null || !zArr[iVarB.f1365d]) && iVarB != iVar && (((aVar = iVarB.f1372k) == i.a.SLACK || aVar == i.a.ERROR) && fD < f2)) {
                    f2 = fD;
                    iVar2 = iVarB;
                }
            }
        }
        return iVar2;
    }

    public void y(i iVar) {
        i iVar2 = this.f1324a;
        if (iVar2 != null) {
            this.f1328e.i(iVar2, -1.0f);
            this.f1324a = null;
        }
        float fJ = this.f1328e.j(iVar, true) * (-1.0f);
        this.f1324a = iVar;
        if (fJ == 1.0f) {
            return;
        }
        this.f1325b /= fJ;
        this.f1328e.k(fJ);
    }

    public void z() {
        this.f1324a = null;
        this.f1328e.clear();
        this.f1325b = 0.0f;
        this.f1329f = false;
    }
}

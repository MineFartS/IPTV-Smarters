package a.g.b.k;

import a.g.b.k.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f1391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f1392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f1393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f1394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f1395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f1396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f1397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<e> f1398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1401k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1405o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    public c(e eVar, int i2, boolean z) {
        this.q = false;
        this.f1391a = eVar;
        this.p = i2;
        this.q = z;
    }

    public static boolean c(e eVar, int i2) {
        if (eVar.M() != 8 && eVar.N[i2] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f1428o;
            if (iArr[i2] == 0 || iArr[i2] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }

    public final void b() {
        int i2 = this.p * 2;
        e eVar = this.f1391a;
        this.f1405o = true;
        e eVar2 = eVar;
        boolean z = false;
        while (!z) {
            this.f1399i++;
            e[] eVarArr = eVar.t0;
            int i3 = this.p;
            e eVar3 = null;
            eVarArr[i3] = null;
            eVar.s0[i3] = null;
            if (eVar.M() != 8) {
                this.f1402l++;
                e.b bVarQ = eVar.q(this.p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarQ != bVar) {
                    this.f1403m += eVar.y(this.p);
                }
                int iB = this.f1403m + eVar.K[i2].b();
                this.f1403m = iB;
                int i4 = i2 + 1;
                this.f1403m = iB + eVar.K[i4].b();
                int iB2 = this.f1404n + eVar.K[i2].b();
                this.f1404n = iB2;
                this.f1404n = iB2 + eVar.K[i4].b();
                if (this.f1392b == null) {
                    this.f1392b = eVar;
                }
                this.f1394d = eVar;
                e.b[] bVarArr = eVar.N;
                int i5 = this.p;
                if (bVarArr[i5] == bVar) {
                    int[] iArr = eVar.f1428o;
                    if (iArr[i5] == 0 || iArr[i5] == 3 || iArr[i5] == 2) {
                        this.f1400j++;
                        float[] fArr = eVar.r0;
                        float f2 = fArr[i5];
                        if (f2 > 0.0f) {
                            this.f1401k += fArr[i5];
                        }
                        if (c(eVar, i5)) {
                            if (f2 < 0.0f) {
                                this.r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.f1398h == null) {
                                this.f1398h = new ArrayList<>();
                            }
                            this.f1398h.add(eVar);
                        }
                        if (this.f1396f == null) {
                            this.f1396f = eVar;
                        }
                        e eVar4 = this.f1397g;
                        if (eVar4 != null) {
                            eVar4.s0[this.p] = eVar;
                        }
                        this.f1397g = eVar;
                    }
                    if (this.p != 0 ? !(eVar.f1427n == 0 && eVar.s == 0 && eVar.t == 0) : !(eVar.f1426m == 0 && eVar.p == 0 && eVar.q == 0)) {
                        this.f1405o = false;
                    }
                    if (eVar.R != 0.0f) {
                        this.f1405o = false;
                        this.u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.t0[this.p] = eVar;
            }
            d dVar = eVar.K[i2 + 1].f1409d;
            if (dVar != null) {
                e eVar5 = dVar.f1407b;
                d[] dVarArr = eVar5.K;
                if (dVarArr[i2].f1409d != null && dVarArr[i2].f1409d.f1407b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f1392b;
        if (eVar6 != null) {
            this.f1403m -= eVar6.K[i2].b();
        }
        e eVar7 = this.f1394d;
        if (eVar7 != null) {
            this.f1403m -= eVar7.K[i2 + 1].b();
        }
        this.f1393c = eVar;
        if (this.p == 0 && this.q) {
            this.f1395e = eVar;
        } else {
            this.f1395e = this.f1391a;
        }
        this.t = this.s && this.r;
    }
}

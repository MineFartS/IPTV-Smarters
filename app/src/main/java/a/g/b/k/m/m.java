package a.g.b.k.m;

import a.g.b.k.d;
import a.g.b.k.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a.g.b.k.e f1484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f1485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e.b f1486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f1487e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1488f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1489g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f1490h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f1491i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f1492j = b.NONE;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1493a;

        static {
            int[] iArr = new int[d.b.values().length];
            f1493a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1493a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1493a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1493a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1493a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public m(a.g.b.k.e eVar) {
        this.f1484b = eVar;
    }

    @Override // a.g.b.k.m.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i2) {
        fVar.f1468l.add(fVar2);
        fVar.f1462f = i2;
        fVar2.f1467k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f1468l.add(fVar2);
        fVar.f1468l.add(this.f1487e);
        fVar.f1464h = i2;
        fVar.f1465i = gVar;
        fVar2.f1467k.add(fVar);
        gVar.f1467k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        int iMax;
        if (i3 == 0) {
            a.g.b.k.e eVar = this.f1484b;
            int i4 = eVar.q;
            iMax = Math.max(eVar.p, i2);
            if (i4 > 0) {
                iMax = Math.min(i4, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        } else {
            a.g.b.k.e eVar2 = this.f1484b;
            int i5 = eVar2.t;
            iMax = Math.max(eVar2.s, i2);
            if (i5 > 0) {
                iMax = Math.min(i5, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        }
        return iMax;
    }

    public final f h(a.g.b.k.d dVar) {
        m mVar;
        m mVar2;
        a.g.b.k.d dVar2 = dVar.f1409d;
        if (dVar2 == null) {
            return null;
        }
        a.g.b.k.e eVar = dVar2.f1407b;
        int i2 = a.f1493a[dVar2.f1408c.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                mVar2 = eVar.f1419f;
            } else if (i2 == 3) {
                mVar = eVar.f1420g;
            } else {
                if (i2 == 4) {
                    return eVar.f1420g.f1480k;
                }
                if (i2 != 5) {
                    return null;
                }
                mVar2 = eVar.f1420g;
            }
            return mVar2.f1491i;
        }
        mVar = eVar.f1419f;
        return mVar.f1490h;
    }

    public final f i(a.g.b.k.d dVar, int i2) {
        a.g.b.k.d dVar2 = dVar.f1409d;
        if (dVar2 == null) {
            return null;
        }
        a.g.b.k.e eVar = dVar2.f1407b;
        m mVar = i2 == 0 ? eVar.f1419f : eVar.f1420g;
        int i3 = a.f1493a[dVar2.f1408c.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f1491i;
        }
        return mVar.f1490h;
    }

    public long j() {
        if (this.f1487e.f1466j) {
            return r0.f1463g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f1489g;
    }

    public final void l(int i2, int i3) {
        g gVar;
        int iG;
        int i4 = this.f1483a;
        if (i4 == 0) {
            gVar = this.f1487e;
            iG = g(i3, i2);
        } else if (i4 == 1) {
            int iG2 = g(this.f1487e.f1469m, i2);
            gVar = this.f1487e;
            iG = Math.min(iG2, i3);
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    return;
                }
                a.g.b.k.e eVar = this.f1484b;
                m mVar = eVar.f1419f;
                e.b bVar = mVar.f1486d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && mVar.f1483a == 3) {
                    l lVar = eVar.f1420g;
                    if (lVar.f1486d == bVar2 && lVar.f1483a == 3) {
                        return;
                    }
                }
                if (i2 == 0) {
                    mVar = eVar.f1420g;
                }
                if (mVar.f1487e.f1466j) {
                    float fR = eVar.r();
                    this.f1487e.d(i2 == 1 ? (int) ((mVar.f1487e.f1463g / fR) + 0.5f) : (int) ((fR * mVar.f1487e.f1463g) + 0.5f));
                    return;
                }
                return;
            }
            a.g.b.k.e eVarE = this.f1484b.E();
            if (eVarE == null) {
                return;
            }
            if (!(i2 == 0 ? eVarE.f1419f : eVarE.f1420g).f1487e.f1466j) {
                return;
            }
            a.g.b.k.e eVar2 = this.f1484b;
            i3 = (int) ((r9.f1463g * (i2 == 0 ? eVar2.r : eVar2.u)) + 0.5f);
            gVar = this.f1487e;
            iG = g(i3, i2);
        }
        gVar.d(iG);
    }

    public abstract boolean m();

    public void n(d dVar, a.g.b.k.d dVar2, a.g.b.k.d dVar3, int i2) {
        f fVar;
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f1466j && fVarH2.f1466j) {
            int iB = fVarH.f1463g + dVar2.b();
            int iB2 = fVarH2.f1463g - dVar3.b();
            int i3 = iB2 - iB;
            if (!this.f1487e.f1466j && this.f1486d == e.b.MATCH_CONSTRAINT) {
                l(i2, i3);
            }
            g gVar = this.f1487e;
            if (gVar.f1466j) {
                if (gVar.f1463g == i3) {
                    this.f1490h.d(iB);
                    fVar = this.f1491i;
                } else {
                    a.g.b.k.e eVar = this.f1484b;
                    float fU = i2 == 0 ? eVar.u() : eVar.I();
                    if (fVarH == fVarH2) {
                        iB = fVarH.f1463g;
                        iB2 = fVarH2.f1463g;
                        fU = 0.5f;
                    }
                    this.f1490h.d((int) (iB + 0.5f + (((iB2 - iB) - this.f1487e.f1463g) * fU)));
                    fVar = this.f1491i;
                    iB2 = this.f1490h.f1463g + this.f1487e.f1463g;
                }
                fVar.d(iB2);
            }
        }
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }
}

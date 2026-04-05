package a.g.b.k.m;

import a.g.b.k.e;
import a.g.b.k.m.f;
import a.g.b.k.m.m;

/* JADX INFO: loaded from: classes.dex */
public class l extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f1480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f1481l;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1482a;

        static {
            int[] iArr = new int[m.b.values().length];
            f1482a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1482a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1482a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(a.g.b.k.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f1480k = fVar;
        this.f1481l = null;
        this.f1490h.f1461e = f.a.TOP;
        this.f1491i.f1461e = f.a.BOTTOM;
        fVar.f1461e = f.a.BASELINE;
        this.f1488f = 1;
    }

    @Override // a.g.b.k.m.m, a.g.b.k.m.d
    public void a(d dVar) {
        int i2;
        float fR;
        int i3 = a.f1482a[this.f1492j.ordinal()];
        if (i3 == 1) {
            p(dVar);
        } else if (i3 == 2) {
            o(dVar);
        } else if (i3 == 3) {
            a.g.b.k.e eVar = this.f1484b;
            n(dVar, eVar.D, eVar.F, 1);
            return;
        }
        g gVar = this.f1487e;
        if (gVar.f1459c && !gVar.f1466j && this.f1486d == e.b.MATCH_CONSTRAINT) {
            a.g.b.k.e eVar2 = this.f1484b;
            int i4 = eVar2.f1427n;
            if (i4 == 2) {
                a.g.b.k.e eVarE = eVar2.E();
                if (eVarE != null) {
                    if (eVarE.f1420g.f1487e.f1466j) {
                        i2 = (int) ((r7.f1463g * this.f1484b.u) + 0.5f);
                        this.f1487e.d(i2);
                    }
                }
            } else if (i4 == 3 && eVar2.f1419f.f1487e.f1466j) {
                int iS = eVar2.s();
                if (iS == -1) {
                    fR = r7.f1419f.f1487e.f1463g / this.f1484b.r();
                    i2 = (int) (fR + 0.5f);
                    this.f1487e.d(i2);
                } else if (iS != 0) {
                    if (iS != 1) {
                        i2 = 0;
                        this.f1487e.d(i2);
                    }
                    fR = r7.f1419f.f1487e.f1463g / this.f1484b.r();
                    i2 = (int) (fR + 0.5f);
                    this.f1487e.d(i2);
                } else {
                    fR = r7.f1419f.f1487e.f1463g * this.f1484b.r();
                    i2 = (int) (fR + 0.5f);
                    this.f1487e.d(i2);
                }
            }
        }
        f fVar = this.f1490h;
        if (fVar.f1459c) {
            f fVar2 = this.f1491i;
            if (fVar2.f1459c) {
                if (fVar.f1466j && fVar2.f1466j && this.f1487e.f1466j) {
                    return;
                }
                if (!this.f1487e.f1466j && this.f1486d == e.b.MATCH_CONSTRAINT) {
                    a.g.b.k.e eVar3 = this.f1484b;
                    if (eVar3.f1426m == 0 && !eVar3.V()) {
                        f fVar3 = this.f1490h.f1468l.get(0);
                        f fVar4 = this.f1491i.f1468l.get(0);
                        int i5 = fVar3.f1463g;
                        f fVar5 = this.f1490h;
                        int i6 = i5 + fVar5.f1462f;
                        int i7 = fVar4.f1463g + this.f1491i.f1462f;
                        fVar5.d(i6);
                        this.f1491i.d(i7);
                        this.f1487e.d(i7 - i6);
                        return;
                    }
                }
                if (!this.f1487e.f1466j && this.f1486d == e.b.MATCH_CONSTRAINT && this.f1483a == 1 && this.f1490h.f1468l.size() > 0 && this.f1491i.f1468l.size() > 0) {
                    f fVar6 = this.f1490h.f1468l.get(0);
                    int i8 = (this.f1491i.f1468l.get(0).f1463g + this.f1491i.f1462f) - (fVar6.f1463g + this.f1490h.f1462f);
                    g gVar2 = this.f1487e;
                    int i9 = gVar2.f1469m;
                    if (i8 < i9) {
                        gVar2.d(i8);
                    } else {
                        gVar2.d(i9);
                    }
                }
                if (this.f1487e.f1466j && this.f1490h.f1468l.size() > 0 && this.f1491i.f1468l.size() > 0) {
                    f fVar7 = this.f1490h.f1468l.get(0);
                    f fVar8 = this.f1491i.f1468l.get(0);
                    int i10 = fVar7.f1463g + this.f1490h.f1462f;
                    int i11 = fVar8.f1463g + this.f1491i.f1462f;
                    float fI = this.f1484b.I();
                    if (fVar7 == fVar8) {
                        i10 = fVar7.f1463g;
                        i11 = fVar8.f1463g;
                        fI = 0.5f;
                    }
                    this.f1490h.d((int) (i10 + 0.5f + (((i11 - i10) - this.f1487e.f1463g) * fI)));
                    this.f1491i.d(this.f1490h.f1463g + this.f1487e.f1463g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x02e3, code lost:
    
        if (r9.f1484b.Q() != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02e5, code lost:
    
        r0 = r9.f1480k;
        r1 = r9.f1490h;
        r2 = r9.f1481l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0370, code lost:
    
        if (r9.f1484b.Q() != false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03e9 A[PHI: r0
  0x03e9: PHI (r0v34 a.g.b.k.m.j) = (r0v23 a.g.b.k.m.j), (r0v50 a.g.b.k.m.j) binds: [B:151:0x03e7, B:125:0x033e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    @Override // a.g.b.k.m.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.k.m.l.d():void");
    }

    @Override // a.g.b.k.m.m
    public void e() {
        f fVar = this.f1490h;
        if (fVar.f1466j) {
            this.f1484b.D0(fVar.f1463g);
        }
    }

    @Override // a.g.b.k.m.m
    public void f() {
        this.f1485c = null;
        this.f1490h.c();
        this.f1491i.c();
        this.f1480k.c();
        this.f1487e.c();
        this.f1489g = false;
    }

    @Override // a.g.b.k.m.m
    public boolean m() {
        return this.f1486d != e.b.MATCH_CONSTRAINT || this.f1484b.f1427n == 0;
    }

    public void q() {
        this.f1489g = false;
        this.f1490h.c();
        this.f1490h.f1466j = false;
        this.f1491i.c();
        this.f1491i.f1466j = false;
        this.f1480k.c();
        this.f1480k.f1466j = false;
        this.f1487e.f1466j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f1484b.p();
    }
}

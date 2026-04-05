package a.g.b.k.m;

import a.g.b.k.m.f;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class i extends m {
    public i(a.g.b.k.e eVar) {
        super(eVar);
    }

    @Override // a.g.b.k.m.m, a.g.b.k.m.d
    public void a(d dVar) {
        a.g.b.k.a aVar = (a.g.b.k.a) this.f1484b;
        int iI0 = aVar.I0();
        Iterator<f> it = this.f1490h.f1468l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = it.next().f1463g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (iI0 == 0 || iI0 == 2) {
            this.f1490h.d(i3 + aVar.J0());
        } else {
            this.f1490h.d(i2 + aVar.J0());
        }
    }

    @Override // a.g.b.k.m.m
    public void d() {
        m mVar;
        a.g.b.k.e eVar = this.f1484b;
        if (eVar instanceof a.g.b.k.a) {
            this.f1490h.f1458b = true;
            a.g.b.k.a aVar = (a.g.b.k.a) eVar;
            int iI0 = aVar.I0();
            boolean zH0 = aVar.H0();
            int i2 = 0;
            if (iI0 == 0) {
                this.f1490h.f1461e = f.a.LEFT;
                while (i2 < aVar.x0) {
                    a.g.b.k.e eVar2 = aVar.w0[i2];
                    if (zH0 || eVar2.M() != 8) {
                        f fVar = eVar2.f1419f.f1490h;
                        fVar.f1467k.add(this.f1490h);
                        this.f1490h.f1468l.add(fVar);
                    }
                    i2++;
                }
            } else {
                if (iI0 != 1) {
                    if (iI0 == 2) {
                        this.f1490h.f1461e = f.a.TOP;
                        while (i2 < aVar.x0) {
                            a.g.b.k.e eVar3 = aVar.w0[i2];
                            if (zH0 || eVar3.M() != 8) {
                                f fVar2 = eVar3.f1420g.f1490h;
                                fVar2.f1467k.add(this.f1490h);
                                this.f1490h.f1468l.add(fVar2);
                            }
                            i2++;
                        }
                    } else {
                        if (iI0 != 3) {
                            return;
                        }
                        this.f1490h.f1461e = f.a.BOTTOM;
                        while (i2 < aVar.x0) {
                            a.g.b.k.e eVar4 = aVar.w0[i2];
                            if (zH0 || eVar4.M() != 8) {
                                f fVar3 = eVar4.f1420g.f1491i;
                                fVar3.f1467k.add(this.f1490h);
                                this.f1490h.f1468l.add(fVar3);
                            }
                            i2++;
                        }
                    }
                    q(this.f1484b.f1420g.f1490h);
                    mVar = this.f1484b.f1420g;
                    q(mVar.f1491i);
                }
                this.f1490h.f1461e = f.a.RIGHT;
                while (i2 < aVar.x0) {
                    a.g.b.k.e eVar5 = aVar.w0[i2];
                    if (zH0 || eVar5.M() != 8) {
                        f fVar4 = eVar5.f1419f.f1491i;
                        fVar4.f1467k.add(this.f1490h);
                        this.f1490h.f1468l.add(fVar4);
                    }
                    i2++;
                }
            }
            q(this.f1484b.f1419f.f1490h);
            mVar = this.f1484b.f1419f;
            q(mVar.f1491i);
        }
    }

    @Override // a.g.b.k.m.m
    public void e() {
        a.g.b.k.e eVar = this.f1484b;
        if (eVar instanceof a.g.b.k.a) {
            int iI0 = ((a.g.b.k.a) eVar).I0();
            if (iI0 == 0 || iI0 == 1) {
                this.f1484b.C0(this.f1490h.f1463g);
            } else {
                this.f1484b.D0(this.f1490h.f1463g);
            }
        }
    }

    @Override // a.g.b.k.m.m
    public void f() {
        this.f1485c = null;
        this.f1490h.c();
    }

    @Override // a.g.b.k.m.m
    public boolean m() {
        return false;
    }

    public final void q(f fVar) {
        this.f1490h.f1467k.add(fVar);
        fVar.f1468l.add(this.f1490h);
    }
}

package a.g.b.k.m;

/* JADX INFO: loaded from: classes.dex */
public class h extends m {
    public h(a.g.b.k.e eVar) {
        super(eVar);
        eVar.f1419f.f();
        eVar.f1420g.f();
        this.f1488f = ((a.g.b.k.g) eVar).H0();
    }

    @Override // a.g.b.k.m.m, a.g.b.k.m.d
    public void a(d dVar) {
        f fVar = this.f1490h;
        if (fVar.f1459c && !fVar.f1466j) {
            this.f1490h.d((int) ((fVar.f1468l.get(0).f1463g * ((a.g.b.k.g) this.f1484b).K0()) + 0.5f));
        }
    }

    @Override // a.g.b.k.m.m
    public void d() {
        f fVar;
        m mVar;
        f fVar2;
        a.g.b.k.g gVar = (a.g.b.k.g) this.f1484b;
        int iI0 = gVar.I0();
        int iJ0 = gVar.J0();
        gVar.K0();
        if (gVar.H0() == 1) {
            f fVar3 = this.f1490h;
            if (iI0 != -1) {
                fVar3.f1468l.add(this.f1484b.O.f1419f.f1490h);
                this.f1484b.O.f1419f.f1490h.f1467k.add(this.f1490h);
                fVar2 = this.f1490h;
            } else if (iJ0 != -1) {
                fVar3.f1468l.add(this.f1484b.O.f1419f.f1491i);
                this.f1484b.O.f1419f.f1491i.f1467k.add(this.f1490h);
                fVar2 = this.f1490h;
                iI0 = -iJ0;
            } else {
                fVar3.f1458b = true;
                fVar3.f1468l.add(this.f1484b.O.f1419f.f1491i);
                this.f1484b.O.f1419f.f1491i.f1467k.add(this.f1490h);
                q(this.f1484b.f1419f.f1490h);
                mVar = this.f1484b.f1419f;
            }
            fVar2.f1462f = iI0;
            q(this.f1484b.f1419f.f1490h);
            mVar = this.f1484b.f1419f;
        } else {
            f fVar4 = this.f1490h;
            if (iI0 != -1) {
                fVar4.f1468l.add(this.f1484b.O.f1420g.f1490h);
                this.f1484b.O.f1420g.f1490h.f1467k.add(this.f1490h);
                fVar = this.f1490h;
            } else if (iJ0 != -1) {
                fVar4.f1468l.add(this.f1484b.O.f1420g.f1491i);
                this.f1484b.O.f1420g.f1491i.f1467k.add(this.f1490h);
                fVar = this.f1490h;
                iI0 = -iJ0;
            } else {
                fVar4.f1458b = true;
                fVar4.f1468l.add(this.f1484b.O.f1420g.f1491i);
                this.f1484b.O.f1420g.f1491i.f1467k.add(this.f1490h);
                q(this.f1484b.f1420g.f1490h);
                mVar = this.f1484b.f1420g;
            }
            fVar.f1462f = iI0;
            q(this.f1484b.f1420g.f1490h);
            mVar = this.f1484b.f1420g;
        }
        q(mVar.f1491i);
    }

    @Override // a.g.b.k.m.m
    public void e() {
        if (((a.g.b.k.g) this.f1484b).H0() == 1) {
            this.f1484b.C0(this.f1490h.f1463g);
        } else {
            this.f1484b.D0(this.f1490h.f1463g);
        }
    }

    @Override // a.g.b.k.m.m
    public void f() {
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

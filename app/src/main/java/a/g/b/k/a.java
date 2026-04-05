package a.g.b.k;

import a.g.b.k.e;

/* JADX INFO: loaded from: classes.dex */
public class a extends i {
    public int y0 = 0;
    public boolean z0 = true;
    public int A0 = 0;

    public boolean H0() {
        return this.z0;
    }

    public int I0() {
        return this.y0;
    }

    public int J0() {
        return this.A0;
    }

    public void K0() {
        for (int i2 = 0; i2 < this.x0; i2++) {
            e eVar = this.w0[i2];
            int i3 = this.y0;
            if (i3 == 0 || i3 == 1) {
                eVar.l0(0, true);
            } else if (i3 == 2 || i3 == 3) {
                eVar.l0(1, true);
            }
        }
    }

    public void L0(boolean z) {
        this.z0 = z;
    }

    public void M0(int i2) {
        this.y0 = i2;
    }

    public void N0(int i2) {
        this.A0 = i2;
    }

    @Override // a.g.b.k.e
    public void f(a.g.b.d dVar) {
        d[] dVarArr;
        boolean z;
        a.g.b.i iVar;
        d dVar2;
        int i2;
        int i3;
        int i4;
        d[] dVarArr2 = this.K;
        dVarArr2[0] = this.C;
        dVarArr2[2] = this.D;
        dVarArr2[1] = this.E;
        dVarArr2[3] = this.F;
        int i5 = 0;
        while (true) {
            dVarArr = this.K;
            if (i5 >= dVarArr.length) {
                break;
            }
            dVarArr[i5].f1412g = dVar.q(dVarArr[i5]);
            i5++;
        }
        int i6 = this.y0;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i6];
        for (int i7 = 0; i7 < this.x0; i7++) {
            e eVar = this.w0[i7];
            if ((this.z0 || eVar.g()) && ((((i3 = this.y0) == 0 || i3 == 1) && eVar.w() == e.b.MATCH_CONSTRAINT && eVar.C.f1409d != null && eVar.E.f1409d != null) || (((i4 = this.y0) == 2 || i4 == 3) && eVar.K() == e.b.MATCH_CONSTRAINT && eVar.D.f1409d != null && eVar.F.f1409d != null))) {
                z = true;
                break;
            }
        }
        z = false;
        boolean z2 = this.C.h() || this.E.h();
        boolean z3 = this.D.h() || this.F.h();
        int i8 = !z && (((i2 = this.y0) == 0 && z2) || ((i2 == 2 && z3) || ((i2 == 1 && z2) || (i2 == 3 && z3)))) ? 5 : 4;
        for (int i9 = 0; i9 < this.x0; i9++) {
            e eVar2 = this.w0[i9];
            if (this.z0 || eVar2.g()) {
                a.g.b.i iVarQ = dVar.q(eVar2.K[this.y0]);
                d[] dVarArr3 = eVar2.K;
                int i10 = this.y0;
                dVarArr3[i10].f1412g = iVarQ;
                int i11 = (dVarArr3[i10].f1409d == null || dVarArr3[i10].f1409d.f1407b != this) ? 0 : dVarArr3[i10].f1410e + 0;
                if (i10 == 0 || i10 == 2) {
                    dVar.i(dVar3.f1412g, iVarQ, this.A0 - i11, z);
                } else {
                    dVar.g(dVar3.f1412g, iVarQ, this.A0 + i11, z);
                }
                dVar.e(dVar3.f1412g, iVarQ, this.A0 + i11, i8);
            }
        }
        int i12 = this.y0;
        if (i12 == 0) {
            dVar.e(this.E.f1412g, this.C.f1412g, 0, 8);
            dVar.e(this.C.f1412g, this.O.E.f1412g, 0, 4);
            iVar = this.C.f1412g;
            dVar2 = this.O.C;
        } else if (i12 == 1) {
            dVar.e(this.C.f1412g, this.E.f1412g, 0, 8);
            dVar.e(this.C.f1412g, this.O.C.f1412g, 0, 4);
            iVar = this.C.f1412g;
            dVar2 = this.O.E;
        } else if (i12 == 2) {
            dVar.e(this.F.f1412g, this.D.f1412g, 0, 8);
            dVar.e(this.D.f1412g, this.O.F.f1412g, 0, 4);
            iVar = this.D.f1412g;
            dVar2 = this.O.D;
        } else {
            if (i12 != 3) {
                return;
            }
            dVar.e(this.D.f1412g, this.F.f1412g, 0, 8);
            dVar.e(this.D.f1412g, this.O.D.f1412g, 0, 4);
            iVar = this.D.f1412g;
            dVar2 = this.O.F;
        }
        dVar.e(iVar, dVar2.f1412g, 0, 0);
    }

    @Override // a.g.b.k.e
    public boolean g() {
        return true;
    }

    @Override // a.g.b.k.e
    public String toString() {
        String str = "[Barrier] " + p() + " {";
        for (int i2 = 0; i2 < this.x0; i2++) {
            e eVar = this.w0[i2];
            if (i2 > 0) {
                str = str + ", ";
            }
            str = str + eVar.p();
        }
        return str + "}";
    }
}

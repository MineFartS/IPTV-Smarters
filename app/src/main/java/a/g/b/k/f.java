package a.g.b.k;

import a.g.b.k.e;
import a.g.b.k.m.b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class f extends l {
    public a.g.b.e B0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public a.g.b.k.m.b x0 = new a.g.b.k.m.b(this);
    public a.g.b.k.m.e y0 = new a.g.b.k.m.e(this);
    public b.InterfaceC0023b z0 = null;
    public boolean A0 = false;
    public a.g.b.d C0 = new a.g.b.d();
    public int H0 = 0;
    public int I0 = 0;
    public c[] J0 = new c[4];
    public c[] K0 = new c[4];
    public boolean L0 = false;
    public boolean M0 = false;
    public boolean N0 = false;
    public int O0 = 0;
    public int P0 = 0;
    public int Q0 = 263;
    public boolean R0 = false;
    public boolean S0 = false;
    public boolean T0 = false;
    public int U0 = 0;

    @Override // a.g.b.k.e
    public void F0(boolean z, boolean z2) {
        super.F0(z, z2);
        int size = this.w0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.w0.get(i2).F0(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01c5 A[PHI: r0 r5
  0x01c5: PHI (r0v26 boolean) = (r0v25 boolean), (r0v28 boolean), (r0v28 boolean), (r0v28 boolean) binds: [B:70:0x018a, B:78:0x01ad, B:79:0x01af, B:81:0x01b5] A[DONT_GENERATE, DONT_INLINE]
  0x01c5: PHI (r5v11 boolean) = (r5v10 boolean), (r5v13 boolean), (r5v13 boolean), (r5v13 boolean) binds: [B:70:0x018a, B:78:0x01ad, B:79:0x01af, B:81:0x01b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    @Override // a.g.b.k.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void H0() {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.k.f.H0():void");
    }

    public void K0(e eVar, int i2) {
        if (i2 == 0) {
            M0(eVar);
        } else if (i2 == 1) {
            N0(eVar);
        }
    }

    public boolean L0(a.g.b.d dVar) {
        f(dVar);
        int size = this.w0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = this.w0.get(i2);
            eVar.l0(0, false);
            eVar.l0(1, false);
            if (eVar instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = this.w0.get(i3);
                if (eVar2 instanceof a) {
                    ((a) eVar2).K0();
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            e eVar3 = this.w0.get(i4);
            if (eVar3.e()) {
                eVar3.f(dVar);
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            e eVar4 = this.w0.get(i5);
            if (eVar4 instanceof f) {
                e.b[] bVarArr = eVar4.N;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                e.b bVar3 = e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar4.i0(e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar4.x0(e.b.FIXED);
                }
                eVar4.f(dVar);
                if (bVar == bVar3) {
                    eVar4.i0(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar4.x0(bVar2);
                }
            } else {
                j.a(this, dVar, eVar4);
                if (!eVar4.e()) {
                    eVar4.f(dVar);
                }
            }
        }
        if (this.H0 > 0) {
            b.a(this, dVar, 0);
        }
        if (this.I0 > 0) {
            b.a(this, dVar, 1);
        }
        return true;
    }

    public final void M0(e eVar) {
        int i2 = this.H0 + 1;
        c[] cVarArr = this.K0;
        if (i2 >= cVarArr.length) {
            this.K0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.K0[this.H0] = new c(eVar, 0, W0());
        this.H0++;
    }

    public final void N0(e eVar) {
        int i2 = this.I0 + 1;
        c[] cVarArr = this.J0;
        if (i2 >= cVarArr.length) {
            this.J0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.J0[this.I0] = new c(eVar, 1, W0());
        this.I0++;
    }

    public boolean O0(boolean z) {
        return this.y0.f(z);
    }

    public boolean P0(boolean z) {
        return this.y0.g(z);
    }

    public boolean Q0(boolean z, int i2) {
        return this.y0.h(z, i2);
    }

    public b.InterfaceC0023b R0() {
        return this.z0;
    }

    public int S0() {
        return this.Q0;
    }

    public void T0() {
        this.y0.j();
    }

    public void U0() {
        this.y0.k();
    }

    public boolean V0() {
        return this.T0;
    }

    @Override // a.g.b.k.l, a.g.b.k.e
    public void W() {
        this.C0.D();
        this.D0 = 0;
        this.F0 = 0;
        this.E0 = 0;
        this.G0 = 0;
        this.R0 = false;
        super.W();
    }

    public boolean W0() {
        return this.A0;
    }

    public boolean X0() {
        return this.S0;
    }

    public long Y0(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.D0 = i9;
        this.E0 = i10;
        return this.x0.d(this, i2, i9, i10, i3, i4, i5, i6, i7, i8);
    }

    public boolean Z0(int i2) {
        return (this.Q0 & i2) == i2;
    }

    public final void a1() {
        this.H0 = 0;
        this.I0 = 0;
    }

    public void b1(b.InterfaceC0023b interfaceC0023b) {
        this.z0 = interfaceC0023b;
        this.y0.n(interfaceC0023b);
    }

    public void c1(int i2) {
        this.Q0 = i2;
        a.g.b.d.f1336c = j.b(i2, 256);
    }

    public void d1(boolean z) {
        this.A0 = z;
    }

    public void e1(a.g.b.d dVar, boolean[] zArr) {
        zArr[2] = false;
        G0(dVar);
        int size = this.w0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.w0.get(i2).G0(dVar);
        }
    }

    public void f1() {
        this.x0.e(this);
    }
}

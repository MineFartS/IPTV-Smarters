package a.g.b.k;

import a.g.b.k.d;
import a.g.b.k.e;

/* JADX INFO: loaded from: classes.dex */
public class g extends e {
    public float w0 = -1.0f;
    public int x0 = -1;
    public int y0 = -1;
    public d z0 = this.D;
    public int A0 = 0;
    public int B0 = 0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1431a;

        static {
            int[] iArr = new int[d.b.values().length];
            f1431a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1431a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1431a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1431a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1431a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1431a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1431a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1431a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1431a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.L.clear();
        this.L.add(this.z0);
        int length = this.K.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.K[i2] = this.z0;
        }
    }

    @Override // a.g.b.k.e
    public void G0(a.g.b.d dVar) {
        if (E() == null) {
            return;
        }
        int iX = dVar.x(this.z0);
        if (this.A0 == 1) {
            C0(iX);
            D0(0);
            e0(E().t());
            B0(0);
            return;
        }
        C0(0);
        D0(iX);
        B0(E().N());
        e0(0);
    }

    public int H0() {
        return this.A0;
    }

    public int I0() {
        return this.x0;
    }

    public int J0() {
        return this.y0;
    }

    public float K0() {
        return this.w0;
    }

    public void L0(int i2) {
        if (i2 > -1) {
            this.w0 = -1.0f;
            this.x0 = i2;
            this.y0 = -1;
        }
    }

    public void M0(int i2) {
        if (i2 > -1) {
            this.w0 = -1.0f;
            this.x0 = -1;
            this.y0 = i2;
        }
    }

    public void N0(float f2) {
        if (f2 > -1.0f) {
            this.w0 = f2;
            this.x0 = -1;
            this.y0 = -1;
        }
    }

    public void O0(int i2) {
        if (this.A0 == i2) {
            return;
        }
        this.A0 = i2;
        this.L.clear();
        this.z0 = this.A0 == 1 ? this.C : this.D;
        this.L.add(this.z0);
        int length = this.K.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.K[i3] = this.z0;
        }
    }

    @Override // a.g.b.k.e
    public void f(a.g.b.d dVar) {
        f fVar = (f) E();
        if (fVar == null) {
            return;
        }
        d dVarK = fVar.k(d.b.LEFT);
        d dVarK2 = fVar.k(d.b.RIGHT);
        e eVar = this.O;
        boolean z = eVar != null && eVar.N[0] == e.b.WRAP_CONTENT;
        if (this.A0 == 0) {
            dVarK = fVar.k(d.b.TOP);
            dVarK2 = fVar.k(d.b.BOTTOM);
            e eVar2 = this.O;
            z = eVar2 != null && eVar2.N[1] == e.b.WRAP_CONTENT;
        }
        if (this.x0 != -1) {
            a.g.b.i iVarQ = dVar.q(this.z0);
            dVar.e(iVarQ, dVar.q(dVarK), this.x0, 8);
            if (z) {
                dVar.h(dVar.q(dVarK2), iVarQ, 0, 5);
                return;
            }
            return;
        }
        if (this.y0 == -1) {
            if (this.w0 != -1.0f) {
                dVar.d(a.g.b.d.s(dVar, dVar.q(this.z0), dVar.q(dVarK2), this.w0));
                return;
            }
            return;
        }
        a.g.b.i iVarQ2 = dVar.q(this.z0);
        a.g.b.i iVarQ3 = dVar.q(dVarK2);
        dVar.e(iVarQ2, iVarQ3, -this.y0, 8);
        if (z) {
            dVar.h(iVarQ2, dVar.q(dVarK), 0, 5);
            dVar.h(iVarQ3, iVarQ2, 0, 5);
        }
    }

    @Override // a.g.b.k.e
    public boolean g() {
        return true;
    }

    @Override // a.g.b.k.e
    public d k(d.b bVar) {
        switch (a.f1431a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.A0 == 1) {
                    return this.z0;
                }
                break;
            case 3:
            case 4:
                if (this.A0 == 0) {
                    return this.z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}

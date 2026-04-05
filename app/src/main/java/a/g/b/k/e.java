package a.g.b.k;

import a.g.b.k.d;
import a.g.b.k.m.m;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static float f1414a = 0.5f;
    public boolean A;
    public d J;
    public d[] K;
    public ArrayList<d> L;
    public boolean[] M;
    public b[] N;
    public e O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public int b0;
    public float c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a.g.b.k.m.c f1417d;
    public float d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a.g.b.k.m.c f1418e;
    public Object e0;
    public int f0;
    public int g0;
    public String h0;
    public String i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public float[] r0;
    public e[] s0;
    public e[] t0;
    public e u0;
    public e v0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1415b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m[] f1416c = new m[2];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a.g.b.k.m.j f1419f = new a.g.b.k.m.j(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a.g.b.k.m.l f1420g = new a.g.b.k.m.l(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean[] f1421h = {true, true};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f1422i = {0, 0, 0, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1423j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1424k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1425l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1426m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1427n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f1428o = new int[2];
    public int p = 0;
    public int q = 0;
    public float r = 1.0f;
    public int s = 0;
    public int t = 0;
    public float u = 1.0f;
    public int v = -1;
    public float w = 1.0f;
    public int[] x = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float y = 0.0f;
    public boolean z = false;
    public boolean B = false;
    public d C = new d(this, d.b.LEFT);
    public d D = new d(this, d.b.TOP);
    public d E = new d(this, d.b.RIGHT);
    public d F = new d(this, d.b.BOTTOM);
    public d G = new d(this, d.b.BASELINE);
    public d H = new d(this, d.b.CENTER_X);
    public d I = new d(this, d.b.CENTER_Y);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1430b;

        static {
            int[] iArr = new int[b.values().length];
            f1430b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1430b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1430b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1430b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f1429a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1429a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1429a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1429a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1429a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1429a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1429a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1429a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1429a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.J = dVar;
        this.K = new d[]{this.C, this.E, this.D, this.F, this.G, dVar};
        this.L = new ArrayList<>();
        this.M = new boolean[2];
        b bVar = b.FIXED;
        this.N = new b[]{bVar, bVar};
        this.O = null;
        this.P = 0;
        this.Q = 0;
        this.R = 0.0f;
        this.S = -1;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        float f2 = f1414a;
        this.c0 = f2;
        this.d0 = f2;
        this.f0 = 0;
        this.g0 = 0;
        this.h0 = null;
        this.i0 = null;
        this.l0 = false;
        this.m0 = false;
        this.n0 = 0;
        this.o0 = 0;
        this.r0 = new float[]{-1.0f, -1.0f};
        this.s0 = new e[]{null, null};
        this.t0 = new e[]{null, null};
        this.u0 = null;
        this.v0 = null;
        d();
    }

    public int A() {
        return this.x[0];
    }

    public void A0(int i2) {
        this.g0 = i2;
    }

    public int B() {
        return this.b0;
    }

    public void B0(int i2) {
        this.P = i2;
        int i3 = this.a0;
        if (i2 < i3) {
            this.P = i3;
        }
    }

    public int C() {
        return this.a0;
    }

    public void C0(int i2) {
        this.T = i2;
    }

    public e D(int i2) {
        d dVar;
        d dVar2;
        if (i2 != 0) {
            if (i2 == 1 && (dVar2 = (dVar = this.F).f1409d) != null && dVar2.f1409d == dVar) {
                return dVar2.f1407b;
            }
            return null;
        }
        d dVar3 = this.E;
        d dVar4 = dVar3.f1409d;
        if (dVar4 == null || dVar4.f1409d != dVar3) {
            return null;
        }
        return dVar4.f1407b;
    }

    public void D0(int i2) {
        this.U = i2;
    }

    public e E() {
        return this.O;
    }

    public void E0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.v == -1) {
            if (z3 && !z4) {
                this.v = 0;
            } else if (!z3 && z4) {
                this.v = 1;
                if (this.S == -1) {
                    this.w = 1.0f / this.w;
                }
            }
        }
        if (this.v == 0 && (!this.D.i() || !this.F.i())) {
            this.v = 1;
        } else if (this.v == 1 && (!this.C.i() || !this.E.i())) {
            this.v = 0;
        }
        if (this.v == -1 && (!this.D.i() || !this.F.i() || !this.C.i() || !this.E.i())) {
            if (this.D.i() && this.F.i()) {
                this.v = 0;
            } else if (this.C.i() && this.E.i()) {
                this.w = 1.0f / this.w;
                this.v = 1;
            }
        }
        if (this.v == -1) {
            int i2 = this.p;
            if (i2 > 0 && this.s == 0) {
                this.v = 0;
            } else {
                if (i2 != 0 || this.s <= 0) {
                    return;
                }
                this.w = 1.0f / this.w;
                this.v = 1;
            }
        }
    }

    public e F(int i2) {
        d dVar;
        d dVar2;
        if (i2 != 0) {
            if (i2 == 1 && (dVar2 = (dVar = this.D).f1409d) != null && dVar2.f1409d == dVar) {
                return dVar2.f1407b;
            }
            return null;
        }
        d dVar3 = this.C;
        d dVar4 = dVar3.f1409d;
        if (dVar4 == null || dVar4.f1409d != dVar3) {
            return null;
        }
        return dVar4.f1407b;
    }

    public void F0(boolean z, boolean z2) {
        int i2;
        int i3;
        boolean zK = z & this.f1419f.k();
        boolean zK2 = z2 & this.f1420g.k();
        a.g.b.k.m.j jVar = this.f1419f;
        int i4 = jVar.f1490h.f1463g;
        a.g.b.k.m.l lVar = this.f1420g;
        int i5 = lVar.f1490h.f1463g;
        int i6 = jVar.f1491i.f1463g;
        int i7 = lVar.f1491i.f1463g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i4 = 0;
            i7 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (zK) {
            this.T = i4;
        }
        if (zK2) {
            this.U = i5;
        }
        if (this.g0 == 8) {
            this.P = 0;
            this.Q = 0;
            return;
        }
        if (zK) {
            if (this.N[0] == b.FIXED && i9 < (i3 = this.P)) {
                i9 = i3;
            }
            this.P = i9;
            int i11 = this.a0;
            if (i9 < i11) {
                this.P = i11;
            }
        }
        if (zK2) {
            if (this.N[1] == b.FIXED && i10 < (i2 = this.Q)) {
                i10 = i2;
            }
            this.Q = i10;
            int i12 = this.b0;
            if (i10 < i12) {
                this.Q = i12;
            }
        }
    }

    public int G() {
        return O() + this.P;
    }

    public void G0(a.g.b.d dVar) {
        int iX = dVar.x(this.C);
        int iX2 = dVar.x(this.D);
        int iX3 = dVar.x(this.E);
        int iX4 = dVar.x(this.F);
        a.g.b.k.m.j jVar = this.f1419f;
        a.g.b.k.m.f fVar = jVar.f1490h;
        if (fVar.f1466j) {
            a.g.b.k.m.f fVar2 = jVar.f1491i;
            if (fVar2.f1466j) {
                iX = fVar.f1463g;
                iX3 = fVar2.f1463g;
            }
        }
        a.g.b.k.m.l lVar = this.f1420g;
        a.g.b.k.m.f fVar3 = lVar.f1490h;
        if (fVar3.f1466j) {
            a.g.b.k.m.f fVar4 = lVar.f1491i;
            if (fVar4.f1466j) {
                iX2 = fVar3.f1463g;
                iX4 = fVar4.f1463g;
            }
        }
        int i2 = iX4 - iX2;
        if (iX3 - iX < 0 || i2 < 0 || iX == Integer.MIN_VALUE || iX == Integer.MAX_VALUE || iX2 == Integer.MIN_VALUE || iX2 == Integer.MAX_VALUE || iX3 == Integer.MIN_VALUE || iX3 == Integer.MAX_VALUE || iX4 == Integer.MIN_VALUE || iX4 == Integer.MAX_VALUE) {
            iX4 = 0;
            iX = 0;
            iX2 = 0;
            iX3 = 0;
        }
        c0(iX, iX2, iX3, iX4);
    }

    public m H(int i2) {
        if (i2 == 0) {
            return this.f1419f;
        }
        if (i2 == 1) {
            return this.f1420g;
        }
        return null;
    }

    public float I() {
        return this.d0;
    }

    public int J() {
        return this.o0;
    }

    public b K() {
        return this.N[1];
    }

    public int L() {
        int i2 = this.C != null ? 0 + this.D.f1410e : 0;
        return this.E != null ? i2 + this.F.f1410e : i2;
    }

    public int M() {
        return this.g0;
    }

    public int N() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.P;
    }

    public int O() {
        e eVar = this.O;
        return (eVar == null || !(eVar instanceof f)) ? this.T : ((f) eVar).D0 + this.T;
    }

    public int P() {
        e eVar = this.O;
        return (eVar == null || !(eVar instanceof f)) ? this.U : ((f) eVar).E0 + this.U;
    }

    public boolean Q() {
        return this.z;
    }

    public void R(d.b bVar, e eVar, d.b bVar2, int i2, int i3) {
        k(bVar).a(eVar.k(bVar2), i2, i3, true);
    }

    public final boolean S(int i2) {
        int i3 = i2 * 2;
        d[] dVarArr = this.K;
        if (dVarArr[i3].f1409d != null && dVarArr[i3].f1409d.f1409d != dVarArr[i3]) {
            int i4 = i3 + 1;
            if (dVarArr[i4].f1409d != null && dVarArr[i4].f1409d.f1409d == dVarArr[i4]) {
                return true;
            }
        }
        return false;
    }

    public boolean T() {
        d dVar = this.C;
        d dVar2 = dVar.f1409d;
        if (dVar2 != null && dVar2.f1409d == dVar) {
            return true;
        }
        d dVar3 = this.E;
        d dVar4 = dVar3.f1409d;
        return dVar4 != null && dVar4.f1409d == dVar3;
    }

    public boolean U() {
        return this.A;
    }

    public boolean V() {
        d dVar = this.D;
        d dVar2 = dVar.f1409d;
        if (dVar2 != null && dVar2.f1409d == dVar) {
            return true;
        }
        d dVar3 = this.F;
        d dVar4 = dVar3.f1409d;
        return dVar4 != null && dVar4.f1409d == dVar3;
    }

    public void W() {
        this.C.k();
        this.D.k();
        this.E.k();
        this.F.k();
        this.G.k();
        this.H.k();
        this.I.k();
        this.J.k();
        this.O = null;
        this.y = 0.0f;
        this.P = 0;
        this.Q = 0;
        this.R = 0.0f;
        this.S = -1;
        this.T = 0;
        this.U = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        float f2 = f1414a;
        this.c0 = f2;
        this.d0 = f2;
        b[] bVarArr = this.N;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.e0 = null;
        this.f0 = 0;
        this.g0 = 0;
        this.i0 = null;
        this.j0 = false;
        this.k0 = false;
        this.n0 = 0;
        this.o0 = 0;
        this.p0 = false;
        this.q0 = false;
        float[] fArr = this.r0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1424k = -1;
        this.f1425l = -1;
        int[] iArr = this.x;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f1426m = 0;
        this.f1427n = 0;
        this.r = 1.0f;
        this.u = 1.0f;
        this.q = Integer.MAX_VALUE;
        this.t = Integer.MAX_VALUE;
        this.p = 0;
        this.s = 0;
        this.f1423j = false;
        this.v = -1;
        this.w = 1.0f;
        this.l0 = false;
        this.m0 = false;
        boolean[] zArr = this.f1421h;
        zArr[0] = true;
        zArr[1] = true;
        this.B = false;
        boolean[] zArr2 = this.M;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void X(a.g.b.c cVar) {
        this.C.l(cVar);
        this.D.l(cVar);
        this.E.l(cVar);
        this.F.l(cVar);
        this.G.l(cVar);
        this.J.l(cVar);
        this.H.l(cVar);
        this.I.l(cVar);
    }

    public void Y(int i2) {
        this.Z = i2;
        this.z = i2 > 0;
    }

    public void Z(Object obj) {
        this.e0 = obj;
    }

    public void a0(String str) {
        this.h0 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[PHI: r0
  0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L8e
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L8e
        Lb:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L37
            int r6 = r2 + (-1)
            if (r3 >= r6) goto L37
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2c
            r1 = 0
            goto L35
        L2c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L35
            r1 = 1
        L35:
            int r4 = r3 + 1
        L37:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L75
            int r2 = r2 - r5
            if (r3 >= r2) goto L75
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L84
            int r3 = r9.length()
            if (r3 <= 0) goto L84
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            if (r1 != r5) goto L6f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L6f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L75:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L84:
            r9 = 0
        L85:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8d
            r8.R = r9
            r8.S = r1
        L8d:
            return
        L8e:
            r8.R = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.k.e.b0(java.lang.String):void");
    }

    public void c0(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.T = i2;
        this.U = i3;
        if (this.g0 == 8) {
            this.P = 0;
            this.Q = 0;
            return;
        }
        b[] bVarArr = this.N;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i8 < (i7 = this.P)) {
            i8 = i7;
        }
        if (bVarArr[1] == bVar2 && i9 < (i6 = this.Q)) {
            i9 = i6;
        }
        this.P = i8;
        this.Q = i9;
        int i10 = this.b0;
        if (i9 < i10) {
            this.Q = i10;
        }
        int i11 = this.a0;
        if (i8 < i11) {
            this.P = i11;
        }
    }

    public final void d() {
        this.L.add(this.C);
        this.L.add(this.D);
        this.L.add(this.E);
        this.L.add(this.F);
        this.L.add(this.H);
        this.L.add(this.I);
        this.L.add(this.J);
        this.L.add(this.G);
    }

    public void d0(boolean z) {
        this.z = z;
    }

    public boolean e() {
        return (this instanceof k) || (this instanceof g);
    }

    public void e0(int i2) {
        this.Q = i2;
        int i3 = this.b0;
        if (i2 < i3) {
            this.Q = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(a.g.b.d r48) {
        /*
            Method dump skipped, instruction units count: 1267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.k.e.f(a.g.b.d):void");
    }

    public void f0(float f2) {
        this.c0 = f2;
    }

    public boolean g() {
        return this.g0 != 8;
    }

    public void g0(int i2) {
        this.n0 = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0316 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0406 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:308:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(a.g.b.d r32, boolean r33, boolean r34, boolean r35, boolean r36, a.g.b.i r37, a.g.b.i r38, a.g.b.k.e.b r39, boolean r40, a.g.b.k.d r41, a.g.b.k.d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instruction units count: 1100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.k.e.h(a.g.b.d, boolean, boolean, boolean, boolean, a.g.b.i, a.g.b.i, a.g.b.k.e$b, boolean, a.g.b.k.d, a.g.b.k.d, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void h0(int i2, int i3) {
        this.T = i2;
        int i4 = i3 - i2;
        this.P = i4;
        int i5 = this.a0;
        if (i4 < i5) {
            this.P = i5;
        }
    }

    public void i(e eVar, float f2, int i2) {
        d.b bVar = d.b.CENTER;
        R(bVar, eVar, bVar, i2, 0);
        this.y = f2;
    }

    public void i0(b bVar) {
        this.N[0] = bVar;
    }

    public void j(a.g.b.d dVar) {
        dVar.q(this.C);
        dVar.q(this.D);
        dVar.q(this.E);
        dVar.q(this.F);
        if (this.Z > 0) {
            dVar.q(this.G);
        }
    }

    public void j0(int i2, int i3, int i4, float f2) {
        this.f1426m = i2;
        this.p = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.q = i4;
        this.r = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.f1426m = 2;
    }

    public d k(d.b bVar) {
        switch (a.f1429a[bVar.ordinal()]) {
            case 1:
                return this.C;
            case 2:
                return this.D;
            case 3:
                return this.E;
            case 4:
                return this.F;
            case 5:
                return this.G;
            case 6:
                return this.J;
            case 7:
                return this.H;
            case 8:
                return this.I;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void k0(float f2) {
        this.r0[0] = f2;
    }

    public int l() {
        return this.Z;
    }

    public void l0(int i2, boolean z) {
        this.M[i2] = z;
    }

    public float m(int i2) {
        if (i2 == 0) {
            return this.c0;
        }
        if (i2 == 1) {
            return this.d0;
        }
        return -1.0f;
    }

    public void m0(boolean z) {
        this.A = z;
    }

    public int n() {
        return P() + this.Q;
    }

    public void n0(boolean z) {
        this.B = z;
    }

    public Object o() {
        return this.e0;
    }

    public void o0(int i2) {
        this.x[1] = i2;
    }

    public String p() {
        return this.h0;
    }

    public void p0(int i2) {
        this.x[0] = i2;
    }

    public b q(int i2) {
        if (i2 == 0) {
            return w();
        }
        if (i2 == 1) {
            return K();
        }
        return null;
    }

    public void q0(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.b0 = i2;
    }

    public float r() {
        return this.R;
    }

    public void r0(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.a0 = i2;
    }

    public int s() {
        return this.S;
    }

    public void s0(int i2, int i3) {
        this.T = i2;
        this.U = i3;
    }

    public int t() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.Q;
    }

    public void t0(e eVar) {
        this.O = eVar;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.i0;
        String str3 = BuildConfig.FLAVOR;
        if (str2 != null) {
            str = "type: " + this.i0 + " ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb.append(str);
        if (this.h0 != null) {
            str3 = "id: " + this.h0 + " ";
        }
        sb.append(str3);
        sb.append("(");
        sb.append(this.T);
        sb.append(", ");
        sb.append(this.U);
        sb.append(") - (");
        sb.append(this.P);
        sb.append(" x ");
        sb.append(this.Q);
        sb.append(")");
        return sb.toString();
    }

    public float u() {
        return this.c0;
    }

    public void u0(float f2) {
        this.d0 = f2;
    }

    public int v() {
        return this.n0;
    }

    public void v0(int i2) {
        this.o0 = i2;
    }

    public b w() {
        return this.N[0];
    }

    public void w0(int i2, int i3) {
        this.U = i2;
        int i4 = i3 - i2;
        this.Q = i4;
        int i5 = this.b0;
        if (i4 < i5) {
            this.Q = i5;
        }
    }

    public int x() {
        d dVar = this.C;
        int i2 = dVar != null ? 0 + dVar.f1410e : 0;
        d dVar2 = this.E;
        return dVar2 != null ? i2 + dVar2.f1410e : i2;
    }

    public void x0(b bVar) {
        this.N[1] = bVar;
    }

    public int y(int i2) {
        if (i2 == 0) {
            return N();
        }
        if (i2 == 1) {
            return t();
        }
        return 0;
    }

    public void y0(int i2, int i3, int i4, float f2) {
        this.f1427n = i2;
        this.s = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.t = i4;
        this.u = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.f1427n = 2;
    }

    public int z() {
        return this.x[1];
    }

    public void z0(float f2) {
        this.r0[1] = f2;
    }
}

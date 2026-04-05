package c.f.a.b.e3;

import android.os.Looper;
import c.f.a.b.e3.r0;
import c.f.a.b.k1;
import c.f.a.b.l1;
import c.f.a.b.x2.a0;
import c.f.a.b.x2.c0;
import c.f.a.b.x2.y;
import c.f.a.b.z2.a0;

/* JADX INFO: loaded from: classes2.dex */
public class r0 implements c.f.a.b.z2.a0 {
    public boolean A;
    public k1 B;
    public k1 C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f7955a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.x2.c0 f7958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0.a f7959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f7960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f7961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k1 f7962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.f.a.b.x2.y f7963i;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7956b = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7964j = 1000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f7965k = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long[] f7966l = new long[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long[] f7969o = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f7968n = new int[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f7967m = new int[1000];
    public a0.a[] p = new a0.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<c> f7957c = new y0<>(new c.f.a.b.j3.m() { // from class: c.f.a.b.e3.m
        @Override // c.f.a.b.j3.m
        public final void accept(Object obj) {
            ((r0.c) obj).f7974b.release();
        }
    });
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean z = true;
    public boolean y = true;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f7971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a0.a f7972c;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k1 f7973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c0.b f7974b;

        public c(k1 k1Var, c0.b bVar) {
            this.f7973a = k1Var;
            this.f7974b = bVar;
        }
    }

    public interface d {
        void a(k1 k1Var);
    }

    public r0(c.f.a.b.i3.f fVar, Looper looper, c.f.a.b.x2.c0 c0Var, a0.a aVar) {
        this.f7960f = looper;
        this.f7958d = c0Var;
        this.f7959e = aVar;
        this.f7955a = new q0(fVar);
    }

    public static r0 j(c.f.a.b.i3.f fVar, Looper looper, c.f.a.b.x2.c0 c0Var, a0.a aVar) {
        return new r0(fVar, (Looper) c.f.a.b.j3.g.e(looper), (c.f.a.b.x2.c0) c.f.a.b.j3.g.e(c0Var), (a0.a) c.f.a.b.j3.g.e(aVar));
    }

    public static r0 k(c.f.a.b.i3.f fVar) {
        return new r0(fVar, null, null, null);
    }

    public final long A(int i2) {
        long jMax = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int iC = C(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            jMax = Math.max(jMax, this.f7969o[iC]);
            if ((this.f7968n[iC] & 1) != 0) {
                break;
            }
            iC--;
            if (iC == -1) {
                iC = this.f7964j - 1;
            }
        }
        return jMax;
    }

    public final int B() {
        return this.r + this.t;
    }

    public final int C(int i2) {
        int i3 = this.s + i2;
        int i4 = this.f7964j;
        return i3 < i4 ? i3 : i3 - i4;
    }

    public final synchronized int D(long j2, boolean z) {
        int iC = C(this.t);
        if (G() && j2 >= this.f7969o[iC]) {
            if (j2 > this.w && z) {
                return this.q - this.t;
            }
            int iU = u(iC, this.q - this.t, j2, true);
            if (iU == -1) {
                return 0;
            }
            return iU;
        }
        return 0;
    }

    public final synchronized k1 E() {
        return this.z ? null : this.C;
    }

    public final int F() {
        return this.r + this.q;
    }

    public final boolean G() {
        return this.t != this.q;
    }

    public final void H() {
        this.A = true;
    }

    public final synchronized boolean I() {
        return this.x;
    }

    public synchronized boolean J(boolean z) {
        k1 k1Var;
        boolean z2 = true;
        if (G()) {
            if (this.f7957c.e(B()).f7973a != this.f7962h) {
                return true;
            }
            return L(C(this.t));
        }
        if (!z && !this.x && ((k1Var = this.C) == null || k1Var == this.f7962h)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean L(int i2) {
        c.f.a.b.x2.y yVar = this.f7963i;
        return yVar == null || yVar.getState() == 4 || ((this.f7968n[i2] & 1073741824) == 0 && this.f7963i.d());
    }

    public void M() throws y.a {
        c.f.a.b.x2.y yVar = this.f7963i;
        if (yVar != null && yVar.getState() == 1) {
            throw ((y.a) c.f.a.b.j3.g.e(this.f7963i.getError()));
        }
    }

    public final void N(k1 k1Var, l1 l1Var) {
        k1 k1Var2 = this.f7962h;
        boolean z = k1Var2 == null;
        c.f.a.b.x2.w wVar = z ? null : k1Var2.p;
        this.f7962h = k1Var;
        c.f.a.b.x2.w wVar2 = k1Var.p;
        c.f.a.b.x2.c0 c0Var = this.f7958d;
        l1Var.f9575b = c0Var != null ? k1Var.c(c0Var.c(k1Var)) : k1Var;
        l1Var.f9574a = this.f7963i;
        if (this.f7958d == null) {
            return;
        }
        if (z || !c.f.a.b.j3.x0.b(wVar, wVar2)) {
            c.f.a.b.x2.y yVar = this.f7963i;
            c.f.a.b.x2.y yVarB = this.f7958d.b((Looper) c.f.a.b.j3.g.e(this.f7960f), this.f7959e, k1Var);
            this.f7963i = yVarB;
            l1Var.f9574a = yVarB;
            if (yVar != null) {
                yVar.b(this.f7959e);
            }
        }
    }

    public final synchronized int O(l1 l1Var, c.f.a.b.v2.f fVar, boolean z, boolean z2, b bVar) {
        fVar.f10277d = false;
        if (!G()) {
            if (!z2 && !this.x) {
                k1 k1Var = this.C;
                if (k1Var == null || (!z && k1Var == this.f7962h)) {
                    return -3;
                }
                N((k1) c.f.a.b.j3.g.e(k1Var), l1Var);
                return -5;
            }
            fVar.setFlags(4);
            return -4;
        }
        k1 k1Var2 = this.f7957c.e(B()).f7973a;
        if (!z && k1Var2 == this.f7962h) {
            int iC = C(this.t);
            if (!L(iC)) {
                fVar.f10277d = true;
                return -3;
            }
            fVar.setFlags(this.f7968n[iC]);
            long j2 = this.f7969o[iC];
            fVar.f10278e = j2;
            if (j2 < this.u) {
                fVar.addFlag(Integer.MIN_VALUE);
            }
            bVar.f7970a = this.f7967m[iC];
            bVar.f7971b = this.f7966l[iC];
            bVar.f7972c = this.p[iC];
            return -4;
        }
        N(k1Var2, l1Var);
        return -5;
    }

    public final synchronized int P() {
        return G() ? this.f7965k[C(this.t)] : this.D;
    }

    public void Q() {
        q();
        T();
    }

    public int R(l1 l1Var, c.f.a.b.v2.f fVar, int i2, boolean z) {
        int iO = O(l1Var, fVar, (i2 & 2) != 0, z, this.f7956b);
        if (iO == -4 && !fVar.isEndOfStream()) {
            boolean z2 = (i2 & 1) != 0;
            if ((i2 & 4) == 0) {
                q0 q0Var = this.f7955a;
                b bVar = this.f7956b;
                if (z2) {
                    q0Var.f(fVar, bVar);
                } else {
                    q0Var.m(fVar, bVar);
                }
            }
            if (!z2) {
                this.t++;
            }
        }
        return iO;
    }

    public void S() {
        V(true);
        T();
    }

    public final void T() {
        c.f.a.b.x2.y yVar = this.f7963i;
        if (yVar != null) {
            yVar.b(this.f7959e);
            this.f7963i = null;
            this.f7962h = null;
        }
    }

    public final void U() {
        V(false);
    }

    public void V(boolean z) {
        this.f7955a.n();
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.y = true;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.x = false;
        this.f7957c.b();
        if (z) {
            this.B = null;
            this.C = null;
            this.z = true;
        }
    }

    public final synchronized void W() {
        this.t = 0;
        this.f7955a.o();
    }

    public final synchronized boolean X(int i2) {
        boolean z;
        W();
        int i3 = this.r;
        if (i2 < i3 || i2 > this.q + i3) {
            z = false;
        } else {
            this.u = Long.MIN_VALUE;
            this.t = i2 - i3;
            z = true;
        }
        return z;
    }

    public final synchronized boolean Y(long j2, boolean z) {
        W();
        int iC = C(this.t);
        if (G() && j2 >= this.f7969o[iC] && (j2 <= this.w || z)) {
            int iU = u(iC, this.q - this.t, j2, true);
            if (iU == -1) {
                return false;
            }
            this.u = j2;
            this.t += iU;
            return true;
        }
        return false;
    }

    public final void Z(long j2) {
        if (this.G != j2) {
            this.G = j2;
            H();
        }
    }

    @Override // c.f.a.b.z2.a0
    public final int a(c.f.a.b.i3.l lVar, int i2, boolean z, int i3) {
        return this.f7955a.p(lVar, i2, z);
    }

    public final void a0(long j2) {
        this.u = j2;
    }

    @Override // c.f.a.b.z2.a0
    public /* synthetic */ int b(c.f.a.b.i3.l lVar, int i2, boolean z) {
        return c.f.a.b.z2.z.a(this, lVar, i2, z);
    }

    public final synchronized boolean b0(k1 k1Var) {
        this.z = false;
        if (c.f.a.b.j3.x0.b(k1Var, this.C)) {
            return false;
        }
        if (!this.f7957c.g() && this.f7957c.f().f7973a.equals(k1Var)) {
            k1Var = this.f7957c.f().f7973a;
        }
        this.C = k1Var;
        k1 k1Var2 = this.C;
        this.E = c.f.a.b.j3.d0.a(k1Var2.f9338m, k1Var2.f9335j);
        this.F = false;
        return true;
    }

    @Override // c.f.a.b.z2.a0
    public /* synthetic */ void c(c.f.a.b.j3.i0 i0Var, int i2) {
        c.f.a.b.z2.z.b(this, i0Var, i2);
    }

    public final void c0(d dVar) {
        this.f7961g = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // c.f.a.b.z2.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(long r12, int r14, int r15, int r16, c.f.a.b.z2.a0.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.A
            if (r0 == 0) goto L10
            c.f.a.b.k1 r0 = r8.B
            java.lang.Object r0 = c.f.a.b.j3.g.i(r0)
            c.f.a.b.k1 r0 = (c.f.a.b.k1) r0
            r11.e(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            boolean r4 = r8.y
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.y = r1
        L22:
            long r4 = r8.G
            long r4 = r4 + r12
            boolean r6 = r8.E
            if (r6 == 0) goto L54
            long r6 = r8.u
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.F
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            c.f.a.b.k1 r6 = r8.C
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            c.f.a.b.j3.z.i(r6, r0)
            r8.F = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.H
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.g(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.H = r1
            goto L66
        L65:
            return
        L66:
            c.f.a.b.e3.q0 r0 = r8.f7955a
            long r0 = r0.e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.h(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.r0.d(long, int, int, int, c.f.a.b.z2.a0$a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void d0(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.t     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.q     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            c.f.a.b.j3.g.a(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.t     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.t = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.r0.d0(int):void");
    }

    @Override // c.f.a.b.z2.a0
    public final void e(k1 k1Var) {
        k1 k1VarV = v(k1Var);
        this.A = false;
        this.B = k1Var;
        boolean zB0 = b0(k1VarV);
        d dVar = this.f7961g;
        if (dVar == null || !zB0) {
            return;
        }
        dVar.a(k1VarV);
    }

    public final void e0(int i2) {
        this.D = i2;
    }

    @Override // c.f.a.b.z2.a0
    public final void f(c.f.a.b.j3.i0 i0Var, int i2, int i3) {
        this.f7955a.q(i0Var, i2);
    }

    public final void f0() {
        this.H = true;
    }

    public final synchronized boolean g(long j2) {
        if (this.q == 0) {
            return j2 > this.v;
        }
        if (z() >= j2) {
            return false;
        }
        s(this.r + i(j2));
        return true;
    }

    public final synchronized void h(long j2, int i2, long j3, int i3, a0.a aVar) {
        int i4 = this.q;
        if (i4 > 0) {
            int iC = C(i4 - 1);
            c.f.a.b.j3.g.a(this.f7966l[iC] + ((long) this.f7967m[iC]) <= j3);
        }
        this.x = (536870912 & i2) != 0;
        this.w = Math.max(this.w, j2);
        int iC2 = C(this.q);
        this.f7969o[iC2] = j2;
        this.f7966l[iC2] = j3;
        this.f7967m[iC2] = i3;
        this.f7968n[iC2] = i2;
        this.p[iC2] = aVar;
        this.f7965k[iC2] = this.D;
        if (this.f7957c.g() || !this.f7957c.f().f7973a.equals(this.C)) {
            c.f.a.b.x2.c0 c0Var = this.f7958d;
            this.f7957c.a(F(), new c((k1) c.f.a.b.j3.g.e(this.C), c0Var != null ? c0Var.a((Looper) c.f.a.b.j3.g.e(this.f7960f), this.f7959e, this.C) : c0.b.f10331a));
        }
        int i5 = this.q + 1;
        this.q = i5;
        int i6 = this.f7964j;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            a0.a[] aVarArr = new a0.a[i7];
            int i8 = this.s;
            int i9 = i6 - i8;
            System.arraycopy(this.f7966l, i8, jArr, 0, i9);
            System.arraycopy(this.f7969o, this.s, jArr2, 0, i9);
            System.arraycopy(this.f7968n, this.s, iArr2, 0, i9);
            System.arraycopy(this.f7967m, this.s, iArr3, 0, i9);
            System.arraycopy(this.p, this.s, aVarArr, 0, i9);
            System.arraycopy(this.f7965k, this.s, iArr, 0, i9);
            int i10 = this.s;
            System.arraycopy(this.f7966l, 0, jArr, i9, i10);
            System.arraycopy(this.f7969o, 0, jArr2, i9, i10);
            System.arraycopy(this.f7968n, 0, iArr2, i9, i10);
            System.arraycopy(this.f7967m, 0, iArr3, i9, i10);
            System.arraycopy(this.p, 0, aVarArr, i9, i10);
            System.arraycopy(this.f7965k, 0, iArr, i9, i10);
            this.f7966l = jArr;
            this.f7969o = jArr2;
            this.f7968n = iArr2;
            this.f7967m = iArr3;
            this.p = aVarArr;
            this.f7965k = iArr;
            this.s = 0;
            this.f7964j = i7;
        }
    }

    public final int i(long j2) {
        int i2 = this.q;
        int iC = C(i2 - 1);
        while (i2 > this.t && this.f7969o[iC] >= j2) {
            i2--;
            iC--;
            if (iC == -1) {
                iC = this.f7964j - 1;
            }
        }
        return i2;
    }

    public final synchronized long l(long j2, boolean z, boolean z2) {
        int i2;
        int i3 = this.q;
        if (i3 != 0) {
            long[] jArr = this.f7969o;
            int i4 = this.s;
            if (j2 >= jArr[i4]) {
                if (z2 && (i2 = this.t) != i3) {
                    i3 = i2 + 1;
                }
                int iU = u(i4, i3, j2, z);
                if (iU == -1) {
                    return -1L;
                }
                return o(iU);
            }
        }
        return -1L;
    }

    public final synchronized long m() {
        int i2 = this.q;
        if (i2 == 0) {
            return -1L;
        }
        return o(i2);
    }

    public synchronized long n() {
        int i2 = this.t;
        if (i2 == 0) {
            return -1L;
        }
        return o(i2);
    }

    public final long o(int i2) {
        this.v = Math.max(this.v, A(i2));
        this.q -= i2;
        int i3 = this.r + i2;
        this.r = i3;
        int i4 = this.s + i2;
        this.s = i4;
        int i5 = this.f7964j;
        if (i4 >= i5) {
            this.s = i4 - i5;
        }
        int i6 = this.t - i2;
        this.t = i6;
        if (i6 < 0) {
            this.t = 0;
        }
        this.f7957c.d(i3);
        if (this.q != 0) {
            return this.f7966l[this.s];
        }
        int i7 = this.s;
        if (i7 == 0) {
            i7 = this.f7964j;
        }
        int i8 = i7 - 1;
        return this.f7966l[i8] + ((long) this.f7967m[i8]);
    }

    public final void p(long j2, boolean z, boolean z2) {
        this.f7955a.b(l(j2, z, z2));
    }

    public final void q() {
        this.f7955a.b(m());
    }

    public final void r() {
        this.f7955a.b(n());
    }

    public final long s(int i2) {
        int iF = F() - i2;
        boolean z = false;
        c.f.a.b.j3.g.a(iF >= 0 && iF <= this.q - this.t);
        int i3 = this.q - iF;
        this.q = i3;
        this.w = Math.max(this.v, A(i3));
        if (iF == 0 && this.x) {
            z = true;
        }
        this.x = z;
        this.f7957c.c(i2);
        int i4 = this.q;
        if (i4 == 0) {
            return 0L;
        }
        int iC = C(i4 - 1);
        return this.f7966l[iC] + ((long) this.f7967m[iC]);
    }

    public final void t(int i2) {
        this.f7955a.c(s(i2));
    }

    public final int u(int i2, int i3, long j2, boolean z) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long[] jArr = this.f7969o;
            if (jArr[i2] > j2) {
                return i4;
            }
            if (!z || (this.f7968n[i2] & 1) != 0) {
                if (jArr[i2] == j2) {
                    return i5;
                }
                i4 = i5;
            }
            i2++;
            if (i2 == this.f7964j) {
                i2 = 0;
            }
        }
        return i4;
    }

    public k1 v(k1 k1Var) {
        return (this.G == 0 || k1Var.q == Long.MAX_VALUE) ? k1Var : k1Var.b().i0(k1Var.q + this.G).E();
    }

    public final int w() {
        return this.r;
    }

    public final synchronized long x() {
        return this.q == 0 ? Long.MIN_VALUE : this.f7969o[this.s];
    }

    public final synchronized long y() {
        return this.w;
    }

    public final synchronized long z() {
        return Math.max(this.v, A(this.t));
    }
}

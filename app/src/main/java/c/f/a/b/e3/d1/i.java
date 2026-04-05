package c.f.a.b.e3.d1;

import android.os.Looper;
import c.f.a.b.e3.d0;
import c.f.a.b.e3.d1.j;
import c.f.a.b.e3.j0;
import c.f.a.b.e3.r0;
import c.f.a.b.e3.s0;
import c.f.a.b.e3.t0;
import c.f.a.b.i3.f0;
import c.f.a.b.i3.g0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.k1;
import c.f.a.b.l1;
import c.f.a.b.m2;
import c.f.a.b.w0;
import c.f.a.b.x2.a0;
import c.f.a.b.x2.c0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class i<T extends j> implements s0, t0, g0.b<f>, g0.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f7034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1[] f7035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f7036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final T f7037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t0.a<i<T>> f7038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0.a f7039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f0 f7040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g0 f7041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f7042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<c.f.a.b.e3.d1.b> f7043l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<c.f.a.b.e3.d1.b> f7044m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r0 f7045n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r0[] f7046o;
    public final d p;
    public f q;
    public k1 r;
    public b<T> s;
    public long t;
    public long u;
    public int v;
    public c.f.a.b.e3.d1.b w;
    public boolean x;

    public final class a implements s0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i<T> f7047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r0 f7048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7049d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7050e;

        public a(i<T> iVar, r0 r0Var, int i2) {
            this.f7047b = iVar;
            this.f7048c = r0Var;
            this.f7049d = i2;
        }

        @Override // c.f.a.b.e3.s0
        public void a() {
        }

        public final void b() {
            if (this.f7050e) {
                return;
            }
            i.this.f7039h.c(i.this.f7034c[this.f7049d], i.this.f7035d[this.f7049d], 0, null, i.this.u);
            this.f7050e = true;
        }

        public void c() {
            c.f.a.b.j3.g.g(i.this.f7036e[this.f7049d]);
            i.this.f7036e[this.f7049d] = false;
        }

        @Override // c.f.a.b.e3.s0
        public boolean e() {
            return !i.this.J() && this.f7048c.J(i.this.x);
        }

        @Override // c.f.a.b.e3.s0
        public int i(l1 l1Var, c.f.a.b.v2.f fVar, int i2) {
            if (i.this.J()) {
                return -3;
            }
            if (i.this.w != null && i.this.w.i(this.f7049d + 1) <= this.f7048c.B()) {
                return -3;
            }
            b();
            return this.f7048c.R(l1Var, fVar, i2, i.this.x);
        }

        @Override // c.f.a.b.e3.s0
        public int p(long j2) {
            if (i.this.J()) {
                return 0;
            }
            int iD = this.f7048c.D(j2, i.this.x);
            if (i.this.w != null) {
                iD = Math.min(iD, i.this.w.i(this.f7049d + 1) - this.f7048c.B());
            }
            this.f7048c.d0(iD);
            if (iD > 0) {
                b();
            }
            return iD;
        }
    }

    public interface b<T extends j> {
        void a(i<T> iVar);
    }

    public i(int i2, int[] iArr, k1[] k1VarArr, T t, t0.a<i<T>> aVar, c.f.a.b.i3.f fVar, long j2, c0 c0Var, a0.a aVar2, f0 f0Var, j0.a aVar3) {
        this.f7033b = i2;
        int i3 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f7034c = iArr;
        this.f7035d = k1VarArr == null ? new k1[0] : k1VarArr;
        this.f7037f = t;
        this.f7038g = aVar;
        this.f7039h = aVar3;
        this.f7040i = f0Var;
        this.f7041j = new g0("ChunkSampleStream");
        this.f7042k = new h();
        ArrayList<c.f.a.b.e3.d1.b> arrayList = new ArrayList<>();
        this.f7043l = arrayList;
        this.f7044m = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f7046o = new r0[length];
        this.f7036e = new boolean[length];
        int i4 = length + 1;
        int[] iArr2 = new int[i4];
        r0[] r0VarArr = new r0[i4];
        r0 r0VarJ = r0.j(fVar, (Looper) c.f.a.b.j3.g.e(Looper.myLooper()), c0Var, aVar2);
        this.f7045n = r0VarJ;
        iArr2[0] = i2;
        r0VarArr[0] = r0VarJ;
        while (i3 < length) {
            r0 r0VarK = r0.k(fVar);
            this.f7046o[i3] = r0VarK;
            int i5 = i3 + 1;
            r0VarArr[i5] = r0VarK;
            iArr2[i5] = this.f7034c[i3];
            i3 = i5;
        }
        this.p = new d(iArr2, r0VarArr);
        this.t = j2;
        this.u = j2;
    }

    public final void C(int i2) {
        int iMin = Math.min(P(i2, 0), this.v);
        if (iMin > 0) {
            x0.N0(this.f7043l, 0, iMin);
            this.v -= iMin;
        }
    }

    public final void D(int i2) {
        c.f.a.b.j3.g.g(!this.f7041j.j());
        int size = this.f7043l.size();
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (!H(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        long j2 = G().f7029h;
        c.f.a.b.e3.d1.b bVarE = E(i2);
        if (this.f7043l.isEmpty()) {
            this.t = this.u;
        }
        this.x = false;
        this.f7039h.D(this.f7033b, bVarE.f7028g, j2);
    }

    public final c.f.a.b.e3.d1.b E(int i2) {
        c.f.a.b.e3.d1.b bVar = this.f7043l.get(i2);
        ArrayList<c.f.a.b.e3.d1.b> arrayList = this.f7043l;
        x0.N0(arrayList, i2, arrayList.size());
        this.v = Math.max(this.v, this.f7043l.size());
        r0 r0Var = this.f7045n;
        int i3 = 0;
        while (true) {
            r0Var.t(bVar.i(i3));
            r0[] r0VarArr = this.f7046o;
            if (i3 >= r0VarArr.length) {
                return bVar;
            }
            r0Var = r0VarArr[i3];
            i3++;
        }
    }

    public T F() {
        return this.f7037f;
    }

    public final c.f.a.b.e3.d1.b G() {
        return this.f7043l.get(r0.size() - 1);
    }

    public final boolean H(int i2) {
        int iB;
        c.f.a.b.e3.d1.b bVar = this.f7043l.get(i2);
        if (this.f7045n.B() > bVar.i(0)) {
            return true;
        }
        int i3 = 0;
        do {
            r0[] r0VarArr = this.f7046o;
            if (i3 >= r0VarArr.length) {
                return false;
            }
            iB = r0VarArr[i3].B();
            i3++;
        } while (iB <= bVar.i(i3));
        return true;
    }

    public final boolean I(f fVar) {
        return fVar instanceof c.f.a.b.e3.d1.b;
    }

    public boolean J() {
        return this.t != -9223372036854775807L;
    }

    public final void K() {
        int iP = P(this.f7045n.B(), this.v - 1);
        while (true) {
            int i2 = this.v;
            if (i2 > iP) {
                return;
            }
            this.v = i2 + 1;
            L(i2);
        }
    }

    public final void L(int i2) {
        c.f.a.b.e3.d1.b bVar = this.f7043l.get(i2);
        k1 k1Var = bVar.f7025d;
        if (!k1Var.equals(this.r)) {
            this.f7039h.c(this.f7033b, k1Var, bVar.f7026e, bVar.f7027f, bVar.f7028g);
        }
        this.r = k1Var;
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void k(f fVar, long j2, long j3, boolean z) {
        this.q = null;
        this.w = null;
        c.f.a.b.e3.a0 a0Var = new c.f.a.b.e3.a0(fVar.f7022a, fVar.f7023b, fVar.f(), fVar.e(), j2, j3, fVar.b());
        this.f7040i.c(fVar.f7022a);
        this.f7039h.r(a0Var, fVar.f7024c, this.f7033b, fVar.f7025d, fVar.f7026e, fVar.f7027f, fVar.f7028g, fVar.f7029h);
        if (z) {
            return;
        }
        if (J()) {
            S();
        } else if (I(fVar)) {
            E(this.f7043l.size() - 1);
            if (this.f7043l.isEmpty()) {
                this.t = this.u;
            }
        }
        this.f7038g.i(this);
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void m(f fVar, long j2, long j3) {
        this.q = null;
        this.f7037f.h(fVar);
        c.f.a.b.e3.a0 a0Var = new c.f.a.b.e3.a0(fVar.f7022a, fVar.f7023b, fVar.f(), fVar.e(), j2, j3, fVar.b());
        this.f7040i.c(fVar.f7022a);
        this.f7039h.u(a0Var, fVar.f7024c, this.f7033b, fVar.f7025d, fVar.f7026e, fVar.f7027f, fVar.f7028g, fVar.f7029h);
        this.f7038g.i(this);
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public g0.c u(f fVar, long j2, long j3, IOException iOException, int i2) {
        g0.c cVarH;
        long jB = fVar.b();
        boolean zI = I(fVar);
        int size = this.f7043l.size() - 1;
        boolean z = (jB != 0 && zI && H(size)) ? false : true;
        c.f.a.b.e3.a0 a0Var = new c.f.a.b.e3.a0(fVar.f7022a, fVar.f7023b, fVar.f(), fVar.e(), j2, j3, jB);
        f0.c cVar = new f0.c(a0Var, new d0(fVar.f7024c, this.f7033b, fVar.f7025d, fVar.f7026e, fVar.f7027f, w0.e(fVar.f7028g), w0.e(fVar.f7029h)), iOException, i2);
        if (!this.f7037f.i(fVar, z, cVar, this.f7040i)) {
            cVarH = null;
        } else if (z) {
            cVarH = g0.f8877c;
            if (zI) {
                c.f.a.b.j3.g.g(E(size) == fVar);
                if (this.f7043l.isEmpty()) {
                    this.t = this.u;
                }
            }
        } else {
            z.i("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            cVarH = null;
        }
        if (cVarH == null) {
            long jA = this.f7040i.a(cVar);
            cVarH = jA != -9223372036854775807L ? g0.h(false, jA) : g0.f8878d;
        }
        boolean z2 = !cVarH.c();
        this.f7039h.w(a0Var, fVar.f7024c, this.f7033b, fVar.f7025d, fVar.f7026e, fVar.f7027f, fVar.f7028g, fVar.f7029h, iOException, z2);
        if (z2) {
            this.q = null;
            this.f7040i.c(fVar.f7022a);
            this.f7038g.i(this);
        }
        return cVarH;
    }

    public final int P(int i2, int i3) {
        do {
            i3++;
            if (i3 >= this.f7043l.size()) {
                return this.f7043l.size() - 1;
            }
        } while (this.f7043l.get(i3).i(0) <= i2);
        return i3 - 1;
    }

    public void Q() {
        R(null);
    }

    public void R(b<T> bVar) {
        this.s = bVar;
        this.f7045n.Q();
        for (r0 r0Var : this.f7046o) {
            r0Var.Q();
        }
        this.f7041j.m(this);
    }

    public final void S() {
        this.f7045n.U();
        for (r0 r0Var : this.f7046o) {
            r0Var.U();
        }
    }

    public void T(long j2) {
        boolean zY;
        this.u = j2;
        if (J()) {
            this.t = j2;
            return;
        }
        c.f.a.b.e3.d1.b bVar = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f7043l.size()) {
                break;
            }
            c.f.a.b.e3.d1.b bVar2 = this.f7043l.get(i3);
            long j3 = bVar2.f7028g;
            if (j3 == j2 && bVar2.f6995k == -9223372036854775807L) {
                bVar = bVar2;
                break;
            } else if (j3 > j2) {
                break;
            } else {
                i3++;
            }
        }
        if (bVar != null) {
            zY = this.f7045n.X(bVar.i(0));
        } else {
            zY = this.f7045n.Y(j2, j2 < b());
        }
        if (zY) {
            this.v = P(this.f7045n.B(), 0);
            r0[] r0VarArr = this.f7046o;
            int length = r0VarArr.length;
            while (i2 < length) {
                r0VarArr[i2].Y(j2, true);
                i2++;
            }
            return;
        }
        this.t = j2;
        this.x = false;
        this.f7043l.clear();
        this.v = 0;
        if (!this.f7041j.j()) {
            this.f7041j.g();
            S();
            return;
        }
        this.f7045n.q();
        r0[] r0VarArr2 = this.f7046o;
        int length2 = r0VarArr2.length;
        while (i2 < length2) {
            r0VarArr2[i2].q();
            i2++;
        }
        this.f7041j.f();
    }

    public i<T>.a U(long j2, int i2) {
        for (int i3 = 0; i3 < this.f7046o.length; i3++) {
            if (this.f7034c[i3] == i2) {
                c.f.a.b.j3.g.g(!this.f7036e[i3]);
                this.f7036e[i3] = true;
                this.f7046o[i3].Y(j2, true);
                return new a(this, this.f7046o[i3], i3);
            }
        }
        throw new IllegalStateException();
    }

    @Override // c.f.a.b.e3.s0
    public void a() throws IOException {
        this.f7041j.a();
        this.f7045n.M();
        if (this.f7041j.j()) {
            return;
        }
        this.f7037f.a();
    }

    @Override // c.f.a.b.e3.t0
    public long b() {
        if (J()) {
            return this.t;
        }
        if (this.x) {
            return Long.MIN_VALUE;
        }
        return G().f7029h;
    }

    @Override // c.f.a.b.e3.t0
    public boolean c(long j2) {
        List<c.f.a.b.e3.d1.b> listEmptyList;
        long j3;
        if (this.x || this.f7041j.j() || this.f7041j.i()) {
            return false;
        }
        boolean zJ = J();
        if (zJ) {
            listEmptyList = Collections.emptyList();
            j3 = this.t;
        } else {
            listEmptyList = this.f7044m;
            j3 = G().f7029h;
        }
        this.f7037f.j(j2, j3, listEmptyList, this.f7042k);
        h hVar = this.f7042k;
        boolean z = hVar.f7032b;
        f fVar = hVar.f7031a;
        hVar.a();
        if (z) {
            this.t = -9223372036854775807L;
            this.x = true;
            return true;
        }
        if (fVar == null) {
            return false;
        }
        this.q = fVar;
        if (I(fVar)) {
            c.f.a.b.e3.d1.b bVar = (c.f.a.b.e3.d1.b) fVar;
            if (zJ) {
                long j4 = bVar.f7028g;
                long j5 = this.t;
                if (j4 != j5) {
                    this.f7045n.a0(j5);
                    for (r0 r0Var : this.f7046o) {
                        r0Var.a0(this.t);
                    }
                }
                this.t = -9223372036854775807L;
            }
            bVar.k(this.p);
            this.f7043l.add(bVar);
        } else if (fVar instanceof m) {
            ((m) fVar).g(this.p);
        }
        this.f7039h.A(new c.f.a.b.e3.a0(fVar.f7022a, fVar.f7023b, this.f7041j.n(fVar, this, this.f7040i.d(fVar.f7024c))), fVar.f7024c, this.f7033b, fVar.f7025d, fVar.f7026e, fVar.f7027f, fVar.f7028g, fVar.f7029h);
        return true;
    }

    @Override // c.f.a.b.e3.t0
    public boolean d() {
        return this.f7041j.j();
    }

    @Override // c.f.a.b.e3.s0
    public boolean e() {
        return !J() && this.f7045n.J(this.x);
    }

    public long f(long j2, m2 m2Var) {
        return this.f7037f.f(j2, m2Var);
    }

    @Override // c.f.a.b.e3.t0
    public long g() {
        if (this.x) {
            return Long.MIN_VALUE;
        }
        if (J()) {
            return this.t;
        }
        long jMax = this.u;
        c.f.a.b.e3.d1.b bVarG = G();
        if (!bVarG.h()) {
            if (this.f7043l.size() > 1) {
                bVarG = this.f7043l.get(r2.size() - 2);
            } else {
                bVarG = null;
            }
        }
        if (bVarG != null) {
            jMax = Math.max(jMax, bVarG.f7029h);
        }
        return Math.max(jMax, this.f7045n.y());
    }

    @Override // c.f.a.b.e3.t0
    public void h(long j2) {
        if (this.f7041j.i() || J()) {
            return;
        }
        if (!this.f7041j.j()) {
            int iG = this.f7037f.g(j2, this.f7044m);
            if (iG < this.f7043l.size()) {
                D(iG);
                return;
            }
            return;
        }
        f fVar = (f) c.f.a.b.j3.g.e(this.q);
        if (!(I(fVar) && H(this.f7043l.size() - 1)) && this.f7037f.c(j2, fVar, this.f7044m)) {
            this.f7041j.f();
            if (I(fVar)) {
                this.w = (c.f.a.b.e3.d1.b) fVar;
            }
        }
    }

    @Override // c.f.a.b.e3.s0
    public int i(l1 l1Var, c.f.a.b.v2.f fVar, int i2) {
        if (J()) {
            return -3;
        }
        c.f.a.b.e3.d1.b bVar = this.w;
        if (bVar != null && bVar.i(0) <= this.f7045n.B()) {
            return -3;
        }
        K();
        return this.f7045n.R(l1Var, fVar, i2, this.x);
    }

    @Override // c.f.a.b.i3.g0.f
    public void j() {
        this.f7045n.S();
        for (r0 r0Var : this.f7046o) {
            r0Var.S();
        }
        this.f7037f.release();
        b<T> bVar = this.s;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // c.f.a.b.e3.s0
    public int p(long j2) {
        if (J()) {
            return 0;
        }
        int iD = this.f7045n.D(j2, this.x);
        c.f.a.b.e3.d1.b bVar = this.w;
        if (bVar != null) {
            iD = Math.min(iD, bVar.i(0) - this.f7045n.B());
        }
        this.f7045n.d0(iD);
        K();
        return iD;
    }

    public void v(long j2, boolean z) {
        if (J()) {
            return;
        }
        int iW = this.f7045n.w();
        this.f7045n.p(j2, z, true);
        int iW2 = this.f7045n.w();
        if (iW2 > iW) {
            long jX = this.f7045n.x();
            int i2 = 0;
            while (true) {
                r0[] r0VarArr = this.f7046o;
                if (i2 >= r0VarArr.length) {
                    break;
                }
                r0VarArr[i2].p(jX, z, this.f7036e[i2]);
                i2++;
            }
        }
        C(iW2);
    }
}

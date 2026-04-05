package c.f.a.b.e3.f1;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import c.f.a.b.b3.a;
import c.f.a.b.e3.a1;
import c.f.a.b.e3.f1.j;
import c.f.a.b.e3.j0;
import c.f.a.b.e3.r0;
import c.f.a.b.e3.s0;
import c.f.a.b.e3.t0;
import c.f.a.b.e3.z0;
import c.f.a.b.i3.c0;
import c.f.a.b.i3.f0;
import c.f.a.b.i3.g0;
import c.f.a.b.j3.d0;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.l1;
import c.f.a.b.w0;
import c.f.a.b.w1;
import c.f.a.b.x2.a0;
import c.f.a.b.x2.c0;
import c.f.a.b.x2.w;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.x;
import c.f.a.b.z2.z;
import c.f.b.b.t;
import c.f.b.b.y;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements g0.b<c.f.a.b.e3.d1.f>, g0.f, t0, c.f.a.b.z2.l, r0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<Integer> f7323b = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public a0 A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public k1 G;
    public k1 H;
    public boolean I;
    public a1 J;
    public Set<z0> K;
    public int[] L;
    public int M;
    public boolean N;
    public boolean[] O;
    public boolean[] P;
    public long Q;
    public long R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public long W;
    public w X;
    public n Y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f7325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f7326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.b.i3.f f7327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k1 f7328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f7329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0.a f7330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f0 f7331j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j0.a f7333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f7334m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList<n> f7336o;
    public final List<n> p;
    public final Runnable q;
    public final Runnable r;
    public final Handler s;
    public final ArrayList<q> t;
    public final Map<String, w> u;
    public c.f.a.b.e3.d1.f v;
    public d[] w;
    public Set<Integer> y;
    public SparseIntArray z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g0 f7332k = new g0("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j.b f7335n = new j.b();
    public int[] x = new int[0];

    public interface b extends t0.a<r> {
        void j(Uri uri);

        void onPrepared();
    }

    public static class c implements c.f.a.b.z2.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k1 f7337a = new k1.b().e0("application/id3").E();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k1 f7338b = new k1.b().e0("application/x-emsg").E();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c.f.a.b.b3.j.b f7339c = new c.f.a.b.b3.j.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c.f.a.b.z2.a0 f7340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final k1 f7341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public k1 f7342f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f7343g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7344h;

        public c(c.f.a.b.z2.a0 a0Var, int i2) {
            k1 k1Var;
            this.f7340d = a0Var;
            if (i2 == 1) {
                k1Var = f7337a;
            } else {
                if (i2 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i2);
                }
                k1Var = f7338b;
            }
            this.f7341e = k1Var;
            this.f7343g = new byte[0];
            this.f7344h = 0;
        }

        @Override // c.f.a.b.z2.a0
        public int a(c.f.a.b.i3.l lVar, int i2, boolean z, int i3) throws EOFException {
            h(this.f7344h + i2);
            int iB = lVar.b(this.f7343g, this.f7344h, i2);
            if (iB != -1) {
                this.f7344h += iB;
                return iB;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // c.f.a.b.z2.a0
        public /* synthetic */ int b(c.f.a.b.i3.l lVar, int i2, boolean z) {
            return z.a(this, lVar, i2, z);
        }

        @Override // c.f.a.b.z2.a0
        public /* synthetic */ void c(i0 i0Var, int i2) {
            z.b(this, i0Var, i2);
        }

        @Override // c.f.a.b.z2.a0
        public void d(long j2, int i2, int i3, int i4, a0.a aVar) {
            c.f.a.b.j3.g.e(this.f7342f);
            i0 i0VarI = i(i3, i4);
            if (!x0.b(this.f7342f.f9338m, this.f7341e.f9338m)) {
                if (!"application/x-emsg".equals(this.f7342f.f9338m)) {
                    c.f.a.b.j3.z.i("EmsgUnwrappingTrackOutput", "Ignoring sample for unsupported format: " + this.f7342f.f9338m);
                    return;
                }
                c.f.a.b.b3.j.a aVarC = this.f7339c.c(i0VarI);
                if (!g(aVarC)) {
                    c.f.a.b.j3.z.i("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f7341e.f9338m, aVarC.getWrappedMetadataFormat()));
                    return;
                }
                i0VarI = new i0((byte[]) c.f.a.b.j3.g.e(aVarC.getWrappedMetadataBytes()));
            }
            int iA = i0VarI.a();
            this.f7340d.c(i0VarI, iA);
            this.f7340d.d(j2, i2, iA, i4, aVar);
        }

        @Override // c.f.a.b.z2.a0
        public void e(k1 k1Var) {
            this.f7342f = k1Var;
            this.f7340d.e(this.f7341e);
        }

        @Override // c.f.a.b.z2.a0
        public void f(i0 i0Var, int i2, int i3) {
            h(this.f7344h + i2);
            i0Var.j(this.f7343g, this.f7344h, i2);
            this.f7344h += i2;
        }

        public final boolean g(c.f.a.b.b3.j.a aVar) {
            k1 wrappedMetadataFormat = aVar.getWrappedMetadataFormat();
            return wrappedMetadataFormat != null && x0.b(this.f7341e.f9338m, wrappedMetadataFormat.f9338m);
        }

        public final void h(int i2) {
            byte[] bArr = this.f7343g;
            if (bArr.length < i2) {
                this.f7343g = Arrays.copyOf(bArr, i2 + (i2 / 2));
            }
        }

        public final i0 i(int i2, int i3) {
            int i4 = this.f7344h - i3;
            i0 i0Var = new i0(Arrays.copyOfRange(this.f7343g, i4 - i2, i4));
            byte[] bArr = this.f7343g;
            System.arraycopy(bArr, i4, bArr, 0, i3);
            this.f7344h = i3;
            return i0Var;
        }
    }

    public static final class d extends r0 {
        public final Map<String, w> I;
        public w J;

        public d(c.f.a.b.i3.f fVar, Looper looper, c0 c0Var, a0.a aVar, Map<String, w> map) {
            super(fVar, looper, c0Var, aVar);
            this.I = map;
        }

        @Override // c.f.a.b.e3.r0, c.f.a.b.z2.a0
        public void d(long j2, int i2, int i3, int i4, a0.a aVar) {
            super.d(j2, i2, i3, i4, aVar);
        }

        public final c.f.a.b.b3.a g0(c.f.a.b.b3.a aVar) {
            if (aVar == null) {
                return null;
            }
            int iE = aVar.e();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= iE) {
                    i3 = -1;
                    break;
                }
                a.b bVarD = aVar.d(i3);
                if ((bVarD instanceof c.f.a.b.b3.m.l) && "com.apple.streaming.transportStreamTimestamp".equals(((c.f.a.b.b3.m.l) bVarD).f6588c)) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                return aVar;
            }
            if (iE == 1) {
                return null;
            }
            a.b[] bVarArr = new a.b[iE - 1];
            while (i2 < iE) {
                if (i2 != i3) {
                    bVarArr[i2 < i3 ? i2 : i2 - 1] = aVar.d(i2);
                }
                i2++;
            }
            return new c.f.a.b.b3.a(bVarArr);
        }

        public void h0(w wVar) {
            this.J = wVar;
            H();
        }

        public void i0(n nVar) {
            e0(nVar.f7302l);
        }

        @Override // c.f.a.b.e3.r0
        public k1 v(k1 k1Var) {
            w wVar;
            w wVar2 = this.J;
            if (wVar2 == null) {
                wVar2 = k1Var.p;
            }
            if (wVar2 != null && (wVar = this.I.get(wVar2.f10447d)) != null) {
                wVar2 = wVar;
            }
            c.f.a.b.b3.a aVarG0 = g0(k1Var.f9336k);
            if (wVar2 != k1Var.p || aVarG0 != k1Var.f9336k) {
                k1Var = k1Var.b().L(wVar2).X(aVarG0).E();
            }
            return super.v(k1Var);
        }
    }

    public r(int i2, b bVar, j jVar, Map<String, w> map, c.f.a.b.i3.f fVar, long j2, k1 k1Var, c0 c0Var, a0.a aVar, f0 f0Var, j0.a aVar2, int i3) {
        this.f7324c = i2;
        this.f7325d = bVar;
        this.f7326e = jVar;
        this.u = map;
        this.f7327f = fVar;
        this.f7328g = k1Var;
        this.f7329h = c0Var;
        this.f7330i = aVar;
        this.f7331j = f0Var;
        this.f7333l = aVar2;
        this.f7334m = i3;
        Set<Integer> set = f7323b;
        this.y = new HashSet(set.size());
        this.z = new SparseIntArray(set.size());
        this.w = new d[0];
        this.P = new boolean[0];
        this.O = new boolean[0];
        ArrayList<n> arrayList = new ArrayList<>();
        this.f7336o = arrayList;
        this.p = Collections.unmodifiableList(arrayList);
        this.t = new ArrayList<>();
        this.q = new Runnable() { // from class: c.f.a.b.e3.f1.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f7254b.U();
            }
        };
        this.r = new Runnable() { // from class: c.f.a.b.e3.f1.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f7253b.d0();
            }
        };
        this.s = x0.x();
        this.Q = j2;
        this.R = j2;
    }

    public static c.f.a.b.z2.i B(int i2, int i3) {
        c.f.a.b.j3.z.i("HlsSampleStreamWrapper", "Unmapped track with id " + i2 + " of type " + i3);
        return new c.f.a.b.z2.i();
    }

    public static k1 E(k1 k1Var, k1 k1Var2, boolean z) {
        String strD;
        String strG;
        if (k1Var == null) {
            return k1Var2;
        }
        int iL = d0.l(k1Var2.f9338m);
        if (x0.K(k1Var.f9335j, iL) == 1) {
            strD = x0.L(k1Var.f9335j, iL);
            strG = d0.g(strD);
        } else {
            strD = d0.d(k1Var.f9335j, k1Var2.f9338m);
            strG = k1Var2.f9338m;
        }
        k1.b bVarI = k1Var2.b().S(k1Var.f9327b).U(k1Var.f9328c).V(k1Var.f9329d).g0(k1Var.f9330e).c0(k1Var.f9331f).G(z ? k1Var.f9332g : -1).Z(z ? k1Var.f9333h : -1).I(strD);
        if (iL == 2) {
            bVarI.j0(k1Var.r).Q(k1Var.s).P(k1Var.t);
        }
        if (strG != null) {
            bVarI.e0(strG);
        }
        int i2 = k1Var.z;
        if (i2 != -1 && iL == 1) {
            bVarI.H(i2);
        }
        c.f.a.b.b3.a aVarC = k1Var.f9336k;
        if (aVarC != null) {
            c.f.a.b.b3.a aVar = k1Var2.f9336k;
            if (aVar != null) {
                aVarC = aVar.c(aVarC);
            }
            bVarI.X(aVarC);
        }
        return bVarI.E();
    }

    public static boolean I(k1 k1Var, k1 k1Var2) {
        String str = k1Var.f9338m;
        String str2 = k1Var2.f9338m;
        int iL = d0.l(str);
        if (iL != 3) {
            return iL == d0.l(str2);
        }
        if (x0.b(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || k1Var.E == k1Var2.E;
        }
        return false;
    }

    public static int M(int i2) {
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 1;
        }
        return 3;
    }

    public static boolean O(c.f.a.b.e3.d1.f fVar) {
        return fVar instanceof n;
    }

    public void A() {
        if (this.E) {
            return;
        }
        c(this.Q);
    }

    public final r0 C(int i2, int i3) {
        int length = this.w.length;
        boolean z = true;
        if (i3 != 1 && i3 != 2) {
            z = false;
        }
        d dVar = new d(this.f7327f, this.s.getLooper(), this.f7329h, this.f7330i, this.u);
        dVar.a0(this.Q);
        if (z) {
            dVar.h0(this.X);
        }
        dVar.Z(this.W);
        n nVar = this.Y;
        if (nVar != null) {
            dVar.i0(nVar);
        }
        dVar.c0(this);
        int i4 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.x, i4);
        this.x = iArrCopyOf;
        iArrCopyOf[length] = i2;
        this.w = (d[]) x0.E0(this.w, dVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.P, i4);
        this.P = zArrCopyOf;
        zArrCopyOf[length] = z;
        this.N = zArrCopyOf[length] | this.N;
        this.y.add(Integer.valueOf(i3));
        this.z.append(i3, length);
        if (M(i3) > M(this.B)) {
            this.C = length;
            this.B = i3;
        }
        this.O = Arrays.copyOf(this.O, i4);
        return dVar;
    }

    public final a1 D(z0[] z0VarArr) {
        for (int i2 = 0; i2 < z0VarArr.length; i2++) {
            z0 z0Var = z0VarArr[i2];
            k1[] k1VarArr = new k1[z0Var.f8056b];
            for (int i3 = 0; i3 < z0Var.f8056b; i3++) {
                k1 k1VarB = z0Var.b(i3);
                k1VarArr[i3] = k1VarB.c(this.f7329h.c(k1VarB));
            }
            z0VarArr[i2] = new z0(k1VarArr);
        }
        return new a1(z0VarArr);
    }

    public final void F(int i2) {
        c.f.a.b.j3.g.g(!this.f7332k.j());
        while (true) {
            if (i2 >= this.f7336o.size()) {
                i2 = -1;
                break;
            } else if (z(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        long j2 = J().f7029h;
        n nVarG = G(i2);
        if (this.f7336o.isEmpty()) {
            this.R = this.Q;
        } else {
            ((n) y.c(this.f7336o)).o();
        }
        this.U = false;
        this.f7333l.D(this.B, nVarG.f7028g, j2);
    }

    public final n G(int i2) {
        n nVar = this.f7336o.get(i2);
        ArrayList<n> arrayList = this.f7336o;
        x0.N0(arrayList, i2, arrayList.size());
        for (int i3 = 0; i3 < this.w.length; i3++) {
            this.w[i3].t(nVar.m(i3));
        }
        return nVar;
    }

    public final boolean H(n nVar) {
        int i2 = nVar.f7302l;
        int length = this.w.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.O[i3] && this.w[i3].P() == i2) {
                return false;
            }
        }
        return true;
    }

    public final n J() {
        return this.f7336o.get(r0.size() - 1);
    }

    public final c.f.a.b.z2.a0 K(int i2, int i3) {
        c.f.a.b.j3.g.a(f7323b.contains(Integer.valueOf(i3)));
        int i4 = this.z.get(i3, -1);
        if (i4 == -1) {
            return null;
        }
        if (this.y.add(Integer.valueOf(i3))) {
            this.x[i4] = i2;
        }
        return this.x[i4] == i2 ? this.w[i4] : B(i2, i3);
    }

    public int L() {
        return this.M;
    }

    public final void N(n nVar) {
        this.Y = nVar;
        this.G = nVar.f7025d;
        this.R = -9223372036854775807L;
        this.f7336o.add(nVar);
        t.a aVarB = c.f.b.b.t.B();
        for (d dVar : this.w) {
            aVarB.d(Integer.valueOf(dVar.F()));
        }
        nVar.n(this, aVarB.e());
        for (d dVar2 : this.w) {
            dVar2.i0(nVar);
            if (nVar.f7305o) {
                dVar2.f0();
            }
        }
    }

    public final boolean P() {
        return this.R != -9223372036854775807L;
    }

    public boolean Q(int i2) {
        return !P() && this.w[i2].J(this.U);
    }

    @EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    @RequiresNonNull({"trackGroups"})
    public final void T() {
        int i2 = this.J.f6903c;
        int[] iArr = new int[i2];
        this.L = iArr;
        Arrays.fill(iArr, -1);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            while (true) {
                d[] dVarArr = this.w;
                if (i4 >= dVarArr.length) {
                    break;
                }
                if (I((k1) c.f.a.b.j3.g.i(dVarArr[i4].E()), this.J.b(i3).b(0))) {
                    this.L[i3] = i4;
                    break;
                }
                i4++;
            }
        }
        Iterator<q> it = this.t.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public final void U() {
        if (!this.I && this.L == null && this.D) {
            for (d dVar : this.w) {
                if (dVar.E() == null) {
                    return;
                }
            }
            if (this.J != null) {
                T();
                return;
            }
            y();
            m0();
            this.f7325d.onPrepared();
        }
    }

    public void V() {
        this.f7332k.a();
        this.f7326e.m();
    }

    public void W(int i2) {
        V();
        this.w[i2].M();
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void k(c.f.a.b.e3.d1.f fVar, long j2, long j3, boolean z) {
        this.v = null;
        c.f.a.b.e3.a0 a0Var = new c.f.a.b.e3.a0(fVar.f7022a, fVar.f7023b, fVar.f(), fVar.e(), j2, j3, fVar.b());
        this.f7331j.c(fVar.f7022a);
        this.f7333l.r(a0Var, fVar.f7024c, this.f7324c, fVar.f7025d, fVar.f7026e, fVar.f7027f, fVar.f7028g, fVar.f7029h);
        if (z) {
            return;
        }
        if (P() || this.F == 0) {
            h0();
        }
        if (this.F > 0) {
            this.f7325d.i(this);
        }
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void m(c.f.a.b.e3.d1.f fVar, long j2, long j3) {
        this.v = null;
        this.f7326e.o(fVar);
        c.f.a.b.e3.a0 a0Var = new c.f.a.b.e3.a0(fVar.f7022a, fVar.f7023b, fVar.f(), fVar.e(), j2, j3, fVar.b());
        this.f7331j.c(fVar.f7022a);
        this.f7333l.u(a0Var, fVar.f7024c, this.f7324c, fVar.f7025d, fVar.f7026e, fVar.f7027f, fVar.f7028g, fVar.f7029h);
        if (this.E) {
            this.f7325d.i(this);
        } else {
            c(this.Q);
        }
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public g0.c u(c.f.a.b.e3.d1.f fVar, long j2, long j3, IOException iOException, int i2) {
        g0.c cVarH;
        int i3;
        boolean zO = O(fVar);
        if (zO && !((n) fVar).q() && (iOException instanceof c0.e) && ((i3 = ((c0.e) iOException).f8849e) == 410 || i3 == 404)) {
            return g0.f8875a;
        }
        long jB = fVar.b();
        c.f.a.b.e3.a0 a0Var = new c.f.a.b.e3.a0(fVar.f7022a, fVar.f7023b, fVar.f(), fVar.e(), j2, j3, jB);
        f0.c cVar = new f0.c(a0Var, new c.f.a.b.e3.d0(fVar.f7024c, this.f7324c, fVar.f7025d, fVar.f7026e, fVar.f7027f, w0.e(fVar.f7028g), w0.e(fVar.f7029h)), iOException, i2);
        f0.b bVarB = this.f7331j.b(c.f.a.b.g3.n.a(this.f7326e.j()), cVar);
        boolean zL = (bVarB == null || bVarB.f8864a != 2) ? false : this.f7326e.l(fVar, bVarB.f8865b);
        if (zL) {
            if (zO && jB == 0) {
                ArrayList<n> arrayList = this.f7336o;
                c.f.a.b.j3.g.g(arrayList.remove(arrayList.size() - 1) == fVar);
                if (this.f7336o.isEmpty()) {
                    this.R = this.Q;
                } else {
                    ((n) y.c(this.f7336o)).o();
                }
            }
            cVarH = g0.f8877c;
        } else {
            long jA = this.f7331j.a(cVar);
            cVarH = jA != -9223372036854775807L ? g0.h(false, jA) : g0.f8878d;
        }
        g0.c cVar2 = cVarH;
        boolean z = !cVar2.c();
        this.f7333l.w(a0Var, fVar.f7024c, this.f7324c, fVar.f7025d, fVar.f7026e, fVar.f7027f, fVar.f7028g, fVar.f7029h, iOException, z);
        if (z) {
            this.v = null;
            this.f7331j.c(fVar.f7022a);
        }
        if (zL) {
            if (this.E) {
                this.f7325d.i(this);
            } else {
                c(this.Q);
            }
        }
        return cVar2;
    }

    @Override // c.f.a.b.e3.r0.d
    public void a(k1 k1Var) {
        this.s.post(this.q);
    }

    public void a0() {
        this.y.clear();
    }

    @Override // c.f.a.b.e3.t0
    public long b() {
        if (P()) {
            return this.R;
        }
        if (this.U) {
            return Long.MIN_VALUE;
        }
        return J().f7029h;
    }

    public boolean b0(Uri uri, f0.c cVar, boolean z) {
        f0.b bVarB;
        if (!this.f7326e.n(uri)) {
            return true;
        }
        long j2 = -9223372036854775807L;
        if (!z && (bVarB = this.f7331j.b(c.f.a.b.g3.n.a(this.f7326e.j()), cVar)) != null && bVarB.f8864a == 2) {
            j2 = bVarB.f8865b;
        }
        return this.f7326e.p(uri, j2);
    }

    @Override // c.f.a.b.e3.t0
    public boolean c(long j2) {
        List<n> listEmptyList;
        long jMax;
        if (this.U || this.f7332k.j() || this.f7332k.i()) {
            return false;
        }
        if (P()) {
            listEmptyList = Collections.emptyList();
            jMax = this.R;
            for (d dVar : this.w) {
                dVar.a0(this.R);
            }
        } else {
            listEmptyList = this.p;
            n nVarJ = J();
            jMax = nVarJ.h() ? nVarJ.f7029h : Math.max(this.Q, nVarJ.f7028g);
        }
        List<n> list = listEmptyList;
        long j3 = jMax;
        this.f7335n.a();
        this.f7326e.d(j2, j3, list, this.E || !list.isEmpty(), this.f7335n);
        j.b bVar = this.f7335n;
        boolean z = bVar.f7288b;
        c.f.a.b.e3.d1.f fVar = bVar.f7287a;
        Uri uri = bVar.f7289c;
        if (z) {
            this.R = -9223372036854775807L;
            this.U = true;
            return true;
        }
        if (fVar == null) {
            if (uri != null) {
                this.f7325d.j(uri);
            }
            return false;
        }
        if (O(fVar)) {
            N((n) fVar);
        }
        this.v = fVar;
        this.f7333l.A(new c.f.a.b.e3.a0(fVar.f7022a, fVar.f7023b, this.f7332k.n(fVar, this, this.f7331j.d(fVar.f7024c))), fVar.f7024c, this.f7324c, fVar.f7025d, fVar.f7026e, fVar.f7027f, fVar.f7028g, fVar.f7029h);
        return true;
    }

    public void c0() {
        if (this.f7336o.isEmpty()) {
            return;
        }
        n nVar = (n) y.c(this.f7336o);
        int iB = this.f7326e.b(nVar);
        if (iB == 1) {
            nVar.v();
        } else if (iB == 2 && !this.U && this.f7332k.j()) {
            this.f7332k.f();
        }
    }

    @Override // c.f.a.b.e3.t0
    public boolean d() {
        return this.f7332k.j();
    }

    public final void d0() {
        this.D = true;
        U();
    }

    @Override // c.f.a.b.z2.l
    public c.f.a.b.z2.a0 e(int i2, int i3) {
        c.f.a.b.z2.a0 a0VarC;
        if (!f7323b.contains(Integer.valueOf(i3))) {
            int i4 = 0;
            while (true) {
                c.f.a.b.z2.a0[] a0VarArr = this.w;
                if (i4 >= a0VarArr.length) {
                    a0VarC = null;
                    break;
                }
                if (this.x[i4] == i2) {
                    a0VarC = a0VarArr[i4];
                    break;
                }
                i4++;
            }
        } else {
            a0VarC = K(i2, i3);
        }
        if (a0VarC == null) {
            if (this.V) {
                return B(i2, i3);
            }
            a0VarC = C(i2, i3);
        }
        if (i3 != 5) {
            return a0VarC;
        }
        if (this.A == null) {
            this.A = new c(a0VarC, this.f7334m);
        }
        return this.A;
    }

    public void e0(z0[] z0VarArr, int i2, int... iArr) {
        this.J = D(z0VarArr);
        this.K = new HashSet();
        for (int i3 : iArr) {
            this.K.add(this.J.b(i3));
        }
        this.M = i2;
        Handler handler = this.s;
        final b bVar = this.f7325d;
        bVar.getClass();
        handler.post(new Runnable() { // from class: c.f.a.b.e3.f1.d
            @Override // java.lang.Runnable
            public final void run() {
                bVar.onPrepared();
            }
        });
        m0();
    }

    public int f0(int i2, l1 l1Var, c.f.a.b.v2.f fVar, int i3) {
        if (P()) {
            return -3;
        }
        int i4 = 0;
        if (!this.f7336o.isEmpty()) {
            int i5 = 0;
            while (i5 < this.f7336o.size() - 1 && H(this.f7336o.get(i5))) {
                i5++;
            }
            x0.N0(this.f7336o, 0, i5);
            n nVar = this.f7336o.get(0);
            k1 k1Var = nVar.f7025d;
            if (!k1Var.equals(this.H)) {
                this.f7333l.c(this.f7324c, k1Var, nVar.f7026e, nVar.f7027f, nVar.f7028g);
            }
            this.H = k1Var;
        }
        if (!this.f7336o.isEmpty() && !this.f7336o.get(0).q()) {
            return -3;
        }
        int iR = this.w[i2].R(l1Var, fVar, i3, this.U);
        if (iR == -5) {
            k1 k1VarH = (k1) c.f.a.b.j3.g.e(l1Var.f9575b);
            if (i2 == this.C) {
                int iP = this.w[i2].P();
                while (i4 < this.f7336o.size() && this.f7336o.get(i4).f7302l != iP) {
                    i4++;
                }
                k1VarH = k1VarH.h(i4 < this.f7336o.size() ? this.f7336o.get(i4).f7025d : (k1) c.f.a.b.j3.g.e(this.G));
            }
            l1Var.f9575b = k1VarH;
        }
        return iR;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // c.f.a.b.e3.t0
    public long g() {
        /*
            r7 = this;
            boolean r0 = r7.U
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.P()
            if (r0 == 0) goto L10
            long r0 = r7.R
            return r0
        L10:
            long r0 = r7.Q
            c.f.a.b.e3.f1.n r2 = r7.J()
            boolean r3 = r2.h()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList<c.f.a.b.e3.f1.n> r2 = r7.f7336o
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList<c.f.a.b.e3.f1.n> r2 = r7.f7336o
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            c.f.a.b.e3.f1.n r2 = (c.f.a.b.e3.f1.n) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f7029h
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.D
            if (r2 == 0) goto L55
            c.f.a.b.e3.f1.r$d[] r2 = r7.w
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.y()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.f1.r.g():long");
    }

    public void g0() {
        if (this.E) {
            for (d dVar : this.w) {
                dVar.Q();
            }
        }
        this.f7332k.m(this);
        this.s.removeCallbacksAndMessages(null);
        this.I = true;
        this.t.clear();
    }

    @Override // c.f.a.b.e3.t0
    public void h(long j2) {
        if (this.f7332k.i() || P()) {
            return;
        }
        if (this.f7332k.j()) {
            c.f.a.b.j3.g.e(this.v);
            if (this.f7326e.u(j2, this.v, this.p)) {
                this.f7332k.f();
                return;
            }
            return;
        }
        int size = this.p.size();
        while (size > 0 && this.f7326e.b(this.p.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.p.size()) {
            F(size);
        }
        int iG = this.f7326e.g(j2, this.p);
        if (iG < this.f7336o.size()) {
            F(iG);
        }
    }

    public final void h0() {
        for (d dVar : this.w) {
            dVar.V(this.S);
        }
        this.S = false;
    }

    @Override // c.f.a.b.z2.l
    public void i(x xVar) {
    }

    public final boolean i0(long j2) {
        int length = this.w.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!this.w[i2].Y(j2, false) && (this.P[i2] || !this.N)) {
                return false;
            }
        }
        return true;
    }

    @Override // c.f.a.b.i3.g0.f
    public void j() {
        for (d dVar : this.w) {
            dVar.S();
        }
    }

    public boolean j0(long j2, boolean z) {
        this.Q = j2;
        if (P()) {
            this.R = j2;
            return true;
        }
        if (this.D && !z && i0(j2)) {
            return false;
        }
        this.R = j2;
        this.U = false;
        this.f7336o.clear();
        if (this.f7332k.j()) {
            if (this.D) {
                for (d dVar : this.w) {
                    dVar.q();
                }
            }
            this.f7332k.f();
        } else {
            this.f7332k.g();
            h0();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k0(c.f.a.b.g3.h[] r20, boolean[] r21, c.f.a.b.e3.s0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.f1.r.k0(c.f.a.b.g3.h[], boolean[], c.f.a.b.e3.s0[], boolean[], long, boolean):boolean");
    }

    public void l0(w wVar) {
        if (x0.b(this.X, wVar)) {
            return;
        }
        this.X = wVar;
        int i2 = 0;
        while (true) {
            d[] dVarArr = this.w;
            if (i2 >= dVarArr.length) {
                return;
            }
            if (this.P[i2]) {
                dVarArr[i2].h0(wVar);
            }
            i2++;
        }
    }

    @RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    public final void m0() {
        this.E = true;
    }

    public void n() throws w1 {
        V();
        if (this.U && !this.E) {
            throw w1.a("Loading finished before preparation is complete.", null);
        }
    }

    public void n0(boolean z) {
        this.f7326e.s(z);
    }

    public void o0(long j2) {
        if (this.W != j2) {
            this.W = j2;
            for (d dVar : this.w) {
                dVar.Z(j2);
            }
        }
    }

    @Override // c.f.a.b.z2.l
    public void p() {
        this.V = true;
        this.s.post(this.r);
    }

    public int p0(int i2, long j2) {
        if (P()) {
            return 0;
        }
        d dVar = this.w[i2];
        int iD = dVar.D(j2, this.U);
        n nVar = (n) y.d(this.f7336o, null);
        if (nVar != null && !nVar.q()) {
            iD = Math.min(iD, nVar.m(i2) - dVar.B());
        }
        dVar.d0(iD);
        return iD;
    }

    public void q0(int i2) {
        w();
        c.f.a.b.j3.g.e(this.L);
        int i3 = this.L[i2];
        c.f.a.b.j3.g.g(this.O[i3]);
        this.O[i3] = false;
    }

    public final void r0(s0[] s0VarArr) {
        this.t.clear();
        for (s0 s0Var : s0VarArr) {
            if (s0Var != null) {
                this.t.add((q) s0Var);
            }
        }
    }

    public a1 t() {
        w();
        return this.J;
    }

    public void v(long j2, boolean z) {
        if (!this.D || P()) {
            return;
        }
        int length = this.w.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.w[i2].p(j2, z, this.O[i2]);
        }
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    public final void w() {
        c.f.a.b.j3.g.g(this.E);
        c.f.a.b.j3.g.e(this.J);
        c.f.a.b.j3.g.e(this.K);
    }

    public int x(int i2) {
        w();
        c.f.a.b.j3.g.e(this.L);
        int i3 = this.L[i2];
        if (i3 == -1) {
            return this.K.contains(this.J.b(i2)) ? -3 : -2;
        }
        boolean[] zArr = this.O;
        if (zArr[i3]) {
            return -2;
        }
        zArr[i3] = true;
        return i3;
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    public final void y() {
        int length = this.w.length;
        int i2 = 0;
        int i3 = 7;
        int i4 = -1;
        while (true) {
            if (i2 >= length) {
                break;
            }
            String str = ((k1) c.f.a.b.j3.g.i(this.w[i2].E())).f9338m;
            int i5 = d0.s(str) ? 2 : d0.p(str) ? 1 : d0.r(str) ? 3 : 7;
            if (M(i5) > M(i3)) {
                i4 = i2;
                i3 = i5;
            } else if (i5 == i3 && i4 != -1) {
                i4 = -1;
            }
            i2++;
        }
        z0 z0VarI = this.f7326e.i();
        int i6 = z0VarI.f8056b;
        this.M = -1;
        this.L = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            this.L[i7] = i7;
        }
        z0[] z0VarArr = new z0[length];
        for (int i8 = 0; i8 < length; i8++) {
            k1 k1Var = (k1) c.f.a.b.j3.g.i(this.w[i8].E());
            if (i8 == i4) {
                k1[] k1VarArr = new k1[i6];
                if (i6 == 1) {
                    k1VarArr[0] = k1Var.h(z0VarI.b(0));
                } else {
                    for (int i9 = 0; i9 < i6; i9++) {
                        k1VarArr[i9] = E(z0VarI.b(i9), k1Var, true);
                    }
                }
                z0VarArr[i8] = new z0(k1VarArr);
                this.M = i8;
            } else {
                z0VarArr[i8] = new z0(E((i3 == 2 && d0.p(k1Var.f9338m)) ? this.f7328g : null, k1Var, false));
            }
        }
        this.J = D(z0VarArr);
        c.f.a.b.j3.g.g(this.K == null);
        this.K = Collections.emptySet();
    }

    public final boolean z(int i2) {
        for (int i3 = i2; i3 < this.f7336o.size(); i3++) {
            if (this.f7336o.get(i3).f7305o) {
                return false;
            }
        }
        n nVar = this.f7336o.get(i2);
        for (int i4 = 0; i4 < this.w.length; i4++) {
            if (this.w[i4].B() > nVar.m(i4)) {
                return false;
            }
        }
        return true;
    }
}

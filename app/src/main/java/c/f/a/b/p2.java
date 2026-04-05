package c.f.a.b;

import android.net.Uri;
import android.util.Pair;
import c.f.a.b.e3.c1.h;
import c.f.a.b.p1;

/* JADX INFO: loaded from: classes.dex */
public abstract class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p2 f9699a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0<p2> f9700b = new v0() { // from class: c.f.a.b.m0
    };

    public static class a extends p2 {
        @Override // c.f.a.b.p2
        public int b(Object obj) {
            return -1;
        }

        @Override // c.f.a.b.p2
        public b g(int i2, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // c.f.a.b.p2
        public int i() {
            return 0;
        }

        @Override // c.f.a.b.p2
        public Object m(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // c.f.a.b.p2
        public c o(int i2, c cVar, long j2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // c.f.a.b.p2
        public int p() {
            return 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v0<b> f9701a = new v0() { // from class: c.f.a.b.n0
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f9702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f9703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9704d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f9705e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f9706f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f9707g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c.f.a.b.e3.c1.h f9708h = c.f.a.b.e3.c1.h.f6948a;

        public int a(int i2) {
            return this.f9708h.b(i2).f6959c;
        }

        public long b(int i2, int i3) {
            h.a aVarB = this.f9708h.b(i2);
            if (aVarB.f6959c != -1) {
                return aVarB.f6962f[i3];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f9708h.f6952e;
        }

        public int d(long j2) {
            return this.f9708h.c(j2, this.f9705e);
        }

        public int e(long j2) {
            return this.f9708h.d(j2, this.f9705e);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return c.f.a.b.j3.x0.b(this.f9702b, bVar.f9702b) && c.f.a.b.j3.x0.b(this.f9703c, bVar.f9703c) && this.f9704d == bVar.f9704d && this.f9705e == bVar.f9705e && this.f9706f == bVar.f9706f && this.f9707g == bVar.f9707g && c.f.a.b.j3.x0.b(this.f9708h, bVar.f9708h);
        }

        public long f(int i2) {
            return this.f9708h.b(i2).f6958b;
        }

        public long g() {
            return this.f9708h.f6953f;
        }

        public Object h() {
            return this.f9708h.f6951d;
        }

        public int hashCode() {
            Object obj = this.f9702b;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f9703c;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f9704d) * 31;
            long j2 = this.f9705e;
            int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f9706f;
            return ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f9707g ? 1 : 0)) * 31) + this.f9708h.hashCode();
        }

        public long i(int i2) {
            return this.f9708h.b(i2).f6963g;
        }

        public long j() {
            return w0.e(this.f9705e);
        }

        public long k() {
            return this.f9705e;
        }

        public int l(int i2) {
            return this.f9708h.b(i2).c();
        }

        public int m(int i2, int i3) {
            return this.f9708h.b(i2).d(i3);
        }

        public long n() {
            return w0.e(this.f9706f);
        }

        public long o() {
            return this.f9706f;
        }

        public int p() {
            return this.f9708h.f6955h;
        }

        public boolean q(int i2) {
            return !this.f9708h.b(i2).e();
        }

        public boolean r(int i2) {
            return this.f9708h.b(i2).f6964h;
        }

        public b s(Object obj, Object obj2, int i2, long j2, long j3) {
            return t(obj, obj2, i2, j2, j3, c.f.a.b.e3.c1.h.f6948a, false);
        }

        public b t(Object obj, Object obj2, int i2, long j2, long j3, c.f.a.b.e3.c1.h hVar, boolean z) {
            this.f9702b = obj;
            this.f9703c = obj2;
            this.f9704d = i2;
            this.f9705e = j2;
            this.f9706f = j3;
            this.f9708h = hVar;
            this.f9707g = z;
            return this;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f9709a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Object f9710b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p1 f9711c = new p1.c().v("com.google.android.exoplayer2.Timeline").B(Uri.EMPTY).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final v0<c> f9712d = new v0() { // from class: c.f.a.b.o0
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public Object f9714f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f9716h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f9717i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f9718j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f9719k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f9720l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f9721m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Deprecated
        public boolean f9722n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p1.f f9723o;
        public boolean p;
        public long q;
        public long r;
        public int s;
        public int t;
        public long u;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f9713e = f9709a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p1 f9715g = f9711c;

        public long a() {
            return c.f.a.b.j3.x0.Z(this.f9719k);
        }

        public long b() {
            return w0.e(this.q);
        }

        public long c() {
            return this.q;
        }

        public long d() {
            return w0.e(this.r);
        }

        public long e() {
            return this.u;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return c.f.a.b.j3.x0.b(this.f9713e, cVar.f9713e) && c.f.a.b.j3.x0.b(this.f9715g, cVar.f9715g) && c.f.a.b.j3.x0.b(this.f9716h, cVar.f9716h) && c.f.a.b.j3.x0.b(this.f9723o, cVar.f9723o) && this.f9717i == cVar.f9717i && this.f9718j == cVar.f9718j && this.f9719k == cVar.f9719k && this.f9720l == cVar.f9720l && this.f9721m == cVar.f9721m && this.p == cVar.p && this.q == cVar.q && this.r == cVar.r && this.s == cVar.s && this.t == cVar.t && this.u == cVar.u;
        }

        public boolean f() {
            c.f.a.b.j3.g.g(this.f9722n == (this.f9723o != null));
            return this.f9723o != null;
        }

        public c g(Object obj, p1 p1Var, Object obj2, long j2, long j3, long j4, boolean z, boolean z2, p1.f fVar, long j5, long j6, int i2, int i3, long j7) {
            p1.g gVar;
            this.f9713e = obj;
            this.f9715g = p1Var != null ? p1Var : f9711c;
            this.f9714f = (p1Var == null || (gVar = p1Var.f9643d) == null) ? null : gVar.f9692h;
            this.f9716h = obj2;
            this.f9717i = j2;
            this.f9718j = j3;
            this.f9719k = j4;
            this.f9720l = z;
            this.f9721m = z2;
            this.f9722n = fVar != null;
            this.f9723o = fVar;
            this.q = j5;
            this.r = j6;
            this.s = i2;
            this.t = i3;
            this.u = j7;
            this.p = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f9713e.hashCode()) * 31) + this.f9715g.hashCode()) * 31;
            Object obj = this.f9716h;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            p1.f fVar = this.f9723o;
            int iHashCode3 = (iHashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
            long j2 = this.f9717i;
            int i2 = (iHashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f9718j;
            int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f9719k;
            int i4 = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f9720l ? 1 : 0)) * 31) + (this.f9721m ? 1 : 0)) * 31) + (this.p ? 1 : 0)) * 31;
            long j5 = this.q;
            int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.r;
            int i6 = (((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.s) * 31) + this.t) * 31;
            long j7 = this.u;
            return i6 + ((int) (j7 ^ (j7 >>> 32)));
        }
    }

    public int a(boolean z) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i2, b bVar, c cVar, int i3, boolean z) {
        int i4 = f(i2, bVar).f9704d;
        if (n(i4, cVar).t != i2) {
            return i2 + 1;
        }
        int iE = e(i4, i3, z);
        if (iE == -1) {
            return -1;
        }
        return n(iE, cVar).s;
    }

    public int e(int i2, int i3, boolean z) {
        if (i3 == 0) {
            if (i2 == c(z)) {
                return -1;
            }
            return i2 + 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == c(z) ? a(z) : i2 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (p2Var.p() != p() || p2Var.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i2 = 0; i2 < p(); i2++) {
            if (!n(i2, cVar).equals(p2Var.n(i2, cVar2))) {
                return false;
            }
        }
        for (int i3 = 0; i3 < i(); i3++) {
            if (!g(i3, bVar, true).equals(p2Var.g(i3, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public final b f(int i2, b bVar) {
        return g(i2, bVar, false);
    }

    public abstract b g(int i2, b bVar, boolean z);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        int i2;
        c cVar = new c();
        b bVar = new b();
        int iP = 217 + p();
        int i3 = 0;
        while (true) {
            i2 = iP * 31;
            if (i3 >= p()) {
                break;
            }
            iP = i2 + n(i3, cVar).hashCode();
            i3++;
        }
        int i4 = i2 + i();
        for (int i5 = 0; i5 < i(); i5++) {
            i4 = (i4 * 31) + g(i5, bVar, true).hashCode();
        }
        return i4;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i2, long j2) {
        return (Pair) c.f.a.b.j3.g.e(k(cVar, bVar, i2, j2, 0L));
    }

    public final Pair<Object, Long> k(c cVar, b bVar, int i2, long j2, long j3) {
        c.f.a.b.j3.g.c(i2, 0, p());
        o(i2, cVar, j3);
        if (j2 == -9223372036854775807L) {
            j2 = cVar.c();
            if (j2 == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = cVar.s;
        f(i3, bVar);
        while (i3 < cVar.t && bVar.f9706f != j2) {
            int i4 = i3 + 1;
            if (f(i4, bVar).f9706f > j2) {
                break;
            }
            i3 = i4;
        }
        g(i3, bVar, true);
        return Pair.create(c.f.a.b.j3.g.e(bVar.f9703c), Long.valueOf(j2 - bVar.f9706f));
    }

    public int l(int i2, int i3, boolean z) {
        if (i3 == 0) {
            if (i2 == a(z)) {
                return -1;
            }
            return i2 - 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == a(z) ? c(z) : i2 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i2);

    public final c n(int i2, c cVar) {
        return o(i2, cVar, 0L);
    }

    public abstract c o(int i2, c cVar, long j2);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i2, b bVar, c cVar, int i3, boolean z) {
        return d(i2, bVar, cVar, i3, z) == -1;
    }
}

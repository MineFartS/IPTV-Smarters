package c.f.a.b.e3;

import c.f.a.b.e3.f0;
import c.f.a.b.l1;
import c.f.a.b.m2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements f0, f0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0[] f7839b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f7841d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f0.a f7843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a1 f7844g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t0 f7846i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<f0> f7842e = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap<s0, Integer> f7840c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f0[] f7845h = new f0[0];

    public static final class a implements f0, f0.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0 f7847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f7848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f0.a f7849d;

        public a(f0 f0Var, long j2) {
            this.f7847b = f0Var;
            this.f7848c = j2;
        }

        @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
        public long b() {
            long jB = this.f7847b.b();
            if (jB == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f7848c + jB;
        }

        @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
        public boolean c(long j2) {
            return this.f7847b.c(j2 - this.f7848c);
        }

        @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
        public boolean d() {
            return this.f7847b.d();
        }

        @Override // c.f.a.b.e3.t0.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void i(f0 f0Var) {
            ((f0.a) c.f.a.b.j3.g.e(this.f7849d)).i(this);
        }

        @Override // c.f.a.b.e3.f0
        public long f(long j2, m2 m2Var) {
            return this.f7847b.f(j2 - this.f7848c, m2Var) + this.f7848c;
        }

        @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
        public long g() {
            long jG = this.f7847b.g();
            if (jG == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f7848c + jG;
        }

        @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
        public void h(long j2) {
            this.f7847b.h(j2 - this.f7848c);
        }

        @Override // c.f.a.b.e3.f0.a
        public void k(f0 f0Var) {
            ((f0.a) c.f.a.b.j3.g.e(this.f7849d)).k(this);
        }

        @Override // c.f.a.b.e3.f0
        public List<c.f.a.b.c3.i0> l(List<c.f.a.b.g3.h> list) {
            return this.f7847b.l(list);
        }

        @Override // c.f.a.b.e3.f0
        public void n() {
            this.f7847b.n();
        }

        @Override // c.f.a.b.e3.f0
        public long o(long j2) {
            return this.f7847b.o(j2 - this.f7848c) + this.f7848c;
        }

        @Override // c.f.a.b.e3.f0
        public long q() {
            long jQ = this.f7847b.q();
            if (jQ == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f7848c + jQ;
        }

        @Override // c.f.a.b.e3.f0
        public void r(f0.a aVar, long j2) {
            this.f7849d = aVar;
            this.f7847b.r(this, j2 - this.f7848c);
        }

        @Override // c.f.a.b.e3.f0
        public long s(c.f.a.b.g3.h[] hVarArr, boolean[] zArr, s0[] s0VarArr, boolean[] zArr2, long j2) {
            s0[] s0VarArr2 = new s0[s0VarArr.length];
            int i2 = 0;
            while (true) {
                s0 s0VarB = null;
                if (i2 >= s0VarArr.length) {
                    break;
                }
                b bVar = (b) s0VarArr[i2];
                if (bVar != null) {
                    s0VarB = bVar.b();
                }
                s0VarArr2[i2] = s0VarB;
                i2++;
            }
            long jS = this.f7847b.s(hVarArr, zArr, s0VarArr2, zArr2, j2 - this.f7848c);
            for (int i3 = 0; i3 < s0VarArr.length; i3++) {
                s0 s0Var = s0VarArr2[i3];
                if (s0Var == null) {
                    s0VarArr[i3] = null;
                } else if (s0VarArr[i3] == null || ((b) s0VarArr[i3]).b() != s0Var) {
                    s0VarArr[i3] = new b(s0Var, this.f7848c);
                }
            }
            return jS + this.f7848c;
        }

        @Override // c.f.a.b.e3.f0
        public a1 t() {
            return this.f7847b.t();
        }

        @Override // c.f.a.b.e3.f0
        public void v(long j2, boolean z) {
            this.f7847b.v(j2 - this.f7848c, z);
        }
    }

    public static final class b implements s0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s0 f7850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f7851c;

        public b(s0 s0Var, long j2) {
            this.f7850b = s0Var;
            this.f7851c = j2;
        }

        @Override // c.f.a.b.e3.s0
        public void a() {
            this.f7850b.a();
        }

        public s0 b() {
            return this.f7850b;
        }

        @Override // c.f.a.b.e3.s0
        public boolean e() {
            return this.f7850b.e();
        }

        @Override // c.f.a.b.e3.s0
        public int i(l1 l1Var, c.f.a.b.v2.f fVar, int i2) {
            int i3 = this.f7850b.i(l1Var, fVar, i2);
            if (i3 == -4) {
                fVar.f10278e = Math.max(0L, fVar.f10278e + this.f7851c);
            }
            return i3;
        }

        @Override // c.f.a.b.e3.s0
        public int p(long j2) {
            return this.f7850b.p(j2 - this.f7851c);
        }
    }

    public l0(u uVar, long[] jArr, f0... f0VarArr) {
        this.f7841d = uVar;
        this.f7839b = f0VarArr;
        this.f7846i = uVar.a(new t0[0]);
        for (int i2 = 0; i2 < f0VarArr.length; i2++) {
            if (jArr[i2] != 0) {
                this.f7839b[i2] = new a(f0VarArr[i2], jArr[i2]);
            }
        }
    }

    public f0 a(int i2) {
        f0[] f0VarArr = this.f7839b;
        return f0VarArr[i2] instanceof a ? ((a) f0VarArr[i2]).f7847b : f0VarArr[i2];
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long b() {
        return this.f7846i.b();
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean c(long j2) {
        if (this.f7842e.isEmpty()) {
            return this.f7846i.c(j2);
        }
        int size = this.f7842e.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f7842e.get(i2).c(j2);
        }
        return false;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean d() {
        return this.f7846i.d();
    }

    @Override // c.f.a.b.e3.t0.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void i(f0 f0Var) {
        ((f0.a) c.f.a.b.j3.g.e(this.f7843f)).i(this);
    }

    @Override // c.f.a.b.e3.f0
    public long f(long j2, m2 m2Var) {
        f0[] f0VarArr = this.f7845h;
        return (f0VarArr.length > 0 ? f0VarArr[0] : this.f7839b[0]).f(j2, m2Var);
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long g() {
        return this.f7846i.g();
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public void h(long j2) {
        this.f7846i.h(j2);
    }

    @Override // c.f.a.b.e3.f0.a
    public void k(f0 f0Var) {
        this.f7842e.remove(f0Var);
        if (this.f7842e.isEmpty()) {
            int i2 = 0;
            for (f0 f0Var2 : this.f7839b) {
                i2 += f0Var2.t().f6903c;
            }
            z0[] z0VarArr = new z0[i2];
            int i3 = 0;
            for (f0 f0Var3 : this.f7839b) {
                a1 a1VarT = f0Var3.t();
                int i4 = a1VarT.f6903c;
                int i5 = 0;
                while (i5 < i4) {
                    z0VarArr[i3] = a1VarT.b(i5);
                    i5++;
                    i3++;
                }
            }
            this.f7844g = new a1(z0VarArr);
            ((f0.a) c.f.a.b.j3.g.e(this.f7843f)).k(this);
        }
    }

    @Override // c.f.a.b.e3.f0
    public /* synthetic */ List l(List list) {
        return e0.a(this, list);
    }

    @Override // c.f.a.b.e3.f0
    public void n() {
        for (f0 f0Var : this.f7839b) {
            f0Var.n();
        }
    }

    @Override // c.f.a.b.e3.f0
    public long o(long j2) {
        long jO = this.f7845h[0].o(j2);
        int i2 = 1;
        while (true) {
            f0[] f0VarArr = this.f7845h;
            if (i2 >= f0VarArr.length) {
                return jO;
            }
            if (f0VarArr[i2].o(jO) != jO) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i2++;
        }
    }

    @Override // c.f.a.b.e3.f0
    public long q() {
        long j2 = -9223372036854775807L;
        for (f0 f0Var : this.f7845h) {
            long jQ = f0Var.q();
            if (jQ == -9223372036854775807L) {
                if (j2 != -9223372036854775807L && f0Var.o(j2) != j2) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j2 == -9223372036854775807L) {
                for (f0 f0Var2 : this.f7845h) {
                    if (f0Var2 == f0Var) {
                        break;
                    }
                    if (f0Var2.o(jQ) != jQ) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j2 = jQ;
            } else if (jQ != j2) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j2;
    }

    @Override // c.f.a.b.e3.f0
    public void r(f0.a aVar, long j2) {
        this.f7843f = aVar;
        Collections.addAll(this.f7842e, this.f7839b);
        for (f0 f0Var : this.f7839b) {
            f0Var.r(this, j2);
        }
    }

    @Override // c.f.a.b.e3.f0
    public long s(c.f.a.b.g3.h[] hVarArr, boolean[] zArr, s0[] s0VarArr, boolean[] zArr2, long j2) {
        int[] iArr = new int[hVarArr.length];
        int[] iArr2 = new int[hVarArr.length];
        for (int i2 = 0; i2 < hVarArr.length; i2++) {
            Integer num = s0VarArr[i2] == null ? null : this.f7840c.get(s0VarArr[i2]);
            iArr[i2] = num == null ? -1 : num.intValue();
            iArr2[i2] = -1;
            if (hVarArr[i2] != null) {
                z0 z0VarA = hVarArr[i2].a();
                int i3 = 0;
                while (true) {
                    f0[] f0VarArr = this.f7839b;
                    if (i3 >= f0VarArr.length) {
                        break;
                    }
                    if (f0VarArr[i3].t().c(z0VarA) != -1) {
                        iArr2[i2] = i3;
                        break;
                    }
                    i3++;
                }
            }
        }
        this.f7840c.clear();
        int length = hVarArr.length;
        s0[] s0VarArr2 = new s0[length];
        s0[] s0VarArr3 = new s0[hVarArr.length];
        c.f.a.b.g3.h[] hVarArr2 = new c.f.a.b.g3.h[hVarArr.length];
        ArrayList arrayList = new ArrayList(this.f7839b.length);
        long j3 = j2;
        int i4 = 0;
        while (i4 < this.f7839b.length) {
            for (int i5 = 0; i5 < hVarArr.length; i5++) {
                s0VarArr3[i5] = iArr[i5] == i4 ? s0VarArr[i5] : null;
                hVarArr2[i5] = iArr2[i5] == i4 ? hVarArr[i5] : null;
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            c.f.a.b.g3.h[] hVarArr3 = hVarArr2;
            long jS = this.f7839b[i4].s(hVarArr2, zArr, s0VarArr3, zArr2, j3);
            if (i6 == 0) {
                j3 = jS;
            } else if (jS != j3) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i7 = 0; i7 < hVarArr.length; i7++) {
                if (iArr2[i7] == i6) {
                    s0 s0Var = (s0) c.f.a.b.j3.g.e(s0VarArr3[i7]);
                    s0VarArr2[i7] = s0VarArr3[i7];
                    this.f7840c.put(s0Var, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    c.f.a.b.j3.g.g(s0VarArr3[i7] == null);
                }
            }
            if (z) {
                arrayList2.add(this.f7839b[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            hVarArr2 = hVarArr3;
        }
        System.arraycopy(s0VarArr2, 0, s0VarArr, 0, length);
        f0[] f0VarArr2 = (f0[]) arrayList.toArray(new f0[0]);
        this.f7845h = f0VarArr2;
        this.f7846i = this.f7841d.a(f0VarArr2);
        return j3;
    }

    @Override // c.f.a.b.e3.f0
    public a1 t() {
        return (a1) c.f.a.b.j3.g.e(this.f7844g);
    }

    @Override // c.f.a.b.e3.f0
    public void v(long j2, boolean z) {
        for (f0 f0Var : this.f7845h) {
            f0Var.v(j2, z);
        }
    }
}

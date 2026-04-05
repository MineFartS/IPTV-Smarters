package c.f.a.b.e3;

import c.f.a.b.e3.i0;
import c.f.a.b.p1;
import c.f.a.b.p2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends s<Integer> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p1 f7853k = new p1.c().v("MergingMediaSource").a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f7854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i0[] f7856n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2[] f7857o;
    public final ArrayList<i0> p;
    public final u q;
    public final Map<Object, Long> r;
    public final c.f.b.b.e0<Object, q> s;
    public int t;
    public long[][] u;
    public b v;

    public static final class a extends y {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f7858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long[] f7859e;

        public a(p2 p2Var, Map<Object, Long> map) {
            super(p2Var);
            int iP = p2Var.p();
            this.f7859e = new long[p2Var.p()];
            p2.c cVar = new p2.c();
            for (int i2 = 0; i2 < iP; i2++) {
                this.f7859e[i2] = p2Var.n(i2, cVar).r;
            }
            int i3 = p2Var.i();
            this.f7858d = new long[i3];
            p2.b bVar = new p2.b();
            for (int i4 = 0; i4 < i3; i4++) {
                p2Var.g(i4, bVar, true);
                long jLongValue = ((Long) c.f.a.b.j3.g.e(map.get(bVar.f9703c))).longValue();
                long[] jArr = this.f7858d;
                jArr[i4] = jLongValue == Long.MIN_VALUE ? bVar.f9705e : jLongValue;
                long j2 = bVar.f9705e;
                if (j2 != -9223372036854775807L) {
                    long[] jArr2 = this.f7859e;
                    int i5 = bVar.f9704d;
                    jArr2[i5] = jArr2[i5] - (j2 - jArr[i4]);
                }
            }
        }

        @Override // c.f.a.b.e3.y, c.f.a.b.p2
        public p2.b g(int i2, p2.b bVar, boolean z) {
            super.g(i2, bVar, z);
            bVar.f9705e = this.f7858d[i2];
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // c.f.a.b.e3.y, c.f.a.b.p2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public c.f.a.b.p2.c o(int r5, c.f.a.b.p2.c r6, long r7) {
            /*
                r4 = this;
                super.o(r5, r6, r7)
                long[] r7 = r4.f7859e
                r0 = r7[r5]
                r6.r = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.q
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.q
            L20:
                r6.q = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.m0.a.o(int, c.f.a.b.p2$c, long):c.f.a.b.p2$c");
        }
    }

    public static final class b extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7860b;

        public b(int i2) {
            this.f7860b = i2;
        }
    }

    public m0(boolean z, boolean z2, u uVar, i0... i0VarArr) {
        this.f7854l = z;
        this.f7855m = z2;
        this.f7856n = i0VarArr;
        this.q = uVar;
        this.p = new ArrayList<>(Arrays.asList(i0VarArr));
        this.t = -1;
        this.f7857o = new p2[i0VarArr.length];
        this.u = new long[0][];
        this.r = new HashMap();
        this.s = c.f.b.b.f0.a().a().e();
    }

    public m0(boolean z, boolean z2, i0... i0VarArr) {
        this(z, z2, new v(), i0VarArr);
    }

    public m0(boolean z, i0... i0VarArr) {
        this(z, false, i0VarArr);
    }

    public m0(i0... i0VarArr) {
        this(false, i0VarArr);
    }

    @Override // c.f.a.b.e3.s, c.f.a.b.e3.n
    public void B(c.f.a.b.i3.n0 n0Var) {
        super.B(n0Var);
        for (int i2 = 0; i2 < this.f7856n.length; i2++) {
            K(Integer.valueOf(i2), this.f7856n[i2]);
        }
    }

    @Override // c.f.a.b.e3.s, c.f.a.b.e3.n
    public void D() {
        super.D();
        Arrays.fill(this.f7857o, (Object) null);
        this.t = -1;
        this.v = null;
        this.p.clear();
        Collections.addAll(this.p, this.f7856n);
    }

    public final void M() {
        p2.b bVar = new p2.b();
        for (int i2 = 0; i2 < this.t; i2++) {
            long j2 = -this.f7857o[0].f(i2, bVar).o();
            int i3 = 1;
            while (true) {
                p2[] p2VarArr = this.f7857o;
                if (i3 < p2VarArr.length) {
                    this.u[i2][i3] = j2 - (-p2VarArr[i3].f(i2, bVar).o());
                    i3++;
                }
            }
        }
    }

    @Override // c.f.a.b.e3.s
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public i0.a E(Integer num, i0.a aVar) {
        if (num.intValue() == 0) {
            return aVar;
        }
        return null;
    }

    @Override // c.f.a.b.e3.s
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void I(Integer num, i0 i0Var, p2 p2Var) {
        if (this.v != null) {
            return;
        }
        if (this.t == -1) {
            this.t = p2Var.i();
        } else if (p2Var.i() != this.t) {
            this.v = new b(0);
            return;
        }
        if (this.u.length == 0) {
            this.u = (long[][]) Array.newInstance((Class<?>) long.class, this.t, this.f7857o.length);
        }
        this.p.remove(i0Var);
        this.f7857o[num.intValue()] = p2Var;
        if (this.p.isEmpty()) {
            if (this.f7854l) {
                M();
            }
            p2 aVar = this.f7857o[0];
            if (this.f7855m) {
                P();
                aVar = new a(aVar, this.r);
            }
            C(aVar);
        }
    }

    public final void P() {
        p2[] p2VarArr;
        p2.b bVar = new p2.b();
        for (int i2 = 0; i2 < this.t; i2++) {
            long j2 = Long.MIN_VALUE;
            int i3 = 0;
            while (true) {
                p2VarArr = this.f7857o;
                if (i3 >= p2VarArr.length) {
                    break;
                }
                long jK = p2VarArr[i3].f(i2, bVar).k();
                if (jK != -9223372036854775807L) {
                    long j3 = jK + this.u[i2][i3];
                    if (j2 == Long.MIN_VALUE || j3 < j2) {
                        j2 = j3;
                    }
                }
                i3++;
            }
            Object objM = p2VarArr[0].m(i2);
            this.r.put(objM, Long.valueOf(j2));
            Iterator<q> it = this.s.get(objM).iterator();
            while (it.hasNext()) {
                it.next().u(0L, j2);
            }
        }
    }

    @Override // c.f.a.b.e3.i0
    public f0 a(i0.a aVar, c.f.a.b.i3.f fVar, long j2) {
        int length = this.f7856n.length;
        f0[] f0VarArr = new f0[length];
        int iB = this.f7857o[0].b(aVar.f7476a);
        for (int i2 = 0; i2 < length; i2++) {
            f0VarArr[i2] = this.f7856n[i2].a(aVar.c(this.f7857o[i2].m(iB)), fVar, j2 - this.u[iB][i2]);
        }
        l0 l0Var = new l0(this.q, this.u[iB], f0VarArr);
        if (!this.f7855m) {
            return l0Var;
        }
        q qVar = new q(l0Var, true, 0L, ((Long) c.f.a.b.j3.g.e(this.r.get(aVar.f7476a))).longValue());
        this.s.put(aVar.f7476a, qVar);
        return qVar;
    }

    @Override // c.f.a.b.e3.i0
    public p1 h() {
        i0[] i0VarArr = this.f7856n;
        return i0VarArr.length > 0 ? i0VarArr[0].h() : f7853k;
    }

    @Override // c.f.a.b.e3.s, c.f.a.b.e3.i0
    public void l() throws b {
        b bVar = this.v;
        if (bVar != null) {
            throw bVar;
        }
        super.l();
    }

    @Override // c.f.a.b.e3.i0
    public void o(f0 f0Var) {
        if (this.f7855m) {
            q qVar = (q) f0Var;
            Iterator<Map.Entry<Object, q>> it = this.s.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, q> next = it.next();
                if (next.getValue().equals(qVar)) {
                    this.s.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            f0Var = qVar.f7924b;
        }
        l0 l0Var = (l0) f0Var;
        int i2 = 0;
        while (true) {
            i0[] i0VarArr = this.f7856n;
            if (i2 >= i0VarArr.length) {
                return;
            }
            i0VarArr[i2].o(l0Var.a(i2));
            i2++;
        }
    }
}

package c.f.a.b.e3;

import c.f.a.b.e3.f0;
import c.f.a.b.e3.j0;
import c.f.a.b.i3.f0;
import c.f.a.b.i3.g0;
import c.f.a.b.i3.p;
import c.f.a.b.k1;
import c.f.a.b.l1;
import c.f.a.b.m2;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 implements f0, g0.b<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.i3.s f8013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p.a f8014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.i3.n0 f8015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.b.i3.f0 f8016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j0.a f8017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a1 f8018g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f8020i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k1 f8022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f8023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f8025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8026o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<b> f8019h = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c.f.a.b.i3.g0 f8021j = new c.f.a.b.i3.g0("SingleSampleMediaPeriod");

    public final class b implements s0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8028c;

        public b() {
        }

        @Override // c.f.a.b.e3.s0
        public void a() throws IOException {
            w0 w0Var = w0.this;
            if (w0Var.f8023l) {
                return;
            }
            w0Var.f8021j.a();
        }

        public final void b() {
            if (this.f8028c) {
                return;
            }
            w0.this.f8017f.c(c.f.a.b.j3.d0.l(w0.this.f8022k.f9338m), w0.this.f8022k, 0, null, 0L);
            this.f8028c = true;
        }

        public void c() {
            if (this.f8027b == 2) {
                this.f8027b = 1;
            }
        }

        @Override // c.f.a.b.e3.s0
        public boolean e() {
            return w0.this.f8024m;
        }

        @Override // c.f.a.b.e3.s0
        public int i(l1 l1Var, c.f.a.b.v2.f fVar, int i2) {
            b();
            w0 w0Var = w0.this;
            boolean z = w0Var.f8024m;
            if (z && w0Var.f8025n == null) {
                this.f8027b = 2;
            }
            int i3 = this.f8027b;
            if (i3 == 2) {
                fVar.addFlag(4);
                return -4;
            }
            if ((i2 & 2) != 0 || i3 == 0) {
                l1Var.f9575b = w0Var.f8022k;
                this.f8027b = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            c.f.a.b.j3.g.e(w0Var.f8025n);
            fVar.addFlag(1);
            fVar.f10278e = 0L;
            if ((i2 & 4) == 0) {
                fVar.i(w0.this.f8026o);
                ByteBuffer byteBuffer = fVar.f10276c;
                w0 w0Var2 = w0.this;
                byteBuffer.put(w0Var2.f8025n, 0, w0Var2.f8026o);
            }
            if ((i2 & 1) == 0) {
                this.f8027b = 2;
            }
            return -4;
        }

        @Override // c.f.a.b.e3.s0
        public int p(long j2) {
            b();
            if (j2 <= 0 || this.f8027b == 2) {
                return 0;
            }
            this.f8027b = 2;
            return 1;
        }
    }

    public static final class c implements g0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8030a = a0.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.f.a.b.i3.s f8031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c.f.a.b.i3.l0 f8032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f8033d;

        public c(c.f.a.b.i3.s sVar, c.f.a.b.i3.p pVar) {
            this.f8031b = sVar;
            this.f8032c = new c.f.a.b.i3.l0(pVar);
        }

        @Override // c.f.a.b.i3.g0.e
        public void a() {
            this.f8032c.x();
            try {
                this.f8032c.g(this.f8031b);
                int iB = 0;
                while (iB != -1) {
                    int iF = (int) this.f8032c.f();
                    byte[] bArr = this.f8033d;
                    if (bArr == null) {
                        this.f8033d = new byte[1024];
                    } else if (iF == bArr.length) {
                        this.f8033d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    c.f.a.b.i3.l0 l0Var = this.f8032c;
                    byte[] bArr2 = this.f8033d;
                    iB = l0Var.b(bArr2, iF, bArr2.length - iF);
                }
            } finally {
                c.f.a.b.j3.x0.n(this.f8032c);
            }
        }

        @Override // c.f.a.b.i3.g0.e
        public void c() {
        }
    }

    public w0(c.f.a.b.i3.s sVar, p.a aVar, c.f.a.b.i3.n0 n0Var, k1 k1Var, long j2, c.f.a.b.i3.f0 f0Var, j0.a aVar2, boolean z) {
        this.f8013b = sVar;
        this.f8014c = aVar;
        this.f8015d = n0Var;
        this.f8022k = k1Var;
        this.f8020i = j2;
        this.f8016e = f0Var;
        this.f8017f = aVar2;
        this.f8023l = z;
        this.f8018g = new a1(new z0(k1Var));
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long b() {
        return (this.f8024m || this.f8021j.j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean c(long j2) {
        if (this.f8024m || this.f8021j.j() || this.f8021j.i()) {
            return false;
        }
        c.f.a.b.i3.p pVarA = this.f8014c.a();
        c.f.a.b.i3.n0 n0Var = this.f8015d;
        if (n0Var != null) {
            pVarA.h(n0Var);
        }
        c cVar = new c(this.f8013b, pVarA);
        this.f8017f.A(new a0(cVar.f8030a, this.f8013b, this.f8021j.n(cVar, this, this.f8016e.d(1))), 1, -1, this.f8022k, 0, null, 0L, this.f8020i);
        return true;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean d() {
        return this.f8021j.j();
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void k(c cVar, long j2, long j3, boolean z) {
        c.f.a.b.i3.l0 l0Var = cVar.f8032c;
        a0 a0Var = new a0(cVar.f8030a, cVar.f8031b, l0Var.v(), l0Var.w(), j2, j3, l0Var.f());
        this.f8016e.c(cVar.f8030a);
        this.f8017f.r(a0Var, 1, -1, null, 0, null, 0L, this.f8020i);
    }

    @Override // c.f.a.b.e3.f0
    public long f(long j2, m2 m2Var) {
        return j2;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long g() {
        return this.f8024m ? Long.MIN_VALUE : 0L;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public void h(long j2) {
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m(c cVar, long j2, long j3) {
        this.f8026o = (int) cVar.f8032c.f();
        this.f8025n = (byte[]) c.f.a.b.j3.g.e(cVar.f8033d);
        this.f8024m = true;
        c.f.a.b.i3.l0 l0Var = cVar.f8032c;
        a0 a0Var = new a0(cVar.f8030a, cVar.f8031b, l0Var.v(), l0Var.w(), j2, j3, this.f8026o);
        this.f8016e.c(cVar.f8030a);
        this.f8017f.u(a0Var, 1, -1, this.f8022k, 0, null, 0L, this.f8020i);
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public g0.c u(c cVar, long j2, long j3, IOException iOException, int i2) {
        g0.c cVarH;
        c.f.a.b.i3.l0 l0Var = cVar.f8032c;
        a0 a0Var = new a0(cVar.f8030a, cVar.f8031b, l0Var.v(), l0Var.w(), j2, j3, l0Var.f());
        long jA = this.f8016e.a(new f0.c(a0Var, new d0(1, -1, this.f8022k, 0, null, 0L, c.f.a.b.w0.e(this.f8020i)), iOException, i2));
        boolean z = jA == -9223372036854775807L || i2 >= this.f8016e.d(1);
        if (this.f8023l && z) {
            c.f.a.b.j3.z.j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f8024m = true;
            cVarH = c.f.a.b.i3.g0.f8877c;
        } else {
            cVarH = jA != -9223372036854775807L ? c.f.a.b.i3.g0.h(false, jA) : c.f.a.b.i3.g0.f8878d;
        }
        g0.c cVar2 = cVarH;
        boolean z2 = !cVar2.c();
        this.f8017f.w(a0Var, 1, -1, this.f8022k, 0, null, 0L, this.f8020i, iOException, z2);
        if (z2) {
            this.f8016e.c(cVar.f8030a);
        }
        return cVar2;
    }

    @Override // c.f.a.b.e3.f0
    public /* synthetic */ List l(List list) {
        return e0.a(this, list);
    }

    @Override // c.f.a.b.e3.f0
    public void n() {
    }

    @Override // c.f.a.b.e3.f0
    public long o(long j2) {
        for (int i2 = 0; i2 < this.f8019h.size(); i2++) {
            this.f8019h.get(i2).c();
        }
        return j2;
    }

    public void p() {
        this.f8021j.l();
    }

    @Override // c.f.a.b.e3.f0
    public long q() {
        return -9223372036854775807L;
    }

    @Override // c.f.a.b.e3.f0
    public void r(f0.a aVar, long j2) {
        aVar.k(this);
    }

    @Override // c.f.a.b.e3.f0
    public long s(c.f.a.b.g3.h[] hVarArr, boolean[] zArr, s0[] s0VarArr, boolean[] zArr2, long j2) {
        for (int i2 = 0; i2 < hVarArr.length; i2++) {
            if (s0VarArr[i2] != null && (hVarArr[i2] == null || !zArr[i2])) {
                this.f8019h.remove(s0VarArr[i2]);
                s0VarArr[i2] = null;
            }
            if (s0VarArr[i2] == null && hVarArr[i2] != null) {
                b bVar = new b();
                this.f8019h.add(bVar);
                s0VarArr[i2] = bVar;
                zArr2[i2] = true;
            }
        }
        return j2;
    }

    @Override // c.f.a.b.e3.f0
    public a1 t() {
        return this.f8018g;
    }

    @Override // c.f.a.b.e3.f0
    public void v(long j2, boolean z) {
    }
}

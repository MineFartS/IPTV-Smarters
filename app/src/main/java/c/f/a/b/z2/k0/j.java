package c.f.a.b.z2.k0;

import c.f.a.b.j3.i0;
import c.f.a.b.k1;
import c.f.a.b.w1;
import c.f.a.b.z2.c0;
import c.f.a.b.z2.k0.i;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f11091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11092o;
    public boolean p;
    public c0.d q;
    public c0.b r;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0.d f11093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c0.b f11094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f11095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c0.c[] f11096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f11097e;

        public a(c0.d dVar, c0.b bVar, byte[] bArr, c0.c[] cVarArr, int i2) {
            this.f11093a = dVar;
            this.f11094b = bVar;
            this.f11095c = bArr;
            this.f11096d = cVarArr;
            this.f11097e = i2;
        }
    }

    public static void n(i0 i0Var, long j2) {
        if (i0Var.b() < i0Var.f() + 4) {
            i0Var.M(Arrays.copyOf(i0Var.d(), i0Var.f() + 4));
        } else {
            i0Var.O(i0Var.f() + 4);
        }
        byte[] bArrD = i0Var.d();
        bArrD[i0Var.f() - 4] = (byte) (j2 & 255);
        bArrD[i0Var.f() - 3] = (byte) ((j2 >>> 8) & 255);
        bArrD[i0Var.f() - 2] = (byte) ((j2 >>> 16) & 255);
        bArrD[i0Var.f() - 1] = (byte) ((j2 >>> 24) & 255);
    }

    public static int o(byte b2, a aVar) {
        return !aVar.f11096d[p(b2, aVar.f11097e, 1)].f10665a ? aVar.f11093a.f10675g : aVar.f11093a.f10676h;
    }

    public static int p(byte b2, int i2, int i3) {
        return (b2 >> i3) & (255 >>> (8 - i2));
    }

    public static boolean r(i0 i0Var) {
        try {
            return c0.l(1, i0Var, true);
        } catch (w1 unused) {
            return false;
        }
    }

    @Override // c.f.a.b.z2.k0.i
    public void e(long j2) {
        super.e(j2);
        this.p = j2 != 0;
        c0.d dVar = this.q;
        this.f11092o = dVar != null ? dVar.f10675g : 0;
    }

    @Override // c.f.a.b.z2.k0.i
    public long f(i0 i0Var) {
        if ((i0Var.d()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(i0Var.d()[0], (a) c.f.a.b.j3.g.i(this.f11091n));
        long j2 = this.p ? (this.f11092o + iO) / 4 : 0;
        n(i0Var, j2);
        this.p = true;
        this.f11092o = iO;
        return j2;
    }

    @Override // c.f.a.b.z2.k0.i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean i(i0 i0Var, long j2, i.b bVar) throws w1 {
        if (this.f11091n != null) {
            c.f.a.b.j3.g.e(bVar.f11089a);
            return false;
        }
        a aVarQ = q(i0Var);
        this.f11091n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        c0.d dVar = aVarQ.f11093a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f10678j);
        arrayList.add(aVarQ.f11095c);
        bVar.f11089a = new k1.b().e0("audio/vorbis").G(dVar.f10673e).Z(dVar.f10672d).H(dVar.f10670b).f0(dVar.f10671c).T(arrayList).E();
        return true;
    }

    @Override // c.f.a.b.z2.k0.i
    public void l(boolean z) {
        super.l(z);
        if (z) {
            this.f11091n = null;
            this.q = null;
            this.r = null;
        }
        this.f11092o = 0;
        this.p = false;
    }

    public a q(i0 i0Var) throws w1 {
        c0.d dVar = this.q;
        if (dVar == null) {
            this.q = c0.j(i0Var);
            return null;
        }
        c0.b bVar = this.r;
        if (bVar == null) {
            this.r = c0.h(i0Var);
            return null;
        }
        byte[] bArr = new byte[i0Var.f()];
        System.arraycopy(i0Var.d(), 0, bArr, 0, i0Var.f());
        return new a(dVar, bVar, bArr, c0.k(i0Var, dVar.f10670b), c0.a(r4.length - 1));
    }
}

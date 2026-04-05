package c.f.a.b.z2.m0;

import c.f.a.b.j3.u0;
import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11111e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f11107a = new u0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11112f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11113g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11114h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11108b = new c.f.a.b.j3.i0();

    public static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long l(c.f.a.b.j3.i0 i0Var) {
        int iE = i0Var.e();
        if (i0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        i0Var.j(bArr, 0, 9);
        i0Var.P(iE);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    public static long m(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public final int b(c.f.a.b.z2.k kVar) {
        this.f11108b.M(x0.f9301f);
        this.f11109c = true;
        kVar.r();
        return 0;
    }

    public long c() {
        return this.f11114h;
    }

    public u0 d() {
        return this.f11107a;
    }

    public boolean e() {
        return this.f11109c;
    }

    public final int f(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public int g(c.f.a.b.z2.k kVar, c.f.a.b.z2.w wVar) {
        if (!this.f11111e) {
            return j(kVar, wVar);
        }
        if (this.f11113g == -9223372036854775807L) {
            return b(kVar);
        }
        if (!this.f11110d) {
            return h(kVar, wVar);
        }
        long j2 = this.f11112f;
        if (j2 == -9223372036854775807L) {
            return b(kVar);
        }
        this.f11114h = this.f11107a.b(this.f11113g) - this.f11107a.b(j2);
        return b(kVar);
    }

    public final int h(c.f.a.b.z2.k kVar, c.f.a.b.z2.w wVar) {
        int iMin = (int) Math.min(20000L, kVar.getLength());
        long j2 = 0;
        if (kVar.getPosition() != j2) {
            wVar.f11506a = j2;
            return 1;
        }
        this.f11108b.L(iMin);
        kVar.r();
        kVar.u(this.f11108b.d(), 0, iMin);
        this.f11112f = i(this.f11108b);
        this.f11110d = true;
        return 0;
    }

    public final long i(c.f.a.b.j3.i0 i0Var) {
        int iF = i0Var.f();
        for (int iE = i0Var.e(); iE < iF - 3; iE++) {
            if (f(i0Var.d(), iE) == 442) {
                i0Var.P(iE + 4);
                long jL = l(i0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int j(c.f.a.b.z2.k kVar, c.f.a.b.z2.w wVar) {
        long length = kVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j2 = length - ((long) iMin);
        if (kVar.getPosition() != j2) {
            wVar.f11506a = j2;
            return 1;
        }
        this.f11108b.L(iMin);
        kVar.r();
        kVar.u(this.f11108b.d(), 0, iMin);
        this.f11113g = k(this.f11108b);
        this.f11111e = true;
        return 0;
    }

    public final long k(c.f.a.b.j3.i0 i0Var) {
        int iE = i0Var.e();
        for (int iF = i0Var.f() - 4; iF >= iE; iF--) {
            if (f(i0Var.d(), iF) == 442) {
                i0Var.P(iF + 4);
                long jL = l(i0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }
}

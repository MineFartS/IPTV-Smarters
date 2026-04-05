package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class wr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23622e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aml f23618a = new aml(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f23623f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f23624g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f23625h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final alx f23619b = new alx();

    public static long c(alx alxVar) {
        int iC = alxVar.c();
        if (alxVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        alxVar.D(bArr, 0, 9);
        alxVar.I(iC);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j2 = bArr[0];
        byte b2 = bArr[1];
        long j3 = bArr[2];
        return ((((long) bArr[3]) & 255) << 5) | ((j2 & 3) << 28) | (((56 & j2) >> 3) << 30) | ((((long) b2) & 255) << 20) | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((((long) bArr[4]) & 248) >> 3);
    }

    private final void f(rk rkVar) {
        this.f23619b.F(amn.f20140f);
        this.f23620c = true;
        rkVar.i();
    }

    private static final int g(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public final int a(rk rkVar, rz rzVar) {
        long j2 = -9223372036854775807L;
        if (!this.f23622e) {
            long jC = rkVar.c();
            int iMin = (int) Math.min(20000L, jC);
            long j3 = jC - ((long) iMin);
            if (rkVar.e() != j3) {
                rzVar.f22929a = j3;
                return 1;
            }
            this.f23619b.E(iMin);
            rkVar.i();
            rkVar.g(this.f23619b.K(), 0, iMin);
            alx alxVar = this.f23619b;
            int iC = alxVar.c();
            int iD = alxVar.d() - 4;
            while (true) {
                if (iD < iC) {
                    break;
                }
                if (g(alxVar.K(), iD) == 442) {
                    alxVar.I(iD + 4);
                    long jC2 = c(alxVar);
                    if (jC2 != -9223372036854775807L) {
                        j2 = jC2;
                        break;
                    }
                }
                iD--;
            }
            this.f23624g = j2;
            this.f23622e = true;
            return 0;
        }
        if (this.f23624g == -9223372036854775807L) {
            f(rkVar);
            return 0;
        }
        if (this.f23621d) {
            long j4 = this.f23623f;
            if (j4 == -9223372036854775807L) {
                f(rkVar);
                return 0;
            }
            this.f23625h = this.f23618a.b(this.f23624g) - this.f23618a.b(j4);
            f(rkVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, rkVar.c());
        if (rkVar.e() != 0) {
            rzVar.f22929a = 0L;
            return 1;
        }
        this.f23619b.E(iMin2);
        rkVar.i();
        rkVar.g(this.f23619b.K(), 0, iMin2);
        alx alxVar2 = this.f23619b;
        int iC2 = alxVar2.c();
        int iD2 = alxVar2.d();
        while (true) {
            if (iC2 >= iD2 - 3) {
                break;
            }
            if (g(alxVar2.K(), iC2) == 442) {
                alxVar2.I(iC2 + 4);
                long jC3 = c(alxVar2);
                if (jC3 != -9223372036854775807L) {
                    j2 = jC3;
                    break;
                }
            }
            iC2++;
        }
        this.f23623f = j2;
        this.f23621d = true;
        return 0;
    }

    public final long b() {
        return this.f23625h;
    }

    public final aml d() {
        return this.f23618a;
    }

    public final boolean e() {
        return this.f23620c;
    }
}

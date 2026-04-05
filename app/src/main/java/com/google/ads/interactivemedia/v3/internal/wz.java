package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class wz {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23663f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23658a = 112800;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aml f23659b = new aml(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f23664g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f23665h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f23666i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final alx f23660c = new alx();

    public wz(int i2) {
    }

    private final void e(rk rkVar) {
        this.f23660c.F(amn.f20140f);
        this.f23661d = true;
        rkVar.i();
    }

    public final int a(rk rkVar, rz rzVar, int i2) {
        if (i2 <= 0) {
            e(rkVar);
            return 0;
        }
        long j2 = -9223372036854775807L;
        if (!this.f23663f) {
            long jC = rkVar.c();
            int iMin = (int) Math.min(112800L, jC);
            long j3 = jC - ((long) iMin);
            if (rkVar.e() != j3) {
                rzVar.f22929a = j3;
                return 1;
            }
            this.f23660c.E(iMin);
            rkVar.i();
            rkVar.g(this.f23660c.K(), 0, iMin);
            alx alxVar = this.f23660c;
            int iC = alxVar.c();
            int iD = alxVar.d();
            while (true) {
                iD--;
                if (iD < iC) {
                    break;
                }
                if (alxVar.K()[iD] == 71) {
                    long jG = awa.g(alxVar, iD, i2);
                    if (jG != -9223372036854775807L) {
                        j2 = jG;
                        break;
                    }
                }
            }
            this.f23665h = j2;
            this.f23663f = true;
            return 0;
        }
        if (this.f23665h == -9223372036854775807L) {
            e(rkVar);
            return 0;
        }
        if (this.f23662e) {
            long j4 = this.f23664g;
            if (j4 == -9223372036854775807L) {
                e(rkVar);
                return 0;
            }
            this.f23666i = this.f23659b.b(this.f23665h) - this.f23659b.b(j4);
            e(rkVar);
            return 0;
        }
        int iMin2 = (int) Math.min(112800L, rkVar.c());
        if (rkVar.e() != 0) {
            rzVar.f22929a = 0L;
            return 1;
        }
        this.f23660c.E(iMin2);
        rkVar.i();
        rkVar.g(this.f23660c.K(), 0, iMin2);
        alx alxVar2 = this.f23660c;
        int iC2 = alxVar2.c();
        int iD2 = alxVar2.d();
        while (true) {
            if (iC2 >= iD2) {
                break;
            }
            if (alxVar2.K()[iC2] == 71) {
                long jG2 = awa.g(alxVar2, iC2, i2);
                if (jG2 != -9223372036854775807L) {
                    j2 = jG2;
                    break;
                }
            }
            iC2++;
        }
        this.f23664g = j2;
        this.f23662e = true;
        return 0;
    }

    public final long b() {
        return this.f23666i;
    }

    public final aml c() {
        return this.f23659b;
    }

    public final boolean d() {
        return this.f23661d;
    }
}

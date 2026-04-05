package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class wx implements rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aml f23654a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23657d = 112800;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final alx f23655b = new alx();

    public wx(int i2, aml amlVar, int i3) {
        this.f23656c = i2;
        this.f23654a = amlVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rc
    public final rb a(rk rkVar, long j2) {
        int iF;
        int iF2;
        long j3;
        long jE = rkVar.e();
        int iMin = (int) Math.min(112800L, rkVar.c() - jE);
        this.f23655b.E(iMin);
        rkVar.g(this.f23655b.K(), 0, iMin);
        alx alxVar = this.f23655b;
        int iD = alxVar.d();
        long j4 = -1;
        long j5 = -1;
        long j6 = -9223372036854775807L;
        while (alxVar.a() >= 188 && (iF2 = (iF = awa.f(alxVar.K(), alxVar.c(), iD)) + 188) <= iD) {
            long jG = awa.g(alxVar, iF, this.f23656c);
            if (jG != -9223372036854775807L) {
                long jB = this.f23654a.b(jG);
                if (jB > j2) {
                    if (j6 == -9223372036854775807L) {
                        return rb.d(jB, jE);
                    }
                    j3 = jE + j5;
                } else if (100000 + jB > j2) {
                    j3 = jE + ((long) iF);
                } else {
                    j5 = iF;
                    j6 = jB;
                }
                return rb.e(j3);
            }
            alxVar.I(iF2);
            j4 = iF2;
        }
        return j6 != -9223372036854775807L ? rb.f(j6, jE + j4) : rb.f22865a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rc
    public final void b() {
        this.f23655b.F(amn.f20140f);
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class sn implements rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ru f22971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rq f22973c = new rq();

    public /* synthetic */ sn(ru ruVar, int i2) {
        this.f22971a = ruVar;
        this.f22972b = i2;
    }

    private final long c(rk rkVar) {
        while (rkVar.d() < rkVar.c() - 6) {
            ru ruVar = this.f22971a;
            int i2 = this.f22972b;
            rq rqVar = this.f22973c;
            long jD = rkVar.d();
            byte[] bArr = new byte[2];
            rkVar.g(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i2) {
                rkVar.i();
                rkVar.f((int) (jD - rkVar.e()));
            } else {
                alx alxVar = new alx(16);
                System.arraycopy(bArr, 0, alxVar.K(), 0, 2);
                alxVar.H(us.o(rkVar, alxVar.K(), 2, 14));
                rkVar.i();
                rkVar.f((int) (jD - rkVar.e()));
                if (us.n(alxVar, ruVar, i2, rqVar)) {
                    break;
                }
            }
            rkVar.f(1);
        }
        if (rkVar.d() < rkVar.c() - 6) {
            return this.f22973c.f22902a;
        }
        rkVar.f((int) (rkVar.c() - rkVar.d()));
        return this.f22971a.f22917j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rc
    public final rb a(rk rkVar, long j2) {
        long jE = rkVar.e();
        long jC = c(rkVar);
        long jD = rkVar.d();
        rkVar.f(Math.max(6, this.f22971a.f22910c));
        long jC2 = c(rkVar);
        return (jC > j2 || jC2 <= j2) ? jC2 <= j2 ? rb.f(jC2, rkVar.d()) : rb.d(jC, jE) : rb.e(jD);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rc
    public final /* synthetic */ void b() {
    }
}

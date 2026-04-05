package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vn extends vl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private vm f23348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private sj f23351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private sh f23352e;

    @Override // com.google.ads.interactivemedia.v3.internal.vl
    public final long a(alx alxVar) {
        if ((alxVar.K()[0] & 1) == 1) {
            return -1L;
        }
        byte b2 = alxVar.K()[0];
        vm vmVar = this.f23348a;
        ajr.c(vmVar);
        int i2 = !vmVar.f23346c[(b2 >> 1) & (255 >>> (8 - vmVar.f23347d))].f22946a ? vmVar.f23344a.f22951e : vmVar.f23344a.f22952f;
        long j2 = this.f23350c ? (this.f23349b + i2) / 4 : 0;
        if (alxVar.b() < alxVar.d() + 4) {
            alxVar.F(Arrays.copyOf(alxVar.K(), alxVar.d() + 4));
        } else {
            alxVar.H(alxVar.d() + 4);
        }
        byte[] bArrK = alxVar.K();
        bArrK[alxVar.d() - 4] = (byte) (j2 & 255);
        bArrK[alxVar.d() - 3] = (byte) ((j2 >>> 8) & 255);
        bArrK[alxVar.d() - 2] = (byte) ((j2 >>> 16) & 255);
        bArrK[alxVar.d() - 1] = (byte) ((j2 >>> 24) & 255);
        this.f23350c = true;
        this.f23349b = i2;
        return j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vl
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.f23348a = null;
            this.f23351d = null;
            this.f23352e = null;
        }
        this.f23349b = 0;
        this.f23350c = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    @Override // com.google.ads.interactivemedia.v3.internal.vl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.ads.interactivemedia.v3.internal.alx r17, long r18, com.google.ads.interactivemedia.v3.internal.vj r20) throws com.google.ads.interactivemedia.v3.internal.lb {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.vn.c(com.google.ads.interactivemedia.v3.internal.alx, long, com.google.ads.interactivemedia.v3.internal.vj):boolean");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vl
    public final void i(long j2) {
        super.i(j2);
        this.f23350c = j2 != 0;
        sj sjVar = this.f23351d;
        this.f23349b = sjVar != null ? sjVar.f22951e : 0;
    }
}

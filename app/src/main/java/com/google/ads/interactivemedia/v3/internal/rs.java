package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class rs implements sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ru f22904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22905b;

    public rs(ru ruVar, long j2) {
        this.f22904a = ruVar;
        this.f22905b = j2;
    }

    private final sd a(long j2, long j3) {
        return new sd((j2 * 1000000) / ((long) this.f22904a.f22912e), this.f22905b + j3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final long e() {
        return this.f22904a.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final sa g(long j2) {
        ajr.c(this.f22904a.f22918k);
        ru ruVar = this.f22904a;
        rt rtVar = ruVar.f22918k;
        long[] jArr = rtVar.f22906a;
        long[] jArr2 = rtVar.f22907b;
        int iAk = amn.ak(jArr, ruVar.b(j2), false);
        sd sdVarA = a(iAk == -1 ? 0L : jArr[iAk], iAk != -1 ? jArr2[iAk] : 0L);
        if (sdVarA.f22935b == j2 || iAk == jArr.length - 1) {
            return new sa(sdVarA, sdVarA);
        }
        int i2 = iAk + 1;
        return new sa(sdVarA, a(jArr[i2], jArr2[i2]));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final boolean h() {
        return true;
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class vb implements vh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ru f23303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rt f23304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f23305c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f23306d = -1;

    public vb(ru ruVar, rt rtVar) {
        this.f23303a = ruVar;
        this.f23304b = rtVar;
    }

    public final void a(long j2) {
        this.f23305c = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vh
    public final long d(rk rkVar) {
        long j2 = this.f23306d;
        if (j2 < 0) {
            return -1L;
        }
        this.f23306d = -1L;
        return -(j2 + 2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vh
    public final sc e() {
        ajr.f(this.f23305c != -1);
        return new rs(this.f23303a, this.f23305c);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vh
    public final void g(long j2) {
        long[] jArr = this.f23304b.f22906a;
        this.f23306d = jArr[amn.ak(jArr, j2, true)];
    }
}

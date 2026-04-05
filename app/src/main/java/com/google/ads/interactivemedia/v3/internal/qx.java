package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class qx implements sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ra f22839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f22842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f22844f;

    public qx(ra raVar, long j2, long j3, long j4, long j5, long j6) {
        this.f22839a = raVar;
        this.f22840b = j2;
        this.f22841c = j3;
        this.f22842d = j4;
        this.f22843e = j5;
        this.f22844f = j6;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final long e() {
        return this.f22840b;
    }

    public final long f(long j2) {
        return this.f22839a.a(j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final sa g(long j2) {
        sd sdVar = new sd(j2, qz.f(this.f22839a.a(j2), 0L, this.f22841c, this.f22842d, this.f22843e, this.f22844f));
        return new sa(sdVar, sdVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final boolean h() {
        return true;
    }
}

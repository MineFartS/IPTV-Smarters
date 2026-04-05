package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class sb implements sc, tu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sa f22933b;

    public sb() {
        this(-9223372036854775807L);
    }

    public sb(long j2) {
        this(j2, 0L);
    }

    public sb(long j2, long j3) {
        this.f22932a = j2;
        sd sdVar = j3 == 0 ? sd.f22934a : new sd(0L, j3);
        this.f22933b = new sa(sdVar, sdVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tu
    public final long a() {
        return -1L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tu
    public final long b(long j2) {
        return 0L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final long e() {
        return this.f22932a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final sa g(long j2) {
        return this.f22933b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final boolean h() {
        return false;
    }
}

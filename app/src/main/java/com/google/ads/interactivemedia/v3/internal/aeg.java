package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aeg implements aef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final re f19362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19363b;

    public aeg(re reVar, long j2) {
        this.f19362a = reVar;
        this.f19363b = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long a(long j2, long j3) {
        return this.f19362a.f22873a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long b(long j2, long j3) {
        return this.f19362a.f22876d[(int) j2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long c(long j2, long j3) {
        return 0L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long d() {
        return 0L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long e(long j2, long j3) {
        return -9223372036854775807L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long f(long j2) {
        return this.f19362a.f22873a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long g(long j2, long j3) {
        return this.f19362a.a(j2 + this.f19363b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long h(long j2) {
        return this.f19362a.f22877e[(int) j2] - this.f19363b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final aey i(long j2) {
        return new aey(null, this.f19362a.f22875c[(int) j2], r0.f22874b[r9]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final boolean j() {
        return true;
    }
}

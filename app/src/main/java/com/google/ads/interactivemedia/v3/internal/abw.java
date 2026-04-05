package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class abw implements ack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ abz f19104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19105b;

    public abw(abz abzVar, int i2) {
        this.f19104a = abzVar;
        this.f19105b = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final int a(kf kfVar, pz pzVar, int i2) {
        return this.f19104a.g(this.f19105b, kfVar, pzVar, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final int b(long j2) {
        return this.f19104a.i(this.f19105b, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final void d() {
        this.f19104a.B(this.f19105b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final boolean e() {
        return this.f19104a.G(this.f19105b);
    }
}

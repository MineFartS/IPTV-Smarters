package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class td implements rm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rm f23046c;

    public td(long j2, rm rmVar) {
        this.f23045b = j2;
        this.f23046c = rmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rm
    public final sf aZ(int i2, int i3) {
        return this.f23046c.aZ(i2, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rm
    public final void ba() {
        this.f23046c.ba();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rm
    public final void bb(sc scVar) {
        this.f23046c.bb(new tc(this, scVar));
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class tc implements sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc f23043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ td f23044b;

    public tc(td tdVar, sc scVar) {
        this.f23044b = tdVar;
        this.f23043a = scVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final long e() {
        return this.f23043a.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final sa g(long j2) {
        sa saVarG = this.f23043a.g(j2);
        sd sdVar = saVarG.f22930a;
        sd sdVar2 = new sd(sdVar.f22935b, sdVar.f22936c + this.f23044b.f23045b);
        sd sdVar3 = saVarG.f22931b;
        return new sa(sdVar2, new sd(sdVar3.f22935b, sdVar3.f22936c + this.f23044b.f23045b));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final boolean h() {
        return this.f23043a.h();
    }
}

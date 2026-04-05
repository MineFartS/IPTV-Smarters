package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class afu extends acy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ahd> f19515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19516c;

    public afu(long j2, List<ahd> list) {
        super(0L, list.size() - 1);
        this.f19516c = j2;
        this.f19515b = list;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adp
    public final long d() {
        b();
        ahd ahdVar = this.f19515b.get((int) a());
        return this.f19516c + ahdVar.f19693g + ahdVar.f19691e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adp
    public final long e() {
        b();
        return this.f19516c + this.f19515b.get((int) a()).f19693g;
    }
}

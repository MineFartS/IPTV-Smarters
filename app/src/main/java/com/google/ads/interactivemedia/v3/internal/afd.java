package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class afd extends afc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<aey> f19477e;

    public afd(aey aeyVar, long j2, long j3, long j4, long j5, List<aff> list, long j6, List<aey> list2, long j7, long j8) {
        super(aeyVar, j2, j3, j4, j5, list, j6, j7, j8);
        this.f19477e = list2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.afc
    public final long c(long j2) {
        return this.f19477e.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.afc
    public final aey g(afb afbVar, long j2) {
        return this.f19477e.get((int) (j2 - this.f19471a));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.afc
    public final boolean h() {
        return true;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aez extends afb implements aef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final afc f19460a;

    public aez(ke keVar, String str, afc afcVar, List<aeu> list) {
        super(keVar, str, afcVar, list);
        this.f19460a = afcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long a(long j2, long j3) {
        return this.f19460a.a(j2, j3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long b(long j2, long j3) {
        return this.f19460a.d(j2, j3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long c(long j2, long j3) {
        return this.f19460a.b(j2, j3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long d() {
        return this.f19460a.f19471a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long e(long j2, long j3) {
        afc afcVar = this.f19460a;
        if (afcVar.f19473c != null) {
            return -9223372036854775807L;
        }
        long jB = afcVar.b(j2, j3) + afcVar.a(j2, j3);
        return (afcVar.f(jB) + afcVar.d(jB, j2)) - afcVar.f19474d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long f(long j2) {
        return this.f19460a.c(j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long g(long j2, long j3) {
        return this.f19460a.e(j2, j3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final long h(long j2) {
        return this.f19460a.f(j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final aey i(long j2) {
        return this.f19460a.g(this, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aef
    public final boolean j() {
        return this.f19460a.h();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.afb
    public final aef k() {
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.afb
    public final aey l() {
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.afb
    public final void m() {
    }
}

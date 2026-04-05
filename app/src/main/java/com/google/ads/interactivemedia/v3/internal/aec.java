package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class aec implements akc<akm<Long>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aee f19345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19346b;

    public /* synthetic */ aec(aee aeeVar) {
        this.f19345a = aeeVar;
    }

    public /* synthetic */ aec(aee aeeVar, int i2) {
        this.f19346b = i2;
        this.f19345a = aeeVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ void C(akf akfVar, long j2, long j3, boolean z) {
        if (this.f19346b != 0) {
            this.f19345a.J((akm) akfVar, j2, j3);
        } else {
            this.f19345a.J((akm) akfVar, j2, j3);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ void D(akf akfVar, long j2, long j3) {
        if (this.f19346b != 0) {
            this.f19345a.K((akm) akfVar, j2, j3);
        } else {
            this.f19345a.L((akm) akfVar, j2, j3);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ akd u(akf akfVar, long j2, long j3, IOException iOException, int i2) {
        int i3 = this.f19346b;
        akm<Long> akmVar = (akm) akfVar;
        aee aeeVar = this.f19345a;
        return i3 != 0 ? aeeVar.y(akmVar, j2, j3, iOException, i2) : aeeVar.A(akmVar, j2, j3, iOException);
    }
}

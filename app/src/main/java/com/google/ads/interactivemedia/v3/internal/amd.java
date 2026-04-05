package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public final class amd implements akc<akf> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final amc f20112a;

    public amd(amc amcVar) {
        this.f20112a = amcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final void C(akf akfVar, long j2, long j3, boolean z) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final void D(akf akfVar, long j2, long j3) {
        if (amf.g()) {
            this.f20112a.b();
        } else {
            this.f20112a.a(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final akd u(akf akfVar, long j2, long j3, IOException iOException, int i2) {
        this.f20112a.a(iOException);
        return akj.f19982b;
    }
}

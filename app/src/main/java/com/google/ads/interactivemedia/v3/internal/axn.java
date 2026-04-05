package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class axn<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P f20689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f20690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bcu f20691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bdl f20692d;

    public axn(P p, byte[] bArr, bcu bcuVar, bdl bdlVar) {
        this.f20689a = p;
        this.f20690b = Arrays.copyOf(bArr, bArr.length);
        this.f20691c = bcuVar;
        this.f20692d = bdlVar;
    }

    public final bcu a() {
        return this.f20691c;
    }

    public final bdl b() {
        return this.f20692d;
    }

    public final P c() {
        return this.f20689a;
    }

    public final byte[] d() {
        byte[] bArr = this.f20690b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}

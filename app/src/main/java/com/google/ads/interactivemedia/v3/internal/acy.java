package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class acy implements adp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19227d;

    public acy(long j2, long j3) {
        this.f19225b = j2;
        this.f19226c = j3;
        this.f19227d = j2 - 1;
    }

    public final long a() {
        return this.f19227d;
    }

    public final void b() {
        long j2 = this.f19227d;
        if (j2 < this.f19225b || j2 > this.f19226c) {
            throw new NoSuchElementException();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adp
    public final boolean c() {
        long j2 = this.f19227d + 1;
        this.f19227d = j2;
        return j2 <= this.f19226c;
    }
}

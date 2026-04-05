package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class bfd extends bfv<AtomicLong> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bfv f21027a;

    public bfd(bfv bfvVar) {
        this.f21027a = bfvVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ AtomicLong read(bjj bjjVar) {
        return new AtomicLong(((Number) this.f21027a.read(bjjVar)).longValue());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, AtomicLong atomicLong) {
        this.f21027a.write(bjlVar, Long.valueOf(atomicLong.get()));
    }
}

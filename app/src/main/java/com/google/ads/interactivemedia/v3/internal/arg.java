package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class arg implements arh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f20417a = new CountDownLatch(1);

    private arg() {
    }

    public /* synthetic */ arg(byte[] bArr) {
    }

    public final boolean a(long j2, TimeUnit timeUnit) {
        return this.f20417a.await(j2, timeUnit);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aql
    public final void c() {
        this.f20417a.countDown();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqq
    public final void e(Exception exc) {
        this.f20417a.countDown();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqt
    public final void f(Object obj) {
        this.f20417a.countDown();
    }
}

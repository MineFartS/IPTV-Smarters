package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aqo implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aqv f20385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aqp f20386b;

    public aqo(aqp aqpVar, aqv aqvVar) {
        this.f20386b = aqpVar;
        this.f20385a = aqvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20386b.f20388b) {
            if (this.f20386b.f20389c != null) {
                this.f20386b.f20389c.e((Exception) c.f.a.c.f.q.o.i(this.f20385a.b()));
            }
        }
    }
}

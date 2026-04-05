package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aqr implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aqv f20390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aqs f20391b;

    public aqr(aqs aqsVar, aqv aqvVar) {
        this.f20391b = aqsVar;
        this.f20390a = aqvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20391b.f20393b) {
            if (this.f20391b.f20394c != null) {
                this.f20391b.f20394c.f(this.f20390a.c());
            }
        }
    }
}

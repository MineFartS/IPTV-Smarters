package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aqj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aqk f20376a;

    public aqj(aqk aqkVar) {
        this.f20376a = aqkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20376a.f20378b) {
            if (this.f20376a.f20379c != null) {
                this.f20376a.f20379c.c();
            }
        }
    }
}

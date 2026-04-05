package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class akv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f20017a;

    public final synchronized void a() {
        while (!this.f20017a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.f20017a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        return this.f20017a;
    }

    public final synchronized boolean d() {
        if (this.f20017a) {
            return false;
        }
        this.f20017a = true;
        notifyAll();
        return true;
    }

    public final synchronized void e() {
        this.f20017a = false;
    }
}

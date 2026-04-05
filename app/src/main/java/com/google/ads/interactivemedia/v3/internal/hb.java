package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class hb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hc f21890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f21891b;

    public hb(hc hcVar) {
        this.f21890a = hcVar;
    }

    public hb(hc hcVar, int i2) {
        this.f21891b = i2;
        this.f21890a = hcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f21891b != 0) {
            this.f21890a.v();
        } else {
            aoo.a(this.f21890a.f21893a);
        }
    }
}

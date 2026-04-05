package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ani implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ano f20243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pw f20244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f20245c;

    public /* synthetic */ ani(ano anoVar, pw pwVar) {
        this.f20243a = anoVar;
        this.f20244b = pwVar;
    }

    public /* synthetic */ ani(ano anoVar, pw pwVar, int i2) {
        this.f20245c = i2;
        this.f20243a = anoVar;
        this.f20244b = pwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20245c != 0) {
            this.f20243a.i(this.f20244b);
        } else {
            this.f20243a.k(this.f20244b);
        }
    }
}

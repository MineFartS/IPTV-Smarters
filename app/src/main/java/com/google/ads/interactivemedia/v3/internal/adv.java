package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class adv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aee f19321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19322b;

    public /* synthetic */ adv(aee aeeVar) {
        this.f19321a = aeeVar;
    }

    public /* synthetic */ adv(aee aeeVar, int i2) {
        this.f19322b = i2;
        this.f19321a = aeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19322b != 0) {
            this.f19321a.G();
        } else {
            this.f19321a.T();
        }
    }
}

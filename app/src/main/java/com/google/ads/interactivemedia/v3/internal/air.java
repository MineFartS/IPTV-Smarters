package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class air implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ais f19849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19850b;

    public final void a() {
        if (this.f19850b) {
            return;
        }
        this.f19850b = true;
        this.f19849a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19850b = false;
    }
}

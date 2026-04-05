package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class od implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oi f22602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pw f22603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22604c;

    public /* synthetic */ od(oi oiVar, pw pwVar) {
        this.f22602a = oiVar;
        this.f22603b = pwVar;
    }

    public /* synthetic */ od(oi oiVar, pw pwVar, int i2) {
        this.f22604c = i2;
        this.f22602a = oiVar;
        this.f22603b = pwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f22604c != 0) {
            this.f22602a.l(this.f22603b);
        } else {
            this.f22602a.m(this.f22603b);
        }
    }
}

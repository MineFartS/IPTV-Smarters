package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class abs implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ abz f19085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19086b;

    public /* synthetic */ abs(abz abzVar) {
        this.f19085a = abzVar;
    }

    public /* synthetic */ abs(abz abzVar, int i2) {
        this.f19086b = i2;
        this.f19085a = abzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19086b != 0) {
            this.f19085a.y();
        } else {
            this.f19085a.O();
        }
    }
}

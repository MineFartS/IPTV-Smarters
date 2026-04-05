package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ang implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ano f20236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f20237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f20239d;

    public /* synthetic */ ang(ano anoVar, int i2, long j2, int i3) {
        this.f20239d = i3;
        this.f20236a = anoVar;
        this.f20238c = i2;
        this.f20237b = j2;
    }

    public /* synthetic */ ang(ano anoVar, long j2, int i2) {
        this.f20236a = anoVar;
        this.f20237b = j2;
        this.f20238c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20239d != 0) {
            this.f20236a.j(this.f20238c, this.f20237b);
        } else {
            this.f20236a.n(this.f20237b, this.f20238c);
        }
    }
}

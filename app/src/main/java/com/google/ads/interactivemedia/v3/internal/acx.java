package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class acx extends adn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19222b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private acz f19223m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f19224n;

    public acx(ajh ajhVar, ajl ajlVar, ke keVar, int i2, long j2, long j3, long j4, long j5, long j6) {
        super(ajhVar, ajlVar, keVar, i2, j2, j3, j6);
        this.f19221a = j4;
        this.f19222b = j5;
    }

    public final int a(int i2) {
        return ((int[]) ajr.c(this.f19224n))[i2];
    }

    public final acz b() {
        acz aczVar = this.f19223m;
        ajr.c(aczVar);
        return aczVar;
    }

    public final void c(acz aczVar) {
        this.f19223m = aczVar;
        this.f19224n = aczVar.b();
    }
}

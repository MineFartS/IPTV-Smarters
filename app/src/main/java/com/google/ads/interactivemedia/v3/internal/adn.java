package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class adn extends add {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f19294l;

    public adn(ajh ajhVar, ajl ajlVar, ke keVar, int i2, long j2, long j3, long j4) {
        super(ajhVar, ajlVar, 1, keVar, i2, j2, j3);
        ajr.b(keVar);
        this.f19294l = j4;
    }

    public long g() {
        long j2 = this.f19294l;
        if (j2 != -1) {
            return j2 + 1;
        }
        return -1L;
    }

    public abstract boolean j();
}

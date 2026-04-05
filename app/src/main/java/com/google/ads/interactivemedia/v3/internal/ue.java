package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ue implements ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final alx f23166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23170e;

    public ue(ty tyVar) {
        alx alxVar = tyVar.f23136a;
        this.f23166a = alxVar;
        alxVar.I(12);
        this.f23168c = alxVar.n() & 255;
        this.f23167b = alxVar.n();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ub
    public final int a() {
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ub
    public final int b() {
        return this.f23167b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ub
    public final int c() {
        int i2 = this.f23168c;
        if (i2 == 8) {
            return this.f23166a.k();
        }
        if (i2 == 16) {
            return this.f23166a.o();
        }
        int i3 = this.f23169d;
        this.f23169d = i3 + 1;
        if (i3 % 2 != 0) {
            return this.f23170e & 15;
        }
        int iK = this.f23166a.k();
        this.f23170e = iK;
        return (iK & 240) >> 4;
    }
}

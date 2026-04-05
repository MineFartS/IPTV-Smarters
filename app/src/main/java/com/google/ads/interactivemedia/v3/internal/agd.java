package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class agd implements ack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final agk f19581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19582c = -1;

    public agd(agk agkVar, int i2) {
        this.f19581b = agkVar;
        this.f19580a = i2;
    }

    private final boolean g() {
        int i2 = this.f19582c;
        return (i2 == -1 || i2 == -3 || i2 == -2) ? false : true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final int a(kf kfVar, pz pzVar, int i2) {
        if (this.f19582c == -3) {
            pzVar.a(4);
            return -4;
        }
        if (g()) {
            return this.f19581b.e(this.f19582c, kfVar, pzVar, i2);
        }
        return -3;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final int b(long j2) {
        if (g()) {
            return this.f19581b.f(this.f19582c, j2);
        }
        return 0;
    }

    public final void c() {
        ajr.d(this.f19582c == -1);
        this.f19582c = this.f19581b.d(this.f19580a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final void d() throws ago {
        int i2 = this.f19582c;
        if (i2 == -2) {
            throw new ago(this.f19581b.g().b(this.f19580a).b(0).f22156l);
        }
        if (i2 == -1) {
            this.f19581b.k();
        } else if (i2 != -3) {
            this.f19581b.o(i2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final boolean e() {
        return this.f19582c == -3 || (g() && this.f19581b.y(this.f19582c));
    }

    public final void f() {
        if (this.f19582c != -1) {
            this.f19581b.x(this.f19580a);
            this.f19582c = -1;
        }
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class adg implements ack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final adi f19265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ adi f19266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final acj f19267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19269e;

    public adg(adi adiVar, adi adiVar2, acj acjVar, int i2) {
        this.f19266b = adiVar;
        this.f19265a = adiVar2;
        this.f19267c = acjVar;
        this.f19268d = i2;
    }

    private final void f() {
        if (this.f19269e) {
            return;
        }
        this.f19266b.f19277h.o(this.f19266b.f19272c[this.f19268d], this.f19266b.f19273d[this.f19268d], 0, this.f19266b.t);
        this.f19269e = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final int a(kf kfVar, pz pzVar, int i2) {
        if (this.f19266b.p()) {
            return -3;
        }
        f();
        return this.f19267c.l(kfVar, pzVar, i2, this.f19266b.f19271b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final int b(long j2) {
        if (this.f19266b.p()) {
            return 0;
        }
        int i2 = this.f19267c.i(j2, this.f19266b.f19271b);
        this.f19267c.E(i2);
        if (i2 > 0) {
            f();
        }
        return i2;
    }

    public final void c() {
        ajr.f(this.f19266b.f19274e[this.f19268d]);
        this.f19266b.f19274e[this.f19268d] = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final void d() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final boolean e() {
        return !this.f19266b.p() && this.f19267c.I(this.f19266b.f19271b);
    }
}

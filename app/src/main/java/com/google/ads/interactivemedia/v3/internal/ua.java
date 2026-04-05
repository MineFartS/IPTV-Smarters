package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f23153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f23154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final alx f23155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final alx f23156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23158i;

    public ua(alx alxVar, alx alxVar2, boolean z) throws lb {
        this.f23156g = alxVar;
        this.f23155f = alxVar2;
        this.f23154e = z;
        alxVar2.I(12);
        this.f23150a = alxVar2.n();
        alxVar.I(12);
        this.f23158i = alxVar.n();
        us.p(alxVar.e() == 1, "first_chunk must be 1");
        this.f23151b = -1;
    }

    public final boolean a() {
        int i2 = this.f23151b + 1;
        this.f23151b = i2;
        if (i2 == this.f23150a) {
            return false;
        }
        this.f23153d = this.f23154e ? this.f23155f.t() : this.f23155f.s();
        if (this.f23151b == this.f23157h) {
            this.f23152c = this.f23156g.n();
            this.f23156g.J(4);
            int i3 = this.f23158i - 1;
            this.f23158i = i3;
            this.f23157h = i3 > 0 ? (-1) + this.f23156g.n() : -1;
        }
        return true;
    }
}

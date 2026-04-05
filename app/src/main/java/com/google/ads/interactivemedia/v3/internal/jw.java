package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class jw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ld f22097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22103g;

    public jw(ld ldVar) {
        this.f22097a = ldVar;
    }

    public final void a(int i2) {
        this.f22103g = 1 == ((this.f22103g ? 1 : 0) | i2);
        this.f22098b += i2;
    }

    public final void b(int i2) {
        this.f22103g = true;
        this.f22101e = true;
        this.f22102f = i2;
    }

    public final void c(ld ldVar) {
        this.f22103g |= this.f22097a != ldVar;
        this.f22097a = ldVar;
    }

    public final void d(int i2) {
        if (this.f22099c && this.f22100d != 5) {
            ajr.d(i2 == 5);
            return;
        }
        this.f22103g = true;
        this.f22099c = true;
        this.f22100d = i2;
    }
}

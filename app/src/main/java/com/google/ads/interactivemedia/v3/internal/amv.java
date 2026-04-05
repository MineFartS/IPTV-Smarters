package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class amv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20181c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20183e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private amu f20179a = new amu();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private amu f20180b = new amu();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20182d = -9223372036854775807L;

    public final float a() {
        if (!g()) {
            return -1.0f;
        }
        double dA = this.f20179a.a();
        Double.isNaN(dA);
        return (float) (1.0E9d / dA);
    }

    public final int b() {
        return this.f20183e;
    }

    public final long c() {
        if (g()) {
            return this.f20179a.a();
        }
        return -9223372036854775807L;
    }

    public final long d() {
        if (g()) {
            return this.f20179a.b();
        }
        return -9223372036854775807L;
    }

    public final void e(long j2) {
        this.f20179a.c(j2);
        if (this.f20179a.f()) {
            this.f20181c = false;
        } else if (this.f20182d != -9223372036854775807L) {
            if (!this.f20181c || this.f20180b.e()) {
                this.f20180b.d();
                this.f20180b.c(this.f20182d);
            }
            this.f20181c = true;
            this.f20180b.c(j2);
        }
        if (this.f20181c && this.f20180b.f()) {
            amu amuVar = this.f20179a;
            this.f20179a = this.f20180b;
            this.f20180b = amuVar;
            this.f20181c = false;
        }
        this.f20182d = j2;
        this.f20183e = this.f20179a.f() ? 0 : this.f20183e + 1;
    }

    public final void f() {
        this.f20179a.d();
        this.f20180b.d();
        this.f20181c = false;
        this.f20182d = -9223372036854775807L;
        this.f20183e = 0;
    }

    public final boolean g() {
        return this.f20179a.f();
    }
}

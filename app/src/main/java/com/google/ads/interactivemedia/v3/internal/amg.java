package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class amg implements all {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final akt f20118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private le f20122e = le.f22306a;

    public amg(akt aktVar) {
        this.f20118a = aktVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.all
    public final long a() {
        long j2 = this.f20120c;
        if (!this.f20119b) {
            return j2;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f20121d;
        le leVar = this.f20122e;
        return j2 + (leVar.f22307b == 1.0f ? iw.b(jElapsedRealtime) : leVar.a(jElapsedRealtime));
    }

    public final void b(long j2) {
        this.f20120c = j2;
        if (this.f20119b) {
            this.f20121d = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.all
    public final le c() {
        return this.f20122e;
    }

    public final void d() {
        if (this.f20119b) {
            return;
        }
        this.f20121d = SystemClock.elapsedRealtime();
        this.f20119b = true;
    }

    public final void e() {
        if (this.f20119b) {
            b(a());
            this.f20119b = false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.all
    public final void g(le leVar) {
        if (this.f20119b) {
            b(a());
        }
        this.f20122e = leVar;
    }
}

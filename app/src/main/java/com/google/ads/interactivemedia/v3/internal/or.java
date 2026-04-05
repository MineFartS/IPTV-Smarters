package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final class or {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oq f22628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f22630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f22631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f22632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f22633f;

    public or(AudioTrack audioTrack) {
        if (amn.f20135a >= 19) {
            this.f22628a = new oq(audioTrack);
            e();
        } else {
            this.f22628a = null;
            h(3);
        }
    }

    private final void h(int i2) {
        this.f22629b = i2;
        long j2 = 10000;
        if (i2 == 0) {
            this.f22632e = 0L;
            this.f22633f = -1L;
            this.f22630c = System.nanoTime() / 1000;
        } else {
            if (i2 == 1) {
                this.f22631d = 10000L;
                return;
            }
            j2 = (i2 == 2 || i2 == 3) ? 10000000L : 500000L;
        }
        this.f22631d = j2;
    }

    @TargetApi(19)
    public final long a() {
        oq oqVar = this.f22628a;
        if (oqVar != null) {
            return oqVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public final long b() {
        oq oqVar = this.f22628a;
        if (oqVar != null) {
            return oqVar.b();
        }
        return -9223372036854775807L;
    }

    public final void c() {
        if (this.f22629b == 4) {
            e();
        }
    }

    public final void d() {
        h(4);
    }

    public final void e() {
        if (this.f22628a != null) {
            h(0);
        }
    }

    public final boolean f() {
        return this.f22629b == 2;
    }

    @TargetApi(19)
    public final boolean g(long j2) {
        oq oqVar = this.f22628a;
        if (oqVar != null && j2 - this.f22632e >= this.f22631d) {
            this.f22632e = j2;
            boolean zC = oqVar.c();
            int i2 = this.f22629b;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3 && zC) {
                            e();
                            return true;
                        }
                    } else if (!zC) {
                        e();
                        return false;
                    }
                } else if (!zC) {
                    e();
                } else if (this.f22628a.a() > this.f22633f) {
                    h(2);
                    return true;
                }
            } else {
                if (zC) {
                    if (this.f22628a.b() < this.f22630c) {
                        return false;
                    }
                    this.f22633f = this.f22628a.a();
                    h(1);
                    return true;
                }
                if (j2 - this.f22630c > 500000) {
                    h(3);
                }
            }
            return zC;
        }
        return false;
    }
}

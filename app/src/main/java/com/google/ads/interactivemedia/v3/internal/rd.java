package com.google.ads.interactivemedia.v3.internal;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes.dex */
public class rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx f22869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rc f22870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qz f22871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22872d;

    public rd(ra raVar, rc rcVar, long j2, long j3, long j4, long j5, long j6, int i2) {
        this.f22870b = rcVar;
        this.f22872d = i2;
        this.f22869a = new qx(raVar, j2, j3, j4, j5, j6);
    }

    public static final int f(rk rkVar, long j2, rz rzVar) {
        if (j2 == rkVar.e()) {
            return 0;
        }
        rzVar.f22929a = j2;
        return 1;
    }

    public static final boolean g(rk rkVar, long j2) {
        long jE = j2 - rkVar.e();
        if (jE < 0 || jE > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        rkVar.j((int) jE);
        return true;
    }

    public final int a(rk rkVar, rz rzVar) {
        while (true) {
            qz qzVar = this.f22871c;
            ajr.c(qzVar);
            long j2 = qzVar.f22850f;
            long j3 = qzVar.f22851g;
            long j4 = qzVar.f22852h;
            if (j3 - j2 <= this.f22872d) {
                e();
                return f(rkVar, j2, rzVar);
            }
            if (!g(rkVar, j4)) {
                return f(rkVar, j4, rzVar);
            }
            rkVar.i();
            rb rbVarA = this.f22870b.a(rkVar, qzVar.f22846b);
            int i2 = rbVarA.f22866b;
            if (i2 == -3) {
                e();
                return f(rkVar, j4, rzVar);
            }
            if (i2 == -2) {
                qz.h(qzVar, rbVarA.f22867c, rbVarA.f22868d);
            } else {
                if (i2 != -1) {
                    g(rkVar, rbVarA.f22868d);
                    e();
                    return f(rkVar, rbVarA.f22868d, rzVar);
                }
                qz.g(qzVar, rbVarA.f22867c, rbVarA.f22868d);
            }
        }
    }

    public final sc b() {
        return this.f22869a;
    }

    public final void c(long j2) {
        qz qzVar = this.f22871c;
        if (qzVar == null || qzVar.f22845a != j2) {
            this.f22871c = new qz(j2, this.f22869a.f(j2), this.f22869a.f22841c, this.f22869a.f22842d, this.f22869a.f22843e, this.f22869a.f22844f);
        }
    }

    public final boolean d() {
        return this.f22871c != null;
    }

    public final void e() {
        this.f22871c = null;
        this.f22870b.b();
    }
}

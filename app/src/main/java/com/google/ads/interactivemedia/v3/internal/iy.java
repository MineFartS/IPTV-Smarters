package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class iy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ajm f22015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f22018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f22020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22022h;

    public iy() {
        ajm ajmVar = new ajm();
        i(2500, 0, "bufferForPlaybackMs", "0");
        i(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        i(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i(50000, 50000, "maxBufferMs", "minBufferMs");
        i(0, 0, "backBufferDurationMs", "0");
        this.f22015a = ajmVar;
        this.f22016b = iw.b(50000L);
        this.f22017c = iw.b(50000L);
        this.f22018d = iw.b(2500L);
        this.f22019e = iw.b(5000L);
        this.f22021g = 13107200;
        this.f22020f = iw.b(0L);
    }

    private static void i(int i2, int i3, String str, String str2) {
        boolean z = i2 >= i3;
        StringBuilder sb = new StringBuilder(str.length() + 21 + str2.length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        ajr.e(z, sb.toString());
    }

    private final void j(boolean z) {
        this.f22021g = 13107200;
        this.f22022h = false;
        if (z) {
            this.f22015a.e();
        }
    }

    public final long a() {
        return this.f22020f;
    }

    public final void b() {
        j(false);
    }

    public final void c() {
        j(true);
    }

    public final void d() {
        j(true);
    }

    public final boolean e(long j2, float f2, boolean z, long j3) {
        long jN = amn.n(j2, f2);
        long jMin = z ? this.f22019e : this.f22018d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(j3 / 2, jMin);
        }
        return jMin <= 0 || jN >= jMin || this.f22015a.a() >= this.f22021g;
    }

    public final ajm f() {
        return this.f22015a;
    }

    public final void g(lq[] lqVarArr, aii[] aiiVarArr) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = lqVarArr.length;
            if (i2 >= 2) {
                int iMax = Math.max(13107200, i3);
                this.f22021g = iMax;
                this.f22015a.f(iMax);
                return;
            } else {
                if (aiiVarArr[i2] != null) {
                    i3 += lqVarArr[i2].b() != 1 ? 131072000 : 13107200;
                }
                i2++;
            }
        }
    }

    public final boolean h(long j2, float f2) {
        int iA = this.f22015a.a();
        int i2 = this.f22021g;
        long jMin = this.f22016b;
        if (f2 > 1.0f) {
            jMin = Math.min(amn.l(jMin, f2), this.f22017c);
        }
        if (j2 < Math.max(jMin, 500000L)) {
            boolean z = iA < i2;
            this.f22022h = z;
            if (!z && j2 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f22017c || iA >= i2) {
            this.f22022h = false;
        }
        return this.f22022h;
    }
}

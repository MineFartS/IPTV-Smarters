package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class ane {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final amv f20221a = new amv();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WindowManager f20222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final and f20223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final anc f20224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Surface f20226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f20227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f20228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f20229i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f20230j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f20231k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f20232l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f20233m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f20234n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f20235o;
    private long p;
    private long q;

    public ane(Context context) {
        anc ancVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f20222b = (WindowManager) context.getSystemService("window");
        } else {
            this.f20222b = null;
        }
        if (this.f20222b != null) {
            if (amn.f20135a >= 17) {
                ajr.b(context);
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager != null) {
                    ancVar = new anc(this, displayManager);
                }
            }
            this.f20224d = ancVar;
            this.f20223c = and.a();
        } else {
            this.f20224d = null;
            this.f20223c = null;
        }
        this.f20231k = -9223372036854775807L;
        this.f20232l = -9223372036854775807L;
        this.f20227g = -1.0f;
        this.f20230j = 1.0f;
    }

    private final void l() {
        Surface surface;
        if (amn.f20135a < 30 || (surface = this.f20226f) == null || this.f20229i == 0.0f) {
            return;
        }
        this.f20229i = 0.0f;
        n(surface, 0.0f);
    }

    private final void m() {
        this.f20233m = 0L;
        this.p = -1L;
        this.f20234n = -1L;
    }

    private static void n(Surface surface, float f2) {
        try {
            surface.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e2) {
            alj.a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        long j2;
        WindowManager windowManager = this.f20222b;
        ajr.b(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j3 = (long) (1.0E9d / refreshRate);
            this.f20231k = j3;
            j2 = (j3 * 80) / 100;
        } else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j2 = -9223372036854775807L;
            this.f20231k = -9223372036854775807L;
        }
        this.f20232l = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p() {
        /*
            r9 = this;
            int r0 = com.google.ads.interactivemedia.v3.internal.amn.f20135a
            r1 = 30
            if (r0 < r1) goto L6f
            android.view.Surface r0 = r9.f20226f
            if (r0 != 0) goto Lb
            goto L6f
        Lb:
            com.google.ads.interactivemedia.v3.internal.amv r0 = r9.f20221a
            boolean r0 = r0.g()
            if (r0 == 0) goto L1a
            com.google.ads.interactivemedia.v3.internal.amv r0 = r9.f20221a
            float r0 = r0.a()
            goto L1c
        L1a:
            float r0 = r9.f20227g
        L1c:
            float r2 = r9.f20228h
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L23
            return
        L23:
            r3 = 1
            r4 = 0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 == 0) goto L58
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L58
            com.google.ads.interactivemedia.v3.internal.amv r1 = r9.f20221a
            boolean r1 = r1.g()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4b
            com.google.ads.interactivemedia.v3.internal.amv r1 = r9.f20221a
            long r5 = r1.d()
            r7 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L4b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4b:
            float r1 = r9.f20228h
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L65
            goto L66
        L58:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L6a
            com.google.ads.interactivemedia.v3.internal.amv r2 = r9.f20221a
            int r2 = r2.b()
            if (r2 < r1) goto L65
            goto L66
        L65:
            r3 = 0
        L66:
            if (r3 == 0) goto L69
            goto L6a
        L69:
            return
        L6a:
            r9.f20228h = r0
            r9.q(r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ane.p():void");
    }

    private final void q(boolean z) {
        Surface surface;
        if (amn.f20135a < 30 || (surface = this.f20226f) == null) {
            return;
        }
        float f2 = 0.0f;
        if (this.f20225e) {
            float f3 = this.f20228h;
            if (f3 != -1.0f) {
                f2 = this.f20230j * f3;
            }
        }
        if (z || this.f20229i != f2) {
            this.f20229i = f2;
            n(surface, f2);
        }
    }

    public final long a(long j2) {
        long j3;
        if (this.p != -1 && this.f20221a.g()) {
            long jC = this.q + ((long) ((this.f20221a.c() * (this.f20233m - this.p)) / this.f20230j));
            if (Math.abs(j2 - jC) <= 20000000) {
                j2 = jC;
            } else {
                m();
            }
        }
        this.f20234n = this.f20233m;
        this.f20235o = j2;
        and andVar = this.f20223c;
        if (andVar == null || this.f20231k == -9223372036854775807L) {
            return j2;
        }
        long j4 = andVar.f20216a;
        if (j4 == -9223372036854775807L) {
            return j2;
        }
        long j5 = this.f20231k;
        long j6 = j4 + (((j2 - j4) / j5) * j5);
        if (j2 <= j6) {
            j3 = j6 - j5;
        } else {
            j6 = j5 + j6;
            j3 = j6;
        }
        if (j6 - j2 >= j2 - j3) {
            j6 = j3;
        }
        return j6 - this.f20232l;
    }

    @TargetApi(17)
    public final void c() {
        if (this.f20222b != null) {
            anc ancVar = this.f20224d;
            if (ancVar != null) {
                ancVar.b();
            }
            and andVar = this.f20223c;
            ajr.b(andVar);
            andVar.c();
        }
    }

    @TargetApi(17)
    public final void d() {
        if (this.f20222b != null) {
            and andVar = this.f20223c;
            ajr.b(andVar);
            andVar.b();
            anc ancVar = this.f20224d;
            if (ancVar != null) {
                ancVar.a();
            }
            o();
        }
    }

    public final void e(float f2) {
        this.f20227g = f2;
        this.f20221a.f();
        p();
    }

    public final void f(long j2) {
        long j3 = this.f20234n;
        if (j3 != -1) {
            this.p = j3;
            this.q = this.f20235o;
        }
        this.f20233m++;
        this.f20221a.e(j2 * 1000);
        p();
    }

    public final void g(float f2) {
        this.f20230j = f2;
        m();
        q(false);
    }

    public final void h() {
        m();
    }

    public final void i() {
        this.f20225e = true;
        m();
        q(false);
    }

    public final void j() {
        this.f20225e = false;
        l();
    }

    public final void k(Surface surface) {
        if (true == (surface instanceof amt)) {
            surface = null;
        }
        if (this.f20226f == surface) {
            return;
        }
        l();
        this.f20226f = surface;
        q(true);
    }
}

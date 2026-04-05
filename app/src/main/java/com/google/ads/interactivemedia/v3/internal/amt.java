package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class amt extends Surface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f20166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f20167c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20168a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ams f20169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20170e;

    public /* synthetic */ amt(ams amsVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f20169d = amsVar;
        this.f20168a = z;
    }

    public static amt a(Context context, boolean z) {
        boolean z2 = true;
        if (z && !b(context)) {
            z2 = false;
        }
        ajr.f(z2);
        return new ams().a(z ? f20166b : 0);
    }

    public static synchronized boolean b(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        if (!f20167c) {
            int i2 = amn.f20135a;
            int i3 = 2;
            if (i2 < 24 || ((i2 < 26 && ("samsung".equals(amn.f20137c) || "XT1650".equals(amn.f20138d))) || ((i2 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !strEglQueryString.contains("EGL_EXT_protected_content")))) {
                i3 = 0;
            } else if (i2 >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                i3 = 1;
            }
            f20166b = i3;
            f20167c = true;
        }
        return f20166b != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f20169d) {
            if (!this.f20170e) {
                this.f20169d.b();
                this.f20170e = true;
            }
        }
    }
}

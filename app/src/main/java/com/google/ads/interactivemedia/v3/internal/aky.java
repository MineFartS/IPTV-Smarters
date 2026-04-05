package com.google.ads.interactivemedia.v3.internal;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class aky implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f20018a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f20019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f20020c = new int[1];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EGLDisplay f20021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EGLContext f20022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EGLSurface f20023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SurfaceTexture f20024g;

    public aky(Handler handler) {
        this.f20019b = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.f20024g;
        ajr.b(surfaceTexture);
        return surfaceTexture;
    }

    public final void b(int i2) {
        EGLConfig eGLConfig;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new akx("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            throw new akx("eglInitialize failed");
        }
        this.f20021d = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f20018a, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (!zEglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new akx(amn.B("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f20021d, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eGLContextEglCreateContext == null) {
            throw new akx("eglCreateContext failed");
        }
        this.f20022e = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = this.f20021d;
        if (i2 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new akx("eglCreatePbufferSurface failed");
            }
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
            throw new akx("eglMakeCurrent failed");
        }
        this.f20023f = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, this.f20020c, 0);
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f20020c[0]);
                this.f20024g = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                return;
            }
            String strValueOf = String.valueOf(GLU.gluErrorString(iGlGetError));
            Log.e("GlUtil", strValueOf.length() != 0 ? "glError ".concat(strValueOf) : new String("glError "));
        }
    }

    public final void c() {
        this.f20019b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f20024g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f20020c, 0);
            }
            EGLDisplay eGLDisplay = this.f20021d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f20021d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f20023f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f20021d, this.f20023f);
            }
            EGLContext eGLContext = this.f20022e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f20021d, eGLContext);
            }
            if (amn.f20135a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f20021d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f20021d);
            }
            this.f20021d = null;
            this.f20022e = null;
            this.f20023f = null;
            this.f20024g = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f20021d;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f20021d;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f20023f;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f20021d, this.f20023f);
            }
            EGLContext eGLContext2 = this.f20022e;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f20021d, eGLContext2);
            }
            if (amn.f20135a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay6 = this.f20021d;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f20021d);
            }
            this.f20021d = null;
            this.f20022e = null;
            this.f20023f = null;
            this.f20024g = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f20019b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f20024g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}

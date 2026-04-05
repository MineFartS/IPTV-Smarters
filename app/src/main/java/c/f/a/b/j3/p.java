package c.f.a.b.j3;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f9248b = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f9249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f9250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f9251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EGLDisplay f9252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EGLContext f9253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EGLSurface f9254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SurfaceTexture f9255i;

    public static final class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    public interface c {
        void a();
    }

    public p(Handler handler) {
        this(handler, null);
    }

    public p(Handler handler, c cVar) {
        this.f9249c = handler;
        this.f9251e = cVar;
        this.f9250d = new int[1];
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f9248b, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!zEglChooseConfig || iArr[0] <= 0 || eGLConfigArr[0] == null) {
            throw new b(x0.D("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfigArr[0];
    }

    public static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i2) {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new b("eglCreateContext failed");
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i2) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i2 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new b("eglMakeCurrent failed");
    }

    public static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        u.b();
    }

    public static EGLDisplay f() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new b("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new b("eglInitialize failed");
    }

    public final void d() {
        c cVar = this.f9251e;
        if (cVar != null) {
            cVar.a();
        }
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) g.e(this.f9255i);
    }

    public void h(int i2) {
        EGLDisplay eGLDisplayF = f();
        this.f9252f = eGLDisplayF;
        EGLConfig eGLConfigA = a(eGLDisplayF);
        EGLContext eGLContextB = b(this.f9252f, eGLConfigA, i2);
        this.f9253g = eGLContextB;
        this.f9254h = c(this.f9252f, eGLConfigA, eGLContextB, i2);
        e(this.f9250d);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f9250d[0]);
        this.f9255i = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.f9249c.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f9255i;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f9250d, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f9252f;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f9252f;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f9254h;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f9252f, this.f9254h);
            }
            EGLContext eGLContext = this.f9253g;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f9252f, eGLContext);
            }
            if (x0.f9296a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f9252f;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f9252f);
            }
            this.f9252f = null;
            this.f9253g = null;
            this.f9254h = null;
            this.f9255i = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f9249c.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f9255i;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}

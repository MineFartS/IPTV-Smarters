package c.f.a.b.k3.f0;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import c.f.a.b.j3.x0;
import c.f.a.b.k3.f0.g;
import c.f.a.b.k3.f0.m;
import c.f.a.b.k3.y;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends GLSurfaceView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f9436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SensorManager f9437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Sensor f9438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f9439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f9440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f9441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f9442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SurfaceTexture f9443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Surface f9444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9447m;

    public final class a implements GLSurfaceView.Renderer, m.a, g.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f9448b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float[] f9451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float[] f9452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float[] f9453g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f9454h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f9455i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f9449c = new float[16];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f9450d = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float[] f9456j = new float[16];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final float[] f9457k = new float[16];

        public a(k kVar) {
            float[] fArr = new float[16];
            this.f9451e = fArr;
            float[] fArr2 = new float[16];
            this.f9452f = fArr2;
            float[] fArr3 = new float[16];
            this.f9453g = fArr3;
            this.f9448b = kVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f9455i = 3.1415927f;
        }

        @Override // c.f.a.b.k3.f0.g.a
        public synchronized void a(float[] fArr, float f2) {
            float[] fArr2 = this.f9451e;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f9455i = -f2;
            d();
        }

        @Override // c.f.a.b.k3.f0.m.a
        public synchronized void b(PointF pointF) {
            this.f9454h = pointF.y;
            d();
            Matrix.setRotateM(this.f9453g, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        public final float c(float f2) {
            if (!(f2 > 1.0f)) {
                return 90.0f;
            }
            double dTan = Math.tan(Math.toRadians(45.0d));
            double d2 = f2;
            Double.isNaN(d2);
            return (float) (Math.toDegrees(Math.atan(dTan / d2)) * 2.0d);
        }

        public final void d() {
            Matrix.setRotateM(this.f9452f, 0, -this.f9454h, (float) Math.cos(this.f9455i), (float) Math.sin(this.f9455i), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f9457k, 0, this.f9451e, 0, this.f9453g, 0);
                Matrix.multiplyMM(this.f9456j, 0, this.f9452f, 0, this.f9457k, 0);
            }
            Matrix.multiplyMM(this.f9450d, 0, this.f9449c, 0, this.f9456j, 0);
            this.f9448b.b(this.f9450d, false);
        }

        @Override // c.f.a.b.k3.f0.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
            float f2 = i2 / i3;
            Matrix.perspectiveM(this.f9449c, 0, c(f2), f2, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.g(this.f9448b.e());
        }
    }

    public interface b {
        void G(Surface surface);

        void y(Surface surface);
    }

    public l(Context context) {
        this(context, null);
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9436b = new CopyOnWriteArrayList<>();
        this.f9440f = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) c.f.a.b.j3.g.e(context.getSystemService("sensor"));
        this.f9437c = sensorManager;
        Sensor defaultSensor = x0.f9296a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f9438d = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        k kVar = new k();
        this.f9442h = kVar;
        a aVar = new a(kVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f9441g = mVar;
        this.f9439e = new g(((WindowManager) c.f.a.b.j3.g.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f9445k = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void d() {
        Surface surface = this.f9444j;
        if (surface != null) {
            Iterator<b> it = this.f9436b.iterator();
            while (it.hasNext()) {
                it.next().y(surface);
            }
        }
        h(this.f9443i, surface);
        this.f9443i = null;
        this.f9444j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f9443i;
        Surface surface = this.f9444j;
        Surface surface2 = new Surface(surfaceTexture);
        this.f9443i = surfaceTexture;
        this.f9444j = surface2;
        Iterator<b> it = this.f9436b.iterator();
        while (it.hasNext()) {
            it.next().G(surface2);
        }
        h(surfaceTexture2, surface);
    }

    public static void h(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    public void b(b bVar) {
        this.f9436b.add(bVar);
    }

    public final void g(final SurfaceTexture surfaceTexture) {
        this.f9440f.post(new Runnable() { // from class: c.f.a.b.k3.f0.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f9379b.f(surfaceTexture);
            }
        });
    }

    public d getCameraMotionListener() {
        return this.f9442h;
    }

    public y getVideoFrameMetadataListener() {
        return this.f9442h;
    }

    public Surface getVideoSurface() {
        return this.f9444j;
    }

    public void i(b bVar) {
        this.f9436b.remove(bVar);
    }

    public final void j() {
        boolean z = this.f9445k && this.f9446l;
        Sensor sensor = this.f9438d;
        if (sensor == null || z == this.f9447m) {
            return;
        }
        if (z) {
            this.f9437c.registerListener(this.f9439e, sensor, 0);
        } else {
            this.f9437c.unregisterListener(this.f9439e);
        }
        this.f9447m = z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9440f.post(new Runnable() { // from class: c.f.a.b.k3.f0.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f9381b.d();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f9446l = false;
        j();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f9446l = true;
        j();
    }

    public void setDefaultStereoMode(int i2) {
        this.f9442h.h(i2);
    }

    public void setUseSensorRotation(boolean z) {
        this.f9445k = z;
        j();
    }
}

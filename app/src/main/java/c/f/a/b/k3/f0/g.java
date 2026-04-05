package c.f.a.b.k3.f0;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f9388a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f9389b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f9390c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f9391d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Display f9392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a[] f9393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9394g;

    public interface a {
        void a(float[] fArr, float f2);
    }

    public g(Display display, a... aVarArr) {
        this.f9392e = display;
        this.f9393f = aVarArr;
    }

    public static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public final float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f9389b);
        SensorManager.getOrientation(this.f9389b, this.f9391d);
        return this.f9391d[2];
    }

    public final void b(float[] fArr, float f2) {
        for (a aVar : this.f9393f) {
            aVar.a(fArr, f2);
        }
    }

    public final void c(float[] fArr) {
        if (!this.f9394g) {
            f.a(this.f9390c, fArr);
            this.f9394g = true;
        }
        float[] fArr2 = this.f9389b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f9389b, 0, this.f9390c, 0);
    }

    public final void d(float[] fArr, int i2) {
        if (i2 != 0) {
            int i3 = 130;
            int i4 = 129;
            if (i2 == 1) {
                i3 = 2;
            } else if (i2 == 2) {
                i3 = 129;
                i4 = 130;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException();
                }
                i4 = 1;
            }
            float[] fArr2 = this.f9389b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f9389b, i3, i4, fArr);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f9388a, sensorEvent.values);
        d(this.f9388a, this.f9392e.getRotation());
        float fA = a(this.f9388a);
        e(this.f9388a);
        c(this.f9388a);
        b(this.f9388a, fA);
    }
}

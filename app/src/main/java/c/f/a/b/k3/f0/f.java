package c.f.a.b.k3.f0;

import android.opengl.Matrix;
import c.f.a.b.j3.t0;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f9384a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f9385b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0<float[]> f9386c = new t0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9387d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float fSqrt = (float) Math.sqrt((fArr2[10] * fArr2[10]) + (fArr2[8] * fArr2[8]));
        fArr[0] = fArr2[10] / fSqrt;
        fArr[2] = fArr2[8] / fSqrt;
        fArr[8] = (-fArr2[8]) / fSqrt;
        fArr[10] = fArr2[10] / fSqrt;
    }

    public static void b(float[] fArr, float[] fArr2) {
        float f2 = fArr2[0];
        float f3 = -fArr2[1];
        float f4 = -fArr2[2];
        float length = Matrix.length(f2, f3, f4);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f2 / length, f3 / length, f4 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    public boolean c(float[] fArr, long j2) {
        float[] fArrJ = this.f9386c.j(j2);
        if (fArrJ == null) {
            return false;
        }
        b(this.f9385b, fArrJ);
        if (!this.f9387d) {
            a(this.f9384a, this.f9385b);
            this.f9387d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f9384a, 0, this.f9385b, 0);
        return true;
    }

    public void d() {
        this.f9386c.c();
        this.f9387d = false;
    }

    public void e(long j2, float[] fArr) {
        this.f9386c.a(j2, fArr);
    }
}

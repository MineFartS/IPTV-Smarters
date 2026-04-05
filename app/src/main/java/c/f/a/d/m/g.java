package c.f.a.d.m;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public class g implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f15052a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f15053b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f15054c = new Matrix();

    public Matrix a(float f2, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f15052a);
        matrix2.getValues(this.f15053b);
        for (int i2 = 0; i2 < 9; i2++) {
            float[] fArr = this.f15053b;
            float f3 = fArr[i2];
            float[] fArr2 = this.f15052a;
            fArr[i2] = fArr2[i2] + ((f3 - fArr2[i2]) * f2);
        }
        this.f15054c.setValues(this.f15053b);
        return this.f15054c;
    }
}

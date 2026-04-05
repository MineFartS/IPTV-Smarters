package a.i.r.h0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class a implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f2074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f2075b;

    public a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i2 = ((int) (length / 0.002f)) + 1;
        this.f2074a = new float[i2];
        this.f2075b = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((i3 * length) / (i2 - 1), fArr, null);
            this.f2074a[i3] = fArr[0];
            this.f2075b[i3] = fArr[1];
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.f2074a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.f2074a[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.f2074a;
        float f3 = fArr[length] - fArr[i2];
        if (f3 == 0.0f) {
            return this.f2075b[i2];
        }
        float f4 = (f2 - fArr[i2]) / f3;
        float[] fArr2 = this.f2075b;
        float f5 = fArr2[i2];
        return f5 + (f4 * (fArr2[length] - f5));
    }
}

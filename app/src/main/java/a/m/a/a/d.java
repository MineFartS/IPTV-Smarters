package a.m.a.a;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f2561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2562b;

    public d(float[] fArr) {
        this.f2561a = fArr;
        this.f2562b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2561a;
        int iMin = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f2562b;
        float f4 = (f2 - (iMin * f3)) / f3;
        float[] fArr2 = this.f2561a;
        return fArr2[iMin] + (f4 * (fArr2[iMin + 1] - fArr2[iMin]));
    }
}

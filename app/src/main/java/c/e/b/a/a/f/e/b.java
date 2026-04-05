package c.e.b.a.a.f.e;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class b implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TimeInterpolator f5990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f5991b;

    public b(TimeInterpolator timeInterpolator, float... fArr) {
        this.f5990a = timeInterpolator;
        this.f5991b = fArr;
    }

    public static b a(float... fArr) {
        b bVar = new b(a.a(), new float[0]);
        bVar.c(fArr);
        return bVar;
    }

    public static b b(float f2, float f3, float f4, float f5, float... fArr) {
        b bVar = new b(c.a(f2, f3, f4, f5), new float[0]);
        bVar.c(fArr);
        return bVar;
    }

    public void c(float... fArr) {
        this.f5991b = fArr;
    }

    @Override // android.animation.TimeInterpolator
    public synchronized float getInterpolation(float f2) {
        if (this.f5991b.length > 1) {
            int i2 = 0;
            while (true) {
                float[] fArr = this.f5991b;
                if (i2 >= fArr.length - 1) {
                    break;
                }
                float f3 = fArr[i2];
                i2++;
                float f4 = fArr[i2];
                float f5 = f4 - f3;
                if (f2 >= f3 && f2 <= f4) {
                    return f3 + (this.f5990a.getInterpolation((f2 - f3) / f5) * f5);
                }
            }
        }
        return this.f5990a.getInterpolation(f2);
    }
}

package c.e.b.a.a.h;

import android.animation.ValueAnimator;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class b extends c.e.b.a.a.g.a {

    public class a extends c.e.b.a.a.g.b {
        public a() {
            C(0.0f);
        }

        @Override // c.e.b.a.a.g.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            c.e.b.a.a.f.d dVar = new c.e.b.a.a.f.d(this);
            Float fValueOf = Float.valueOf(0.0f);
            return dVar.l(fArr, fValueOf, Float.valueOf(1.0f), fValueOf).c(1200L).d(fArr).b();
        }
    }

    @Override // c.e.b.a.a.g.g
    public c.e.b.a.a.g.f[] O() {
        a aVar;
        int i2;
        a[] aVarArr = new a[12];
        for (int i3 = 0; i3 < 12; i3++) {
            aVarArr[i3] = new a();
            if (Build.VERSION.SDK_INT >= 24) {
                aVar = aVarArr[i3];
                i2 = i3 * 100;
            } else {
                aVar = aVarArr[i3];
                i2 = (i3 * 100) - 1200;
            }
            aVar.t(i2);
        }
        return aVarArr;
    }
}

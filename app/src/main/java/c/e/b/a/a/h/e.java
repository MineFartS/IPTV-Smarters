package c.e.b.a.a.h;

import android.animation.ValueAnimator;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class e extends c.e.b.a.a.g.a {

    public class a extends c.e.b.a.a.g.b {
        public a() {
            setAlpha(0);
        }

        @Override // c.e.b.a.a.g.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.39f, 0.4f, 1.0f};
            return new c.e.b.a.a.f.d(this).a(fArr, 0, 0, 255, 0).c(1200L).d(fArr).b();
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

package c.e.b.a.a.h;

import android.animation.ValueAnimator;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class d extends c.e.b.a.a.g.g {

    public class a extends c.e.b.a.a.g.b {
        public a() {
            setAlpha(153);
            C(0.0f);
        }

        @Override // c.e.b.a.a.g.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            c.e.b.a.a.f.d dVar = new c.e.b.a.a.f.d(this);
            Float fValueOf = Float.valueOf(0.0f);
            return dVar.l(fArr, fValueOf, Float.valueOf(1.0f), fValueOf).c(2000L).d(fArr).b();
        }
    }

    @Override // c.e.b.a.a.g.g
    public void N(c.e.b.a.a.g.f... fVarArr) {
        c.e.b.a.a.g.f fVar;
        int i2;
        super.N(fVarArr);
        if (Build.VERSION.SDK_INT >= 24) {
            fVar = fVarArr[1];
            i2 = 1000;
        } else {
            fVar = fVarArr[1];
            i2 = -1000;
        }
        fVar.t(i2);
    }

    @Override // c.e.b.a.a.g.g
    public c.e.b.a.a.g.f[] O() {
        return new c.e.b.a.a.g.f[]{new a(), new a()};
    }
}

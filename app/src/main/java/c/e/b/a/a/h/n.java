package c.e.b.a.a.h;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class n extends c.e.b.a.a.g.g {

    public class a extends c.e.b.a.a.g.c {
        public int I;

        public a(int i2) {
            this.I = i2;
        }

        @Override // c.e.b.a.a.g.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
            c.e.b.a.a.f.d dVarI = new c.e.b.a.a.f.d(this).i(fArr, 0, -90, -179, -180, -270, -360);
            Float fValueOf = Float.valueOf(0.0f);
            Float fValueOf2 = Float.valueOf(0.75f);
            c.e.b.a.a.f.d dVarP = dVarI.o(fArr, fValueOf, fValueOf2, fValueOf2, fValueOf2, fValueOf, fValueOf).p(fArr, fValueOf, fValueOf, fValueOf2, fValueOf2, fValueOf2, fValueOf);
            Float fValueOf3 = Float.valueOf(1.0f);
            Float fValueOf4 = Float.valueOf(0.5f);
            c.e.b.a.a.f.d dVarD = dVarP.l(fArr, fValueOf3, fValueOf4, fValueOf3, fValueOf3, fValueOf4, fValueOf3).c(1800L).d(fArr);
            if (Build.VERSION.SDK_INT >= 24) {
                dVarD.n(this.I);
            }
            return dVarD.b();
        }
    }

    @Override // c.e.b.a.a.g.g
    public void N(c.e.b.a.a.g.f... fVarArr) {
        super.N(fVarArr);
        if (Build.VERSION.SDK_INT < 24) {
            fVarArr[1].t(-900);
        }
    }

    @Override // c.e.b.a.a.g.g
    public c.e.b.a.a.g.f[] O() {
        return new c.e.b.a.a.g.f[]{new a(0), new a(3)};
    }

    @Override // c.e.b.a.a.g.g, c.e.b.a.a.g.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Rect rectA = a(rect);
        super.onBoundsChange(rectA);
        for (int i2 = 0; i2 < L(); i2++) {
            c.e.b.a.a.g.f fVarK = K(i2);
            int i3 = rectA.left;
            fVarK.v(i3, rectA.top, (rectA.width() / 4) + i3, rectA.top + (rectA.height() / 4));
        }
    }
}

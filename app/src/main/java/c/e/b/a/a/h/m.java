package c.e.b.a.a.h;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public class m extends c.e.b.a.a.g.g {

    public class a extends c.e.b.a.a.g.b {
        public a() {
            C(0.0f);
        }

        @Override // c.e.b.a.a.g.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.4f, 0.8f, 1.0f};
            c.e.b.a.a.f.d dVar = new c.e.b.a.a.f.d(this);
            Float fValueOf = Float.valueOf(0.0f);
            return dVar.l(fArr, fValueOf, Float.valueOf(1.0f), fValueOf, fValueOf).c(1400L).d(fArr).b();
        }
    }

    @Override // c.e.b.a.a.g.g
    public void N(c.e.b.a.a.g.f... fVarArr) {
        super.N(fVarArr);
        fVarArr[1].t(160);
        fVarArr[2].t(320);
    }

    @Override // c.e.b.a.a.g.g
    public c.e.b.a.a.g.f[] O() {
        return new c.e.b.a.a.g.f[]{new a(), new a(), new a()};
    }

    @Override // c.e.b.a.a.g.g, c.e.b.a.a.g.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = a(rect);
        int iWidth = rectA.width() / 8;
        int iCenterY = rectA.centerY() - iWidth;
        int iCenterY2 = rectA.centerY() + iWidth;
        for (int i2 = 0; i2 < L(); i2++) {
            int iWidth2 = ((rectA.width() * i2) / 3) + rectA.left;
            K(i2).v(iWidth2, iCenterY, (iWidth * 2) + iWidth2, iCenterY2);
        }
    }
}

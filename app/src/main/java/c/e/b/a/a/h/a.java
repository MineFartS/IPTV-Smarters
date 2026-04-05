package c.e.b.a.a.h;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class a extends c.e.b.a.a.g.g {

    /* JADX INFO: renamed from: c.e.b.a.a.h.a$a, reason: collision with other inner class name */
    public class C0115a extends c.e.b.a.a.g.b {
        public C0115a() {
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
        return new c.e.b.a.a.g.f[]{new C0115a(), new C0115a()};
    }

    @Override // c.e.b.a.a.g.g, c.e.b.a.a.g.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = a(rect);
        int iWidth = (int) (rectA.width() * 0.6f);
        c.e.b.a.a.g.f fVarK = K(0);
        int i2 = rectA.right;
        int i3 = rectA.top;
        fVarK.v(i2 - iWidth, i3, i2, i3 + iWidth);
        c.e.b.a.a.g.f fVarK2 = K(1);
        int i4 = rectA.right;
        int i5 = rectA.bottom;
        fVarK2.v(i4 - iWidth, i5 - iWidth, i4, i5);
    }

    @Override // c.e.b.a.a.g.g, c.e.b.a.a.g.f
    public ValueAnimator r() {
        return new c.e.b.a.a.f.d(this).i(new float[]{0.0f, 1.0f}, 0, 360).c(2000L).h(new LinearInterpolator()).b();
    }
}

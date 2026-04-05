package c.e.b.a.a.h;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public class l extends c.e.b.a.a.g.c {
    @Override // c.e.b.a.a.g.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        w(a(rect));
    }

    @Override // c.e.b.a.a.g.f
    public ValueAnimator r() {
        float[] fArr = {0.0f, 0.5f, 1.0f};
        return new c.e.b.a.a.f.d(this).j(fArr, 0, -180, -180).k(fArr, 0, 0, -180).c(1200L).d(fArr).b();
    }
}

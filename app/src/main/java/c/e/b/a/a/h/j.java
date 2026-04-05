package c.e.b.a.a.h;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public class j extends c.e.b.a.a.g.d {
    public j() {
        C(0.0f);
    }

    @Override // c.e.b.a.a.g.f
    public ValueAnimator r() {
        float[] fArr = {0.0f, 0.7f, 1.0f};
        c.e.b.a.a.f.d dVar = new c.e.b.a.a.f.d(this);
        Float fValueOf = Float.valueOf(1.0f);
        return dVar.l(fArr, Float.valueOf(0.0f), fValueOf, fValueOf).a(fArr, 255, 178, 0).c(1000L).h(c.e.b.a.a.f.e.b.b(0.21f, 0.53f, 0.56f, 0.8f, fArr)).b();
    }
}

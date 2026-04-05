package c.e.b.a.a.h;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public class i extends c.e.b.a.a.g.b {
    public i() {
        C(0.0f);
    }

    @Override // c.e.b.a.a.g.f
    public ValueAnimator r() {
        float[] fArr = {0.0f, 1.0f};
        return new c.e.b.a.a.f.d(this).l(fArr, Float.valueOf(0.0f), Float.valueOf(1.0f)).a(fArr, 255, 0).c(1000L).d(fArr).b();
    }
}

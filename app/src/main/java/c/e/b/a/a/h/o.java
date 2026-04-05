package c.e.b.a.a.h;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* JADX INFO: loaded from: classes.dex */
public class o extends c.e.b.a.a.g.g {

    public class a extends c.e.b.a.a.g.c {
        public a() {
            E(0.4f);
        }

        @Override // c.e.b.a.a.g.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.2f, 0.4f, 1.0f};
            c.e.b.a.a.f.d dVar = new c.e.b.a.a.f.d(this);
            Float fValueOf = Float.valueOf(0.4f);
            return dVar.m(fArr, fValueOf, Float.valueOf(1.0f), fValueOf, fValueOf).c(1200L).d(fArr).b();
        }
    }

    @Override // c.e.b.a.a.g.g
    public c.e.b.a.a.g.f[] O() {
        a aVar;
        int i2;
        a[] aVarArr = new a[5];
        for (int i3 = 0; i3 < 5; i3++) {
            aVarArr[i3] = new a();
            if (Build.VERSION.SDK_INT >= 24) {
                aVar = aVarArr[i3];
                i2 = (i3 * 100) + IjkMediaCodecInfo.RANK_LAST_CHANCE;
            } else {
                aVar = aVarArr[i3];
                i2 = (i3 * 100) - 1200;
            }
            aVar.t(i2);
        }
        return aVarArr;
    }

    @Override // c.e.b.a.a.g.g, c.e.b.a.a.g.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = a(rect);
        int iWidth = rectA.width() / L();
        int iWidth2 = ((rectA.width() / 5) * 3) / 5;
        for (int i2 = 0; i2 < L(); i2++) {
            c.e.b.a.a.g.f fVarK = K(i2);
            int i3 = rectA.left + (i2 * iWidth) + (iWidth / 5);
            fVarK.v(i3, rectA.top, i3 + iWidth2, rectA.bottom);
        }
    }
}

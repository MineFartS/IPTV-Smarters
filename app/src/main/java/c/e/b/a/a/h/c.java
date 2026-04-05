package c.e.b.a.a.h;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* JADX INFO: loaded from: classes.dex */
public class c extends c.e.b.a.a.g.g {

    public class b extends c.e.b.a.a.g.c {
        public b() {
        }

        @Override // c.e.b.a.a.g.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.35f, 0.7f, 1.0f};
            c.e.b.a.a.f.d dVar = new c.e.b.a.a.f.d(this);
            Float fValueOf = Float.valueOf(1.0f);
            return dVar.l(fArr, fValueOf, Float.valueOf(0.0f), fValueOf, fValueOf).c(1300L).d(fArr).b();
        }
    }

    @Override // c.e.b.a.a.g.g
    public c.e.b.a.a.g.f[] O() {
        int[] iArr = {200, IjkMediaCodecInfo.RANK_SECURE, 400, 100, 200, IjkMediaCodecInfo.RANK_SECURE, 0, 100, 200};
        b[] bVarArr = new b[9];
        for (int i2 = 0; i2 < 9; i2++) {
            bVarArr[i2] = new b();
            bVarArr[i2].t(iArr[i2]);
        }
        return bVarArr;
    }

    @Override // c.e.b.a.a.g.g, c.e.b.a.a.g.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = a(rect);
        int iWidth = (int) (rectA.width() * 0.33f);
        int iHeight = (int) (rectA.height() * 0.33f);
        for (int i2 = 0; i2 < L(); i2++) {
            int i3 = rectA.left + ((i2 % 3) * iWidth);
            int i4 = rectA.top + ((i2 / 3) * iHeight);
            K(i2).v(i3, i4, i3 + iWidth, i4 + iHeight);
        }
    }
}

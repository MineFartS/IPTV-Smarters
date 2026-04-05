package c.e.b.a.a.h;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* JADX INFO: loaded from: classes.dex */
public class f extends c.e.b.a.a.g.g {
    public boolean H = false;

    public class a extends c.e.b.a.a.g.c {
        public a() {
            setAlpha(0);
            A(-180);
        }

        @Override // c.e.b.a.a.g.f
        public ValueAnimator r() {
            float[] fArr = {0.0f, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
            return new c.e.b.a.a.f.d(this).a(fArr, 0, 0, 255, 255, 0, 0).j(fArr, -180, -180, 0, 0, 0, 0).k(fArr, 0, 0, 0, 0, 180, 180).c(2400L).h(new LinearInterpolator()).b();
        }
    }

    @Override // c.e.b.a.a.g.g
    public void J(Canvas canvas) {
        Rect rectA = a(getBounds());
        for (int i2 = 0; i2 < L(); i2++) {
            int iSave = canvas.save();
            canvas.rotate((i2 * 90) + 45, rectA.centerX(), rectA.centerY());
            K(i2).draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // c.e.b.a.a.g.g
    public c.e.b.a.a.g.f[] O() {
        a aVar;
        int i2;
        a[] aVarArr = new a[4];
        for (int i3 = 0; i3 < 4; i3++) {
            aVarArr[i3] = new a();
            if (Build.VERSION.SDK_INT >= 24) {
                aVar = aVarArr[i3];
                i2 = i3 * IjkMediaCodecInfo.RANK_SECURE;
            } else {
                aVar = aVarArr[i3];
                i2 = (i3 * IjkMediaCodecInfo.RANK_SECURE) - 1200;
            }
            aVar.t(i2);
        }
        return aVarArr;
    }

    @Override // c.e.b.a.a.g.g, c.e.b.a.a.g.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = a(rect);
        int iMin = Math.min(rectA.width(), rectA.height());
        if (this.H) {
            iMin = (int) Math.sqrt((iMin * iMin) / 2);
            int iWidth = (rectA.width() - iMin) / 2;
            int iHeight = (rectA.height() - iMin) / 2;
            rectA = new Rect(rectA.left + iWidth, rectA.top + iHeight, rectA.right - iWidth, rectA.bottom - iHeight);
        }
        int i2 = iMin / 2;
        int i3 = rectA.left + i2 + 1;
        int i4 = rectA.top + i2 + 1;
        for (int i5 = 0; i5 < L(); i5++) {
            c.e.b.a.a.g.f fVarK = K(i5);
            fVarK.v(rectA.left, rectA.top, i3, i4);
            fVarK.x(fVarK.d().right);
            fVarK.y(fVarK.d().bottom);
        }
    }
}

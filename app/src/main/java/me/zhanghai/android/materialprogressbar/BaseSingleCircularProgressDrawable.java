package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseSingleCircularProgressDrawable extends BaseProgressDrawable {
    private static final RectF RECT_BOUND = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);
    private static final RectF RECT_PROGRESS = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    public void drawRing(Canvas canvas, Paint paint, float f2, float f3) {
        canvas.drawArc(RECT_PROGRESS, f2 - 90.0f, f3, false, paint);
    }

    @Override // me.zhanghai.android.materialprogressbar.BasePaintDrawable
    public void onDraw(Canvas canvas, int i2, int i3, Paint paint) {
        float f2 = i2;
        RectF rectF = this.mUseIntrinsicPadding ? RECT_PADDED_BOUND : RECT_BOUND;
        canvas.scale(f2 / rectF.width(), i3 / rectF.height());
        canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        onDrawRing(canvas, paint);
    }

    public abstract void onDrawRing(Canvas canvas, Paint paint);

    @Override // me.zhanghai.android.materialprogressbar.BasePaintDrawable
    public void onPreparePaint(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
    }
}

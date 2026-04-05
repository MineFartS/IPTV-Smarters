package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasePaintDrawable extends BaseDrawable {
    private Paint mPaint;

    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable
    public final void onDraw(Canvas canvas, int i2, int i3) {
        if (this.mPaint == null) {
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(DefaultRenderer.BACKGROUND_COLOR);
            onPreparePaint(this.mPaint);
        }
        this.mPaint.setAlpha(this.mAlpha);
        this.mPaint.setColorFilter(getColorFilterForDrawing());
        onDraw(canvas, i2, i3, this.mPaint);
    }

    public abstract void onDraw(Canvas canvas, int i2, int i3, Paint paint);

    public abstract void onPreparePaint(Paint paint);
}

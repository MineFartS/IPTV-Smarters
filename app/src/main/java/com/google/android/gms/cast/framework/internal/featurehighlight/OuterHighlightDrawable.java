package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
public class OuterHighlightDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f24159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f24160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f24161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f24162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f24164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f24165g;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawCircle(this.f24162d + this.f24164f, this.f24163e + this.f24165g, this.f24160b * this.f24161c, this.f24159a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24159a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f24159a.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24159a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setScale(float f2) {
        this.f24161c = f2;
        invalidateSelf();
    }

    @Keep
    public void setTranslationX(float f2) {
        this.f24164f = f2;
        invalidateSelf();
    }

    @Keep
    public void setTranslationY(float f2) {
        this.f24165g = f2;
        invalidateSelf();
    }
}

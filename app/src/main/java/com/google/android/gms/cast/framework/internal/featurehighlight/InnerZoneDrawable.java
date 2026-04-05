package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
public class InnerZoneDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f24150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f24151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f24153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f24155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f24156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f24157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f24158i;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f2 = this.f24158i;
        if (f2 > 0.0f) {
            float f3 = this.f24153d * this.f24157h;
            this.f24151b.setAlpha((int) (this.f24152c * f2));
            canvas.drawCircle(this.f24155f, this.f24156g, f3, this.f24151b);
        }
        canvas.drawCircle(this.f24155f, this.f24156g, this.f24153d * this.f24154e, this.f24150a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f24150a.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24150a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setPulseAlpha(float f2) {
        this.f24158i = f2;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f2) {
        this.f24157h = f2;
        invalidateSelf();
    }

    @Keep
    public void setScale(float f2) {
        this.f24154e = f2;
        invalidateSelf();
    }
}

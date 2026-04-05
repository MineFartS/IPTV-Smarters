package a.e.f;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class f extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f1217a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f1219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f1220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1221e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f1224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f1225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f1226j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1222f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1223g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f1227k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f1218b = new Paint(5);

    public f(ColorStateList colorStateList, float f2) {
        this.f1217a = f2;
        e(colorStateList);
        this.f1219c = new RectF();
        this.f1220d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList b() {
        return this.f1224h;
    }

    public float c() {
        return this.f1221e;
    }

    public float d() {
        return this.f1217a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1218b;
        if (this.f1225i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1225i);
            z = true;
        }
        RectF rectF = this.f1219c;
        float f2 = this.f1217a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1224h = colorStateList;
        this.f1218b.setColor(colorStateList.getColorForState(getState(), this.f1224h.getDefaultColor()));
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f2, boolean z, boolean z2) {
        if (f2 == this.f1221e && this.f1222f == z && this.f1223g == z2) {
            return;
        }
        this.f1221e = f2;
        this.f1222f = z;
        this.f1223g = z2;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1220d, this.f1217a);
    }

    public void h(float f2) {
        if (f2 == this.f1217a) {
            return;
        }
        this.f1217a = f2;
        i(null);
        invalidateSelf();
    }

    public final void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1219c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1220d.set(rect);
        if (this.f1222f) {
            this.f1220d.inset((int) Math.ceil(g.c(this.f1221e, this.f1217a, this.f1223g)), (int) Math.ceil(g.d(this.f1221e, this.f1217a, this.f1223g)));
            this.f1219c.set(this.f1220d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1226j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1224h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1224h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1218b.getColor();
        if (z) {
            this.f1218b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1226j;
        if (colorStateList2 == null || (mode = this.f1227k) == null) {
            return z;
        }
        this.f1225i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f1218b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1218b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1226j = colorStateList;
        this.f1225i = a(colorStateList, this.f1227k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1227k = mode;
        this.f1225i = a(this.f1226j, mode);
        invalidateSelf();
    }
}

package c.f.a.d.c0;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import c.f.a.d.j0.k;
import c.f.a.d.j0.l;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f14653b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14660i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14662k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14663l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14664m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f14666o;
    public ColorStateList p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f14652a = l.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f14654c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f14655d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f14656e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f14657f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f14658g = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14665n = true;

    public class b extends Drawable.ConstantState {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return a.this;
        }
    }

    public a(k kVar) {
        this.f14666o = kVar;
        Paint paint = new Paint(1);
        this.f14653b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public final Shader a() {
        copyBounds(this.f14655d);
        float fHeight = this.f14659h / r0.height();
        return new LinearGradient(0.0f, r0.top, 0.0f, r0.bottom, new int[]{a.i.j.a.i(this.f14660i, this.f14664m), a.i.j.a.i(this.f14661j, this.f14664m), a.i.j.a.i(a.i.j.a.m(this.f14661j, 0), this.f14664m), a.i.j.a.i(a.i.j.a.m(this.f14663l, 0), this.f14664m), a.i.j.a.i(this.f14663l, this.f14664m), a.i.j.a.i(this.f14662k, this.f14664m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    public RectF b() {
        this.f14657f.set(getBounds());
        return this.f14657f;
    }

    public void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f14664m = colorStateList.getColorForState(getState(), this.f14664m);
        }
        this.p = colorStateList;
        this.f14665n = true;
        invalidateSelf();
    }

    public void d(float f2) {
        if (this.f14659h != f2) {
            this.f14659h = f2;
            this.f14653b.setStrokeWidth(f2 * 1.3333f);
            this.f14665n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f14665n) {
            this.f14653b.setShader(a());
            this.f14665n = false;
        }
        float strokeWidth = this.f14653b.getStrokeWidth() / 2.0f;
        copyBounds(this.f14655d);
        this.f14656e.set(this.f14655d);
        float fMin = Math.min(this.f14666o.r().a(b()), this.f14656e.width() / 2.0f);
        if (this.f14666o.u(b())) {
            this.f14656e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f14656e, fMin, fMin, this.f14653b);
        }
    }

    public void e(int i2, int i3, int i4, int i5) {
        this.f14660i = i2;
        this.f14661j = i3;
        this.f14662k = i4;
        this.f14663l = i5;
    }

    public void f(k kVar) {
        this.f14666o = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f14658g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f14659h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f14666o.u(b())) {
            outline.setRoundRect(getBounds(), this.f14666o.r().a(b()));
            return;
        }
        copyBounds(this.f14655d);
        this.f14656e.set(this.f14655d);
        this.f14652a.d(this.f14666o, 1.0f, this.f14656e, this.f14654c);
        if (this.f14654c.isConvex()) {
            outline.setConvexPath(this.f14654c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f14666o.u(b())) {
            return true;
        }
        int iRound = Math.round(this.f14659h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f14665n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f14664m)) != this.f14664m) {
            this.f14665n = true;
            this.f14664m = colorForState;
        }
        if (this.f14665n) {
            invalidateSelf();
        }
        return this.f14665n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f14653b.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f14653b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}

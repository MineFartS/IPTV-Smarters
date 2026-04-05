package a.e.f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f1228a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f1229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1230c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f1232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f1233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f1234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f1235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Path f1236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f1237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f1240m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1242o;
    public final int p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1241n = true;
    public boolean q = true;
    public boolean r = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f1231d = new Paint(5);

    public interface a {
        void a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    public g(Resources resources, ColorStateList colorStateList, float f2, float f3, float f4) {
        this.f1242o = resources.getColor(a.e.b.f1197d);
        this.p = resources.getColor(a.e.b.f1196c);
        this.f1230c = resources.getDimensionPixelSize(a.e.c.f1198a);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f1232e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1235h = (int) (f2 + 0.5f);
        this.f1234g = new RectF();
        Paint paint2 = new Paint(this.f1232e);
        this.f1233f = paint2;
        paint2.setAntiAlias(false);
        s(f3, f4);
    }

    public static float c(float f2, float f3, boolean z) {
        if (!z) {
            return f2;
        }
        double d2 = f2;
        double d3 = 1.0d - f1228a;
        double d4 = f3;
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (float) (d2 + (d3 * d4));
    }

    public static float d(float f2, float f3, boolean z) {
        float f4 = f2 * 1.5f;
        if (!z) {
            return f4;
        }
        double d2 = f4;
        double d3 = 1.0d - f1228a;
        double d4 = f3;
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (float) (d2 + (d3 * d4));
    }

    public final void a(Rect rect) {
        float f2 = this.f1237j;
        float f3 = 1.5f * f2;
        this.f1234g.set(rect.left + f2, rect.top + f3, rect.right - f2, rect.bottom - f3);
        b();
    }

    public final void b() {
        float f2 = this.f1235h;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.f1238k;
        rectF2.inset(-f3, -f3);
        Path path = this.f1236i;
        if (path == null) {
            this.f1236i = new Path();
        } else {
            path.reset();
        }
        this.f1236i.setFillType(Path.FillType.EVEN_ODD);
        this.f1236i.moveTo(-this.f1235h, 0.0f);
        this.f1236i.rLineTo(-this.f1238k, 0.0f);
        this.f1236i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1236i.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1236i.close();
        float f4 = this.f1235h;
        float f5 = f4 / (this.f1238k + f4);
        Paint paint = this.f1232e;
        float f6 = this.f1235h + this.f1238k;
        int i2 = this.f1242o;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i2, i2, this.p}, new float[]{0.0f, f5, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1233f;
        float f7 = this.f1235h;
        float f8 = this.f1238k;
        int i3 = this.f1242o;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i3, i3, this.p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1233f.setAntiAlias(false);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f1241n) {
            a(getBounds());
            this.f1241n = false;
        }
        canvas.translate(0.0f, this.f1239l / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f1239l) / 2.0f);
        f1229b.a(canvas, this.f1234g, this.f1235h, this.f1231d);
    }

    public final void e(Canvas canvas) {
        float f2 = this.f1235h;
        float f3 = (-f2) - this.f1238k;
        float f4 = f2 + this.f1230c + (this.f1239l / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z = this.f1234g.width() - f5 > 0.0f;
        boolean z2 = this.f1234g.height() - f5 > 0.0f;
        int iSave = canvas.save();
        RectF rectF = this.f1234g;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.f1236i, this.f1232e);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f1234g.width() - f5, -this.f1235h, this.f1233f);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        RectF rectF2 = this.f1234g;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1236i, this.f1232e);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f1234g.width() - f5, (-this.f1235h) + this.f1238k, this.f1233f);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        RectF rectF3 = this.f1234g;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1236i, this.f1232e);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f1234g.height() - f5, -this.f1235h, this.f1233f);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF4 = this.f1234g;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1236i, this.f1232e);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f1234g.height() - f5, -this.f1235h, this.f1233f);
        }
        canvas.restoreToCount(iSave4);
    }

    public ColorStateList f() {
        return this.f1240m;
    }

    public float g() {
        return this.f1235h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(d(this.f1237j, this.f1235h, this.q));
        int iCeil2 = (int) Math.ceil(c(this.f1237j, this.f1235h, this.q));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    public void h(Rect rect) {
        getPadding(rect);
    }

    public float i() {
        return this.f1237j;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f1240m;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public float j() {
        float f2 = this.f1237j;
        return (Math.max(f2, this.f1235h + this.f1230c + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.f1237j * 1.5f) + this.f1230c) * 2.0f);
    }

    public float k() {
        float f2 = this.f1237j;
        return (Math.max(f2, this.f1235h + this.f1230c + (f2 / 2.0f)) * 2.0f) + ((this.f1237j + this.f1230c) * 2.0f);
    }

    public float l() {
        return this.f1239l;
    }

    public void m(boolean z) {
        this.q = z;
        invalidateSelf();
    }

    public final void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1240m = colorStateList;
        this.f1231d.setColor(colorStateList.getColorForState(getState(), this.f1240m.getDefaultColor()));
    }

    public void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1241n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1240m;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1231d.getColor() == colorForState) {
            return false;
        }
        this.f1231d.setColor(colorForState);
        this.f1241n = true;
        invalidateSelf();
        return true;
    }

    public void p(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
        }
        float f3 = (int) (f2 + 0.5f);
        if (this.f1235h == f3) {
            return;
        }
        this.f1235h = f3;
        this.f1241n = true;
        invalidateSelf();
    }

    public void q(float f2) {
        s(this.f1239l, f2);
    }

    public void r(float f2) {
        s(f2, this.f1237j);
    }

    public final void s(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        }
        float fT = t(f2);
        float fT2 = t(f3);
        if (fT > fT2) {
            if (!this.r) {
                this.r = true;
            }
            fT = fT2;
        }
        if (this.f1239l == fT && this.f1237j == fT2) {
            return;
        }
        this.f1239l = fT;
        this.f1237j = fT2;
        this.f1238k = (int) ((fT * 1.5f) + this.f1230c + 0.5f);
        this.f1241n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f1231d.setAlpha(i2);
        this.f1232e.setAlpha(i2);
        this.f1233f.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1231d.setColorFilter(colorFilter);
    }

    public final int t(float f2) {
        int i2 = (int) (f2 + 0.5f);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }
}

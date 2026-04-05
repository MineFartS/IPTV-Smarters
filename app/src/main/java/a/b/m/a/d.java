package a.b.m.a;

import a.b.i;
import a.b.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f308a = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f320m;

    public d(Context context) {
        Paint paint = new Paint();
        this.f309b = paint;
        this.f315h = new Path();
        this.f317j = false;
        this.f320m = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.W0, a.b.a.B, i.f116b);
        d(typedArrayObtainStyledAttributes.getColor(j.a1, 0));
        c(typedArrayObtainStyledAttributes.getDimension(j.e1, 0.0f));
        f(typedArrayObtainStyledAttributes.getBoolean(j.d1, true));
        e(Math.round(typedArrayObtainStyledAttributes.getDimension(j.c1, 0.0f)));
        this.f316i = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.b1, 0);
        this.f311d = Math.round(typedArrayObtainStyledAttributes.getDimension(j.Z0, 0.0f));
        this.f310c = Math.round(typedArrayObtainStyledAttributes.getDimension(j.X0, 0.0f));
        this.f312e = typedArrayObtainStyledAttributes.getDimension(j.Y0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public float a() {
        return this.f318k;
    }

    public void c(float f2) {
        if (this.f309b.getStrokeWidth() != f2) {
            this.f309b.setStrokeWidth(f2);
            double d2 = f2 / 2.0f;
            double dCos = Math.cos(f308a);
            Double.isNaN(d2);
            this.f319l = (float) (d2 * dCos);
            invalidateSelf();
        }
    }

    public void d(int i2) {
        if (i2 != this.f309b.getColor()) {
            this.f309b.setColor(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i2 = this.f320m;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? a.i.j.l.a.f(this) == 0 : a.i.j.l.a.f(this) == 1))) {
            z = true;
        }
        float f2 = this.f310c;
        float fB = b(this.f311d, (float) Math.sqrt(f2 * f2 * 2.0f), this.f318k);
        float fB2 = b(this.f311d, this.f312e, this.f318k);
        float fRound = Math.round(b(0.0f, this.f319l, this.f318k));
        float fB3 = b(0.0f, f308a, this.f318k);
        float fB4 = b(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f318k);
        double d2 = fB;
        double d3 = fB3;
        double dCos = Math.cos(d3);
        Double.isNaN(d2);
        boolean z2 = z;
        float fRound2 = Math.round(dCos * d2);
        double dSin = Math.sin(d3);
        Double.isNaN(d2);
        float fRound3 = Math.round(d2 * dSin);
        this.f315h.rewind();
        float fB5 = b(this.f313f + this.f309b.getStrokeWidth(), -this.f319l, this.f318k);
        float f3 = (-fB2) / 2.0f;
        this.f315h.moveTo(f3 + fRound, 0.0f);
        this.f315h.rLineTo(fB2 - (fRound * 2.0f), 0.0f);
        this.f315h.moveTo(f3, fB5);
        this.f315h.rLineTo(fRound2, fRound3);
        this.f315h.moveTo(f3, -fB5);
        this.f315h.rLineTo(fRound2, -fRound3);
        this.f315h.close();
        canvas.save();
        float strokeWidth = this.f309b.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (2.0f * r5))) / 4) * 2) + (strokeWidth * 1.5f) + this.f313f);
        if (this.f314g) {
            canvas.rotate(fB4 * (this.f317j ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f315h, this.f309b);
        canvas.restore();
    }

    public void e(float f2) {
        if (f2 != this.f313f) {
            this.f313f = f2;
            invalidateSelf();
        }
    }

    public void f(boolean z) {
        if (this.f314g != z) {
            this.f314g = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f316i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f316i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (i2 != this.f309b.getAlpha()) {
            this.f309b.setAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f309b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f2) {
        if (this.f318k != f2) {
            this.f318k = f2;
            invalidateSelf();
        }
    }
}

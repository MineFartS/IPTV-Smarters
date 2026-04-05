package c.d.a.n.k.e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* JADX INFO: loaded from: classes.dex */
public class j extends c.d.a.n.k.f.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f5727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f5732g;

    public static class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Paint f5733a = new Paint(6);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bitmap f5734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Paint f5736d;

        public a(Bitmap bitmap) {
            this.f5736d = f5733a;
            this.f5734b = bitmap;
        }

        public a(a aVar) {
            this(aVar.f5734b);
            this.f5735c = aVar.f5735c;
        }

        public void a() {
            if (f5733a == this.f5736d) {
                this.f5736d = new Paint(6);
            }
        }

        public void b(int i2) {
            a();
            this.f5736d.setAlpha(i2);
        }

        public void c(ColorFilter colorFilter) {
            a();
            this.f5736d.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new j((Resources) null, this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new j(resources, this);
        }
    }

    public j(Resources resources, Bitmap bitmap) {
        this(resources, new a(bitmap));
    }

    public j(Resources resources, a aVar) {
        int i2;
        this.f5727b = new Rect();
        if (aVar == null) {
            throw new NullPointerException("BitmapState must not be null");
        }
        this.f5732g = aVar;
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
            i2 = i2 == 0 ? 160 : i2;
            aVar.f5735c = i2;
        } else {
            i2 = aVar.f5735c;
        }
        this.f5728c = aVar.f5734b.getScaledWidth(i2);
        this.f5729d = aVar.f5734b.getScaledHeight(i2);
    }

    @Override // c.d.a.n.k.f.b
    public boolean b() {
        return false;
    }

    @Override // c.d.a.n.k.f.b
    public void c(int i2) {
    }

    public Bitmap d() {
        return this.f5732g.f5734b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f5730e) {
            Gravity.apply(119, this.f5728c, this.f5729d, getBounds(), this.f5727b);
            this.f5730e = false;
        }
        a aVar = this.f5732g;
        canvas.drawBitmap(aVar.f5734b, (Rect) null, this.f5727b, aVar.f5736d);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5732g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5729d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5728c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.f5732g.f5734b;
        return (bitmap == null || bitmap.hasAlpha() || this.f5732g.f5736d.getAlpha() < 255) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f5731f && super.mutate() == this) {
            this.f5732g = new a(this.f5732g);
            this.f5731f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5730e = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f5732g.f5736d.getAlpha() != i2) {
            this.f5732g.b(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5732g.c(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }
}

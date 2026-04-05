package c.k.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.widget.ImageView;
import c.k.b.t;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends BitmapDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Paint f18774a = new Paint();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f18776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t.e f18777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f18778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18781h;

    public u(Context context, Bitmap bitmap, Drawable drawable, t.e eVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f18781h = 255;
        this.f18775b = z2;
        this.f18776c = context.getResources().getDisplayMetrics().density;
        this.f18777d = eVar;
        if ((eVar == t.e.MEMORY || z) ? false : true) {
            this.f18778e = drawable;
            this.f18780g = true;
            this.f18779f = SystemClock.uptimeMillis();
        }
    }

    public static Path b(Point point, int i2) {
        Point point2 = new Point(point.x + i2, point.y);
        Point point3 = new Point(point.x, point.y + i2);
        Path path = new Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        return path;
    }

    public static void c(ImageView imageView, Context context, Bitmap bitmap, t.e eVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new u(context, bitmap, drawable, eVar, z, z2));
    }

    public static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    public final void a(Canvas canvas) {
        Paint paint = f18774a;
        paint.setColor(-1);
        canvas.drawPath(b(new Point(0, 0), (int) (this.f18776c * 16.0f)), paint);
        paint.setColor(this.f18777d.debugColor);
        canvas.drawPath(b(new Point(0, 0), (int) (this.f18776c * 15.0f)), paint);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f18780g) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f18779f) / 200.0f;
            if (fUptimeMillis >= 1.0f) {
                this.f18780g = false;
                this.f18778e = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f18778e;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f18781h * fUptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f18781h);
                if (Build.VERSION.SDK_INT <= 10) {
                    invalidateSelf();
                }
            }
        } else {
            super.draw(canvas);
        }
        if (this.f18775b) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18778e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f18781h = i2;
        Drawable drawable = this.f18778e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
        super.setAlpha(i2);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f18778e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}

package c.e.b.a.a.g;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends f {
    public Paint F;
    public int G;
    public int H;

    public e() {
        u(-1);
        Paint paint = new Paint();
        this.F = paint;
        paint.setAntiAlias(true);
        this.F.setColor(this.G);
    }

    public abstract void J(Canvas canvas, Paint paint);

    public final void K() {
        int alpha = getAlpha();
        int i2 = this.H;
        this.G = ((((i2 >>> 24) * (alpha + (alpha >> 7))) >> 8) << 24) | ((i2 << 8) >>> 8);
    }

    @Override // c.e.b.a.a.g.f
    public final void b(Canvas canvas) {
        this.F.setColor(this.G);
        J(canvas, this.F);
    }

    @Override // c.e.b.a.a.g.f
    public int c() {
        return this.H;
    }

    @Override // c.e.b.a.a.g.f, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        super.setAlpha(i2);
        K();
    }

    @Override // c.e.b.a.a.g.f, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.F.setColorFilter(colorFilter);
    }

    @Override // c.e.b.a.a.g.f
    public void u(int i2) {
        this.H = i2;
        K();
    }
}

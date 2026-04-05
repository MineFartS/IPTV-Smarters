package androidx.leanback.widget;

import a.n.c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public final class SeekBar extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f4582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f4583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f4584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f4585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f4586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f4587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f4588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4595o;
    public a p;

    public static abstract class a {
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4582b = new RectF();
        this.f4583c = new RectF();
        this.f4584d = new RectF();
        Paint paint = new Paint(1);
        this.f4585e = paint;
        Paint paint2 = new Paint(1);
        this.f4586f = paint2;
        Paint paint3 = new Paint(1);
        this.f4587g = paint3;
        Paint paint4 = new Paint(1);
        this.f4588h = paint4;
        setWillNotDraw(false);
        paint3.setColor(-7829368);
        paint.setColor(DefaultRenderer.TEXT_COLOR);
        paint2.setColor(-65536);
        paint4.setColor(-1);
        this.f4594n = context.getResources().getDimensionPixelSize(c.p);
        this.f4595o = context.getResources().getDimensionPixelSize(c.f2593n);
        this.f4593m = context.getResources().getDimensionPixelSize(c.f2594o);
    }

    public final void a() {
        int i2 = isFocused() ? this.f4595o : this.f4594n;
        int width = getWidth();
        int height = getHeight();
        int i3 = (height - i2) / 2;
        RectF rectF = this.f4584d;
        int i4 = this.f4594n;
        float f2 = i3;
        float f3 = height - i3;
        rectF.set(i4 / 2, f2, width - (i4 / 2), f3);
        int i5 = isFocused() ? this.f4593m : this.f4594n / 2;
        float f4 = width - (i5 * 2);
        float f5 = (this.f4589i / this.f4591k) * f4;
        RectF rectF2 = this.f4582b;
        int i6 = this.f4594n;
        rectF2.set(i6 / 2, f2, (i6 / 2) + f5, f3);
        this.f4583c.set(this.f4582b.right, f2, (this.f4594n / 2) + ((this.f4590j / this.f4591k) * f4), f3);
        this.f4592l = i5 + ((int) f5);
        invalidate();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.f4591k;
    }

    public int getProgress() {
        return this.f4589i;
    }

    public int getSecondProgress() {
        return this.f4590j;
    }

    public int getSecondaryProgressColor() {
        return this.f4585e.getColor();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f2 = isFocused() ? this.f4593m : this.f4594n / 2;
        canvas.drawRoundRect(this.f4584d, f2, f2, this.f4587g);
        RectF rectF = this.f4583c;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f2, f2, this.f4585e);
        }
        canvas.drawRoundRect(this.f4582b, f2, f2, this.f4586f);
        canvas.drawCircle(this.f4592l, getHeight() / 2, f2, this.f4588h);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        a();
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        a();
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        if (this.p == null || !(i2 == 4096 || i2 == 8192)) {
            return super.performAccessibilityAction(i2, bundle);
        }
        throw null;
    }

    public void setAccessibilitySeekListener(a aVar) {
    }

    public void setActiveBarHeight(int i2) {
        this.f4595o = i2;
        a();
    }

    public void setActiveRadius(int i2) {
        this.f4593m = i2;
        a();
    }

    public void setBarHeight(int i2) {
        this.f4594n = i2;
        a();
    }

    public void setMax(int i2) {
        this.f4591k = i2;
        a();
    }

    public void setProgress(int i2) {
        int i3 = this.f4591k;
        if (i2 > i3) {
            i2 = i3;
        } else if (i2 < 0) {
            i2 = 0;
        }
        this.f4589i = i2;
        a();
    }

    public void setProgressColor(int i2) {
        this.f4586f.setColor(i2);
    }

    public void setSecondaryProgress(int i2) {
        int i3 = this.f4591k;
        if (i2 > i3) {
            i2 = i3;
        } else if (i2 < 0) {
            i2 = 0;
        }
        this.f4590j = i2;
        a();
    }

    public void setSecondaryProgressColor(int i2) {
        this.f4585e.setColor(i2);
    }
}

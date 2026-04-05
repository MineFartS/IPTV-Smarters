package c.l.a;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends Drawable implements Animatable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rect f18831b = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<ValueAnimator> f18833d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint f18837h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<ValueAnimator, ValueAnimator.AnimatorUpdateListener> f18832c = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18834e = 255;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f18835f = f18831b;

    public a() {
        Paint paint = new Paint();
        this.f18837h = paint;
        paint.setColor(-1);
        this.f18837h.setStyle(Paint.Style.FILL);
        this.f18837h.setAntiAlias(true);
    }

    public void a(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f18832c.put(valueAnimator, animatorUpdateListener);
    }

    public abstract void b(Canvas canvas, Paint paint);

    public final void c() {
        if (this.f18836g) {
            return;
        }
        this.f18833d = g();
        this.f18836g = true;
    }

    public int d() {
        return this.f18835f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b(canvas, this.f18837h);
    }

    public int e() {
        return this.f18835f.width();
    }

    public final boolean f() {
        Iterator<ValueAnimator> it = this.f18833d.iterator();
        if (it.hasNext()) {
            return it.next().isStarted();
        }
        return false;
    }

    public abstract ArrayList<ValueAnimator> g();

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f18834e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public void h() {
        invalidateSelf();
    }

    public void i(int i2) {
        this.f18837h.setColor(i2);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Iterator<ValueAnimator> it = this.f18833d.iterator();
        if (it.hasNext()) {
            return it.next().isRunning();
        }
        return false;
    }

    public void j(int i2, int i3, int i4, int i5) {
        this.f18835f = new Rect(i2, i3, i4, i5);
    }

    public void k(Rect rect) {
        j(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void l() {
        for (int i2 = 0; i2 < this.f18833d.size(); i2++) {
            ValueAnimator valueAnimator = this.f18833d.get(i2);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f18832c.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
    }

    public final void m() {
        ArrayList<ValueAnimator> arrayList = this.f18833d;
        if (arrayList != null) {
            for (ValueAnimator valueAnimator : arrayList) {
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.end();
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        k(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f18834e = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        c();
        if (this.f18833d == null || f()) {
            return;
        }
        l();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m();
    }
}

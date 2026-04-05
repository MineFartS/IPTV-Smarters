package com.google.android.material.timepicker;

import a.i.r.x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import c.f.a.d.k;
import c.f.a.d.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ClockHandView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueAnimator f24593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f24595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<d> f24599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f24601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f24602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f24603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f24604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f24605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24606o;
    public c p;
    public double q;
    public int r;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void a(float f2, boolean z);
    }

    public interface d {
        void a(float f2, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f.a.d.b.v);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f24599h = new ArrayList();
        Paint paint = new Paint();
        this.f24602k = paint;
        this.f24603l = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.e1, i2, k.v);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.g1, 0);
        this.f24600i = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.h1, 0);
        this.f24604m = getResources().getDimensionPixelSize(c.f.a.d.d.f14714m);
        this.f24601j = r6.getDimensionPixelSize(c.f.a.d.d.f14712k);
        int color = typedArrayObtainStyledAttributes.getColor(l.f1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.f24598g = ViewConfiguration.get(context).getScaledTouchSlop();
        x.y0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void b(d dVar) {
        this.f24599h.add(dVar);
    }

    public final void c(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float fCos = (this.r * ((float) Math.cos(this.q))) + width;
        float f2 = height;
        float fSin = (this.r * ((float) Math.sin(this.q))) + f2;
        this.f24602k.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f24600i, this.f24602k);
        double dSin = Math.sin(this.q);
        double dCos = Math.cos(this.q);
        Double.isNaN(d);
        Double.isNaN(d);
        this.f24602k.setStrokeWidth(this.f24604m);
        canvas.drawLine(width, f2, r1 + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f24602k);
        canvas.drawCircle(width, f2, this.f24601j, this.f24602k);
    }

    public RectF d() {
        return this.f24603l;
    }

    public final int e(float f2, float f3) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f3 - (getHeight() / 2), f2 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public float f() {
        return this.f24605n;
    }

    public int g() {
        return this.f24600i;
    }

    public final Pair<Float, Float> h(float f2) {
        float f3 = f();
        if (Math.abs(f3 - f2) > 180.0f) {
            if (f3 > 180.0f && f2 < 180.0f) {
                f2 += 360.0f;
            }
            if (f3 < 180.0f && f2 > 180.0f) {
                f3 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f3), Float.valueOf(f2));
    }

    public final boolean i(float f2, float f3, boolean z, boolean z2, boolean z3) {
        float fE = e(f2, f3);
        boolean z4 = false;
        boolean z5 = f() != fE;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.f24594c) {
            z4 = true;
        }
        l(fE, z4);
        return true;
    }

    public void j(int i2) {
        this.r = i2;
        invalidate();
    }

    public void k(float f2) {
        l(f2, false);
    }

    public void l(float f2, boolean z) {
        ValueAnimator valueAnimator = this.f24593b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m(f2, false);
            return;
        }
        Pair<Float, Float> pairH = h(f2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) pairH.first).floatValue(), ((Float) pairH.second).floatValue());
        this.f24593b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f24593b.addUpdateListener(new a());
        this.f24593b.addListener(new b());
        this.f24593b.start();
    }

    public final void m(float f2, boolean z) {
        float f3 = f2 % 360.0f;
        this.f24605n = f3;
        this.q = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.r * ((float) Math.cos(this.q)));
        float fSin = height + (this.r * ((float) Math.sin(this.q)));
        RectF rectF = this.f24603l;
        int i2 = this.f24600i;
        rectF.set(width - i2, fSin - i2, width + i2, fSin + i2);
        Iterator<d> it = this.f24599h.iterator();
        while (it.hasNext()) {
            it.next().a(f3, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        k(f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i2 = (int) (x - this.f24595d);
                int i3 = (int) (y - this.f24596e);
                this.f24597f = (i2 * i2) + (i3 * i3) > this.f24598g;
                boolean z4 = this.f24606o;
                z = actionMasked == 1;
                z2 = z4;
            } else {
                z = false;
                z2 = false;
            }
            z3 = false;
        } else {
            this.f24595d = x;
            this.f24596e = y;
            this.f24597f = true;
            this.f24606o = false;
            z = false;
            z2 = false;
            z3 = true;
        }
        boolean zI = i(x, y, z2, z3, z) | this.f24606o;
        this.f24606o = zI;
        if (zI && z && (cVar = this.p) != null) {
            cVar.a(e(x, y), this.f24597f);
        }
        return true;
    }
}

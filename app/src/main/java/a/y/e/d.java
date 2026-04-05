package a.y.e;

import a.i.r.x;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class d extends RecyclerView.o implements RecyclerView.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f3865a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f3866b = new int[0];
    public final ValueAnimator B;
    public int C;
    public final Runnable D;
    public final RecyclerView.u E;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StateListDrawable f3869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f3870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final StateListDrawable f3873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Drawable f3874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f3875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3878n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f3879o;
    public int p;
    public int q;
    public float r;
    public RecyclerView u;
    public int s = 0;
    public int t = 0;
    public boolean v = false;
    public boolean w = false;
    public int x = 0;
    public int y = 0;
    public final int[] z = new int[2];
    public final int[] A = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.s(500);
        }
    }

    public class b extends RecyclerView.u {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i2, int i3) {
            d.this.D(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3882b = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3882b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3882b) {
                this.f3882b = false;
                return;
            }
            if (((Float) d.this.B.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.C = 0;
                dVar.A(0);
            } else {
                d dVar2 = d.this;
                dVar2.C = 2;
                dVar2.x();
            }
        }
    }

    /* JADX INFO: renamed from: a.y.e.d$d, reason: collision with other inner class name */
    public class C0091d implements ValueAnimator.AnimatorUpdateListener {
        public C0091d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f3869e.setAlpha(iFloatValue);
            d.this.f3870f.setAlpha(iFloatValue);
            d.this.x();
        }
    }

    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = valueAnimatorOfFloat;
        this.C = 0;
        this.D = new a();
        this.E = new b();
        this.f3869e = stateListDrawable;
        this.f3870f = drawable;
        this.f3873i = stateListDrawable2;
        this.f3874j = drawable2;
        this.f3871g = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f3872h = Math.max(i2, drawable.getIntrinsicWidth());
        this.f3875k = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f3876l = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f3867c = i3;
        this.f3868d = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0091d());
        l(recyclerView);
    }

    public void A(int i2) {
        int i3;
        if (i2 == 2 && this.x != 2) {
            this.f3869e.setState(f3865a);
            m();
        }
        if (i2 == 0) {
            x();
        } else {
            C();
        }
        if (this.x != 2 || i2 == 2) {
            i3 = i2 == 1 ? 1500 : 1200;
            this.x = i2;
        }
        this.f3869e.setState(f3866b);
        y(i3);
        this.x = i2;
    }

    public final void B() {
        this.u.h(this);
        this.u.k(this);
        this.u.l(this.E);
    }

    public void C() {
        int i2 = this.C;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                this.B.cancel();
            }
        }
        this.C = 1;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.B.setDuration(500L);
        this.B.setStartDelay(0L);
        this.B.start();
    }

    public void D(int i2, int i3) {
        int iComputeVerticalScrollRange = this.u.computeVerticalScrollRange();
        int i4 = this.t;
        this.v = iComputeVerticalScrollRange - i4 > 0 && i4 >= this.f3867c;
        int iComputeHorizontalScrollRange = this.u.computeHorizontalScrollRange();
        int i5 = this.s;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= this.f3867c;
        this.w = z;
        boolean z2 = this.v;
        if (!z2 && !z) {
            if (this.x != 0) {
                A(0);
                return;
            }
            return;
        }
        if (z2) {
            float f2 = i4;
            this.f3878n = (int) ((f2 * (i3 + (f2 / 2.0f))) / iComputeVerticalScrollRange);
            this.f3877m = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (this.w) {
            float f3 = i5;
            this.q = (int) ((f3 * (i2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            this.p = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = this.x;
        if (i6 == 0 || i6 == 1) {
            A(1);
        }
    }

    public final void E(float f2) {
        int[] iArrR = r();
        float fMax = Math.max(iArrR[0], Math.min(iArrR[1], f2));
        if (Math.abs(this.f3878n - fMax) < 2.0f) {
            return;
        }
        int iZ = z(this.f3879o, fMax, iArrR, this.u.computeVerticalScrollRange(), this.u.computeVerticalScrollOffset(), this.t);
        if (iZ != 0) {
            this.u.scrollBy(0, iZ);
        }
        this.f3879o = fMax;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.x == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zW = w(motionEvent.getX(), motionEvent.getY());
            boolean zV = v(motionEvent.getX(), motionEvent.getY());
            if (zW || zV) {
                if (zV) {
                    this.y = 1;
                    this.r = (int) motionEvent.getX();
                } else if (zW) {
                    this.y = 2;
                    this.f3879o = (int) motionEvent.getY();
                }
                A(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.x == 2) {
            this.f3879o = 0.0f;
            this.r = 0.0f;
            A(1);
            this.y = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.x == 2) {
            C();
            if (this.y == 1) {
                t(motionEvent.getX());
            }
            if (this.y == 2) {
                E(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.x;
        if (i2 == 1) {
            boolean zW = w(motionEvent.getX(), motionEvent.getY());
            boolean zV = v(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zW && !zV) {
                return false;
            }
            if (zV) {
                this.y = 1;
                this.r = (int) motionEvent.getX();
            } else if (zW) {
                this.y = 2;
                this.f3879o = (int) motionEvent.getY();
            }
            A(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.s != this.u.getWidth() || this.t != this.u.getHeight()) {
            this.s = this.u.getWidth();
            this.t = this.u.getHeight();
            A(0);
        } else if (this.C != 0) {
            if (this.v) {
                p(canvas);
            }
            if (this.w) {
                o(canvas);
            }
        }
    }

    public void l(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.u;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            n();
        }
        this.u = recyclerView;
        if (recyclerView != null) {
            B();
        }
    }

    public final void m() {
        this.u.removeCallbacks(this.D);
    }

    public final void n() {
        this.u.b1(this);
        this.u.d1(this);
        this.u.e1(this.E);
        m();
    }

    public final void o(Canvas canvas) {
        int i2 = this.t;
        int i3 = this.f3875k;
        int i4 = this.q;
        int i5 = this.p;
        this.f3873i.setBounds(0, 0, i5, i3);
        this.f3874j.setBounds(0, 0, this.s, this.f3876l);
        canvas.translate(0.0f, i2 - i3);
        this.f3874j.draw(canvas);
        canvas.translate(i4 - (i5 / 2), 0.0f);
        this.f3873i.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    public final void p(Canvas canvas) {
        int i2 = this.s;
        int i3 = this.f3871g;
        int i4 = i2 - i3;
        int i5 = this.f3878n;
        int i6 = this.f3877m;
        int i7 = i5 - (i6 / 2);
        this.f3869e.setBounds(0, 0, i3, i6);
        this.f3870f.setBounds(0, 0, this.f3872h, this.t);
        if (u()) {
            this.f3870f.draw(canvas);
            canvas.translate(this.f3871g, i7);
            canvas.scale(-1.0f, 1.0f);
            this.f3869e.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            i4 = this.f3871g;
        } else {
            canvas.translate(i4, 0.0f);
            this.f3870f.draw(canvas);
            canvas.translate(0.0f, i7);
            this.f3869e.draw(canvas);
        }
        canvas.translate(-i4, -i7);
    }

    public final int[] q() {
        int[] iArr = this.A;
        int i2 = this.f3868d;
        iArr[0] = i2;
        iArr[1] = this.s - i2;
        return iArr;
    }

    public final int[] r() {
        int[] iArr = this.z;
        int i2 = this.f3868d;
        iArr[0] = i2;
        iArr[1] = this.t - i2;
        return iArr;
    }

    public void s(int i2) {
        int i3 = this.C;
        if (i3 == 1) {
            this.B.cancel();
        } else if (i3 != 2) {
            return;
        }
        this.C = 3;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.B.setDuration(i2);
        this.B.start();
    }

    public final void t(float f2) {
        int[] iArrQ = q();
        float fMax = Math.max(iArrQ[0], Math.min(iArrQ[1], f2));
        if (Math.abs(this.q - fMax) < 2.0f) {
            return;
        }
        int iZ = z(this.r, fMax, iArrQ, this.u.computeHorizontalScrollRange(), this.u.computeHorizontalScrollOffset(), this.s);
        if (iZ != 0) {
            this.u.scrollBy(iZ, 0);
        }
        this.r = fMax;
    }

    public final boolean u() {
        return x.C(this.u) == 1;
    }

    public boolean v(float f2, float f3) {
        if (f3 >= this.t - this.f3875k) {
            int i2 = this.q;
            int i3 = this.p;
            if (f2 >= i2 - (i3 / 2) && f2 <= i2 + (i3 / 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean w(float f2, float f3) {
        if (!u() ? f2 >= this.s - this.f3871g : f2 <= this.f3871g) {
            int i2 = this.f3878n;
            int i3 = this.f3877m;
            if (f3 >= i2 - (i3 / 2) && f3 <= i2 + (i3 / 2)) {
                return true;
            }
        }
        return false;
    }

    public void x() {
        this.u.invalidate();
    }

    public final void y(int i2) {
        m();
        this.u.postDelayed(this.D, i2);
    }

    public final int z(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }
}

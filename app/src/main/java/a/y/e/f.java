package a.y.e;

import a.i.r.x;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f extends RecyclerView.o implements RecyclerView.r {
    public g A;
    public Rect C;
    public long D;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f3905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f3910k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AbstractC0092f f3912m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3914o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public List<RecyclerView.e0> u;
    public List<Integer> v;
    public a.i.r.e z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<View> f3900a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f3901b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView.e0 f3902c = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3911l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3913n = 0;
    public List<h> p = new ArrayList();
    public final Runnable s = new a();
    public RecyclerView.k w = null;
    public View x = null;
    public int y = -1;
    public final RecyclerView.t B = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            if (fVar.f3902c == null || !fVar.E()) {
                return;
            }
            f fVar2 = f.this;
            RecyclerView.e0 e0Var = fVar2.f3902c;
            if (e0Var != null) {
                fVar2.z(e0Var);
            }
            f fVar3 = f.this;
            fVar3.r.removeCallbacks(fVar3.s);
            x.h0(f.this.r, this);
        }
    }

    public class b implements RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            f.this.z.a(motionEvent);
            VelocityTracker velocityTracker = f.this.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (f.this.f3911l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(f.this.f3911l);
            if (iFindPointerIndex >= 0) {
                f.this.o(actionMasked, motionEvent, iFindPointerIndex);
            }
            f fVar = f.this;
            RecyclerView.e0 e0Var = fVar.f3902c;
            if (e0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        fVar.L(motionEvent, fVar.f3914o, iFindPointerIndex);
                        f.this.z(e0Var);
                        f fVar2 = f.this;
                        fVar2.r.removeCallbacks(fVar2.s);
                        f.this.s.run();
                        f.this.r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    f fVar3 = f.this;
                    if (pointerId == fVar3.f3911l) {
                        fVar3.f3911l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        f fVar4 = f.this;
                        fVar4.L(motionEvent, fVar4.f3914o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = fVar.t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            f.this.F(null, 0);
            f.this.f3911l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            h hVarS;
            f.this.z.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                f.this.f3911l = motionEvent.getPointerId(0);
                f.this.f3903d = motionEvent.getX();
                f.this.f3904e = motionEvent.getY();
                f.this.A();
                f fVar = f.this;
                if (fVar.f3902c == null && (hVarS = fVar.s(motionEvent)) != null) {
                    f fVar2 = f.this;
                    fVar2.f3903d -= hVarS.f3935k;
                    fVar2.f3904e -= hVarS.f3936l;
                    fVar2.r(hVarS.f3930f, true);
                    if (f.this.f3900a.remove(hVarS.f3930f.f4855b)) {
                        f fVar3 = f.this;
                        fVar3.f3912m.c(fVar3.r, hVarS.f3930f);
                    }
                    f.this.F(hVarS.f3930f, hVarS.f3931g);
                    f fVar4 = f.this;
                    fVar4.L(motionEvent, fVar4.f3914o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                f fVar5 = f.this;
                fVar5.f3911l = -1;
                fVar5.F(null, 0);
            } else {
                int i2 = f.this.f3911l;
                if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                    f.this.o(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = f.this.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return f.this.f3902c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z) {
            if (z) {
                f.this.F(null, 0);
            }
        }
    }

    public class c extends h {
        public final /* synthetic */ int p;
        public final /* synthetic */ RecyclerView.e0 q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.e0 e0Var, int i2, int i3, float f2, float f3, float f4, float f5, int i4, RecyclerView.e0 e0Var2) {
            super(e0Var, i2, i3, f2, f3, f4, f5);
            this.p = i4;
            this.q = e0Var2;
        }

        @Override // a.y.e.f.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f3937m) {
                return;
            }
            if (this.p <= 0) {
                f fVar = f.this;
                fVar.f3912m.c(fVar.r, this.q);
            } else {
                f.this.f3900a.add(this.q.f4855b);
                this.f3934j = true;
                int i2 = this.p;
                if (i2 > 0) {
                    f.this.B(this, i2);
                }
            }
            f fVar2 = f.this;
            View view = fVar2.x;
            View view2 = this.q.f4855b;
            if (view == view2) {
                fVar2.D(view2);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f3917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f3918c;

        public d(h hVar, int i2) {
            this.f3917b = hVar;
            this.f3918c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = f.this.r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            h hVar = this.f3917b;
            if (hVar.f3937m || hVar.f3930f.m() == -1) {
                return;
            }
            RecyclerView.m itemAnimator = f.this.r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.q(null)) && !f.this.x()) {
                f.this.f3912m.B(this.f3917b.f3930f, this.f3918c);
            } else {
                f.this.r.post(this);
            }
        }
    }

    public class e implements RecyclerView.k {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public int a(int i2, int i3) {
            f fVar = f.this;
            View view = fVar.x;
            if (view == null) {
                return i3;
            }
            int iIndexOfChild = fVar.y;
            if (iIndexOfChild == -1) {
                iIndexOfChild = fVar.r.indexOfChild(view);
                f.this.y = iIndexOfChild;
            }
            return i3 == i2 + (-1) ? iIndexOfChild : i3 < iIndexOfChild ? i3 : i3 + 1;
        }
    }

    /* JADX INFO: renamed from: a.y.e.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0092f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Interpolator f3921a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Interpolator f3922b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3923c = -1;

        /* JADX INFO: renamed from: a.y.e.f$f$a */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                return f2 * f2 * f2 * f2 * f2;
            }
        }

        /* JADX INFO: renamed from: a.y.e.f$f$b */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            }
        }

        public static int e(int i2, int i3) {
            int i4;
            int i5 = i2 & 789516;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (i5 ^ (-1));
            if (i3 == 0) {
                i4 = i5 << 2;
            } else {
                int i7 = i5 << 1;
                i6 |= (-789517) & i7;
                i4 = (i7 & 789516) << 2;
            }
            return i6 | i4;
        }

        public static int s(int i2, int i3) {
            return i3 << (i2 * 8);
        }

        public static int t(int i2, int i3) {
            return s(2, i2) | s(1, i3) | s(0, i3 | i2);
        }

        public void A(RecyclerView.e0 e0Var, int i2) {
            if (e0Var != null) {
                a.y.e.h.f3941a.b(e0Var.f4855b);
            }
        }

        public abstract void B(RecyclerView.e0 e0Var, int i2);

        public boolean a(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            return true;
        }

        public RecyclerView.e0 b(RecyclerView.e0 e0Var, List<RecyclerView.e0> list, int i2, int i3) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = i2 + e0Var.f4855b.getWidth();
            int height = i3 + e0Var.f4855b.getHeight();
            int left2 = i2 - e0Var.f4855b.getLeft();
            int top2 = i3 - e0Var.f4855b.getTop();
            int size = list.size();
            RecyclerView.e0 e0Var2 = null;
            int i4 = -1;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.e0 e0Var3 = list.get(i5);
                if (left2 > 0 && (right = e0Var3.f4855b.getRight() - width) < 0 && e0Var3.f4855b.getRight() > e0Var.f4855b.getRight() && (iAbs4 = Math.abs(right)) > i4) {
                    e0Var2 = e0Var3;
                    i4 = iAbs4;
                }
                if (left2 < 0 && (left = e0Var3.f4855b.getLeft() - i2) > 0 && e0Var3.f4855b.getLeft() < e0Var.f4855b.getLeft() && (iAbs3 = Math.abs(left)) > i4) {
                    e0Var2 = e0Var3;
                    i4 = iAbs3;
                }
                if (top2 < 0 && (top = e0Var3.f4855b.getTop() - i3) > 0 && e0Var3.f4855b.getTop() < e0Var.f4855b.getTop() && (iAbs2 = Math.abs(top)) > i4) {
                    e0Var2 = e0Var3;
                    i4 = iAbs2;
                }
                if (top2 > 0 && (bottom = e0Var3.f4855b.getBottom() - height) < 0 && e0Var3.f4855b.getBottom() > e0Var.f4855b.getBottom() && (iAbs = Math.abs(bottom)) > i4) {
                    e0Var2 = e0Var3;
                    i4 = iAbs;
                }
            }
            return e0Var2;
        }

        public void c(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            a.y.e.h.f3941a.a(e0Var.f4855b);
        }

        public int d(int i2, int i3) {
            int i4;
            int i5 = i2 & 3158064;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (i5 ^ (-1));
            if (i3 == 0) {
                i4 = i5 >> 2;
            } else {
                int i7 = i5 >> 1;
                i6 |= (-3158065) & i7;
                i4 = (i7 & 3158064) >> 2;
            }
            return i6 | i4;
        }

        public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return d(k(recyclerView, e0Var), x.C(recyclerView));
        }

        public long g(RecyclerView recyclerView, int i2, float f2, float f3) {
            RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i2 == 8 ? 200L : 250L : i2 == 8 ? itemAnimator.n() : itemAnimator.o();
        }

        public int h() {
            return 0;
        }

        public final int i(RecyclerView recyclerView) {
            if (this.f3923c == -1) {
                this.f3923c = recyclerView.getResources().getDimensionPixelSize(a.y.b.f3782d);
            }
            return this.f3923c;
        }

        public float j(RecyclerView.e0 e0Var) {
            return 0.5f;
        }

        public abstract int k(RecyclerView recyclerView, RecyclerView.e0 e0Var);

        public float l(float f2) {
            return f2;
        }

        public float m(RecyclerView.e0 e0Var) {
            return 0.5f;
        }

        public float n(float f2) {
            return f2;
        }

        public boolean o(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return (f(recyclerView, e0Var) & 16711680) != 0;
        }

        public int p(RecyclerView recyclerView, int i2, int i3, int i4, long j2) {
            int iSignum = (int) (((int) (((int) Math.signum(i3)) * i(recyclerView) * f3922b.getInterpolation(Math.min(1.0f, (Math.abs(i3) * 1.0f) / i2)))) * f3921a.getInterpolation(j2 <= 2000 ? j2 / 2000.0f : 1.0f));
            return iSignum == 0 ? i3 > 0 ? 1 : -1 : iSignum;
        }

        public abstract boolean q();

        public abstract boolean r();

        public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f2, float f3, int i2, boolean z) {
            a.y.e.h.f3941a.d(canvas, recyclerView, e0Var.f4855b, f2, f3, i2, z);
        }

        public void v(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f2, float f3, int i2, boolean z) {
            a.y.e.h.f3941a.c(canvas, recyclerView, e0Var.f4855b, f2, f3, i2, z);
        }

        public void w(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, List<h> list, int i2, float f2, float f3) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                h hVar = list.get(i3);
                hVar.e();
                int iSave = canvas.save();
                u(canvas, recyclerView, hVar.f3930f, hVar.f3935k, hVar.f3936l, hVar.f3931g, false);
                canvas.restoreToCount(iSave);
            }
            if (e0Var != null) {
                int iSave2 = canvas.save();
                u(canvas, recyclerView, e0Var, f2, f3, i2, true);
                canvas.restoreToCount(iSave2);
            }
        }

        public void x(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, List<h> list, int i2, float f2, float f3) {
            int size = list.size();
            boolean z = false;
            for (int i3 = 0; i3 < size; i3++) {
                h hVar = list.get(i3);
                int iSave = canvas.save();
                v(canvas, recyclerView, hVar.f3930f, hVar.f3935k, hVar.f3936l, hVar.f3931g, false);
                canvas.restoreToCount(iSave);
            }
            if (e0Var != null) {
                int iSave2 = canvas.save();
                v(canvas, recyclerView, e0Var, f2, f3, i2, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i4 = size - 1; i4 >= 0; i4--) {
                h hVar2 = list.get(i4);
                boolean z2 = hVar2.f3938n;
                if (z2 && !hVar2.f3934j) {
                    list.remove(i4);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean y(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2);

        /* JADX WARN: Multi-variable type inference failed */
        public void z(RecyclerView recyclerView, RecyclerView.e0 e0Var, int i2, RecyclerView.e0 e0Var2, int i3, int i4, int i5) {
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof i) {
                ((i) layoutManager).b(e0Var.f4855b, e0Var2.f4855b, i4, i5);
                return;
            }
            if (layoutManager.l()) {
                if (layoutManager.S(e0Var2.f4855b) <= recyclerView.getPaddingLeft()) {
                    recyclerView.n1(i3);
                }
                if (layoutManager.V(e0Var2.f4855b) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.n1(i3);
                }
            }
            if (layoutManager.m()) {
                if (layoutManager.W(e0Var2.f4855b) <= recyclerView.getPaddingTop()) {
                    recyclerView.n1(i3);
                }
                if (layoutManager.Q(e0Var2.f4855b) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.n1(i3);
                }
            }
        }
    }

    public class g extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3924b = true;

        public g() {
        }

        public void a() {
            this.f3924b = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewT;
            RecyclerView.e0 e0VarI0;
            if (!this.f3924b || (viewT = f.this.t(motionEvent)) == null || (e0VarI0 = f.this.r.i0(viewT)) == null) {
                return;
            }
            f fVar = f.this;
            if (fVar.f3912m.o(fVar.r, e0VarI0)) {
                int pointerId = motionEvent.getPointerId(0);
                int i2 = f.this.f3911l;
                if (pointerId == i2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    f fVar2 = f.this;
                    fVar2.f3903d = x;
                    fVar2.f3904e = y;
                    fVar2.f3908i = 0.0f;
                    fVar2.f3907h = 0.0f;
                    if (fVar2.f3912m.r()) {
                        f.this.F(e0VarI0, 2);
                    }
                }
            }
        }
    }

    public static class h implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f3926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f3927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f3928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f3929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final RecyclerView.e0 f3930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f3931g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ValueAnimator f3932h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f3933i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f3934j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f3935k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f3936l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f3937m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f3938n = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f3939o;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        public h(RecyclerView.e0 e0Var, int i2, int i3, float f2, float f3, float f4, float f5) {
            this.f3931g = i3;
            this.f3933i = i2;
            this.f3930f = e0Var;
            this.f3926b = f2;
            this.f3927c = f3;
            this.f3928d = f4;
            this.f3929e = f5;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f3932h = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a());
            valueAnimatorOfFloat.setTarget(e0Var.f4855b);
            valueAnimatorOfFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f3932h.cancel();
        }

        public void b(long j2) {
            this.f3932h.setDuration(j2);
        }

        public void c(float f2) {
            this.f3939o = f2;
        }

        public void d() {
            this.f3930f.L(false);
            this.f3932h.start();
        }

        public void e() {
            float f2 = this.f3926b;
            float f3 = this.f3928d;
            this.f3935k = f2 == f3 ? this.f3930f.f4855b.getTranslationX() : f2 + (this.f3939o * (f3 - f2));
            float f4 = this.f3927c;
            float f5 = this.f3929e;
            this.f3936l = f4 == f5 ? this.f3930f.f4855b.getTranslationY() : f4 + (this.f3939o * (f5 - f4));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f3938n) {
                this.f3930f.L(true);
            }
            this.f3938n = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public interface i {
        void b(View view, View view2, int i2, int i3);
    }

    public f(AbstractC0092f abstractC0092f) {
        this.f3912m = abstractC0092f;
    }

    public static boolean y(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    public void A() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.t = VelocityTracker.obtain();
    }

    public void B(h hVar, int i2) {
        this.r.post(new d(hVar, i2));
    }

    public final void C() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    public void D(View view) {
        if (view == this.x) {
            this.x = null;
            if (this.w != null) {
                this.r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean E() {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y.e.f.E():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(androidx.recyclerview.widget.RecyclerView.e0 r24, int r25) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y.e.f.F(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    public final void G() {
        this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
        this.r.h(this);
        this.r.k(this.B);
        this.r.j(this);
        I();
    }

    public void H(RecyclerView.e0 e0Var) {
        if (!this.f3912m.o(this.r, e0Var)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (e0Var.f4855b.getParent() != this.r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        A();
        this.f3908i = 0.0f;
        this.f3907h = 0.0f;
        F(e0Var, 2);
    }

    public final void I() {
        this.A = new g();
        this.z = new a.i.r.e(this.r.getContext(), this.A);
    }

    public final void J() {
        g gVar = this.A;
        if (gVar != null) {
            gVar.a();
            this.A = null;
        }
        if (this.z != null) {
            this.z = null;
        }
    }

    public final int K(RecyclerView.e0 e0Var) {
        if (this.f3913n == 2) {
            return 0;
        }
        int iK = this.f3912m.k(this.r, e0Var);
        int iD = (this.f3912m.d(iK, x.C(this.r)) & 65280) >> 8;
        if (iD == 0) {
            return 0;
        }
        int i2 = (iK & 65280) >> 8;
        if (Math.abs(this.f3907h) > Math.abs(this.f3908i)) {
            int iN = n(e0Var, iD);
            if (iN > 0) {
                return (i2 & iN) == 0 ? AbstractC0092f.e(iN, x.C(this.r)) : iN;
            }
            int iP = p(e0Var, iD);
            if (iP > 0) {
                return iP;
            }
        } else {
            int iP2 = p(e0Var, iD);
            if (iP2 > 0) {
                return iP2;
            }
            int iN2 = n(e0Var, iD);
            if (iN2 > 0) {
                return (i2 & iN2) == 0 ? AbstractC0092f.e(iN2, x.C(this.r)) : iN2;
            }
        }
        return 0;
    }

    public void L(MotionEvent motionEvent, int i2, int i3) {
        float x = motionEvent.getX(i3);
        float y = motionEvent.getY(i3);
        float f2 = x - this.f3903d;
        this.f3907h = f2;
        this.f3908i = y - this.f3904e;
        if ((i2 & 4) == 0) {
            this.f3907h = Math.max(0.0f, f2);
        }
        if ((i2 & 8) == 0) {
            this.f3907h = Math.min(0.0f, this.f3907h);
        }
        if ((i2 & 1) == 0) {
            this.f3908i = Math.max(0.0f, this.f3908i);
        }
        if ((i2 & 2) == 0) {
            this.f3908i = Math.min(0.0f, this.f3908i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(View view) {
        D(view);
        RecyclerView.e0 e0VarI0 = this.r.i0(view);
        if (e0VarI0 == null) {
            return;
        }
        RecyclerView.e0 e0Var = this.f3902c;
        if (e0Var != null && e0VarI0 == e0Var) {
            F(null, 0);
            return;
        }
        r(e0VarI0, false);
        if (this.f3900a.remove(e0VarI0.f4855b)) {
            this.f3912m.c(this.r, e0VarI0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        float f2;
        float f3;
        this.y = -1;
        if (this.f3902c != null) {
            w(this.f3901b);
            float[] fArr = this.f3901b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.f3912m.w(canvas, recyclerView, this.f3902c, this.p, this.f3913n, f2, f3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        float f2;
        float f3;
        if (this.f3902c != null) {
            w(this.f3901b);
            float[] fArr = this.f3901b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.f3912m.x(canvas, recyclerView, this.f3902c, this.p, this.f3913n, f2, f3);
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 21) {
            return;
        }
        if (this.w == null) {
            this.w = new e();
        }
        this.r.setChildDrawingOrderCallback(this.w);
    }

    public void m(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            q();
        }
        this.r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f3905f = resources.getDimension(a.y.b.f3784f);
            this.f3906g = resources.getDimension(a.y.b.f3783e);
            G();
        }
    }

    public final int n(RecyclerView.e0 e0Var, int i2) {
        if ((i2 & 12) == 0) {
            return 0;
        }
        int i3 = this.f3907h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null && this.f3911l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f3912m.n(this.f3906g));
            float xVelocity = this.t.getXVelocity(this.f3911l);
            float yVelocity = this.t.getYVelocity(this.f3911l);
            int i4 = xVelocity <= 0.0f ? 4 : 8;
            float fAbs = Math.abs(xVelocity);
            if ((i4 & i2) != 0 && i3 == i4 && fAbs >= this.f3912m.l(this.f3905f) && fAbs > Math.abs(yVelocity)) {
                return i4;
            }
        }
        float width = this.r.getWidth() * this.f3912m.m(e0Var);
        if ((i2 & i3) == 0 || Math.abs(this.f3907h) <= width) {
            return 0;
        }
        return i3;
    }

    public void o(int i2, MotionEvent motionEvent, int i3) {
        RecyclerView.e0 e0VarV;
        int iF;
        if (this.f3902c != null || i2 != 2 || this.f3913n == 2 || !this.f3912m.q() || this.r.getScrollState() == 1 || (e0VarV = v(motionEvent)) == null || (iF = (this.f3912m.f(this.r, e0VarV) & 65280) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(i3);
        float y = motionEvent.getY(i3);
        float f2 = x - this.f3903d;
        float f3 = y - this.f3904e;
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f3);
        int i4 = this.q;
        if (fAbs >= i4 || fAbs2 >= i4) {
            if (fAbs > fAbs2) {
                if (f2 < 0.0f && (iF & 4) == 0) {
                    return;
                }
                if (f2 > 0.0f && (iF & 8) == 0) {
                    return;
                }
            } else {
                if (f3 < 0.0f && (iF & 1) == 0) {
                    return;
                }
                if (f3 > 0.0f && (iF & 2) == 0) {
                    return;
                }
            }
            this.f3908i = 0.0f;
            this.f3907h = 0.0f;
            this.f3911l = motionEvent.getPointerId(0);
            F(e0VarV, 1);
        }
    }

    public final int p(RecyclerView.e0 e0Var, int i2) {
        if ((i2 & 3) == 0) {
            return 0;
        }
        int i3 = this.f3908i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null && this.f3911l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f3912m.n(this.f3906g));
            float xVelocity = this.t.getXVelocity(this.f3911l);
            float yVelocity = this.t.getYVelocity(this.f3911l);
            int i4 = yVelocity <= 0.0f ? 1 : 2;
            float fAbs = Math.abs(yVelocity);
            if ((i4 & i2) != 0 && i4 == i3 && fAbs >= this.f3912m.l(this.f3905f) && fAbs > Math.abs(xVelocity)) {
                return i4;
            }
        }
        float height = this.r.getHeight() * this.f3912m.m(e0Var);
        if ((i2 & i3) == 0 || Math.abs(this.f3908i) <= height) {
            return 0;
        }
        return i3;
    }

    public final void q() {
        this.r.b1(this);
        this.r.d1(this.B);
        this.r.c1(this);
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(0);
            hVar.a();
            this.f3912m.c(this.r, hVar.f3930f);
        }
        this.p.clear();
        this.x = null;
        this.y = -1;
        C();
        J();
    }

    public void r(RecyclerView.e0 e0Var, boolean z) {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            if (hVar.f3930f == e0Var) {
                hVar.f3937m |= z;
                if (!hVar.f3938n) {
                    hVar.a();
                }
                this.p.remove(size);
                return;
            }
        }
    }

    public h s(MotionEvent motionEvent) {
        if (this.p.isEmpty()) {
            return null;
        }
        View viewT = t(motionEvent);
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            if (hVar.f3930f.f4855b == viewT) {
                return hVar;
            }
        }
        return null;
    }

    public View t(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.e0 e0Var = this.f3902c;
        if (e0Var != null) {
            View view = e0Var.f4855b;
            if (y(view, x, y, this.f3909j + this.f3907h, this.f3910k + this.f3908i)) {
                return view;
            }
        }
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            View view2 = hVar.f3930f.f4855b;
            if (y(view2, x, y, hVar.f3935k, hVar.f3936l)) {
                return view2;
            }
        }
        return this.r.S(x, y);
    }

    public final List<RecyclerView.e0> u(RecyclerView.e0 e0Var) {
        RecyclerView.e0 e0Var2 = e0Var;
        List<RecyclerView.e0> list = this.u;
        if (list == null) {
            this.u = new ArrayList();
            this.v = new ArrayList();
        } else {
            list.clear();
            this.v.clear();
        }
        int iH = this.f3912m.h();
        int iRound = Math.round(this.f3909j + this.f3907h) - iH;
        int iRound2 = Math.round(this.f3910k + this.f3908i) - iH;
        int i2 = iH * 2;
        int width = e0Var2.f4855b.getWidth() + iRound + i2;
        int height = e0Var2.f4855b.getHeight() + iRound2 + i2;
        int i3 = (iRound + width) / 2;
        int i4 = (iRound2 + height) / 2;
        RecyclerView.p layoutManager = this.r.getLayoutManager();
        int iL = layoutManager.L();
        int i5 = 0;
        while (i5 < iL) {
            View viewK = layoutManager.K(i5);
            if (viewK != e0Var2.f4855b && viewK.getBottom() >= iRound2 && viewK.getTop() <= height && viewK.getRight() >= iRound && viewK.getLeft() <= width) {
                RecyclerView.e0 e0VarI0 = this.r.i0(viewK);
                if (this.f3912m.a(this.r, this.f3902c, e0VarI0)) {
                    int iAbs = Math.abs(i3 - ((viewK.getLeft() + viewK.getRight()) / 2));
                    int iAbs2 = Math.abs(i4 - ((viewK.getTop() + viewK.getBottom()) / 2));
                    int i6 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.u.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size && i6 > this.v.get(i8).intValue(); i8++) {
                        i7++;
                    }
                    this.u.add(i7, e0VarI0);
                    this.v.add(i7, Integer.valueOf(i6));
                }
            }
            i5++;
            e0Var2 = e0Var;
        }
        return this.u;
    }

    public final RecyclerView.e0 v(MotionEvent motionEvent) {
        View viewT;
        RecyclerView.p layoutManager = this.r.getLayoutManager();
        int i2 = this.f3911l;
        if (i2 == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        float x = motionEvent.getX(iFindPointerIndex) - this.f3903d;
        float y = motionEvent.getY(iFindPointerIndex) - this.f3904e;
        float fAbs = Math.abs(x);
        float fAbs2 = Math.abs(y);
        int i3 = this.q;
        if (fAbs < i3 && fAbs2 < i3) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.l()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.m()) && (viewT = t(motionEvent)) != null) {
            return this.r.i0(viewT);
        }
        return null;
    }

    public final void w(float[] fArr) {
        if ((this.f3914o & 12) != 0) {
            fArr[0] = (this.f3909j + this.f3907h) - this.f3902c.f4855b.getLeft();
        } else {
            fArr[0] = this.f3902c.f4855b.getTranslationX();
        }
        if ((this.f3914o & 3) != 0) {
            fArr[1] = (this.f3910k + this.f3908i) - this.f3902c.f4855b.getTop();
        } else {
            fArr[1] = this.f3902c.f4855b.getTranslationY();
        }
    }

    public boolean x() {
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.p.get(i2).f3938n) {
                return true;
            }
        }
        return false;
    }

    public void z(RecyclerView.e0 e0Var) {
        if (!this.r.isLayoutRequested() && this.f3913n == 2) {
            float fJ = this.f3912m.j(e0Var);
            int i2 = (int) (this.f3909j + this.f3907h);
            int i3 = (int) (this.f3910k + this.f3908i);
            if (Math.abs(i3 - e0Var.f4855b.getTop()) >= e0Var.f4855b.getHeight() * fJ || Math.abs(i2 - e0Var.f4855b.getLeft()) >= e0Var.f4855b.getWidth() * fJ) {
                List<RecyclerView.e0> listU = u(e0Var);
                if (listU.size() == 0) {
                    return;
                }
                RecyclerView.e0 e0VarB = this.f3912m.b(e0Var, listU, i2, i3);
                if (e0VarB == null) {
                    this.u.clear();
                    this.v.clear();
                    return;
                }
                int iM = e0VarB.m();
                int iM2 = e0Var.m();
                if (this.f3912m.y(this.r, e0Var, e0VarB)) {
                    this.f3912m.z(this.r, e0Var, iM2, e0VarB, iM, i2, i3);
                }
            }
        }
    }
}

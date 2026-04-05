package androidx.recyclerview.widget;

import a.i.r.g0.c;
import a.y.e.a;
import a.y.e.b;
import a.y.e.e;
import a.y.e.n;
import a.y.e.r;
import a.y.e.s;
import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.facebook.ads.AdError;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements a.i.r.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4799b = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f4800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f4801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f4802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f4803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f4804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f4805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Class<?>[] f4806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Interpolator f4807j;
    public final ArrayList<t> A;
    public boolean A0;
    public t B;
    public boolean B0;
    public boolean C;
    public m.b C0;
    public boolean D;
    public boolean D0;
    public boolean E;
    public a.y.e.n E0;
    public boolean F;
    public k F0;
    public int G;
    public final int[] G0;
    public boolean H;
    public a.i.r.m H0;
    public boolean I;
    public final int[] I0;
    public boolean J;
    public final int[] J0;
    public int K;
    public final int[] K0;
    public boolean L;
    public final List<e0> L0;
    public final AccessibilityManager M;
    public Runnable M0;
    public List<r> N;
    public boolean N0;
    public boolean O;
    public int O0;
    public boolean P;
    public int P0;
    public int Q;
    public final s.b Q0;
    public int R;
    public l S;
    public EdgeEffect T;
    public EdgeEffect U;
    public EdgeEffect V;
    public EdgeEffect W;
    public m f0;
    public int g0;
    public int h0;
    public VelocityTracker i0;
    public int j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y f4808k;
    public int k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f4809l;
    public int l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z f4810m;
    public int m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a.y.e.a f4811n;
    public int n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a.y.e.b f4812o;
    public s o0;
    public final a.y.e.s p;
    public final int p0;
    public boolean q;
    public final int q0;
    public final Runnable r;
    public float r0;
    public final Rect s;
    public float s0;
    public final Rect t;
    public boolean t0;
    public final RectF u;
    public final d0 u0;
    public h v;
    public a.y.e.e v0;
    public p w;
    public e.b w0;
    public x x;
    public final b0 x0;
    public final List<x> y;
    public u y0;
    public final ArrayList<o> z;
    public List<u> z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.F || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.C) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.I) {
                recyclerView2.H = true;
            } else {
                recyclerView2.v();
            }
        }
    }

    public static abstract class a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView f4815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f4816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f4817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f4818e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f4819f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f4821h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4814a = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a f4820g = new a(0, 0);

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f4822a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f4823b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f4824c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f4825d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Interpolator f4826e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f4827f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f4828g;

            public a(int i2, int i3) {
                this(i2, i3, Integer.MIN_VALUE, null);
            }

            public a(int i2, int i3, int i4, Interpolator interpolator) {
                this.f4825d = -1;
                this.f4827f = false;
                this.f4828g = 0;
                this.f4822a = i2;
                this.f4823b = i3;
                this.f4824c = i4;
                this.f4826e = interpolator;
            }

            public boolean a() {
                return this.f4825d >= 0;
            }

            public void b(int i2) {
                this.f4825d = i2;
            }

            public void c(RecyclerView recyclerView) {
                int i2 = this.f4825d;
                if (i2 >= 0) {
                    this.f4825d = -1;
                    recyclerView.A0(i2);
                    this.f4827f = false;
                } else {
                    if (!this.f4827f) {
                        this.f4828g = 0;
                        return;
                    }
                    e();
                    recyclerView.u0.e(this.f4822a, this.f4823b, this.f4824c, this.f4826e);
                    int i3 = this.f4828g + 1;
                    this.f4828g = i3;
                    if (i3 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f4827f = false;
                }
            }

            public void d(int i2, int i3, int i4, Interpolator interpolator) {
                this.f4822a = i2;
                this.f4823b = i3;
                this.f4824c = i4;
                this.f4826e = interpolator;
                this.f4827f = true;
            }

            public final void e() {
                if (this.f4826e != null && this.f4824c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f4824c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }

        public interface b {
            PointF a(int i2);
        }

        public PointF a(int i2) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).a(i2);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i2) {
            return this.f4815b.w.E(i2);
        }

        public int c() {
            return this.f4815b.w.L();
        }

        public int d(View view) {
            return this.f4815b.h0(view);
        }

        public p e() {
            return this.f4816c;
        }

        public int f() {
            return this.f4814a;
        }

        public boolean g() {
            return this.f4817d;
        }

        public boolean h() {
            return this.f4818e;
        }

        public void i(PointF pointF) {
            float f2 = pointF.x;
            float f3 = pointF.y;
            float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void j(int i2, int i3) {
            PointF pointFA;
            RecyclerView recyclerView = this.f4815b;
            if (this.f4814a == -1 || recyclerView == null) {
                r();
            }
            if (this.f4817d && this.f4819f == null && this.f4816c != null && (pointFA = a(this.f4814a)) != null) {
                float f2 = pointFA.x;
                if (f2 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.m1((int) Math.signum(f2), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f4817d = false;
            View view = this.f4819f;
            if (view != null) {
                if (d(view) == this.f4814a) {
                    o(this.f4819f, recyclerView.x0, this.f4820g);
                    this.f4820g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f4819f = null;
                }
            }
            if (this.f4818e) {
                l(i2, i3, recyclerView.x0, this.f4820g);
                boolean zA = this.f4820g.a();
                this.f4820g.c(recyclerView);
                if (zA && this.f4818e) {
                    this.f4817d = true;
                    recyclerView.u0.d();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f4819f = view;
            }
        }

        public abstract void l(int i2, int i3, b0 b0Var, a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(View view, b0 b0Var, a aVar);

        public void p(int i2) {
            this.f4814a = i2;
        }

        public void q(RecyclerView recyclerView, p pVar) {
            recyclerView.u0.f();
            if (this.f4821h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f4815b = recyclerView;
            this.f4816c = pVar;
            int i2 = this.f4814a;
            if (i2 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.x0.f4830a = i2;
            this.f4818e = true;
            this.f4817d = true;
            this.f4819f = b(f());
            m();
            this.f4815b.u0.d();
            this.f4821h = true;
        }

        public final void r() {
            if (this.f4818e) {
                this.f4818e = false;
                n();
                this.f4815b.x0.f4830a = -1;
                this.f4819f = null;
                this.f4814a = -1;
                this.f4817d = false;
                this.f4816c.i1(this);
                this.f4816c = null;
                this.f4815b = null;
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.f0;
            if (mVar != null) {
                mVar.v();
            }
            RecyclerView.this.D0 = false;
        }
    }

    public static class b0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray<Object> f4831b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f4842m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f4843n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f4844o;
        public int p;
        public int q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4830a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4832c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4833d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4834e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4835f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f4836g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f4837h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f4838i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f4839j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f4840k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f4841l = false;

        public void a(int i2) {
            if ((this.f4834e & i2) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f4834e));
        }

        public boolean b() {
            return this.f4836g;
        }

        public int c() {
            return this.f4837h ? this.f4832c - this.f4833d : this.f4835f;
        }

        public int d() {
            return this.p;
        }

        public int e() {
            return this.q;
        }

        public int f() {
            return this.f4830a;
        }

        public boolean g() {
            return this.f4830a != -1;
        }

        public boolean h() {
            return this.f4837h;
        }

        public void i(h hVar) {
            this.f4834e = 1;
            this.f4835f = hVar.o();
            this.f4837h = false;
            this.f4838i = false;
            this.f4839j = false;
        }

        public boolean j() {
            return this.f4841l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4830a + ", mData=" + this.f4831b + ", mItemCount=" + this.f4835f + ", mIsMeasuring=" + this.f4839j + ", mPreviousLayoutItemCount=" + this.f4832c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4833d + ", mStructureChanged=" + this.f4836g + ", mInPreLayout=" + this.f4837h + ", mRunSimpleAnimations=" + this.f4840k + ", mRunPredictiveAnimations=" + this.f4841l + '}';
        }
    }

    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    public static abstract class c0 {
    }

    public class d implements s.b {
        public d() {
        }

        @Override // a.y.e.s.b
        public void a(e0 e0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.w.p1(e0Var.f4855b, recyclerView.f4809l);
        }

        @Override // a.y.e.s.b
        public void b(e0 e0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.m(e0Var, cVar, cVar2);
        }

        @Override // a.y.e.s.b
        public void c(e0 e0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.f4809l.J(e0Var);
            RecyclerView.this.o(e0Var, cVar, cVar2);
        }

        @Override // a.y.e.s.b
        public void d(e0 e0Var, m.c cVar, m.c cVar2) {
            e0Var.L(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.O;
            m mVar = recyclerView.f0;
            if (z) {
                if (!mVar.b(e0Var, e0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!mVar.d(e0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.R0();
        }
    }

    public class d0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public OverScroller f4848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Interpolator f4849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f4850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f4851g;

        public d0() {
            Interpolator interpolator = RecyclerView.f4807j;
            this.f4849e = interpolator;
            this.f4850f = false;
            this.f4851g = false;
            this.f4848d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i2, int i3) {
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(i3);
            boolean z = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), AdError.SERVER_ERROR_CODE);
        }

        public void b(int i2, int i3) {
            RecyclerView.this.setScrollState(2);
            this.f4847c = 0;
            this.f4846b = 0;
            Interpolator interpolator = this.f4849e;
            Interpolator interpolator2 = RecyclerView.f4807j;
            if (interpolator != interpolator2) {
                this.f4849e = interpolator2;
                this.f4848d = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f4848d.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        public final void c() {
            RecyclerView.this.removeCallbacks(this);
            a.i.r.x.h0(RecyclerView.this, this);
        }

        public void d() {
            if (this.f4850f) {
                this.f4851g = true;
            } else {
                c();
            }
        }

        public void e(int i2, int i3, int i4, Interpolator interpolator) {
            if (i4 == Integer.MIN_VALUE) {
                i4 = a(i2, i3);
            }
            int i5 = i4;
            if (interpolator == null) {
                interpolator = RecyclerView.f4807j;
            }
            if (this.f4849e != interpolator) {
                this.f4849e = interpolator;
                this.f4848d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4847c = 0;
            this.f4846b = 0;
            RecyclerView.this.setScrollState(2);
            this.f4848d.startScroll(0, 0, i2, i3, i5);
            if (Build.VERSION.SDK_INT < 23) {
                this.f4848d.computeScrollOffset();
            }
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f4848d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.w == null) {
                f();
                return;
            }
            this.f4851g = false;
            this.f4850f = true;
            recyclerView.v();
            OverScroller overScroller = this.f4848d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f4846b;
                int i5 = currY - this.f4847c;
                this.f4846b = currX;
                this.f4847c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.K0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.G(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.K0;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.u(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.v != null) {
                    int[] iArr3 = recyclerView3.K0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m1(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.K0;
                    i3 = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i3;
                    i5 -= i2;
                    a0 a0Var = recyclerView4.w.f4891g;
                    if (a0Var != null && !a0Var.g() && a0Var.h()) {
                        int iC = RecyclerView.this.x0.c();
                        if (iC == 0) {
                            a0Var.r();
                        } else {
                            if (a0Var.f() >= iC) {
                                a0Var.p(iC - 1);
                            }
                            a0Var.j(i3, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                if (!RecyclerView.this.z.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.K0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.H(i3, i2, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.K0;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i3 != 0 || i2 != 0) {
                    recyclerView6.J(i3, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                a0 a0Var2 = RecyclerView.this.w.f4891g;
                if ((a0Var2 != null && a0Var2.g()) || !z) {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    a.y.e.e eVar = recyclerView7.v0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i3, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i8, currVelocity);
                    }
                    if (RecyclerView.f4803f) {
                        RecyclerView.this.w0.b();
                    }
                }
            }
            a0 a0Var3 = RecyclerView.this.w.f4891g;
            if (a0Var3 != null && a0Var3.g()) {
                a0Var3.j(0, 0);
            }
            this.f4850f = false;
            if (this.f4851g) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.z1(1);
            }
        }
    }

    public class e implements b.InterfaceC0089b {
        public e() {
        }

        @Override // a.y.e.b.InterfaceC0089b
        public View a(int i2) {
            return RecyclerView.this.getChildAt(i2);
        }

        @Override // a.y.e.b.InterfaceC0089b
        public void addView(View view, int i2) {
            RecyclerView.this.addView(view, i2);
            RecyclerView.this.z(view);
        }

        @Override // a.y.e.b.InterfaceC0089b
        public void b(View view) {
            e0 e0VarJ0 = RecyclerView.j0(view);
            if (e0VarJ0 != null) {
                e0VarJ0.G(RecyclerView.this);
            }
        }

        @Override // a.y.e.b.InterfaceC0089b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // a.y.e.b.InterfaceC0089b
        public void d() {
            int iC = c();
            for (int i2 = 0; i2 < iC; i2++) {
                View viewA = a(i2);
                RecyclerView.this.A(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // a.y.e.b.InterfaceC0089b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // a.y.e.b.InterfaceC0089b
        public e0 f(View view) {
            return RecyclerView.j0(view);
        }

        @Override // a.y.e.b.InterfaceC0089b
        public void g(int i2) {
            e0 e0VarJ0;
            View viewA = a(i2);
            if (viewA != null && (e0VarJ0 = RecyclerView.j0(viewA)) != null) {
                if (e0VarJ0.C() && !e0VarJ0.O()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + e0VarJ0 + RecyclerView.this.Q());
                }
                e0VarJ0.e(256);
            }
            RecyclerView.this.detachViewFromParent(i2);
        }

        @Override // a.y.e.b.InterfaceC0089b
        public void h(View view) {
            e0 e0VarJ0 = RecyclerView.j0(view);
            if (e0VarJ0 != null) {
                e0VarJ0.H(RecyclerView.this);
            }
        }

        @Override // a.y.e.b.InterfaceC0089b
        public void i(int i2) {
            View childAt = RecyclerView.this.getChildAt(i2);
            if (childAt != null) {
                RecyclerView.this.A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i2);
        }

        @Override // a.y.e.b.InterfaceC0089b
        public void j(View view, int i2, ViewGroup.LayoutParams layoutParams) {
            e0 e0VarJ0 = RecyclerView.j0(view);
            if (e0VarJ0 != null) {
                if (!e0VarJ0.C() && !e0VarJ0.O()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + e0VarJ0 + RecyclerView.this.Q());
                }
                e0VarJ0.i();
            }
            RecyclerView.this.attachViewToParent(view, i2, layoutParams);
        }
    }

    public static abstract class e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final List<Object> f4854a = Collections.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f4855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WeakReference<RecyclerView> f4856c;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f4864k;
        public RecyclerView s;
        public h<? extends e0> t;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4857d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4858e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f4859f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4860g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4861h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public e0 f4862i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public e0 f4863j = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List<Object> f4865l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List<Object> f4866m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f4867n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public w f4868o = null;
        public boolean p = false;
        public int q = 0;
        public int r = -1;

        public e0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f4855b = view;
        }

        public boolean A() {
            return (this.f4864k & 8) != 0;
        }

        public boolean B() {
            return this.f4868o != null;
        }

        public boolean C() {
            return (this.f4864k & 256) != 0;
        }

        public boolean D() {
            return (this.f4864k & 2) != 0;
        }

        public boolean E() {
            return (this.f4864k & 2) != 0;
        }

        public void F(int i2, boolean z) {
            if (this.f4858e == -1) {
                this.f4858e = this.f4857d;
            }
            if (this.f4861h == -1) {
                this.f4861h = this.f4857d;
            }
            if (z) {
                this.f4861h += i2;
            }
            this.f4857d += i2;
            if (this.f4855b.getLayoutParams() != null) {
                ((q) this.f4855b.getLayoutParams()).f4908c = true;
            }
        }

        public void G(RecyclerView recyclerView) {
            int iA = this.r;
            if (iA == -1) {
                iA = a.i.r.x.A(this.f4855b);
            }
            this.q = iA;
            recyclerView.p1(this, 4);
        }

        public void H(RecyclerView recyclerView) {
            recyclerView.p1(this, this.q);
            this.q = 0;
        }

        public void I() {
            this.f4864k = 0;
            this.f4857d = -1;
            this.f4858e = -1;
            this.f4859f = -1L;
            this.f4861h = -1;
            this.f4867n = 0;
            this.f4862i = null;
            this.f4863j = null;
            g();
            this.q = 0;
            this.r = -1;
            RecyclerView.s(this);
        }

        public void J() {
            if (this.f4858e == -1) {
                this.f4858e = this.f4857d;
            }
        }

        public void K(int i2, int i3) {
            this.f4864k = (i2 & i3) | (this.f4864k & (i3 ^ (-1)));
        }

        public final void L(boolean z) {
            int i2;
            int i3 = this.f4867n;
            int i4 = z ? i3 - 1 : i3 + 1;
            this.f4867n = i4;
            if (i4 < 0) {
                this.f4867n = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i4 == 1) {
                i2 = this.f4864k | 16;
            } else if (!z || i4 != 0) {
                return;
            } else {
                i2 = this.f4864k & (-17);
            }
            this.f4864k = i2;
        }

        public void M(w wVar, boolean z) {
            this.f4868o = wVar;
            this.p = z;
        }

        public boolean N() {
            return (this.f4864k & 16) != 0;
        }

        public boolean O() {
            return (this.f4864k & 128) != 0;
        }

        public void P() {
            this.f4868o.J(this);
        }

        public boolean Q() {
            return (this.f4864k & 32) != 0;
        }

        public void d(Object obj) {
            if (obj == null) {
                e(1024);
            } else if ((1024 & this.f4864k) == 0) {
                j();
                this.f4865l.add(obj);
            }
        }

        public void e(int i2) {
            this.f4864k = i2 | this.f4864k;
        }

        public void f() {
            this.f4858e = -1;
            this.f4861h = -1;
        }

        public void g() {
            List<Object> list = this.f4865l;
            if (list != null) {
                list.clear();
            }
            this.f4864k &= -1025;
        }

        public void h() {
            this.f4864k &= -33;
        }

        public void i() {
            this.f4864k &= -257;
        }

        public final void j() {
            if (this.f4865l == null) {
                ArrayList arrayList = new ArrayList();
                this.f4865l = arrayList;
                this.f4866m = Collections.unmodifiableList(arrayList);
            }
        }

        public boolean k() {
            return (this.f4864k & 16) == 0 && a.i.r.x.R(this.f4855b);
        }

        public void l(int i2, int i3, boolean z) {
            e(8);
            F(i3, z);
            this.f4857d = i2;
        }

        public final int m() {
            RecyclerView recyclerView = this.s;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.e0(this);
        }

        @Deprecated
        public final int n() {
            return o();
        }

        public final int o() {
            RecyclerView recyclerView;
            h adapter;
            int iE0;
            if (this.t == null || (recyclerView = this.s) == null || (adapter = recyclerView.getAdapter()) == null || (iE0 = this.s.e0(this)) == -1) {
                return -1;
            }
            return adapter.l(this.t, this, iE0);
        }

        public final long p() {
            return this.f4859f;
        }

        public final int q() {
            return this.f4860g;
        }

        public final int r() {
            int i2 = this.f4861h;
            return i2 == -1 ? this.f4857d : i2;
        }

        public final int s() {
            return this.f4858e;
        }

        public List<Object> t() {
            if ((this.f4864k & 1024) != 0) {
                return f4854a;
            }
            List<Object> list = this.f4865l;
            return (list == null || list.size() == 0) ? f4854a : this.f4866m;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f4857d + " id=" + this.f4859f + ", oldPos=" + this.f4858e + ", pLpos:" + this.f4861h);
            if (B()) {
                sb.append(" scrap ");
                sb.append(this.p ? "[changeScrap]" : "[attachedScrap]");
            }
            if (y()) {
                sb.append(" invalid");
            }
            if (!x()) {
                sb.append(" unbound");
            }
            if (E()) {
                sb.append(" update");
            }
            if (A()) {
                sb.append(" removed");
            }
            if (O()) {
                sb.append(" ignored");
            }
            if (C()) {
                sb.append(" tmpDetached");
            }
            if (!z()) {
                sb.append(" not recyclable(" + this.f4867n + ")");
            }
            if (v()) {
                sb.append(" undefined adapter position");
            }
            if (this.f4855b.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public boolean u(int i2) {
            return (i2 & this.f4864k) != 0;
        }

        public boolean v() {
            return (this.f4864k & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0 || y();
        }

        public boolean w() {
            return (this.f4855b.getParent() == null || this.f4855b.getParent() == this.s) ? false : true;
        }

        public boolean x() {
            return (this.f4864k & 1) != 0;
        }

        public boolean y() {
            return (this.f4864k & 4) != 0;
        }

        public final boolean z() {
            return (this.f4864k & 16) == 0 && !a.i.r.x.R(this.f4855b);
        }
    }

    public class f implements a.InterfaceC0088a {
        public f() {
        }

        @Override // a.y.e.a.InterfaceC0088a
        public void a(int i2, int i3) {
            RecyclerView.this.H0(i2, i3);
            RecyclerView.this.A0 = true;
        }

        @Override // a.y.e.a.InterfaceC0088a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // a.y.e.a.InterfaceC0088a
        public void c(int i2, int i3, Object obj) {
            RecyclerView.this.C1(i2, i3, obj);
            RecyclerView.this.B0 = true;
        }

        @Override // a.y.e.a.InterfaceC0088a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // a.y.e.a.InterfaceC0088a
        public e0 e(int i2) {
            e0 e0VarC0 = RecyclerView.this.c0(i2, true);
            if (e0VarC0 == null || RecyclerView.this.f4812o.n(e0VarC0.f4855b)) {
                return null;
            }
            return e0VarC0;
        }

        @Override // a.y.e.a.InterfaceC0088a
        public void f(int i2, int i3) {
            RecyclerView.this.I0(i2, i3, false);
            RecyclerView.this.A0 = true;
        }

        @Override // a.y.e.a.InterfaceC0088a
        public void g(int i2, int i3) {
            RecyclerView.this.G0(i2, i3);
            RecyclerView.this.A0 = true;
        }

        @Override // a.y.e.a.InterfaceC0088a
        public void h(int i2, int i3) {
            RecyclerView.this.I0(i2, i3, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.A0 = true;
            recyclerView.x0.f4833d += i3;
        }

        public void i(a.b bVar) {
            int i2 = bVar.f3809a;
            if (i2 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.w.U0(recyclerView, bVar.f3810b, bVar.f3812d);
                return;
            }
            if (i2 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.w.X0(recyclerView2, bVar.f3810b, bVar.f3812d);
            } else if (i2 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.w.Z0(recyclerView3, bVar.f3810b, bVar.f3812d, bVar.f3811c);
            } else {
                if (i2 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.w.W0(recyclerView4, bVar.f3810b, bVar.f3812d, 1);
            }
        }
    }

    public static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4870a;

        static {
            int[] iArr = new int[h.a.values().length];
            f4870a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4870a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class h<VH extends e0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f4871b = new i();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4872c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f4873d = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void B(int i2, int i3) {
            this.f4871b.d(i2, i3);
        }

        public final void C(int i2) {
            this.f4871b.f(i2, 1);
        }

        public void E(RecyclerView recyclerView) {
        }

        public abstract void F(VH vh, int i2);

        public void G(VH vh, int i2, List<Object> list) {
            F(vh, i2);
        }

        public abstract VH H(ViewGroup viewGroup, int i2);

        public void J(RecyclerView recyclerView) {
        }

        public boolean K(VH vh) {
            return false;
        }

        public void N(VH vh) {
        }

        public void P(VH vh) {
        }

        public void Q(VH vh) {
        }

        public void R(j jVar) {
            this.f4871b.registerObserver(jVar);
        }

        public void S(boolean z) {
            if (u()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f4872c = z;
        }

        public void V(j jVar) {
            this.f4871b.unregisterObserver(jVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void i(VH vh, int i2) {
            boolean z = vh.t == null;
            if (z) {
                vh.f4857d = i2;
                if (v()) {
                    vh.f4859f = q(i2);
                }
                vh.K(1, 519);
                a.i.n.i.a("RV OnBindView");
            }
            vh.t = this;
            G(vh, i2, vh.t());
            if (z) {
                vh.g();
                ViewGroup.LayoutParams layoutParams = vh.f4855b.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f4908c = true;
                }
                a.i.n.i.b();
            }
        }

        public boolean j() {
            int i2 = g.f4870a[this.f4873d.ordinal()];
            if (i2 != 1) {
                return i2 != 2 || o() > 0;
            }
            return false;
        }

        public final VH k(ViewGroup viewGroup, int i2) {
            try {
                a.i.n.i.a("RV CreateView");
                VH vh = (VH) H(viewGroup, i2);
                if (vh.f4855b.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.f4860g = i2;
                return vh;
            } finally {
                a.i.n.i.b();
            }
        }

        public int l(h<? extends e0> hVar, e0 e0Var, int i2) {
            if (hVar == this) {
                return i2;
            }
            return -1;
        }

        public abstract int o();

        public long q(int i2) {
            return -1L;
        }

        public int r(int i2) {
            return 0;
        }

        public final boolean u() {
            return this.f4871b.a();
        }

        public final boolean v() {
            return this.f4872c;
        }

        public final void w() {
            this.f4871b.b();
        }

        public final void y(int i2) {
            this.f4871b.d(i2, 1);
        }

        public final void z(int i2, int i3) {
            this.f4871b.c(i2, i3);
        }
    }

    public static class i extends Observable<j> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i2, i3, 1);
            }
        }

        public void d(int i2, int i3) {
            e(i2, i3, null);
        }

        public void e(int i2, int i3, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i2, i3, obj);
            }
        }

        public void f(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i2, i3);
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void b(int i2, int i3) {
        }

        public void c(int i2, int i3, Object obj) {
            b(i2, i3);
        }

        public void d(int i2, int i3, int i4) {
        }

        public void e(int i2, int i3) {
        }
    }

    public interface k {
        int a(int i2, int i3);
    }

    public static class l {
        public EdgeEffect a(RecyclerView recyclerView, int i2) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f4874a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<a> f4875b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f4876c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f4877d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f4878e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f4879f = 250;

        public interface a {
            void a();
        }

        public interface b {
            void a(e0 e0Var);
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f4880a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f4881b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f4882c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f4883d;

            public c a(e0 e0Var) {
                return b(e0Var, 0);
            }

            public c b(e0 e0Var, int i2) {
                View view = e0Var.f4855b;
                this.f4880a = view.getLeft();
                this.f4881b = view.getTop();
                this.f4882c = view.getRight();
                this.f4883d = view.getBottom();
                return this;
            }
        }

        public static int e(e0 e0Var) {
            int i2 = e0Var.f4864k & 14;
            if (e0Var.y()) {
                return 4;
            }
            if ((i2 & 4) != 0) {
                return i2;
            }
            int iS = e0Var.s();
            int iM = e0Var.m();
            return (iS == -1 || iM == -1 || iS == iM) ? i2 : i2 | 2048;
        }

        public abstract boolean a(e0 e0Var, c cVar, c cVar2);

        public abstract boolean b(e0 e0Var, e0 e0Var2, c cVar, c cVar2);

        public abstract boolean c(e0 e0Var, c cVar, c cVar2);

        public abstract boolean d(e0 e0Var, c cVar, c cVar2);

        public abstract boolean f(e0 e0Var);

        public boolean g(e0 e0Var, List<Object> list) {
            return f(e0Var);
        }

        public final void h(e0 e0Var) {
            s(e0Var);
            b bVar = this.f4874a;
            if (bVar != null) {
                bVar.a(e0Var);
            }
        }

        public final void i() {
            int size = this.f4875b.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f4875b.get(i2).a();
            }
            this.f4875b.clear();
        }

        public abstract void j(e0 e0Var);

        public abstract void k();

        public long l() {
            return this.f4876c;
        }

        public long m() {
            return this.f4879f;
        }

        public long n() {
            return this.f4878e;
        }

        public long o() {
            return this.f4877d;
        }

        public abstract boolean p();

        public final boolean q(a aVar) {
            boolean zP = p();
            if (aVar != null) {
                if (zP) {
                    this.f4875b.add(aVar);
                } else {
                    aVar.a();
                }
            }
            return zP;
        }

        public c r() {
            return new c();
        }

        public void s(e0 e0Var) {
        }

        public c t(b0 b0Var, e0 e0Var) {
            return r().a(e0Var);
        }

        public c u(b0 b0Var, e0 e0Var, int i2, List<Object> list) {
            return r().a(e0Var);
        }

        public abstract void v();

        public void w(b bVar) {
            this.f4874a = bVar;
        }
    }

    public class n implements m.b {
        public n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(e0 e0Var) {
            e0Var.L(true);
            if (e0Var.f4862i != null && e0Var.f4863j == null) {
                e0Var.f4862i = null;
            }
            e0Var.f4863j = null;
            if (e0Var.N() || RecyclerView.this.a1(e0Var.f4855b) || !e0Var.C()) {
                return;
            }
            RecyclerView.this.removeDetachedView(e0Var.f4855b, false);
        }
    }

    public static abstract class o {
        @Deprecated
        public void f(Rect rect, int i2, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void g(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
            f(rect, ((q) view.getLayoutParams()).b(), recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            h(canvas, recyclerView);
        }

        @Deprecated
        public void j(Canvas canvas, RecyclerView recyclerView) {
        }

        public void k(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            j(canvas, recyclerView);
        }
    }

    public static abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a.y.e.b f4885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView f4886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r.b f4887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r.b f4888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a.y.e.r f4889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public a.y.e.r f4890f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public a0 f4891g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f4892h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f4893i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f4894j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f4895k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f4896l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f4897m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f4898n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f4899o;
        public int p;
        public int q;
        public int r;

        public class a implements r.b {
            public a() {
            }

            @Override // a.y.e.r.b
            public View a(int i2) {
                return p.this.K(i2);
            }

            @Override // a.y.e.r.b
            public int b(View view) {
                return p.this.S(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // a.y.e.r.b
            public int c() {
                return p.this.g0();
            }

            @Override // a.y.e.r.b
            public int d() {
                return p.this.q0() - p.this.h0();
            }

            @Override // a.y.e.r.b
            public int e(View view) {
                return p.this.V(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements r.b {
            public b() {
            }

            @Override // a.y.e.r.b
            public View a(int i2) {
                return p.this.K(i2);
            }

            @Override // a.y.e.r.b
            public int b(View view) {
                return p.this.W(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // a.y.e.r.b
            public int c() {
                return p.this.i0();
            }

            @Override // a.y.e.r.b
            public int d() {
                return p.this.Y() - p.this.f0();
            }

            @Override // a.y.e.r.b
            public int e(View view) {
                return p.this.Q(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i2, int i3);
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f4902a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f4903b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f4904c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f4905d;
        }

        public p() {
            a aVar = new a();
            this.f4887c = aVar;
            b bVar = new b();
            this.f4888d = bVar;
            this.f4889e = new a.y.e.r(aVar);
            this.f4890f = new a.y.e.r(bVar);
            this.f4892h = false;
            this.f4893i = false;
            this.f4894j = false;
            this.f4895k = true;
            this.f4896l = true;
        }

        public static int M(int i2, int i3, int i4, int i5, boolean z) {
            int iMax = Math.max(0, i2 - i4);
            if (z) {
                if (i5 < 0) {
                    if (i5 != -1 || (i3 != Integer.MIN_VALUE && (i3 == 0 || i3 != 1073741824))) {
                        i3 = 0;
                        i5 = 0;
                    } else {
                        i5 = iMax;
                    }
                }
                i3 = 1073741824;
            } else {
                if (i5 < 0) {
                    if (i5 != -1) {
                        if (i5 == -2) {
                            i3 = (i3 == Integer.MIN_VALUE || i3 == 1073741824) ? Integer.MIN_VALUE : 0;
                        }
                        i3 = 0;
                        i5 = 0;
                    }
                    i5 = iMax;
                }
                i3 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i5, i3);
        }

        public static d k0(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.y.d.f3791f, i2, i3);
            dVar.f4902a = typedArrayObtainStyledAttributes.getInt(a.y.d.f3792g, 1);
            dVar.f4903b = typedArrayObtainStyledAttributes.getInt(a.y.d.q, 1);
            dVar.f4904c = typedArrayObtainStyledAttributes.getBoolean(a.y.d.p, false);
            dVar.f4905d = typedArrayObtainStyledAttributes.getBoolean(a.y.d.r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int o(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        public static boolean z0(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        public final void A(int i2, View view) {
            this.f4885a.d(i2);
        }

        public boolean A0() {
            a0 a0Var = this.f4891g;
            return a0Var != null && a0Var.h();
        }

        public void A1(int i2) {
        }

        public void B(RecyclerView recyclerView) {
            this.f4893i = true;
            J0(recyclerView);
        }

        public boolean B0(View view, boolean z, boolean z2) {
            boolean z3 = this.f4889e.b(view, 24579) && this.f4890f.b(view, 24579);
            return z ? z3 : !z3;
        }

        public int B1(int i2, w wVar, b0 b0Var) {
            return 0;
        }

        public void C(RecyclerView recyclerView, w wVar) {
            this.f4893i = false;
            L0(recyclerView, wVar);
        }

        public void C0(View view, int i2, int i3, int i4, int i5) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f4907b;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public void C1(RecyclerView recyclerView) {
            E1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public View D(View view) {
            View viewT;
            RecyclerView recyclerView = this.f4886b;
            if (recyclerView == null || (viewT = recyclerView.T(view)) == null || this.f4885a.n(viewT)) {
                return null;
            }
            return viewT;
        }

        public void D0(View view, int i2, int i3) {
            q qVar = (q) view.getLayoutParams();
            Rect rectN0 = this.f4886b.n0(view);
            int i4 = i2 + rectN0.left + rectN0.right;
            int i5 = i3 + rectN0.top + rectN0.bottom;
            int iM = M(q0(), r0(), g0() + h0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i4, ((ViewGroup.MarginLayoutParams) qVar).width, l());
            int iM2 = M(Y(), Z(), i0() + f0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) qVar).height, m());
            if (J1(view, iM, iM2, qVar)) {
                view.measure(iM, iM2);
            }
        }

        public final void D1(boolean z) {
            if (z != this.f4896l) {
                this.f4896l = z;
                this.f4897m = 0;
                RecyclerView recyclerView = this.f4886b;
                if (recyclerView != null) {
                    recyclerView.f4809l.K();
                }
            }
        }

        public View E(int i2) {
            int iL = L();
            for (int i3 = 0; i3 < iL; i3++) {
                View viewK = K(i3);
                e0 e0VarJ0 = RecyclerView.j0(viewK);
                if (e0VarJ0 != null && e0VarJ0.r() == i2 && !e0VarJ0.O() && (this.f4886b.x0.h() || !e0VarJ0.A())) {
                    return viewK;
                }
            }
            return null;
        }

        public void E0(int i2, int i3) {
            View viewK = K(i2);
            if (viewK != null) {
                z(i2);
                i(viewK, i3);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + this.f4886b.toString());
            }
        }

        public void E1(int i2, int i3) {
            this.q = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.f4899o = mode;
            if (mode == 0 && !RecyclerView.f4801d) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.p = mode2;
            if (mode2 != 0 || RecyclerView.f4801d) {
                return;
            }
            this.r = 0;
        }

        public abstract q F();

        public void F0(int i2) {
            RecyclerView recyclerView = this.f4886b;
            if (recyclerView != null) {
                recyclerView.E0(i2);
            }
        }

        public void F1(int i2, int i3) {
            this.f4886b.setMeasuredDimension(i2, i3);
        }

        public q G(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void G0(int i2) {
            RecyclerView recyclerView = this.f4886b;
            if (recyclerView != null) {
                recyclerView.F0(i2);
            }
        }

        public void G1(Rect rect, int i2, int i3) {
            F1(o(i2, rect.width() + g0() + h0(), e0()), o(i3, rect.height() + i0() + f0(), d0()));
        }

        public q H(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public void H0(h hVar, h hVar2) {
        }

        public void H1(int i2, int i3) {
            int iL = L();
            if (iL == 0) {
                this.f4886b.x(i2, i3);
                return;
            }
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < iL; i8++) {
                View viewK = K(i8);
                Rect rect = this.f4886b.s;
                R(viewK, rect);
                int i9 = rect.left;
                if (i9 < i6) {
                    i6 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i7) {
                    i7 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i5) {
                    i5 = i12;
                }
            }
            this.f4886b.s.set(i6, i7, i4, i5);
            G1(this.f4886b.s, i2, i3);
        }

        public int I() {
            return -1;
        }

        public boolean I0(RecyclerView recyclerView, ArrayList<View> arrayList, int i2, int i3) {
            return false;
        }

        public void I1(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f4886b = null;
                this.f4885a = null;
                height = 0;
                this.q = 0;
            } else {
                this.f4886b = recyclerView;
                this.f4885a = recyclerView.f4812o;
                this.q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.r = height;
            this.f4899o = 1073741824;
            this.p = 1073741824;
        }

        public int J(View view) {
            return ((q) view.getLayoutParams()).f4907b.bottom;
        }

        public void J0(RecyclerView recyclerView) {
        }

        public boolean J1(View view, int i2, int i3, q qVar) {
            return (!view.isLayoutRequested() && this.f4895k && z0(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) qVar).width) && z0(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public View K(int i2) {
            a.y.e.b bVar = this.f4885a;
            if (bVar != null) {
                return bVar.f(i2);
            }
            return null;
        }

        @Deprecated
        public void K0(RecyclerView recyclerView) {
        }

        public boolean K1() {
            return false;
        }

        public int L() {
            a.y.e.b bVar = this.f4885a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void L0(RecyclerView recyclerView, w wVar) {
            K0(recyclerView);
        }

        public boolean L1(View view, int i2, int i3, q qVar) {
            return (this.f4895k && z0(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) qVar).width) && z0(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public View M0(View view, int i2, w wVar, b0 b0Var) {
            return null;
        }

        public void M1(RecyclerView recyclerView, b0 b0Var, int i2) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final int[] N(View view, Rect rect) {
            int[] iArr = new int[2];
            int iG0 = g0();
            int iI0 = i0();
            int iQ0 = q0() - h0();
            int iY = Y() - f0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i2 = left - iG0;
            int iMin = Math.min(0, i2);
            int i3 = top - iI0;
            int iMin2 = Math.min(0, i3);
            int i4 = iWidth - iQ0;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, iHeight - iY);
            if (b0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i2, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i4);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i3, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        public void N0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4886b;
            O0(recyclerView.f4809l, recyclerView.x0, accessibilityEvent);
        }

        public void N1(a0 a0Var) {
            a0 a0Var2 = this.f4891g;
            if (a0Var2 != null && a0Var != a0Var2 && a0Var2.h()) {
                this.f4891g.r();
            }
            this.f4891g = a0Var;
            a0Var.q(this.f4886b, this);
        }

        public boolean O() {
            RecyclerView recyclerView = this.f4886b;
            return recyclerView != null && recyclerView.q;
        }

        public void O0(w wVar, b0 b0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4886b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f4886b.canScrollVertically(-1) && !this.f4886b.canScrollHorizontally(-1) && !this.f4886b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            h hVar = this.f4886b.v;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.o());
            }
        }

        public void O1() {
            a0 a0Var = this.f4891g;
            if (a0Var != null) {
                a0Var.r();
            }
        }

        public int P(w wVar, b0 b0Var) {
            return -1;
        }

        public void P0(a.i.r.g0.c cVar) {
            RecyclerView recyclerView = this.f4886b;
            Q0(recyclerView.f4809l, recyclerView.x0, cVar);
        }

        public boolean P1() {
            return false;
        }

        public int Q(View view) {
            return view.getBottom() + J(view);
        }

        public void Q0(w wVar, b0 b0Var, a.i.r.g0.c cVar) {
            if (this.f4886b.canScrollVertically(-1) || this.f4886b.canScrollHorizontally(-1)) {
                cVar.a(8192);
                cVar.p0(true);
            }
            if (this.f4886b.canScrollVertically(1) || this.f4886b.canScrollHorizontally(1)) {
                cVar.a(ProgressEvent.PART_FAILED_EVENT_CODE);
                cVar.p0(true);
            }
            cVar.Z(c.b.a(m0(wVar, b0Var), P(wVar, b0Var), y0(wVar, b0Var), n0(wVar, b0Var)));
        }

        public void R(View view, Rect rect) {
            RecyclerView.k0(view, rect);
        }

        public void R0(View view, a.i.r.g0.c cVar) {
            e0 e0VarJ0 = RecyclerView.j0(view);
            if (e0VarJ0 == null || e0VarJ0.A() || this.f4885a.n(e0VarJ0.f4855b)) {
                return;
            }
            RecyclerView recyclerView = this.f4886b;
            S0(recyclerView.f4809l, recyclerView.x0, view, cVar);
        }

        public int S(View view) {
            return view.getLeft() - c0(view);
        }

        public void S0(w wVar, b0 b0Var, View view, a.i.r.g0.c cVar) {
        }

        public int T(View view) {
            Rect rect = ((q) view.getLayoutParams()).f4907b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public View T0(View view, int i2) {
            return null;
        }

        public int U(View view) {
            Rect rect = ((q) view.getLayoutParams()).f4907b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void U0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int V(View view) {
            return view.getRight() + l0(view);
        }

        public void V0(RecyclerView recyclerView) {
        }

        public int W(View view) {
            return view.getTop() - o0(view);
        }

        public void W0(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public View X() {
            View focusedChild;
            RecyclerView recyclerView = this.f4886b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4885a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void X0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int Y() {
            return this.r;
        }

        public void Y0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int Z() {
            return this.p;
        }

        public void Z0(RecyclerView recyclerView, int i2, int i3, Object obj) {
            Y0(recyclerView, i2, i3);
        }

        public int a0() {
            RecyclerView recyclerView = this.f4886b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.o();
            }
            return 0;
        }

        public void a1(w wVar, b0 b0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int b0() {
            return a.i.r.x.C(this.f4886b);
        }

        public void b1(b0 b0Var) {
        }

        public void c(View view) {
            d(view, -1);
        }

        public int c0(View view) {
            return ((q) view.getLayoutParams()).f4907b.left;
        }

        public void c1(w wVar, b0 b0Var, int i2, int i3) {
            this.f4886b.x(i2, i3);
        }

        public void d(View view, int i2) {
            g(view, i2, true);
        }

        public int d0() {
            return a.i.r.x.D(this.f4886b);
        }

        @Deprecated
        public boolean d1(RecyclerView recyclerView, View view, View view2) {
            return A0() || recyclerView.y0();
        }

        public void e(View view) {
            f(view, -1);
        }

        public int e0() {
            return a.i.r.x.E(this.f4886b);
        }

        public boolean e1(RecyclerView recyclerView, b0 b0Var, View view, View view2) {
            return d1(recyclerView, view, view2);
        }

        public void f(View view, int i2) {
            g(view, i2, false);
        }

        public int f0() {
            RecyclerView recyclerView = this.f4886b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void f1(Parcelable parcelable) {
        }

        public final void g(View view, int i2, boolean z) {
            e0 e0VarJ0 = RecyclerView.j0(view);
            if (z || e0VarJ0.A()) {
                this.f4886b.p.b(e0VarJ0);
            } else {
                this.f4886b.p.p(e0VarJ0);
            }
            q qVar = (q) view.getLayoutParams();
            if (e0VarJ0.Q() || e0VarJ0.B()) {
                if (e0VarJ0.B()) {
                    e0VarJ0.P();
                } else {
                    e0VarJ0.h();
                }
                this.f4885a.c(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f4886b) {
                int iM = this.f4885a.m(view);
                if (i2 == -1) {
                    i2 = this.f4885a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4886b.indexOfChild(view) + this.f4886b.Q());
                }
                if (iM != i2) {
                    this.f4886b.w.E0(iM, i2);
                }
            } else {
                this.f4885a.a(view, i2, false);
                qVar.f4908c = true;
                a0 a0Var = this.f4891g;
                if (a0Var != null && a0Var.h()) {
                    this.f4891g.k(view);
                }
            }
            if (qVar.f4909d) {
                e0VarJ0.f4855b.invalidate();
                qVar.f4909d = false;
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.f4886b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public Parcelable g1() {
            return null;
        }

        public void h(String str) {
            RecyclerView recyclerView = this.f4886b;
            if (recyclerView != null) {
                recyclerView.p(str);
            }
        }

        public int h0() {
            RecyclerView recyclerView = this.f4886b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void h1(int i2) {
        }

        public void i(View view, int i2) {
            j(view, i2, (q) view.getLayoutParams());
        }

        public int i0() {
            RecyclerView recyclerView = this.f4886b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void i1(a0 a0Var) {
            if (this.f4891g == a0Var) {
                this.f4891g = null;
            }
        }

        public void j(View view, int i2, q qVar) {
            e0 e0VarJ0 = RecyclerView.j0(view);
            if (e0VarJ0.A()) {
                this.f4886b.p.b(e0VarJ0);
            } else {
                this.f4886b.p.p(e0VarJ0);
            }
            this.f4885a.c(view, i2, qVar, e0VarJ0.A());
        }

        public int j0(View view) {
            return ((q) view.getLayoutParams()).b();
        }

        public boolean j1(int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f4886b;
            return k1(recyclerView.f4809l, recyclerView.x0, i2, bundle);
        }

        public void k(View view, Rect rect) {
            RecyclerView recyclerView = this.f4886b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.n0(view));
            }
        }

        public boolean k1(w wVar, b0 b0Var, int i2, Bundle bundle) {
            int iY;
            int iQ0;
            int i3;
            int i4;
            RecyclerView recyclerView = this.f4886b;
            if (recyclerView == null) {
                return false;
            }
            if (i2 == 4096) {
                iY = recyclerView.canScrollVertically(1) ? (Y() - i0()) - f0() : 0;
                if (this.f4886b.canScrollHorizontally(1)) {
                    iQ0 = (q0() - g0()) - h0();
                    i3 = iY;
                    i4 = iQ0;
                }
                i3 = iY;
                i4 = 0;
            } else if (i2 != 8192) {
                i4 = 0;
                i3 = 0;
            } else {
                iY = recyclerView.canScrollVertically(-1) ? -((Y() - i0()) - f0()) : 0;
                if (this.f4886b.canScrollHorizontally(-1)) {
                    iQ0 = -((q0() - g0()) - h0());
                    i3 = iY;
                    i4 = iQ0;
                }
                i3 = iY;
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            this.f4886b.u1(i4, i3, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean l() {
            return false;
        }

        public int l0(View view) {
            return ((q) view.getLayoutParams()).f4907b.right;
        }

        public boolean l1(View view, int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f4886b;
            return m1(recyclerView.f4809l, recyclerView.x0, view, i2, bundle);
        }

        public boolean m() {
            return false;
        }

        public int m0(w wVar, b0 b0Var) {
            return -1;
        }

        public boolean m1(w wVar, b0 b0Var, View view, int i2, Bundle bundle) {
            return false;
        }

        public boolean n(q qVar) {
            return qVar != null;
        }

        public int n0(w wVar, b0 b0Var) {
            return 0;
        }

        public void n1(w wVar) {
            for (int iL = L() - 1; iL >= 0; iL--) {
                if (!RecyclerView.j0(K(iL)).O()) {
                    q1(iL, wVar);
                }
            }
        }

        public int o0(View view) {
            return ((q) view.getLayoutParams()).f4907b.top;
        }

        public void o1(w wVar) {
            int iJ = wVar.j();
            for (int i2 = iJ - 1; i2 >= 0; i2--) {
                View viewN = wVar.n(i2);
                e0 e0VarJ0 = RecyclerView.j0(viewN);
                if (!e0VarJ0.O()) {
                    e0VarJ0.L(false);
                    if (e0VarJ0.C()) {
                        this.f4886b.removeDetachedView(viewN, false);
                    }
                    m mVar = this.f4886b.f0;
                    if (mVar != null) {
                        mVar.j(e0VarJ0);
                    }
                    e0VarJ0.L(true);
                    wVar.y(viewN);
                }
            }
            wVar.e();
            if (iJ > 0) {
                this.f4886b.invalidate();
            }
        }

        public void p(int i2, int i3, b0 b0Var, c cVar) {
        }

        public void p0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((q) view.getLayoutParams()).f4907b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f4886b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f4886b.u;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void p1(View view, w wVar) {
            s1(view);
            wVar.B(view);
        }

        public void q(int i2, c cVar) {
        }

        public int q0() {
            return this.q;
        }

        public void q1(int i2, w wVar) {
            View viewK = K(i2);
            t1(i2);
            wVar.B(viewK);
        }

        public int r(b0 b0Var) {
            return 0;
        }

        public int r0() {
            return this.f4899o;
        }

        public boolean r1(Runnable runnable) {
            RecyclerView recyclerView = this.f4886b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int s(b0 b0Var) {
            return 0;
        }

        public boolean s0() {
            int iL = L();
            for (int i2 = 0; i2 < iL; i2++) {
                ViewGroup.LayoutParams layoutParams = K(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void s1(View view) {
            this.f4885a.p(view);
        }

        public int t(b0 b0Var) {
            return 0;
        }

        public boolean t0() {
            RecyclerView recyclerView = this.f4886b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void t1(int i2) {
            if (K(i2) != null) {
                this.f4885a.q(i2);
            }
        }

        public int u(b0 b0Var) {
            return 0;
        }

        public boolean u0() {
            return this.f4893i;
        }

        public boolean u1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return v1(recyclerView, view, rect, z, false);
        }

        public int v(b0 b0Var) {
            return 0;
        }

        public boolean v0() {
            return this.f4894j;
        }

        public boolean v1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] iArrN = N(view, rect);
            int i2 = iArrN[0];
            int i3 = iArrN[1];
            if ((z2 && !w0(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.r1(i2, i3);
            }
            return true;
        }

        public int w(b0 b0Var) {
            return 0;
        }

        public final boolean w0(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iG0 = g0();
            int iI0 = i0();
            int iQ0 = q0() - h0();
            int iY = Y() - f0();
            Rect rect = this.f4886b.s;
            R(focusedChild, rect);
            return rect.left - i2 < iQ0 && rect.right - i2 > iG0 && rect.top - i3 < iY && rect.bottom - i3 > iI0;
        }

        public void w1() {
            RecyclerView recyclerView = this.f4886b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void x(w wVar) {
            for (int iL = L() - 1; iL >= 0; iL--) {
                y1(wVar, iL, K(iL));
            }
        }

        public final boolean x0() {
            return this.f4896l;
        }

        public void x1() {
            this.f4892h = true;
        }

        public void y(View view, w wVar) {
            y1(wVar, this.f4885a.m(view), view);
        }

        public boolean y0(w wVar, b0 b0Var) {
            return false;
        }

        public final void y1(w wVar, int i2, View view) {
            e0 e0VarJ0 = RecyclerView.j0(view);
            if (e0VarJ0.O()) {
                return;
            }
            if (e0VarJ0.y() && !e0VarJ0.A() && !this.f4886b.v.v()) {
                t1(i2);
                wVar.C(e0VarJ0);
            } else {
                z(i2);
                wVar.D(view);
                this.f4886b.p.k(e0VarJ0);
            }
        }

        public void z(int i2) {
            A(i2, K(i2));
        }

        public int z1(int i2, w wVar, b0 b0Var) {
            return 0;
        }
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e0 f4906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f4907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f4909d;

        public q(int i2, int i3) {
            super(i2, i3);
            this.f4907b = new Rect();
            this.f4908c = true;
            this.f4909d = false;
        }

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4907b = new Rect();
            this.f4908c = true;
            this.f4909d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4907b = new Rect();
            this.f4908c = true;
            this.f4909d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4907b = new Rect();
            this.f4908c = true;
            this.f4909d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f4907b = new Rect();
            this.f4908c = true;
            this.f4909d = false;
        }

        @Deprecated
        public int a() {
            return this.f4906a.o();
        }

        public int b() {
            return this.f4906a.r();
        }

        public boolean c() {
            return this.f4906a.D();
        }

        public boolean d() {
            return this.f4906a.A();
        }

        public boolean e() {
            return this.f4906a.y();
        }

        public boolean f() {
            return this.f4906a.E();
        }
    }

    public interface r {
        void b(View view);

        void d(View view);
    }

    public static abstract class s {
        public abstract boolean a(int i2, int i3);
    }

    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z);
    }

    public static abstract class u {
        public void a(RecyclerView recyclerView, int i2) {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    public static class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray<a> f4910a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4911b = 0;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList<e0> f4912a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f4913b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f4914c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public long f4915d = 0;
        }

        public void a() {
            this.f4911b++;
        }

        public void b() {
            for (int i2 = 0; i2 < this.f4910a.size(); i2++) {
                this.f4910a.valueAt(i2).f4912a.clear();
            }
        }

        public void c() {
            this.f4911b--;
        }

        public void d(int i2, long j2) {
            a aVarG = g(i2);
            aVarG.f4915d = j(aVarG.f4915d, j2);
        }

        public void e(int i2, long j2) {
            a aVarG = g(i2);
            aVarG.f4914c = j(aVarG.f4914c, j2);
        }

        public e0 f(int i2) {
            a aVar = this.f4910a.get(i2);
            if (aVar == null || aVar.f4912a.isEmpty()) {
                return null;
            }
            ArrayList<e0> arrayList = aVar.f4912a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).w()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public final a g(int i2) {
            a aVar = this.f4910a.get(i2);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f4910a.put(i2, aVar2);
            return aVar2;
        }

        public void h(h hVar, h hVar2, boolean z) {
            if (hVar != null) {
                c();
            }
            if (!z && this.f4911b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void i(e0 e0Var) {
            int iQ = e0Var.q();
            ArrayList<e0> arrayList = g(iQ).f4912a;
            if (this.f4910a.get(iQ).f4913b <= arrayList.size()) {
                return;
            }
            e0Var.I();
            arrayList.add(e0Var);
        }

        public long j(long j2, long j3) {
            return j2 == 0 ? j3 : ((j2 / 4) * 3) + (j3 / 4);
        }

        public void k(int i2, int i3) {
            a aVarG = g(i2);
            aVarG.f4913b = i3;
            ArrayList<e0> arrayList = aVarG.f4912a;
            while (arrayList.size() > i3) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public boolean l(int i2, long j2, long j3) {
            long j4 = g(i2).f4915d;
            return j4 == 0 || j2 + j4 < j3;
        }

        public boolean m(int i2, long j2, long j3) {
            long j4 = g(i2).f4914c;
            return j4 == 0 || j2 + j4 < j3;
        }
    }

    public final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<e0> f4916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<e0> f4917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<e0> f4918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<e0> f4919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public v f4922g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c0 f4923h;

        public w() {
            ArrayList<e0> arrayList = new ArrayList<>();
            this.f4916a = arrayList;
            this.f4917b = null;
            this.f4918c = new ArrayList<>();
            this.f4919d = Collections.unmodifiableList(arrayList);
            this.f4920e = 2;
            this.f4921f = 2;
        }

        public void A(int i2) {
            a(this.f4918c.get(i2), true);
            this.f4918c.remove(i2);
        }

        public void B(View view) {
            e0 e0VarJ0 = RecyclerView.j0(view);
            if (e0VarJ0.C()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (e0VarJ0.B()) {
                e0VarJ0.P();
            } else if (e0VarJ0.Q()) {
                e0VarJ0.h();
            }
            C(e0VarJ0);
            if (RecyclerView.this.f0 == null || e0VarJ0.z()) {
                return;
            }
            RecyclerView.this.f0.j(e0VarJ0);
        }

        public void C(e0 e0Var) {
            boolean z;
            boolean z2 = true;
            if (e0Var.B() || e0Var.f4855b.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(e0Var.B());
                sb.append(" isAttached:");
                sb.append(e0Var.f4855b.getParent() != null);
                sb.append(RecyclerView.this.Q());
                throw new IllegalArgumentException(sb.toString());
            }
            if (e0Var.C()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e0Var + RecyclerView.this.Q());
            }
            if (e0Var.O()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.Q());
            }
            boolean zK = e0Var.k();
            h hVar = RecyclerView.this.v;
            if ((hVar != null && zK && hVar.K(e0Var)) || e0Var.z()) {
                if (this.f4921f <= 0 || e0Var.u(526)) {
                    z = false;
                } else {
                    int size = this.f4918c.size();
                    if (size >= this.f4921f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.f4803f && size > 0 && !RecyclerView.this.w0.d(e0Var.f4857d)) {
                        int i2 = size - 1;
                        while (i2 >= 0) {
                            if (!RecyclerView.this.w0.d(this.f4918c.get(i2).f4857d)) {
                                break;
                            } else {
                                i2--;
                            }
                        }
                        size = i2 + 1;
                    }
                    this.f4918c.add(size, e0Var);
                    z = true;
                }
                if (z) {
                    z = z;
                    z2 = false;
                } else {
                    a(e0Var, true);
                    z = z;
                }
            } else {
                z2 = false;
            }
            RecyclerView.this.p.q(e0Var);
            if (z || z2 || !zK) {
                return;
            }
            e0Var.t = null;
            e0Var.s = null;
        }

        public void D(View view) {
            ArrayList<e0> arrayList;
            e0 e0VarJ0 = RecyclerView.j0(view);
            if (!e0VarJ0.u(12) && e0VarJ0.D() && !RecyclerView.this.q(e0VarJ0)) {
                if (this.f4917b == null) {
                    this.f4917b = new ArrayList<>();
                }
                e0VarJ0.M(this, true);
                arrayList = this.f4917b;
            } else {
                if (e0VarJ0.y() && !e0VarJ0.A() && !RecyclerView.this.v.v()) {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.Q());
                }
                e0VarJ0.M(this, false);
                arrayList = this.f4916a;
            }
            arrayList.add(e0VarJ0);
        }

        public void E(v vVar) {
            v vVar2 = this.f4922g;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.f4922g = vVar;
            if (vVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f4922g.a();
        }

        public void F(c0 c0Var) {
        }

        public void G(int i2) {
            this.f4920e = i2;
            K();
        }

        public final boolean H(e0 e0Var, int i2, int i3, long j2) {
            e0Var.t = null;
            e0Var.s = RecyclerView.this;
            int iQ = e0Var.q();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j2 != Long.MAX_VALUE && !this.f4922g.l(iQ, nanoTime, j2)) {
                return false;
            }
            RecyclerView.this.v.i(e0Var, i2);
            this.f4922g.d(e0Var.q(), RecyclerView.this.getNanoTime() - nanoTime);
            b(e0Var);
            if (!RecyclerView.this.x0.h()) {
                return true;
            }
            e0Var.f4861h = i3;
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0134 A[PHI: r1 r4
  0x0134: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$e0) = (r1v11 androidx.recyclerview.widget.RecyclerView$e0), (r1v30 androidx.recyclerview.widget.RecyclerView$e0) binds: [B:28:0x005d, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01d4 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.e0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instruction units count: 533
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$e0");
        }

        public void J(e0 e0Var) {
            (e0Var.p ? this.f4917b : this.f4916a).remove(e0Var);
            e0Var.f4868o = null;
            e0Var.p = false;
            e0Var.h();
        }

        public void K() {
            p pVar = RecyclerView.this.w;
            this.f4921f = this.f4920e + (pVar != null ? pVar.f4897m : 0);
            for (int size = this.f4918c.size() - 1; size >= 0 && this.f4918c.size() > this.f4921f; size--) {
                A(size);
            }
        }

        public boolean L(e0 e0Var) {
            if (e0Var.A()) {
                return RecyclerView.this.x0.h();
            }
            int i2 = e0Var.f4857d;
            if (i2 >= 0 && i2 < RecyclerView.this.v.o()) {
                if (RecyclerView.this.x0.h() || RecyclerView.this.v.r(e0Var.f4857d) == e0Var.q()) {
                    return !RecyclerView.this.v.v() || e0Var.p() == RecyclerView.this.v.q(e0Var.f4857d);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e0Var + RecyclerView.this.Q());
        }

        public void M(int i2, int i3) {
            int i4;
            int i5 = i3 + i2;
            for (int size = this.f4918c.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f4918c.get(size);
                if (e0Var != null && (i4 = e0Var.f4857d) >= i2 && i4 < i5) {
                    e0Var.e(2);
                    A(size);
                }
            }
        }

        public void a(e0 e0Var, boolean z) {
            RecyclerView.s(e0Var);
            View view = e0Var.f4855b;
            a.y.e.n nVar = RecyclerView.this.E0;
            if (nVar != null) {
                a.i.r.a aVarN = nVar.n();
                a.i.r.x.p0(view, aVarN instanceof n.a ? ((n.a) aVarN).n(view) : null);
            }
            if (z) {
                g(e0Var);
            }
            e0Var.t = null;
            e0Var.s = null;
            i().i(e0Var);
        }

        public final void b(e0 e0Var) {
            if (RecyclerView.this.x0()) {
                View view = e0Var.f4855b;
                if (a.i.r.x.A(view) == 0) {
                    a.i.r.x.y0(view, 1);
                }
                a.y.e.n nVar = RecyclerView.this.E0;
                if (nVar == null) {
                    return;
                }
                a.i.r.a aVarN = nVar.n();
                if (aVarN instanceof n.a) {
                    ((n.a) aVarN).o(view);
                }
                a.i.r.x.p0(view, aVarN);
            }
        }

        public void c() {
            this.f4916a.clear();
            z();
        }

        public void d() {
            int size = this.f4918c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f4918c.get(i2).f();
            }
            int size2 = this.f4916a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f4916a.get(i3).f();
            }
            ArrayList<e0> arrayList = this.f4917b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f4917b.get(i4).f();
                }
            }
        }

        public void e() {
            this.f4916a.clear();
            ArrayList<e0> arrayList = this.f4917b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i2) {
            if (i2 >= 0 && i2 < RecyclerView.this.x0.c()) {
                return !RecyclerView.this.x0.h() ? i2 : RecyclerView.this.f4811n.m(i2);
            }
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + RecyclerView.this.x0.c() + RecyclerView.this.Q());
        }

        public void g(e0 e0Var) {
            x xVar = RecyclerView.this.x;
            if (xVar != null) {
                xVar.a(e0Var);
            }
            int size = RecyclerView.this.y.size();
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView.this.y.get(i2).a(e0Var);
            }
            h hVar = RecyclerView.this.v;
            if (hVar != null) {
                hVar.Q(e0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.x0 != null) {
                recyclerView.p.q(e0Var);
            }
        }

        public e0 h(int i2) {
            int size;
            int iM;
            ArrayList<e0> arrayList = this.f4917b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    e0 e0Var = this.f4917b.get(i3);
                    if (!e0Var.Q() && e0Var.r() == i2) {
                        e0Var.e(32);
                        return e0Var;
                    }
                }
                if (RecyclerView.this.v.v() && (iM = RecyclerView.this.f4811n.m(i2)) > 0 && iM < RecyclerView.this.v.o()) {
                    long jQ = RecyclerView.this.v.q(iM);
                    for (int i4 = 0; i4 < size; i4++) {
                        e0 e0Var2 = this.f4917b.get(i4);
                        if (!e0Var2.Q() && e0Var2.p() == jQ) {
                            e0Var2.e(32);
                            return e0Var2;
                        }
                    }
                }
            }
            return null;
        }

        public v i() {
            if (this.f4922g == null) {
                this.f4922g = new v();
            }
            return this.f4922g;
        }

        public int j() {
            return this.f4916a.size();
        }

        public List<e0> k() {
            return this.f4919d;
        }

        public e0 l(long j2, int i2, boolean z) {
            for (int size = this.f4916a.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f4916a.get(size);
                if (e0Var.p() == j2 && !e0Var.Q()) {
                    if (i2 == e0Var.q()) {
                        e0Var.e(32);
                        if (e0Var.A() && !RecyclerView.this.x0.h()) {
                            e0Var.K(2, 14);
                        }
                        return e0Var;
                    }
                    if (!z) {
                        this.f4916a.remove(size);
                        RecyclerView.this.removeDetachedView(e0Var.f4855b, false);
                        y(e0Var.f4855b);
                    }
                }
            }
            int size2 = this.f4918c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                e0 e0Var2 = this.f4918c.get(size2);
                if (e0Var2.p() == j2 && !e0Var2.w()) {
                    if (i2 == e0Var2.q()) {
                        if (!z) {
                            this.f4918c.remove(size2);
                        }
                        return e0Var2;
                    }
                    if (!z) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        public e0 m(int i2, boolean z) {
            View viewE;
            int size = this.f4916a.size();
            for (int i3 = 0; i3 < size; i3++) {
                e0 e0Var = this.f4916a.get(i3);
                if (!e0Var.Q() && e0Var.r() == i2 && !e0Var.y() && (RecyclerView.this.x0.f4837h || !e0Var.A())) {
                    e0Var.e(32);
                    return e0Var;
                }
            }
            if (z || (viewE = RecyclerView.this.f4812o.e(i2)) == null) {
                int size2 = this.f4918c.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    e0 e0Var2 = this.f4918c.get(i4);
                    if (!e0Var2.y() && e0Var2.r() == i2 && !e0Var2.w()) {
                        if (!z) {
                            this.f4918c.remove(i4);
                        }
                        return e0Var2;
                    }
                }
                return null;
            }
            e0 e0VarJ0 = RecyclerView.j0(viewE);
            RecyclerView.this.f4812o.s(viewE);
            int iM = RecyclerView.this.f4812o.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f4812o.d(iM);
                D(viewE);
                e0VarJ0.e(8224);
                return e0VarJ0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + e0VarJ0 + RecyclerView.this.Q());
        }

        public View n(int i2) {
            return this.f4916a.get(i2).f4855b;
        }

        public View o(int i2) {
            return p(i2, false);
        }

        public View p(int i2, boolean z) {
            return I(i2, z, Long.MAX_VALUE).f4855b;
        }

        public final void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void r(e0 e0Var) {
            View view = e0Var.f4855b;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.f4918c.size();
            for (int i2 = 0; i2 < size; i2++) {
                q qVar = (q) this.f4918c.get(i2).f4855b.getLayoutParams();
                if (qVar != null) {
                    qVar.f4908c = true;
                }
            }
        }

        public void t() {
            int size = this.f4918c.size();
            for (int i2 = 0; i2 < size; i2++) {
                e0 e0Var = this.f4918c.get(i2);
                if (e0Var != null) {
                    e0Var.e(6);
                    e0Var.d(null);
                }
            }
            h hVar = RecyclerView.this.v;
            if (hVar == null || !hVar.v()) {
                z();
            }
        }

        public void u(int i2, int i3) {
            int size = this.f4918c.size();
            for (int i4 = 0; i4 < size; i4++) {
                e0 e0Var = this.f4918c.get(i4);
                if (e0Var != null && e0Var.f4857d >= i2) {
                    e0Var.F(i3, false);
                }
            }
        }

        public void v(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7;
            if (i2 < i3) {
                i4 = -1;
                i6 = i2;
                i5 = i3;
            } else {
                i4 = 1;
                i5 = i2;
                i6 = i3;
            }
            int size = this.f4918c.size();
            for (int i8 = 0; i8 < size; i8++) {
                e0 e0Var = this.f4918c.get(i8);
                if (e0Var != null && (i7 = e0Var.f4857d) >= i6 && i7 <= i5) {
                    if (i7 == i2) {
                        e0Var.F(i3 - i2, false);
                    } else {
                        e0Var.F(i4, false);
                    }
                }
            }
        }

        public void w(int i2, int i3, boolean z) {
            int i4 = i2 + i3;
            for (int size = this.f4918c.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f4918c.get(size);
                if (e0Var != null) {
                    int i5 = e0Var.f4857d;
                    if (i5 >= i4) {
                        e0Var.F(-i3, z);
                    } else if (i5 >= i2) {
                        e0Var.e(8);
                        A(size);
                    }
                }
            }
        }

        public void x(h hVar, h hVar2, boolean z) {
            c();
            i().h(hVar, hVar2, z);
        }

        public void y(View view) {
            e0 e0VarJ0 = RecyclerView.j0(view);
            e0VarJ0.f4868o = null;
            e0VarJ0.p = false;
            e0VarJ0.h();
            C(e0VarJ0);
        }

        public void z() {
            for (int size = this.f4918c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f4918c.clear();
            if (RecyclerView.f4803f) {
                RecyclerView.this.w0.b();
            }
        }
    }

    public interface x {
        void a(e0 e0Var);
    }

    public class y extends j {
        public y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.p(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.x0.f4836g = true;
            recyclerView.U0(true);
            if (RecyclerView.this.f4811n.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i2, int i3, Object obj) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f4811n.r(i2, i3, obj)) {
                f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i2, int i3, int i4) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f4811n.s(i2, i3, i4)) {
                f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i2, int i3) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f4811n.t(i2, i3)) {
                f();
            }
        }

        public void f() {
            if (RecyclerView.f4802e) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.D && recyclerView.C) {
                    a.i.r.x.h0(recyclerView, recyclerView.r);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.L = true;
            recyclerView2.requestLayout();
        }
    }

    public static class z extends a.k.a.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Parcelable f4926d;

        public class a implements Parcelable.ClassLoaderCreator<z> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i2) {
                return new z[i2];
            }
        }

        public z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4926d = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        public z(Parcelable parcelable) {
            super(parcelable);
        }

        public void c(z zVar) {
            this.f4926d = zVar.f4926d;
        }

        @Override // a.k.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeParcelable(this.f4926d, 0);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f4800c = i2 == 18 || i2 == 19 || i2 == 20;
        f4801d = i2 >= 23;
        f4802e = i2 >= 16;
        f4803f = i2 >= 21;
        f4804g = i2 <= 15;
        f4805h = i2 <= 15;
        Class<?> cls = Integer.TYPE;
        f4806i = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f4807j = new c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.y.a.f3778a);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4808k = new y();
        this.f4809l = new w();
        this.p = new a.y.e.s();
        this.r = new a();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new RectF();
        this.y = new ArrayList();
        this.z = new ArrayList<>();
        this.A = new ArrayList<>();
        this.G = 0;
        this.O = false;
        this.P = false;
        this.Q = 0;
        this.R = 0;
        this.S = new l();
        this.f0 = new a.y.e.c();
        this.g0 = 0;
        this.h0 = -1;
        this.r0 = Float.MIN_VALUE;
        this.s0 = Float.MIN_VALUE;
        boolean z2 = true;
        this.t0 = true;
        this.u0 = new d0();
        this.w0 = f4803f ? new e.b() : null;
        this.x0 = new b0();
        this.A0 = false;
        this.B0 = false;
        this.C0 = new n();
        this.D0 = false;
        this.G0 = new int[2];
        this.I0 = new int[2];
        this.J0 = new int[2];
        this.K0 = new int[2];
        this.L0 = new ArrayList();
        this.M0 = new b();
        this.O0 = 0;
        this.P0 = 0;
        this.Q0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.n0 = viewConfiguration.getScaledTouchSlop();
        this.r0 = a.i.r.y.b(viewConfiguration, context);
        this.s0 = a.i.r.y.d(viewConfiguration, context);
        this.p0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f0.w(this.C0);
        s0();
        u0();
        t0();
        if (a.i.r.x.A(this) == 0) {
            a.i.r.x.y0(this, 1);
        }
        this.M = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new a.y.e.n(this));
        int[] iArr = a.y.d.f3791f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        a.i.r.x.n0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        String string = typedArrayObtainStyledAttributes.getString(a.y.d.f3800o);
        if (typedArrayObtainStyledAttributes.getInt(a.y.d.f3794i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.q = typedArrayObtainStyledAttributes.getBoolean(a.y.d.f3793h, true);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(a.y.d.f3795j, false);
        this.E = z3;
        if (z3) {
            v0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(a.y.d.f3798m), typedArrayObtainStyledAttributes.getDrawable(a.y.d.f3799n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(a.y.d.f3796k), typedArrayObtainStyledAttributes.getDrawable(a.y.d.f3797l));
        }
        typedArrayObtainStyledAttributes.recycle();
        w(context, string, attributeSet, i2, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr2 = f4799b;
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
            a.i.r.x.n0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2, 0);
            z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
            typedArrayObtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    public static RecyclerView X(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewX = X(viewGroup.getChildAt(i2));
            if (recyclerViewX != null) {
                return recyclerViewX;
            }
        }
        return null;
    }

    private a.i.r.m getScrollingChildHelper() {
        if (this.H0 == null) {
            this.H0 = new a.i.r.m(this);
        }
        return this.H0;
    }

    public static e0 j0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f4906a;
    }

    public static void k0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f4907b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    public static void s(e0 e0Var) {
        WeakReference<RecyclerView> weakReference = e0Var.f4856c;
        if (weakReference != null) {
            Object parent = weakReference.get();
            while (true) {
                for (View view = (View) parent; view != null; view = null) {
                    if (view == e0Var.f4855b) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    }
                }
                e0Var.f4856c = null;
                return;
            }
        }
    }

    public void A(View view) {
        e0 e0VarJ0 = j0(view);
        K0(view);
        h hVar = this.v;
        if (hVar != null && e0VarJ0 != null) {
            hVar.P(e0VarJ0);
        }
        List<r> list = this.N;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.N.get(size).b(view);
            }
        }
    }

    public void A0(int i2) {
        if (this.w == null) {
            return;
        }
        setScrollState(2);
        this.w.A1(i2);
        awakenScrollBars();
    }

    public void A1() {
        setScrollState(0);
        B1();
    }

    public final void B() {
        int i2 = this.K;
        this.K = 0;
        if (i2 == 0 || !x0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        a.i.r.g0.b.b(accessibilityEventObtain, i2);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    public void B0() {
        int iJ = this.f4812o.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            ((q) this.f4812o.i(i2).getLayoutParams()).f4908c = true;
        }
        this.f4809l.s();
    }

    public final void B1() {
        this.u0.f();
        p pVar = this.w;
        if (pVar != null) {
            pVar.O1();
        }
    }

    public void C() {
        if (this.v == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.w == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.x0.f4839j = false;
        boolean z2 = this.N0 && !(this.O0 == getWidth() && this.P0 == getHeight());
        this.O0 = 0;
        this.P0 = 0;
        this.N0 = false;
        if (this.x0.f4834e != 1) {
            if (!this.f4811n.q() && !z2 && this.w.q0() == getWidth() && this.w.Y() == getHeight()) {
                this.w.C1(this);
            }
            F();
        }
        D();
        this.w.C1(this);
        E();
        F();
    }

    public void C0() {
        int iJ = this.f4812o.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            e0 e0VarJ0 = j0(this.f4812o.i(i2));
            if (e0VarJ0 != null && !e0VarJ0.O()) {
                e0VarJ0.e(6);
            }
        }
        B0();
        this.f4809l.t();
    }

    public void C1(int i2, int i3, Object obj) {
        int i4;
        int iJ = this.f4812o.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < iJ; i6++) {
            View viewI = this.f4812o.i(i6);
            e0 e0VarJ0 = j0(viewI);
            if (e0VarJ0 != null && !e0VarJ0.O() && (i4 = e0VarJ0.f4857d) >= i2 && i4 < i5) {
                e0VarJ0.e(2);
                e0VarJ0.d(obj);
                ((q) viewI.getLayoutParams()).f4908c = true;
            }
        }
        this.f4809l.M(i2, i3);
    }

    public final void D() {
        this.x0.a(1);
        R(this.x0);
        this.x0.f4839j = false;
        w1();
        this.p.f();
        L0();
        T0();
        j1();
        b0 b0Var = this.x0;
        b0Var.f4838i = b0Var.f4840k && this.B0;
        this.B0 = false;
        this.A0 = false;
        b0Var.f4837h = b0Var.f4841l;
        b0Var.f4835f = this.v.o();
        W(this.G0);
        if (this.x0.f4840k) {
            int iG = this.f4812o.g();
            for (int i2 = 0; i2 < iG; i2++) {
                e0 e0VarJ0 = j0(this.f4812o.f(i2));
                if (!e0VarJ0.O() && (!e0VarJ0.y() || this.v.v())) {
                    this.p.e(e0VarJ0, this.f0.u(this.x0, e0VarJ0, m.e(e0VarJ0), e0VarJ0.t()));
                    if (this.x0.f4838i && e0VarJ0.D() && !e0VarJ0.A() && !e0VarJ0.O() && !e0VarJ0.y()) {
                        this.p.c(f0(e0VarJ0), e0VarJ0);
                    }
                }
            }
        }
        if (this.x0.f4841l) {
            k1();
            b0 b0Var2 = this.x0;
            boolean z2 = b0Var2.f4836g;
            b0Var2.f4836g = false;
            this.w.a1(this.f4809l, b0Var2);
            this.x0.f4836g = z2;
            for (int i3 = 0; i3 < this.f4812o.g(); i3++) {
                e0 e0VarJ02 = j0(this.f4812o.f(i3));
                if (!e0VarJ02.O() && !this.p.i(e0VarJ02)) {
                    int iE = m.e(e0VarJ02);
                    boolean zU = e0VarJ02.u(8192);
                    if (!zU) {
                        iE |= ProgressEvent.PART_FAILED_EVENT_CODE;
                    }
                    m.c cVarU = this.f0.u(this.x0, e0VarJ02, iE, e0VarJ02.t());
                    if (zU) {
                        W0(e0VarJ02, cVarU);
                    } else {
                        this.p.a(e0VarJ02, cVarU);
                    }
                }
            }
        }
        t();
        M0();
        y1(false);
        this.x0.f4834e = 2;
    }

    public final void D0(int i2, int i3, MotionEvent motionEvent, int i4) {
        p pVar = this.w;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.I) {
            return;
        }
        int[] iArr = this.K0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zL = pVar.l();
        boolean zM = this.w.m();
        int i5 = zL ? 1 : 0;
        if (zM) {
            i5 |= 2;
        }
        x1(i5, i4);
        if (G(zL ? i2 : 0, zM ? i3 : 0, this.K0, this.I0, i4)) {
            int[] iArr2 = this.K0;
            i2 -= iArr2[0];
            i3 -= iArr2[1];
        }
        l1(zL ? i2 : 0, zM ? i3 : 0, motionEvent, i4);
        a.y.e.e eVar = this.v0;
        if (eVar != null && (i2 != 0 || i3 != 0)) {
            eVar.f(this, i2, i3);
        }
        z1(i4);
    }

    public final void E() {
        w1();
        L0();
        this.x0.a(6);
        this.f4811n.j();
        this.x0.f4835f = this.v.o();
        this.x0.f4833d = 0;
        if (this.f4810m != null && this.v.j()) {
            Parcelable parcelable = this.f4810m.f4926d;
            if (parcelable != null) {
                this.w.f1(parcelable);
            }
            this.f4810m = null;
        }
        b0 b0Var = this.x0;
        b0Var.f4837h = false;
        this.w.a1(this.f4809l, b0Var);
        b0 b0Var2 = this.x0;
        b0Var2.f4836g = false;
        b0Var2.f4840k = b0Var2.f4840k && this.f0 != null;
        b0Var2.f4834e = 4;
        M0();
        y1(false);
    }

    public void E0(int i2) {
        int iG = this.f4812o.g();
        for (int i3 = 0; i3 < iG; i3++) {
            this.f4812o.f(i3).offsetLeftAndRight(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.F():void");
    }

    public void F0(int i2) {
        int iG = this.f4812o.g();
        for (int i3 = 0; i3 < iG; i3++) {
            this.f4812o.f(i3).offsetTopAndBottom(i2);
        }
    }

    public boolean G(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    public void G0(int i2, int i3) {
        int iJ = this.f4812o.j();
        for (int i4 = 0; i4 < iJ; i4++) {
            e0 e0VarJ0 = j0(this.f4812o.i(i4));
            if (e0VarJ0 != null && !e0VarJ0.O() && e0VarJ0.f4857d >= i2) {
                e0VarJ0.F(i3, false);
                this.x0.f4836g = true;
            }
        }
        this.f4809l.u(i2, i3);
        requestLayout();
    }

    public final void H(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void H0(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iJ = this.f4812o.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < iJ; i8++) {
            e0 e0VarJ0 = j0(this.f4812o.i(i8));
            if (e0VarJ0 != null && (i7 = e0VarJ0.f4857d) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    e0VarJ0.F(i3 - i2, false);
                } else {
                    e0VarJ0.F(i6, false);
                }
                this.x0.f4836g = true;
            }
        }
        this.f4809l.v(i2, i3);
        requestLayout();
    }

    public void I(int i2) {
        p pVar = this.w;
        if (pVar != null) {
            pVar.h1(i2);
        }
        P0(i2);
        u uVar = this.y0;
        if (uVar != null) {
            uVar.a(this, i2);
        }
        List<u> list = this.z0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.z0.get(size).a(this, i2);
            }
        }
    }

    public void I0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int iJ = this.f4812o.j();
        for (int i5 = 0; i5 < iJ; i5++) {
            e0 e0VarJ0 = j0(this.f4812o.i(i5));
            if (e0VarJ0 != null && !e0VarJ0.O()) {
                int i6 = e0VarJ0.f4857d;
                if (i6 >= i4) {
                    e0VarJ0.F(-i3, z2);
                } else if (i6 >= i2) {
                    e0VarJ0.l(i2 - 1, -i3, z2);
                }
                this.x0.f4836g = true;
            }
        }
        this.f4809l.w(i2, i3, z2);
        requestLayout();
    }

    public void J(int i2, int i3) {
        this.R++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        Q0(i2, i3);
        u uVar = this.y0;
        if (uVar != null) {
            uVar.b(this, i2, i3);
        }
        List<u> list = this.z0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.z0.get(size).b(this, i2, i3);
            }
        }
        this.R--;
    }

    public void J0(View view) {
    }

    public void K() {
        int i2;
        for (int size = this.L0.size() - 1; size >= 0; size--) {
            e0 e0Var = this.L0.get(size);
            if (e0Var.f4855b.getParent() == this && !e0Var.O() && (i2 = e0Var.r) != -1) {
                a.i.r.x.y0(e0Var.f4855b, i2);
                e0Var.r = -1;
            }
        }
        this.L0.clear();
    }

    public void K0(View view) {
    }

    public final boolean L(MotionEvent motionEvent) {
        t tVar = this.B;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return V(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.B = null;
        }
        return true;
    }

    public void L0() {
        this.Q++;
    }

    public void M() {
        int measuredWidth;
        int measuredHeight;
        if (this.W != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.S.a(this, 3);
        this.W = edgeEffectA;
        if (this.q) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    public void M0() {
        N0(true);
    }

    public void N() {
        int measuredHeight;
        int measuredWidth;
        if (this.T != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.S.a(this, 0);
        this.T = edgeEffectA;
        if (this.q) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    public void N0(boolean z2) {
        int i2 = this.Q - 1;
        this.Q = i2;
        if (i2 < 1) {
            this.Q = 0;
            if (z2) {
                B();
                K();
            }
        }
    }

    public void O() {
        int measuredHeight;
        int measuredWidth;
        if (this.V != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.S.a(this, 2);
        this.V = edgeEffectA;
        if (this.q) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    public final void O0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.h0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.h0 = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.l0 = x2;
            this.j0 = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.m0 = y2;
            this.k0 = y2;
        }
    }

    public void P() {
        int measuredWidth;
        int measuredHeight;
        if (this.U != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.S.a(this, 1);
        this.U = edgeEffectA;
        if (this.q) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    public void P0(int i2) {
    }

    public String Q() {
        return " " + super.toString() + ", adapter:" + this.v + ", layout:" + this.w + ", context:" + getContext();
    }

    public void Q0(int i2, int i3) {
    }

    public final void R(b0 b0Var) {
        if (getScrollState() != 2) {
            b0Var.p = 0;
            b0Var.q = 0;
        } else {
            OverScroller overScroller = this.u0.f4848d;
            b0Var.p = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public void R0() {
        if (this.D0 || !this.C) {
            return;
        }
        a.i.r.x.h0(this, this.M0);
        this.D0 = true;
    }

    public View S(float f2, float f3) {
        for (int iG = this.f4812o.g() - 1; iG >= 0; iG--) {
            View viewF = this.f4812o.f(iG);
            float translationX = viewF.getTranslationX();
            float translationY = viewF.getTranslationY();
            if (f2 >= viewF.getLeft() + translationX && f2 <= viewF.getRight() + translationX && f3 >= viewF.getTop() + translationY && f3 <= viewF.getBottom() + translationY) {
                return viewF;
            }
        }
        return null;
    }

    public final boolean S0() {
        return this.f0 != null && this.w.P1();
    }

    public View T(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final void T0() {
        boolean z2;
        if (this.O) {
            this.f4811n.x();
            if (this.P) {
                this.w.V0(this);
            }
        }
        if (S0()) {
            this.f4811n.v();
        } else {
            this.f4811n.j();
        }
        boolean z3 = false;
        boolean z4 = this.A0 || this.B0;
        this.x0.f4840k = this.F && this.f0 != null && ((z2 = this.O) || z4 || this.w.f4892h) && (!z2 || this.v.v());
        b0 b0Var = this.x0;
        if (b0Var.f4840k && z4 && !this.O && S0()) {
            z3 = true;
        }
        b0Var.f4841l = z3;
    }

    public e0 U(View view) {
        View viewT = T(view);
        if (viewT == null) {
            return null;
        }
        return i0(viewT);
    }

    public void U0(boolean z2) {
        this.P = z2 | this.P;
        this.O = true;
        C0();
    }

    public final boolean V(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.A.size();
        for (int i2 = 0; i2 < size; i2++) {
            t tVar = this.A.get(i2);
            if (tVar.c(this, motionEvent) && action != 3) {
                this.B = tVar;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.N()
            android.widget.EdgeEffect r3 = r6.T
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L1c:
            a.i.s.d.a(r3, r4, r9)
            r9 = 1
            goto L39
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L38
            r6.O()
            android.widget.EdgeEffect r3 = r6.V
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L53
            r6.P()
            android.widget.EdgeEffect r9 = r6.U
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            a.i.s.d.a(r9, r0, r7)
            goto L6f
        L53:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L6e
            r6.M()
            android.widget.EdgeEffect r9 = r6.W
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            a.i.s.d.a(r9, r3, r0)
            goto L6f
        L6e:
            r1 = r9
        L6f:
            if (r1 != 0) goto L79
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            a.i.r.x.g0(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.V0(float, float, float, float):void");
    }

    public final void W(int[] iArr) {
        int iG = this.f4812o.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iG; i4++) {
            e0 e0VarJ0 = j0(this.f4812o.f(i4));
            if (!e0VarJ0.O()) {
                int iR = e0VarJ0.r();
                if (iR < i2) {
                    i2 = iR;
                }
                if (iR > i3) {
                    i3 = iR;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public void W0(e0 e0Var, m.c cVar) {
        e0Var.K(0, 8192);
        if (this.x0.f4838i && e0Var.D() && !e0Var.A() && !e0Var.O()) {
            this.p.c(f0(e0Var), e0Var);
        }
        this.p.e(e0Var, cVar);
    }

    public final void X0() {
        View viewFindViewById;
        if (!this.t0 || this.v == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f4805h || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f4812o.n(focusedChild)) {
                    return;
                }
            } else if (this.f4812o.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewY = null;
        e0 e0VarA0 = (this.x0.f4843n == -1 || !this.v.v()) ? null : a0(this.x0.f4843n);
        if (e0VarA0 != null && !this.f4812o.n(e0VarA0.f4855b) && e0VarA0.f4855b.hasFocusable()) {
            viewY = e0VarA0.f4855b;
        } else if (this.f4812o.g() > 0) {
            viewY = Y();
        }
        if (viewY != null) {
            int i2 = this.x0.f4844o;
            if (i2 != -1 && (viewFindViewById = viewY.findViewById(i2)) != null && viewFindViewById.isFocusable()) {
                viewY = viewFindViewById;
            }
            viewY.requestFocus();
        }
    }

    public final View Y() {
        e0 e0VarZ;
        b0 b0Var = this.x0;
        int i2 = b0Var.f4842m;
        if (i2 == -1) {
            i2 = 0;
        }
        int iC = b0Var.c();
        for (int i3 = i2; i3 < iC; i3++) {
            e0 e0VarZ2 = Z(i3);
            if (e0VarZ2 == null) {
                break;
            }
            if (e0VarZ2.f4855b.hasFocusable()) {
                return e0VarZ2.f4855b;
            }
        }
        int iMin = Math.min(iC, i2);
        do {
            iMin--;
            if (iMin < 0 || (e0VarZ = Z(iMin)) == null) {
                return null;
            }
        } while (!e0VarZ.f4855b.hasFocusable());
        return e0VarZ.f4855b;
    }

    public final void Y0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.T;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.T.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.U;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.W;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        if (zIsFinished) {
            a.i.r.x.g0(this);
        }
    }

    public e0 Z(int i2) {
        e0 e0Var = null;
        if (this.O) {
            return null;
        }
        int iJ = this.f4812o.j();
        for (int i3 = 0; i3 < iJ; i3++) {
            e0 e0VarJ0 = j0(this.f4812o.i(i3));
            if (e0VarJ0 != null && !e0VarJ0.A() && e0(e0VarJ0) == i2) {
                if (!this.f4812o.n(e0VarJ0.f4855b)) {
                    return e0VarJ0;
                }
                e0Var = e0VarJ0;
            }
        }
        return e0Var;
    }

    public void Z0() {
        m mVar = this.f0;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.w;
        if (pVar != null) {
            pVar.n1(this.f4809l);
            this.w.o1(this.f4809l);
        }
        this.f4809l.c();
    }

    public void a(int i2, int i3) {
        if (i2 < 0) {
            N();
            if (this.T.isFinished()) {
                this.T.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            O();
            if (this.V.isFinished()) {
                this.V.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            P();
            if (this.U.isFinished()) {
                this.U.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            M();
            if (this.W.isFinished()) {
                this.W.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        a.i.r.x.g0(this);
    }

    public e0 a0(long j2) {
        h hVar = this.v;
        e0 e0Var = null;
        if (hVar != null && hVar.v()) {
            int iJ = this.f4812o.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                e0 e0VarJ0 = j0(this.f4812o.i(i2));
                if (e0VarJ0 != null && !e0VarJ0.A() && e0VarJ0.p() == j2) {
                    if (!this.f4812o.n(e0VarJ0.f4855b)) {
                        return e0VarJ0;
                    }
                    e0Var = e0VarJ0;
                }
            }
        }
        return e0Var;
    }

    public boolean a1(View view) {
        w1();
        boolean zR = this.f4812o.r(view);
        if (zR) {
            e0 e0VarJ0 = j0(view);
            this.f4809l.J(e0VarJ0);
            this.f4809l.C(e0VarJ0);
        }
        y1(!zR);
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        p pVar = this.w;
        if (pVar == null || !pVar.I0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    @Deprecated
    public e0 b0(int i2) {
        return c0(i2, false);
    }

    public void b1(o oVar) {
        p pVar = this.w;
        if (pVar != null) {
            pVar.h("Cannot remove item decoration during a scroll  or layout");
        }
        this.z.remove(oVar);
        if (this.z.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        B0();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.e0 c0(int r6, boolean r7) {
        /*
            r5 = this;
            a.y.e.b r0 = r5.f4812o
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            a.y.e.b r3 = r5.f4812o
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$e0 r3 = j0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.A()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f4857d
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.r()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            a.y.e.b r1 = r5.f4812o
            android.view.View r4 = r3.f4855b
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c0(int, boolean):androidx.recyclerview.widget.RecyclerView$e0");
    }

    public void c1(r rVar) {
        List<r> list = this.N;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.w.n((q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.w;
        if (pVar != null && pVar.l()) {
            return this.w.r(this.x0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.w;
        if (pVar != null && pVar.l()) {
            return this.w.s(this.x0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.w;
        if (pVar != null && pVar.l()) {
            return this.w.t(this.x0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.w;
        if (pVar != null && pVar.m()) {
            return this.w.u(this.x0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.w;
        if (pVar != null && pVar.m()) {
            return this.w.v(this.x0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.w;
        if (pVar != null && pVar.m()) {
            return this.w.w(this.x0);
        }
        return 0;
    }

    public boolean d0(int i2, int i3) {
        p pVar = this.w;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.I) {
            return false;
        }
        boolean zL = pVar.l();
        boolean zM = this.w.m();
        if (!zL || Math.abs(i2) < this.p0) {
            i2 = 0;
        }
        if (!zM || Math.abs(i3) < this.p0) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        float f2 = i2;
        float f3 = i3;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z2 = zL || zM;
            dispatchNestedFling(f2, f3, z2);
            s sVar = this.o0;
            if (sVar != null && sVar.a(i2, i3)) {
                return true;
            }
            if (z2) {
                int i4 = zL ? 1 : 0;
                if (zM) {
                    i4 |= 2;
                }
                x1(i4, 1);
                int i5 = this.q0;
                int iMax = Math.max(-i5, Math.min(i2, i5));
                int i6 = this.q0;
                this.u0.b(iMax, Math.max(-i6, Math.min(i3, i6)));
                return true;
            }
        }
        return false;
    }

    public void d1(t tVar) {
        this.A.remove(tVar);
        if (this.B == tVar) {
            this.B = null;
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        float paddingRight;
        int paddingBottom;
        super.draw(canvas);
        int size = this.z.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.z.get(i2).k(canvas, this, this.x0);
        }
        EdgeEffect edgeEffect = this.T;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.q ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            EdgeEffect edgeEffect2 = this.T;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.q) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.U;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.V;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.q ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.V;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.W;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.q) {
                paddingRight = (-getWidth()) + getPaddingRight();
                paddingBottom = (-getHeight()) + getPaddingBottom();
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.W;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.f0 == null || this.z.size() <= 0 || !this.f0.p()) ? z2 : true) {
            a.i.r.x.g0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public int e0(e0 e0Var) {
        if (e0Var.u(524) || !e0Var.x()) {
            return -1;
        }
        return this.f4811n.e(e0Var.f4857d);
    }

    public void e1(u uVar) {
        List<u> list = this.z0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public long f0(e0 e0Var) {
        return this.v.v() ? e0Var.p() : e0Var.f4857d;
    }

    public void f1() {
        e0 e0Var;
        int iG = this.f4812o.g();
        for (int i2 = 0; i2 < iG; i2++) {
            View viewF = this.f4812o.f(i2);
            e0 e0VarI0 = i0(viewF);
            if (e0VarI0 != null && (e0Var = e0VarI0.f4863j) != null) {
                View view = e0Var.f4855b;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View viewM0;
        boolean z2;
        View viewT0 = this.w.T0(view, i2);
        if (viewT0 != null) {
            return viewT0;
        }
        boolean z3 = (this.v == null || this.w == null || y0() || this.I) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.w.m()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (f4804g) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.w.l()) {
                int i4 = (this.w.b0() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
                if (f4804g) {
                    i2 = i4;
                }
                z2 = z4;
            }
            if (z2) {
                v();
                if (T(view) == null) {
                    return null;
                }
                w1();
                this.w.M0(view, i2, this.f4809l, this.x0);
                y1(false);
            }
            viewM0 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (viewFindNextFocus == null && z3) {
                v();
                if (T(view) == null) {
                    return null;
                }
                w1();
                viewM0 = this.w.M0(view, i2, this.f4809l, this.x0);
                y1(false);
            } else {
                viewM0 = viewFindNextFocus;
            }
        }
        if (viewM0 == null || viewM0.hasFocusable()) {
            return z0(view, viewM0, i2) ? viewM0 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        g1(viewM0, null);
        return view;
    }

    public final void g(e0 e0Var) {
        View view = e0Var.f4855b;
        boolean z2 = view.getParent() == this;
        this.f4809l.J(i0(view));
        if (e0Var.C()) {
            this.f4812o.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        a.y.e.b bVar = this.f4812o;
        if (z2) {
            bVar.k(view);
        } else {
            bVar.b(view, true);
        }
    }

    public int g0(View view) {
        e0 e0VarJ0 = j0(view);
        if (e0VarJ0 != null) {
            return e0VarJ0.m();
        }
        return -1;
    }

    public final void g1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.s.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f4908c) {
                Rect rect = qVar.f4907b;
                Rect rect2 = this.s;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.s);
            offsetRectIntoDescendantCoords(view, this.s);
        }
        this.w.v1(this, view, this.s, !this.F, view2 == null);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.w;
        if (pVar != null) {
            return pVar.F();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.w;
        if (pVar != null) {
            return pVar.G(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.w;
        if (pVar != null) {
            return pVar.H(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.v;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.w;
        return pVar != null ? pVar.I() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        k kVar = this.F0;
        return kVar == null ? super.getChildDrawingOrder(i2, i3) : kVar.a(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.q;
    }

    public a.y.e.n getCompatAccessibilityDelegate() {
        return this.E0;
    }

    public l getEdgeEffectFactory() {
        return this.S;
    }

    public m getItemAnimator() {
        return this.f0;
    }

    public int getItemDecorationCount() {
        return this.z.size();
    }

    public p getLayoutManager() {
        return this.w;
    }

    public int getMaxFlingVelocity() {
        return this.q0;
    }

    public int getMinFlingVelocity() {
        return this.p0;
    }

    public long getNanoTime() {
        if (f4803f) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.o0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.t0;
    }

    public v getRecycledViewPool() {
        return this.f4809l.i();
    }

    public int getScrollState() {
        return this.g0;
    }

    public void h(o oVar) {
        i(oVar, -1);
    }

    public int h0(View view) {
        e0 e0VarJ0 = j0(view);
        if (e0VarJ0 != null) {
            return e0VarJ0.r();
        }
        return -1;
    }

    public final void h1() {
        b0 b0Var = this.x0;
        b0Var.f4843n = -1L;
        b0Var.f4842m = -1;
        b0Var.f4844o = -1;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(o oVar, int i2) {
        p pVar = this.w;
        if (pVar != null) {
            pVar.h("Cannot add item decoration during a scroll  or layout");
        }
        if (this.z.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.z.add(oVar);
        } else {
            this.z.add(i2, oVar);
        }
        B0();
        requestLayout();
    }

    public e0 i0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return j0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final void i1() {
        VelocityTracker velocityTracker = this.i0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        z1(0);
        Y0();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.C;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.I;
    }

    @Override // android.view.View, a.i.r.l
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(r rVar) {
        if (this.N == null) {
            this.N = new ArrayList();
        }
        this.N.add(rVar);
    }

    public final void j1() {
        View focusedChild = (this.t0 && hasFocus() && this.v != null) ? getFocusedChild() : null;
        e0 e0VarU = focusedChild != null ? U(focusedChild) : null;
        if (e0VarU == null) {
            h1();
            return;
        }
        this.x0.f4843n = this.v.v() ? e0VarU.p() : -1L;
        this.x0.f4842m = this.O ? -1 : e0VarU.A() ? e0VarU.f4858e : e0VarU.m();
        this.x0.f4844o = l0(e0VarU.f4855b);
    }

    public void k(t tVar) {
        this.A.add(tVar);
    }

    public void k1() {
        int iJ = this.f4812o.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            e0 e0VarJ0 = j0(this.f4812o.i(i2));
            if (!e0VarJ0.O()) {
                e0VarJ0.J();
            }
        }
    }

    public void l(u uVar) {
        if (this.z0 == null) {
            this.z0 = new ArrayList();
        }
        this.z0.add(uVar);
    }

    public final int l0(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    public boolean l1(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        v();
        if (this.v != null) {
            int[] iArr = this.K0;
            iArr[0] = 0;
            iArr[1] = 0;
            m1(i2, i3, iArr);
            int[] iArr2 = this.K0;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i5 = i10;
            i6 = i9;
            i7 = i2 - i9;
            i8 = i3 - i10;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.z.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.K0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        H(i6, i5, i7, i8, this.I0, i4, iArr3);
        int[] iArr4 = this.K0;
        int i11 = i7 - iArr4[0];
        int i12 = i8 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i13 = this.l0;
        int[] iArr5 = this.I0;
        this.l0 = i13 - iArr5[0];
        this.m0 -= iArr5[1];
        int[] iArr6 = this.J0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !a.i.r.k.b(motionEvent, 8194)) {
                V0(motionEvent.getX(), i11, motionEvent.getY(), i12);
            }
            u(i2, i3);
        }
        if (i6 != 0 || i5 != 0) {
            J(i6, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i6 == 0 && i5 == 0) ? false : true;
    }

    public void m(e0 e0Var, m.c cVar, m.c cVar2) {
        e0Var.L(false);
        if (this.f0.a(e0Var, cVar, cVar2)) {
            R0();
        }
    }

    public final String m0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(InstructionFileId.DOT)) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public void m1(int i2, int i3, int[] iArr) {
        w1();
        L0();
        a.i.n.i.a("RV Scroll");
        R(this.x0);
        int iZ1 = i2 != 0 ? this.w.z1(i2, this.f4809l, this.x0) : 0;
        int iB1 = i3 != 0 ? this.w.B1(i3, this.f4809l, this.x0) : 0;
        a.i.n.i.b();
        f1();
        M0();
        y1(false);
        if (iArr != null) {
            iArr[0] = iZ1;
            iArr[1] = iB1;
        }
    }

    public final void n(e0 e0Var, e0 e0Var2, m.c cVar, m.c cVar2, boolean z2, boolean z3) {
        e0Var.L(false);
        if (z2) {
            g(e0Var);
        }
        if (e0Var != e0Var2) {
            if (z3) {
                g(e0Var2);
            }
            e0Var.f4862i = e0Var2;
            g(e0Var);
            this.f4809l.J(e0Var);
            e0Var2.L(false);
            e0Var2.f4863j = e0Var;
        }
        if (this.f0.b(e0Var, e0Var2, cVar, cVar2)) {
            R0();
        }
    }

    public Rect n0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f4908c) {
            return qVar.f4907b;
        }
        if (this.x0.h() && (qVar.c() || qVar.e())) {
            return qVar.f4907b;
        }
        Rect rect = qVar.f4907b;
        rect.set(0, 0, 0, 0);
        int size = this.z.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.s.set(0, 0, 0, 0);
            this.z.get(i2).g(this.s, view, this, this.x0);
            int i3 = rect.left;
            Rect rect2 = this.s;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f4908c = false;
        return rect;
    }

    public void n1(int i2) {
        if (this.I) {
            return;
        }
        A1();
        p pVar = this.w;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.A1(i2);
            awakenScrollBars();
        }
    }

    public void o(e0 e0Var, m.c cVar, m.c cVar2) {
        g(e0Var);
        e0Var.L(false);
        if (this.f0.c(e0Var, cVar, cVar2)) {
            R0();
        }
    }

    public final void o0(long j2, e0 e0Var, e0 e0Var2) {
        int iG = this.f4812o.g();
        for (int i2 = 0; i2 < iG; i2++) {
            e0 e0VarJ0 = j0(this.f4812o.f(i2));
            if (e0VarJ0 != e0Var && f0(e0VarJ0) == j2) {
                h hVar = this.v;
                if (hVar == null || !hVar.v()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + e0VarJ0 + " \n View Holder 2:" + e0Var + Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + e0VarJ0 + " \n View Holder 2:" + e0Var + Q());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e0Var2 + " cannot be found but it is necessary for " + e0Var + Q());
    }

    public final void o1(h hVar, boolean z2, boolean z3) {
        h hVar2 = this.v;
        if (hVar2 != null) {
            hVar2.V(this.f4808k);
            this.v.J(this);
        }
        if (!z2 || z3) {
            Z0();
        }
        this.f4811n.x();
        h hVar3 = this.v;
        this.v = hVar;
        if (hVar != null) {
            hVar.R(this.f4808k);
            hVar.E(this);
        }
        p pVar = this.w;
        if (pVar != null) {
            pVar.H0(hVar3, this.v);
        }
        this.f4809l.x(hVar3, this.v, z2);
        this.x0.f4836g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = 0;
        this.C = true;
        this.F = this.F && !isLayoutRequested();
        p pVar = this.w;
        if (pVar != null) {
            pVar.B(this);
        }
        this.D0 = false;
        if (f4803f) {
            ThreadLocal<a.y.e.e> threadLocal = a.y.e.e.f3885b;
            a.y.e.e eVar = threadLocal.get();
            this.v0 = eVar;
            if (eVar == null) {
                this.v0 = new a.y.e.e();
                Display displayV = a.i.r.x.v(this);
                float f2 = 60.0f;
                if (!isInEditMode() && displayV != null) {
                    float refreshRate = displayV.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                a.y.e.e eVar2 = this.v0;
                eVar2.f3889f = (long) (1.0E9f / f2);
                threadLocal.set(eVar2);
            }
            this.v0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        a.y.e.e eVar;
        super.onDetachedFromWindow();
        m mVar = this.f0;
        if (mVar != null) {
            mVar.k();
        }
        A1();
        this.C = false;
        p pVar = this.w;
        if (pVar != null) {
            pVar.C(this, this.f4809l);
        }
        this.L0.clear();
        removeCallbacks(this.M0);
        this.p.j();
        if (!f4803f || (eVar = this.v0) == null) {
            return;
        }
        eVar.j(this);
        this.v0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.z.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.z.get(i2).i(canvas, this, this.x0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.w
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.I
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.w
            boolean r0 = r0.m()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.w
            boolean r3 = r3.l()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.w
            boolean r3 = r3.m()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.w
            boolean r3 = r3.l()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6a:
            float r2 = r5.r0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.s0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.D0(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.I) {
            return false;
        }
        this.B = null;
        if (V(motionEvent)) {
            r();
            return true;
        }
        p pVar = this.w;
        if (pVar == null) {
            return false;
        }
        boolean zL = pVar.l();
        boolean zM = this.w.m();
        if (this.i0 == null) {
            this.i0 = VelocityTracker.obtain();
        }
        this.i0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.J) {
                this.J = false;
            }
            this.h0 = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.l0 = x2;
            this.j0 = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.m0 = y2;
            this.k0 = y2;
            if (this.g0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                z1(1);
            }
            int[] iArr = this.J0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = zL;
            if (zM) {
                i2 = (zL ? 1 : 0) | 2;
            }
            x1(i2, 0);
        } else if (actionMasked == 1) {
            this.i0.clear();
            z1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.h0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.h0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.g0 != 1) {
                int i3 = x3 - this.j0;
                int i4 = y3 - this.k0;
                if (!zL || Math.abs(i3) <= this.n0) {
                    z2 = false;
                } else {
                    this.l0 = x3;
                    z2 = true;
                }
                if (zM && Math.abs(i4) > this.n0) {
                    this.m0 = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            r();
        } else if (actionMasked == 5) {
            this.h0 = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.l0 = x4;
            this.j0 = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.m0 = y4;
            this.k0 = y4;
        } else if (actionMasked == 6) {
            O0(motionEvent);
        }
        return this.g0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        a.i.n.i.a("RV OnLayout");
        C();
        a.i.n.i.b();
        this.F = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        p pVar = this.w;
        if (pVar == null) {
            x(i2, i3);
            return;
        }
        boolean z2 = false;
        if (pVar.v0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.w.c1(this.f4809l, this.x0, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.N0 = z2;
            if (z2 || this.v == null) {
                return;
            }
            if (this.x0.f4834e == 1) {
                D();
            }
            this.w.E1(i2, i3);
            this.x0.f4839j = true;
            E();
            this.w.H1(i2, i3);
            if (this.w.K1()) {
                this.w.E1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.x0.f4839j = true;
                E();
                this.w.H1(i2, i3);
            }
            this.O0 = getMeasuredWidth();
            this.P0 = getMeasuredHeight();
            return;
        }
        if (this.D) {
            this.w.c1(this.f4809l, this.x0, i2, i3);
            return;
        }
        if (this.L) {
            w1();
            L0();
            T0();
            M0();
            b0 b0Var = this.x0;
            if (b0Var.f4841l) {
                b0Var.f4837h = true;
            } else {
                this.f4811n.j();
                this.x0.f4837h = false;
            }
            this.L = false;
            y1(false);
        } else if (this.x0.f4841l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.v;
        if (hVar != null) {
            this.x0.f4835f = hVar.o();
        } else {
            this.x0.f4835f = 0;
        }
        w1();
        this.w.c1(this.f4809l, this.x0, i2, i3);
        y1(false);
        this.x0.f4837h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (y0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.f4810m = zVar;
        super.onRestoreInstanceState(zVar.b());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.f4810m;
        if (zVar2 != null) {
            zVar.c(zVar2);
        } else {
            p pVar = this.w;
            zVar.f4926d = pVar != null ? pVar.g1() : null;
        }
        return zVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        w0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[PHI: r0
  0x00dd: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c8, B:46:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(String str) {
        if (y0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + Q());
        }
        if (this.R > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.FLAVOR + Q()));
        }
    }

    public boolean p0() {
        return this.D;
    }

    public boolean p1(e0 e0Var, int i2) {
        if (!y0()) {
            a.i.r.x.y0(e0Var.f4855b, i2);
            return true;
        }
        e0Var.r = i2;
        this.L0.add(e0Var);
        return false;
    }

    public boolean q(e0 e0Var) {
        m mVar = this.f0;
        return mVar == null || mVar.g(e0Var, e0Var.t());
    }

    public boolean q0() {
        return !this.F || this.O || this.f4811n.p();
    }

    public boolean q1(AccessibilityEvent accessibilityEvent) {
        if (!y0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? a.i.r.g0.b.a(accessibilityEvent) : 0;
        this.K |= iA != 0 ? iA : 0;
        return true;
    }

    public final void r() {
        i1();
        setScrollState(0);
    }

    public final boolean r0() {
        int iG = this.f4812o.g();
        for (int i2 = 0; i2 < iG; i2++) {
            e0 e0VarJ0 = j0(this.f4812o.f(i2));
            if (e0VarJ0 != null && !e0VarJ0.O() && e0VarJ0.D()) {
                return true;
            }
        }
        return false;
    }

    public void r1(int i2, int i3) {
        s1(i2, i3, null);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        e0 e0VarJ0 = j0(view);
        if (e0VarJ0 != null) {
            if (e0VarJ0.C()) {
                e0VarJ0.i();
            } else if (!e0VarJ0.O()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + e0VarJ0 + Q());
            }
        }
        view.clearAnimation();
        A(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.w.e1(this, this.x0, view, view2) && view2 != null) {
            g1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.w.u1(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.A.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A.get(i2).e(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.G != 0 || this.I) {
            this.H = true;
        } else {
            super.requestLayout();
        }
    }

    public void s0() {
        this.f4811n = new a.y.e.a(new f());
    }

    public void s1(int i2, int i3, Interpolator interpolator) {
        t1(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        p pVar = this.w;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.I) {
            return;
        }
        boolean zL = pVar.l();
        boolean zM = this.w.m();
        if (zL || zM) {
            if (!zL) {
                i2 = 0;
            }
            if (!zM) {
                i3 = 0;
            }
            l1(i2, i3, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (q1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(a.y.e.n nVar) {
        this.E0 = nVar;
        a.i.r.x.p0(this, nVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        o1(hVar, false, true);
        U0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == this.F0) {
            return;
        }
        this.F0 = kVar;
        setChildrenDrawingOrderEnabled(kVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.q) {
            w0();
        }
        this.q = z2;
        super.setClipToPadding(z2);
        if (this.F) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        a.i.q.i.e(lVar);
        this.S = lVar;
        w0();
    }

    public void setHasFixedSize(boolean z2) {
        this.D = z2;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.f0;
        if (mVar2 != null) {
            mVar2.k();
            this.f0.w(null);
        }
        this.f0 = mVar;
        if (mVar != null) {
            mVar.w(this.C0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.f4809l.G(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.w) {
            return;
        }
        A1();
        if (this.w != null) {
            m mVar = this.f0;
            if (mVar != null) {
                mVar.k();
            }
            this.w.n1(this.f4809l);
            this.w.o1(this.f4809l);
            this.f4809l.c();
            if (this.C) {
                this.w.C(this, this.f4809l);
            }
            this.w.I1(null);
            this.w = null;
        } else {
            this.f4809l.c();
        }
        this.f4812o.o();
        this.w = pVar;
        if (pVar != null) {
            if (pVar.f4886b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f4886b.Q());
            }
            pVar.I1(this);
            if (this.C) {
                this.w.B(this);
            }
        }
        this.f4809l.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().m(z2);
    }

    public void setOnFlingListener(s sVar) {
        this.o0 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.y0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.t0 = z2;
    }

    public void setRecycledViewPool(v vVar) {
        this.f4809l.E(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.x = xVar;
    }

    public void setScrollState(int i2) {
        if (i2 == this.g0) {
            return;
        }
        this.g0 = i2;
        if (i2 != 2) {
            B1();
        }
        I(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i2 != 1) {
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.n0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(c0 c0Var) {
        this.f4809l.F(c0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().o(i2);
    }

    @Override // android.view.View, a.i.r.l
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.I) {
            p("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.I = true;
                this.J = true;
                A1();
                return;
            }
            this.I = false;
            if (this.H && this.w != null && this.v != null) {
                requestLayout();
            }
            this.H = false;
        }
    }

    public void t() {
        int iJ = this.f4812o.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            e0 e0VarJ0 = j0(this.f4812o.i(i2));
            if (!e0VarJ0.O()) {
                e0VarJ0.f();
            }
        }
        this.f4809l.d();
    }

    @SuppressLint({"InlinedApi"})
    public final void t0() {
        if (a.i.r.x.B(this) == 0) {
            a.i.r.x.z0(this, 8);
        }
    }

    public void t1(int i2, int i3, Interpolator interpolator, int i4) {
        u1(i2, i3, interpolator, i4, false);
    }

    public void u(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.T;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.T.onRelease();
            zIsFinished = this.T.isFinished();
        }
        EdgeEffect edgeEffect2 = this.V;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.V.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.U.onRelease();
            zIsFinished |= this.U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.W;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.W.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        if (zIsFinished) {
            a.i.r.x.g0(this);
        }
    }

    public final void u0() {
        this.f4812o = new a.y.e.b(new e());
    }

    public void u1(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        p pVar = this.w;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.I) {
            return;
        }
        if (!pVar.l()) {
            i2 = 0;
        }
        if (!this.w.m()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (!(i4 == Integer.MIN_VALUE || i4 > 0)) {
            scrollBy(i2, i3);
            return;
        }
        if (z2) {
            int i5 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i5 |= 2;
            }
            x1(i5, 1);
        }
        this.u0.e(i2, i3, i4, interpolator);
    }

    public void v() {
        if (!this.F || this.O) {
            a.i.n.i.a("RV FullInvalidate");
            C();
            a.i.n.i.b();
            return;
        }
        if (this.f4811n.p()) {
            if (this.f4811n.o(4) && !this.f4811n.o(11)) {
                a.i.n.i.a("RV PartialInvalidate");
                w1();
                L0();
                this.f4811n.v();
                if (!this.H) {
                    if (r0()) {
                        C();
                    } else {
                        this.f4811n.i();
                    }
                }
                y1(true);
                M0();
            } else {
                if (!this.f4811n.p()) {
                    return;
                }
                a.i.n.i.a("RV FullInvalidate");
                C();
            }
            a.i.n.i.b();
        }
    }

    public void v0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new a.y.e.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(a.y.b.f3779a), resources.getDimensionPixelSize(a.y.b.f3781c), resources.getDimensionPixelOffset(a.y.b.f3780b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + Q());
        }
    }

    public void v1(int i2) {
        if (this.I) {
            return;
        }
        p pVar = this.w;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.M1(this, this.x0, i2);
        }
    }

    public final void w(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strM0 = m0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strM0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                Object[] objArr = null;
                try {
                    constructor = clsAsSubclass.getConstructor(f4806i);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strM0, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strM0, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strM0, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strM0, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM0, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM0, e8);
            }
        }
    }

    public void w0() {
        this.W = null;
        this.U = null;
        this.V = null;
        this.T = null;
    }

    public void w1() {
        int i2 = this.G + 1;
        this.G = i2;
        if (i2 != 1 || this.I) {
            return;
        }
        this.H = false;
    }

    public void x(int i2, int i3) {
        setMeasuredDimension(p.o(i2, getPaddingLeft() + getPaddingRight(), a.i.r.x.E(this)), p.o(i3, getPaddingTop() + getPaddingBottom(), a.i.r.x.D(this)));
    }

    public boolean x0() {
        AccessibilityManager accessibilityManager = this.M;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean x1(int i2, int i3) {
        return getScrollingChildHelper().p(i2, i3);
    }

    public final boolean y(int i2, int i3) {
        W(this.G0);
        int[] iArr = this.G0;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    public boolean y0() {
        return this.Q > 0;
    }

    public void y1(boolean z2) {
        if (this.G < 1) {
            this.G = 1;
        }
        if (!z2 && !this.I) {
            this.H = false;
        }
        if (this.G == 1) {
            if (z2 && this.H && !this.I && this.w != null && this.v != null) {
                C();
            }
            if (!this.I) {
                this.H = false;
            }
        }
        this.G--;
    }

    public void z(View view) {
        e0 e0VarJ0 = j0(view);
        J0(view);
        h hVar = this.v;
        if (hVar != null && e0VarJ0 != null) {
            hVar.N(e0VarJ0);
        }
        List<r> list = this.N;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.N.get(size).d(view);
            }
        }
    }

    public final boolean z0(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || view2 == view || T(view2) == null) {
            return false;
        }
        if (view == null || T(view) == null) {
            return true;
        }
        this.s.set(0, 0, view.getWidth(), view.getHeight());
        this.t.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.s);
        offsetDescendantRectToMyCoords(view2, this.t);
        byte b2 = -1;
        int i4 = this.w.b0() == 1 ? -1 : 1;
        Rect rect = this.s;
        int i5 = rect.left;
        Rect rect2 = this.t;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            b2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                b2 = 0;
            }
        }
        if (i2 == 1) {
            return b2 < 0 || (b2 == 0 && i3 * i4 < 0);
        }
        if (i2 == 2) {
            return b2 > 0 || (b2 == 0 && i3 * i4 > 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return b2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return b2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + Q());
    }

    public void z1(int i2) {
        getScrollingChildHelper().r(i2);
    }
}

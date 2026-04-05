package a.k.b;

import a.i.r.x;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Interpolator f2196a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2198c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f2200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f2201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f2202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f2203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f2204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f2205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f2206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public VelocityTracker f2208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f2209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f2210o;
    public int p;
    public final int q;
    public int r;
    public OverScroller s;
    public final c t;
    public View u;
    public boolean v;
    public final ViewGroup w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2199d = -1;
    public final Runnable x = new b();

    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.E(0);
        }
    }

    public static abstract class c {
        public abstract int a(View view, int i2, int i3);

        public abstract int b(View view, int i2, int i3);

        public int c(int i2) {
            return i2;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i2, int i3) {
        }

        public boolean g(int i2) {
            return false;
        }

        public void h(int i2, int i3) {
        }

        public void i(View view, int i2) {
        }

        public abstract void j(int i2);

        public abstract void k(View view, int i2, int i3, int i4, int i5);

        public abstract void l(View view, float f2, float f3);

        public abstract boolean m(View view, int i2);
    }

    public d(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.w = viewGroup;
        this.t = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.q = i2;
        this.p = i2;
        this.f2198c = viewConfiguration.getScaledTouchSlop();
        this.f2209n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2210o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.s = new OverScroller(context, f2196a);
    }

    public static d l(ViewGroup viewGroup, float f2, c cVar) {
        d dVarM = m(viewGroup, cVar);
        dVarM.f2198c = (int) (dVarM.f2198c * (1.0f / f2));
        return dVarM;
    }

    public static d m(ViewGroup viewGroup, c cVar) {
        return new d(viewGroup.getContext(), viewGroup, cVar);
    }

    public final void A() {
        this.f2208m.computeCurrentVelocity(1000, this.f2209n);
        n(e(this.f2208m.getXVelocity(this.f2199d), this.f2210o, this.f2209n), e(this.f2208m.getYVelocity(this.f2199d), this.f2210o, this.f2209n));
    }

    public final void B(float f2, float f3, int i2) {
        int i3 = c(f2, f3, i2, 1) ? 1 : 0;
        if (c(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (c(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (c(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.f2205j;
            iArr[i2] = iArr[i2] | i3;
            this.t.f(i3, i2);
        }
    }

    public final void C(float f2, float f3, int i2) {
        q(i2);
        float[] fArr = this.f2200e;
        this.f2202g[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f2201f;
        this.f2203h[i2] = f3;
        fArr2[i2] = f3;
        this.f2204i[i2] = t((int) f2, (int) f3);
        this.f2207l |= 1 << i2;
    }

    public final void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (x(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f2202g[pointerId] = x;
                this.f2203h[pointerId] = y;
            }
        }
    }

    public void E(int i2) {
        this.w.removeCallbacks(this.x);
        if (this.f2197b != i2) {
            this.f2197b = i2;
            this.t.j(i2);
            if (this.f2197b == 0) {
                this.u = null;
            }
        }
    }

    public boolean F(int i2, int i3) {
        if (this.v) {
            return s(i2, i3, (int) this.f2208m.getXVelocity(this.f2199d), (int) this.f2208m.getYVelocity(this.f2199d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k.b.d.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i2, int i3) {
        this.u = view;
        this.f2199d = -1;
        boolean zS = s(i2, i3, 0, 0);
        if (!zS && this.f2197b == 0 && this.u != null) {
            this.u = null;
        }
        return zS;
    }

    public boolean I(View view, int i2) {
        if (view == this.u && this.f2199d == i2) {
            return true;
        }
        if (view == null || !this.t.m(view, i2)) {
            return false;
        }
        this.f2199d = i2;
        b(view, i2);
        return true;
    }

    public void a() {
        this.f2199d = -1;
        g();
        VelocityTracker velocityTracker = this.f2208m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2208m = null;
        }
    }

    public void b(View view, int i2) {
        if (view.getParent() == this.w) {
            this.u = view;
            this.f2199d = i2;
            this.t.i(view, i2);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.w + ")");
    }

    public final boolean c(float f2, float f3, int i2, int i3) {
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f3);
        if ((this.f2204i[i2] & i3) != i3 || (this.r & i3) == 0 || (this.f2206k[i2] & i3) == i3 || (this.f2205j[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f2198c;
        if (fAbs <= i4 && fAbs2 <= i4) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.t.g(i3)) {
            return (this.f2205j[i2] & i3) == 0 && fAbs > ((float) this.f2198c);
        }
        int[] iArr = this.f2206k;
        iArr[i2] = iArr[i2] | i3;
        return false;
    }

    public final boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.t.d(view) > 0;
        boolean z2 = this.t.e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f2198c) : z2 && Math.abs(f3) > ((float) this.f2198c);
        }
        float f4 = (f2 * f2) + (f3 * f3);
        int i2 = this.f2198c;
        return f4 > ((float) (i2 * i2));
    }

    public final float e(float f2, float f3, float f4) {
        float fAbs = Math.abs(f2);
        if (fAbs < f3) {
            return 0.0f;
        }
        return fAbs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    public final int f(int i2, int i3, int i4) {
        int iAbs = Math.abs(i2);
        if (iAbs < i3) {
            return 0;
        }
        return iAbs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    public final void g() {
        float[] fArr = this.f2200e;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f2201f, 0.0f);
        Arrays.fill(this.f2202g, 0.0f);
        Arrays.fill(this.f2203h, 0.0f);
        Arrays.fill(this.f2204i, 0);
        Arrays.fill(this.f2205j, 0);
        Arrays.fill(this.f2206k, 0);
        this.f2207l = 0;
    }

    public final void h(int i2) {
        if (this.f2200e == null || !w(i2)) {
            return;
        }
        this.f2200e[i2] = 0.0f;
        this.f2201f[i2] = 0.0f;
        this.f2202g[i2] = 0.0f;
        this.f2203h[i2] = 0.0f;
        this.f2204i[i2] = 0;
        this.f2205j[i2] = 0;
        this.f2206k[i2] = 0;
        this.f2207l = ((1 << i2) ^ (-1)) & this.f2207l;
    }

    public final int i(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.w.getWidth();
        float f2 = width / 2;
        float fO = f2 + (o(Math.min(1.0f, Math.abs(i2) / width)) * f2);
        int iAbs = Math.abs(i3);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fO / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), IjkMediaCodecInfo.RANK_LAST_CHANCE);
    }

    public final int j(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int iF = f(i4, (int) this.f2210o, (int) this.f2209n);
        int iF2 = f(i5, (int) this.f2210o, (int) this.f2209n);
        int iAbs = Math.abs(i2);
        int iAbs2 = Math.abs(i3);
        int iAbs3 = Math.abs(iF);
        int iAbs4 = Math.abs(iF2);
        int i6 = iAbs3 + iAbs4;
        int i7 = iAbs + iAbs2;
        if (iF != 0) {
            f2 = iAbs3;
            f3 = i6;
        } else {
            f2 = iAbs;
            f3 = i7;
        }
        float f6 = f2 / f3;
        if (iF2 != 0) {
            f4 = iAbs4;
            f5 = i6;
        } else {
            f4 = iAbs2;
            f5 = i7;
        }
        return (int) ((i(i2, iF, this.t.d(view)) * f6) + (i(i3, iF2, this.t.e(view)) * (f4 / f5)));
    }

    public boolean k(boolean z) {
        if (this.f2197b == 2) {
            boolean zComputeScrollOffset = this.s.computeScrollOffset();
            int currX = this.s.getCurrX();
            int currY = this.s.getCurrY();
            int left = currX - this.u.getLeft();
            int top = currY - this.u.getTop();
            if (left != 0) {
                x.Z(this.u, left);
            }
            if (top != 0) {
                x.a0(this.u, top);
            }
            if (left != 0 || top != 0) {
                this.t.k(this.u, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.s.getFinalX() && currY == this.s.getFinalY()) {
                this.s.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.w.post(this.x);
                } else {
                    E(0);
                }
            }
        }
        return this.f2197b == 2;
    }

    public final void n(float f2, float f3) {
        this.v = true;
        this.t.l(this.u, f2, f3);
        this.v = false;
        if (this.f2197b == 1) {
            E(0);
        }
    }

    public final float o(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    public final void p(int i2, int i3, int i4, int i5) {
        int left = this.u.getLeft();
        int top = this.u.getTop();
        if (i4 != 0) {
            i2 = this.t.a(this.u, i2, i4);
            x.Z(this.u, i2 - left);
        }
        int i6 = i2;
        if (i5 != 0) {
            i3 = this.t.b(this.u, i3, i5);
            x.a0(this.u, i3 - top);
        }
        int i7 = i3;
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.t.k(this.u, i6, i7, i6 - left, i7 - top);
    }

    public final void q(int i2) {
        float[] fArr = this.f2200e;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2201f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2202g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2203h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2204i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2205j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2206k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2200e = fArr2;
            this.f2201f = fArr3;
            this.f2202g = fArr4;
            this.f2203h = fArr5;
            this.f2204i = iArr;
            this.f2205j = iArr2;
            this.f2206k = iArr3;
        }
    }

    public View r(int i2, int i3) {
        for (int childCount = this.w.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.w.getChildAt(this.t.c(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean s(int i2, int i3, int i4, int i5) {
        int left = this.u.getLeft();
        int top = this.u.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.s.abortAnimation();
            E(0);
            return false;
        }
        this.s.startScroll(left, top, i6, i7, j(this.u, i6, i7, i4, i5));
        E(2);
        return true;
    }

    public final int t(int i2, int i3) {
        int i4 = i2 < this.w.getLeft() + this.p ? 1 : 0;
        if (i3 < this.w.getTop() + this.p) {
            i4 |= 4;
        }
        if (i2 > this.w.getRight() - this.p) {
            i4 |= 2;
        }
        return i3 > this.w.getBottom() - this.p ? i4 | 8 : i4;
    }

    public int u() {
        return this.f2198c;
    }

    public boolean v(int i2, int i3) {
        return y(this.u, i2, i3);
    }

    public boolean w(int i2) {
        return ((1 << i2) & this.f2207l) != 0;
    }

    public final boolean x(int i2) {
        if (w(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean y(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2208m == null) {
            this.f2208m = VelocityTracker.obtain();
        }
        this.f2208m.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewR = r((int) x, (int) y);
            C(x, y, pointerId);
            I(viewR, pointerId);
            int i4 = this.f2204i[pointerId];
            int i5 = this.r;
            if ((i4 & i5) != 0) {
                this.t.h(i4 & i5, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f2197b != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i3 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i3);
                        if (x(pointerId2)) {
                            float x2 = motionEvent.getX(i3);
                            float y2 = motionEvent.getY(i3);
                            float f2 = x2 - this.f2200e[pointerId2];
                            float f3 = y2 - this.f2201f[pointerId2];
                            B(f2, f3, pointerId2);
                            if (this.f2197b != 1) {
                                View viewR2 = r((int) x2, (int) y2);
                                if (d(viewR2, f2, f3) && I(viewR2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i3++;
                    }
                } else {
                    if (!x(this.f2199d)) {
                        return;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f2199d);
                    float x3 = motionEvent.getX(iFindPointerIndex);
                    float y3 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f2202g;
                    int i6 = this.f2199d;
                    int i7 = (int) (x3 - fArr[i6]);
                    int i8 = (int) (y3 - this.f2203h[i6]);
                    p(this.u.getLeft() + i7, this.u.getTop() + i8, i7, i8);
                }
                D(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x4 = motionEvent.getX(actionIndex);
                    float y4 = motionEvent.getY(actionIndex);
                    C(x4, y4, pointerId3);
                    if (this.f2197b != 0) {
                        if (v((int) x4, (int) y4)) {
                            I(this.u, pointerId3);
                            return;
                        }
                        return;
                    } else {
                        I(r((int) x4, (int) y4), pointerId3);
                        int i9 = this.f2204i[pointerId3];
                        int i10 = this.r;
                        if ((i9 & i10) != 0) {
                            this.t.h(i9 & i10, pointerId3);
                            return;
                        }
                        return;
                    }
                }
                if (actionMasked != 6) {
                    return;
                }
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f2197b == 1 && pointerId4 == this.f2199d) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i3 >= pointerCount2) {
                            i2 = -1;
                            break;
                        }
                        int pointerId5 = motionEvent.getPointerId(i3);
                        if (pointerId5 != this.f2199d) {
                            View viewR3 = r((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                            View view = this.u;
                            if (viewR3 == view && I(view, pointerId5)) {
                                i2 = this.f2199d;
                                break;
                            }
                        }
                        i3++;
                    }
                    if (i2 == -1) {
                        A();
                    }
                }
                h(pointerId4);
                return;
            }
            if (this.f2197b == 1) {
                n(0.0f, 0.0f);
            }
        } else if (this.f2197b == 1) {
            A();
        }
        a();
    }
}

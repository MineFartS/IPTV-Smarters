package c.f.a.d.n;

import a.i.r.x;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<V extends View> extends c<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f15068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OverScroller f15069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VelocityTracker f15074j;

    /* JADX INFO: renamed from: c.f.a.d.n.a$a, reason: collision with other inner class name */
    public class RunnableC0169a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CoordinatorLayout f15075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final V f15076c;

        public RunnableC0169a(CoordinatorLayout coordinatorLayout, V v) {
            this.f15075b = coordinatorLayout;
            this.f15076c = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f15076c == null || (overScroller = a.this.f15069e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                a.this.N(this.f15075b, this.f15076c);
                return;
            }
            a aVar = a.this;
            aVar.P(this.f15075b, this.f15076c, aVar.f15069e.getCurrY());
            x.h0(this.f15076c, this);
        }
    }

    public a() {
        this.f15071g = -1;
        this.f15073i = -1;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15071g = -1;
        this.f15073i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = 1
            goto L1c
        L1b:
            r12 = 0
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f15071g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f15072h = r12
            goto L4c
        L2d:
            int r0 = r11.f15071g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f15072h
            int r7 = r1 - r0
            r11.f15072h = r0
            int r8 = r11.K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.O(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f15074j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f15074j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f15074j
            int r4 = r11.f15071g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.J(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.f15070f = r3
            r11.f15071g = r1
            android.view.VelocityTracker r13 = r11.f15074j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f15074j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f15074j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f15070f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.d.n.a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract boolean H(V v);

    public final void I() {
        if (this.f15074j == null) {
            this.f15074j = VelocityTracker.obtain();
        }
    }

    public final boolean J(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, float f2) {
        Runnable runnable = this.f15068d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f15068d = null;
        }
        if (this.f15069e == null) {
            this.f15069e = new OverScroller(v.getContext());
        }
        this.f15069e.fling(0, E(), 0, Math.round(f2), 0, 0, i2, i3);
        if (!this.f15069e.computeScrollOffset()) {
            N(coordinatorLayout, v);
            return false;
        }
        RunnableC0169a runnableC0169a = new RunnableC0169a(coordinatorLayout, v);
        this.f15068d = runnableC0169a;
        x.h0(v, runnableC0169a);
        return true;
    }

    public abstract int K(V v);

    public abstract int L(V v);

    public abstract int M();

    public abstract void N(CoordinatorLayout coordinatorLayout, V v);

    public final int O(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return Q(coordinatorLayout, v, M() - i2, i3, i4);
    }

    public int P(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return Q(coordinatorLayout, v, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public abstract int Q(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f15073i < 0) {
            this.f15073i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f15070f) {
            int i2 = this.f15071g;
            if (i2 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.f15072h) > this.f15073i) {
                this.f15072h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f15071g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = H(v) && coordinatorLayout.C(v, x, y2);
            this.f15070f = z;
            if (z) {
                this.f15072h = y2;
                this.f15071g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f15069e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f15069e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f15074j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}

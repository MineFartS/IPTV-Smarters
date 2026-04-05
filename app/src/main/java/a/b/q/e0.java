package a.b.q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f603j = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = e0.this.f598e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.e();
        }
    }

    public e0(View view) {
        this.f598e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f595b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f596c = tapTimeout;
        this.f597d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    public final void a() {
        Runnable runnable = this.f600g;
        if (runnable != null) {
            this.f598e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f599f;
        if (runnable2 != null) {
            this.f598e.removeCallbacks(runnable2);
        }
    }

    public abstract a.b.p.j.p b();

    public abstract boolean c();

    public boolean d() {
        a.b.p.j.p pVarB = b();
        if (pVarB == null || !pVarB.a()) {
            return true;
        }
        pVarB.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f598e;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f601h = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        c0 c0Var;
        View view = this.f598e;
        a.b.p.j.p pVarB = b();
        if (pVarB == null || !pVarB.a() || (c0Var = (c0) pVarB.i()) == null || !c0Var.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, motionEventObtainNoHistory);
        j(c0Var, motionEventObtainNoHistory);
        boolean zE = c0Var.e(motionEventObtainNoHistory, this.f602i);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zE && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f598e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f602i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f595b
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f602i = r6
            java.lang.Runnable r6 = r5.f599f
            if (r6 != 0) goto L52
            a.b.q.e0$a r6 = new a.b.q.e0$a
            r6.<init>()
            r5.f599f = r6
        L52:
            java.lang.Runnable r6 = r5.f599f
            int r1 = r5.f596c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f600g
            if (r6 != 0) goto L65
            a.b.q.e0$b r6 = new a.b.q.e0$b
            r6.<init>()
            r5.f600g = r6
        L65:
            java.lang.Runnable r6 = r5.f600g
            int r1 = r5.f597d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.q.e0.g(android.view.MotionEvent):boolean");
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f603j);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f603j);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f601h;
        if (z2) {
            z = f(motionEvent) || !d();
        } else {
            z = g(motionEvent) && c();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f598e.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f601h = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f601h = false;
        this.f602i = -1;
        Runnable runnable = this.f599f;
        if (runnable != null) {
            this.f598e.removeCallbacks(runnable);
        }
    }
}

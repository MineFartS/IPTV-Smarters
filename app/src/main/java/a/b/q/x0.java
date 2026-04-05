package a.b.q;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public class x0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static x0 f845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static x0 f846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f850g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f851h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y0 f854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f855l;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.g(false);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.c();
        }
    }

    public x0(View view, CharSequence charSequence) {
        this.f847d = view;
        this.f848e = charSequence;
        this.f849f = a.i.r.y.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void e(x0 x0Var) {
        x0 x0Var2 = f845b;
        if (x0Var2 != null) {
            x0Var2.a();
        }
        f845b = x0Var;
        if (x0Var != null) {
            x0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        x0 x0Var = f845b;
        if (x0Var != null && x0Var.f847d == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new x0(view, charSequence);
            return;
        }
        x0 x0Var2 = f846c;
        if (x0Var2 != null && x0Var2.f847d == view) {
            x0Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void a() {
        this.f847d.removeCallbacks(this.f850g);
    }

    public final void b() {
        this.f852i = Integer.MAX_VALUE;
        this.f853j = Integer.MAX_VALUE;
    }

    public void c() {
        if (f846c == this) {
            f846c = null;
            y0 y0Var = this.f854k;
            if (y0Var != null) {
                y0Var.c();
                this.f854k = null;
                b();
                this.f847d.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f845b == this) {
            e(null);
        }
        this.f847d.removeCallbacks(this.f851h);
    }

    public final void d() {
        this.f847d.postDelayed(this.f850g, ViewConfiguration.getLongPressTimeout());
    }

    public void g(boolean z) {
        long longPressTimeout;
        if (a.i.r.x.T(this.f847d)) {
            e(null);
            x0 x0Var = f846c;
            if (x0Var != null) {
                x0Var.c();
            }
            f846c = this;
            this.f855l = z;
            y0 y0Var = new y0(this.f847d.getContext());
            this.f854k = y0Var;
            y0Var.e(this.f847d, this.f852i, this.f853j, this.f855l, this.f848e);
            this.f847d.addOnAttachStateChangeListener(this);
            if (this.f855l) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((a.i.r.x.N(this.f847d) & 1) == 1 ? 3000L : 15000L) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f847d.removeCallbacks(this.f851h);
            this.f847d.postDelayed(this.f851h, longPressTimeout);
        }
    }

    public final boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f852i) <= this.f849f && Math.abs(y - this.f853j) <= this.f849f) {
            return false;
        }
        this.f852i = x;
        this.f853j = y;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f854k != null && this.f855l) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f847d.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f847d.isEnabled() && this.f854k == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f852i = view.getWidth() / 2;
        this.f853j = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}

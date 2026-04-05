package a.i.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<View> f1969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f1970b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f1971c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1972d = -1;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0 f1973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f1974c;

        public a(c0 c0Var, View view) {
            this.f1973b = c0Var;
            this.f1974c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1973b.a(this.f1974c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1973b.b(this.f1974c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1973b.c(this.f1974c);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f1976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f1977c;

        public b(e0 e0Var, View view) {
            this.f1976b = e0Var;
            this.f1977c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f1976b.a(this.f1977c);
        }
    }

    public static class c implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b0 f1979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1980b;

        public c(b0 b0Var) {
            this.f1979a = b0Var;
        }

        @Override // a.i.r.c0
        public void a(View view) {
            Object tag = view.getTag(2113929216);
            c0 c0Var = tag instanceof c0 ? (c0) tag : null;
            if (c0Var != null) {
                c0Var.a(view);
            }
        }

        @Override // a.i.r.c0
        @SuppressLint({"WrongConstant"})
        public void b(View view) {
            int i2 = this.f1979a.f1972d;
            if (i2 > -1) {
                view.setLayerType(i2, null);
                this.f1979a.f1972d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f1980b) {
                b0 b0Var = this.f1979a;
                Runnable runnable = b0Var.f1971c;
                if (runnable != null) {
                    b0Var.f1971c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                c0 c0Var = tag instanceof c0 ? (c0) tag : null;
                if (c0Var != null) {
                    c0Var.b(view);
                }
                this.f1980b = true;
            }
        }

        @Override // a.i.r.c0
        public void c(View view) {
            this.f1980b = false;
            if (this.f1979a.f1972d > -1) {
                view.setLayerType(2, null);
            }
            b0 b0Var = this.f1979a;
            Runnable runnable = b0Var.f1970b;
            if (runnable != null) {
                b0Var.f1970b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            c0 c0Var = tag instanceof c0 ? (c0) tag : null;
            if (c0Var != null) {
                c0Var.c(view);
            }
        }
    }

    public b0(View view) {
        this.f1969a = new WeakReference<>(view);
    }

    public b0 a(float f2) {
        View view = this.f1969a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = this.f1969a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.f1969a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public b0 d(float f2) {
        View view = this.f1969a.get();
        if (view != null) {
            view.animate().scaleX(f2);
        }
        return this;
    }

    public b0 e(float f2) {
        View view = this.f1969a.get();
        if (view != null) {
            view.animate().scaleY(f2);
        }
        return this;
    }

    public b0 f(long j2) {
        View view = this.f1969a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public b0 g(Interpolator interpolator) {
        View view = this.f1969a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public b0 h(c0 c0Var) {
        View view = this.f1969a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, c0Var);
                c0Var = new c(this);
            }
            i(view, c0Var);
        }
        return this;
    }

    public final void i(View view, c0 c0Var) {
        if (c0Var != null) {
            view.animate().setListener(new a(c0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public b0 j(long j2) {
        View view = this.f1969a.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    public b0 k(e0 e0Var) {
        View view = this.f1969a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(e0Var != null ? new b(e0Var, view) : null);
        }
        return this;
    }

    public void l() {
        View view = this.f1969a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public b0 m(float f2) {
        View view = this.f1969a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }

    @SuppressLint({"WrongConstant"})
    public b0 n() {
        View view = this.f1969a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                view.animate().withLayer();
            } else {
                this.f1972d = view.getLayerType();
                i(view, new c(this));
            }
        }
        return this;
    }
}

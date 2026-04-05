package a.n.q;

import android.animation.TimeAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    public static class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2811b;

        public a(int i2, boolean z) {
            if (!h.b(i2)) {
                throw new IllegalArgumentException("Unhandled zoom index");
            }
            this.f2810a = i2;
            this.f2811b = z;
        }

        @Override // a.n.q.g
        public void a(View view, boolean z) {
            view.setSelected(z);
            c(view).a(z, false);
        }

        @Override // a.n.q.g
        public void b(View view) {
            c(view).a(false, true);
        }

        public final b c(View view) {
            int i2 = a.n.f.f2620k;
            b bVar = (b) view.getTag(i2);
            if (bVar != null) {
                return bVar;
            }
            b bVar2 = new b(view, d(view.getResources()), this.f2811b, 150);
            view.setTag(i2, bVar2);
            return bVar2;
        }

        public final float d(Resources resources) {
            int i2 = this.f2810a;
            if (i2 == 0) {
                return 1.0f;
            }
            return resources.getFraction(h.a(i2), 1, 1);
        }
    }

    public static class b implements TimeAnimator.TimeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f2812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s0 f2814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f2815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2816e = 0.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f2817f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2818g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TimeAnimator f2819h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Interpolator f2820i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a.n.n.a f2821j;

        public b(View view, float f2, boolean z, int i2) {
            TimeAnimator timeAnimator = new TimeAnimator();
            this.f2819h = timeAnimator;
            this.f2820i = new AccelerateDecelerateInterpolator();
            this.f2812a = view;
            this.f2813b = i2;
            this.f2815d = f2 - 1.0f;
            if (view instanceof s0) {
                this.f2814c = (s0) view;
            } else {
                this.f2814c = null;
            }
            timeAnimator.setTimeListener(this);
            if (z) {
                this.f2821j = a.n.n.a.a(view.getContext());
            } else {
                this.f2821j = null;
            }
        }

        public void a(boolean z, boolean z2) {
            b();
            float f2 = z ? 1.0f : 0.0f;
            if (z2) {
                c(f2);
                return;
            }
            float f3 = this.f2816e;
            if (f3 != f2) {
                this.f2817f = f3;
                this.f2818g = f2 - f3;
                this.f2819h.start();
            }
        }

        public void b() {
            this.f2819h.end();
        }

        public void c(float f2) {
            this.f2816e = f2;
            float f3 = (this.f2815d * f2) + 1.0f;
            this.f2812a.setScaleX(f3);
            this.f2812a.setScaleY(f3);
            s0 s0Var = this.f2814c;
            if (s0Var != null) {
                s0Var.setShadowFocusLevel(f2);
            } else {
                t0.i(this.f2812a, f2);
            }
            a.n.n.a aVar = this.f2821j;
            if (aVar != null) {
                aVar.c(f2);
                int color = this.f2821j.b().getColor();
                s0 s0Var2 = this.f2814c;
                if (s0Var2 != null) {
                    s0Var2.setOverlayColor(color);
                } else {
                    t0.h(this.f2812a, color);
                }
            }
        }

        @Override // android.animation.TimeAnimator.TimeListener
        public void onTimeUpdate(TimeAnimator timeAnimator, long j2, long j3) {
            float interpolation;
            int i2 = this.f2813b;
            if (j2 >= i2) {
                interpolation = 1.0f;
                this.f2819h.end();
            } else {
                double d2 = j2;
                double d3 = i2;
                Double.isNaN(d2);
                Double.isNaN(d3);
                interpolation = (float) (d2 / d3);
            }
            Interpolator interpolator = this.f2820i;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(interpolation);
            }
            c(this.f2817f + (interpolation * this.f2818g));
        }
    }

    public static int a(int i2) {
        if (i2 == 1) {
            return a.n.e.f2604d;
        }
        if (i2 == 2) {
            return a.n.e.f2603c;
        }
        if (i2 == 3) {
            return a.n.e.f2602b;
        }
        if (i2 != 4) {
            return 0;
        }
        return a.n.e.f2605e;
    }

    public static boolean b(int i2) {
        return i2 == 0 || a(i2) > 0;
    }

    public static void c(s sVar, int i2, boolean z) {
        sVar.o0(new a(i2, z));
    }
}

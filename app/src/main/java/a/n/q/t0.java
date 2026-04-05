package a.n.q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2929a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2936h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2939c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2941e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2940d = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f2942f = b.f2943a;

        /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a.n.q.t0 a(android.content.Context r5) {
            /*
                r4 = this;
                a.n.q.t0 r0 = new a.n.q.t0
                r0.<init>()
                boolean r1 = r4.f2937a
                r0.f2930b = r1
                boolean r1 = r4.f2938b
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L17
                boolean r1 = a.n.q.t0.p()
                if (r1 == 0) goto L17
                r1 = 1
                goto L18
            L17:
                r1 = 0
            L18:
                r0.f2931c = r1
                boolean r1 = r4.f2939c
                if (r1 == 0) goto L26
                boolean r1 = a.n.q.t0.q()
                if (r1 == 0) goto L26
                r1 = 1
                goto L27
            L26:
                r1 = 0
            L27:
                r0.f2932d = r1
                boolean r1 = r0.f2931c
                if (r1 == 0) goto L32
                a.n.q.t0$b r1 = r4.f2942f
                r0.m(r1, r5)
            L32:
                boolean r1 = r0.f2932d
                if (r1 == 0) goto L5e
                boolean r1 = r4.f2940d
                if (r1 == 0) goto L58
                boolean r1 = a.n.q.t0.n()
                if (r1 != 0) goto L41
                goto L58
            L41:
                r1 = 3
                r0.f2929a = r1
                a.n.q.t0$b r1 = r4.f2942f
                r0.l(r1, r5)
                boolean r5 = a.n.q.t0.o()
                if (r5 == 0) goto L53
                boolean r5 = r4.f2941e
                if (r5 == 0) goto L6f
            L53:
                boolean r5 = r0.f2930b
                if (r5 == 0) goto L6f
                goto L6e
            L58:
                r5 = 2
                r0.f2929a = r5
                r0.f2933e = r3
                goto L71
            L5e:
                r0.f2929a = r3
                boolean r5 = a.n.q.t0.o()
                if (r5 == 0) goto L6a
                boolean r5 = r4.f2941e
                if (r5 == 0) goto L6f
            L6a:
                boolean r5 = r0.f2930b
                if (r5 == 0) goto L6f
            L6e:
                r2 = 1
            L6f:
                r0.f2933e = r2
            L71:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a.n.q.t0.a.a(android.content.Context):a.n.q.t0");
        }

        public a b(boolean z) {
            this.f2941e = z;
            return this;
        }

        public a c(boolean z) {
            this.f2937a = z;
            return this;
        }

        public a d(boolean z) {
            this.f2938b = z;
            return this;
        }

        public a e(boolean z) {
            this.f2939c = z;
            return this;
        }

        public a f(b bVar) {
            this.f2942f = bVar;
            return this;
        }

        public a g(boolean z) {
            this.f2940d = z;
            return this;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2943a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2944b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2945c = -1.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f2946d = -1.0f;

        public final float a() {
            return this.f2946d;
        }

        public final float b() {
            return this.f2945c;
        }

        public final int c() {
            return this.f2944b;
        }
    }

    public static Object b(View view) {
        return view.getTag(a.n.f.v);
    }

    public static void h(View view, int i2) {
        Drawable drawableA = i.a(view);
        if (drawableA instanceof ColorDrawable) {
            ((ColorDrawable) drawableA).setColor(i2);
        } else {
            i.b(view, new ColorDrawable(i2));
        }
    }

    public static void i(View view, float f2) {
        k(b(view), 3, f2);
    }

    public static void k(Object obj, int i2, float f2) {
        if (obj != null) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (i2 == 2) {
                z0.c(obj, f2);
            } else {
                if (i2 != 3) {
                    return;
                }
                q0.b(obj, f2);
            }
        }
    }

    public static boolean n() {
        return q0.c();
    }

    public static boolean o() {
        return i.c();
    }

    public static boolean p() {
        return k0.c();
    }

    public static boolean q() {
        return z0.d();
    }

    public s0 a(Context context) {
        if (e()) {
            return new s0(context, this.f2929a, this.f2930b, this.f2935g, this.f2936h, this.f2934f);
        }
        throw new IllegalArgumentException();
    }

    public int c() {
        return this.f2929a;
    }

    public boolean d() {
        return this.f2930b;
    }

    public boolean e() {
        return this.f2933e;
    }

    public void f(View view) {
        if (e()) {
            return;
        }
        if (this.f2932d) {
            if (this.f2929a == 3) {
                view.setTag(a.n.f.v, q0.a(view, this.f2935g, this.f2936h, this.f2934f));
                return;
            } else if (!this.f2931c) {
                return;
            }
        } else if (!this.f2931c) {
            return;
        }
        k0.b(view, true, this.f2934f);
    }

    public void g(ViewGroup viewGroup) {
        if (this.f2929a == 2) {
            z0.b(viewGroup);
        }
    }

    public void j(View view, int i2) {
        if (e()) {
            ((s0) view).setOverlayColor(i2);
        } else {
            h(view, i2);
        }
    }

    public void l(b bVar, Context context) {
        float fB;
        if (bVar.b() < 0.0f) {
            Resources resources = context.getResources();
            this.f2936h = resources.getDimension(a.n.c.f2583d);
            fB = resources.getDimension(a.n.c.f2584e);
        } else {
            this.f2936h = bVar.a();
            fB = bVar.b();
        }
        this.f2935g = fB;
    }

    public void m(b bVar, Context context) {
        this.f2934f = bVar.c() == 0 ? context.getResources().getDimensionPixelSize(a.n.c.t) : bVar.c();
    }
}

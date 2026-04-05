package a.i.s;

import a.i.r.x;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f2121b = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f2124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f2125f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2129j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2133n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2134o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0047a f2122c = new C0047a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f2123d = new AccelerateInterpolator();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f2126g = {0.0f, 0.0f};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f2127h = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f2130k = {0.0f, 0.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float[] f2131l = {0.0f, 0.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float[] f2132m = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: a.i.s.a$a, reason: collision with other inner class name */
    public static class C0047a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f2138d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f2144j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2145k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f2139e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f2143i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f2140f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2141g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2142h = 0;

        public void a() {
            if (this.f2140f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j2 = jCurrentAnimationTimeMillis - this.f2140f;
            this.f2140f = jCurrentAnimationTimeMillis;
            float f2 = j2 * fG;
            this.f2141g = (int) (this.f2137c * f2);
            this.f2142h = (int) (f2 * this.f2138d);
        }

        public int b() {
            return this.f2141g;
        }

        public int c() {
            return this.f2142h;
        }

        public int d() {
            float f2 = this.f2137c;
            return (int) (f2 / Math.abs(f2));
        }

        public final float e(long j2) {
            if (j2 < this.f2139e) {
                return 0.0f;
            }
            long j3 = this.f2143i;
            if (j3 < 0 || j2 < j3) {
                return a.e((j2 - r0) / this.f2135a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f2144j;
            return (1.0f - f2) + (f2 * a.e((j2 - j3) / this.f2145k, 0.0f, 1.0f));
        }

        public int f() {
            float f2 = this.f2138d;
            return (int) (f2 / Math.abs(f2));
        }

        public final float g(float f2) {
            return ((-4.0f) * f2 * f2) + (f2 * 4.0f);
        }

        public boolean h() {
            return this.f2143i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2143i + ((long) this.f2145k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2145k = a.f((int) (jCurrentAnimationTimeMillis - this.f2139e), 0, this.f2136b);
            this.f2144j = e(jCurrentAnimationTimeMillis);
            this.f2143i = jCurrentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.f2136b = i2;
        }

        public void k(int i2) {
            this.f2135a = i2;
        }

        public void l(float f2, float f3) {
            this.f2137c = f2;
            this.f2138d = f3;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2139e = jCurrentAnimationTimeMillis;
            this.f2143i = -1L;
            this.f2140f = jCurrentAnimationTimeMillis;
            this.f2144j = 0.5f;
            this.f2141g = 0;
            this.f2142h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.q) {
                if (aVar.f2134o) {
                    aVar.f2134o = false;
                    aVar.f2122c.m();
                }
                C0047a c0047a = a.this.f2122c;
                if (c0047a.h() || !a.this.u()) {
                    a.this.q = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.p) {
                    aVar2.p = false;
                    aVar2.c();
                }
                c0047a.a();
                a.this.j(c0047a.b(), c0047a.c());
                x.h0(a.this.f2124e, this);
            }
        }
    }

    public a(View view) {
        this.f2124e = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (int) ((1575.0f * f2) + 0.5f);
        o(f3, f3);
        float f4 = (int) ((f2 * 315.0f) + 0.5f);
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f2121b);
        r(500);
        q(500);
    }

    public static float e(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    public static int f(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    public void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2124e.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float d(int i2, float f2, float f3, float f4) {
        float fH = h(this.f2126g[i2], f3, this.f2127h[i2], f2);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f5 = this.f2130k[i2];
        float f6 = this.f2131l[i2];
        float f7 = this.f2132m[i2];
        float f8 = f5 * f4;
        return fH > 0.0f ? e(fH * f8, f6, f7) : -e((-fH) * f8, f6, f7);
    }

    public final float g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f2128i;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.q && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final float h(float f2, float f3, float f4, float f5) {
        float interpolation;
        float fE = e(f2 * f3, 0.0f, f4);
        float fG = g(f3 - f5, fE) - g(f5, fE);
        if (fG < 0.0f) {
            interpolation = -this.f2123d.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f2123d.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.f2134o) {
            this.q = false;
        } else {
            this.f2122c.i();
        }
    }

    public abstract void j(int i2, int i3);

    public a k(int i2) {
        this.f2129j = i2;
        return this;
    }

    public a l(int i2) {
        this.f2128i = i2;
        return this;
    }

    public a m(boolean z) {
        if (this.r && !z) {
            i();
        }
        this.r = z;
        return this;
    }

    public a n(float f2, float f3) {
        float[] fArr = this.f2127h;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a o(float f2, float f3) {
        float[] fArr = this.f2132m;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.r
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.p = r2
            r5.f2133n = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2124e
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2124e
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            a.i.s.a$a r7 = r5.f2122c
            r7.l(r0, r6)
            boolean r6 = r5.q
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.s
            if (r6 == 0) goto L61
            boolean r6 = r5.q
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.s.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f2, float f3) {
        float[] fArr = this.f2131l;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a q(int i2) {
        this.f2122c.j(i2);
        return this;
    }

    public a r(int i2) {
        this.f2122c.k(i2);
        return this;
    }

    public a s(float f2, float f3) {
        float[] fArr = this.f2126g;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a t(float f2, float f3) {
        float[] fArr = this.f2130k;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0047a c0047a = this.f2122c;
        int iF = c0047a.f();
        int iD = c0047a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }

    public final void v() {
        int i2;
        if (this.f2125f == null) {
            this.f2125f = new b();
        }
        this.q = true;
        this.f2134o = true;
        if (this.f2133n || (i2 = this.f2129j) <= 0) {
            this.f2125f.run();
        } else {
            x.i0(this.f2124e, this.f2125f, i2);
        }
        this.f2133n = true;
    }
}

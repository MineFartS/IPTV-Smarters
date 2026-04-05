package c.e.b.a.a.g;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rect f5994b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Property<f, Integer> f5995c = new c("rotateX");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Property<f, Integer> f5996d = new d("rotate");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Property<f, Integer> f5997e = new e("rotateY");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Property<f, Integer> f5998f = new C0114f("translateX");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Property<f, Integer> f5999g = new g("translateY");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Property<f, Float> f6000h = new h("translateXPercentage");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Property<f, Float> f6001i = new i("translateYPercentage");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Property<f, Float> f6002j = new j("scaleX");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Property<f, Float> f6003k = new k("scaleY");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Property<f, Float> f6004l = new a("scale");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Property<f, Integer> f6005m = new b("alpha");
    public ValueAnimator A;
    public float q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public float y;
    public float z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f6006n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f6007o = 1.0f;
    public float p = 1.0f;
    public int B = 255;
    public Rect C = f5994b;
    public Camera D = new Camera();
    public Matrix E = new Matrix();

    public static class a extends c.e.b.a.a.f.b<f> {
        public a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.j());
        }

        @Override // c.e.b.a.a.f.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, float f2) {
            fVar.C(f2);
        }
    }

    public static class b extends c.e.b.a.a.f.c<f> {
        public b(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.getAlpha());
        }

        @Override // c.e.b.a.a.f.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, int i2) {
            fVar.setAlpha(i2);
        }
    }

    public static class c extends c.e.b.a.a.f.c<f> {
        public c(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.h());
        }

        @Override // c.e.b.a.a.f.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, int i2) {
            fVar.A(i2);
        }
    }

    public static class d extends c.e.b.a.a.f.c<f> {
        public d(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.g());
        }

        @Override // c.e.b.a.a.f.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, int i2) {
            fVar.z(i2);
        }
    }

    public static class e extends c.e.b.a.a.f.c<f> {
        public e(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.i());
        }

        @Override // c.e.b.a.a.f.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, int i2) {
            fVar.B(i2);
        }
    }

    /* JADX INFO: renamed from: c.e.b.a.a.g.f$f, reason: collision with other inner class name */
    public static class C0114f extends c.e.b.a.a.f.c<f> {
        public C0114f(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.m());
        }

        @Override // c.e.b.a.a.f.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, int i2) {
            fVar.F(i2);
        }
    }

    public static class g extends c.e.b.a.a.f.c<f> {
        public g(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.o());
        }

        @Override // c.e.b.a.a.f.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, int i2) {
            fVar.H(i2);
        }
    }

    public static class h extends c.e.b.a.a.f.b<f> {
        public h(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.n());
        }

        @Override // c.e.b.a.a.f.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, float f2) {
            fVar.G(f2);
        }
    }

    public static class i extends c.e.b.a.a.f.b<f> {
        public i(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.p());
        }

        @Override // c.e.b.a.a.f.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, float f2) {
            fVar.I(f2);
        }
    }

    public static class j extends c.e.b.a.a.f.b<f> {
        public j(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.k());
        }

        @Override // c.e.b.a.a.f.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, float f2) {
            fVar.D(f2);
        }
    }

    public static class k extends c.e.b.a.a.f.b<f> {
        public k(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.l());
        }

        @Override // c.e.b.a.a.f.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, float f2) {
            fVar.E(f2);
        }
    }

    public void A(int i2) {
        this.t = i2;
    }

    public void B(int i2) {
        this.u = i2;
    }

    public void C(float f2) {
        this.f6006n = f2;
        D(f2);
        E(f2);
    }

    public void D(float f2) {
        this.f6007o = f2;
    }

    public void E(float f2) {
        this.p = f2;
    }

    public void F(int i2) {
        this.v = i2;
    }

    public void G(float f2) {
        this.y = f2;
    }

    public void H(int i2) {
        this.w = i2;
    }

    public void I(float f2) {
        this.z = f2;
    }

    public Rect a(Rect rect) {
        int iMin = Math.min(rect.width(), rect.height());
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        int i2 = iMin / 2;
        return new Rect(iCenterX - i2, iCenterY - i2, iCenterX + i2, iCenterY + i2);
    }

    public abstract void b(Canvas canvas);

    public abstract int c();

    public Rect d() {
        return this.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iM = m();
        if (iM == 0) {
            iM = (int) (getBounds().width() * n());
        }
        int iO = o();
        if (iO == 0) {
            iO = (int) (getBounds().height() * p());
        }
        canvas.translate(iM, iO);
        canvas.scale(k(), l(), e(), f());
        canvas.rotate(g(), e(), f());
        if (h() != 0 || i() != 0) {
            this.D.save();
            this.D.rotateX(h());
            this.D.rotateY(i());
            this.D.getMatrix(this.E);
            this.E.preTranslate(-e(), -f());
            this.E.postTranslate(e(), f());
            this.D.restore();
            canvas.concat(this.E);
        }
        b(canvas);
    }

    public float e() {
        return this.q;
    }

    public float f() {
        return this.r;
    }

    public int g() {
        return this.x;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int h() {
        return this.t;
    }

    public int i() {
        return this.u;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return c.e.b.a.a.f.a.a(this.A);
    }

    public float j() {
        return this.f6006n;
    }

    public float k() {
        return this.f6007o;
    }

    public float l() {
        return this.p;
    }

    public int m() {
        return this.v;
    }

    public float n() {
        return this.y;
    }

    public int o() {
        return this.w;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        w(rect);
    }

    public float p() {
        return this.z;
    }

    public ValueAnimator q() {
        if (this.A == null) {
            this.A = r();
        }
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(this);
            this.A.setStartDelay(this.s);
        }
        return this.A;
    }

    public abstract ValueAnimator r();

    public void s() {
        this.f6006n = 1.0f;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0.0f;
        this.z = 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.B = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (c.e.b.a.a.f.a.c(this.A)) {
            return;
        }
        ValueAnimator valueAnimatorQ = q();
        this.A = valueAnimatorQ;
        if (valueAnimatorQ == null) {
            return;
        }
        c.e.b.a.a.f.a.d(valueAnimatorQ);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (c.e.b.a.a.f.a.c(this.A)) {
            this.A.removeAllUpdateListeners();
            this.A.end();
            s();
        }
    }

    public f t(int i2) {
        this.s = i2;
        return this;
    }

    public abstract void u(int i2);

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public void v(int i2, int i3, int i4, int i5) {
        this.C = new Rect(i2, i3, i4, i5);
        x(d().centerX());
        y(d().centerY());
    }

    public void w(Rect rect) {
        v(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void x(float f2) {
        this.q = f2;
    }

    public void y(float f2) {
        this.r = f2;
    }

    public void z(int i2) {
        this.x = i2;
    }
}

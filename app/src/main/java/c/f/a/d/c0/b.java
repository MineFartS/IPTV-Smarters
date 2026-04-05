package c.f.a.d.c0;

import a.i.r.x;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import c.f.a.d.j0.n;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f14668a = c.f.a.d.m.a.f15044c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f14669b = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f14670c = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f14671d = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f14672e = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f14673f = {R.attr.state_enabled};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f14674g = new int[0];
    public int A;
    public ArrayList<Animator.AnimatorListener> C;
    public ArrayList<Animator.AnimatorListener> D;
    public ArrayList<i> E;
    public final FloatingActionButton F;
    public final c.f.a.d.i0.b G;
    public ViewTreeObserver.OnPreDrawListener L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.f.a.d.j0.k f14675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.f.a.d.j0.g f14676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f14677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.f.a.d.c0.a f14678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f14679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14680m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f14682o;
    public float p;
    public float q;
    public int r;
    public final c.f.a.d.d0.f s;
    public c.f.a.d.m.h t;
    public c.f.a.d.m.h u;
    public Animator v;
    public c.f.a.d.m.h w;
    public c.f.a.d.m.h x;
    public float y;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14681n = true;
    public float z = 1.0f;
    public int B = 0;
    public final Rect H = new Rect();
    public final RectF I = new RectF();
    public final RectF J = new RectF();
    public final Matrix K = new Matrix();

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f14684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f14685d;

        public a(boolean z, j jVar) {
            this.f14684c = z;
            this.f14685d = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f14683b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.B = 0;
            b.this.v = null;
            if (this.f14683b) {
                return;
            }
            FloatingActionButton floatingActionButton = b.this.F;
            boolean z = this.f14684c;
            floatingActionButton.b(z ? 8 : 4, z);
            j jVar = this.f14685d;
            if (jVar != null) {
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.F.b(0, this.f14684c);
            b.this.B = 1;
            b.this.v = animator;
            this.f14683b = false;
        }
    }

    /* JADX INFO: renamed from: c.f.a.d.c0.b$b, reason: collision with other inner class name */
    public class C0164b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f14687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f14688c;

        public C0164b(boolean z, j jVar) {
            this.f14687b = z;
            this.f14688c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.B = 0;
            b.this.v = null;
            j jVar = this.f14688c;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.F.b(0, this.f14687b);
            b.this.B = 2;
            b.this.v = animator;
        }
    }

    public class c extends c.f.a.d.m.g {
        public c() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            b.this.z = f2;
            return super.evaluate(f2, matrix, matrix2);
        }
    }

    public class d implements TypeEvaluator<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FloatEvaluator f14691a = new FloatEvaluator();

        public d() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f2, Float f3, Float f4) {
            float fFloatValue = this.f14691a.evaluate(f2, (Number) f3, (Number) f4).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    public class e implements ViewTreeObserver.OnPreDrawListener {
        public e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            b.this.H();
            return true;
        }
    }

    public class f extends l {
        public f() {
            super(b.this, null);
        }

        @Override // c.f.a.d.c0.b.l
        public float a() {
            return 0.0f;
        }
    }

    public class g extends l {
        public g() {
            super(b.this, null);
        }

        @Override // c.f.a.d.c0.b.l
        public float a() {
            b bVar = b.this;
            return bVar.f14682o + bVar.p;
        }
    }

    public class h extends l {
        public h() {
            super(b.this, null);
        }

        @Override // c.f.a.d.c0.b.l
        public float a() {
            b bVar = b.this;
            return bVar.f14682o + bVar.q;
        }
    }

    public interface i {
        void a();

        void b();
    }

    public interface j {
        void a();

        void b();
    }

    public class k extends l {
        public k() {
            super(b.this, null);
        }

        @Override // c.f.a.d.c0.b.l
        public float a() {
            return b.this.f14682o;
        }
    }

    public abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f14700d;

        public l() {
        }

        public /* synthetic */ l(b bVar, a aVar) {
            this();
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.g0((int) this.f14700d);
            this.f14698b = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f14698b) {
                c.f.a.d.j0.g gVar = b.this.f14676i;
                this.f14699c = gVar == null ? 0.0f : gVar.w();
                this.f14700d = a();
                this.f14698b = true;
            }
            b bVar = b.this;
            float f2 = this.f14699c;
            bVar.g0((int) (f2 + ((this.f14700d - f2) * valueAnimator.getAnimatedFraction())));
        }
    }

    public b(FloatingActionButton floatingActionButton, c.f.a.d.i0.b bVar) {
        this.F = floatingActionButton;
        this.G = bVar;
        c.f.a.d.d0.f fVar = new c.f.a.d.d0.f();
        this.s = fVar;
        fVar.a(f14669b, i(new h()));
        fVar.a(f14670c, i(new g()));
        fVar.a(f14671d, i(new g()));
        fVar.a(f14672e, i(new g()));
        fVar.a(f14673f, i(new k()));
        fVar.a(f14674g, i(new f()));
        this.y = floatingActionButton.getRotation();
    }

    public void A() {
        this.s.c();
    }

    public void B() {
        c.f.a.d.j0.g gVar = this.f14676i;
        if (gVar != null) {
            c.f.a.d.j0.h.f(this.F, gVar);
        }
        if (K()) {
            this.F.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    public void C() {
    }

    public void D() {
        ViewTreeObserver viewTreeObserver = this.F.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.L;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.L = null;
        }
    }

    public void E(int[] iArr) {
        this.s.d(iArr);
    }

    public void F(float f2, float f3, float f4) {
        f0();
        g0(f2);
    }

    public void G(Rect rect) {
        c.f.a.d.i0.b bVar;
        Drawable insetDrawable;
        a.i.q.i.f(this.f14679l, "Didn't initialize content background");
        if (Z()) {
            insetDrawable = new InsetDrawable(this.f14679l, rect.left, rect.top, rect.right, rect.bottom);
            bVar = this.G;
        } else {
            bVar = this.G;
            insetDrawable = this.f14679l;
        }
        bVar.b(insetDrawable);
    }

    public void H() {
        float rotation = this.F.getRotation();
        if (this.y != rotation) {
            this.y = rotation;
            d0();
        }
    }

    public void I() {
        ArrayList<i> arrayList = this.E;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void J() {
        ArrayList<i> arrayList = this.E;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public boolean K() {
        return true;
    }

    public void L(ColorStateList colorStateList) {
        c.f.a.d.j0.g gVar = this.f14676i;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        c.f.a.d.c0.a aVar = this.f14678k;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    public void M(PorterDuff.Mode mode) {
        c.f.a.d.j0.g gVar = this.f14676i;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    public final void N(float f2) {
        if (this.f14682o != f2) {
            this.f14682o = f2;
            F(f2, this.p, this.q);
        }
    }

    public void O(boolean z) {
        this.f14680m = z;
    }

    public final void P(c.f.a.d.m.h hVar) {
        this.x = hVar;
    }

    public final void Q(float f2) {
        if (this.p != f2) {
            this.p = f2;
            F(this.f14682o, f2, this.q);
        }
    }

    public final void R(float f2) {
        this.z = f2;
        Matrix matrix = this.K;
        g(f2, matrix);
        this.F.setImageMatrix(matrix);
    }

    public final void S(int i2) {
        if (this.A != i2) {
            this.A = i2;
            e0();
        }
    }

    public void T(int i2) {
        this.r = i2;
    }

    public final void U(float f2) {
        if (this.q != f2) {
            this.q = f2;
            F(this.f14682o, this.p, f2);
        }
    }

    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.f14677j;
        if (drawable != null) {
            a.i.j.l.a.o(drawable, c.f.a.d.h0.b.d(colorStateList));
        }
    }

    public void W(boolean z) {
        this.f14681n = z;
        f0();
    }

    public final void X(c.f.a.d.j0.k kVar) {
        this.f14675h = kVar;
        c.f.a.d.j0.g gVar = this.f14676i;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f14677j;
        if (obj instanceof n) {
            ((n) obj).setShapeAppearanceModel(kVar);
        }
        c.f.a.d.c0.a aVar = this.f14678k;
        if (aVar != null) {
            aVar.f(kVar);
        }
    }

    public final void Y(c.f.a.d.m.h hVar) {
        this.w = hVar;
    }

    public boolean Z() {
        return true;
    }

    public final boolean a0() {
        return x.U(this.F) && !this.F.isInEditMode();
    }

    public final boolean b0() {
        return !this.f14680m || this.F.getSizeDimension() >= this.r;
    }

    public void c0(j jVar, boolean z) {
        if (z()) {
            return;
        }
        Animator animator = this.v;
        if (animator != null) {
            animator.cancel();
        }
        if (!a0()) {
            this.F.b(0, z);
            this.F.setAlpha(1.0f);
            this.F.setScaleY(1.0f);
            this.F.setScaleX(1.0f);
            R(1.0f);
            if (jVar != null) {
                jVar.a();
                return;
            }
            return;
        }
        if (this.F.getVisibility() != 0) {
            this.F.setAlpha(0.0f);
            this.F.setScaleY(0.0f);
            this.F.setScaleX(0.0f);
            R(0.0f);
        }
        c.f.a.d.m.h hVarM = this.w;
        if (hVarM == null) {
            hVarM = m();
        }
        AnimatorSet animatorSetH = h(hVarM, 1.0f, 1.0f, 1.0f);
        animatorSetH.addListener(new C0164b(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.C;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetH.addListener(it.next());
            }
        }
        animatorSetH.start();
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.D == null) {
            this.D = new ArrayList<>();
        }
        this.D.add(animatorListener);
    }

    public void d0() {
        FloatingActionButton floatingActionButton;
        int i2;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.y % 90.0f != 0.0f) {
                i2 = 1;
                if (this.F.getLayerType() != 1) {
                    floatingActionButton = this.F;
                    floatingActionButton.setLayerType(i2, null);
                }
            } else if (this.F.getLayerType() != 0) {
                floatingActionButton = this.F;
                i2 = 0;
                floatingActionButton.setLayerType(i2, null);
            }
        }
        c.f.a.d.j0.g gVar = this.f14676i;
        if (gVar != null) {
            gVar.c0((int) this.y);
        }
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.C == null) {
            this.C = new ArrayList<>();
        }
        this.C.add(animatorListener);
    }

    public final void e0() {
        R(this.z);
    }

    public void f(i iVar) {
        if (this.E == null) {
            this.E = new ArrayList<>();
        }
        this.E.add(iVar);
    }

    public final void f0() {
        Rect rect = this.H;
        s(rect);
        G(rect);
        this.G.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void g(float f2, Matrix matrix) {
        matrix.reset();
        if (this.F.getDrawable() == null || this.A == 0) {
            return;
        }
        RectF rectF = this.I;
        RectF rectF2 = this.J;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i2 = this.A;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.A;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    public void g0(float f2) {
        c.f.a.d.j0.g gVar = this.f14676i;
        if (gVar != null) {
            gVar.W(f2);
        }
    }

    public final AnimatorSet h(c.f.a.d.m.h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        hVar.e("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        hVar.e("scale").a(objectAnimatorOfFloat2);
        h0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        hVar.e("scale").a(objectAnimatorOfFloat3);
        h0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        g(f4, this.K);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.F, new c.f.a.d.m.f(), new c(), new Matrix(this.K));
        hVar.e("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        c.f.a.d.m.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final void h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    public final ValueAnimator i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f14668a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public c.f.a.d.j0.g j() {
        return new c.f.a.d.j0.g((c.f.a.d.j0.k) a.i.q.i.e(this.f14675h));
    }

    public final Drawable k() {
        return this.f14679l;
    }

    public final c.f.a.d.m.h l() {
        if (this.u == null) {
            this.u = c.f.a.d.m.h.c(this.F.getContext(), c.f.a.d.a.f14616a);
        }
        return (c.f.a.d.m.h) a.i.q.i.e(this.u);
    }

    public final c.f.a.d.m.h m() {
        if (this.t == null) {
            this.t = c.f.a.d.m.h.c(this.F.getContext(), c.f.a.d.a.f14617b);
        }
        return (c.f.a.d.m.h) a.i.q.i.e(this.t);
    }

    public float n() {
        return this.f14682o;
    }

    public boolean o() {
        return this.f14680m;
    }

    public final c.f.a.d.m.h p() {
        return this.x;
    }

    public float q() {
        return this.p;
    }

    public final ViewTreeObserver.OnPreDrawListener r() {
        if (this.L == null) {
            this.L = new e();
        }
        return this.L;
    }

    public void s(Rect rect) {
        int sizeDimension = this.f14680m ? (this.r - this.F.getSizeDimension()) / 2 : 0;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(this.f14681n ? n() + this.q : 0.0f));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public float t() {
        return this.q;
    }

    public final c.f.a.d.j0.k u() {
        return this.f14675h;
    }

    public final c.f.a.d.m.h v() {
        return this.w;
    }

    public void w(j jVar, boolean z) {
        if (y()) {
            return;
        }
        Animator animator = this.v;
        if (animator != null) {
            animator.cancel();
        }
        if (!a0()) {
            this.F.b(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.b();
                return;
            }
            return;
        }
        c.f.a.d.m.h hVarL = this.x;
        if (hVarL == null) {
            hVarL = l();
        }
        AnimatorSet animatorSetH = h(hVarL, 0.0f, 0.0f, 0.0f);
        animatorSetH.addListener(new a(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.D;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetH.addListener(it.next());
            }
        }
        animatorSetH.start();
    }

    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        c.f.a.d.j0.g gVarJ = j();
        this.f14676i = gVarJ;
        gVarJ.setTintList(colorStateList);
        if (mode != null) {
            this.f14676i.setTintMode(mode);
        }
        this.f14676i.b0(-12303292);
        this.f14676i.M(this.F.getContext());
        c.f.a.d.h0.a aVar = new c.f.a.d.h0.a(this.f14676i.C());
        aVar.setTintList(c.f.a.d.h0.b.d(colorStateList2));
        this.f14677j = aVar;
        this.f14679l = new LayerDrawable(new Drawable[]{(Drawable) a.i.q.i.e(this.f14676i), aVar});
    }

    public boolean y() {
        return this.F.getVisibility() == 0 ? this.B == 1 : this.B != 2;
    }

    public boolean z() {
        return this.F.getVisibility() != 0 ? this.B == 2 : this.B != 1;
    }
}

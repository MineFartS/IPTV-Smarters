package c.f.a.b.h3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 {
    public boolean A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f8609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f8610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f8611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f8612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f8613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewGroup f8614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f8615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewGroup f8616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewGroup f8617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f8618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f8619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AnimatorSet f8620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AnimatorSet f8621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AnimatorSet f8622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AnimatorSet f8623o;
    public final AnimatorSet p;
    public final ValueAnimator q;
    public final ValueAnimator r;
    public final Runnable s = new Runnable() { // from class: c.f.a.b.h3.z
        @Override // java.lang.Runnable
        public final void run() {
            this.f8817b.c0();
        }
    };
    public final Runnable t = new Runnable() { // from class: c.f.a.b.h3.r
        @Override // java.lang.Runnable
        public final void run() {
            this.f8750b.q();
        }
    };
    public final Runnable u = new Runnable() { // from class: c.f.a.b.h3.v
        @Override // java.lang.Runnable
        public final void run() {
            this.f8780b.u();
        }
    };
    public final Runnable v = new Runnable() { // from class: c.f.a.b.h3.y
        @Override // java.lang.Runnable
        public final void run() {
            this.f8801b.t();
        }
    };
    public final Runnable w = new Runnable() { // from class: c.f.a.b.h3.s
        @Override // java.lang.Runnable
        public final void run() {
            this.f8752b.r();
        }
    };
    public final View.OnLayoutChangeListener x = new View.OnLayoutChangeListener() { // from class: c.f.a.b.h3.t
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f8768b.R(view, i2, i3, i4, i5, i6, i7, i8, i9);
        }
    };
    public boolean C = true;
    public int z = 0;
    public final List<View> y = new ArrayList();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (b1.this.f8610b != null) {
                b1.this.f8610b.setVisibility(4);
            }
            if (b1.this.f8611c != null) {
                b1.this.f8611c.setVisibility(4);
            }
            if (b1.this.f8613e != null) {
                b1.this.f8613e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(b1.this.f8618j instanceof i0) || b1.this.A) {
                return;
            }
            ((i0) b1.this.f8618j).f(250L);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (b1.this.f8610b != null) {
                b1.this.f8610b.setVisibility(0);
            }
            if (b1.this.f8611c != null) {
                b1.this.f8611c.setVisibility(0);
            }
            if (b1.this.f8613e != null) {
                b1.this.f8613e.setVisibility(b1.this.A ? 0 : 4);
            }
            if (!(b1.this.f8618j instanceof i0) || b1.this.A) {
                return;
            }
            ((i0) b1.this.f8618j).u(250L);
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a1 f8626b;

        public c(a1 a1Var) {
            this.f8626b = a1Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b1.this.Z(1);
            if (b1.this.B) {
                this.f8626b.post(b1.this.s);
                b1.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b1.this.Z(3);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a1 f8628b;

        public d(a1 a1Var) {
            this.f8628b = a1Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b1.this.Z(2);
            if (b1.this.B) {
                this.f8628b.post(b1.this.s);
                b1.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b1.this.Z(3);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a1 f8630b;

        public e(a1 a1Var) {
            this.f8630b = a1Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b1.this.Z(2);
            if (b1.this.B) {
                this.f8630b.post(b1.this.s);
                b1.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b1.this.Z(3);
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b1.this.Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b1.this.Z(4);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b1.this.Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b1.this.Z(4);
        }
    }

    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (b1.this.f8614f != null) {
                b1.this.f8614f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (b1.this.f8616h != null) {
                b1.this.f8616h.setVisibility(0);
                b1.this.f8616h.setTranslationX(b1.this.f8616h.getWidth());
                b1.this.f8616h.scrollTo(b1.this.f8616h.getWidth(), 0);
            }
        }
    }

    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (b1.this.f8616h != null) {
                b1.this.f8616h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (b1.this.f8614f != null) {
                b1.this.f8614f.setVisibility(0);
            }
        }
    }

    public b1(a1 a1Var) {
        this.f8609a = a1Var;
        this.f8610b = a1Var.findViewById(s0.f8764l);
        this.f8611c = (ViewGroup) a1Var.findViewById(s0.f8759g);
        this.f8613e = (ViewGroup) a1Var.findViewById(s0.v);
        ViewGroup viewGroup = (ViewGroup) a1Var.findViewById(s0.f8757e);
        this.f8612d = viewGroup;
        this.f8617i = (ViewGroup) a1Var.findViewById(s0.T);
        View viewFindViewById = a1Var.findViewById(s0.H);
        this.f8618j = viewFindViewById;
        this.f8614f = (ViewGroup) a1Var.findViewById(s0.f8756d);
        this.f8615g = (ViewGroup) a1Var.findViewById(s0.f8767o);
        this.f8616h = (ViewGroup) a1Var.findViewById(s0.p);
        View viewFindViewById2 = a1Var.findViewById(s0.z);
        this.f8619k = viewFindViewById2;
        View viewFindViewById3 = a1Var.findViewById(s0.y);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: c.f.a.b.h3.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8799b.T(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: c.f.a.b.h3.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8799b.T(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: c.f.a.b.h3.u
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f8771b.F(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: c.f.a.b.h3.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f8734b.H(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = a1Var.getResources();
        int i2 = p0.f8731b;
        float dimension = resources.getDimension(i2) - resources.getDimension(p0.f8732c);
        float dimension2 = resources.getDimension(i2);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f8620l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(a1Var));
        animatorSet.play(valueAnimatorOfFloat).with(N(0.0f, dimension, viewFindViewById)).with(N(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f8621m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(a1Var));
        animatorSet2.play(N(dimension, dimension2, viewFindViewById)).with(N(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f8622n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(a1Var));
        animatorSet3.play(valueAnimatorOfFloat).with(N(0.0f, dimension2, viewFindViewById)).with(N(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f8623o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(N(dimension, 0.0f, viewFindViewById)).with(N(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(N(dimension2, 0.0f, viewFindViewById)).with(N(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: c.f.a.b.h3.w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f8783b.J(valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: c.f.a.b.h3.a0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f8572b.L(valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void F(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f8610b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f8611c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f8613e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void H(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f8610b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.f8611c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.f8613e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void J(ValueAnimator valueAnimator) {
        l(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void L(ValueAnimator valueAnimator) {
        l(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static ObjectAnimator N(float f2, float f3, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f2, f3);
    }

    public static int m(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static int o(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public void O() {
        this.f8609a.addOnLayoutChangeListener(this.x);
    }

    public void P() {
        this.f8609a.removeOnLayoutChangeListener(this.x);
    }

    public void Q(boolean z, int i2, int i3, int i4, int i5) {
        View view = this.f8610b;
        if (view != null) {
            view.layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    public final void R(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean zE0 = e0();
        if (this.A != zE0) {
            this.A = zE0;
            view.post(new Runnable() { // from class: c.f.a.b.h3.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8727b.d0();
                }
            });
        }
        boolean z = i4 - i2 != i8 - i6;
        if (this.A || !z) {
            return;
        }
        view.post(new Runnable() { // from class: c.f.a.b.h3.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f8729b.S();
            }
        });
    }

    public final void S() {
        int i2;
        if (this.f8614f == null || this.f8615g == null) {
            return;
        }
        int width = (this.f8609a.getWidth() - this.f8609a.getPaddingLeft()) - this.f8609a.getPaddingRight();
        while (true) {
            if (this.f8615g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f8615g.getChildCount() - 2;
            View childAt = this.f8615g.getChildAt(childCount);
            this.f8615g.removeViewAt(childCount);
            this.f8614f.addView(childAt, 0);
        }
        View view = this.f8619k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iO = o(this.f8617i);
        int childCount2 = this.f8614f.getChildCount() - 1;
        for (int i3 = 0; i3 < childCount2; i3++) {
            iO += o(this.f8614f.getChildAt(i3));
        }
        if (iO <= width) {
            ViewGroup viewGroup = this.f8616h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.r.isStarted()) {
                return;
            }
            this.q.cancel();
            this.r.start();
            return;
        }
        View view2 = this.f8619k;
        if (view2 != null) {
            view2.setVisibility(0);
            iO += o(this.f8619k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = this.f8614f.getChildAt(i4);
            iO -= o(childAt2);
            arrayList.add(childAt2);
            if (iO <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f8614f.removeViews(0, arrayList.size());
        for (i2 = 0; i2 < arrayList.size(); i2++) {
            this.f8615g.addView((View) arrayList.get(i2), this.f8615g.getChildCount() - 1);
        }
    }

    public final void T(View view) {
        ValueAnimator valueAnimator;
        W();
        if (view.getId() == s0.z) {
            valueAnimator = this.q;
        } else if (view.getId() != s0.y) {
            return;
        } else {
            valueAnimator = this.r;
        }
        valueAnimator.start();
    }

    public final void U(Runnable runnable, long j2) {
        if (j2 >= 0) {
            this.f8609a.postDelayed(runnable, j2);
        }
    }

    public void V() {
        this.f8609a.removeCallbacks(this.w);
        this.f8609a.removeCallbacks(this.t);
        this.f8609a.removeCallbacks(this.v);
        this.f8609a.removeCallbacks(this.u);
    }

    public void W() {
        Runnable runnable;
        if (this.z == 3) {
            return;
        }
        V();
        int showTimeoutMs = this.f8609a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                runnable = this.w;
            } else {
                if (this.z == 1) {
                    U(this.u, 2000L);
                    return;
                }
                runnable = this.v;
            }
            U(runnable, showTimeoutMs);
        }
    }

    public void X(boolean z) {
        this.C = z;
    }

    public void Y(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility((this.A && a0(view)) ? 4 : 0);
            this.y.add(view);
        } else {
            view.setVisibility(8);
            this.y.remove(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(int r4) {
        /*
            r3 = this;
            int r0 = r3.z
            r3.z = r4
            r1 = 2
            if (r4 != r1) goto Lf
            c.f.a.b.h3.a1 r1 = r3.f8609a
            r2 = 8
        Lb:
            r1.setVisibility(r2)
            goto L15
        Lf:
            if (r0 != r1) goto L15
            c.f.a.b.h3.a1 r1 = r3.f8609a
            r2 = 0
            goto Lb
        L15:
            if (r0 == r4) goto L1c
            c.f.a.b.h3.a1 r4 = r3.f8609a
            r4.k0()
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.h3.b1.Z(int):void");
    }

    public final boolean a0(View view) {
        int id = view.getId();
        return id == s0.f8757e || id == s0.G || id == s0.x || id == s0.K || id == s0.L || id == s0.q || id == s0.r;
    }

    public void b0() {
        if (!this.f8609a.g0()) {
            this.f8609a.setVisibility(0);
            this.f8609a.u0();
            this.f8609a.p0();
        }
        c0();
    }

    public final void c0() {
        AnimatorSet animatorSet;
        if (!this.C) {
            Z(0);
            W();
            return;
        }
        int i2 = this.z;
        if (i2 == 1) {
            animatorSet = this.f8623o;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.B = true;
                } else if (i2 == 4) {
                    return;
                }
                W();
            }
            animatorSet = this.p;
        }
        animatorSet.start();
        W();
    }

    public final void d0() {
        ViewGroup viewGroup = this.f8613e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.A ? 0 : 4);
        }
        View view = this.f8618j;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int dimensionPixelSize = this.f8609a.getResources().getDimensionPixelSize(p0.f8733d);
            if (this.A) {
                dimensionPixelSize = 0;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            this.f8618j.setLayoutParams(marginLayoutParams);
            View view2 = this.f8618j;
            if (view2 instanceof i0) {
                i0 i0Var = (i0) view2;
                if (this.A) {
                    i0Var.g(true);
                } else {
                    int i2 = this.z;
                    if (i2 == 1) {
                        i0Var.g(false);
                    } else if (i2 != 3) {
                        i0Var.t();
                    }
                }
            }
        }
        for (View view3 : this.y) {
            view3.setVisibility((this.A && a0(view3)) ? 4 : 0);
        }
    }

    public final boolean e0() {
        int width = (this.f8609a.getWidth() - this.f8609a.getPaddingLeft()) - this.f8609a.getPaddingRight();
        int height = (this.f8609a.getHeight() - this.f8609a.getPaddingBottom()) - this.f8609a.getPaddingTop();
        int iO = o(this.f8611c);
        ViewGroup viewGroup = this.f8611c;
        int paddingLeft = iO - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f8611c.getPaddingRight() : 0);
        int iM = m(this.f8611c);
        ViewGroup viewGroup2 = this.f8611c;
        return width <= Math.max(paddingLeft, o(this.f8617i) + o(this.f8619k)) || height <= (iM - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f8611c.getPaddingBottom() : 0)) + (m(this.f8612d) * 2);
    }

    public final void l(float f2) {
        if (this.f8616h != null) {
            this.f8616h.setTranslationX((int) (r0.getWidth() * (1.0f - f2)));
        }
        ViewGroup viewGroup = this.f8617i;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f2);
        }
        ViewGroup viewGroup2 = this.f8614f;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f2);
        }
    }

    public boolean n(View view) {
        return view != null && this.y.contains(view);
    }

    public void p() {
        int i2 = this.z;
        if (i2 == 3 || i2 == 2) {
            return;
        }
        V();
        if (!this.C) {
            r();
        } else if (this.z == 1) {
            u();
        } else {
            q();
        }
    }

    public final void q() {
        this.f8622n.start();
    }

    public final void r() {
        Z(2);
    }

    public void s() {
        int i2 = this.z;
        if (i2 == 3 || i2 == 2) {
            return;
        }
        V();
        r();
    }

    public final void t() {
        this.f8620l.start();
        U(this.u, 2000L);
    }

    public final void u() {
        this.f8621m.start();
    }

    public boolean v() {
        return this.z == 0 && this.f8609a.g0();
    }
}

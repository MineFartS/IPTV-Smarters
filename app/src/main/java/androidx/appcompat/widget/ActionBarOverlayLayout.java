package androidx.appcompat.widget;

import a.b.f;
import a.b.p.j.m;
import a.b.q.a0;
import a.b.q.a1;
import a.b.q.z;
import a.i.r.f0;
import a.i.r.n;
import a.i.r.o;
import a.i.r.p;
import a.i.r.q;
import a.i.r.x;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements z, p, n, o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4143b = {a.b.a.f18b, R.attr.windowContentOverlay};
    public d A;
    public OverScroller B;
    public ViewPropertyAnimator C;
    public final AnimatorListenerAdapter D;
    public final Runnable E;
    public final Runnable F;
    public final q G;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ContentFrameLayout f4146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContainer f4147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0 f4148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f4149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4151j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4152k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4153l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4154m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4155n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4156o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public final Rect v;
    public f0 w;
    public f0 x;
    public f0 y;
    public f0 z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.C = null;
            actionBarOverlayLayout.f4154m = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.C = null;
            actionBarOverlayLayout.f4154m = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.C = actionBarOverlayLayout.f4147f.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.D);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.C = actionBarOverlayLayout.f4147f.animate().translationY(-ActionBarOverlayLayout.this.f4147f.getHeight()).setListener(ActionBarOverlayLayout.this.D);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z);

        void d();

        void e();

        void f(int i2);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4145d = 0;
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        f0 f0Var = f0.f2010a;
        this.w = f0Var;
        this.x = f0Var;
        this.y = f0Var;
        this.z = f0Var;
        this.D = new a();
        this.E = new b();
        this.F = new c();
        v(context);
        this.G = new q(this);
    }

    public final void A() {
        u();
        this.E.run();
    }

    public final boolean B(float f2) {
        this.B.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.B.getFinalY() > this.f4147f.getHeight();
    }

    @Override // a.b.q.z
    public void a(Menu menu, m.a aVar) {
        z();
        this.f4148g.a(menu, aVar);
    }

    @Override // a.b.q.z
    public boolean b() {
        z();
        return this.f4148g.b();
    }

    @Override // a.b.q.z
    public void c() {
        z();
        this.f4148g.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // a.b.q.z
    public boolean d() {
        z();
        return this.f4148g.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f4149h == null || this.f4150i) {
            return;
        }
        int bottom = this.f4147f.getVisibility() == 0 ? (int) (this.f4147f.getBottom() + this.f4147f.getTranslationY() + 0.5f) : 0;
        this.f4149h.setBounds(0, bottom, getWidth(), this.f4149h.getIntrinsicHeight() + bottom);
        this.f4149h.draw(canvas);
    }

    @Override // a.b.q.z
    public boolean e() {
        z();
        return this.f4148g.e();
    }

    @Override // a.b.q.z
    public boolean f() {
        z();
        return this.f4148g.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        z();
        boolean zQ = q(this.f4147f, rect, true, true, false, true);
        this.s.set(rect);
        a1.a(this, this.s, this.p);
        if (!this.t.equals(this.s)) {
            this.t.set(this.s);
            zQ = true;
        }
        if (!this.q.equals(this.p)) {
            this.q.set(this.p);
            zQ = true;
        }
        if (zQ) {
            requestLayout();
        }
        return true;
    }

    @Override // a.b.q.z
    public boolean g() {
        z();
        return this.f4148g.g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4147f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.G.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f4148g.getTitle();
    }

    @Override // a.b.q.z
    public void h(int i2) {
        z();
        if (i2 == 2) {
            this.f4148g.x();
        } else if (i2 == 5) {
            this.f4148g.y();
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // a.b.q.z
    public void i() {
        z();
        this.f4148g.h();
    }

    @Override // a.i.r.o
    public void j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        k(view, i2, i3, i4, i5, i6);
    }

    @Override // a.i.r.n
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // a.i.r.n
    public boolean l(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // a.i.r.n
    public void m(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // a.i.r.n
    public void n(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // a.i.r.n
    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        f0 f0VarT = f0.t(windowInsets, this);
        boolean zQ = q(this.f4147f, new Rect(f0VarT.g(), f0VarT.i(), f0VarT.h(), f0VarT.f()), true, true, false, true);
        x.g(this, f0VarT, this.p);
        Rect rect = this.p;
        f0 f0VarJ = f0VarT.j(rect.left, rect.top, rect.right, rect.bottom);
        this.w = f0VarJ;
        boolean z = true;
        if (!this.x.equals(f0VarJ)) {
            this.x = this.w;
            zQ = true;
        }
        if (this.q.equals(this.p)) {
            z = zQ;
        } else {
            this.q.set(this.p);
        }
        if (z) {
            requestLayout();
        }
        return f0VarT.a().c().b().r();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        x.m0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int measuredHeight;
        f0 f0VarA;
        z();
        measureChildWithMargins(this.f4147f, i2, 0, i3, 0);
        e eVar = (e) this.f4147f.getLayoutParams();
        int iMax = Math.max(0, this.f4147f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f4147f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f4147f.getMeasuredState());
        boolean z = (x.N(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f4144c;
            if (this.f4152k && this.f4147f.getTabContainer() != null) {
                measuredHeight += this.f4144c;
            }
        } else {
            measuredHeight = this.f4147f.getVisibility() != 8 ? this.f4147f.getMeasuredHeight() : 0;
        }
        this.r.set(this.p);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            this.y = this.w;
        } else {
            this.u.set(this.s);
        }
        if (!this.f4151j && !z) {
            Rect rect = this.r;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i4 >= 21) {
                f0VarA = this.y.j(0, measuredHeight, 0, 0);
                this.y = f0VarA;
            }
        } else if (i4 >= 21) {
            f0VarA = new f0.b(this.y).c(a.i.j.b.b(this.y.g(), this.y.i() + measuredHeight, this.y.h(), this.y.f() + 0)).a();
            this.y = f0VarA;
        } else {
            Rect rect2 = this.u;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        q(this.f4146e, this.r, true, true, true, true);
        if (i4 >= 21 && !this.z.equals(this.y)) {
            f0 f0Var = this.y;
            this.z = f0Var;
            x.h(this.f4146e, f0Var);
        } else if (i4 < 21 && !this.v.equals(this.u)) {
            this.v.set(this.u);
            this.f4146e.a(this.u);
        }
        measureChildWithMargins(this.f4146e, i2, 0, i3, 0);
        e eVar2 = (e) this.f4146e.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f4146e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f4146e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f4146e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.i.r.p
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.f4153l || !z) {
            return false;
        }
        if (B(f3)) {
            p();
        } else {
            A();
        }
        this.f4154m = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.i.r.p
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.i.r.p
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.i.r.p
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f4155n + i3;
        this.f4155n = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.i.r.p
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.G.b(view, view2, i2);
        this.f4155n = getActionBarHideOffset();
        u();
        d dVar = this.A;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.i.r.p
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f4147f.getVisibility() != 0) {
            return false;
        }
        return this.f4153l;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.i.r.p
    public void onStopNestedScroll(View view) {
        if (this.f4153l && !this.f4154m) {
            if (this.f4155n <= this.f4147f.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.A;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        z();
        int i3 = this.f4156o ^ i2;
        this.f4156o = i2;
        boolean z = (i2 & 4) == 0;
        boolean z2 = (i2 & 256) != 0;
        d dVar = this.A;
        if (dVar != null) {
            dVar.c(!z2);
            if (z || !z2) {
                this.A.a();
            } else {
                this.A.d();
            }
        }
        if ((i3 & 256) == 0 || this.A == null) {
            return;
        }
        x.m0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f4145d = i2;
        d dVar = this.A;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    public final void p() {
        u();
        this.F.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i2) {
        u();
        this.f4147f.setTranslationY(-Math.max(0, Math.min(i2, this.f4147f.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.A = dVar;
        if (getWindowToken() != null) {
            this.A.f(this.f4145d);
            int i2 = this.f4156o;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                x.m0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f4152k = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f4153l) {
            this.f4153l = z;
            if (z) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        z();
        this.f4148g.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f4148g.setIcon(drawable);
    }

    public void setLogo(int i2) {
        z();
        this.f4148g.n(i2);
    }

    public void setOverlayMode(boolean z) {
        this.f4151j = z;
        this.f4150i = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // a.b.q.z
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f4148g.setWindowCallback(callback);
    }

    @Override // a.b.q.z
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f4148g.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a0 t(View view) {
        if (view instanceof a0) {
            return (a0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void u() {
        removeCallbacks(this.E);
        removeCallbacks(this.F);
        ViewPropertyAnimator viewPropertyAnimator = this.C;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4143b);
        this.f4144c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f4149h = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f4150i = context.getApplicationInfo().targetSdkVersion < 19;
        this.B = new OverScroller(context);
    }

    public boolean w() {
        return this.f4151j;
    }

    public final void x() {
        u();
        postDelayed(this.F, 600L);
    }

    public final void y() {
        u();
        postDelayed(this.E, 600L);
    }

    public void z() {
        if (this.f4146e == null) {
            this.f4146e = (ContentFrameLayout) findViewById(f.f72b);
            this.f4147f = (ActionBarContainer) findViewById(f.f73c);
            this.f4148g = t(findViewById(f.f71a));
        }
    }
}

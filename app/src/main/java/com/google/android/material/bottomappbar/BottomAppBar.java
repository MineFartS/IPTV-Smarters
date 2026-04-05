package com.google.android.material.bottomappbar;

import a.i.r.x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.f.a.d.k;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final int Q = k.f15004l;
    public final int R;
    public final c.f.a.d.j0.g S;
    public Animator T;
    public Animator U;
    public int V;
    public int W;
    public boolean f0;
    public int g0;
    public ArrayList<g> h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public Behavior l0;
    public int m0;
    public int n0;
    public int o0;
    public AnimatorListenerAdapter p0;
    public c.f.a.d.m.k<FloatingActionButton> q0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Rect f24344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WeakReference<BottomAppBar> f24345f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f24346g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final View.OnLayoutChangeListener f24347h;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f24345f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.j(Behavior.this.f24344e);
                int iHeight = Behavior.this.f24344e.height();
                bottomAppBar.y0(iHeight);
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f24346g == 0) {
                    ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(c.f.a.d.d.C) - ((floatingActionButton.getMeasuredHeight() - iHeight) / 2));
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (c.f.a.d.d0.k.d(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.R;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.R;
                    }
                }
            }
        }

        public Behavior() {
            this.f24347h = new a();
            this.f24344e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f24347h = new a();
            this.f24344e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i2) {
            this.f24345f = new WeakReference<>(bottomAppBar);
            View viewO0 = bottomAppBar.o0();
            if (viewO0 != null && !x.U(viewO0)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) viewO0.getLayoutParams();
                fVar.f4335d = 49;
                this.f24346g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (viewO0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewO0;
                    floatingActionButton.addOnLayoutChangeListener(this.f24347h);
                    bottomAppBar.g0(floatingActionButton);
                }
                bottomAppBar.w0();
            }
            coordinatorLayout.J(bottomAppBar, i2);
            return super.l(coordinatorLayout, bottomAppBar, i2);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i2, int i3) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i2, i3);
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.l0();
            BottomAppBar.this.T = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m0();
        }
    }

    public class b extends FloatingActionButton.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f24350a;

        public class a extends FloatingActionButton.b {
            public a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.l0();
            }
        }

        public b(int i2) {
            this.f24350a = i2;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.q0(this.f24350a));
            floatingActionButton.s(new a());
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.l0();
            BottomAppBar.this.j0 = false;
            BottomAppBar.this.U = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m0();
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f24354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f24355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f24356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f24357e;

        public d(ActionMenuView actionMenuView, int i2, boolean z) {
            this.f24355c = actionMenuView;
            this.f24356d = i2;
            this.f24357e = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f24354b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f24354b) {
                return;
            }
            boolean z = BottomAppBar.this.i0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.u0(bottomAppBar.i0);
            BottomAppBar.this.A0(this.f24355c, this.f24356d, this.f24357e, z);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f24359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f24360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f24361d;

        public e(ActionMenuView actionMenuView, int i2, boolean z) {
            this.f24359b = actionMenuView;
            this.f24360c = i2;
            this.f24361d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24359b.setTranslationX(BottomAppBar.this.p0(r0, this.f24360c, this.f24361d));
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.p0.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonN0 = BottomAppBar.this.n0();
            if (floatingActionButtonN0 != null) {
                floatingActionButtonN0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    public interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    public static class h extends a.k.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f24365e;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i2) {
                return new h[i2];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24364d = parcel.readInt();
            this.f24365e = parcel.readInt() != 0;
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.k.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f24364d);
            parcel.writeInt(this.f24365e ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.m0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return q0(this.V);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.o0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.n0;
    }

    private c.f.a.d.p.a getTopEdgeTreatment() {
        return (c.f.a.d.p.a) this.S.C().p();
    }

    public final void A0(ActionMenuView actionMenuView, int i2, boolean z, boolean z2) {
        e eVar = new e(actionMenuView, i2, z);
        if (z2) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    public final void g0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.p0);
        floatingActionButton.f(new f());
        floatingActionButton.g(this.q0);
    }

    public ColorStateList getBackgroundTint() {
        return this.S.E();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.l0 == null) {
            this.l0 = new Behavior();
        }
        return this.l0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c();
    }

    public int getFabAlignmentMode() {
        return this.V;
    }

    public int getFabAnimationMode() {
        return this.W;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f();
    }

    public boolean getHideOnScroll() {
        return this.f0;
    }

    public final void h0() {
        Animator animator = this.U;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.T;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public void i0(int i2, List<Animator> list) {
        FloatingActionButton floatingActionButtonN0 = n0();
        if (floatingActionButtonN0 == null || floatingActionButtonN0.n()) {
            return;
        }
        m0();
        floatingActionButtonN0.l(new b(i2));
    }

    public final void j0(int i2, List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(n0(), "translationX", q0(i2));
        objectAnimatorOfFloat.setDuration(300L);
        list.add(objectAnimatorOfFloat);
    }

    public final void k0(int i2, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - p0(actionMenuView, i2, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat.addListener(new d(actionMenuView, i2, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    public final void l0() {
        ArrayList<g> arrayList;
        int i2 = this.g0 - 1;
        this.g0 = i2;
        if (i2 != 0 || (arrayList = this.h0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public final void m0() {
        ArrayList<g> arrayList;
        int i2 = this.g0;
        this.g0 = i2 + 1;
        if (i2 != 0 || (arrayList = this.h0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final FloatingActionButton n0() {
        View viewO0 = o0();
        if (viewO0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewO0;
        }
        return null;
    }

    public final View o0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).t(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c.f.a.d.j0.h.f(this, this.S);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            h0();
            w0();
        }
        v0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.b());
        this.V = hVar.f24364d;
        this.k0 = hVar.f24365e;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f24364d = this.V;
        hVar.f24365e = this.k0;
        return hVar;
    }

    public int p0(ActionMenuView actionMenuView, int i2, boolean z) {
        if (i2 != 1 || !z) {
            return 0;
        }
        boolean zD = c.f.a.d.d0.k.d(this);
        int measuredWidth = zD ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f135a & 8388615) == 8388611) {
                measuredWidth = zD ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((zD ? actionMenuView.getRight() : actionMenuView.getLeft()) + (zD ? this.n0 : -this.o0));
    }

    public final float q0(int i2) {
        boolean zD = c.f.a.d.d0.k.d(this);
        if (i2 == 1) {
            return ((getMeasuredWidth() / 2) - (this.R + (zD ? this.o0 : this.n0))) * (zD ? -1 : 1);
        }
        return 0.0f;
    }

    public final boolean r0() {
        FloatingActionButton floatingActionButtonN0 = n0();
        return floatingActionButtonN0 != null && floatingActionButtonN0.o();
    }

    public final void s0(int i2, boolean z) {
        if (!x.U(this)) {
            this.j0 = false;
            u0(this.i0);
            return;
        }
        Animator animator = this.U;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!r0()) {
            i2 = 0;
            z = false;
        }
        k0(i2, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.U = animatorSet;
        animatorSet.addListener(new c());
        this.U.start();
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        a.i.j.l.a.o(this.S, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().h(f2);
            this.S.invalidateSelf();
            w0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.S.W(f2);
        getBehavior().G(this, this.S.B() - this.S.A());
    }

    public void setFabAlignmentMode(int i2) {
        x0(i2, 0);
    }

    public void setFabAnimationMode(int i2) {
        this.W = i2;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().j(f2);
            this.S.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().k(f2);
            this.S.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void t0(int i2) {
        if (this.V == i2 || !x.U(this)) {
            return;
        }
        Animator animator = this.T;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.W == 1) {
            j0(i2, arrayList);
        } else {
            i0(i2, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.T = animatorSet;
        animatorSet.addListener(new a());
        this.T.start();
    }

    public void u0(int i2) {
        if (i2 != 0) {
            this.i0 = 0;
            getMenu().clear();
            x(i2);
        }
    }

    public final void v0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.U != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (r0()) {
            z0(actionMenuView, this.V, this.k0);
        } else {
            z0(actionMenuView, 0, false);
        }
    }

    public final void w0() {
        getTopEdgeTreatment().m(getFabTranslationX());
        View viewO0 = o0();
        this.S.Y((this.k0 && r0()) ? 1.0f : 0.0f);
        if (viewO0 != null) {
            viewO0.setTranslationY(getFabTranslationY());
            viewO0.setTranslationX(getFabTranslationX());
        }
    }

    public void x0(int i2, int i3) {
        this.i0 = i3;
        this.j0 = true;
        s0(i2, this.k0);
        t0(i2);
        this.V = i2;
    }

    public boolean y0(int i2) {
        float f2 = i2;
        if (f2 == getTopEdgeTreatment().g()) {
            return false;
        }
        getTopEdgeTreatment().l(f2);
        this.S.invalidateSelf();
        return true;
    }

    public final void z0(ActionMenuView actionMenuView, int i2, boolean z) {
        A0(actionMenuView, i2, z, false);
    }
}

package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPropertyAnimator f24325d;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f24325d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f24322a = 0;
        this.f24323b = 2;
        this.f24324c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24322a = 0;
        this.f24323b = 2;
        this.f24324c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        return i2 == 2;
    }

    public final void F(V v, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f24325d = v.animate().translationY(i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new a());
    }

    public void G(V v, int i2) {
        this.f24324c = i2;
        if (this.f24323b == 1) {
            v.setTranslationY(this.f24322a + i2);
        }
    }

    public void H(V v) {
        if (this.f24323b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f24325d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f24323b = 1;
        F(v, this.f24322a + this.f24324c, 175L, c.f.a.d.m.a.f15044c);
    }

    public void I(V v) {
        if (this.f24323b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f24325d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f24323b = 2;
        F(v, 0, 225L, c.f.a.d.m.a.f15045d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        this.f24322a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, v, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i3 > 0) {
            H(v);
        } else if (i3 < 0) {
            I(v);
        }
    }
}

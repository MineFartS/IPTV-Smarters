package com.google.android.material.floatingactionbutton;

import a.i.r.x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.f.a.d.k;
import c.f.a.d.l;
import c.f.a.d.m.h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final int t = k.s;
    public static final Property<View, Float> u = new b(Float.class, "width");
    public static final Property<View, Float> v = new c(Float.class, "height");
    public static final Property<View, Float> w = new d(Float.class, "paddingStart");
    public static final Property<View, Float> x = new e(Float.class, "paddingEnd");
    public final c.f.a.d.c0.d A;
    public final c.f.a.d.c0.d B;
    public final c.f.a.d.c0.d C;
    public final int D;
    public int E;
    public int F;
    public final CoordinatorLayout.c<ExtendedFloatingActionButton> G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ColorStateList K;
    public int y;
    public final c.f.a.d.c0.d z;

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f24461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f24462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f f24463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24464d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f24465e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f24464d = false;
            this.f24465e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.v1);
            this.f24464d = typedArrayObtainStyledAttributes.getBoolean(l.w1, false);
            this.f24465e = typedArrayObtainStyledAttributes.getBoolean(l.x1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.f24465e;
            extendedFloatingActionButton.r(z ? extendedFloatingActionButton.A : extendedFloatingActionButton.B, z ? this.f24463c : this.f24462b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!G(view)) {
                return false;
            }
            M(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i2) {
            List<View> listS = coordinatorLayout.s(extendedFloatingActionButton);
            int size = listS.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = listS.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.J(extendedFloatingActionButton, i2);
            return true;
        }

        public final boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f24464d || this.f24465e) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        public void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.f24465e;
            extendedFloatingActionButton.r(z ? extendedFloatingActionButton.z : extendedFloatingActionButton.C, z ? this.f24463c : this.f24462b);
        }

        public final boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f24461a == null) {
                this.f24461a = new Rect();
            }
            Rect rect = this.f24461a;
            c.f.a.d.d0.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        public final boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f4339h == 0) {
                fVar.f4339h = 80;
            }
        }
    }

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f24466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c.f.a.d.c0.d f24467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f24468d;

        public a(c.f.a.d.c0.d dVar, f fVar) {
            this.f24467c = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f24466b = true;
            this.f24467c.c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f24467c.a();
            if (this.f24466b) {
                return;
            }
            this.f24467c.i(this.f24468d);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f24467c.onAnimationStart(animator);
            this.f24466b = false;
        }
    }

    public static class b extends Property<View, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            view.getLayoutParams().width = f2.intValue();
            view.requestLayout();
        }
    }

    public static class c extends Property<View, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            view.getLayoutParams().height = f2.intValue();
            view.requestLayout();
        }
    }

    public static class d extends Property<View, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(x.I(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            x.B0(view, f2.intValue(), view.getPaddingTop(), x.H(view), view.getPaddingBottom());
        }
    }

    public static class e extends Property<View, Float> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(x.H(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            x.B0(view, x.I(view), view.getPaddingTop(), f2.intValue(), view.getPaddingBottom());
        }
    }

    public static abstract class f {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.G;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i2 = this.D;
        return i2 < 0 ? (Math.min(x.I(this), x.H(this)) * 2) + getIconSize() : i2;
    }

    public h getExtendMotionSpec() {
        return this.A.e();
    }

    public h getHideMotionSpec() {
        return this.C.e();
    }

    public h getShowMotionSpec() {
        return this.B.e();
    }

    public h getShrinkMotionSpec() {
        return this.z.e();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.H && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.H = false;
            this.z.d();
        }
    }

    public final boolean q() {
        return getVisibility() != 0 ? this.y == 2 : this.y != 1;
    }

    public final void r(c.f.a.d.c0.d dVar, f fVar) {
        if (dVar.f()) {
            return;
        }
        if (!t()) {
            dVar.d();
            dVar.i(fVar);
            return;
        }
        measure(0, 0);
        AnimatorSet animatorSetH = dVar.h();
        animatorSetH.addListener(new a(dVar, fVar));
        Iterator<Animator.AnimatorListener> it = dVar.b().iterator();
        while (it.hasNext()) {
            animatorSetH.addListener(it.next());
        }
        animatorSetH.start();
    }

    public final void s() {
        this.K = getTextColors();
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.J = z;
    }

    public void setExtendMotionSpec(h hVar) {
        this.A.g(hVar);
    }

    public void setExtendMotionSpecResource(int i2) {
        setExtendMotionSpec(h.c(getContext(), i2));
    }

    public void setExtended(boolean z) {
        if (this.H == z) {
            return;
        }
        c.f.a.d.c0.d dVar = z ? this.A : this.z;
        if (dVar.f()) {
            return;
        }
        dVar.d();
    }

    public void setHideMotionSpec(h hVar) {
        this.C.g(hVar);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(h.c(getContext(), i2));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
        if (!this.H || this.I) {
            return;
        }
        this.E = x.I(this);
        this.F = x.H(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
        if (!this.H || this.I) {
            return;
        }
        this.E = i2;
        this.F = i4;
    }

    public void setShowMotionSpec(h hVar) {
        this.B.g(hVar);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(h.c(getContext(), i2));
    }

    public void setShrinkMotionSpec(h hVar) {
        this.z.g(hVar);
    }

    public void setShrinkMotionSpecResource(int i2) {
        setShrinkMotionSpec(h.c(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i2) {
        super.setTextColor(i2);
        s();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        s();
    }

    public final boolean t() {
        return (x.U(this) || (!q() && this.J)) && !isInEditMode();
    }
}

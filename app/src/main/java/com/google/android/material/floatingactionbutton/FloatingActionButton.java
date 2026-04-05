package com.google.android.material.floatingactionbutton;

import a.i.q.i;
import a.i.r.w;
import a.i.r.x;
import a.i.s.m;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.f.a.d.c0.b;
import c.f.a.d.d0.j;
import c.f.a.d.d0.l;
import c.f.a.d.j0.n;
import c.f.a.d.k;
import c.f.a.d.m.h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FloatingActionButton extends l implements w, m, c.f.a.d.b0.a, n, CoordinatorLayout.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24470c = k.f14999g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f24471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f24472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f24473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f24474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f24475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f24482o;
    public final Rect p;
    public final a.b.q.m q;
    public final c.f.a.d.b0.b r;
    public c.f.a.d.c0.b s;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f24483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f24484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24485c;

        public BaseBehavior() {
            this.f24485c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f.a.d.l.O1);
            this.f24485c = typedArrayObtainStyledAttributes.getBoolean(c.f.a.d.l.P1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f24482o;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f24482o;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i2 = 0;
            int i3 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                x.a0(floatingActionButton, i2);
            }
            if (i3 != 0) {
                x.Z(floatingActionButton, i3);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!F(view)) {
                return false;
            }
            L(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i2) {
            List<View> listS = coordinatorLayout.s(floatingActionButton);
            int size = listS.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = listS.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.J(floatingActionButton, i2);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        public final boolean J(View view, FloatingActionButton floatingActionButton) {
            return this.f24485c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f24483a == null) {
                this.f24483a = new Rect();
            }
            Rect rect = this.f24483a;
            c.f.a.d.d0.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m(this.f24484b, false);
                return true;
            }
            floatingActionButton.t(this.f24484b, false);
            return true;
        }

        public final boolean L(View view, FloatingActionButton floatingActionButton) {
            if (!J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m(this.f24484b, false);
                return true;
            }
            floatingActionButton.t(this.f24484b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f4339h == 0) {
                fVar.f4339h = 80;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: E */
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: H */
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.h(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i2) {
            return super.l(coordinatorLayout, floatingActionButton, i2);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void g(CoordinatorLayout.f fVar) {
            super.g(fVar);
        }
    }

    public class a implements b.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f24486a;

        public a(b bVar) {
            this.f24486a = bVar;
        }

        @Override // c.f.a.d.c0.b.j
        public void a() {
            this.f24486a.b(FloatingActionButton.this);
        }

        @Override // c.f.a.d.c0.b.j
        public void b() {
            this.f24486a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    public class c implements c.f.a.d.i0.b {
        public c() {
        }

        @Override // c.f.a.d.i0.b
        public void a(int i2, int i3, int i4, int i5) {
            FloatingActionButton.this.f24482o.set(i2, i3, i4, i5);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i2 + floatingActionButton.f24479l, i3 + FloatingActionButton.this.f24479l, i4 + FloatingActionButton.this.f24479l, i5 + FloatingActionButton.this.f24479l);
        }

        @Override // c.f.a.d.i0.b
        public void b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // c.f.a.d.i0.b
        public boolean c() {
            return FloatingActionButton.this.f24481n;
        }
    }

    public class d<T extends FloatingActionButton> implements b.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.a.d.m.k<T> f24489a;

        public d(c.f.a.d.m.k<T> kVar) {
            this.f24489a = kVar;
        }

        @Override // c.f.a.d.c0.b.i
        public void a() {
            this.f24489a.b(FloatingActionButton.this);
        }

        @Override // c.f.a.d.c0.b.i
        public void b() {
            this.f24489a.a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).f24489a.equals(this.f24489a);
        }

        public int hashCode() {
            return this.f24489a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f.a.d.b.q);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f24470c;
        super(c.f.a.d.o0.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f24482o = new Rect();
        this.p = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayH = j.h(context2, attributeSet, c.f.a.d.l.y1, i2, i3, new int[0]);
        this.f24471d = c.f.a.d.g0.c.a(context2, typedArrayH, c.f.a.d.l.A1);
        this.f24472e = c.f.a.d.d0.k.e(typedArrayH.getInt(c.f.a.d.l.B1, -1), null);
        this.f24475h = c.f.a.d.g0.c.a(context2, typedArrayH, c.f.a.d.l.L1);
        this.f24477j = typedArrayH.getInt(c.f.a.d.l.G1, -1);
        this.f24478k = typedArrayH.getDimensionPixelSize(c.f.a.d.l.F1, 0);
        this.f24476i = typedArrayH.getDimensionPixelSize(c.f.a.d.l.C1, 0);
        float dimension = typedArrayH.getDimension(c.f.a.d.l.D1, 0.0f);
        float dimension2 = typedArrayH.getDimension(c.f.a.d.l.I1, 0.0f);
        float dimension3 = typedArrayH.getDimension(c.f.a.d.l.K1, 0.0f);
        this.f24481n = typedArrayH.getBoolean(c.f.a.d.l.N1, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.f.a.d.d.R);
        this.f24480m = typedArrayH.getDimensionPixelSize(c.f.a.d.l.J1, 0);
        h hVarB = h.b(context2, typedArrayH, c.f.a.d.l.M1);
        h hVarB2 = h.b(context2, typedArrayH, c.f.a.d.l.H1);
        c.f.a.d.j0.k kVarM = c.f.a.d.j0.k.g(context2, attributeSet, i2, i3, c.f.a.d.j0.k.f14923a).m();
        boolean z = typedArrayH.getBoolean(c.f.a.d.l.E1, false);
        setEnabled(typedArrayH.getBoolean(c.f.a.d.l.z1, true));
        typedArrayH.recycle();
        a.b.q.m mVar = new a.b.q.m(this);
        this.q = mVar;
        mVar.f(attributeSet, i2);
        this.r = new c.f.a.d.b0.b(this);
        getImpl().X(kVarM);
        getImpl().x(this.f24471d, this.f24472e, this.f24475h, this.f24476i);
        getImpl().T(dimensionPixelSize);
        getImpl().N(dimension);
        getImpl().Q(dimension2);
        getImpl().U(dimension3);
        getImpl().S(this.f24480m);
        getImpl().Y(hVarB);
        getImpl().P(hVarB2);
        getImpl().O(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private c.f.a.d.c0.b getImpl() {
        if (this.s == null) {
            this.s = h();
        }
        return this.s;
    }

    public static int r(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    @Override // c.f.a.d.b0.a
    public boolean a() {
        return this.r.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void g(c.f.a.d.m.k<? extends FloatingActionButton> kVar) {
        getImpl().f(new d(kVar));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f24471d;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f24472e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().t();
    }

    public Drawable getContentBackground() {
        return getImpl().k();
    }

    public int getCustomSize() {
        return this.f24478k;
    }

    public int getExpandedComponentIdHint() {
        return this.r.b();
    }

    public h getHideMotionSpec() {
        return getImpl().p();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f24475h;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f24475h;
    }

    public c.f.a.d.j0.k getShapeAppearanceModel() {
        return (c.f.a.d.j0.k) i.e(getImpl().u());
    }

    public h getShowMotionSpec() {
        return getImpl().v();
    }

    public int getSize() {
        return this.f24477j;
    }

    public int getSizeDimension() {
        return k(this.f24477j);
    }

    @Override // a.i.r.w
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // a.i.r.w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // a.i.s.m
    public ColorStateList getSupportImageTintList() {
        return this.f24473f;
    }

    @Override // a.i.s.m
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f24474g;
    }

    public boolean getUseCompatPadding() {
        return this.f24481n;
    }

    public final c.f.a.d.c0.b h() {
        return Build.VERSION.SDK_INT >= 21 ? new c.f.a.d.c0.c(this, new c()) : new c.f.a.d.c0.b(this, new c());
    }

    @Deprecated
    public boolean i(Rect rect) {
        if (!x.U(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        p(rect);
        return true;
    }

    public void j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        p(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    public final int k(int i2) {
        int i3 = this.f24478k;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 != -1) {
            return resources.getDimensionPixelSize(i2 != 1 ? c.f.a.d.d.f14705d : c.f.a.d.d.f14704c);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? k(1) : k(0);
    }

    public void l(b bVar) {
        m(bVar, true);
    }

    public void m(b bVar, boolean z) {
        getImpl().w(u(bVar), z);
    }

    public boolean n() {
        return getImpl().y();
    }

    public boolean o() {
        return getImpl().z();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.f24479l = (sizeDimension - this.f24480m) / 2;
        getImpl().f0();
        int iMin = Math.min(r(sizeDimension, i2), r(sizeDimension, i3));
        Rect rect = this.f24482o;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c.f.a.d.l0.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c.f.a.d.l0.a aVar = (c.f.a.d.l0.a) parcelable;
        super.onRestoreInstanceState(aVar.b());
        this.r.d((Bundle) i.e(aVar.f15041d.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        c.f.a.d.l0.a aVar = new c.f.a.d.l0.a(parcelableOnSaveInstanceState);
        aVar.f15041d.put("expandableWidgetHelper", this.r.e());
        return aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && i(this.p) && !this.p.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.f24482o;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void q() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f24473f;
        if (colorStateList == null) {
            a.i.j.l.a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f24474g;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(a.b.q.i.e(colorForState, mode));
    }

    public void s(b bVar) {
        t(bVar, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f24471d != colorStateList) {
            this.f24471d = colorStateList;
            getImpl().L(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f24472e != mode) {
            this.f24472e = mode;
            getImpl().M(mode);
        }
    }

    public void setCompatElevation(float f2) {
        getImpl().N(f2);
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        getImpl().Q(f2);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        getImpl().U(f2);
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i2 != this.f24478k) {
            this.f24478k = i2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        getImpl().g0(f2);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().o()) {
            getImpl().O(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i2) {
        this.r.f(i2);
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().P(hVar);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(h.c(getContext(), i2));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().e0();
            if (this.f24473f != null) {
                q();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        this.q.g(i2);
        q();
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f24475h != colorStateList) {
            this.f24475h = colorStateList;
            getImpl().V(this.f24475h);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().I();
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().I();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().W(z);
    }

    @Override // c.f.a.d.j0.n
    public void setShapeAppearanceModel(c.f.a.d.j0.k kVar) {
        getImpl().X(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().Y(hVar);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(h.c(getContext(), i2));
    }

    public void setSize(int i2) {
        this.f24478k = 0;
        if (i2 != this.f24477j) {
            this.f24477j = i2;
            requestLayout();
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // a.i.s.m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f24473f != colorStateList) {
            this.f24473f = colorStateList;
            q();
        }
    }

    @Override // a.i.s.m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f24474g != mode) {
            this.f24474g = mode;
            q();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f24481n != z) {
            this.f24481n = z;
            getImpl().C();
        }
    }

    @Override // c.f.a.d.d0.l, android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public void t(b bVar, boolean z) {
        getImpl().c0(u(bVar), z);
    }

    public final b.j u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }
}

package com.google.android.material.appbar;

import a.i.r.f0;
import a.i.r.g0.c;
import a.i.r.g0.f;
import a.i.r.l;
import a.i.r.r;
import a.i.r.x;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.f.a.d.d0.j;
import c.f.a.d.j0.g;
import c.f.a.d.j0.h;
import c.f.a.d.k;
import c.f.a.d.n.e;
import java.lang.ref.WeakReference;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f24284b = k.f14997e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f0 f24291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<c> f24292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f24293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f24294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f24295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24297o;
    public WeakReference<View> p;
    public ValueAnimator q;
    public int[] r;
    public Drawable s;

    public static class BaseBehavior<T extends AppBarLayout> extends c.f.a.d.n.a<T> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f24298k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f24299l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ValueAnimator f24300m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f24301n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f24302o;
        public float p;
        public WeakReference<View> q;
        public d r;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f24303b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f24304c;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f24303b = coordinatorLayout;
                this.f24304c = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f24303b, this.f24304c, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public class b implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f24306a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f24307b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f24308c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f24309d;

            public b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
                this.f24306a = coordinatorLayout;
                this.f24307b = appBarLayout;
                this.f24308c = view;
                this.f24309d = i2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // a.i.r.g0.f
            public boolean a(View view, f.a aVar) {
                BaseBehavior.this.q(this.f24306a, this.f24307b, this.f24308c, 0, this.f24309d, new int[]{0, 0}, 1);
                return true;
            }
        }

        public class c implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f24311a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f24312b;

            public c(AppBarLayout appBarLayout, boolean z) {
                this.f24311a = appBarLayout;
                this.f24312b = z;
            }

            @Override // a.i.r.g0.f
            public boolean a(View view, f.a aVar) {
                this.f24311a.setExpanded(this.f24312b);
                return true;
            }
        }

        public static abstract class d<T extends AppBarLayout> {
        }

        public static class e extends a.k.a.a {
            public static final Parcelable.Creator<e> CREATOR = new a();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f24314d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float f24315e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f24316f;

            public static class a implements Parcelable.ClassLoaderCreator<e> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public e createFromParcel(Parcel parcel) {
                    return new e(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new e(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public e[] newArray(int i2) {
                    return new e[i2];
                }
            }

            public e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f24314d = parcel.readInt();
                this.f24315e = parcel.readFloat();
                this.f24316f = parcel.readByte() != 0;
            }

            public e(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // a.k.a.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                super.writeToParcel(parcel, i2);
                parcel.writeInt(this.f24314d);
                parcel.writeFloat(this.f24315e);
                parcel.writeByte(this.f24316f ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.f24301n = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f24301n = -1;
        }

        public static boolean Y(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        public static View a0(AppBarLayout appBarLayout, int i2) {
            int iAbs = Math.abs(i2);
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // c.f.a.d.n.a
        public int M() {
            return E() + this.f24298k;
        }

        public final void S(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (M() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                T(coordinatorLayout, t, c.a.f2064m, false);
            }
            if (M() != 0) {
                if (!view.canScrollVertically(-1)) {
                    T(coordinatorLayout, t, c.a.f2065n, true);
                    return;
                }
                int i2 = -t.getDownNestedPreScrollRange();
                if (i2 != 0) {
                    x.l0(coordinatorLayout, c.a.f2065n, null, new b(coordinatorLayout, t, view, i2));
                }
            }
        }

        public final void T(CoordinatorLayout coordinatorLayout, T t, c.a aVar, boolean z) {
            x.l0(coordinatorLayout, aVar, null, new c(t, z));
        }

        public final void U(CoordinatorLayout coordinatorLayout, T t, int i2, float f2) {
            int iAbs = Math.abs(M() - i2);
            float fAbs = Math.abs(f2);
            V(coordinatorLayout, t, i2, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t.getHeight()) + 1.0f) * 150.0f));
        }

        public final void V(CoordinatorLayout coordinatorLayout, T t, int i2, int i3) {
            int iM = M();
            if (iM == i2) {
                ValueAnimator valueAnimator = this.f24300m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f24300m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f24300m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f24300m = valueAnimator3;
                valueAnimator3.setInterpolator(c.f.a.d.m.a.f15046e);
                this.f24300m.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f24300m.setDuration(Math.min(i3, IjkMediaCodecInfo.RANK_LAST_CHANCE));
            this.f24300m.setIntValues(iM, i2);
            this.f24300m.start();
        }

        @Override // c.f.a.d.n.a
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public boolean H(T t) {
            if (this.r != null) {
                throw null;
            }
            WeakReference<View> weakReference = this.q;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public final boolean X(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.h() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        public final View Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt instanceof l) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int b0(T t, int i2) {
            int childCount = t.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = t.getChildAt(i3);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (Y(dVar.a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i4 = -i2;
                if (top <= i4 && bottom >= i4) {
                    return i3;
                }
            }
            return -1;
        }

        @Override // c.f.a.d.n.a
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public int K(T t) {
            return -t.getDownNestedScrollRange();
        }

        @Override // c.f.a.d.n.a
        /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
        public int L(T t) {
            return t.getTotalScrollRange();
        }

        public final int e0(T t, int i2) {
            int iAbs = Math.abs(i2);
            int childCount = t.getChildCount();
            int topInset = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator interpolatorB = dVar.b();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i3++;
                } else if (interpolatorB != null) {
                    int iA = dVar.a();
                    if ((iA & 1) != 0) {
                        topInset = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((iA & 2) != 0) {
                            topInset -= x.D(childAt);
                        }
                    }
                    if (x.z(childAt)) {
                        topInset -= t.getTopInset();
                    }
                    if (topInset > 0) {
                        float f2 = topInset;
                        return Integer.signum(i2) * (childAt.getTop() + Math.round(f2 * interpolatorB.getInterpolation((iAbs - childAt.getTop()) / f2)));
                    }
                }
            }
            return i2;
        }

        @Override // c.f.a.d.n.a
        /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
        public void N(CoordinatorLayout coordinatorLayout, T t) {
            q0(coordinatorLayout, t);
            if (t.j()) {
                t.q(t.s(Z(coordinatorLayout)));
            }
        }

        @Override // c.f.a.d.n.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, T t, int i2) {
            boolean zL = super.l(coordinatorLayout, t, i2);
            int pendingAction = t.getPendingAction();
            int i3 = this.f24301n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                P(coordinatorLayout, t, (-childAt.getBottom()) + (this.f24302o ? x.D(childAt) + t.getTopInset() : Math.round(childAt.getHeight() * this.p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        U(coordinatorLayout, t, i4, 0.0f);
                    } else {
                        P(coordinatorLayout, t, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        U(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.m();
            this.f24301n = -1;
            G(a.i.m.a.b(E(), -t.getTotalScrollRange(), 0));
            s0(coordinatorLayout, t, E(), 0, true);
            t.k(E());
            r0(coordinatorLayout, t);
            return zL;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
        public boolean m(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4, int i5) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t.getLayoutParams())).height != -2) {
                return super.m(coordinatorLayout, t, i2, i3, i4, i5);
            }
            coordinatorLayout.K(t, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public void q(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int[] iArr, int i4) {
            int i5;
            int downNestedPreScrollRange;
            if (i3 != 0) {
                if (i3 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    downNestedPreScrollRange = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i5 != downNestedPreScrollRange) {
                    iArr[1] = O(coordinatorLayout, t, i3, i5, downNestedPreScrollRange);
                }
            }
            if (t.j()) {
                t.q(t.s(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
        public void t(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            if (i5 < 0) {
                iArr[1] = O(coordinatorLayout, t, i5, -t.getDownNestedScrollRange(), 0);
            }
            if (i5 == 0) {
                r0(coordinatorLayout, t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (!(parcelable instanceof e)) {
                super.x(coordinatorLayout, t, parcelable);
                this.f24301n = -1;
                return;
            }
            e eVar = (e) parcelable;
            super.x(coordinatorLayout, t, eVar.b());
            this.f24301n = eVar.f24314d;
            this.p = eVar.f24315e;
            this.f24302o = eVar.f24316f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable parcelableY = super.y(coordinatorLayout, t);
            int iE = E();
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int bottom = childAt.getBottom() + iE;
                if (childAt.getTop() + iE <= 0 && bottom >= 0) {
                    e eVar = new e(parcelableY);
                    eVar.f24314d = i2;
                    eVar.f24316f = bottom == x.D(childAt) + t.getTopInset();
                    eVar.f24315e = bottom / childAt.getHeight();
                    return eVar;
                }
            }
            return parcelableY;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i2, int i3) {
            ValueAnimator valueAnimator;
            boolean z = (i2 & 2) != 0 && (t.j() || X(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f24300m) != null) {
                valueAnimator.cancel();
            }
            this.q = null;
            this.f24299l = i3;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void C(CoordinatorLayout coordinatorLayout, T t, View view, int i2) {
            if (this.f24299l == 0 || i2 == 1) {
                q0(coordinatorLayout, t);
                if (t.j()) {
                    t.q(t.s(view));
                }
            }
            this.q = new WeakReference<>(view);
        }

        @Override // c.f.a.d.n.a
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public int Q(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4) {
            int iM = M();
            int i5 = 0;
            if (i3 == 0 || iM < i3 || iM > i4) {
                this.f24298k = 0;
            } else {
                int iB = a.i.m.a.b(i2, i3, i4);
                if (iM != iB) {
                    int iE0 = t.f() ? e0(t, iB) : iB;
                    boolean zG = G(iE0);
                    i5 = iM - iB;
                    this.f24298k = iB - iE0;
                    if (!zG && t.f()) {
                        coordinatorLayout.f(t);
                    }
                    t.k(E());
                    s0(coordinatorLayout, t, iB, iB < iM ? -1 : 1, false);
                }
            }
            r0(coordinatorLayout, t);
            return i5;
        }

        public final boolean p0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> listT = coordinatorLayout.t(t);
            int size = listT.size();
            for (int i2 = 0; i2 < size; i2++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) listT.get(i2).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarF).K() != 0;
                }
            }
            return false;
        }

        public final void q0(CoordinatorLayout coordinatorLayout, T t) {
            int iM = M();
            int iB0 = b0(t, iM);
            if (iB0 >= 0) {
                View childAt = t.getChildAt(iB0);
                d dVar = (d) childAt.getLayoutParams();
                int iA = dVar.a();
                if ((iA & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int iD = -childAt.getBottom();
                    if (iB0 == t.getChildCount() - 1) {
                        iD += t.getTopInset();
                    }
                    if (Y(iA, 2)) {
                        iD += x.D(childAt);
                    } else if (Y(iA, 5)) {
                        int iD2 = x.D(childAt) + iD;
                        if (iM < iD2) {
                            i2 = iD2;
                        } else {
                            iD = iD2;
                        }
                    }
                    if (Y(iA, 32)) {
                        i2 += ((LinearLayout.LayoutParams) dVar).topMargin;
                        iD -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    if (iM < (iD + i2) / 2) {
                        i2 = iD;
                    }
                    U(coordinatorLayout, t, a.i.m.a.b(i2, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void r0(CoordinatorLayout coordinatorLayout, T t) {
            x.j0(coordinatorLayout, c.a.f2064m.b());
            x.j0(coordinatorLayout, c.a.f2065n.b());
            View viewZ = Z(coordinatorLayout);
            if (viewZ == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.f) viewZ.getLayoutParams()).f() instanceof ScrollingViewBehavior)) {
                return;
            }
            S(coordinatorLayout, t, viewZ);
        }

        public final void s0(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, boolean z) {
            View viewA0 = a0(t, i2);
            if (viewA0 != null) {
                int iA = ((d) viewA0.getLayoutParams()).a();
                boolean zS = false;
                if ((iA & 1) != 0) {
                    int iD = x.D(viewA0);
                    if (i3 <= 0 || (iA & 12) == 0 ? !((iA & 2) == 0 || (-i2) < (viewA0.getBottom() - iD) - t.getTopInset()) : (-i2) >= (viewA0.getBottom() - iD) - t.getTopInset()) {
                        zS = true;
                    }
                }
                if (t.j()) {
                    zS = t.s(Z(coordinatorLayout));
                }
                boolean zQ = t.q(zS);
                if (z || (zQ && p0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // c.f.a.d.n.c
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // c.f.a.d.n.c
        public /* bridge */ /* synthetic */ boolean G(int i2) {
            return super.G(i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: g0 */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2) {
            return super.l(coordinatorLayout, appBarLayout, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: h0 */
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, int i3, int i4, int i5) {
            return super.m(coordinatorLayout, appBarLayout, i2, i3, i4, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: i0 */
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int[] iArr, int i4) {
            super.q(coordinatorLayout, appBarLayout, view, i2, i3, iArr, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: j0 */
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i2, i3, i4, i5, i6, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: k0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: l0 */
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: m0 */
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i2, int i3) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i2, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: n0 */
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
            super.C(coordinatorLayout, appBarLayout, view, i2);
        }
    }

    public static class ScrollingViewBehavior extends c.f.a.d.n.b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f.a.d.l.Z3);
            O(typedArrayObtainStyledAttributes.getDimensionPixelSize(c.f.a.d.l.a4, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        public static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).M();
            }
            return 0;
        }

        @Override // c.f.a.d.n.b
        public float J(View view) {
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iR = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iR > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iR / i2) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // c.f.a.d.n.b
        public int L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        @Override // c.f.a.d.n.b
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final void S(View view, View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                x.a0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).f24298k) + M()) - I(view2));
            }
        }

        public final void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.j()) {
                    appBarLayout.q(appBarLayout.s(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                x.j0(coordinatorLayout, c.a.f2064m.b());
                x.j0(coordinatorLayout, c.a.f2065n.b());
            }
        }

        @Override // c.f.a.d.n.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {
            return super.l(coordinatorLayout, view, i2);
        }

        @Override // c.f.a.d.n.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
            return super.m(coordinatorLayout, view, i2, i3, i4, i5);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutH = H(coordinatorLayout.s(view));
            if (appBarLayoutH != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f15078d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutH.n(false, !z);
                    return true;
                }
            }
            return false;
        }
    }

    public class a implements r {
        public a() {
        }

        @Override // a.i.r.r
        public f0 a(View view, f0 f0Var) {
            return AppBarLayout.this.l(f0Var);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f24318b;

        public b(g gVar) {
            this.f24318b = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f24318b.W(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface c<T extends AppBarLayout> {
        void a(T t, int i2);
    }

    public static class d extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Interpolator f24321b;

        public d(int i2, int i3) {
            super(i2, i3);
            this.f24320a = 1;
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f24320a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f.a.d.l.u);
            this.f24320a = typedArrayObtainStyledAttributes.getInt(c.f.a.d.l.v, 0);
            int i2 = c.f.a.d.l.w;
            if (typedArrayObtainStyledAttributes.hasValue(i2)) {
                this.f24321b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i2, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f24320a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f24320a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f24320a = 1;
        }

        public int a() {
            return this.f24320a;
        }

        public Interpolator b() {
            return this.f24321b;
        }

        public boolean c() {
            int i2 = this.f24320a;
            return (i2 & 1) == 1 && (i2 & 10) != 0;
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f.a.d.b.f14624a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f24284b;
        super(c.f.a.d.o0.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f24286d = -1;
        this.f24287e = -1;
        this.f24288f = -1;
        this.f24290h = 0;
        Context context2 = getContext();
        setOrientation(1);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            e.a(this);
            e.c(this, attributeSet, i2, i3);
        }
        TypedArray typedArrayH = j.h(context2, attributeSet, c.f.a.d.l.f15036k, i2, i3, new int[0]);
        x.s0(this, typedArrayH.getDrawable(c.f.a.d.l.f15037l));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            g gVar = new g();
            gVar.X(ColorStateList.valueOf(colorDrawable.getColor()));
            gVar.M(context2);
            x.s0(this, gVar);
        }
        int i5 = c.f.a.d.l.p;
        if (typedArrayH.hasValue(i5)) {
            o(typedArrayH.getBoolean(i5, false), false, false);
        }
        if (i4 >= 21) {
            if (typedArrayH.hasValue(c.f.a.d.l.f15040o)) {
                e.b(this, typedArrayH.getDimensionPixelSize(r13, 0));
            }
        }
        if (i4 >= 26) {
            int i6 = c.f.a.d.l.f15039n;
            if (typedArrayH.hasValue(i6)) {
                setKeyboardNavigationCluster(typedArrayH.getBoolean(i6, false));
            }
            int i7 = c.f.a.d.l.f15038m;
            if (typedArrayH.hasValue(i7)) {
                setTouchscreenBlocksFocus(typedArrayH.getBoolean(i7, false));
            }
        }
        this.f24296n = typedArrayH.getBoolean(c.f.a.d.l.q, false);
        this.f24297o = typedArrayH.getResourceId(c.f.a.d.l.r, -1);
        setStatusBarForeground(typedArrayH.getDrawable(c.f.a.d.l.s));
        typedArrayH.recycle();
        x.A0(this, new a());
    }

    public final void a() {
        WeakReference<View> weakReference = this.p;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.p = null;
    }

    public final View b(View view) {
        int i2;
        if (this.p == null && (i2 = this.f24297o) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i2) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f24297o);
            }
            if (viewFindViewById != null) {
                this.p = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.p;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (r()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f24285c);
            this.s.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.s;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams) : new d((LinearLayout.LayoutParams) layoutParams);
    }

    public boolean f() {
        return this.f24289g;
    }

    public final boolean g() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((d) getChildAt(i2).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int iD;
        int i2 = this.f24287e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f24320a;
            if ((i4 & 5) != 5) {
                if (i3 > 0) {
                    break;
                }
            } else {
                int i5 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if ((i4 & 8) != 0) {
                    iD = x.D(childAt);
                } else if ((i4 & 2) != 0) {
                    iD = measuredHeight - x.D(childAt);
                } else {
                    iMin = i5 + measuredHeight;
                    if (childCount == 0 && x.z(childAt)) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i3 += iMin;
                }
                iMin = i5 + iD;
                if (childCount == 0) {
                    iMin = Math.min(iMin, measuredHeight - getTopInset());
                }
                i3 += iMin;
            }
        }
        int iMax = Math.max(0, i3);
        this.f24287e = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i2 = this.f24288f;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int iD = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            int i4 = dVar.f24320a;
            if ((i4 & 1) == 0) {
                break;
            }
            iD += measuredHeight;
            if ((i4 & 2) != 0) {
                iD -= x.D(childAt);
                break;
            }
            i3++;
        }
        int iMax = Math.max(0, iD);
        this.f24288f = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f24297o;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iD = x.D(this);
        if (iD == 0) {
            int childCount = getChildCount();
            iD = childCount >= 1 ? x.D(getChildAt(childCount - 1)) : 0;
            if (iD == 0) {
                return getHeight() / 3;
            }
        }
        return (iD * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f24290h;
    }

    public Drawable getStatusBarForeground() {
        return this.s;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        f0 f0Var = this.f24291i;
        if (f0Var != null) {
            return f0Var.i();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f24286d;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int iD = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f24320a;
            if ((i4 & 1) == 0) {
                break;
            }
            iD += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            if (i3 == 0 && x.z(childAt)) {
                iD -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                iD -= x.D(childAt);
                break;
            }
            i3++;
        }
        int iMax = Math.max(0, iD);
        this.f24286d = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean h() {
        return getTotalScrollRange() != 0;
    }

    public final void i() {
        this.f24286d = -1;
        this.f24287e = -1;
        this.f24288f = -1;
    }

    public boolean j() {
        return this.f24296n;
    }

    public void k(int i2) {
        this.f24285c = i2;
        if (!willNotDraw()) {
            x.g0(this);
        }
        List<c> list = this.f24292j;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                c cVar = this.f24292j.get(i3);
                if (cVar != null) {
                    cVar.a(this, i2);
                }
            }
        }
    }

    public f0 l(f0 f0Var) {
        f0 f0Var2 = x.z(this) ? f0Var : null;
        if (!a.i.q.d.a(this.f24291i, f0Var2)) {
            this.f24291i = f0Var2;
            v();
            requestLayout();
        }
        return f0Var;
    }

    public void m() {
        this.f24290h = 0;
    }

    public void n(boolean z, boolean z2) {
        o(z, z2, true);
    }

    public final void o(boolean z, boolean z2, boolean z3) {
        this.f24290h = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        if (this.r == null) {
            this.r = new int[4];
        }
        int[] iArr = this.r;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        boolean z = this.f24294l;
        int i3 = c.f.a.d.b.C;
        if (!z) {
            i3 = -i3;
        }
        iArr[0] = i3;
        iArr[1] = (z && this.f24295m) ? c.f.a.d.b.D : -c.f.a.d.b.D;
        int i4 = c.f.a.d.b.A;
        if (!z) {
            i4 = -i4;
        }
        iArr[2] = i4;
        iArr[3] = (z && this.f24295m) ? c.f.a.d.b.z : -c.f.a.d.b.z;
        return LinearLayout.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        boolean z2 = true;
        if (x.z(this) && t()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                x.a0(getChildAt(childCount), topInset);
            }
        }
        i();
        this.f24289g = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            }
            if (((d) getChildAt(i6).getLayoutParams()).b() != null) {
                this.f24289g = true;
                break;
            }
            i6++;
        }
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f24293k) {
            return;
        }
        if (!this.f24296n && !g()) {
            z2 = false;
        }
        p(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824 && x.z(this) && t()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = a.i.m.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i3));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        i();
    }

    public final boolean p(boolean z) {
        if (this.f24294l == z) {
            return false;
        }
        this.f24294l = z;
        refreshDrawableState();
        return true;
    }

    public boolean q(boolean z) {
        if (this.f24295m == z) {
            return false;
        }
        this.f24295m = z;
        refreshDrawableState();
        if (!this.f24296n || !(getBackground() instanceof g)) {
            return true;
        }
        u((g) getBackground(), z);
        return true;
    }

    public final boolean r() {
        return this.s != null && getTopInset() > 0;
    }

    public boolean s(View view) {
        View viewB = b(view);
        if (viewB != null) {
            view = viewB;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        h.d(this, f2);
    }

    public void setExpanded(boolean z) {
        n(z, x.U(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f24296n = z;
    }

    public void setLiftOnScrollTargetViewId(int i2) {
        this.f24297o = i2;
        a();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
        if (i2 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i2);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.s = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.s.setState(getDrawableState());
                }
                a.i.j.l.a.m(this.s, x.C(this));
                this.s.setVisible(getVisibility() == 0, false);
                this.s.setCallback(this);
            }
            v();
            x.g0(this);
        }
    }

    public void setStatusBarForegroundColor(int i2) {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(int i2) {
        setStatusBarForeground(a.b.l.a.a.d(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            e.b(this, f2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public final boolean t() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || x.z(childAt)) ? false : true;
    }

    public final void u(g gVar, boolean z) {
        float dimension = getResources().getDimension(c.f.a.d.d.f14702a);
        float f2 = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, dimension);
        this.q = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(getResources().getInteger(c.f.a.d.g.f14801a));
        this.q.setInterpolator(c.f.a.d.m.a.f15042a);
        this.q.addUpdateListener(new b(gVar));
        this.q.start();
    }

    public final void v() {
        setWillNotDraw(!r());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.s;
    }
}

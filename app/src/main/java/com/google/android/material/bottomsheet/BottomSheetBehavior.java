package com.google.android.material.bottomsheet;

import a.i.r.f0;
import a.i.r.g0.c;
import a.i.r.g0.f;
import a.i.r.x;
import a.k.b.d;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.f.a.d.d0.k;
import c.f.a.d.j;
import c.f.a.d.k;
import c.f.a.d.l;
import com.amazonaws.services.s3.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f24366a = k.f14998f;
    public int A;
    public a.k.b.d B;
    public boolean C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public WeakReference<V> I;
    public WeakReference<View> J;
    public final ArrayList<f> K;
    public VelocityTracker L;
    public int M;
    public int N;
    public boolean O;
    public Map<View, Integer> P;
    public int Q;
    public final d.c R;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24375j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.f.a.d.j0.g f24376k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24377l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f24378m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.f.a.d.j0.k f24379n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24380o;
    public BottomSheetBehavior<V>.h p;
    public ValueAnimator q;
    public int r;
    public int s;
    public int t;
    public float u;
    public int v;
    public float w;
    public boolean x;
    public boolean y;
    public boolean z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f24381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f24382c;

        public a(View view, int i2) {
            this.f24381b = view;
            this.f24382c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.o0(this.f24381b, this.f24382c);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f24376k != null) {
                BottomSheetBehavior.this.f24376k.Y(fFloatValue);
            }
        }
    }

    public class c implements k.c {
        public c() {
        }

        @Override // c.f.a.d.d0.k.c
        public f0 a(View view, f0 f0Var, k.d dVar) {
            BottomSheetBehavior.this.f24377l = f0Var.e().f1800e;
            BottomSheetBehavior.this.v0(false);
            return f0Var;
        }
    }

    public class d extends d.c {
        public d() {
        }

        @Override // a.k.b.d.c
        public int a(View view, int i2, int i3) {
            return view.getLeft();
        }

        @Override // a.k.b.d.c
        public int b(View view, int i2, int i3) {
            int iV = BottomSheetBehavior.this.V();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return a.i.m.a.b(i2, iV, bottomSheetBehavior.x ? bottomSheetBehavior.H : bottomSheetBehavior.v);
        }

        @Override // a.k.b.d.c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.x ? bottomSheetBehavior.H : bottomSheetBehavior.v;
        }

        @Override // a.k.b.d.c
        public void j(int i2) {
            if (i2 == 1 && BottomSheetBehavior.this.z) {
                BottomSheetBehavior.this.m0(1);
            }
        }

        @Override // a.k.b.d.c
        public void k(View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.T(i3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        
            if (java.lang.Math.abs(r7.getTop() - r6.f24386a.r) < java.lang.Math.abs(r7.getTop() - r6.f24386a.t)) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
        
            r8 = r6.f24386a.r;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
        
            if (java.lang.Math.abs(r8 - r6.f24386a.t) < java.lang.Math.abs(r8 - r6.f24386a.v)) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
        
            if (java.lang.Math.abs(r8 - r6.f24386a.s) < java.lang.Math.abs(r8 - r6.f24386a.v)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ea, code lost:
        
            if (r8 < java.lang.Math.abs(r8 - r9.v)) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
        
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.f24386a.v)) goto L39;
         */
        @Override // a.k.b.d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r7, float r8, float r9) {
            /*
                Method dump skipped, instruction units count: 262
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // a.k.b.d.c
        public boolean m(View view, int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.A;
            if (i3 == 1 || bottomSheetBehavior.O) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.M == i2) {
                WeakReference<View> weakReference = bottomSheetBehavior.J;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.I;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.H + bottomSheetBehavior.V()) / 2;
        }
    }

    public class e implements a.i.r.g0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f24387a;

        public e(int i2) {
            this.f24387a = i2;
        }

        @Override // a.i.r.g0.f
        public boolean a(View view, f.a aVar) {
            BottomSheetBehavior.this.l0(this.f24387a);
            return true;
        }
    }

    public static abstract class f {
        public abstract void a(View view, float f2);

        public abstract void b(View view, int i2);
    }

    public static class g extends a.k.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f24389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f24391f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f24392g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f24393h;

        public static class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24389d = parcel.readInt();
            this.f24390e = parcel.readInt();
            this.f24391f = parcel.readInt() == 1;
            this.f24392g = parcel.readInt() == 1;
            this.f24393h = parcel.readInt() == 1;
        }

        public g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f24389d = bottomSheetBehavior.A;
            this.f24390e = bottomSheetBehavior.f24371f;
            this.f24391f = bottomSheetBehavior.f24368c;
            this.f24392g = bottomSheetBehavior.x;
            this.f24393h = bottomSheetBehavior.y;
        }

        @Override // a.k.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f24389d);
            parcel.writeInt(this.f24390e);
            parcel.writeInt(this.f24391f ? 1 : 0);
            parcel.writeInt(this.f24392g ? 1 : 0);
            parcel.writeInt(this.f24393h ? 1 : 0);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f24394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24396d;

        public h(View view, int i2) {
            this.f24394b = view;
            this.f24396d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.k.b.d dVar = BottomSheetBehavior.this.B;
            if (dVar == null || !dVar.k(true)) {
                BottomSheetBehavior.this.m0(this.f24396d);
            } else {
                x.h0(this.f24394b, this);
            }
            this.f24395c = false;
        }
    }

    public BottomSheetBehavior() {
        this.f24367b = 0;
        this.f24368c = true;
        this.f24369d = false;
        this.p = null;
        this.u = 0.5f;
        this.w = -1.0f;
        this.z = true;
        this.A = 4;
        this.K = new ArrayList<>();
        this.Q = -1;
        this.R = new d();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        super(context, attributeSet);
        this.f24367b = 0;
        this.f24368c = true;
        this.f24369d = false;
        this.p = null;
        this.u = 0.5f;
        this.w = -1.0f;
        this.z = true;
        this.A = 4;
        this.K = new ArrayList<>();
        this.Q = -1;
        this.R = new d();
        this.f24374i = context.getResources().getDimensionPixelSize(c.f.a.d.d.S);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.N);
        this.f24375j = typedArrayObtainStyledAttributes.hasValue(l.Z);
        int i3 = l.P;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i3);
        if (zHasValue) {
            R(context, attributeSet, zHasValue, c.f.a.d.g0.c.a(context, typedArrayObtainStyledAttributes, i3));
        } else {
            Q(context, attributeSet, zHasValue);
        }
        S();
        if (Build.VERSION.SDK_INT >= 21) {
            this.w = typedArrayObtainStyledAttributes.getDimension(l.O, -1.0f);
        }
        int i4 = l.V;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i4);
        if (typedValuePeekValue == null || (i2 = typedValuePeekValue.data) != -1) {
            h0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, -1));
        } else {
            h0(i2);
        }
        g0(typedArrayObtainStyledAttributes.getBoolean(l.U, false));
        e0(typedArrayObtainStyledAttributes.getBoolean(l.Y, false));
        d0(typedArrayObtainStyledAttributes.getBoolean(l.S, true));
        k0(typedArrayObtainStyledAttributes.getBoolean(l.X, false));
        b0(typedArrayObtainStyledAttributes.getBoolean(l.Q, true));
        j0(typedArrayObtainStyledAttributes.getInt(l.W, 0));
        f0(typedArrayObtainStyledAttributes.getFloat(l.T, 0.5f));
        int i5 = l.R;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i5);
        c0((typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(i5, 0) : typedValuePeekValue2.data);
        typedArrayObtainStyledAttributes.recycle();
        this.f24370e = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        this.D = 0;
        this.E = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.v)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.v)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
    
        if (java.lang.Math.abs(r3 - r2.t) < java.lang.Math.abs(r3 - r2.v)) goto L47;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.V()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.m0(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.J
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb1
            boolean r3 = r2.E
            if (r3 != 0) goto L1f
            goto Lb1
        L1f:
            int r3 = r2.D
            r5 = 4
            r6 = 6
            if (r3 <= 0) goto L3c
            boolean r3 = r2.f24368c
            if (r3 == 0) goto L2d
        L29:
            int r3 = r2.s
            goto Lab
        L2d:
            int r3 = r4.getTop()
            int r5 = r2.t
            if (r3 <= r5) goto L38
            r3 = r5
            goto Laa
        L38:
            int r3 = r2.r
            goto Lab
        L3c:
            boolean r3 = r2.x
            if (r3 == 0) goto L4e
            float r3 = r2.W()
            boolean r3 = r2.q0(r4, r3)
            if (r3 == 0) goto L4e
            int r3 = r2.H
            r0 = 5
            goto Lab
        L4e:
            int r3 = r2.D
            if (r3 != 0) goto L8b
            int r3 = r4.getTop()
            boolean r1 = r2.f24368c
            if (r1 == 0) goto L6c
            int r6 = r2.s
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            int r1 = r2.v
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r6 >= r3) goto L8f
            goto L29
        L6c:
            int r1 = r2.t
            if (r3 >= r1) goto L7b
            int r5 = r2.v
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r3 >= r5) goto La8
            goto L38
        L7b:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.v
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L8f
            goto La8
        L8b:
            boolean r3 = r2.f24368c
            if (r3 == 0) goto L93
        L8f:
            int r3 = r2.v
            r0 = 4
            goto Lab
        L93:
            int r3 = r4.getTop()
            int r0 = r2.t
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.v
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L8f
        La8:
            int r3 = r2.t
        Laa:
            r0 = 6
        Lab:
            r5 = 0
            r2.r0(r4, r0, r3, r5)
            r2.E = r5
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.A == 1 && actionMasked == 0) {
            return true;
        }
        a.k.b.d dVar = this.B;
        if (dVar != null) {
            dVar.z(motionEvent);
        }
        if (actionMasked == 0) {
            Z();
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        if (this.B != null && actionMasked == 2 && !this.C && Math.abs(this.N - motionEvent.getY()) > this.B.u()) {
            this.B.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.C;
    }

    public final int L(V v, int i2, int i3) {
        return x.b(v, v.getResources().getString(i2), P(i3));
    }

    public final void M() {
        int iO = O();
        if (this.f24368c) {
            this.v = Math.max(this.H - iO, this.s);
        } else {
            this.v = this.H - iO;
        }
    }

    public final void N() {
        this.t = (int) (this.H * (1.0f - this.u));
    }

    public final int O() {
        int i2;
        return this.f24372g ? Math.min(Math.max(this.f24373h, this.H - ((this.G * 9) / 16)), this.F) : (this.f24378m || (i2 = this.f24377l) <= 0) ? this.f24371f : Math.max(this.f24371f, i2 + this.f24374i);
    }

    public final a.i.r.g0.f P(int i2) {
        return new e(i2);
    }

    public final void Q(Context context, AttributeSet attributeSet, boolean z) {
        R(context, attributeSet, z, null);
    }

    public final void R(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f24375j) {
            this.f24379n = c.f.a.d.j0.k.e(context, attributeSet, c.f.a.d.b.f14627d, f24366a).m();
            c.f.a.d.j0.g gVar = new c.f.a.d.j0.g(this.f24379n);
            this.f24376k = gVar;
            gVar.M(context);
            if (z && colorStateList != null) {
                this.f24376k.X(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f24376k.setTint(typedValue.data);
        }
    }

    public final void S() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.q = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.q.addUpdateListener(new b());
    }

    public void T(int i2) {
        float f2;
        float fV;
        V v = this.I.get();
        if (v == null || this.K.isEmpty()) {
            return;
        }
        int i3 = this.v;
        if (i2 > i3 || i3 == V()) {
            int i4 = this.v;
            f2 = i4 - i2;
            fV = this.H - i4;
        } else {
            int i5 = this.v;
            f2 = i5 - i2;
            fV = i5 - V();
        }
        float f3 = f2 / fV;
        for (int i6 = 0; i6 < this.K.size(); i6++) {
            this.K.get(i6).a(v, f3);
        }
    }

    public View U(View view) {
        if (x.V(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewU = U(viewGroup.getChildAt(i2));
            if (viewU != null) {
                return viewU;
            }
        }
        return null;
    }

    public int V() {
        return this.f24368c ? this.s : this.r;
    }

    public final float W() {
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f24370e);
        return this.L.getYVelocity(this.M);
    }

    public boolean X() {
        return this.f24378m;
    }

    public final void Y(V v, c.a aVar, int i2) {
        x.l0(v, aVar, null, P(i2));
    }

    public final void Z() {
        this.M = -1;
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.L = null;
        }
    }

    public final void a0(g gVar) {
        int i2 = this.f24367b;
        if (i2 == 0) {
            return;
        }
        if (i2 == -1 || (i2 & 1) == 1) {
            this.f24371f = gVar.f24390e;
        }
        if (i2 == -1 || (i2 & 2) == 2) {
            this.f24368c = gVar.f24391f;
        }
        if (i2 == -1 || (i2 & 4) == 4) {
            this.x = gVar.f24392g;
        }
        if (i2 == -1 || (i2 & 8) == 8) {
            this.y = gVar.f24393h;
        }
    }

    public void b0(boolean z) {
        this.z = z;
    }

    public void c0(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.r = i2;
    }

    public void d0(boolean z) {
        if (this.f24368c == z) {
            return;
        }
        this.f24368c = z;
        if (this.I != null) {
            M();
        }
        m0((this.f24368c && this.A == 6) ? 3 : this.A);
        s0();
    }

    public void e0(boolean z) {
        this.f24378m = z;
    }

    public void f0(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.u = f2;
        if (this.I != null) {
            N();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.I = null;
        this.B = null;
    }

    public void g0(boolean z) {
        if (this.x != z) {
            this.x = z;
            if (!z && this.A == 5) {
                l0(4);
            }
            s0();
        }
    }

    public void h0(int i2) {
        i0(i2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto Lc
            boolean r4 = r3.f24372g
            if (r4 != 0) goto L15
            r3.f24372g = r0
            goto L1f
        Lc:
            boolean r2 = r3.f24372g
            if (r2 != 0) goto L17
            int r2 = r3.f24371f
            if (r2 == r4) goto L15
            goto L17
        L15:
            r0 = 0
            goto L1f
        L17:
            r3.f24372g = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f24371f = r4
        L1f:
            if (r0 == 0) goto L24
            r3.v0(r5)
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.i0(int, boolean):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.I = null;
        this.B = null;
    }

    public void j0(int i2) {
        this.f24367b = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        a.k.b.d dVar;
        if (!v.isShown() || !this.z) {
            this.C = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Z();
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.N = (int) motionEvent.getY();
            if (this.A != 2) {
                WeakReference<View> weakReference = this.J;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.C(view, x, this.N)) {
                    this.M = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.O = true;
                }
            }
            this.C = this.M == -1 && !coordinatorLayout.C(v, x, this.N);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.O = false;
            this.M = -1;
            if (this.C) {
                this.C = false;
                return false;
            }
        }
        if (!this.C && (dVar = this.B) != null && dVar.G(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.J;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.C || this.A == 1 || coordinatorLayout.C(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.B == null || Math.abs(((float) this.N) - motionEvent.getY()) <= ((float) this.B.u())) ? false : true;
    }

    public void k0(boolean z) {
        this.y = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        int iV;
        c.f.a.d.j0.g gVar;
        if (x.z(coordinatorLayout) && !x.z(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.I == null) {
            this.f24373h = coordinatorLayout.getResources().getDimensionPixelSize(c.f.a.d.d.f14703b);
            n0(v);
            this.I = new WeakReference<>(v);
            if (this.f24375j && (gVar = this.f24376k) != null) {
                x.s0(v, gVar);
            }
            c.f.a.d.j0.g gVar2 = this.f24376k;
            if (gVar2 != null) {
                float fW = this.w;
                if (fW == -1.0f) {
                    fW = x.w(v);
                }
                gVar2.W(fW);
                boolean z = this.A == 3;
                this.f24380o = z;
                this.f24376k.Y(z ? 0.0f : 1.0f);
            }
            s0();
            if (x.A(v) == 0) {
                x.y0(v, 1);
            }
        }
        if (this.B == null) {
            this.B = a.k.b.d.m(coordinatorLayout, this.R);
        }
        int top = v.getTop();
        coordinatorLayout.J(v, i2);
        this.G = coordinatorLayout.getWidth();
        this.H = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.F = height;
        this.s = Math.max(0, this.H - height);
        N();
        M();
        int i3 = this.A;
        if (i3 == 3) {
            iV = V();
        } else if (i3 == 6) {
            iV = this.t;
        } else if (this.x && i3 == 5) {
            iV = this.H;
        } else {
            if (i3 != 4) {
                if (i3 == 1 || i3 == 2) {
                    x.a0(v, top - v.getTop());
                }
                this.J = new WeakReference<>(U(v));
                return true;
            }
            iV = this.v;
        }
        x.a0(v, iV);
        this.J = new WeakReference<>(U(v));
        return true;
    }

    public void l0(int i2) {
        if (i2 == this.A) {
            return;
        }
        if (this.I != null) {
            p0(i2);
            return;
        }
        if (i2 == 4 || i2 == 3 || i2 == 6 || (this.x && i2 == 5)) {
            this.A = i2;
        }
    }

    public void m0(int i2) {
        V v;
        if (this.A == i2) {
            return;
        }
        this.A = i2;
        WeakReference<V> weakReference = this.I;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            u0(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            u0(false);
        }
        t0(i2);
        for (int i3 = 0; i3 < this.K.size(); i3++) {
            this.K.get(i3).b(v, i2);
        }
        s0();
    }

    public final void n0(View view) {
        if (Build.VERSION.SDK_INT < 29 || X() || this.f24372g) {
            return;
        }
        c.f.a.d.d0.k.a(view, new c());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.J;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.A != 3 || super.o(coordinatorLayout, v, view, f2, f3);
    }

    public void o0(View view, int i2) {
        int iV;
        int i3;
        if (i2 == 4) {
            iV = this.v;
        } else if (i2 == 6) {
            int i4 = this.t;
            if (!this.f24368c || i4 > (i3 = this.s)) {
                iV = i4;
            } else {
                iV = i3;
                i2 = 3;
            }
        } else if (i2 == 3) {
            iV = V();
        } else {
            if (!this.x || i2 != 5) {
                throw new IllegalArgumentException("Illegal state argument: " + i2);
            }
            iV = this.H;
        }
        r0(view, i2, iV, false);
    }

    public final void p0(int i2) {
        V v = this.I.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && x.T(v)) {
            v.post(new a(v, i2));
        } else {
            o0(v, i2);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        if (i4 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.J;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i6 = top - i3;
        if (i3 > 0) {
            if (i6 < V()) {
                iArr[1] = top - V();
                x.a0(v, -iArr[1]);
                i5 = 3;
                m0(i5);
            } else {
                if (!this.z) {
                    return;
                }
                iArr[1] = i3;
                x.a0(v, -i3);
                m0(1);
            }
        } else if (i3 < 0 && !view.canScrollVertically(-1)) {
            int i7 = this.v;
            if (i6 > i7 && !this.x) {
                iArr[1] = top - i7;
                x.a0(v, -iArr[1]);
                i5 = 4;
                m0(i5);
            } else {
                if (!this.z) {
                    return;
                }
                iArr[1] = i3;
                x.a0(v, -i3);
                m0(1);
            }
        }
        T(v.getTop());
        this.D = i3;
        this.E = true;
    }

    public boolean q0(View view, float f2) {
        if (this.y) {
            return true;
        }
        if (view.getTop() < this.v) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.v)) / ((float) O()) > 0.5f;
    }

    public void r0(View view, int i2, int i3, boolean z) {
        a.k.b.d dVar = this.B;
        if (!(dVar != null && (!z ? !dVar.H(view, view.getLeft(), i3) : !dVar.F(view.getLeft(), i3)))) {
            m0(i2);
            return;
        }
        m0(2);
        t0(i2);
        if (this.p == null) {
            this.p = new h(view, i2);
        }
        if (this.p.f24395c) {
            this.p.f24396d = i2;
            return;
        }
        BottomSheetBehavior<V>.h hVar = this.p;
        hVar.f24396d = i2;
        x.h0(view, hVar);
        this.p.f24395c = true;
    }

    public final void s0() {
        V v;
        int i2;
        c.a aVar;
        WeakReference<V> weakReference = this.I;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        x.j0(v, 524288);
        x.j0(v, 262144);
        x.j0(v, Constants.MB);
        int i3 = this.Q;
        if (i3 != -1) {
            x.j0(v, i3);
        }
        if (this.A != 6) {
            this.Q = L(v, j.f14870a, 6);
        }
        if (this.x && this.A != 5) {
            Y(v, c.a.u, 5);
        }
        int i4 = this.A;
        if (i4 == 3) {
            i2 = this.f24368c ? 4 : 6;
            aVar = c.a.t;
        } else {
            if (i4 != 4) {
                if (i4 != 6) {
                    return;
                }
                Y(v, c.a.t, 4);
                Y(v, c.a.s, 3);
                return;
            }
            i2 = this.f24368c ? 3 : 6;
            aVar = c.a.s;
        }
        Y(v, aVar, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    public final void t0(int i2) {
        ValueAnimator valueAnimator;
        if (i2 == 2) {
            return;
        }
        boolean z = i2 == 3;
        if (this.f24380o != z) {
            this.f24380o = z;
            if (this.f24376k == null || (valueAnimator = this.q) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.q.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.q.setFloatValues(1.0f - f2, f2);
            this.q.start();
        }
    }

    public final void u0(boolean z) {
        Map<View, Integer> map;
        int iIntValue;
        WeakReference<V> weakReference = this.I;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.P != null) {
                    return;
                } else {
                    this.P = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.I.get()) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.P.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.f24369d) {
                            iIntValue = 4;
                            x.y0(childAt, iIntValue);
                        }
                    } else if (this.f24369d && (map = this.P) != null && map.containsKey(childAt)) {
                        iIntValue = this.P.get(childAt).intValue();
                        x.y0(childAt, iIntValue);
                    }
                }
            }
            if (!z) {
                this.P = null;
            } else if (this.f24369d) {
                this.I.get().sendAccessibilityEvent(8);
            }
        }
    }

    public final void v0(boolean z) {
        V v;
        if (this.I != null) {
            M();
            if (this.A != 4 || (v = this.I.get()) == null) {
                return;
            }
            if (z) {
                p0(this.A);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, v, gVar.b());
        a0(gVar);
        int i2 = gVar.f24389d;
        if (i2 == 1 || i2 == 2) {
            i2 = 4;
        }
        this.A = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
        return new g(super.y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }
}

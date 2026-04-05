package androidx.coordinatorlayout.widget;

import a.i.r.f0;
import a.i.r.n;
import a.i.r.o;
import a.i.r.q;
import a.i.r.r;
import a.i.r.x;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements n, o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f4316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class<?>[] f4317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<c>>> f4318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator<View> f4319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a.i.q.f<Rect> f4320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<View> f4321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a.h.d.a<View> f4322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<View> f4323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<View> f4324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Paint f4325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f4326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int[] f4327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4329o;
    public int[] p;
    public View q;
    public View r;
    public g s;
    public boolean t;
    public f0 u;
    public boolean v;
    public Drawable w;
    public ViewGroup.OnHierarchyChangeListener x;
    public r y;
    public final q z;

    public class a implements r {
        public a() {
        }

        @Override // a.i.r.r
        public f0 a(View view, f0 f0Var) {
            return CoordinatorLayout.this.X(f0Var);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                return z(coordinatorLayout, v, view, view2, i2);
            }
            return false;
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void C(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
            if (i2 == 0) {
                B(coordinatorLayout, v, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v) {
            return d(coordinatorLayout, v) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v) {
            return DefaultRenderer.BACKGROUND_COLOR;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public f0 f(CoordinatorLayout coordinatorLayout, V v, f0 f0Var) {
            return f0Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4, int i5) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3, boolean z) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
            if (i4 == 0) {
                p(coordinatorLayout, v, view, i2, i3, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5) {
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6) {
            if (i6 == 0) {
                r(coordinatorLayout, v, view, i2, i3, i4, i5);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
            s(coordinatorLayout, v, view, i2, i3, i4, i5, i6);
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
        }

        public void v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                u(coordinatorLayout, v, view, view2, i2);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.x;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.I(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.x;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f4332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4337f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4338g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4339h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4340i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f4341j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public View f4342k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public View f4343l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f4344m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f4345n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f4346o;
        public boolean p;
        public final Rect q;
        public Object r;

        public f(int i2, int i3) {
            super(i2, i3);
            this.f4333b = false;
            this.f4334c = 0;
            this.f4335d = 0;
            this.f4336e = -1;
            this.f4337f = -1;
            this.f4338g = 0;
            this.f4339h = 0;
            this.q = new Rect();
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4333b = false;
            this.f4334c = 0;
            this.f4335d = 0;
            this.f4336e = -1;
            this.f4337f = -1;
            this.f4338g = 0;
            this.f4339h = 0;
            this.q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.h.c.f1605e);
            this.f4334c = typedArrayObtainStyledAttributes.getInteger(a.h.c.f1606f, 0);
            this.f4337f = typedArrayObtainStyledAttributes.getResourceId(a.h.c.f1607g, -1);
            this.f4335d = typedArrayObtainStyledAttributes.getInteger(a.h.c.f1608h, 0);
            this.f4336e = typedArrayObtainStyledAttributes.getInteger(a.h.c.f1612l, -1);
            this.f4338g = typedArrayObtainStyledAttributes.getInt(a.h.c.f1611k, 0);
            this.f4339h = typedArrayObtainStyledAttributes.getInt(a.h.c.f1610j, 0);
            int i2 = a.h.c.f1609i;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
            this.f4333b = zHasValue;
            if (zHasValue) {
                this.f4332a = CoordinatorLayout.L(context, attributeSet, typedArrayObtainStyledAttributes.getString(i2));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f4332a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4333b = false;
            this.f4334c = 0;
            this.f4335d = 0;
            this.f4336e = -1;
            this.f4337f = -1;
            this.f4338g = 0;
            this.f4339h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4333b = false;
            this.f4334c = 0;
            this.f4335d = 0;
            this.f4336e = -1;
            this.f4337f = -1;
            this.f4338g = 0;
            this.f4339h = 0;
            this.q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f4333b = false;
            this.f4334c = 0;
            this.f4335d = 0;
            this.f4336e = -1;
            this.f4337f = -1;
            this.f4338g = 0;
            this.f4339h = 0;
            this.q = new Rect();
        }

        public boolean a() {
            return this.f4342k == null && this.f4337f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f4343l || s(view2, x.C(coordinatorLayout)) || ((cVar = this.f4332a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        public boolean c() {
            if (this.f4332a == null) {
                this.f4344m = false;
            }
            return this.f4344m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f4337f == -1) {
                this.f4343l = null;
                this.f4342k = null;
                return null;
            }
            if (this.f4342k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f4342k;
        }

        public int e() {
            return this.f4337f;
        }

        public c f() {
            return this.f4332a;
        }

        public boolean g() {
            return this.p;
        }

        public Rect h() {
            return this.q;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f4344m;
            if (z) {
                return true;
            }
            c cVar = this.f4332a;
            boolean zA = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z;
            this.f4344m = zA;
            return zA;
        }

        public boolean j(int i2) {
            if (i2 == 0) {
                return this.f4345n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.f4346o;
        }

        public void k() {
            this.p = false;
        }

        public void l(int i2) {
            r(i2, false);
        }

        public void m() {
            this.f4344m = false;
        }

        public final void n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f4337f);
            this.f4342k = viewFindViewById;
            if (viewFindViewById != null) {
                if (viewFindViewById != coordinatorLayout) {
                    for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                viewFindViewById = parent;
                            }
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f4343l = viewFindViewById;
                    return;
                }
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f4337f) + " to anchor view " + view);
            }
            this.f4343l = null;
            this.f4342k = null;
        }

        public void o(c cVar) {
            c cVar2 = this.f4332a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f4332a = cVar;
                this.r = null;
                this.f4333b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        public void p(boolean z) {
            this.p = z;
        }

        public void q(Rect rect) {
            this.q.set(rect);
        }

        public void r(int i2, boolean z) {
            if (i2 == 0) {
                this.f4345n = z;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f4346o = z;
            }
        }

        public final boolean s(View view, int i2) {
            int iB = a.i.r.f.b(((f) view.getLayoutParams()).f4338g, i2);
            return iB != 0 && (a.i.r.f.b(this.f4339h, i2) & iB) == iB;
        }

        public final boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f4342k.getId() != this.f4337f) {
                return false;
            }
            View view2 = this.f4342k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f4343l = null;
                    this.f4342k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f4343l = view2;
            return true;
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.I(0);
            return true;
        }
    }

    public static class h extends a.k.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SparseArray<Parcelable> f4348d;

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
            int i2 = parcel.readInt();
            int[] iArr = new int[i2];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f4348d = new SparseArray<>(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                this.f4348d.append(iArr[i3], parcelableArray[i3]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.k.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            SparseArray<Parcelable> sparseArray = this.f4348d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = this.f4348d.keyAt(i3);
                parcelableArr[i3] = this.f4348d.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }
    }

    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fO = x.O(view);
            float fO2 = x.O(view2);
            if (fO > fO2) {
                return -1;
            }
            return fO < fO2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f4316b = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f4319e = new i();
        } else {
            f4319e = null;
        }
        f4317c = new Class[]{Context.class, AttributeSet.class};
        f4318d = new ThreadLocal<>();
        f4320f = new a.i.q.h(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.h.a.f1599a);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4321g = new ArrayList();
        this.f4322h = new a.h.d.a<>();
        this.f4323i = new ArrayList();
        this.f4324j = new ArrayList();
        this.f4326l = new int[2];
        this.f4327m = new int[2];
        this.z = new q(this);
        int[] iArr = a.h.c.f1602b;
        TypedArray typedArrayObtainStyledAttributes = i2 == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, a.h.b.f1600a) : context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = a.h.c.f1602b;
            if (i2 == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes, 0, a.h.b.f1600a);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(a.h.c.f1603c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.p = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.p.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.p[i3] = (int) (r12[i3] * f2);
            }
        }
        this.w = typedArrayObtainStyledAttributes.getDrawable(a.h.c.f1604d);
        typedArrayObtainStyledAttributes.recycle();
        Y();
        super.setOnHierarchyChangeListener(new e());
        if (x.A(this) == 0) {
            x.y0(this, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c L(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(InstructionFileId.DOT)) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f4316b;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f4318d;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f4317c);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    public static void P(Rect rect) {
        rect.setEmpty();
        f4320f.a(rect);
    }

    public static int S(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    public static int T(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    public static int U(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    public static Rect a() {
        Rect rectB = f4320f.b();
        return rectB == null ? new Rect() : rectB;
    }

    public static int c(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public final void A(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = f4319e;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final boolean B(View view) {
        return this.f4322h.j(view);
    }

    public boolean C(View view, int i2, int i3) {
        Rect rectA = a();
        u(view, rectA);
        try {
            return rectA.contains(i2, i3);
        } finally {
            P(rectA);
        }
    }

    public final void D(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.u != null && x.z(this) && !x.z(view)) {
            rectA.left += this.u.g();
            rectA.top += this.u.i();
            rectA.right -= this.u.h();
            rectA.bottom -= this.u.f();
        }
        Rect rectA2 = a();
        a.i.r.f.a(T(fVar.f4334c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i2);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        P(rectA);
        P(rectA2);
    }

    public final void E(View view, View view2, int i2) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            u(view2, rectA);
            v(view, i2, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            P(rectA);
            P(rectA2);
        }
    }

    public final void F(View view, int i2, int i3) {
        f fVar = (f) view.getLayoutParams();
        int iB = a.i.r.f.b(U(fVar.f4334c), i3);
        int i4 = iB & 7;
        int i5 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int iX = x(i2) - measuredWidth;
        int i6 = 0;
        if (i4 == 1) {
            iX += measuredWidth / 2;
        } else if (i4 == 5) {
            iX += measuredWidth;
        }
        if (i5 == 16) {
            i6 = 0 + (measuredHeight / 2);
        } else if (i5 == 80) {
            i6 = measuredHeight + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iX, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    public final void G(View view, Rect rect, int i2) {
        boolean z;
        boolean z2;
        int width;
        int i3;
        int i4;
        int i5;
        int height;
        int i6;
        int i7;
        int i8;
        if (x.U(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF == null || !cVarF.b(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            P(rectA2);
            if (rectA.isEmpty()) {
                P(rectA);
                return;
            }
            int iB = a.i.r.f.b(fVar.f4339h, i2);
            boolean z3 = true;
            if ((iB & 48) != 48 || (i7 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f4341j) >= (i8 = rect.top)) {
                z = false;
            } else {
                W(view, i8 - i7);
                z = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f4341j) < (i6 = rect.bottom)) {
                W(view, height - i6);
                z = true;
            }
            if (!z) {
                W(view, 0);
            }
            if ((iB & 3) != 3 || (i4 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f4340i) >= (i5 = rect.left)) {
                z2 = false;
            } else {
                V(view, i5 - i4);
                z2 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f4340i) >= (i3 = rect.right)) {
                z3 = z2;
            } else {
                V(view, width - i3);
            }
            if (!z3) {
                V(view, 0);
            }
            P(rectA);
        }
    }

    public void H(View view, int i2) {
        c cVarF;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f4342k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            u(fVar.f4342k, rectA);
            r(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            w(view, i2, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(fVar, rectA3, measuredWidth, measuredHeight);
            int i3 = rectA3.left - rectA2.left;
            int i4 = rectA3.top - rectA2.top;
            if (i3 != 0) {
                x.Z(view, i3);
            }
            if (i4 != 0) {
                x.a0(view, i4);
            }
            if (z && (cVarF = fVar.f()) != null) {
                cVarF.h(this, view, fVar.f4342k);
            }
            P(rectA);
            P(rectA2);
            P(rectA3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(int r18) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.I(int):void");
    }

    public void J(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f4342k;
        if (view2 != null) {
            E(view, view2, i2);
            return;
        }
        int i3 = fVar.f4336e;
        if (i3 >= 0) {
            F(view, i3, i2);
        } else {
            D(view, i2);
        }
    }

    public void K(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public final boolean M(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f4323i;
        A(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            if (!(zK || z) || actionMasked == 0) {
                if (!zK && cVarF != null) {
                    if (i2 == 0) {
                        zK = cVarF.k(this, view, motionEvent);
                    } else if (i2 == 1) {
                        zK = cVarF.D(this, view, motionEvent);
                    }
                    if (zK) {
                        this.q = view;
                    }
                }
                boolean zC = fVar.c();
                boolean zI = fVar.i(this, view);
                z = zI && !zC;
                if (zI && !z) {
                    break;
                }
            } else if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    cVarF.k(this, view, motionEventObtain);
                } else if (i2 == 1) {
                    cVarF.D(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zK;
    }

    public final void N() {
        this.f4321g.clear();
        this.f4322h.c();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f fVarZ = z(childAt);
            fVarZ.d(this, childAt);
            this.f4322h.b(childAt);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (fVarZ.b(this, childAt, childAt2)) {
                        if (!this.f4322h.d(childAt2)) {
                            this.f4322h.b(childAt2);
                        }
                        this.f4322h.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f4321g.addAll(this.f4322h.i());
        Collections.reverse(this.f4321g);
    }

    public void O(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    public void Q() {
        if (this.f4329o && this.s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.s);
        }
        this.t = false;
    }

    public final void R(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    cVarF.k(this, childAt, motionEventObtain);
                } else {
                    cVarF.D(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).m();
        }
        this.q = null;
        this.f4328n = false;
    }

    public final void V(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f4340i;
        if (i3 != i2) {
            x.Z(view, i2 - i3);
            fVar.f4340i = i2;
        }
    }

    public final void W(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f4341j;
        if (i3 != i2) {
            x.a0(view, i2 - i3);
            fVar.f4341j = i2;
        }
    }

    public final f0 X(f0 f0Var) {
        if (a.i.q.d.a(this.u, f0Var)) {
            return f0Var;
        }
        this.u = f0Var;
        boolean z = f0Var != null && f0Var.i() > 0;
        this.v = z;
        setWillNotDraw(!z && getBackground() == null);
        f0 f0VarE = e(f0Var);
        requestLayout();
        return f0VarE;
    }

    public final void Y() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (!x.z(this)) {
            x.A0(this, null);
            return;
        }
        if (this.y == null) {
            this.y = new a();
        }
        x.A0(this, this.y);
        setSystemUiVisibility(1280);
    }

    public void b() {
        if (this.f4329o) {
            if (this.s == null) {
                this.s = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        this.t = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f4332a;
        if (cVar != null) {
            float fD = cVar.d(this, view);
            if (fD > 0.0f) {
                if (this.f4325k == null) {
                    this.f4325k = new Paint();
                }
                this.f4325k.setColor(fVar.f4332a.c(this, view));
                this.f4325k.setAlpha(c(Math.round(fD * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f4325k);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.w;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final f0 e(f0 f0Var) {
        c cVarF;
        if (f0Var.l()) {
            return f0Var;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (x.z(childAt) && (cVarF = ((f) childAt.getLayoutParams()).f()) != null) {
                f0Var = cVarF.f(this, childAt, f0Var);
                if (f0Var.l()) {
                    break;
                }
            }
        }
        return f0Var;
    }

    public void f(View view) {
        List listG = this.f4322h.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < listG.size(); i2++) {
            View view2 = (View) listG.get(i2);
            c cVarF = ((f) view2.getLayoutParams()).f();
            if (cVarF != null) {
                cVarF.h(this, view2, view);
            }
        }
    }

    public boolean g(View view, View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectA = a();
        r(view, view.getParent() != this, rectA);
        Rect rectA2 = a();
        r(view2, view2.getParent() != this, rectA2);
        try {
            if (rectA.left <= rectA2.right && rectA.top <= rectA2.bottom && rectA.right >= rectA2.left) {
                if (rectA.bottom >= rectA2.top) {
                    z = true;
                }
            }
            return z;
        } finally {
            P(rectA);
            P(rectA2);
        }
    }

    public final List<View> getDependencySortedChildren() {
        N();
        return Collections.unmodifiableList(this.f4321g);
    }

    public final f0 getLastWindowInsets() {
        return this.u;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.z.a();
    }

    public Drawable getStatusBarBackground() {
        return this.w;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void h() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (B(getChildAt(i2))) {
                z = true;
                break;
            }
            i2++;
        }
        if (z != this.t) {
            if (z) {
                b();
            } else {
                Q();
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // a.i.r.o
    public void j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c cVarF;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i6) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f4326l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.t(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.f4326l;
                    iMax = i4 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, this.f4326l[1]) : Math.min(iMax2, this.f4326l[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            I(1);
        }
    }

    @Override // a.i.r.n
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        j(view, i2, i3, i4, i5, 0, this.f4327m);
    }

    @Override // a.i.r.n
    public boolean l(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarF = fVar.f();
                if (cVarF != null) {
                    boolean zA = cVarF.A(this, childAt, view, view2, i2, i3);
                    z |= zA;
                    fVar.r(i3, zA);
                } else {
                    fVar.r(i3, false);
                }
            }
        }
        return z;
    }

    @Override // a.i.r.n
    public void m(View view, View view2, int i2, int i3) {
        c cVarF;
        this.z.c(view, view2, i2, i3);
        this.r = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i3) && (cVarF = fVar.f()) != null) {
                cVarF.v(this, childAt, view, view2, i2, i3);
            }
        }
    }

    @Override // a.i.r.n
    public void n(View view, int i2) {
        this.z.d(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i2)) {
                c cVarF = fVar.f();
                if (cVarF != null) {
                    cVarF.C(this, childAt, view, i2);
                }
                fVar.l(i2);
                fVar.k();
            }
        }
        this.r = null;
    }

    @Override // a.i.r.n
    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        c cVarF;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i4) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f4326l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.q(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f4326l;
                    iMax = i2 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f4326l;
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            I(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        R(false);
        if (this.t) {
            if (this.s == null) {
                this.s = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        if (this.u == null && x.z(this)) {
            x.m0(this);
        }
        this.f4329o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        R(false);
        if (this.t && this.s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.s);
        }
        View view = this.r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f4329o = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.v || this.w == null) {
            return;
        }
        f0 f0Var = this.u;
        int i2 = f0Var != null ? f0Var.i() : 0;
        if (i2 > 0) {
            this.w.setBounds(0, 0, getWidth(), i2);
            this.w.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            R(true);
        }
        boolean zM = M(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            R(true);
        }
        return zM;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        c cVarF;
        int iC = x.C(this);
        int size = this.f4321g.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f4321g.get(i6);
            if (view.getVisibility() != 8 && ((cVarF = ((f) view.getLayoutParams()).f()) == null || !cVarF.l(this, view, iC))) {
                J(view, iC);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.i.r.p
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        c cVarF;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    zN |= cVarF.n(this, childAt, view, f2, f3, z);
                }
            }
        }
        if (zN) {
            I(1);
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.i.r.p
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c cVarF;
        int childCount = getChildCount();
        boolean zO = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    zO |= cVarF.o(this, childAt, view, f2, f3);
                }
            }
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.i.r.p
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        o(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.i.r.p
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        k(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.i.r.p
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        m(view, view2, i2, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.b());
        SparseArray<Parcelable> sparseArray = hVar.f4348d;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVarF = z(childAt).f();
            if (id != -1 && cVarF != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVarF.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (id != -1 && cVarF != null && (parcelableY = cVarF.y(this, childAt)) != null) {
                sparseArray.append(id, parcelableY);
            }
        }
        hVar.f4348d = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.i.r.p
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return l(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.i.r.p
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r3
  0x002b: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.q
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.M(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.q
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.q
            boolean r6 = r6.D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.view.View r7 = r0.q
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.R(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public void r(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            u(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c cVarF = ((f) view.getLayoutParams()).f();
        if (cVarF == null || !cVarF.w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f4328n) {
            return;
        }
        R(false);
        this.f4328n = true;
    }

    public List<View> s(View view) {
        List<View> listH = this.f4322h.h(view);
        this.f4324j.clear();
        if (listH != null) {
            this.f4324j.addAll(listH);
        }
        return this.f4324j;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        Y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.x = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.w = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.w.setState(getDrawableState());
                }
                a.i.j.l.a.m(this.w, x.C(this));
                this.w.setVisible(getVisibility() == 0, false);
                this.w.setCallback(this);
            }
            x.g0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? a.i.i.b.f(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.w;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.w.setVisible(z, false);
    }

    public List<View> t(View view) {
        List listG = this.f4322h.g(view);
        this.f4324j.clear();
        if (listG != null) {
            this.f4324j.addAll(listG);
        }
        return this.f4324j;
    }

    public void u(View view, Rect rect) {
        a.h.d.b.a(this, view, rect);
    }

    public void v(View view, int i2, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        w(view, i2, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.w;
    }

    public final void w(View view, int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int iB = a.i.r.f.b(S(fVar.f4334c), i2);
        int iB2 = a.i.r.f.b(T(fVar.f4335d), i2);
        int i5 = iB & 7;
        int i6 = iB & 112;
        int i7 = iB2 & 7;
        int i8 = iB2 & 112;
        int iWidth = i7 != 1 ? i7 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i8 != 16 ? i8 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i5 == 1) {
            iWidth -= i3 / 2;
        } else if (i5 != 5) {
            iWidth -= i3;
        }
        if (i6 == 16) {
            iHeight -= i4 / 2;
        } else if (i6 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    public final int x(int i2) {
        StringBuilder sb;
        int[] iArr = this.p;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i2);
        } else {
            if (i2 >= 0 && i2 < iArr.length) {
                return iArr[i2];
            }
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i2);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public void y(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f z(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f4333b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
            } else {
                d dVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    dVar = (d) superclass.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                    }
                }
            }
            fVar.f4333b = true;
        }
        return fVar;
    }
}

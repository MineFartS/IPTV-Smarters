package androidx.viewpager.widget;

import a.i.r.f0;
import a.i.r.r;
import a.i.r.x;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.amazonaws.event.ProgressEvent;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4968b = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator<f> f4969c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Interpolator f4970d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f4971e = new n();
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public float I;
    public float J;
    public float K;
    public float L;
    public int M;
    public VelocityTracker N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public EdgeEffect T;
    public EdgeEffect U;
    public boolean V;
    public boolean W;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4972f;
    public boolean f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<f> f4973g;
    public int g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f4974h;
    public List<j> h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f4975i;
    public j i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a.e0.a.a f4976j;
    public j j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4977k;
    public List<i> k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4978l;
    public k l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Parcelable f4979m;
    public int m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ClassLoader f4980n;
    public int n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Scroller f4981o;
    public ArrayList<View> o0;
    public boolean p;
    public final Runnable p0;
    public l q;
    public int q0;
    public int r;
    public Drawable s;
    public int t;
    public int u;
    public float v;
    public float w;
    public int x;
    public int y;
    public boolean z;

    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f4986b - fVar2.f4986b;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.E();
        }
    }

    public class d implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f4983a = new Rect();

        public d() {
        }

        @Override // a.i.r.r
        public f0 a(View view, f0 f0Var) {
            f0 f0VarB0 = x.b0(view, f0Var);
            if (f0VarB0.l()) {
                return f0VarB0;
            }
            Rect rect = this.f4983a;
            rect.left = f0VarB0.g();
            rect.top = f0VarB0.i();
            rect.right = f0VarB0.h();
            rect.bottom = f0VarB0.f();
            int childCount = ViewPager.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                f0 f0VarH = x.h(ViewPager.this.getChildAt(i2), f0VarB0);
                rect.left = Math.min(f0VarH.g(), rect.left);
                rect.top = Math.min(f0VarH.i(), rect.top);
                rect.right = Math.min(f0VarH.h(), rect.right);
                rect.bottom = Math.min(f0VarH.f(), rect.bottom);
            }
            return f0VarB0.m(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f4985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f4988d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f4989e;
    }

    public static class g extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f4992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f4993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4995f;

        public g() {
            super(-1, -1);
            this.f4992c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4992c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f4968b);
            this.f4991b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class h extends a.i.r.a {
        public h() {
        }

        @Override // a.i.r.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            a.e0.a.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f4976j) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.c());
            accessibilityEvent.setFromIndex(ViewPager.this.f4977k);
            accessibilityEvent.setToIndex(ViewPager.this.f4977k);
        }

        @Override // a.i.r.a
        public void g(View view, a.i.r.g0.c cVar) {
            super.g(view, cVar);
            cVar.X(ViewPager.class.getName());
            cVar.p0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.a(ProgressEvent.PART_FAILED_EVENT_CODE);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.a(8192);
            }
        }

        @Override // a.i.r.a
        public boolean j(View view, int i2, Bundle bundle) {
            ViewPager viewPager;
            int i3;
            if (super.j(view, i2, bundle)) {
                return true;
            }
            if (i2 != 4096) {
                if (i2 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i3 = viewPager.f4977k - 1;
            } else {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i3 = viewPager.f4977k + 1;
            }
            viewPager.setCurrentItem(i3);
            return true;
        }

        public final boolean n() {
            a.e0.a.a aVar = ViewPager.this.f4976j;
            return aVar != null && aVar.c() > 1;
        }
    }

    public interface i {
        void a(ViewPager viewPager, a.e0.a.a aVar, a.e0.a.a aVar2);
    }

    public interface j {
        void a(int i2, float f2, int i3);

        void b(int i2);

        void c(int i2);
    }

    public interface k {
        void a(View view, float f2);
    }

    public class l extends DataSetObserver {
        public l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.h();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.h();
        }
    }

    public static class m extends a.k.a.a {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Parcelable f4999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ClassLoader f5000f;

        public static class a implements Parcelable.ClassLoaderCreator<m> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i2) {
                return new m[i2];
            }
        }

        public m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? m.class.getClassLoader() : classLoader;
            this.f4998d = parcel.readInt();
            this.f4999e = parcel.readParcelable(classLoader);
            this.f5000f = classLoader;
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f4998d + "}";
        }

        @Override // a.k.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f4998d);
            parcel.writeParcelable(this.f4999e, i2);
        }
    }

    public static class n implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.f4990a;
            return z != gVar2.f4990a ? z ? 1 : -1 : gVar.f4994e - gVar2.f4994e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4973g = new ArrayList<>();
        this.f4974h = new f();
        this.f4975i = new Rect();
        this.f4978l = -1;
        this.f4979m = null;
        this.f4980n = null;
        this.v = -3.4028235E38f;
        this.w = Float.MAX_VALUE;
        this.C = 1;
        this.M = -1;
        this.V = true;
        this.W = false;
        this.p0 = new c();
        this.q0 = 0;
        v();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A != z) {
            this.A = z;
        }
    }

    public static boolean w(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    public boolean A() {
        int i2 = this.f4977k;
        if (i2 <= 0) {
            return false;
        }
        N(i2 - 1, true);
        return true;
    }

    public boolean B() {
        a.e0.a.a aVar = this.f4976j;
        if (aVar == null || this.f4977k >= aVar.c() - 1) {
            return false;
        }
        N(this.f4977k + 1, true);
        return true;
    }

    public final boolean C(int i2) {
        if (this.f4973g.size() == 0) {
            if (this.V) {
                return false;
            }
            this.f0 = false;
            y(0, 0.0f, 0);
            if (this.f0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarT = t();
        int clientWidth = getClientWidth();
        int i3 = this.r;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = fVarT.f4986b;
        float f3 = ((i2 / f2) - fVarT.f4989e) / (fVarT.f4988d + (i3 / f2));
        this.f0 = false;
        y(i5, f3, (int) (i4 * f3));
        if (this.f0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean D(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.I - f2;
        this.I = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.v * clientWidth;
        float f5 = this.w * clientWidth;
        boolean z3 = false;
        f fVar = this.f4973g.get(0);
        ArrayList<f> arrayList = this.f4973g;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f4986b != 0) {
            f4 = fVar.f4989e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f4986b != this.f4976j.c() - 1) {
            f5 = fVar2.f4989e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.T.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.U.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.I += scrollX - i2;
        scrollTo(i2, getScrollY());
        C(i2);
        return z3;
    }

    public void E() {
        F(this.f4977k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de A[PHI: r7 r10 r15
  0x00de: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v10 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v13 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7 A[PHI: r7 r10 r15
  0x00e7: PHI (r7v9 int) = (r7v5 int), (r7v4 int), (r7v10 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00e7: PHI (r10v12 int) = (r10v1 int), (r10v8 int), (r10v13 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00e7: PHI (r15v10 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(int r18) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.F(int):void");
    }

    public final void G(int i2, int i3, int i4, int i5) {
        int iMin;
        if (i3 <= 0 || this.f4973g.isEmpty()) {
            f fVarU = u(this.f4977k);
            iMin = (int) ((fVarU != null ? Math.min(fVarU.f4989e, this.w) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
            if (iMin == getScrollX()) {
                return;
            } else {
                g(false);
            }
        } else if (!this.f4981o.isFinished()) {
            this.f4981o.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            iMin = (int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4));
        }
        scrollTo(iMin, getScrollY());
    }

    public final void H() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).f4990a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    public void I(i iVar) {
        List<i> list = this.k0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void J(j jVar) {
        List<j> list = this.h0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public final void K(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final boolean L() {
        this.M = -1;
        o();
        this.T.onRelease();
        this.U.onRelease();
        return this.T.isFinished() || this.U.isFinished();
    }

    public final void M(int i2, boolean z, int i3, boolean z2) {
        f fVarU = u(i2);
        int clientWidth = fVarU != null ? (int) (getClientWidth() * Math.max(this.v, Math.min(fVarU.f4989e, this.w))) : 0;
        if (z) {
            Q(clientWidth, 0, i3);
            if (z2) {
                k(i2);
                return;
            }
            return;
        }
        if (z2) {
            k(i2);
        }
        g(false);
        scrollTo(clientWidth, 0);
        C(clientWidth);
    }

    public void N(int i2, boolean z) {
        this.B = false;
        O(i2, z, false);
    }

    public void O(int i2, boolean z, boolean z2) {
        P(i2, z, z2, 0);
    }

    public void P(int i2, boolean z, boolean z2, int i3) {
        a.e0.a.a aVar = this.f4976j;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f4977k == i2 && this.f4973g.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.f4976j.c()) {
            i2 = this.f4976j.c() - 1;
        }
        int i4 = this.C;
        int i5 = this.f4977k;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.f4973g.size(); i6++) {
                this.f4973g.get(i6).f4987c = true;
            }
        }
        boolean z3 = this.f4977k != i2;
        if (!this.V) {
            F(i2);
            M(i2, z, i3, z3);
        } else {
            this.f4977k = i2;
            if (z3) {
                k(i2);
            }
            requestLayout();
        }
    }

    public void Q(int i2, int i3, int i4) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f4981o;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.p ? this.f4981o.getCurrX() : this.f4981o.getStartX();
            this.f4981o.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            g(false);
            E();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float fM = f3 + (m(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3);
        int iAbs = Math.abs(i4);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fM / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / ((f2 * this.f4976j.f(this.f4977k)) + this.r)) + 1.0f) * 100.0f), IjkMediaCodecInfo.RANK_LAST_CHANCE);
        this.p = false;
        this.f4981o.startScroll(i5, scrollY, i6, i7, iMin);
        x.g0(this);
    }

    public final void R() {
        if (this.n0 != 0) {
            ArrayList<View> arrayList = this.o0;
            if (arrayList == null) {
                this.o0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.o0.add(getChildAt(i2));
            }
            Collections.sort(this.o0, f4971e);
        }
    }

    public f a(int i2, int i3) {
        f fVar = new f();
        fVar.f4986b = i2;
        fVar.f4985a = this.f4976j.g(this, i2);
        fVar.f4988d = this.f4976j.f(i2);
        if (i3 < 0 || i3 >= this.f4973g.size()) {
            this.f4973g.add(fVar);
        } else {
            this.f4973g.add(i3, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f fVarS;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f4986b == this.f4977k) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarS;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f4986b == this.f4977k) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zW = gVar.f4990a | w(view);
        gVar.f4990a = zW;
        if (!this.z) {
            super.addView(view, i2, layoutParams);
        } else {
            if (zW) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f4993d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    public void b(i iVar) {
        if (this.k0 == null) {
            this.k0 = new ArrayList();
        }
        this.k0.add(iVar);
    }

    public void c(j jVar) {
        if (this.h0 == null) {
            this.h0 = new ArrayList();
        }
        this.h0.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.f4976j == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.v)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.w));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.p = true;
        if (this.f4981o.isFinished() || !this.f4981o.computeScrollOffset()) {
            g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f4981o.getCurrX();
        int currY = this.f4981o.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!C(currX)) {
                this.f4981o.abortAnimation();
                scrollTo(0, currY);
            }
        }
        x.g0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(int r7) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || p(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarS;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f4986b == this.f4977k && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        a.e0.a.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f4976j) != null && aVar.c() > 1)) {
            if (!this.T.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.v * width);
                this.T.setSize(height, width);
                zDraw = false | this.T.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.U.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.w + 1.0f)) * width2);
                this.U.setSize(height2, width2);
                zDraw |= this.U.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.T.finish();
            this.U.finish();
        }
        if (zDraw) {
            x.g0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.s;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int iC = this.f4976j.c();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.r / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.f4986b;
            int i6 = fVar.f4986b;
            if (i5 < i6) {
                float f3 = fVar2.f4989e + fVar2.f4988d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= fVar.f4986b && i8 < this.f4973g.size()) {
                    while (true) {
                        fVar4 = this.f4973g.get(i8);
                        if (i7 <= fVar4.f4986b || i8 >= this.f4973g.size() - 1) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    while (i7 < fVar4.f4986b) {
                        f3 += this.f4976j.f(i7) + f2;
                        i7++;
                    }
                    fVar4.f4989e = f3;
                    f3 += fVar4.f4988d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.f4973g.size() - 1;
                float f4 = fVar2.f4989e;
                while (true) {
                    i5--;
                    if (i5 < fVar.f4986b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = this.f4973g.get(size);
                        if (i5 >= fVar3.f4986b || size <= 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    while (i5 > fVar3.f4986b) {
                        f4 -= this.f4976j.f(i5) + f2;
                        i5--;
                    }
                    f4 -= fVar3.f4988d + f2;
                    fVar3.f4989e = f4;
                }
            }
        }
        int size2 = this.f4973g.size();
        float f5 = fVar.f4989e;
        int i9 = fVar.f4986b;
        int i10 = i9 - 1;
        this.v = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = iC - 1;
        this.w = i9 == i11 ? (fVar.f4988d + f5) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar5 = this.f4973g.get(i12);
            while (true) {
                i4 = fVar5.f4986b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.f4976j.f(i10) + f2;
                i10--;
            }
            f5 -= fVar5.f4988d + f2;
            fVar5.f4989e = f5;
            if (i4 == 0) {
                this.v = f5;
            }
            i12--;
            i10--;
        }
        float f6 = fVar.f4989e + fVar.f4988d + f2;
        int i13 = fVar.f4986b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar6 = this.f4973g.get(i14);
            while (true) {
                i3 = fVar6.f4986b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.f4976j.f(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.w = (fVar6.f4988d + f6) - 1.0f;
            }
            fVar6.f4989e = f6;
            f6 += fVar6.f4988d + f2;
            i14++;
            i13++;
        }
        this.W = false;
    }

    public boolean f(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && f(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    public final void g(boolean z) {
        boolean z2 = this.q0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f4981o.isFinished()) {
                this.f4981o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f4981o.getCurrX();
                int currY = this.f4981o.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        C(currX);
                    }
                }
            }
        }
        this.B = false;
        for (int i2 = 0; i2 < this.f4973g.size(); i2++) {
            f fVar = this.f4973g.get(i2);
            if (fVar.f4987c) {
                fVar.f4987c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                x.h0(this, this.p0);
            } else {
                this.p0.run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a.e0.a.a getAdapter() {
        return this.f4976j;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.n0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) this.o0.get(i3).getLayoutParams()).f4995f;
    }

    public int getCurrentItem() {
        return this.f4977k;
    }

    public int getOffscreenPageLimit() {
        return this.C;
    }

    public int getPageMargin() {
        return this.r;
    }

    public void h() {
        int iC = this.f4976j.c();
        this.f4972f = iC;
        boolean z = this.f4973g.size() < (this.C * 2) + 1 && this.f4973g.size() < iC;
        int iMax = this.f4977k;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f4973g.size()) {
            f fVar = this.f4973g.get(i2);
            int iD = this.f4976j.d(fVar.f4985a);
            if (iD != -1) {
                if (iD == -2) {
                    this.f4973g.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f4976j.n(this);
                        z2 = true;
                    }
                    this.f4976j.a(this, fVar.f4986b, fVar.f4985a);
                    int i3 = this.f4977k;
                    if (i3 == fVar.f4986b) {
                        iMax = Math.max(0, Math.min(i3, iC - 1));
                    }
                } else {
                    int i4 = fVar.f4986b;
                    if (i4 != iD) {
                        if (i4 == this.f4977k) {
                            iMax = iD;
                        }
                        fVar.f4986b = iD;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f4976j.b(this);
        }
        Collections.sort(this.f4973g, f4969c);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                g gVar = (g) getChildAt(i5).getLayoutParams();
                if (!gVar.f4990a) {
                    gVar.f4992c = 0.0f;
                }
            }
            O(iMax, false, true);
            requestLayout();
        }
    }

    public final int i(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.Q || Math.abs(i3) <= this.O) {
            i2 += (int) (f2 + (i2 >= this.f4977k ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f4973g.size() <= 0) {
            return i2;
        }
        return Math.max(this.f4973g.get(0).f4986b, Math.min(i2, this.f4973g.get(r4.size() - 1).f4986b));
    }

    public final void j(int i2, float f2, int i3) {
        j jVar = this.i0;
        if (jVar != null) {
            jVar.a(i2, f2, i3);
        }
        List<j> list = this.h0;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar2 = this.h0.get(i4);
                if (jVar2 != null) {
                    jVar2.a(i2, f2, i3);
                }
            }
        }
        j jVar3 = this.j0;
        if (jVar3 != null) {
            jVar3.a(i2, f2, i3);
        }
    }

    public final void k(int i2) {
        j jVar = this.i0;
        if (jVar != null) {
            jVar.c(i2);
        }
        List<j> list = this.h0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.h0.get(i3);
                if (jVar2 != null) {
                    jVar2.c(i2);
                }
            }
        }
        j jVar3 = this.j0;
        if (jVar3 != null) {
            jVar3.c(i2);
        }
    }

    public final void l(int i2) {
        j jVar = this.i0;
        if (jVar != null) {
            jVar.b(i2);
        }
        List<j> list = this.h0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.h0.get(i3);
                if (jVar2 != null) {
                    jVar2.b(i2);
                }
            }
        }
        j jVar3 = this.j0;
        if (jVar3 != null) {
            jVar3.b(i2);
        }
    }

    public float m(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    public final void n(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z ? this.m0 : 0, null);
        }
    }

    public final void o() {
        this.D = false;
        this.E = false;
        VelocityTracker velocityTracker = this.N;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.N = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.p0);
        Scroller scroller = this.f4981o;
        if (scroller != null && !scroller.isFinished()) {
            this.f4981o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.r <= 0 || this.s == null || this.f4973g.size() <= 0 || this.f4976j == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.r / width;
        int i3 = 0;
        f fVar = this.f4973g.get(0);
        float f5 = fVar.f4989e;
        int size = this.f4973g.size();
        int i4 = fVar.f4986b;
        int i5 = this.f4973g.get(size - 1).f4986b;
        while (i4 < i5) {
            while (true) {
                i2 = fVar.f4986b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                fVar = this.f4973g.get(i3);
            }
            if (i4 == i2) {
                float f6 = fVar.f4989e;
                float f7 = fVar.f4988d;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                float f8 = this.f4976j.f(i4);
                f2 = (f5 + f8) * width;
                f5 += f8 + f4;
            }
            if (this.r + f2 > scrollX) {
                f3 = f4;
                this.s.setBounds(Math.round(f2), this.t, Math.round(this.r + f2), this.u);
                this.s.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            i4++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            L();
            return false;
        }
        if (action != 0) {
            if (this.D) {
                return true;
            }
            if (this.E) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.K = x;
            this.I = x;
            float y = motionEvent.getY();
            this.L = y;
            this.J = y;
            this.M = motionEvent.getPointerId(0);
            this.E = false;
            this.p = true;
            this.f4981o.computeScrollOffset();
            if (this.q0 != 2 || Math.abs(this.f4981o.getFinalX() - this.f4981o.getCurrX()) <= this.R) {
                g(false);
                this.D = false;
            } else {
                this.f4981o.abortAnimation();
                this.B = false;
                E();
                this.D = true;
                K(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.M;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f2 = x2 - this.I;
                float fAbs = Math.abs(f2);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.L);
                if (f2 != 0.0f && !x(this.I, f2) && f(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.I = x2;
                    this.J = y2;
                    this.E = true;
                    return false;
                }
                int i3 = this.H;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    this.D = true;
                    K(true);
                    setScrollState(1);
                    this.I = f2 > 0.0f ? this.K + this.H : this.K - this.H;
                    this.J = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i3) {
                    this.E = true;
                }
                if (this.D && D(x2)) {
                    x.g0(this);
                }
            }
        } else if (action == 6) {
            z(motionEvent);
        }
        if (this.N == null) {
            this.N = VelocityTracker.obtain();
        }
        this.N.addMovement(motionEvent);
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f fVarS;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f4986b == this.f4977k && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.b());
        a.e0.a.a aVar = this.f4976j;
        if (aVar != null) {
            aVar.j(mVar.f4999e, mVar.f5000f);
            O(mVar.f4998d, false, true);
        } else {
            this.f4978l = mVar.f4998d;
            this.f4979m = mVar.f4999e;
            this.f4980n = mVar.f5000f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f4998d = this.f4977k;
        a.e0.a.a aVar = this.f4976j;
        if (aVar != null) {
            mVar.f4999e = aVar.k();
        }
        return mVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.r;
            G(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(KeyEvent keyEvent) {
        int i2;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return d(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return B();
                    }
                    i2 = 66;
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return A();
                }
                i2 = 17;
            }
            return d(i2);
        }
        return false;
    }

    public final Rect q(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public f r(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return s(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.z) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public f s(View view) {
        for (int i2 = 0; i2 < this.f4973g.size(); i2++) {
            f fVar = this.f4973g.get(i2);
            if (this.f4976j.h(view, fVar.f4985a)) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(a.e0.a.a aVar) {
        a.e0.a.a aVar2 = this.f4976j;
        if (aVar2 != null) {
            aVar2.m(null);
            this.f4976j.n(this);
            for (int i2 = 0; i2 < this.f4973g.size(); i2++) {
                f fVar = this.f4973g.get(i2);
                this.f4976j.a(this, fVar.f4986b, fVar.f4985a);
            }
            this.f4976j.b(this);
            this.f4973g.clear();
            H();
            this.f4977k = 0;
            scrollTo(0, 0);
        }
        a.e0.a.a aVar3 = this.f4976j;
        this.f4976j = aVar;
        this.f4972f = 0;
        if (aVar != null) {
            if (this.q == null) {
                this.q = new l();
            }
            this.f4976j.m(this.q);
            this.B = false;
            boolean z = this.V;
            this.V = true;
            this.f4972f = this.f4976j.c();
            if (this.f4978l >= 0) {
                this.f4976j.j(this.f4979m, this.f4980n);
                O(this.f4978l, false, true);
                this.f4978l = -1;
                this.f4979m = null;
                this.f4980n = null;
            } else if (z) {
                requestLayout();
            } else {
                E();
            }
        }
        List<i> list = this.k0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.k0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.k0.get(i3).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i2) {
        this.B = false;
        O(i2, !this.V, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.C) {
            this.C = i2;
            E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.i0 = jVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.r;
        this.r = i2;
        int width = getWidth();
        G(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(a.i.i.b.f(getContext(), i2));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.s = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.q0 == i2) {
            return;
        }
        this.q0 = i2;
        if (this.l0 != null) {
            n(i2 != 0);
        }
        l(i2);
    }

    public final f t() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.r / clientWidth : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z = true;
        while (i4 < this.f4973g.size()) {
            f fVar2 = this.f4973g.get(i4);
            if (!z && fVar2.f4986b != (i2 = i3 + 1)) {
                fVar2 = this.f4974h;
                fVar2.f4989e = f2 + f4 + f3;
                fVar2.f4986b = i2;
                fVar2.f4988d = this.f4976j.f(i2);
                i4--;
            }
            f2 = fVar2.f4989e;
            float f5 = fVar2.f4988d + f2 + f3;
            if (!z && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i4 == this.f4973g.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.f4986b;
            f4 = fVar2.f4988d;
            i4++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    public f u(int i2) {
        for (int i3 = 0; i3 < this.f4973g.size(); i3++) {
            f fVar = this.f4973g.get(i3);
            if (fVar.f4986b == i2) {
                return fVar;
            }
        }
        return null;
    }

    public void v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f4981o = new Scroller(context, f4970d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.H = viewConfiguration.getScaledPagingTouchSlop();
        this.O = (int) (400.0f * f2);
        this.P = viewConfiguration.getScaledMaximumFlingVelocity();
        this.T = new EdgeEffect(context);
        this.U = new EdgeEffect(context);
        this.Q = (int) (25.0f * f2);
        this.R = (int) (2.0f * f2);
        this.F = (int) (f2 * 16.0f);
        x.p0(this, new h());
        if (x.A(this) == 0) {
            x.y0(this, 1);
        }
        x.A0(this, new d());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.s;
    }

    public final boolean x(float f2, float f3) {
        return (f2 < ((float) this.G) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.G)) && f3 < 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.g0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.f4990a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f4991b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.j(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.l0
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.g) r0
            boolean r0 = r0.f4990a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.l0
            r3.a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.f0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.y(int, float, int):void");
    }

    public final void z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.M) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.I = motionEvent.getX(i2);
            this.M = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.N;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }
}

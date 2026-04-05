package a.i.r;

import a.i.r.a;
import a.i.r.f0;
import a.i.r.g0.c;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f2096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f2097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f2098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f2099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static WeakHashMap<View, String> f2100f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Field f2102h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static ThreadLocal<Rect> f2104j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f2095a = new AtomicInteger(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static WeakHashMap<View, b0> f2101g = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f2103i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f2105k = {a.i.d.f1637b, a.i.d.f1638c, a.i.d.f1649n, a.i.d.y, a.i.d.B, a.i.d.C, a.i.d.D, a.i.d.E, a.i.d.F, a.i.d.G, a.i.d.f1639d, a.i.d.f1640e, a.i.d.f1641f, a.i.d.f1642g, a.i.d.f1643h, a.i.d.f1644i, a.i.d.f1645j, a.i.d.f1646k, a.i.d.f1647l, a.i.d.f1648m, a.i.d.f1650o, a.i.d.p, a.i.d.q, a.i.d.r, a.i.d.s, a.i.d.t, a.i.d.u, a.i.d.v, a.i.d.w, a.i.d.x, a.i.d.z, a.i.d.A};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t f2106l = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static f f2107m = new f();

    public class a implements t {
        @Override // a.i.r.t
        public a.i.r.c a(a.i.r.c cVar) {
            return cVar;
        }
    }

    public class b extends g<Boolean> {
        public b(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        @Override // a.i.r.x.g
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        @Override // a.i.r.x.g
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        @Override // a.i.r.x.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public class c extends g<CharSequence> {
        public c(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        @Override // a.i.r.x.g
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @Override // a.i.r.x.g
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @Override // a.i.r.x.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class d extends g<CharSequence> {
        public d(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        @Override // a.i.r.x.g
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return view.getStateDescription();
        }

        @Override // a.i.r.x.g
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        @Override // a.i.r.x.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class e extends g<Boolean> {
        public e(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        @Override // a.i.r.x.g
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        @Override // a.i.r.x.g
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        @Override // a.i.r.x.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public static class f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakHashMap<View, Boolean> f2108b = new WeakHashMap<>();

        public final void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                x.Y(view, z2 ? 16 : 32);
                this.f2108b.put(view, Boolean.valueOf(z2));
            }
        }

        public final void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f2108b.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<T> f2110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f2112d;

        public g(int i2, Class<T> cls, int i3) {
            this(i2, cls, 0, i3);
        }

        public g(int i2, Class<T> cls, int i3, int i4) {
            this.f2109a = i2;
            this.f2110b = cls;
            this.f2112d = i3;
            this.f2111c = i4;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= this.f2111c;
        }

        public abstract T d(View view);

        public abstract void e(View view, T t);

        public T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T t = (T) view.getTag(this.f2109a);
            if (this.f2110b.isInstance(t)) {
                return t;
            }
            return null;
        }

        public void g(View view, T t) {
            if (c()) {
                e(view, t);
            } else if (b() && h(f(view), t)) {
                x.G(view);
                view.setTag(this.f2109a, t);
                x.Y(view, this.f2112d);
            }
        }

        public abstract boolean h(T t, T t2);
    }

    public static class h {

        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public f0 f2113a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f2114b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r f2115c;

            public a(View view, r rVar) {
                this.f2114b = view;
                this.f2115c = rVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                f0 f0VarT = f0.t(windowInsets, view);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    h.a(windowInsets, this.f2114b);
                    if (f0VarT.equals(this.f2113a)) {
                        return this.f2115c.a(view, f0VarT).r();
                    }
                }
                this.f2113a = f0VarT;
                f0 f0VarA = this.f2115c.a(view, f0VarT);
                if (i2 >= 30) {
                    return f0VarA.r();
                }
                x.m0(view);
                return f0VarA.r();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(a.i.d.b0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static f0 b(View view, f0 f0Var, Rect rect) {
            WindowInsets windowInsetsR = f0Var.r();
            if (windowInsetsR != null) {
                return f0.t(view.computeSystemWindowInsets(windowInsetsR, rect), view);
            }
            rect.setEmpty();
            return f0Var;
        }

        public static f0 c(View view) {
            return f0.a.a(view);
        }

        public static void d(View view, r rVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(a.i.d.T, rVar);
            }
            if (rVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(a.i.d.b0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, rVar));
            }
        }
    }

    public static class i {
        public static f0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            f0 f0VarS = f0.s(rootWindowInsets);
            f0VarS.p(f0VarS);
            f0VarS.d(view.getRootView());
            return f0VarS;
        }
    }

    public static class j {
        public static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public interface k {
        boolean a(View view, KeyEvent keyEvent);
    }

    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f2116a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakHashMap<View, Boolean> f2117b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f2118c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public WeakReference<KeyEvent> f2119d = null;

        public static l a(View view) {
            int i2 = a.i.d.Z;
            l lVar = (l) view.getTag(i2);
            if (lVar != null) {
                return lVar;
            }
            l lVar2 = new l();
            view.setTag(i2, lVar2);
            return lVar2;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2117b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray<WeakReference<View>> d() {
            if (this.f2118c == null) {
                this.f2118c = new SparseArray<>();
            }
            return this.f2118c;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.i.d.a0);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((k) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(KeyEvent keyEvent) {
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f2119d;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f2119d = new WeakReference<>(keyEvent);
            WeakReference<View> weakReferenceValueAt = null;
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && x.T(view)) {
                e(view, keyEvent);
            }
            return true;
        }

        public final void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2117b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2116a;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f2117b == null) {
                    this.f2117b = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f2116a;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f2117b.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f2117b.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static void A0(View view, r rVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            h.d(view, rVar);
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int B(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static void B0(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    public static int C(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static void C0(View view, v vVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (vVar != null ? vVar.a() : null));
        }
    }

    public static int D(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f2099e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f2098d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2099e = true;
        }
        Field field = f2098d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static void D0(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static int E(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f2097c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f2096b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2097c = true;
        }
        Field field = f2096b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static void E0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            K0().g(view, charSequence);
        }
    }

    public static String[] F(View view) {
        return (String[]) view.getTag(a.i.d.V);
    }

    public static void F0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f2100f == null) {
            f2100f = new WeakHashMap<>();
        }
        f2100f.put(view, str);
    }

    public static a.i.r.a G(View view) {
        a.i.r.a aVarL = l(view);
        if (aVarL == null) {
            aVarL = new a.i.r.a();
        }
        p0(view, aVarL);
        return aVarL;
    }

    @Deprecated
    public static void G0(View view, float f2) {
        view.setTranslationX(f2);
    }

    public static int H(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    @Deprecated
    public static void H0(View view, float f2) {
        view.setTranslationY(f2);
    }

    public static int I(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    public static void I0(View view) {
        if (A(view) == 0) {
            y0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (A((View) parent) == 4) {
                y0(view, 2);
                return;
            }
        }
    }

    public static f0 J(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return i.a(view);
        }
        if (i2 >= 21) {
            return h.c(view);
        }
        return null;
    }

    public static void J0(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setZ(f2);
        }
    }

    public static final CharSequence K(View view) {
        return K0().f(view);
    }

    public static g<CharSequence> K0() {
        return new d(a.i.d.X, CharSequence.class, 64, 30);
    }

    public static String L(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f2100f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void L0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof a.i.r.l) {
            ((a.i.r.l) view).stopNestedScroll();
        }
    }

    @Deprecated
    public static float M(View view) {
        return view.getTranslationY();
    }

    public static void M0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static int N(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static float O(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean P(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static boolean Q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean R(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static boolean S(View view) {
        Boolean boolF = a().f(view);
        if (boolF == null) {
            return false;
        }
        return boolF.booleanValue();
    }

    public static boolean T(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    public static boolean U(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean V(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof a.i.r.l) {
            return ((a.i.r.l) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean W(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static boolean X(View view) {
        Boolean boolF = o0().f(view);
        if (boolF == null) {
            return false;
        }
        return boolF.booleanValue();
    }

    public static void Y(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = p(view) != null && view.getVisibility() == 0;
            if (o(view) != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z) {
                    accessibilityEventObtain.getText().add(p(view));
                    I0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i2);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(p(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void Z(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        if (i3 < 21) {
            e(view, i2);
            return;
        }
        Rect rectX = x();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectX.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectX.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        e(view, i2);
        if (z && rectX.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectX);
        }
    }

    public static g<Boolean> a() {
        return new e(a.i.d.R, Boolean.class, 28);
    }

    public static void a0(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        if (i3 < 21) {
            f(view, i2);
            return;
        }
        Rect rectX = x();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectX.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectX.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        f(view, i2);
        if (z && rectX.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectX);
        }
    }

    public static int b(View view, CharSequence charSequence, a.i.r.g0.f fVar) {
        int iR = r(view);
        if (iR != -1) {
            c(view, new c.a(iR, charSequence, fVar));
        }
        return iR;
    }

    public static f0 b0(View view, f0 f0Var) {
        WindowInsets windowInsetsR;
        if (Build.VERSION.SDK_INT >= 21 && (windowInsetsR = f0Var.r()) != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsR);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsR)) {
                return f0.t(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return f0Var;
    }

    public static void c(View view, c.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            G(view);
            k0(aVar.b(), view);
            q(view).add(aVar);
            Y(view, 0);
        }
    }

    public static void c0(View view, a.i.r.g0.c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.w0());
    }

    public static b0 d(View view) {
        if (f2101g == null) {
            f2101g = new WeakHashMap<>();
        }
        b0 b0Var = f2101g.get(view);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(view);
        f2101g.put(view, b0Var2);
        return b0Var2;
    }

    public static g<CharSequence> d0() {
        return new c(a.i.d.S, CharSequence.class, 8, 28);
    }

    public static void e(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            M0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                M0((View) parent);
            }
        }
    }

    public static boolean e0(View view, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i2, bundle);
        }
        return false;
    }

    public static void f(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            M0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                M0((View) parent);
            }
        }
    }

    public static a.i.r.c f0(View view, a.i.r.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        s sVar = (s) view.getTag(a.i.d.U);
        if (sVar == null) {
            return y(view).a(cVar);
        }
        a.i.r.c cVarA = sVar.a(view, cVar);
        if (cVarA == null) {
            return null;
        }
        return y(view).a(cVarA);
    }

    public static f0 g(View view, f0 f0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? h.b(view, f0Var, rect) : f0Var;
    }

    public static void g0(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static f0 h(View view, f0 f0Var) {
        WindowInsets windowInsetsR;
        if (Build.VERSION.SDK_INT >= 21 && (windowInsetsR = f0Var.r()) != null) {
            WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsetsR);
            if (!windowInsetsDispatchApplyWindowInsets.equals(windowInsetsR)) {
                return f0.t(windowInsetsDispatchApplyWindowInsets, view);
            }
        }
        return f0Var;
    }

    public static void h0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return l.a(view).b(view, keyEvent);
    }

    public static void i0(View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    public static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return l.a(view).f(keyEvent);
    }

    public static void j0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            k0(i2, view);
            Y(view, 0);
        }
    }

    public static int k() {
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = f2095a;
            i2 = atomicInteger.get();
            i3 = i2 + 1;
            if (i3 > 16777215) {
                i3 = 1;
            }
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i2;
    }

    public static void k0(int i2, View view) {
        List<c.a> listQ = q(view);
        for (int i3 = 0; i3 < listQ.size(); i3++) {
            if (listQ.get(i3).b() == i2) {
                listQ.remove(i3);
                return;
            }
        }
    }

    public static a.i.r.a l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM = m(view);
        if (accessibilityDelegateM == null) {
            return null;
        }
        return accessibilityDelegateM instanceof a.C0040a ? ((a.C0040a) accessibilityDelegateM).f1965a : new a.i.r.a(accessibilityDelegateM);
    }

    public static void l0(View view, c.a aVar, CharSequence charSequence, a.i.r.g0.f fVar) {
        if (fVar == null && charSequence == null) {
            j0(view, aVar.b());
        } else {
            c(view, aVar.a(charSequence, fVar));
        }
    }

    public static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : n(view);
    }

    public static void m0(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static View.AccessibilityDelegate n(View view) {
        if (f2103i) {
            return null;
        }
        if (f2102h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2102h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2103i = true;
                return null;
            }
        }
        try {
            Object obj = f2102h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2103i = true;
            return null;
        }
    }

    public static void n0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            j.a(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static int o(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static g<Boolean> o0() {
        return new b(a.i.d.W, Boolean.class, 28);
    }

    public static CharSequence p(View view) {
        return d0().f(view);
    }

    public static void p0(View view, a.i.r.a aVar) {
        if (aVar == null && (m(view) instanceof a.C0040a)) {
            aVar = new a.i.r.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static List<c.a> q(View view) {
        int i2 = a.i.d.P;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i2, arrayList2);
        return arrayList2;
    }

    public static void q0(View view, boolean z) {
        a().g(view, Boolean.valueOf(z));
    }

    public static int r(View view) {
        List<c.a> listQ = q(view);
        int i2 = 0;
        int i3 = -1;
        while (true) {
            int[] iArr = f2105k;
            if (i2 >= iArr.length || i3 != -1) {
                break;
            }
            int i4 = iArr[i2];
            boolean z = true;
            for (int i5 = 0; i5 < listQ.size(); i5++) {
                z &= listQ.get(i5).b() != i4;
            }
            if (z) {
                i3 = i4;
            }
            i2++;
        }
        return i3;
    }

    public static void r0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ColorStateList s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof w) {
            return ((w) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void s0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PorterDuff.Mode t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof w) {
            return ((w) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t0(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            if (view instanceof w) {
                ((w) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        view.setBackgroundTintList(colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    public static Rect u(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u0(View view, PorterDuff.Mode mode) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            if (view instanceof w) {
                ((w) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        view.setBackgroundTintMode(mode);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    public static Display v(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (T(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static void v0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static float w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static void w0(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    public static Rect x() {
        if (f2104j == null) {
            f2104j = new ThreadLocal<>();
        }
        Rect rect = f2104j.get();
        if (rect == null) {
            rect = new Rect();
            f2104j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void x0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t y(View view) {
        return view instanceof t ? (t) view : f2106l;
    }

    public static void y0(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 19) {
            if (i3 < 16) {
                return;
            }
            if (i2 == 4) {
                i2 = 2;
            }
        }
        view.setImportantForAccessibility(i2);
    }

    public static boolean z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    public static void z0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i2);
        }
    }
}

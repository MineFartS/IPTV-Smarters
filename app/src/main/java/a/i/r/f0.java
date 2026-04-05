package a.i.r;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f2010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f2011b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Field f2012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Field f2013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Field f2014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f2015d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2012a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2013b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2014c = declaredField3;
                declaredField3.setAccessible(true);
                f2015d = true;
            } catch (ReflectiveOperationException e2) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
            }
        }

        public static f0 a(View view) {
            if (f2015d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2012a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2013b.get(obj);
                        Rect rect2 = (Rect) f2014c.get(obj);
                        if (rect != null && rect2 != null) {
                            f0 f0VarA = new b().b(a.i.j.b.c(rect)).c(a.i.j.b.c(rect2)).a();
                            f0VarA.p(f0VarA);
                            f0VarA.d(view.getRootView());
                            return f0VarA;
                        }
                    }
                } catch (IllegalAccessException e2) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
                }
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f2016a;

        public b() {
            int i2 = Build.VERSION.SDK_INT;
            this.f2016a = i2 >= 30 ? new e() : i2 >= 29 ? new d() : i2 >= 20 ? new c() : new f();
        }

        public b(f0 f0Var) {
            int i2 = Build.VERSION.SDK_INT;
            this.f2016a = i2 >= 30 ? new e(f0Var) : i2 >= 29 ? new d(f0Var) : i2 >= 20 ? new c(f0Var) : new f(f0Var);
        }

        public f0 a() {
            return this.f2016a.b();
        }

        @Deprecated
        public b b(a.i.j.b bVar) {
            this.f2016a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(a.i.j.b bVar) {
            this.f2016a.f(bVar);
            return this;
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Field f2017c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f2018d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Constructor<WindowInsets> f2019e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static boolean f2020f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public WindowInsets f2021g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public a.i.j.b f2022h;

        public c() {
            this.f2021g = h();
        }

        public c(f0 f0Var) {
            this.f2021g = f0Var.r();
        }

        public static WindowInsets h() {
            if (!f2018d) {
                try {
                    f2017c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f2018d = true;
            }
            Field field = f2017c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f2020f) {
                try {
                    f2019e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f2020f = true;
            }
            Constructor<WindowInsets> constructor = f2019e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // a.i.r.f0.f
        public f0 b() {
            a();
            f0 f0VarS = f0.s(this.f2021g);
            f0VarS.n(this.f2025b);
            f0VarS.q(this.f2022h);
            return f0VarS;
        }

        @Override // a.i.r.f0.f
        public void d(a.i.j.b bVar) {
            this.f2022h = bVar;
        }

        @Override // a.i.r.f0.f
        public void f(a.i.j.b bVar) {
            WindowInsets windowInsets = this.f2021g;
            if (windowInsets != null) {
                this.f2021g = windowInsets.replaceSystemWindowInsets(bVar.f1797b, bVar.f1798c, bVar.f1799d, bVar.f1800e);
            }
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f2023c;

        public d() {
            this.f2023c = new WindowInsets.Builder();
        }

        public d(f0 f0Var) {
            WindowInsets windowInsetsR = f0Var.r();
            this.f2023c = windowInsetsR != null ? new WindowInsets.Builder(windowInsetsR) : new WindowInsets.Builder();
        }

        @Override // a.i.r.f0.f
        public f0 b() {
            a();
            f0 f0VarS = f0.s(this.f2023c.build());
            f0VarS.n(this.f2025b);
            return f0VarS;
        }

        @Override // a.i.r.f0.f
        public void c(a.i.j.b bVar) {
            this.f2023c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // a.i.r.f0.f
        public void d(a.i.j.b bVar) {
            this.f2023c.setStableInsets(bVar.e());
        }

        @Override // a.i.r.f0.f
        public void e(a.i.j.b bVar) {
            this.f2023c.setSystemGestureInsets(bVar.e());
        }

        @Override // a.i.r.f0.f
        public void f(a.i.j.b bVar) {
            this.f2023c.setSystemWindowInsets(bVar.e());
        }

        @Override // a.i.r.f0.f
        public void g(a.i.j.b bVar) {
            this.f2023c.setTappableElementInsets(bVar.e());
        }
    }

    public static class e extends d {
        public e() {
        }

        public e(f0 f0Var) {
            super(f0Var);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f2024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a.i.j.b[] f2025b;

        public f() {
            this(new f0((f0) null));
        }

        public f(f0 f0Var) {
            this.f2024a = f0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r3 = this;
                a.i.j.b[] r0 = r3.f2025b
                if (r0 == 0) goto L55
                r1 = 1
                int r1 = a.i.r.f0.m.a(r1)
                r0 = r0[r1]
                a.i.j.b[] r1 = r3.f2025b
                r2 = 2
                int r2 = a.i.r.f0.m.a(r2)
                r1 = r1[r2]
                if (r0 == 0) goto L1d
                if (r1 == 0) goto L1d
                a.i.j.b r0 = a.i.j.b.a(r0, r1)
                goto L1f
            L1d:
                if (r0 == 0) goto L23
            L1f:
                r3.f(r0)
                goto L28
            L23:
                if (r1 == 0) goto L28
                r3.f(r1)
            L28:
                a.i.j.b[] r0 = r3.f2025b
                r1 = 16
                int r1 = a.i.r.f0.m.a(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L37
                r3.e(r0)
            L37:
                a.i.j.b[] r0 = r3.f2025b
                r1 = 32
                int r1 = a.i.r.f0.m.a(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L46
                r3.c(r0)
            L46:
                a.i.j.b[] r0 = r3.f2025b
                r1 = 64
                int r1 = a.i.r.f0.m.a(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L55
                r3.g(r0)
            L55:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.i.r.f0.f.a():void");
        }

        public f0 b() {
            a();
            return this.f2024a;
        }

        public void c(a.i.j.b bVar) {
        }

        public void d(a.i.j.b bVar) {
        }

        public void e(a.i.j.b bVar) {
        }

        public void f(a.i.j.b bVar) {
        }

        public void g(a.i.j.b bVar) {
        }
    }

    public static class g extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static boolean f2026c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static Method f2027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Class<?> f2028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static Class<?> f2029f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static Field f2030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static Field f2031h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final WindowInsets f2032i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public a.i.j.b[] f2033j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public a.i.j.b f2034k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public f0 f2035l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public a.i.j.b f2036m;

        public g(f0 f0Var, g gVar) {
            this(f0Var, new WindowInsets(gVar.f2032i));
        }

        public g(f0 f0Var, WindowInsets windowInsets) {
            super(f0Var);
            this.f2034k = null;
            this.f2032i = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        public static void r() {
            try {
                f2027d = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f2028e = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2029f = cls;
                f2030g = cls.getDeclaredField("mVisibleInsets");
                f2031h = f2028e.getDeclaredField("mAttachInfo");
                f2030g.setAccessible(true);
                f2031h.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
            f2026c = true;
        }

        @Override // a.i.r.f0.l
        public void d(View view) {
            a.i.j.b bVarQ = q(view);
            if (bVarQ == null) {
                bVarQ = a.i.j.b.f1796a;
            }
            n(bVarQ);
        }

        @Override // a.i.r.f0.l
        public void e(f0 f0Var) {
            f0Var.p(this.f2035l);
            f0Var.o(this.f2036m);
        }

        @Override // a.i.r.f0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return a.i.q.c.a(this.f2036m, ((g) obj).f2036m);
            }
            return false;
        }

        @Override // a.i.r.f0.l
        public final a.i.j.b i() {
            if (this.f2034k == null) {
                this.f2034k = a.i.j.b.b(this.f2032i.getSystemWindowInsetLeft(), this.f2032i.getSystemWindowInsetTop(), this.f2032i.getSystemWindowInsetRight(), this.f2032i.getSystemWindowInsetBottom());
            }
            return this.f2034k;
        }

        @Override // a.i.r.f0.l
        public f0 j(int i2, int i3, int i4, int i5) {
            b bVar = new b(f0.s(this.f2032i));
            bVar.c(f0.k(i(), i2, i3, i4, i5));
            bVar.b(f0.k(h(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // a.i.r.f0.l
        public boolean l() {
            return this.f2032i.isRound();
        }

        @Override // a.i.r.f0.l
        public void m(a.i.j.b[] bVarArr) {
            this.f2033j = bVarArr;
        }

        @Override // a.i.r.f0.l
        public void n(a.i.j.b bVar) {
            this.f2036m = bVar;
        }

        @Override // a.i.r.f0.l
        public void o(f0 f0Var) {
            this.f2035l = f0Var;
        }

        public final a.i.j.b q(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f2026c) {
                r();
            }
            Method method = f2027d;
            if (method != null && f2029f != null && f2030g != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f2030g.get(f2031h.get(objInvoke));
                    if (rect != null) {
                        return a.i.j.b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                }
            }
            return null;
        }
    }

    public static class h extends g {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public a.i.j.b f2037n;

        public h(f0 f0Var, h hVar) {
            super(f0Var, hVar);
            this.f2037n = null;
            this.f2037n = hVar.f2037n;
        }

        public h(f0 f0Var, WindowInsets windowInsets) {
            super(f0Var, windowInsets);
            this.f2037n = null;
        }

        @Override // a.i.r.f0.l
        public f0 b() {
            return f0.s(this.f2032i.consumeStableInsets());
        }

        @Override // a.i.r.f0.l
        public f0 c() {
            return f0.s(this.f2032i.consumeSystemWindowInsets());
        }

        @Override // a.i.r.f0.l
        public final a.i.j.b h() {
            if (this.f2037n == null) {
                this.f2037n = a.i.j.b.b(this.f2032i.getStableInsetLeft(), this.f2032i.getStableInsetTop(), this.f2032i.getStableInsetRight(), this.f2032i.getStableInsetBottom());
            }
            return this.f2037n;
        }

        @Override // a.i.r.f0.l
        public boolean k() {
            return this.f2032i.isConsumed();
        }

        @Override // a.i.r.f0.l
        public void p(a.i.j.b bVar) {
            this.f2037n = bVar;
        }
    }

    public static class i extends h {
        public i(f0 f0Var, i iVar) {
            super(f0Var, iVar);
        }

        public i(f0 f0Var, WindowInsets windowInsets) {
            super(f0Var, windowInsets);
        }

        @Override // a.i.r.f0.l
        public f0 a() {
            return f0.s(this.f2032i.consumeDisplayCutout());
        }

        @Override // a.i.r.f0.g, a.i.r.f0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return a.i.q.c.a(this.f2032i, iVar.f2032i) && a.i.q.c.a(this.f2036m, iVar.f2036m);
        }

        @Override // a.i.r.f0.l
        public a.i.r.d f() {
            return a.i.r.d.a(this.f2032i.getDisplayCutout());
        }

        @Override // a.i.r.f0.l
        public int hashCode() {
            return this.f2032i.hashCode();
        }
    }

    public static class j extends i {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public a.i.j.b f2038o;
        public a.i.j.b p;
        public a.i.j.b q;

        public j(f0 f0Var, j jVar) {
            super(f0Var, jVar);
            this.f2038o = null;
            this.p = null;
            this.q = null;
        }

        public j(f0 f0Var, WindowInsets windowInsets) {
            super(f0Var, windowInsets);
            this.f2038o = null;
            this.p = null;
            this.q = null;
        }

        @Override // a.i.r.f0.l
        public a.i.j.b g() {
            if (this.p == null) {
                this.p = a.i.j.b.d(this.f2032i.getMandatorySystemGestureInsets());
            }
            return this.p;
        }

        @Override // a.i.r.f0.g, a.i.r.f0.l
        public f0 j(int i2, int i3, int i4, int i5) {
            return f0.s(this.f2032i.inset(i2, i3, i4, i5));
        }

        @Override // a.i.r.f0.h, a.i.r.f0.l
        public void p(a.i.j.b bVar) {
        }
    }

    public static class k extends j {
        public static final f0 r = f0.s(WindowInsets.CONSUMED);

        public k(f0 f0Var, k kVar) {
            super(f0Var, kVar);
        }

        public k(f0 f0Var, WindowInsets windowInsets) {
            super(f0Var, windowInsets);
        }

        @Override // a.i.r.f0.g, a.i.r.f0.l
        public final void d(View view) {
        }
    }

    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f0 f2039a = new b().a().a().b().c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0 f2040b;

        public l(f0 f0Var) {
            this.f2040b = f0Var;
        }

        public f0 a() {
            return this.f2040b;
        }

        public f0 b() {
            return this.f2040b;
        }

        public f0 c() {
            return this.f2040b;
        }

        public void d(View view) {
        }

        public void e(f0 f0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return l() == lVar.l() && k() == lVar.k() && a.i.q.d.a(i(), lVar.i()) && a.i.q.d.a(h(), lVar.h()) && a.i.q.d.a(f(), lVar.f());
        }

        public a.i.r.d f() {
            return null;
        }

        public a.i.j.b g() {
            return i();
        }

        public a.i.j.b h() {
            return a.i.j.b.f1796a;
        }

        public int hashCode() {
            return a.i.q.d.b(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), h(), f());
        }

        public a.i.j.b i() {
            return a.i.j.b.f1796a;
        }

        public f0 j(int i2, int i3, int i4, int i5) {
            return f2039a;
        }

        public boolean k() {
            return false;
        }

        public boolean l() {
            return false;
        }

        public void m(a.i.j.b[] bVarArr) {
        }

        public void n(a.i.j.b bVar) {
        }

        public void o(f0 f0Var) {
        }

        public void p(a.i.j.b bVar) {
        }
    }

    public static final class m {
        public static int a(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
        }
    }

    static {
        f2010a = Build.VERSION.SDK_INT >= 30 ? k.r : l.f2039a;
    }

    public f0(f0 f0Var) {
        if (f0Var == null) {
            this.f2011b = new l(this);
            return;
        }
        l lVar = f0Var.f2011b;
        int i2 = Build.VERSION.SDK_INT;
        this.f2011b = (i2 < 30 || !(lVar instanceof k)) ? (i2 < 29 || !(lVar instanceof j)) ? (i2 < 28 || !(lVar instanceof i)) ? (i2 < 21 || !(lVar instanceof h)) ? (i2 < 20 || !(lVar instanceof g)) ? new l(this) : new g(this, (g) lVar) : new h(this, (h) lVar) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    public f0(WindowInsets windowInsets) {
        l gVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            gVar = new k(this, windowInsets);
        } else if (i2 >= 29) {
            gVar = new j(this, windowInsets);
        } else if (i2 >= 28) {
            gVar = new i(this, windowInsets);
        } else if (i2 >= 21) {
            gVar = new h(this, windowInsets);
        } else {
            if (i2 < 20) {
                this.f2011b = new l(this);
                return;
            }
            gVar = new g(this, windowInsets);
        }
        this.f2011b = gVar;
    }

    public static a.i.j.b k(a.i.j.b bVar, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, bVar.f1797b - i2);
        int iMax2 = Math.max(0, bVar.f1798c - i3);
        int iMax3 = Math.max(0, bVar.f1799d - i4);
        int iMax4 = Math.max(0, bVar.f1800e - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? bVar : a.i.j.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static f0 s(WindowInsets windowInsets) {
        return t(windowInsets, null);
    }

    public static f0 t(WindowInsets windowInsets, View view) {
        f0 f0Var = new f0((WindowInsets) a.i.q.i.e(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            f0Var.p(x.J(view));
            f0Var.d(view.getRootView());
        }
        return f0Var;
    }

    @Deprecated
    public f0 a() {
        return this.f2011b.a();
    }

    @Deprecated
    public f0 b() {
        return this.f2011b.b();
    }

    @Deprecated
    public f0 c() {
        return this.f2011b.c();
    }

    public void d(View view) {
        this.f2011b.d(view);
    }

    @Deprecated
    public a.i.j.b e() {
        return this.f2011b.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return a.i.q.d.a(this.f2011b, ((f0) obj).f2011b);
        }
        return false;
    }

    @Deprecated
    public int f() {
        return this.f2011b.i().f1800e;
    }

    @Deprecated
    public int g() {
        return this.f2011b.i().f1797b;
    }

    @Deprecated
    public int h() {
        return this.f2011b.i().f1799d;
    }

    public int hashCode() {
        l lVar = this.f2011b;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f2011b.i().f1798c;
    }

    public f0 j(int i2, int i3, int i4, int i5) {
        return this.f2011b.j(i2, i3, i4, i5);
    }

    public boolean l() {
        return this.f2011b.k();
    }

    @Deprecated
    public f0 m(int i2, int i3, int i4, int i5) {
        return new b(this).c(a.i.j.b.b(i2, i3, i4, i5)).a();
    }

    public void n(a.i.j.b[] bVarArr) {
        this.f2011b.m(bVarArr);
    }

    public void o(a.i.j.b bVar) {
        this.f2011b.n(bVar);
    }

    public void p(f0 f0Var) {
        this.f2011b.o(f0Var);
    }

    public void q(a.i.j.b bVar) {
        this.f2011b.p(bVar);
    }

    public WindowInsets r() {
        l lVar = this.f2011b;
        if (lVar instanceof g) {
            return ((g) lVar).f2032i;
        }
        return null;
    }
}

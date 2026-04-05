package a.k.b;

import a.f.j;
import a.i.r.g0.e;
import a.i.r.x;
import a.k.b.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends a.i.r.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Rect f2179d = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b.a<a.i.r.g0.c> f2180e = new C0050a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b.InterfaceC0051b<j<a.i.r.g0.c>, a.i.r.g0.c> f2181f = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AccessibilityManager f2186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f2187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f2188m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f2182g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f2183h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f2184i = new Rect();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f2185j = new int[2];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2189n = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2190o = Integer.MIN_VALUE;
    public int p = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a.k.b.a$a, reason: collision with other inner class name */
    public class C0050a implements b.a<a.i.r.g0.c> {
        @Override // a.k.b.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(a.i.r.g0.c cVar, Rect rect) {
            cVar.l(rect);
        }
    }

    public class b implements b.InterfaceC0051b<j<a.i.r.g0.c>, a.i.r.g0.c> {
        @Override // a.k.b.b.InterfaceC0051b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a.i.r.g0.c a(j<a.i.r.g0.c> jVar, int i2) {
            return jVar.n(i2);
        }

        @Override // a.k.b.b.InterfaceC0051b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(j<a.i.r.g0.c> jVar) {
            return jVar.m();
        }
    }

    public class c extends a.i.r.g0.d {
        public c() {
        }

        @Override // a.i.r.g0.d
        public a.i.r.g0.c b(int i2) {
            return a.i.r.g0.c.M(a.this.H(i2));
        }

        @Override // a.i.r.g0.d
        public a.i.r.g0.c d(int i2) {
            int i3 = i2 == 2 ? a.this.f2189n : a.this.f2190o;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i3);
        }

        @Override // a.i.r.g0.d
        public boolean f(int i2, int i3, Bundle bundle) {
            return a.this.P(i2, i3, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f2187l = view;
        this.f2186k = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (x.A(view) == 0) {
            x.y0(view, 1);
        }
    }

    public static Rect D(View view, int i2, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    public static int F(int i2) {
        if (i2 == 19) {
            return 33;
        }
        if (i2 != 21) {
            return i2 != 22 ? 130 : 66;
        }
        return 17;
    }

    public final int A() {
        return this.f2190o;
    }

    public abstract int B(float f2, float f3);

    public abstract void C(List<Integer> list);

    public final boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f2187l.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.f2187l;
        do {
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return parent != null;
            }
            view = (View) parent;
            if (view.getAlpha() <= 0.0f) {
                break;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    public final boolean G(int i2, Rect rect) {
        Object objD;
        j<a.i.r.g0.c> jVarY = y();
        int i3 = this.f2190o;
        a.i.r.g0.c cVarF = i3 == Integer.MIN_VALUE ? null : jVarY.f(i3);
        if (i2 == 1 || i2 == 2) {
            objD = a.k.b.b.d(jVarY, f2181f, f2180e, cVarF, i2, x.C(this.f2187l) == 1, false);
        } else {
            if (i2 != 17 && i2 != 33 && i2 != 66 && i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i4 = this.f2190o;
            if (i4 != Integer.MIN_VALUE) {
                z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f2187l, i2, rect2);
            }
            objD = a.k.b.b.c(jVarY, f2181f, f2180e, cVarF, rect2, i2);
        }
        a.i.r.g0.c cVar = (a.i.r.g0.c) objD;
        return T(cVar != null ? jVarY.j(jVarY.h(cVar)) : Integer.MIN_VALUE);
    }

    public a.i.r.g0.c H(int i2) {
        return i2 == -1 ? u() : t(i2);
    }

    public final void I(boolean z, int i2, Rect rect) {
        int i3 = this.f2190o;
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        if (z) {
            G(i2, rect);
        }
    }

    public abstract boolean J(int i2, int i3, Bundle bundle);

    public void K(AccessibilityEvent accessibilityEvent) {
    }

    public void L(int i2, AccessibilityEvent accessibilityEvent) {
    }

    public void M(a.i.r.g0.c cVar) {
    }

    public abstract void N(int i2, a.i.r.g0.c cVar);

    public void O(int i2, boolean z) {
    }

    public boolean P(int i2, int i3, Bundle bundle) {
        return i2 != -1 ? Q(i2, i3, bundle) : R(i3, bundle);
    }

    public final boolean Q(int i2, int i3, Bundle bundle) {
        return i3 != 1 ? i3 != 2 ? i3 != 64 ? i3 != 128 ? J(i2, i3, bundle) : n(i2) : S(i2) : o(i2) : T(i2);
    }

    public final boolean R(int i2, Bundle bundle) {
        return x.e0(this.f2187l, i2, bundle);
    }

    public final boolean S(int i2) {
        int i3;
        if (!this.f2186k.isEnabled() || !this.f2186k.isTouchExplorationEnabled() || (i3 = this.f2189n) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            n(i3);
        }
        this.f2189n = i2;
        this.f2187l.invalidate();
        U(i2, 32768);
        return true;
    }

    public final boolean T(int i2) {
        int i3;
        if ((!this.f2187l.isFocused() && !this.f2187l.requestFocus()) || (i3 = this.f2190o) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f2190o = i2;
        O(i2, true);
        U(i2, 8);
        return true;
    }

    public final boolean U(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.f2186k.isEnabled() || (parent = this.f2187l.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f2187l, q(i2, i3));
    }

    public final void V(int i2) {
        int i3 = this.p;
        if (i3 == i2) {
            return;
        }
        this.p = i2;
        U(i2, 128);
        U(i3, 256);
    }

    @Override // a.i.r.a
    public a.i.r.g0.d b(View view) {
        if (this.f2188m == null) {
            this.f2188m = new c();
        }
        return this.f2188m;
    }

    @Override // a.i.r.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // a.i.r.a
    public void g(View view, a.i.r.g0.c cVar) {
        super.g(view, cVar);
        M(cVar);
    }

    public final boolean n(int i2) {
        if (this.f2189n != i2) {
            return false;
        }
        this.f2189n = Integer.MIN_VALUE;
        this.f2187l.invalidate();
        U(i2, 65536);
        return true;
    }

    public final boolean o(int i2) {
        if (this.f2190o != i2) {
            return false;
        }
        this.f2190o = Integer.MIN_VALUE;
        O(i2, false);
        U(i2, 8);
        return true;
    }

    public final boolean p() {
        int i2 = this.f2190o;
        return i2 != Integer.MIN_VALUE && J(i2, 16, null);
    }

    public final AccessibilityEvent q(int i2, int i3) {
        return i2 != -1 ? r(i2, i3) : s(i3);
    }

    public final AccessibilityEvent r(int i2, int i3) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
        a.i.r.g0.c cVarH = H(i2);
        accessibilityEventObtain.getText().add(cVarH.v());
        accessibilityEventObtain.setContentDescription(cVarH.q());
        accessibilityEventObtain.setScrollable(cVarH.H());
        accessibilityEventObtain.setPassword(cVarH.G());
        accessibilityEventObtain.setEnabled(cVarH.C());
        accessibilityEventObtain.setChecked(cVarH.A());
        L(i2, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(cVarH.o());
        e.c(accessibilityEventObtain, this.f2187l, i2);
        accessibilityEventObtain.setPackageName(this.f2187l.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent s(int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        this.f2187l.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    public final a.i.r.g0.c t(int i2) {
        a.i.r.g0.c cVarK = a.i.r.g0.c.K();
        cVarK.c0(true);
        cVarK.e0(true);
        cVarK.X("android.view.View");
        Rect rect = f2179d;
        cVarK.T(rect);
        cVarK.U(rect);
        cVarK.l0(this.f2187l);
        N(i2, cVarK);
        if (cVarK.v() == null && cVarK.q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        cVarK.l(this.f2183h);
        if (this.f2183h.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iJ = cVarK.j();
        if ((iJ & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iJ & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        cVarK.j0(this.f2187l.getContext().getPackageName());
        cVarK.r0(this.f2187l, i2);
        if (this.f2189n == i2) {
            cVarK.R(true);
            cVarK.a(128);
        } else {
            cVarK.R(false);
            cVarK.a(64);
        }
        boolean z = this.f2190o == i2;
        if (z) {
            cVarK.a(2);
        } else if (cVarK.D()) {
            cVarK.a(1);
        }
        cVarK.f0(z);
        this.f2187l.getLocationOnScreen(this.f2185j);
        cVarK.m(this.f2182g);
        if (this.f2182g.equals(rect)) {
            cVarK.l(this.f2182g);
            if (cVarK.f2050c != -1) {
                a.i.r.g0.c cVarK2 = a.i.r.g0.c.K();
                for (int i3 = cVarK.f2050c; i3 != -1; i3 = cVarK2.f2050c) {
                    cVarK2.m0(this.f2187l, -1);
                    cVarK2.T(f2179d);
                    N(i3, cVarK2);
                    cVarK2.l(this.f2183h);
                    Rect rect2 = this.f2182g;
                    Rect rect3 = this.f2183h;
                    rect2.offset(rect3.left, rect3.top);
                }
                cVarK2.O();
            }
            this.f2182g.offset(this.f2185j[0] - this.f2187l.getScrollX(), this.f2185j[1] - this.f2187l.getScrollY());
        }
        if (this.f2187l.getLocalVisibleRect(this.f2184i)) {
            this.f2184i.offset(this.f2185j[0] - this.f2187l.getScrollX(), this.f2185j[1] - this.f2187l.getScrollY());
            if (this.f2182g.intersect(this.f2184i)) {
                cVarK.U(this.f2182g);
                if (E(this.f2182g)) {
                    cVarK.v0(true);
                }
            }
        }
        return cVarK;
    }

    public final a.i.r.g0.c u() {
        a.i.r.g0.c cVarL = a.i.r.g0.c.L(this.f2187l);
        x.c0(this.f2187l, cVarL);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (cVarL.n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cVarL.c(this.f2187l, ((Integer) arrayList.get(i2)).intValue());
        }
        return cVarL;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f2186k.isEnabled() || !this.f2186k.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            return iB != Integer.MIN_VALUE;
        }
        if (action != 10 || this.p == Integer.MIN_VALUE) {
            return false;
        }
        V(Integer.MIN_VALUE);
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return G(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iF = F(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z = false;
                    while (i2 < repeatCount && G(iF, null)) {
                        i2++;
                        z = true;
                    }
                    return z;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    public final int x() {
        return this.f2189n;
    }

    public final j<a.i.r.g0.c> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        j<a.i.r.g0.c> jVar = new j<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jVar.k(arrayList.get(i2).intValue(), t(arrayList.get(i2).intValue()));
        }
        return jVar;
    }

    public final void z(int i2, Rect rect) {
        H(i2).l(rect);
    }
}

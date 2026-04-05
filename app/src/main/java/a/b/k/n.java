package a.b.k;

import a.b.k.a;
import a.b.p.b;
import a.b.p.j.g;
import a.b.q.a0;
import a.b.q.n0;
import a.i.r.b0;
import a.i.r.c0;
import a.i.r.d0;
import a.i.r.e0;
import a.i.r.x;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.amazonaws.services.s3.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class n extends a.b.k.a implements ActionBarOverlayLayout.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Interpolator f243a = new AccelerateInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Interpolator f244b = new DecelerateInterpolator();
    public a.b.p.h A;
    public boolean B;
    public boolean C;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Activity f247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarOverlayLayout f248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionBarContainer f249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ActionBarContextView f251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n0 f253k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d f257o;
    public a.b.p.b p;
    public b.a q;
    public boolean r;
    public boolean t;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<?> f254l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f255m = -1;
    public ArrayList<a.b> s = new ArrayList<>();
    public int u = 0;
    public boolean v = true;
    public boolean z = true;
    public final c0 D = new a();
    public final c0 E = new b();
    public final e0 F = new c();

    public class a extends d0 {
        public a() {
        }

        @Override // a.i.r.c0
        public void b(View view) {
            View view2;
            n nVar = n.this;
            if (nVar.v && (view2 = nVar.f252j) != null) {
                view2.setTranslationY(0.0f);
                n.this.f249g.setTranslationY(0.0f);
            }
            n.this.f249g.setVisibility(8);
            n.this.f249g.setTransitioning(false);
            n nVar2 = n.this;
            nVar2.A = null;
            nVar2.B();
            ActionBarOverlayLayout actionBarOverlayLayout = n.this.f248f;
            if (actionBarOverlayLayout != null) {
                x.m0(actionBarOverlayLayout);
            }
        }
    }

    public class b extends d0 {
        public b() {
        }

        @Override // a.i.r.c0
        public void b(View view) {
            n nVar = n.this;
            nVar.A = null;
            nVar.f249g.requestLayout();
        }
    }

    public class c implements e0 {
        public c() {
        }

        @Override // a.i.r.e0
        public void a(View view) {
            ((View) n.this.f249g.getParent()).invalidate();
        }
    }

    public class d extends a.b.p.b implements g.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a.b.p.j.g f262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b.a f263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public WeakReference<View> f264g;

        public d(Context context, b.a aVar) {
            this.f261d = context;
            this.f263f = aVar;
            a.b.p.j.g gVarS = new a.b.p.j.g(context).S(1);
            this.f262e = gVarS;
            gVarS.R(this);
        }

        @Override // a.b.p.j.g.a
        public boolean a(a.b.p.j.g gVar, MenuItem menuItem) {
            b.a aVar = this.f263f;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // a.b.p.j.g.a
        public void b(a.b.p.j.g gVar) {
            if (this.f263f == null) {
                return;
            }
            k();
            n.this.f251i.l();
        }

        @Override // a.b.p.b
        public void c() {
            n nVar = n.this;
            if (nVar.f257o != this) {
                return;
            }
            if (n.A(nVar.w, nVar.x, false)) {
                this.f263f.a(this);
            } else {
                n nVar2 = n.this;
                nVar2.p = this;
                nVar2.q = this.f263f;
            }
            this.f263f = null;
            n.this.z(false);
            n.this.f251i.g();
            n.this.f250h.t().sendAccessibilityEvent(32);
            n nVar3 = n.this;
            nVar3.f248f.setHideOnContentScrollEnabled(nVar3.C);
            n.this.f257o = null;
        }

        @Override // a.b.p.b
        public View d() {
            WeakReference<View> weakReference = this.f264g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // a.b.p.b
        public Menu e() {
            return this.f262e;
        }

        @Override // a.b.p.b
        public MenuInflater f() {
            return new a.b.p.g(this.f261d);
        }

        @Override // a.b.p.b
        public CharSequence g() {
            return n.this.f251i.getSubtitle();
        }

        @Override // a.b.p.b
        public CharSequence i() {
            return n.this.f251i.getTitle();
        }

        @Override // a.b.p.b
        public void k() {
            if (n.this.f257o != this) {
                return;
            }
            this.f262e.d0();
            try {
                this.f263f.c(this, this.f262e);
            } finally {
                this.f262e.c0();
            }
        }

        @Override // a.b.p.b
        public boolean l() {
            return n.this.f251i.j();
        }

        @Override // a.b.p.b
        public void m(View view) {
            n.this.f251i.setCustomView(view);
            this.f264g = new WeakReference<>(view);
        }

        @Override // a.b.p.b
        public void n(int i2) {
            o(n.this.f245c.getResources().getString(i2));
        }

        @Override // a.b.p.b
        public void o(CharSequence charSequence) {
            n.this.f251i.setSubtitle(charSequence);
        }

        @Override // a.b.p.b
        public void q(int i2) {
            r(n.this.f245c.getResources().getString(i2));
        }

        @Override // a.b.p.b
        public void r(CharSequence charSequence) {
            n.this.f251i.setTitle(charSequence);
        }

        @Override // a.b.p.b
        public void s(boolean z) {
            super.s(z);
            n.this.f251i.setTitleOptional(z);
        }

        public boolean t() {
            this.f262e.d0();
            try {
                return this.f263f.b(this, this.f262e);
            } finally {
                this.f262e.c0();
            }
        }
    }

    public n(Activity activity, boolean z) {
        this.f247e = activity;
        View decorView = activity.getWindow().getDecorView();
        H(decorView);
        if (z) {
            return;
        }
        this.f252j = decorView.findViewById(R.id.content);
    }

    public n(Dialog dialog) {
        H(dialog.getWindow().getDecorView());
    }

    public static boolean A(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    public void B() {
        b.a aVar = this.q;
        if (aVar != null) {
            aVar.a(this.p);
            this.p = null;
            this.q = null;
        }
    }

    public void C(boolean z) {
        View view;
        a.b.p.h hVar = this.A;
        if (hVar != null) {
            hVar.a();
        }
        if (this.u != 0 || (!this.B && !z)) {
            this.D.b(null);
            return;
        }
        this.f249g.setAlpha(1.0f);
        this.f249g.setTransitioning(true);
        a.b.p.h hVar2 = new a.b.p.h();
        float f2 = -this.f249g.getHeight();
        if (z) {
            this.f249g.getLocationInWindow(new int[]{0, 0});
            f2 -= r5[1];
        }
        b0 b0VarM = x.d(this.f249g).m(f2);
        b0VarM.k(this.F);
        hVar2.c(b0VarM);
        if (this.v && (view = this.f252j) != null) {
            hVar2.c(x.d(view).m(f2));
        }
        hVar2.f(f243a);
        hVar2.e(250L);
        hVar2.g(this.D);
        this.A = hVar2;
        hVar2.h();
    }

    public void D(boolean z) {
        View view;
        View view2;
        a.b.p.h hVar = this.A;
        if (hVar != null) {
            hVar.a();
        }
        this.f249g.setVisibility(0);
        if (this.u == 0 && (this.B || z)) {
            this.f249g.setTranslationY(0.0f);
            float f2 = -this.f249g.getHeight();
            if (z) {
                this.f249g.getLocationInWindow(new int[]{0, 0});
                f2 -= r5[1];
            }
            this.f249g.setTranslationY(f2);
            a.b.p.h hVar2 = new a.b.p.h();
            b0 b0VarM = x.d(this.f249g).m(0.0f);
            b0VarM.k(this.F);
            hVar2.c(b0VarM);
            if (this.v && (view2 = this.f252j) != null) {
                view2.setTranslationY(f2);
                hVar2.c(x.d(this.f252j).m(0.0f));
            }
            hVar2.f(f244b);
            hVar2.e(250L);
            hVar2.g(this.E);
            this.A = hVar2;
            hVar2.h();
        } else {
            this.f249g.setAlpha(1.0f);
            this.f249g.setTranslationY(0.0f);
            if (this.v && (view = this.f252j) != null) {
                view.setTranslationY(0.0f);
            }
            this.E.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f248f;
        if (actionBarOverlayLayout != null) {
            x.m0(actionBarOverlayLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a0 E(View view) {
        if (view instanceof a0) {
            return (a0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : Constants.NULL_VERSION_ID);
        throw new IllegalStateException(sb.toString());
    }

    public int F() {
        return this.f250h.o();
    }

    public final void G() {
        if (this.y) {
            this.y = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f248f;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            P(false);
        }
    }

    public final void H(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(a.b.f.p);
        this.f248f = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f250h = E(view.findViewById(a.b.f.f71a));
        this.f251i = (ActionBarContextView) view.findViewById(a.b.f.f76f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(a.b.f.f73c);
        this.f249g = actionBarContainer;
        a0 a0Var = this.f250h;
        if (a0Var == null || this.f251i == null || actionBarContainer == null) {
            throw new IllegalStateException(n.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f245c = a0Var.v();
        boolean z = (this.f250h.w() & 4) != 0;
        if (z) {
            this.f256n = true;
        }
        a.b.p.a aVarB = a.b.p.a.b(this.f245c);
        M(aVarB.a() || z);
        K(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f245c.obtainStyledAttributes(null, a.b.j.f120a, a.b.a.f19c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(a.b.j.f130k, false)) {
            L(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.b.j.f128i, 0);
        if (dimensionPixelSize != 0) {
            J(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void I(int i2, int i3) {
        int iW = this.f250h.w();
        if ((i3 & 4) != 0) {
            this.f256n = true;
        }
        this.f250h.k((i2 & i3) | ((i3 ^ (-1)) & iW));
    }

    public void J(float f2) {
        x.w0(this.f249g, f2);
    }

    public final void K(boolean z) {
        this.t = z;
        if (z) {
            this.f249g.setTabContainer(null);
            this.f250h.i(this.f253k);
        } else {
            this.f250h.i(null);
            this.f249g.setTabContainer(this.f253k);
        }
        boolean z2 = F() == 2;
        n0 n0Var = this.f253k;
        if (n0Var != null) {
            if (z2) {
                n0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f248f;
                if (actionBarOverlayLayout != null) {
                    x.m0(actionBarOverlayLayout);
                }
            } else {
                n0Var.setVisibility(8);
            }
        }
        this.f250h.z(!this.t && z2);
        this.f248f.setHasNonEmbeddedTabs(!this.t && z2);
    }

    public void L(boolean z) {
        if (z && !this.f248f.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.C = z;
        this.f248f.setHideOnContentScrollEnabled(z);
    }

    public void M(boolean z) {
        this.f250h.u(z);
    }

    public final boolean N() {
        return x.U(this.f249g);
    }

    public final void O() {
        if (this.y) {
            return;
        }
        this.y = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f248f;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        P(false);
    }

    public final void P(boolean z) {
        if (A(this.w, this.x, this.y)) {
            if (this.z) {
                return;
            }
            this.z = true;
            D(z);
            return;
        }
        if (this.z) {
            this.z = false;
            C(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.x) {
            this.x = false;
            P(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.x) {
            return;
        }
        this.x = true;
        P(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        a.b.p.h hVar = this.A;
        if (hVar != null) {
            hVar.a();
            this.A = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f(int i2) {
        this.u = i2;
    }

    @Override // a.b.k.a
    public boolean h() {
        a0 a0Var = this.f250h;
        if (a0Var == null || !a0Var.j()) {
            return false;
        }
        this.f250h.collapseActionView();
        return true;
    }

    @Override // a.b.k.a
    public void i(boolean z) {
        if (z == this.r) {
            return;
        }
        this.r = z;
        int size = this.s.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.s.get(i2).a(z);
        }
    }

    @Override // a.b.k.a
    public int j() {
        return this.f250h.w();
    }

    @Override // a.b.k.a
    public Context k() {
        if (this.f246d == null) {
            TypedValue typedValue = new TypedValue();
            this.f245c.getTheme().resolveAttribute(a.b.a.f23g, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f246d = new ContextThemeWrapper(this.f245c, i2);
            } else {
                this.f246d = this.f245c;
            }
        }
        return this.f246d;
    }

    @Override // a.b.k.a
    public void m(Configuration configuration) {
        K(a.b.p.a.b(this.f245c).g());
    }

    @Override // a.b.k.a
    public boolean o(int i2, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f257o;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i2, keyEvent, 0);
    }

    @Override // a.b.k.a
    public void r(boolean z) {
        if (this.f256n) {
            return;
        }
        s(z);
    }

    @Override // a.b.k.a
    public void s(boolean z) {
        I(z ? 4 : 0, 4);
    }

    @Override // a.b.k.a
    public void t(int i2) {
        this.f250h.q(i2);
    }

    @Override // a.b.k.a
    public void u(boolean z) {
        a.b.p.h hVar;
        this.B = z;
        if (z || (hVar = this.A) == null) {
            return;
        }
        hVar.a();
    }

    @Override // a.b.k.a
    public void v(CharSequence charSequence) {
        this.f250h.l(charSequence);
    }

    @Override // a.b.k.a
    public void w(CharSequence charSequence) {
        this.f250h.setTitle(charSequence);
    }

    @Override // a.b.k.a
    public void x(CharSequence charSequence) {
        this.f250h.setWindowTitle(charSequence);
    }

    @Override // a.b.k.a
    public a.b.p.b y(b.a aVar) {
        d dVar = this.f257o;
        if (dVar != null) {
            dVar.c();
        }
        this.f248f.setHideOnContentScrollEnabled(false);
        this.f251i.k();
        d dVar2 = new d(this.f251i.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f257o = dVar2;
        dVar2.k();
        this.f251i.h(dVar2);
        z(true);
        this.f251i.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void z(boolean z) {
        b0 b0VarP;
        b0 b0VarF;
        if (z) {
            O();
        } else {
            G();
        }
        if (!N()) {
            if (z) {
                this.f250h.s(4);
                this.f251i.setVisibility(0);
                return;
            } else {
                this.f250h.s(0);
                this.f251i.setVisibility(8);
                return;
            }
        }
        if (z) {
            b0VarF = this.f250h.p(4, 100L);
            b0VarP = this.f251i.f(0, 200L);
        } else {
            b0VarP = this.f250h.p(0, 200L);
            b0VarF = this.f251i.f(8, 100L);
        }
        a.b.p.h hVar = new a.b.p.h();
        hVar.d(b0VarF, b0VarP);
        hVar.h();
    }
}

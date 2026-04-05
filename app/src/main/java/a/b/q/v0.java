package a.b.q;

import a.b.p.j.g;
import a.b.p.j.m;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public class v0 implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Window.Callback f801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f804o;
    public int p;
    public Drawable q;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a.b.p.j.a f805b;

        public a() {
            this.f805b = new a.b.p.j.a(v0.this.f790a.getContext(), 0, R.id.home, 0, 0, v0.this.f798i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v0 v0Var = v0.this;
            Window.Callback callback = v0Var.f801l;
            if (callback == null || !v0Var.f802m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f805b);
        }
    }

    public class b extends a.i.r.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f807a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f808b;

        public b(int i2) {
            this.f808b = i2;
        }

        @Override // a.i.r.d0, a.i.r.c0
        public void a(View view) {
            this.f807a = true;
        }

        @Override // a.i.r.c0
        public void b(View view) {
            if (this.f807a) {
                return;
            }
            v0.this.f790a.setVisibility(this.f808b);
        }

        @Override // a.i.r.d0, a.i.r.c0
        public void c(View view) {
            v0.this.f790a.setVisibility(0);
        }
    }

    public v0(Toolbar toolbar, boolean z) {
        this(toolbar, z, a.b.h.f101a, a.b.e.f69n);
    }

    public v0(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.f804o = 0;
        this.p = 0;
        this.f790a = toolbar;
        this.f798i = toolbar.getTitle();
        this.f799j = toolbar.getSubtitle();
        this.f797h = this.f798i != null;
        this.f796g = toolbar.getNavigationIcon();
        u0 u0VarV = u0.v(toolbar.getContext(), null, a.b.j.f120a, a.b.a.f19c, 0);
        this.q = u0VarV.g(a.b.j.f131l);
        if (z) {
            CharSequence charSequenceP = u0VarV.p(a.b.j.r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = u0VarV.p(a.b.j.p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                l(charSequenceP2);
            }
            Drawable drawableG = u0VarV.g(a.b.j.f133n);
            if (drawableG != null) {
                D(drawableG);
            }
            Drawable drawableG2 = u0VarV.g(a.b.j.f132m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f796g == null && (drawable = this.q) != null) {
                G(drawable);
            }
            k(u0VarV.k(a.b.j.f127h, 0));
            int iN = u0VarV.n(a.b.j.f126g, 0);
            if (iN != 0) {
                B(LayoutInflater.from(this.f790a.getContext()).inflate(iN, (ViewGroup) this.f790a, false));
                k(this.f791b | 16);
            }
            int iM = u0VarV.m(a.b.j.f129j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f790a.getLayoutParams();
                layoutParams.height = iM;
                this.f790a.setLayoutParams(layoutParams);
            }
            int iE = u0VarV.e(a.b.j.f125f, -1);
            int iE2 = u0VarV.e(a.b.j.f124e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f790a.H(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = u0VarV.n(a.b.j.s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f790a;
                toolbar2.L(toolbar2.getContext(), iN2);
            }
            int iN3 = u0VarV.n(a.b.j.q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f790a;
                toolbar3.K(toolbar3.getContext(), iN3);
            }
            int iN4 = u0VarV.n(a.b.j.f134o, 0);
            if (iN4 != 0) {
                this.f790a.setPopupTheme(iN4);
            }
        } else {
            this.f791b = A();
        }
        u0VarV.w();
        C(i2);
        this.f800k = this.f790a.getNavigationContentDescription();
        this.f790a.setNavigationOnClickListener(new a());
    }

    public final int A() {
        if (this.f790a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.f790a.getNavigationIcon();
        return 15;
    }

    public void B(View view) {
        View view2 = this.f793d;
        if (view2 != null && (this.f791b & 16) != 0) {
            this.f790a.removeView(view2);
        }
        this.f793d = view;
        if (view == null || (this.f791b & 16) == 0) {
            return;
        }
        this.f790a.addView(view);
    }

    public void C(int i2) {
        if (i2 == this.p) {
            return;
        }
        this.p = i2;
        if (TextUtils.isEmpty(this.f790a.getNavigationContentDescription())) {
            E(this.p);
        }
    }

    public void D(Drawable drawable) {
        this.f795f = drawable;
        K();
    }

    public void E(int i2) {
        F(i2 == 0 ? null : v().getString(i2));
    }

    public void F(CharSequence charSequence) {
        this.f800k = charSequence;
        I();
    }

    public void G(Drawable drawable) {
        this.f796g = drawable;
        J();
    }

    public final void H(CharSequence charSequence) {
        this.f798i = charSequence;
        if ((this.f791b & 8) != 0) {
            this.f790a.setTitle(charSequence);
        }
    }

    public final void I() {
        if ((this.f791b & 4) != 0) {
            if (TextUtils.isEmpty(this.f800k)) {
                this.f790a.setNavigationContentDescription(this.p);
            } else {
                this.f790a.setNavigationContentDescription(this.f800k);
            }
        }
    }

    public final void J() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f791b & 4) != 0) {
            toolbar = this.f790a;
            drawable = this.f796g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.f790a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void K() {
        Drawable drawable;
        int i2 = this.f791b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f795f) == null) {
            drawable = this.f794e;
        }
        this.f790a.setLogo(drawable);
    }

    @Override // a.b.q.a0
    public void a(Menu menu, m.a aVar) {
        if (this.f803n == null) {
            c cVar = new c(this.f790a.getContext());
            this.f803n = cVar;
            cVar.p(a.b.f.f77g);
        }
        this.f803n.g(aVar);
        this.f790a.I((a.b.p.j.g) menu, this.f803n);
    }

    @Override // a.b.q.a0
    public boolean b() {
        return this.f790a.A();
    }

    @Override // a.b.q.a0
    public void c() {
        this.f802m = true;
    }

    @Override // a.b.q.a0
    public void collapseActionView() {
        this.f790a.e();
    }

    @Override // a.b.q.a0
    public boolean d() {
        return this.f790a.d();
    }

    @Override // a.b.q.a0
    public boolean e() {
        return this.f790a.z();
    }

    @Override // a.b.q.a0
    public boolean f() {
        return this.f790a.w();
    }

    @Override // a.b.q.a0
    public boolean g() {
        return this.f790a.O();
    }

    @Override // a.b.q.a0
    public CharSequence getTitle() {
        return this.f790a.getTitle();
    }

    @Override // a.b.q.a0
    public void h() {
        this.f790a.f();
    }

    @Override // a.b.q.a0
    public void i(n0 n0Var) {
        View view = this.f792c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f790a;
            if (parent == toolbar) {
                toolbar.removeView(this.f792c);
            }
        }
        this.f792c = n0Var;
        if (n0Var == null || this.f804o != 2) {
            return;
        }
        this.f790a.addView(n0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f792c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f135a = 8388691;
        n0Var.setAllowCollapse(true);
    }

    @Override // a.b.q.a0
    public boolean j() {
        return this.f790a.v();
    }

    @Override // a.b.q.a0
    public void k(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.f791b ^ i2;
        this.f791b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    I();
                }
                J();
            }
            if ((i3 & 3) != 0) {
                K();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f790a.setTitle(this.f798i);
                    toolbar = this.f790a;
                    charSequence = this.f799j;
                } else {
                    charSequence = null;
                    this.f790a.setTitle((CharSequence) null);
                    toolbar = this.f790a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) == 0 || (view = this.f793d) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.f790a.addView(view);
            } else {
                this.f790a.removeView(view);
            }
        }
    }

    @Override // a.b.q.a0
    public void l(CharSequence charSequence) {
        this.f799j = charSequence;
        if ((this.f791b & 8) != 0) {
            this.f790a.setSubtitle(charSequence);
        }
    }

    @Override // a.b.q.a0
    public Menu m() {
        return this.f790a.getMenu();
    }

    @Override // a.b.q.a0
    public void n(int i2) {
        D(i2 != 0 ? a.b.l.a.a.d(v(), i2) : null);
    }

    @Override // a.b.q.a0
    public int o() {
        return this.f804o;
    }

    @Override // a.b.q.a0
    public a.i.r.b0 p(int i2, long j2) {
        return a.i.r.x.d(this.f790a).a(i2 == 0 ? 1.0f : 0.0f).f(j2).h(new b(i2));
    }

    @Override // a.b.q.a0
    public void q(int i2) {
        G(i2 != 0 ? a.b.l.a.a.d(v(), i2) : null);
    }

    @Override // a.b.q.a0
    public void r(m.a aVar, g.a aVar2) {
        this.f790a.J(aVar, aVar2);
    }

    @Override // a.b.q.a0
    public void s(int i2) {
        this.f790a.setVisibility(i2);
    }

    @Override // a.b.q.a0
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? a.b.l.a.a.d(v(), i2) : null);
    }

    @Override // a.b.q.a0
    public void setIcon(Drawable drawable) {
        this.f794e = drawable;
        K();
    }

    @Override // a.b.q.a0
    public void setTitle(CharSequence charSequence) {
        this.f797h = true;
        H(charSequence);
    }

    @Override // a.b.q.a0
    public void setWindowCallback(Window.Callback callback) {
        this.f801l = callback;
    }

    @Override // a.b.q.a0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f797h) {
            return;
        }
        H(charSequence);
    }

    @Override // a.b.q.a0
    public ViewGroup t() {
        return this.f790a;
    }

    @Override // a.b.q.a0
    public void u(boolean z) {
    }

    @Override // a.b.q.a0
    public Context v() {
        return this.f790a.getContext();
    }

    @Override // a.b.q.a0
    public int w() {
        return this.f791b;
    }

    @Override // a.b.q.a0
    public void x() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // a.b.q.a0
    public void y() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // a.b.q.a0
    public void z(boolean z) {
        this.f790a.setCollapsible(z);
    }
}

package a.n.q;

import a.n.q.h0;
import a.n.q.o0;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f2878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2880d;

    public static class a extends h0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f2881c;

        public a(n0 n0Var, b bVar) {
            super(n0Var);
            n0Var.b(bVar.f2823a);
            o0.a aVar = bVar.f2883d;
            if (aVar != null) {
                n0Var.a(aVar.f2823a);
            }
            this.f2881c = bVar;
            bVar.f2882c = this;
        }
    }

    public static class b extends h0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f2882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public o0.a f2883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public m0 f2884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f2885f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2886g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f2887h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f2888i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f2889j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f2890k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final a.n.n.a f2891l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public View.OnKeyListener f2892m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public d f2893n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public c f2894o;

        public b(View view) {
            super(view);
            this.f2886g = 0;
            this.f2890k = 0.0f;
            this.f2891l = a.n.n.a.a(view.getContext());
        }

        public final o0.a b() {
            return this.f2883d;
        }

        public final c c() {
            return this.f2894o;
        }

        public final d d() {
            return this.f2893n;
        }

        public View.OnKeyListener e() {
            return this.f2892m;
        }

        public final m0 f() {
            return this.f2884e;
        }

        public final Object g() {
            return this.f2885f;
        }

        public final boolean h() {
            return this.f2888i;
        }

        public final boolean i() {
            return this.f2887h;
        }

        public final void j(boolean z) {
            this.f2886g = z ? 1 : 2;
        }

        public final void k(c cVar) {
            this.f2894o = cVar;
        }

        public final void l(d dVar) {
            this.f2893n = dVar;
        }

        public final void m(View view) {
            int i2 = this.f2886g;
            if (i2 == 1) {
                view.setActivated(true);
            } else if (i2 == 2) {
                view.setActivated(false);
            }
        }
    }

    public p0() {
        o0 o0Var = new o0();
        this.f2878b = o0Var;
        this.f2879c = true;
        this.f2880d = 1;
        o0Var.l(true);
    }

    public void A(b bVar) {
        o0.a aVar = bVar.f2883d;
        if (aVar != null) {
            this.f2878b.f(aVar);
        }
        bVar.f2884e = null;
        bVar.f2885f = null;
    }

    public void B(b bVar, boolean z) {
        o0.a aVar = bVar.f2883d;
        if (aVar == null || aVar.f2823a.getVisibility() == 8) {
            return;
        }
        bVar.f2883d.f2823a.setVisibility(z ? 0 : 4);
    }

    public final void C(h0.a aVar, boolean z) {
        b bVarM = m(aVar);
        bVarM.f2888i = z;
        x(bVarM, z);
    }

    public final void D(h0.a aVar, boolean z) {
        b bVarM = m(aVar);
        bVarM.f2887h = z;
        y(bVarM, z);
    }

    public final void E(h0.a aVar, float f2) {
        b bVarM = m(aVar);
        bVarM.f2890k = f2;
        z(bVarM);
    }

    public final void F(b bVar, View view) {
        boolean zH;
        int i2 = this.f2880d;
        if (i2 == 1) {
            zH = bVar.h();
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    bVar.j(bVar.h() && bVar.i());
                }
                bVar.m(view);
            }
            zH = bVar.i();
        }
        bVar.j(zH);
        bVar.m(view);
    }

    public final void G(b bVar) {
        if (this.f2878b == null || bVar.f2883d == null) {
            return;
        }
        ((n0) bVar.f2882c.f2823a).d(bVar.h());
    }

    @Override // a.n.q.h0
    public final void c(h0.a aVar, Object obj) {
        u(m(aVar), obj);
    }

    @Override // a.n.q.h0
    public final h0.a e(ViewGroup viewGroup) {
        h0.a aVar;
        b bVarI = i(viewGroup);
        bVarI.f2889j = false;
        if (t()) {
            n0 n0Var = new n0(viewGroup.getContext());
            o0 o0Var = this.f2878b;
            if (o0Var != null) {
                bVarI.f2883d = (o0.a) o0Var.e((ViewGroup) bVarI.f2823a);
            }
            aVar = new a(n0Var, bVarI);
        } else {
            aVar = bVarI;
        }
        p(bVarI);
        if (bVarI.f2889j) {
            return aVar;
        }
        throw new RuntimeException("super.initializeRowViewHolder() must be called");
    }

    @Override // a.n.q.h0
    public final void f(h0.a aVar) {
        A(m(aVar));
    }

    @Override // a.n.q.h0
    public final void g(h0.a aVar) {
        v(m(aVar));
    }

    @Override // a.n.q.h0
    public final void h(h0.a aVar) {
        w(m(aVar));
    }

    public abstract b i(ViewGroup viewGroup);

    public void j(b bVar, boolean z) {
        d dVar;
        if (!z || (dVar = bVar.f2893n) == null) {
            return;
        }
        dVar.a(null, null, bVar, bVar.g());
    }

    public void k(b bVar, boolean z) {
    }

    public final o0 l() {
        return this.f2878b;
    }

    public final b m(h0.a aVar) {
        return aVar instanceof a ? ((a) aVar).f2881c : (b) aVar;
    }

    public final boolean n() {
        return this.f2879c;
    }

    public final float o(h0.a aVar) {
        return m(aVar).f2890k;
    }

    public void p(b bVar) {
        bVar.f2889j = true;
        if (q()) {
            return;
        }
        View view = bVar.f2823a;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        a aVar = bVar.f2882c;
        if (aVar != null) {
            ((ViewGroup) aVar.f2823a).setClipChildren(false);
        }
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return true;
    }

    public final boolean s() {
        return r() && n();
    }

    public final boolean t() {
        return this.f2878b != null || s();
    }

    public void u(b bVar, Object obj) {
        bVar.f2885f = obj;
        bVar.f2884e = obj instanceof m0 ? (m0) obj : null;
        if (bVar.f2883d == null || bVar.f() == null) {
            return;
        }
        this.f2878b.c(bVar.f2883d, obj);
    }

    public void v(b bVar) {
        o0.a aVar = bVar.f2883d;
        if (aVar != null) {
            this.f2878b.g(aVar);
        }
    }

    public void w(b bVar) {
        o0.a aVar = bVar.f2883d;
        if (aVar != null) {
            this.f2878b.h(aVar);
        }
        h0.b(bVar.f2823a);
    }

    public void x(b bVar, boolean z) {
        G(bVar);
        F(bVar, bVar.f2823a);
    }

    public void y(b bVar, boolean z) {
        j(bVar, z);
        G(bVar);
        F(bVar, bVar.f2823a);
    }

    public void z(b bVar) {
        if (n()) {
            bVar.f2891l.c(bVar.f2890k);
            o0.a aVar = bVar.f2883d;
            if (aVar != null) {
                this.f2878b.m(aVar, bVar.f2890k);
            }
            if (r()) {
                ((n0) bVar.f2882c.f2823a).c(bVar.f2891l.b().getColor());
            }
        }
    }
}

package a.n.q;

import a.n.q.b;
import a.n.q.h0;
import a.n.q.o0;
import a.n.q.p0;
import a.n.q.s;
import a.n.q.t0;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.HorizontalGridView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class v extends p0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f2950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f2951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f2952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2955j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i0 f2956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2959n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2960o;
    public boolean p;
    public boolean q;
    public HashMap<h0, Integer> r;
    public t0 s;
    public s.e t;

    public class a implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f2961a;

        public a(d dVar) {
            this.f2961a = dVar;
        }

        @Override // a.n.q.a0
        public void a(ViewGroup viewGroup, View view, int i2, long j2) {
            v.this.W(this.f2961a, view, true);
        }
    }

    public class b implements b.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f2963a;

        public b(d dVar) {
            this.f2963a = dVar;
        }

        @Override // a.n.q.b.e
        public boolean a(KeyEvent keyEvent) {
            return this.f2963a.e() != null && this.f2963a.e().onKey(this.f2963a.f2823a, keyEvent.getKeyCode(), keyEvent);
        }
    }

    public class c extends s {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public d f2965l;

        public class a implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s.d f2967b;

            public a(s.d dVar) {
                this.f2967b = dVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                s.d dVar = (s.d) c.this.f2965l.q.i0(this.f2967b.f4855b);
                if (c.this.f2965l.c() != null) {
                    a.n.q.c cVarC = c.this.f2965l.c();
                    h0.a aVar = this.f2967b.v;
                    Object obj = dVar.x;
                    d dVar2 = c.this.f2965l;
                    cVarC.a(aVar, obj, dVar2, (u) dVar2.f2884e);
                }
            }
        }

        public c(d dVar) {
            this.f2965l = dVar;
        }

        @Override // a.n.q.s
        public void c0(h0 h0Var, int i2) {
            this.f2965l.o().getRecycledViewPool().k(i2, v.this.L(h0Var));
        }

        @Override // a.n.q.s
        public void e0(s.d dVar) {
            v.this.H(this.f2965l, dVar.f4855b);
            this.f2965l.m(dVar.f4855b);
        }

        @Override // a.n.q.s
        public void g0(s.d dVar) {
            if (this.f2965l.c() != null) {
                dVar.v.f2823a.setOnClickListener(new a(dVar));
            }
        }

        @Override // a.n.q.s
        public void h0(s.d dVar) {
            View view = dVar.f4855b;
            if (view instanceof ViewGroup) {
                a.n.p.a.a((ViewGroup) view, true);
            }
            t0 t0Var = v.this.s;
            if (t0Var != null) {
                t0Var.f(dVar.f4855b);
            }
        }

        @Override // a.n.q.s
        public void l0(s.d dVar) {
            if (this.f2965l.c() != null) {
                dVar.v.f2823a.setOnClickListener(null);
            }
        }
    }

    public static class d extends p0.b {
        public final v p;
        public final HorizontalGridView q;
        public s r;
        public final n s;
        public final int t;
        public final int u;
        public final int v;
        public final int w;

        public d(View view, HorizontalGridView horizontalGridView, v vVar) {
            super(view);
            this.s = new n();
            this.q = horizontalGridView;
            this.p = vVar;
            this.t = horizontalGridView.getPaddingTop();
            this.u = horizontalGridView.getPaddingBottom();
            this.v = horizontalGridView.getPaddingLeft();
            this.w = horizontalGridView.getPaddingRight();
        }

        public final s n() {
            return this.r;
        }

        public final HorizontalGridView o() {
            return this.q;
        }
    }

    public v() {
        this(2);
    }

    public v(int i2) {
        this(i2, false);
    }

    public v(int i2, boolean z) {
        this.f2953h = 1;
        this.f2959n = true;
        this.f2960o = -1;
        this.p = true;
        this.q = true;
        this.r = new HashMap<>();
        if (!h.b(i2)) {
            throw new IllegalArgumentException("Unhandled zoom factor");
        }
        this.f2957l = i2;
        this.f2958m = z;
    }

    public static void P(Context context) {
        if (f2950e == 0) {
            f2950e = context.getResources().getDimensionPixelSize(a.n.c.f2582c);
            f2951f = context.getResources().getDimensionPixelSize(a.n.c.f2581b);
            f2952g = context.getResources().getDimensionPixelSize(a.n.c.f2580a);
        }
    }

    @Override // a.n.q.p0
    public void A(p0.b bVar) {
        d dVar = (d) bVar;
        dVar.q.setAdapter(null);
        dVar.r.W();
        super.A(bVar);
    }

    @Override // a.n.q.p0
    public void B(p0.b bVar, boolean z) {
        super.B(bVar, z);
        ((d) bVar).q.setChildrenVisibility(z ? 0 : 4);
    }

    public void H(d dVar, View view) {
        t0 t0Var = this.s;
        if (t0Var == null || !t0Var.d()) {
            return;
        }
        this.s.j(view, dVar.f2891l.b().getColor());
    }

    public final boolean I() {
        return this.p;
    }

    public t0.b J() {
        return t0.b.f2943a;
    }

    public int K() {
        int i2 = this.f2955j;
        return i2 != 0 ? i2 : this.f2954i;
    }

    public int L(h0 h0Var) {
        if (this.r.containsKey(h0Var)) {
            return this.r.get(h0Var).intValue();
        }
        return 24;
    }

    public int M() {
        return this.f2954i;
    }

    public final boolean N() {
        return this.f2959n;
    }

    public final int O(d dVar) {
        o0.a aVarB = dVar.b();
        if (aVarB != null) {
            return l() != null ? l().j(aVarB) : aVarB.f2823a.getPaddingBottom();
        }
        return 0;
    }

    public boolean Q() {
        return true;
    }

    public boolean R() {
        return t0.q();
    }

    public boolean S(Context context) {
        return !a.n.o.a.c(context).d();
    }

    public boolean T(Context context) {
        return !a.n.o.a.c(context).f();
    }

    public final boolean U() {
        return Q() && n();
    }

    public final boolean V() {
        return R() && N();
    }

    public void W(d dVar, View view, boolean z) {
        if (view == null) {
            if (this.f2956k != null) {
                dVar.s.j();
            }
            if (!z || dVar.d() == null) {
                return;
            }
            dVar.d().a(null, null, dVar, dVar.f2884e);
            return;
        }
        if (dVar.f2887h) {
            s.d dVar2 = (s.d) dVar.q.i0(view);
            if (this.f2956k != null) {
                dVar.s.k(dVar.q, view, dVar2.x);
            }
            if (!z || dVar.d() == null) {
                return;
            }
            dVar.d().a(dVar2.v, dVar2.x, dVar, dVar.f2884e);
        }
    }

    public final void X(d dVar) {
        int iO;
        int i2;
        if (dVar.h()) {
            iO = (dVar.i() ? f2951f : dVar.t) - O(dVar);
            i2 = this.f2956k == null ? f2952g : dVar.u;
        } else if (dVar.i()) {
            i2 = f2950e;
            iO = i2 - dVar.u;
        } else {
            iO = 0;
        }
        dVar.o().setPadding(dVar.v, iO, dVar.w, i2);
    }

    public final void Y(w wVar) {
        HorizontalGridView gridView = wVar.getGridView();
        if (this.f2960o < 0) {
            TypedArray typedArrayObtainStyledAttributes = gridView.getContext().obtainStyledAttributes(a.n.l.f2664k);
            this.f2960o = (int) typedArrayObtainStyledAttributes.getDimension(a.n.l.f2665l, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        gridView.setFadingLeftEdgeLength(this.f2960o);
    }

    public final void Z(d dVar) {
        if (!dVar.f2888i || !dVar.f2887h) {
            if (this.f2956k != null) {
                dVar.s.j();
            }
        } else {
            i0 i0Var = this.f2956k;
            if (i0Var != null) {
                dVar.s.c((ViewGroup) dVar.f2823a, i0Var);
            }
            HorizontalGridView horizontalGridView = dVar.q;
            s.d dVar2 = (s.d) horizontalGridView.b0(horizontalGridView.getSelectedPosition());
            W(dVar, dVar2 == null ? null : dVar2.f4855b, false);
        }
    }

    @Override // a.n.q.p0
    public p0.b i(ViewGroup viewGroup) {
        P(viewGroup.getContext());
        w wVar = new w(viewGroup.getContext());
        Y(wVar);
        if (this.f2954i != 0) {
            wVar.getGridView().setRowHeight(this.f2954i);
        }
        return new d(wVar, wVar.getGridView(), this);
    }

    @Override // a.n.q.p0
    public void j(p0.b bVar, boolean z) {
        d dVar = (d) bVar;
        HorizontalGridView horizontalGridView = dVar.q;
        s.d dVar2 = (s.d) horizontalGridView.b0(horizontalGridView.getSelectedPosition());
        if (dVar2 == null) {
            super.j(bVar, z);
        } else {
            if (!z || bVar.d() == null) {
                return;
            }
            bVar.d().a(dVar2.T(), dVar2.x, dVar, dVar.f());
        }
    }

    @Override // a.n.q.p0
    public void k(p0.b bVar, boolean z) {
        d dVar = (d) bVar;
        dVar.q.setScrollEnabled(!z);
        dVar.q.setAnimateChildLayout(!z);
    }

    @Override // a.n.q.p0
    public void p(p0.b bVar) {
        super.p(bVar);
        d dVar = (d) bVar;
        Context context = bVar.f2823a.getContext();
        if (this.s == null) {
            t0 t0VarA = new t0.a().c(U()).e(V()).d(S(context) && I()).g(T(context)).b(this.q).f(J()).a(context);
            this.s = t0VarA;
            if (t0VarA.e()) {
                this.t = new t(this.s);
            }
        }
        c cVar = new c(dVar);
        dVar.r = cVar;
        cVar.r0(this.t);
        this.s.g(dVar.q);
        h.c(dVar.r, this.f2957l, this.f2958m);
        dVar.q.setFocusDrawingOrderEnabled(this.s.c() != 3);
        dVar.q.setOnChildSelectedListener(new a(dVar));
        dVar.q.setOnUnhandledKeyListener(new b(dVar));
        dVar.q.setNumRows(this.f2953h);
    }

    @Override // a.n.q.p0
    public final boolean r() {
        return false;
    }

    @Override // a.n.q.p0
    public void u(p0.b bVar, Object obj) {
        super.u(bVar, obj);
        d dVar = (d) bVar;
        u uVar = (u) obj;
        dVar.r.m0(uVar.b());
        dVar.q.setAdapter(dVar.r);
        dVar.q.setContentDescription(uVar.c());
    }

    @Override // a.n.q.p0
    public void x(p0.b bVar, boolean z) {
        super.x(bVar, z);
        d dVar = (d) bVar;
        if (M() != K()) {
            dVar.o().setRowHeight(z ? K() : M());
        }
        X(dVar);
        Z(dVar);
    }

    @Override // a.n.q.p0
    public void y(p0.b bVar, boolean z) {
        super.y(bVar, z);
        d dVar = (d) bVar;
        X(dVar);
        Z(dVar);
    }

    @Override // a.n.q.p0
    public void z(p0.b bVar) {
        super.z(bVar);
        d dVar = (d) bVar;
        int childCount = dVar.q.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            H(dVar, dVar.q.getChildAt(i2));
        }
    }
}

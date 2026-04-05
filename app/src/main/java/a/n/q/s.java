package a.n.q;

import a.n.q.h0;
import a.n.q.y;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class s extends RecyclerView.h implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f2907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f2908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i0 f2909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f2910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f2911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<h0> f2912j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y.b f2913k = new a();

    public class a extends y.b {
        public a() {
        }

        @Override // a.n.q.y.b
        public void a() {
            s.this.w();
        }
    }

    public static class b {
        public void a(h0 h0Var, int i2) {
            throw null;
        }

        public void b(d dVar) {
            throw null;
        }

        public void c(d dVar) {
            throw null;
        }

        public void d(d dVar, List list) {
            c(dVar);
        }

        public void e(d dVar) {
            throw null;
        }

        public void f(d dVar) {
            throw null;
        }

        public void g(d dVar) {
            throw null;
        }
    }

    public final class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View.OnFocusChangeListener f2915b;

        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (s.this.f2908f != null) {
                view = (View) view.getParent();
            }
            g gVar = s.this.f2910h;
            if (gVar != null) {
                gVar.a(view, z);
            }
            View.OnFocusChangeListener onFocusChangeListener = this.f2915b;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    public class d extends RecyclerView.e0 implements a.n.q.e {
        public final h0 u;
        public final h0.a v;
        public final c w;
        public Object x;
        public Object y;

        public d(h0 h0Var, View view, h0.a aVar) {
            super(view);
            this.w = s.this.new c();
            this.u = h0Var;
            this.v = aVar;
        }

        public final Object R() {
            return this.y;
        }

        public final h0 S() {
            return this.u;
        }

        public final h0.a T() {
            return this.v;
        }

        public void U(Object obj) {
            this.y = obj;
        }

        @Override // a.n.q.e
        public Object a(Class<?> cls) {
            return this.v.a(cls);
        }
    }

    public static abstract class e {
        public abstract View a(View view);

        public abstract void b(View view, View view2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void F(RecyclerView.e0 e0Var, int i2) {
        d dVar = (d) e0Var;
        Object objA = this.f2907e.a(i2);
        dVar.x = objA;
        dVar.u.c(dVar.v, objA);
        g0(dVar);
        b bVar = this.f2911i;
        if (bVar != null) {
            bVar.c(dVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void G(RecyclerView.e0 e0Var, int i2, List list) {
        d dVar = (d) e0Var;
        Object objA = this.f2907e.a(i2);
        dVar.x = objA;
        dVar.u.d(dVar.v, objA, list);
        g0(dVar);
        b bVar = this.f2911i;
        if (bVar != null) {
            bVar.d(dVar, list);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.e0 H(ViewGroup viewGroup, int i2) {
        h0.a aVarE;
        View viewA;
        h0 h0Var = this.f2912j.get(i2);
        e eVar = this.f2908f;
        if (eVar != null) {
            viewA = eVar.a(viewGroup);
            aVarE = h0Var.e(viewGroup);
            this.f2908f.b(viewA, aVarE.f2823a);
        } else {
            aVarE = h0Var.e(viewGroup);
            viewA = aVarE.f2823a;
        }
        d dVar = new d(h0Var, viewA, aVarE);
        h0(dVar);
        b bVar = this.f2911i;
        if (bVar != null) {
            bVar.e(dVar);
        }
        View view = dVar.v.f2823a;
        if (view != null) {
            dVar.w.f2915b = view.getOnFocusChangeListener();
            view.setOnFocusChangeListener(dVar.w);
        }
        g gVar = this.f2910h;
        if (gVar != null) {
            gVar.b(viewA);
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final boolean K(RecyclerView.e0 e0Var) {
        Q(e0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void N(RecyclerView.e0 e0Var) {
        d dVar = (d) e0Var;
        e0(dVar);
        b bVar = this.f2911i;
        if (bVar != null) {
            bVar.b(dVar);
        }
        dVar.u.g(dVar.v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void P(RecyclerView.e0 e0Var) {
        d dVar = (d) e0Var;
        dVar.u.h(dVar.v);
        i0(dVar);
        b bVar = this.f2911i;
        if (bVar != null) {
            bVar.f(dVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void Q(RecyclerView.e0 e0Var) {
        d dVar = (d) e0Var;
        dVar.u.f(dVar.v);
        l0(dVar);
        b bVar = this.f2911i;
        if (bVar != null) {
            bVar.g(dVar);
        }
        dVar.x = null;
    }

    public void W() {
        m0(null);
    }

    public ArrayList<h0> Z() {
        return this.f2912j;
    }

    public void c0(h0 h0Var, int i2) {
    }

    @Override // a.n.q.f
    public a.n.q.e d(int i2) {
        return this.f2912j.get(i2);
    }

    public void e0(d dVar) {
    }

    public void g0(d dVar) {
    }

    public void h0(d dVar) {
    }

    public void i0(d dVar) {
    }

    public void l0(d dVar) {
    }

    public void m0(y yVar) {
        y yVar2 = this.f2907e;
        if (yVar == yVar2) {
            return;
        }
        if (yVar2 != null) {
            yVar2.j(this.f2913k);
        }
        this.f2907e = yVar;
        if (yVar == null) {
            w();
            return;
        }
        yVar.g(this.f2913k);
        if (v() != this.f2907e.d()) {
            S(this.f2907e.d());
        }
        w();
    }

    public void n0(b bVar) {
        this.f2911i = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        y yVar = this.f2907e;
        if (yVar != null) {
            return yVar.i();
        }
        return 0;
    }

    public void o0(g gVar) {
        this.f2910h = gVar;
    }

    public void p0(i0 i0Var) {
        this.f2909g = i0Var;
        w();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long q(int i2) {
        return this.f2907e.b(i2);
    }

    public void q0(ArrayList<h0> arrayList) {
        this.f2912j = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        i0 i0VarC = this.f2909g;
        if (i0VarC == null) {
            i0VarC = this.f2907e.c();
        }
        h0 h0VarA = i0VarC.a(this.f2907e.a(i2));
        int iIndexOf = this.f2912j.indexOf(h0VarA);
        if (iIndexOf < 0) {
            this.f2912j.add(h0VarA);
            iIndexOf = this.f2912j.indexOf(h0VarA);
            c0(h0VarA, iIndexOf);
            b bVar = this.f2911i;
            if (bVar != null) {
                bVar.a(h0VarA, iIndexOf);
            }
        }
        return iIndexOf;
    }

    public void r0(e eVar) {
        this.f2908f = eVar;
    }
}

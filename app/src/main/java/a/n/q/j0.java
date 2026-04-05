package a.n.q;

import a.n.q.h0;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f2835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f2836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f2837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h0.a f2838d;

    public void a() {
        h0 h0Var = this.f2837c;
        if (h0Var != null) {
            h0Var.f(this.f2838d);
            this.f2835a.removeView(this.f2838d.f2823a);
            this.f2838d = null;
            this.f2837c = null;
        }
    }

    public final ViewGroup b() {
        return this.f2835a;
    }

    public void c(ViewGroup viewGroup, i0 i0Var) {
        a();
        this.f2835a = viewGroup;
        this.f2836b = i0Var;
    }

    public abstract void d(View view);

    public abstract void e(View view);

    public void f(Object obj) {
        i(obj);
        h(true);
    }

    public void g(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public final void h(boolean z) {
        h0.a aVar = this.f2838d;
        if (aVar != null) {
            g(aVar.f2823a, z);
        }
    }

    public final void i(Object obj) {
        h0 h0VarA = this.f2836b.a(obj);
        h0 h0Var = this.f2837c;
        if (h0VarA != h0Var) {
            h(false);
            a();
            this.f2837c = h0VarA;
            if (h0VarA == null) {
                return;
            }
            h0.a aVarE = h0VarA.e(this.f2835a);
            this.f2838d = aVarE;
            d(aVarE.f2823a);
        } else if (h0Var == null) {
            return;
        } else {
            h0Var.f(this.f2838d);
        }
        this.f2837c.c(this.f2838d, obj);
        e(this.f2838d.f2823a);
    }

    public void j() {
        h(false);
    }
}

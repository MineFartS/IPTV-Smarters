package a.y.e;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends RecyclerView.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3968g = true;

    public abstract boolean A(RecyclerView.e0 e0Var);

    public final void B(RecyclerView.e0 e0Var) {
        J(e0Var);
        h(e0Var);
    }

    public final void C(RecyclerView.e0 e0Var) {
        K(e0Var);
    }

    public final void D(RecyclerView.e0 e0Var, boolean z) {
        L(e0Var, z);
        h(e0Var);
    }

    public final void E(RecyclerView.e0 e0Var, boolean z) {
        M(e0Var, z);
    }

    public final void F(RecyclerView.e0 e0Var) {
        N(e0Var);
        h(e0Var);
    }

    public final void G(RecyclerView.e0 e0Var) {
        O(e0Var);
    }

    public final void H(RecyclerView.e0 e0Var) {
        P(e0Var);
        h(e0Var);
    }

    public final void I(RecyclerView.e0 e0Var) {
        Q(e0Var);
    }

    public void J(RecyclerView.e0 e0Var) {
    }

    public void K(RecyclerView.e0 e0Var) {
    }

    public void L(RecyclerView.e0 e0Var, boolean z) {
    }

    public void M(RecyclerView.e0 e0Var, boolean z) {
    }

    public void N(RecyclerView.e0 e0Var) {
    }

    public void O(RecyclerView.e0 e0Var) {
    }

    public void P(RecyclerView.e0 e0Var) {
    }

    public void Q(RecyclerView.e0 e0Var) {
    }

    public void R(boolean z) {
        this.f3968g = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i2;
        int i3;
        return (cVar == null || ((i2 = cVar.f4880a) == (i3 = cVar2.f4880a) && cVar.f4881b == cVar2.f4881b)) ? x(e0Var) : z(e0Var, i2, cVar.f4881b, i3, cVar2.f4881b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i2;
        int i3;
        int i4 = cVar.f4880a;
        int i5 = cVar.f4881b;
        if (e0Var2.O()) {
            int i6 = cVar.f4880a;
            i3 = cVar.f4881b;
            i2 = i6;
        } else {
            i2 = cVar2.f4880a;
            i3 = cVar2.f4881b;
        }
        return y(e0Var, e0Var2, i4, i5, i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i2 = cVar.f4880a;
        int i3 = cVar.f4881b;
        View view = e0Var.f4855b;
        int left = cVar2 == null ? view.getLeft() : cVar2.f4880a;
        int top = cVar2 == null ? view.getTop() : cVar2.f4881b;
        if (e0Var.A() || (i2 == left && i3 == top)) {
            return A(e0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return z(e0Var, i2, i3, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i2 = cVar.f4880a;
        int i3 = cVar2.f4880a;
        if (i2 != i3 || cVar.f4881b != cVar2.f4881b) {
            return z(e0Var, i2, cVar.f4881b, i3, cVar2.f4881b);
        }
        F(e0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.e0 e0Var) {
        return !this.f3968g || e0Var.y();
    }

    public abstract boolean x(RecyclerView.e0 e0Var);

    public abstract boolean y(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i2, int i3, int i4, int i5);

    public abstract boolean z(RecyclerView.e0 e0Var, int i2, int i3, int i4, int i5);
}

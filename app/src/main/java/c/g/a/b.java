package c.g.a;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import c.g.a.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<S extends a<C>, C, SVH extends RecyclerView.e0, CVH extends RecyclerView.e0> extends RecyclerView.h<RecyclerView.e0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<S> f16663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16664f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16665g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<c<S, C>> f16666h;

    public b(Context context, List<S> list) {
        this.f16663e = list;
        this.f16666h = W(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void F(RecyclerView.e0 e0Var, int i2) {
        if (i2 <= this.f16666h.size()) {
            c<S, C> cVar = this.f16666h.get(i2);
            if (cVar.e()) {
                g0(e0Var, cVar.d(), cVar.c());
                return;
            } else {
                e0(e0Var, cVar.d(), cVar.b(), cVar.a());
                return;
            }
        }
        throw new IllegalStateException("Trying to bind item out of bounds, size " + this.f16666h.size() + " flatPosition " + i2 + ". Was the data changed without a call to notify...()?");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 H(ViewGroup viewGroup, int i2) {
        return c0(i2) ? i0(viewGroup, i2) : h0(viewGroup, i2);
    }

    public final List<c<S, C>> W(List<S> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Z(arrayList, list.get(i2), i2);
        }
        return arrayList;
    }

    public final void Z(List<c<S, C>> list, S s, int i2) {
        list.add(new c<>(s, i2));
        List<C> listA = s.a();
        for (int i3 = 0; i3 < listA.size(); i3++) {
            list.add(new c<>(listA.get(i3), i2, i3));
        }
    }

    public boolean c0(int i2) {
        return i2 == this.f16664f;
    }

    public abstract void e0(CVH cvh, int i2, int i3, C c2);

    public abstract void g0(SVH svh, int i2, S s);

    public abstract CVH h0(ViewGroup viewGroup, int i2);

    public abstract SVH i0(ViewGroup viewGroup, int i2);

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f16666h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        return this.f16666h.get(i2).e() ? this.f16664f : this.f16665g;
    }
}

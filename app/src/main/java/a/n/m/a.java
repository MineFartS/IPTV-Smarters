package a.n.m;

import a.n.q.b0;
import a.n.q.i0;
import a.n.q.s;
import a.n.q.y;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f2669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VerticalGridView f2670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i0 f2671d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2674g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f2672e = new s();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2673f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f2675h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b0 f2676i = new C0055a();

    /* JADX INFO: renamed from: a.n.m.a$a, reason: collision with other inner class name */
    public class C0055a extends b0 {
        public C0055a() {
        }

        @Override // a.n.q.b0
        public void a(RecyclerView recyclerView, RecyclerView.e0 e0Var, int i2, int i3) {
            a aVar = a.this;
            if (aVar.f2675h.f2678a) {
                return;
            }
            aVar.f2673f = i2;
            aVar.v(recyclerView, e0Var, i2, i3);
        }
    }

    public class b extends RecyclerView.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2678a = false;

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            g();
        }

        public void f() {
            if (this.f2678a) {
                this.f2678a = false;
                a.this.f2672e.V(this);
            }
        }

        public void g() {
            f();
            a aVar = a.this;
            VerticalGridView verticalGridView = aVar.f2670c;
            if (verticalGridView != null) {
                verticalGridView.setSelectedPosition(aVar.f2673f);
            }
        }

        public void h() {
            this.f2678a = true;
            a.this.f2672e.R(this);
        }
    }

    public void B(int i2) {
        C(i2, true);
    }

    public void C(int i2, boolean z) {
        if (this.f2673f == i2) {
            return;
        }
        this.f2673f = i2;
        VerticalGridView verticalGridView = this.f2670c;
        if (verticalGridView == null || this.f2675h.f2678a) {
            return;
        }
        if (z) {
            verticalGridView.setSelectedPositionSmooth(i2);
        } else {
            verticalGridView.setSelectedPosition(i2);
        }
    }

    public void E() {
        this.f2672e.m0(this.f2669b);
        this.f2672e.p0(this.f2671d);
        if (this.f2670c != null) {
            z();
        }
    }

    public abstract VerticalGridView l(View view);

    public final y n() {
        return this.f2669b;
    }

    public final s o() {
        return this.f2672e;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(q(), viewGroup, false);
        this.f2670c = l(viewInflate);
        if (this.f2674g) {
            this.f2674g = false;
            w();
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f2675h.f();
        this.f2670c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("currentSelectedPosition", this.f2673f);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (bundle != null) {
            this.f2673f = bundle.getInt("currentSelectedPosition", -1);
        }
        z();
        this.f2670c.setOnChildViewHolderSelectedListener(this.f2676i);
    }

    public abstract int q();

    public int r() {
        return this.f2673f;
    }

    public final VerticalGridView u() {
        return this.f2670c;
    }

    public abstract void v(RecyclerView recyclerView, RecyclerView.e0 e0Var, int i2, int i3);

    public boolean w() {
        VerticalGridView verticalGridView = this.f2670c;
        if (verticalGridView == null) {
            this.f2674g = true;
            return false;
        }
        verticalGridView.setAnimateChildLayout(false);
        this.f2670c.setScrollEnabled(false);
        return true;
    }

    public final void y(y yVar) {
        if (this.f2669b != yVar) {
            this.f2669b = yVar;
            E();
        }
    }

    public void z() {
        if (this.f2669b == null) {
            return;
        }
        RecyclerView.h adapter = this.f2670c.getAdapter();
        s sVar = this.f2672e;
        if (adapter != sVar) {
            this.f2670c.setAdapter(sVar);
        }
        if (this.f2672e.o() == 0 && this.f2673f >= 0) {
            this.f2675h.h();
            return;
        }
        int i2 = this.f2673f;
        if (i2 >= 0) {
            this.f2670c.setSelectedPosition(i2);
        }
    }
}

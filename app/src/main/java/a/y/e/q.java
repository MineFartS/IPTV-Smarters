package a.y.e;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends RecyclerView.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f3969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Scroller f3970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView.u f3971c = new a();

    public class a extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3972a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i2) {
            super.a(recyclerView, i2);
            if (i2 == 0 && this.f3972a) {
                this.f3972a = false;
                q.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i2, int i3) {
            if (i2 == 0 && i3 == 0) {
                return;
            }
            this.f3972a = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i2, int i3) {
        RecyclerView.p layoutManager = this.f3969a.getLayoutManager();
        if (layoutManager == null || this.f3969a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3969a.getMinFlingVelocity();
        return (Math.abs(i3) > minFlingVelocity || Math.abs(i2) > minFlingVelocity) && i(layoutManager, i2, i3);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3969a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f3969a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f3970b = new Scroller(this.f3969a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    public abstract RecyclerView.a0 d(RecyclerView.p pVar);

    public final void e() {
        this.f3969a.e1(this.f3971c);
        this.f3969a.setOnFlingListener(null);
    }

    public abstract View f(RecyclerView.p pVar);

    public abstract int g(RecyclerView.p pVar, int i2, int i3);

    public final void h() {
        if (this.f3969a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f3969a.l(this.f3971c);
        this.f3969a.setOnFlingListener(this);
    }

    public final boolean i(RecyclerView.p pVar, int i2, int i3) {
        RecyclerView.a0 a0VarD;
        int iG;
        if (!(pVar instanceof RecyclerView.a0.b) || (a0VarD = d(pVar)) == null || (iG = g(pVar, i2, i3)) == -1) {
            return false;
        }
        a0VarD.p(iG);
        pVar.N1(a0VarD);
        return true;
    }

    public void j() {
        RecyclerView.p layoutManager;
        View viewF;
        RecyclerView recyclerView = this.f3969a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = f(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewF);
        if (iArrC[0] == 0 && iArrC[1] == 0) {
            return;
        }
        this.f3969a.r1(iArrC[0], iArrC[1]);
    }
}

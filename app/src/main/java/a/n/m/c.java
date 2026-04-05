package a.n.m;

import a.n.f;
import a.n.g;
import a.n.h;
import a.n.q.h0;
import a.n.q.p0;
import a.n.q.s;
import a.n.q.v;
import android.animation.TimeAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c extends a.n.m.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f2680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s.d f2681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2682l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2684n;
    public boolean q;
    public a.n.q.d r;
    public a.n.q.c s;
    public int t;
    public RecyclerView.v v;
    public ArrayList<h0> w;
    public s.b x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2683m = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2685o = Integer.MIN_VALUE;
    public boolean p = true;
    public Interpolator u = new DecelerateInterpolator(2.0f);
    public final s.b y = new a();

    public class a extends s.b {
        public a() {
        }

        @Override // a.n.q.s.b
        public void a(h0 h0Var, int i2) {
            s.b bVar = c.this.x;
            if (bVar != null) {
                bVar.a(h0Var, i2);
            }
        }

        @Override // a.n.q.s.b
        public void b(s.d dVar) {
            c.P(dVar, c.this.f2683m);
            p0 p0Var = (p0) dVar.S();
            p0.b bVarM = p0Var.m(dVar.T());
            p0Var.B(bVarM, c.this.p);
            p0Var.k(bVarM, c.this.q);
            s.b bVar = c.this.x;
            if (bVar != null) {
                bVar.b(dVar);
            }
        }

        @Override // a.n.q.s.b
        public void c(s.d dVar) {
            s.b bVar = c.this.x;
            if (bVar != null) {
                bVar.c(dVar);
            }
        }

        @Override // a.n.q.s.b
        public void e(s.d dVar) {
            VerticalGridView verticalGridViewU = c.this.u();
            if (verticalGridViewU != null) {
                verticalGridViewU.setClipChildren(false);
            }
            c.this.R(dVar);
            c cVar = c.this;
            cVar.f2684n = true;
            dVar.U(cVar.new C0056c(dVar));
            c.Q(dVar, false, true);
            s.b bVar = c.this.x;
            if (bVar != null) {
                bVar.e(dVar);
            }
            p0.b bVarM = ((p0) dVar.S()).m(dVar.T());
            bVarM.l(c.this.r);
            bVarM.k(c.this.s);
        }

        @Override // a.n.q.s.b
        public void f(s.d dVar) {
            s.d dVar2 = c.this.f2681k;
            if (dVar2 == dVar) {
                c.Q(dVar2, false, true);
                c.this.f2681k = null;
            }
            s.b bVar = c.this.x;
            if (bVar != null) {
                bVar.f(dVar);
            }
        }

        @Override // a.n.q.s.b
        public void g(s.d dVar) {
            c.Q(dVar, false, true);
            s.b bVar = c.this.x;
            if (bVar != null) {
                bVar.g(dVar);
            }
        }
    }

    public static class b extends a.n.m.b<c> {
    }

    /* JADX INFO: renamed from: a.n.m.c$c, reason: collision with other inner class name */
    public final class C0056c implements TimeAnimator.TimeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p0 f2687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0.a f2688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeAnimator f2689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Interpolator f2691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f2692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2693g;

        public C0056c(s.d dVar) {
            TimeAnimator timeAnimator = new TimeAnimator();
            this.f2689c = timeAnimator;
            this.f2687a = (p0) dVar.S();
            this.f2688b = dVar.T();
            timeAnimator.setTimeListener(this);
        }

        public void a(boolean z, boolean z2) {
            this.f2689c.end();
            float f2 = z ? 1.0f : 0.0f;
            if (z2) {
                this.f2687a.E(this.f2688b, f2);
                return;
            }
            if (this.f2687a.o(this.f2688b) != f2) {
                c cVar = c.this;
                this.f2690d = cVar.t;
                this.f2691e = cVar.u;
                float fO = this.f2687a.o(this.f2688b);
                this.f2692f = fO;
                this.f2693g = f2 - fO;
                this.f2689c.start();
            }
        }

        public void b(long j2, long j3) {
            float interpolation;
            int i2 = this.f2690d;
            if (j2 >= i2) {
                interpolation = 1.0f;
                this.f2689c.end();
            } else {
                double d2 = j2;
                double d3 = i2;
                Double.isNaN(d2);
                Double.isNaN(d3);
                interpolation = (float) (d2 / d3);
            }
            Interpolator interpolator = this.f2691e;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(interpolation);
            }
            this.f2687a.E(this.f2688b, this.f2692f + (interpolation * this.f2693g));
        }

        @Override // android.animation.TimeAnimator.TimeListener
        public void onTimeUpdate(TimeAnimator timeAnimator, long j2, long j3) {
            if (this.f2689c.isRunning()) {
                b(j2, j3);
            }
        }
    }

    public static p0.b G(s.d dVar) {
        if (dVar == null) {
            return null;
        }
        return ((p0) dVar.S()).m(dVar.T());
    }

    public static void P(s.d dVar, boolean z) {
        ((p0) dVar.S()).C(dVar.T(), z);
    }

    public static void Q(s.d dVar, boolean z, boolean z2) {
        ((C0056c) dVar.R()).a(z, z2);
        ((p0) dVar.S()).D(dVar.T(), z);
    }

    @Override // a.n.m.a
    public /* bridge */ /* synthetic */ void B(int i2) {
        super.B(i2);
    }

    @Override // a.n.m.a
    public /* bridge */ /* synthetic */ void C(int i2, boolean z) {
        super.C(i2, z);
    }

    @Override // a.n.m.a
    public void E() {
        super.E();
        this.f2681k = null;
        this.f2684n = false;
        s sVarO = o();
        if (sVarO != null) {
            sVarO.n0(this.y);
        }
    }

    public final void F(boolean z) {
        this.q = z;
        VerticalGridView verticalGridViewU = u();
        if (verticalGridViewU != null) {
            int childCount = verticalGridViewU.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                s.d dVar = (s.d) verticalGridViewU.i0(verticalGridViewU.getChildAt(i2));
                p0 p0Var = (p0) dVar.S();
                p0Var.k(p0Var.m(dVar.T()), z);
            }
        }
    }

    public void H(int i2) {
        if (i2 == Integer.MIN_VALUE) {
            return;
        }
        this.f2685o = i2;
        VerticalGridView verticalGridViewU = u();
        if (verticalGridViewU != null) {
            verticalGridViewU.setItemAlignmentOffset(0);
            verticalGridViewU.setItemAlignmentOffsetPercent(-1.0f);
            verticalGridViewU.setItemAlignmentOffsetWithPadding(true);
            verticalGridViewU.setWindowAlignmentOffset(this.f2685o);
            verticalGridViewU.setWindowAlignmentOffsetPercent(-1.0f);
            verticalGridViewU.setWindowAlignment(0);
        }
    }

    public void J(boolean z) {
        this.f2683m = z;
        VerticalGridView verticalGridViewU = u();
        if (verticalGridViewU != null) {
            int childCount = verticalGridViewU.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                P((s.d) verticalGridViewU.i0(verticalGridViewU.getChildAt(i2)), this.f2683m);
            }
        }
    }

    public void K(a.n.q.c cVar) {
        this.s = cVar;
        if (this.f2684n) {
            throw new IllegalStateException("Item clicked listener must be set before views are created");
        }
    }

    public void N(a.n.q.d dVar) {
        this.r = dVar;
        VerticalGridView verticalGridViewU = u();
        if (verticalGridViewU != null) {
            int childCount = verticalGridViewU.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                G((s.d) verticalGridViewU.i0(verticalGridViewU.getChildAt(i2))).l(this.r);
            }
        }
    }

    public void R(s.d dVar) {
        p0.b bVarM = ((p0) dVar.S()).m(dVar.T());
        if (bVarM instanceof v.d) {
            v.d dVar2 = (v.d) bVarM;
            HorizontalGridView horizontalGridViewO = dVar2.o();
            RecyclerView.v vVar = this.v;
            if (vVar == null) {
                this.v = horizontalGridViewO.getRecycledViewPool();
            } else {
                horizontalGridViewO.setRecycledViewPool(vVar);
            }
            s sVarN = dVar2.n();
            ArrayList<h0> arrayList = this.w;
            if (arrayList == null) {
                this.w = sVarN.Z();
            } else {
                sVarN.q0(arrayList);
            }
        }
    }

    @Override // a.n.m.a
    public VerticalGridView l(View view) {
        return (VerticalGridView) view.findViewById(f.f2613d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t = getResources().getInteger(g.f2625a);
    }

    @Override // a.n.m.a, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // a.n.m.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f2684n = false;
        super.onDestroyView();
    }

    @Override // a.n.m.a, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // a.n.m.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        u().setItemAlignmentViewId(f.A);
        u().setSaveChildrenPolicy(2);
        H(this.f2685o);
        this.v = null;
        this.w = null;
        if (this.f2680j != null) {
            throw null;
        }
    }

    @Override // a.n.m.a
    public int q() {
        return h.f2638i;
    }

    @Override // a.n.m.a
    public /* bridge */ /* synthetic */ int r() {
        return super.r();
    }

    @Override // a.n.m.a
    public void v(RecyclerView recyclerView, RecyclerView.e0 e0Var, int i2, int i3) {
        s.d dVar = this.f2681k;
        if (dVar != e0Var || this.f2682l != i3) {
            this.f2682l = i3;
            if (dVar != null) {
                Q(dVar, false, false);
            }
            s.d dVar2 = (s.d) e0Var;
            this.f2681k = dVar2;
            if (dVar2 != null) {
                Q(dVar2, true, false);
            }
        }
        if (this.f2680j != null) {
            throw null;
        }
    }

    @Override // a.n.m.a
    public boolean w() {
        boolean zW = super.w();
        if (zW) {
            F(true);
        }
        return zW;
    }
}

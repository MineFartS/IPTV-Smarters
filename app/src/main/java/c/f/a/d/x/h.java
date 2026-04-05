package c.f.a.d.x;

import a.i.r.x;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class h<S> extends p<S> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f15284c = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f15285d = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f15286e = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f15287f = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.f.a.d.x.d<S> f15289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.f.a.d.x.a f15290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.f.a.d.x.l f15291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f15292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.f.a.d.x.c f15293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecyclerView f15294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecyclerView f15295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f15296o;
    public View p;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15297b;

        public a(int i2) {
            this.f15297b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f15295n.v1(this.f15297b);
        }
    }

    public class b extends a.i.r.a {
        public b() {
        }

        @Override // a.i.r.a
        public void g(View view, a.i.r.g0.c cVar) {
            super.g(view, cVar);
            cVar.Z(null);
        }
    }

    public class c extends q {
        public final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i2, boolean z, int i3) {
            super(context, i2, z);
            this.I = i3;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void Q1(RecyclerView.b0 b0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = h.this.f15295n.getWidth();
                iArr[1] = h.this.f15295n.getWidth();
            } else {
                iArr[0] = h.this.f15295n.getHeight();
                iArr[1] = h.this.f15295n.getHeight();
            }
        }
    }

    public class d implements l {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // c.f.a.d.x.h.l
        public void a(long j2) {
            if (h.this.f15290i.h().a(j2)) {
                h.this.f15289h.F(j2);
                Iterator<o<S>> it = h.this.f15341b.iterator();
                while (it.hasNext()) {
                    it.next().a(h.this.f15289h.D());
                }
                h.this.f15295n.getAdapter().w();
                if (h.this.f15294m != null) {
                    h.this.f15294m.getAdapter().w();
                }
            }
        }
    }

    public class e extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Calendar f15301a = s.k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Calendar f15302b = s.k();

        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            if ((recyclerView.getAdapter() instanceof t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                t tVar = (t) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (a.i.q.e<Long, Long> eVar : h.this.f15289h.i()) {
                    Long l2 = eVar.f1955a;
                    if (l2 != null && eVar.f1956b != null) {
                        this.f15301a.setTimeInMillis(l2.longValue());
                        this.f15302b.setTimeInMillis(eVar.f1956b.longValue());
                        int iC0 = tVar.c0(this.f15301a.get(1));
                        int iC02 = tVar.c0(this.f15302b.get(1));
                        View viewE = gridLayoutManager.E(iC0);
                        View viewE2 = gridLayoutManager.E(iC02);
                        int iY2 = iC0 / gridLayoutManager.Y2();
                        int iY22 = iC02 / gridLayoutManager.Y2();
                        int i2 = iY2;
                        while (i2 <= iY22) {
                            if (gridLayoutManager.E(gridLayoutManager.Y2() * i2) != null) {
                                canvas.drawRect(i2 == iY2 ? viewE.getLeft() + (viewE.getWidth() / 2) : 0, r9.getTop() + h.this.f15293l.f15274d.c(), i2 == iY22 ? viewE2.getLeft() + (viewE2.getWidth() / 2) : recyclerView.getWidth(), r9.getBottom() - h.this.f15293l.f15274d.b(), h.this.f15293l.f15278h);
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    public class f extends a.i.r.a {
        public f() {
        }

        @Override // a.i.r.a
        public void g(View view, a.i.r.g0.c cVar) {
            h hVar;
            int i2;
            super.g(view, cVar);
            if (h.this.p.getVisibility() == 0) {
                hVar = h.this;
                i2 = c.f.a.d.j.s;
            } else {
                hVar = h.this;
                i2 = c.f.a.d.j.q;
            }
            cVar.h0(hVar.getString(i2));
        }
    }

    public class g extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f15305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MaterialButton f15306b;

        public g(n nVar, MaterialButton materialButton) {
            this.f15305a = nVar;
            this.f15306b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i2) {
            if (i2 == 0) {
                CharSequence text = this.f15306b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i2, int i3) {
            LinearLayoutManager linearLayoutManagerJ = h.this.J();
            int iC2 = i2 < 0 ? linearLayoutManagerJ.c2() : linearLayoutManagerJ.e2();
            h.this.f15291j = this.f15305a.Z(iC2);
            this.f15306b.setText(this.f15305a.c0(iC2));
        }
    }

    /* JADX INFO: renamed from: c.f.a.d.x.h$h, reason: collision with other inner class name */
    public class ViewOnClickListenerC0181h implements View.OnClickListener {
        public ViewOnClickListenerC0181h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.R();
        }
    }

    public class i implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f15309b;

        public i(n nVar) {
            this.f15309b = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iC2 = h.this.J().c2() + 1;
            if (iC2 < h.this.f15295n.getAdapter().o()) {
                h.this.P(this.f15309b.Z(iC2));
            }
        }
    }

    public class j implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f15311b;

        public j(n nVar) {
            this.f15311b = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iE2 = h.this.J().e2() - 1;
            if (iE2 >= 0) {
                h.this.P(this.f15311b.Z(iE2));
            }
        }
    }

    public enum k {
        DAY,
        YEAR
    }

    public interface l {
        void a(long j2);
    }

    public static int H(Context context) {
        return context.getResources().getDimensionPixelSize(c.f.a.d.d.F);
    }

    public static <T> h<T> K(c.f.a.d.x.d<T> dVar, int i2, c.f.a.d.x.a aVar) {
        h<T> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.l());
        hVar.setArguments(bundle);
        return hVar;
    }

    public final RecyclerView.o B() {
        return new e();
    }

    public c.f.a.d.x.a C() {
        return this.f15290i;
    }

    public c.f.a.d.x.c E() {
        return this.f15293l;
    }

    public c.f.a.d.x.l F() {
        return this.f15291j;
    }

    public c.f.a.d.x.d<S> G() {
        return this.f15289h;
    }

    public LinearLayoutManager J() {
        return (LinearLayoutManager) this.f15295n.getLayoutManager();
    }

    public final void N(int i2) {
        this.f15295n.post(new a(i2));
    }

    public void P(c.f.a.d.x.l lVar) {
        RecyclerView recyclerView;
        int i2;
        n nVar = (n) this.f15295n.getAdapter();
        int iE0 = nVar.e0(lVar);
        int iE02 = iE0 - nVar.e0(this.f15291j);
        boolean z = Math.abs(iE02) > 3;
        boolean z2 = iE02 > 0;
        this.f15291j = lVar;
        if (!z || !z2) {
            if (z) {
                recyclerView = this.f15295n;
                i2 = iE0 + 3;
            }
            N(iE0);
        }
        recyclerView = this.f15295n;
        i2 = iE0 - 3;
        recyclerView.n1(i2);
        N(iE0);
    }

    public void Q(k kVar) {
        this.f15292k = kVar;
        if (kVar == k.YEAR) {
            this.f15294m.getLayoutManager().A1(((t) this.f15294m.getAdapter()).c0(this.f15291j.f15323d));
            this.f15296o.setVisibility(0);
            this.p.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f15296o.setVisibility(8);
            this.p.setVisibility(0);
            P(this.f15291j);
        }
    }

    public void R() {
        k kVar = this.f15292k;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            Q(k.DAY);
        } else if (kVar == k.DAY) {
            Q(kVar2);
        }
    }

    @Override // c.f.a.d.x.p
    public boolean l(o<S> oVar) {
        return super.l(oVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f15288g = bundle.getInt("THEME_RES_ID_KEY");
        this.f15289h = (c.f.a.d.x.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f15290i = (c.f.a.d.x.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f15291j = (c.f.a.d.x.l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f15288g);
        this.f15293l = new c.f.a.d.x.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        c.f.a.d.x.l lVarM = this.f15290i.m();
        if (c.f.a.d.x.i.l0(contextThemeWrapper)) {
            i2 = c.f.a.d.h.p;
            i3 = 1;
        } else {
            i2 = c.f.a.d.h.f14840n;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) viewInflate.findViewById(c.f.a.d.f.v);
        x.p0(gridView, new b());
        gridView.setAdapter((ListAdapter) new c.f.a.d.x.g());
        gridView.setNumColumns(lVarM.f15324e);
        gridView.setEnabled(false);
        this.f15295n = (RecyclerView) viewInflate.findViewById(c.f.a.d.f.y);
        this.f15295n.setLayoutManager(new c(getContext(), i3, false, i3));
        this.f15295n.setTag(f15284c);
        n nVar = new n(contextThemeWrapper, this.f15289h, this.f15290i, new d());
        this.f15295n.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(c.f.a.d.g.f14802b);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(c.f.a.d.f.z);
        this.f15294m = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f15294m.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f15294m.setAdapter(new t(this));
            this.f15294m.h(B());
        }
        if (viewInflate.findViewById(c.f.a.d.f.p) != null) {
            z(viewInflate, nVar);
        }
        if (!c.f.a.d.x.i.l0(contextThemeWrapper)) {
            new a.y.e.m().b(this.f15295n);
        }
        this.f15295n.n1(nVar.e0(this.f15291j));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f15288g);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f15289h);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f15290i);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f15291j);
    }

    public final void z(View view, n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(c.f.a.d.f.p);
        materialButton.setTag(f15287f);
        x.p0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(c.f.a.d.f.r);
        materialButton2.setTag(f15285d);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(c.f.a.d.f.q);
        materialButton3.setTag(f15286e);
        this.f15296o = view.findViewById(c.f.a.d.f.z);
        this.p = view.findViewById(c.f.a.d.f.u);
        Q(k.DAY);
        materialButton.setText(this.f15291j.t(view.getContext()));
        this.f15295n.l(new g(nVar, materialButton));
        materialButton.setOnClickListener(new ViewOnClickListenerC0181h());
        materialButton3.setOnClickListener(new i(nVar));
        materialButton2.setOnClickListener(new j(nVar));
    }
}

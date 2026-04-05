package a.b.p.j;

import a.b.p.j.m;
import a.b.q.h0;
import a.b.q.i0;
import a.i.r.x;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f423c = a.b.g.f90e;
    public ViewTreeObserver A;
    public PopupWindow.OnDismissListener B;
    public boolean C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f429i;
    public View q;
    public View r;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public boolean y;
    public m.a z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<g> f430j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<C0007d> f431k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f432l = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f433m = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h0 f434n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f435o = 0;
    public int p = 0;
    public boolean x = false;
    public int s = C();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.a() || d.this.f431k.size() <= 0 || d.this.f431k.get(0).f443a.A()) {
                return;
            }
            View view = d.this.r;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0007d> it = d.this.f431k.iterator();
            while (it.hasNext()) {
                it.next().f443a.show();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.A = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.A.removeGlobalOnLayoutListener(dVar.f432l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements h0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0007d f439b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuItem f440c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g f441d;

            public a(C0007d c0007d, MenuItem menuItem, g gVar) {
                this.f439b = c0007d;
                this.f440c = menuItem;
                this.f441d = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0007d c0007d = this.f439b;
                if (c0007d != null) {
                    d.this.C = true;
                    c0007d.f444b.e(false);
                    d.this.C = false;
                }
                if (this.f440c.isEnabled() && this.f440c.hasSubMenu()) {
                    this.f441d.L(this.f440c, 4);
                }
            }
        }

        public c() {
        }

        @Override // a.b.q.h0
        public void d(g gVar, MenuItem menuItem) {
            d.this.f429i.removeCallbacksAndMessages(null);
            int size = d.this.f431k.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (gVar == d.this.f431k.get(i2).f444b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            d.this.f429i.postAtTime(new a(i3 < d.this.f431k.size() ? d.this.f431k.get(i3) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // a.b.q.h0
        public void g(g gVar, MenuItem menuItem) {
            d.this.f429i.removeCallbacksAndMessages(gVar);
        }
    }

    /* JADX INFO: renamed from: a.b.p.j.d$d, reason: collision with other inner class name */
    public static class C0007d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0 f443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f445c;

        public C0007d(i0 i0Var, g gVar, int i2) {
            this.f443a = i0Var;
            this.f444b = gVar;
            this.f445c = i2;
        }

        public ListView a() {
            return this.f443a.i();
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z) {
        this.f424d = context;
        this.q = view;
        this.f426f = i2;
        this.f427g = i3;
        this.f428h = z;
        Resources resources = context.getResources();
        this.f425e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.b.d.f44d));
        this.f429i = new Handler();
    }

    public final MenuItem A(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = gVar.getItem(i2);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View B(C0007d c0007d, g gVar) {
        f fVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemA = A(c0007d.f444b, gVar);
        if (menuItemA == null) {
            return null;
        }
        ListView listViewA = c0007d.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            headersCount = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (menuItemA == fVar.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int C() {
        return x.C(this.q) == 1 ? 0 : 1;
    }

    public final int D(int i2) {
        List<C0007d> list = this.f431k;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.r.getWindowVisibleDisplayFrame(rect);
        return this.s == 1 ? (iArr[0] + listViewA.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    public final void E(g gVar) {
        C0007d c0007d;
        View viewB;
        int i2;
        int i3;
        int i4;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f424d);
        f fVar = new f(gVar, layoutInflaterFrom, this.f428h, f423c);
        if (!a() && this.x) {
            fVar.d(true);
        } else if (a()) {
            fVar.d(k.w(gVar));
        }
        int iN = k.n(fVar, null, this.f424d, this.f425e);
        i0 i0VarY = y();
        i0VarY.o(fVar);
        i0VarY.E(iN);
        i0VarY.F(this.p);
        if (this.f431k.size() > 0) {
            List<C0007d> list = this.f431k;
            c0007d = list.get(list.size() - 1);
            viewB = B(c0007d, gVar);
        } else {
            c0007d = null;
            viewB = null;
        }
        if (viewB != null) {
            i0VarY.T(false);
            i0VarY.Q(null);
            int iD = D(iN);
            boolean z = iD == 1;
            this.s = iD;
            if (Build.VERSION.SDK_INT >= 26) {
                i0VarY.C(viewB);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.q.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewB.getLocationOnScreen(iArr2);
                if ((this.p & 7) == 5) {
                    iArr[0] = iArr[0] + this.q.getWidth();
                    iArr2[0] = iArr2[0] + viewB.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.p & 5) == 5) {
                if (!z) {
                    iN = viewB.getWidth();
                    i4 = i2 - iN;
                }
                i4 = i2 + iN;
            } else {
                if (z) {
                    iN = viewB.getWidth();
                    i4 = i2 + iN;
                }
                i4 = i2 - iN;
            }
            i0VarY.e(i4);
            i0VarY.L(true);
            i0VarY.k(i3);
        } else {
            if (this.t) {
                i0VarY.e(this.v);
            }
            if (this.u) {
                i0VarY.k(this.w);
            }
            i0VarY.G(m());
        }
        this.f431k.add(new C0007d(i0VarY, gVar, this.s));
        i0VarY.show();
        ListView listViewI = i0VarY.i();
        listViewI.setOnKeyListener(this);
        if (c0007d == null && this.y && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(a.b.g.f97l, (ViewGroup) listViewI, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.x());
            listViewI.addHeaderView(frameLayout, null, false);
            i0VarY.show();
        }
    }

    @Override // a.b.p.j.p
    public boolean a() {
        return this.f431k.size() > 0 && this.f431k.get(0).f443a.a();
    }

    @Override // a.b.p.j.m
    public void b(g gVar, boolean z) {
        int iZ = z(gVar);
        if (iZ < 0) {
            return;
        }
        int i2 = iZ + 1;
        if (i2 < this.f431k.size()) {
            this.f431k.get(i2).f444b.e(false);
        }
        C0007d c0007dRemove = this.f431k.remove(iZ);
        c0007dRemove.f444b.O(this);
        if (this.C) {
            c0007dRemove.f443a.R(null);
            c0007dRemove.f443a.D(0);
        }
        c0007dRemove.f443a.dismiss();
        int size = this.f431k.size();
        this.s = size > 0 ? this.f431k.get(size - 1).f445c : C();
        if (size != 0) {
            if (z) {
                this.f431k.get(0).f444b.e(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.z;
        if (aVar != null) {
            aVar.b(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.A.removeGlobalOnLayoutListener(this.f432l);
            }
            this.A = null;
        }
        this.r.removeOnAttachStateChangeListener(this.f433m);
        this.B.onDismiss();
    }

    @Override // a.b.p.j.m
    public void c(boolean z) {
        Iterator<C0007d> it = this.f431k.iterator();
        while (it.hasNext()) {
            k.x(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // a.b.p.j.m
    public boolean d() {
        return false;
    }

    @Override // a.b.p.j.p
    public void dismiss() {
        int size = this.f431k.size();
        if (size > 0) {
            C0007d[] c0007dArr = (C0007d[]) this.f431k.toArray(new C0007d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0007d c0007d = c0007dArr[i2];
                if (c0007d.f443a.a()) {
                    c0007d.f443a.dismiss();
                }
            }
        }
    }

    @Override // a.b.p.j.m
    public void g(m.a aVar) {
        this.z = aVar;
    }

    @Override // a.b.p.j.p
    public ListView i() {
        if (this.f431k.isEmpty()) {
            return null;
        }
        return this.f431k.get(r0.size() - 1).a();
    }

    @Override // a.b.p.j.m
    public boolean j(r rVar) {
        for (C0007d c0007d : this.f431k) {
            if (rVar == c0007d.f444b) {
                c0007d.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        k(rVar);
        m.a aVar = this.z;
        if (aVar != null) {
            aVar.c(rVar);
        }
        return true;
    }

    @Override // a.b.p.j.k
    public void k(g gVar) {
        gVar.c(this, this.f424d);
        if (a()) {
            E(gVar);
        } else {
            this.f430j.add(gVar);
        }
    }

    @Override // a.b.p.j.k
    public boolean l() {
        return false;
    }

    @Override // a.b.p.j.k
    public void o(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = a.i.r.f.b(this.f435o, x.C(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0007d c0007d;
        int size = this.f431k.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0007d = null;
                break;
            }
            c0007d = this.f431k.get(i2);
            if (!c0007d.f443a.a()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0007d != null) {
            c0007d.f444b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // a.b.p.j.k
    public void q(boolean z) {
        this.x = z;
    }

    @Override // a.b.p.j.k
    public void r(int i2) {
        if (this.f435o != i2) {
            this.f435o = i2;
            this.p = a.i.r.f.b(i2, x.C(this.q));
        }
    }

    @Override // a.b.p.j.k
    public void s(int i2) {
        this.t = true;
        this.v = i2;
    }

    @Override // a.b.p.j.p
    public void show() {
        if (a()) {
            return;
        }
        Iterator<g> it = this.f430j.iterator();
        while (it.hasNext()) {
            E(it.next());
        }
        this.f430j.clear();
        View view = this.q;
        this.r = view;
        if (view != null) {
            boolean z = this.A == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.A = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f432l);
            }
            this.r.addOnAttachStateChangeListener(this.f433m);
        }
    }

    @Override // a.b.p.j.k
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @Override // a.b.p.j.k
    public void u(boolean z) {
        this.y = z;
    }

    @Override // a.b.p.j.k
    public void v(int i2) {
        this.u = true;
        this.w = i2;
    }

    public final i0 y() {
        i0 i0Var = new i0(this.f424d, null, this.f426f, this.f427g);
        i0Var.S(this.f434n);
        i0Var.K(this);
        i0Var.J(this);
        i0Var.C(this.q);
        i0Var.F(this.p);
        i0Var.I(true);
        i0Var.H(2);
        return i0Var;
    }

    public final int z(g gVar) {
        int size = this.f431k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (gVar == this.f431k.get(i2).f444b) {
                return i2;
            }
        }
        return -1;
    }
}

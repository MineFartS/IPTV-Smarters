package a.b.p.j;

import a.b.p.j.m;
import a.b.q.i0;
import a.i.r.x;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f524c = a.b.g.f98m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i0 f532k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PopupWindow.OnDismissListener f535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f536o;
    public View p;
    public m.a q;
    public ViewTreeObserver r;
    public boolean s;
    public boolean t;
    public int u;
    public boolean w;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f533l = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f534m = new b();
    public int v = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!q.this.a() || q.this.f532k.A()) {
                return;
            }
            View view = q.this.p;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.f532k.show();
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
            ViewTreeObserver viewTreeObserver = q.this.r;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.r = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.r.removeGlobalOnLayoutListener(qVar.f533l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z) {
        this.f525d = context;
        this.f526e = gVar;
        this.f528g = z;
        this.f527f = new f(gVar, LayoutInflater.from(context), z, f524c);
        this.f530i = i2;
        this.f531j = i3;
        Resources resources = context.getResources();
        this.f529h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.b.d.f44d));
        this.f536o = view;
        this.f532k = new i0(context, null, i2, i3);
        gVar.c(this, context);
    }

    @Override // a.b.p.j.p
    public boolean a() {
        return !this.s && this.f532k.a();
    }

    @Override // a.b.p.j.m
    public void b(g gVar, boolean z) {
        if (gVar != this.f526e) {
            return;
        }
        dismiss();
        m.a aVar = this.q;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // a.b.p.j.m
    public void c(boolean z) {
        this.t = false;
        f fVar = this.f527f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // a.b.p.j.m
    public boolean d() {
        return false;
    }

    @Override // a.b.p.j.p
    public void dismiss() {
        if (a()) {
            this.f532k.dismiss();
        }
    }

    @Override // a.b.p.j.m
    public void g(m.a aVar) {
        this.q = aVar;
    }

    @Override // a.b.p.j.p
    public ListView i() {
        return this.f532k.i();
    }

    @Override // a.b.p.j.m
    public boolean j(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f525d, rVar, this.p, this.f528g, this.f530i, this.f531j);
            lVar.j(this.q);
            lVar.g(k.w(rVar));
            lVar.i(this.f535n);
            this.f535n = null;
            this.f526e.e(false);
            int iC = this.f532k.c();
            int iN = this.f532k.n();
            if ((Gravity.getAbsoluteGravity(this.v, x.C(this.f536o)) & 7) == 5) {
                iC += this.f536o.getWidth();
            }
            if (lVar.n(iC, iN)) {
                m.a aVar = this.q;
                if (aVar == null) {
                    return true;
                }
                aVar.c(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // a.b.p.j.k
    public void k(g gVar) {
    }

    @Override // a.b.p.j.k
    public void o(View view) {
        this.f536o = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.s = true;
        this.f526e.close();
        ViewTreeObserver viewTreeObserver = this.r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.r = this.p.getViewTreeObserver();
            }
            this.r.removeGlobalOnLayoutListener(this.f533l);
            this.r = null;
        }
        this.p.removeOnAttachStateChangeListener(this.f534m);
        PopupWindow.OnDismissListener onDismissListener = this.f535n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f527f.d(z);
    }

    @Override // a.b.p.j.k
    public void r(int i2) {
        this.v = i2;
    }

    @Override // a.b.p.j.k
    public void s(int i2) {
        this.f532k.e(i2);
    }

    @Override // a.b.p.j.p
    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // a.b.p.j.k
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f535n = onDismissListener;
    }

    @Override // a.b.p.j.k
    public void u(boolean z) {
        this.w = z;
    }

    @Override // a.b.p.j.k
    public void v(int i2) {
        this.f532k.k(i2);
    }

    public final boolean y() {
        View view;
        if (a()) {
            return true;
        }
        if (this.s || (view = this.f536o) == null) {
            return false;
        }
        this.p = view;
        this.f532k.J(this);
        this.f532k.K(this);
        this.f532k.I(true);
        View view2 = this.p;
        boolean z = this.r == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.r = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f533l);
        }
        view2.addOnAttachStateChangeListener(this.f534m);
        this.f532k.C(view2);
        this.f532k.F(this.v);
        if (!this.t) {
            this.u = k.n(this.f527f, null, this.f525d, this.f529h);
            this.t = true;
        }
        this.f532k.E(this.u);
        this.f532k.H(2);
        this.f532k.G(m());
        this.f532k.show();
        ListView listViewI = this.f532k.i();
        listViewI.setOnKeyListener(this);
        if (this.w && this.f526e.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f525d).inflate(a.b.g.f97l, (ViewGroup) listViewI, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f526e.x());
            }
            frameLayout.setEnabled(false);
            listViewI.addHeaderView(frameLayout, null, false);
        }
        this.f532k.o(this.f527f);
        this.f532k.show();
        return true;
    }
}

package a.b.q;

import a.b.p.j.g;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.b.p.j.g f665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a.b.p.j.l f667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f669f;

    public class a implements g.a {
        public a() {
        }

        @Override // a.b.p.j.g.a
        public boolean a(a.b.p.j.g gVar, MenuItem menuItem) {
            d dVar = j0.this.f668e;
            if (dVar != null) {
                return dVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // a.b.p.j.g.a
        public void b(a.b.p.j.g gVar) {
        }
    }

    public class b implements PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            j0 j0Var = j0.this;
            c cVar = j0Var.f669f;
            if (cVar != null) {
                cVar.a(j0Var);
            }
        }
    }

    public interface c {
        void a(j0 j0Var);
    }

    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public j0(Context context, View view) {
        this(context, view, 0);
    }

    public j0(Context context, View view, int i2) {
        this(context, view, i2, a.b.a.J, 0);
    }

    public j0(Context context, View view, int i2, int i3, int i4) {
        this.f664a = context;
        this.f666c = view;
        a.b.p.j.g gVar = new a.b.p.j.g(context);
        this.f665b = gVar;
        gVar.R(new a());
        a.b.p.j.l lVar = new a.b.p.j.l(context, gVar, view, false, i3, i4);
        this.f667d = lVar;
        lVar.h(i2);
        lVar.i(new b());
    }

    public void a() {
        this.f667d.b();
    }

    public Menu b() {
        return this.f665b;
    }

    public MenuInflater c() {
        return new a.b.p.g(this.f664a);
    }

    public void d(int i2) {
        c().inflate(i2, this.f665b);
    }

    public void e(c cVar) {
        this.f669f = cVar;
    }

    public void f(d dVar) {
        this.f668e = dVar;
    }

    public void g() {
        this.f667d.k();
    }
}

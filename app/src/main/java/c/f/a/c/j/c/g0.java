package c.f.a.c.j.c;

import android.content.Context;
import android.widget.ImageView;
import c.f.a.c.d.e;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends c.f.a.c.d.u.u.l.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f12845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f12848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e.d f12849f;

    public g0(ImageView imageView, Context context) {
        this.f12845b = imageView;
        Context applicationContext = context.getApplicationContext();
        this.f12848e = applicationContext;
        this.f12846c = applicationContext.getString(c.f.a.c.d.u.n.f11895l);
        this.f12847d = applicationContext.getString(c.f.a.c.d.u.n.C);
        imageView.setEnabled(false);
        this.f12849f = null;
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void c() {
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void d() {
        this.f12845b.setEnabled(false);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void e(c.f.a.c.d.u.d dVar) {
        if (this.f12849f == null) {
            this.f12849f = new j0(this);
        }
        super.e(dVar);
        dVar.n(this.f12849f);
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void f() {
        e.d dVar;
        this.f12845b.setEnabled(false);
        c.f.a.c.d.u.d dVarC = c.f.a.c.d.u.b.e(this.f12848e).c().c();
        if (dVarC != null && (dVar = this.f12849f) != null) {
            dVarC.s(dVar);
        }
        super.f();
    }

    public final void g() {
        c.f.a.c.d.u.d dVarC = c.f.a.c.d.u.b.e(this.f12848e).c().c();
        if (dVarC == null || !dVarC.c()) {
            this.f12845b.setEnabled(false);
            return;
        }
        c.f.a.c.d.u.u.i iVarB = b();
        if (iVarB == null || !iVarB.p()) {
            this.f12845b.setEnabled(false);
        } else {
            this.f12845b.setEnabled(true);
        }
        boolean zR = dVarC.r();
        this.f12845b.setSelected(zR);
        this.f12845b.setContentDescription(zR ? this.f12847d : this.f12846c);
    }
}

package c.f.a.c.j.c;

import android.view.View;
import c.f.a.c.d.u.u.i;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends c.f.a.c.d.u.u.l.a implements i.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f12770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.c.d.u.u.l.c f12771c;

    public b0(View view, c.f.a.c.d.u.u.l.c cVar) {
        this.f12770b = view;
        this.f12771c = cVar;
        view.setEnabled(false);
    }

    @Override // c.f.a.c.d.u.u.i.e
    public final void a(long j2, long j3) {
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void c() {
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void d() {
        this.f12770b.setEnabled(false);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void e(c.f.a.c.d.u.d dVar) {
        super.e(dVar);
        if (b() != null) {
            b().c(this, 1000L);
        }
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void f() {
        if (b() != null) {
            b().P(this);
        }
        this.f12770b.setEnabled(false);
        super.f();
        g();
    }

    public final void g() {
        View view;
        c.f.a.c.d.u.u.i iVarB = b();
        boolean z = true;
        if (iVarB != null && iVarB.p() && !iVarB.v()) {
            if (iVarB.r()) {
                View view2 = this.f12770b;
                if (!iVarB.w() || this.f12771c.h()) {
                    view = view2;
                } else {
                    view = view2;
                }
            } else {
                view = this.f12770b;
            }
            view.setEnabled(z);
        }
        view = this.f12770b;
        z = false;
        view.setEnabled(z);
    }
}

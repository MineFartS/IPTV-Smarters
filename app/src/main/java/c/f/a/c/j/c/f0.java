package c.f.a.c.j.c;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends c.f.a.c.d.u.u.l.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f12809b;

    public f0(View view) {
        this.f12809b = view;
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void c() {
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void d() {
        this.f12809b.setVisibility(0);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void e(c.f.a.c.d.u.d dVar) {
        super.e(dVar);
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void f() {
        this.f12809b.setVisibility(8);
        super.f();
    }

    public final void g() {
        View view;
        int i2;
        c.f.a.c.d.u.u.i iVarB = b();
        if (iVarB == null || !iVarB.p() || iVarB.q()) {
            view = this.f12809b;
            i2 = 0;
        } else {
            view = this.f12809b;
            i2 = 8;
        }
        view.setVisibility(i2);
    }
}

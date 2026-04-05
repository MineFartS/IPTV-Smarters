package c.f.a.c.j.c;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends c.f.a.c.d.u.u.l.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f13033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13034c;

    public q0(View view, int i2) {
        this.f13033b = view;
        this.f13034c = i2;
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void c() {
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void e(c.f.a.c.d.u.d dVar) {
        super.e(dVar);
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void f() {
        this.f13033b.setVisibility(this.f13034c);
        super.f();
    }

    public final void g() {
        View view;
        int i2;
        c.f.a.c.d.u.u.i iVarB = b();
        if (iVarB == null || !iVarB.p()) {
            view = this.f13033b;
            i2 = this.f13034c;
        } else {
            view = this.f13033b;
            i2 = 0;
        }
        view.setVisibility(i2);
    }
}

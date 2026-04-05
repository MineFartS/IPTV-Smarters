package c.f.a.c.j.c;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends c.f.a.c.d.u.u.l.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f12788b;

    public d0(View view) {
        this.f12788b = view;
        view.setEnabled(false);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void e(c.f.a.c.d.u.d dVar) {
        super.e(dVar);
        this.f12788b.setEnabled(true);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void f() {
        this.f12788b.setEnabled(false);
        super.f();
    }
}

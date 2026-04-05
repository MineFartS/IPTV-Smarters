package c.f.a.c.j.c;

import android.widget.TextView;
import c.f.a.c.d.u.u.i;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends c.f.a.c.d.u.u.l.a implements i.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f13053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.c.d.u.u.l.c f13054c;

    public r0(TextView textView, c.f.a.c.d.u.u.l.c cVar) {
        this.f13053b = textView;
        this.f13054c = cVar;
        g();
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
        super.f();
        g();
    }

    public final void g() {
        c.f.a.c.d.u.u.i iVarB = b();
        if (iVarB == null || !iVarB.p()) {
            TextView textView = this.f13053b;
            textView.setText(textView.getContext().getString(c.f.a.c.d.u.n.f11894k));
        } else {
            if (iVarB.r() && this.f13054c.m() == null) {
                this.f13053b.setVisibility(8);
                return;
            }
            this.f13053b.setVisibility(0);
            TextView textView2 = this.f13053b;
            c.f.a.c.d.u.u.l.c cVar = this.f13054c;
            textView2.setText(cVar.q(cVar.s(cVar.a())));
        }
    }
}

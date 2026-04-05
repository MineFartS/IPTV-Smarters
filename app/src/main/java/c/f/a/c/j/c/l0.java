package c.f.a.c.j.c;

import android.widget.ProgressBar;
import c.f.a.c.d.u.u.i;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends c.f.a.c.d.u.u.l.a implements i.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f12919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12920c;

    public l0(ProgressBar progressBar, long j2) {
        this.f12919b = progressBar;
        this.f12920c = j2;
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
        c.f.a.c.d.u.u.i iVarB = b();
        if (iVarB != null) {
            iVarB.c(this, this.f12920c);
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
        if (iVarB == null || !iVarB.p() || iVarB.r()) {
            this.f12919b.setMax(1);
            this.f12919b.setProgress(0);
        } else {
            this.f12919b.setMax((int) iVarB.o());
            this.f12919b.setProgress((int) iVarB.g());
        }
    }
}

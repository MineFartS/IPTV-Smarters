package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public final class v5 implements c.f.a.c.d.u.s<c.f.a.c.d.u.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u4 f13116a;

    public v5(u4 u4Var) {
        this.f13116a = u4Var;
    }

    @Override // c.f.a.c.d.u.s
    public final /* synthetic */ void g(c.f.a.c.d.u.q qVar, int i2) {
        this.f13116a.v((c.f.a.c.d.u.d) qVar);
        this.f13116a.f13096b.b(this.f13116a.f13097c.b(this.f13116a.f13101g, i2), v4.APP_SESSION_SUSPENDED);
        this.f13116a.k();
        this.f13116a.i();
    }

    @Override // c.f.a.c.d.u.s
    public final /* synthetic */ void h(c.f.a.c.d.u.q qVar, String str) {
        u4 u4Var = this.f13116a;
        u4Var.c(u4Var.f13100f, str);
        this.f13116a.f13096b.b(this.f13116a.f13097c.f(this.f13116a.f13101g), v4.APP_SESSION_RESUMING);
    }

    @Override // c.f.a.c.d.u.s
    public final /* synthetic */ void i(c.f.a.c.d.u.q qVar, int i2) {
        this.f13116a.n((c.f.a.c.d.u.d) qVar, i2);
    }

    @Override // c.f.a.c.d.u.s
    public final /* synthetic */ void j(c.f.a.c.d.u.q qVar, String str) {
        this.f13116a.v((c.f.a.c.d.u.d) qVar);
        this.f13116a.f13101g.f12933g = str;
        this.f13116a.f13096b.b(this.f13116a.f13097c.a(this.f13116a.f13101g), v4.APP_SESSION_RUNNING);
        this.f13116a.k();
        this.f13116a.h();
    }

    @Override // c.f.a.c.d.u.s
    public final /* synthetic */ void k(c.f.a.c.d.u.q qVar, int i2) {
        this.f13116a.n((c.f.a.c.d.u.d) qVar, i2);
    }

    @Override // c.f.a.c.d.u.s
    public final /* synthetic */ void l(c.f.a.c.d.u.q qVar, boolean z) {
        this.f13116a.v((c.f.a.c.d.u.d) qVar);
        this.f13116a.f13096b.b(this.f13116a.f13097c.c(this.f13116a.f13101g, z), v4.APP_SESSION_RESUMED);
        this.f13116a.k();
        this.f13116a.h();
    }

    @Override // c.f.a.c.d.u.s
    public final /* synthetic */ void m(c.f.a.c.d.u.q qVar, int i2) {
        this.f13116a.n((c.f.a.c.d.u.d) qVar, i2);
    }

    @Override // c.f.a.c.d.u.s
    public final /* synthetic */ void n(c.f.a.c.d.u.q qVar) {
        c.f.a.c.d.u.d dVar = (c.f.a.c.d.u.d) qVar;
        if (this.f13116a.f13101g != null) {
            u4.f13095a.g("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        this.f13116a.u(dVar);
        this.f13116a.f13096b.b(this.f13116a.f13097c.a(this.f13116a.f13101g), v4.APP_SESSION_STARTING);
    }

    @Override // c.f.a.c.d.u.s
    public final /* bridge */ /* synthetic */ void o(c.f.a.c.d.u.q qVar) {
    }
}

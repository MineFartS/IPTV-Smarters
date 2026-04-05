package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class w7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la f14416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa f14418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u8 f14419e;

    public w7(u8 u8Var, la laVar, boolean z, aa aaVar) {
        this.f14419e = u8Var;
        this.f14416b = laVar;
        this.f14417c = z;
        this.f14418d = aaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3 p3Var = this.f14419e.f14364d;
        if (p3Var == null) {
            this.f14419e.f14413a.c().o().a("Discarding data. Failed to set user property");
            return;
        }
        c.f.a.c.f.q.o.i(this.f14416b);
        this.f14419e.K(p3Var, this.f14417c ? null : this.f14418d, this.f14416b);
        this.f14419e.D();
    }
}

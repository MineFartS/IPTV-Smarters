package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class k8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la f14030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f14032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f14033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u8 f14034f;

    public k8(u8 u8Var, boolean z, la laVar, boolean z2, b bVar, b bVar2) {
        this.f14034f = u8Var;
        this.f14030b = laVar;
        this.f14031c = z2;
        this.f14032d = bVar;
        this.f14033e = bVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3 p3Var = this.f14034f.f14364d;
        if (p3Var == null) {
            this.f14034f.f14413a.c().o().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        c.f.a.c.f.q.o.i(this.f14030b);
        this.f14034f.K(p3Var, this.f14031c ? null : this.f14032d, this.f14030b);
        this.f14034f.D();
    }
}

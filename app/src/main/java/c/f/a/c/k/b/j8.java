package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class j8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la f14008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f14010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f14011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u8 f14012f;

    public j8(u8 u8Var, boolean z, la laVar, boolean z2, t tVar, String str) {
        this.f14012f = u8Var;
        this.f14008b = laVar;
        this.f14009c = z2;
        this.f14010d = tVar;
        this.f14011e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3 p3Var = this.f14012f.f14364d;
        if (p3Var == null) {
            this.f14012f.f14413a.c().o().a("Discarding data. Failed to send event to service");
            return;
        }
        c.f.a.c.f.q.o.i(this.f14008b);
        this.f14012f.K(p3Var, this.f14009c ? null : this.f14010d, this.f14008b);
        this.f14012f.D();
    }
}

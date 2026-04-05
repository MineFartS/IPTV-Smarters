package c.f.c.k;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f16094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.c.r.b f16095c;

    public l(x xVar, c.f.c.r.b bVar) {
        this.f16094b = xVar;
        this.f16095c = bVar;
    }

    public static Runnable a(x xVar, c.f.c.r.b bVar) {
        return new l(xVar, bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16094b.a(this.f16095c);
    }
}

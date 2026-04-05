package c.f.a.a.j.y.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f6276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.a.j.m f6277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f6279e;

    public h(m mVar, c.f.a.a.j.m mVar2, int i2, Runnable runnable) {
        this.f6276b = mVar;
        this.f6277c = mVar2;
        this.f6278d = i2;
        this.f6279e = runnable;
    }

    public static Runnable a(m mVar, c.f.a.a.j.m mVar2, int i2, Runnable runnable) {
        return new h(mVar, mVar2, i2, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        m.e(this.f6276b, this.f6277c, this.f6278d, this.f6279e);
    }
}

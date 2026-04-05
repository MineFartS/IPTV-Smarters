package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y5 f14041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f14042c;

    public l(m mVar, y5 y5Var) {
        this.f14042c = mVar;
        this.f14041b = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14041b.e();
        if (va.a()) {
            this.f14041b.d().r(this);
            return;
        }
        boolean zC = this.f14042c.c();
        m.e(this.f14042c, 0L);
        if (zC) {
            this.f14042c.a();
        }
    }
}

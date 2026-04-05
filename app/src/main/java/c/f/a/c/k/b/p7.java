package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class p7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n7 f14221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n7 f14222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f14223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f14224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u7 f14225f;

    public p7(u7 u7Var, n7 n7Var, n7 n7Var2, long j2, boolean z) {
        this.f14225f = u7Var;
        this.f14221b = n7Var;
        this.f14222c = n7Var2;
        this.f14223d = j2;
        this.f14224e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14225f.p(this.f14221b, this.f14222c, this.f14223d, this.f14224e, null);
    }
}

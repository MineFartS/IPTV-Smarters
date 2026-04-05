package c.f.c.k;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f16092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.c.r.b f16093c;

    public k(b0 b0Var, c.f.c.r.b bVar) {
        this.f16092b = b0Var;
        this.f16093c = bVar;
    }

    public static Runnable a(b0 b0Var, c.f.c.r.b bVar) {
        return new k(b0Var, bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16092b.d(this.f16093c);
    }
}

package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class e5 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f13839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ la f13840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v5 f13841d;

    public e5(v5 v5Var, b bVar, la laVar) {
        this.f13841d = v5Var;
        this.f13839b = bVar;
        this.f13840c = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13841d.f14388b.p();
        if (this.f13839b.f13739d.I() == null) {
            this.f13841d.f14388b.B(this.f13839b, this.f13840c);
        } else {
            this.f13841d.f14388b.z(this.f13839b, this.f13840c);
        }
    }
}

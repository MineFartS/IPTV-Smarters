package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class f5 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f13865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v5 f13866c;

    public f5(v5 v5Var, b bVar) {
        this.f13866c = v5Var;
        this.f13865b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13866c.f14388b.p();
        if (this.f13865b.f13739d.I() == null) {
            this.f13866c.f14388b.A(this.f13865b);
        } else {
            this.f13866c.f14388b.y(this.f13865b);
        }
    }
}

package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class o5 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f14186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ la f14187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v5 f14188d;

    public o5(v5 v5Var, t tVar, la laVar) {
        this.f14188d = v5Var;
        this.f14186b = tVar;
        this.f14187c = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVarC1 = this.f14188d.c1(this.f14186b, this.f14187c);
        this.f14188d.f14388b.p();
        this.f14188d.f14388b.g(tVarC1, this.f14187c);
    }
}

package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class r5 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aa f14276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ la f14277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v5 f14278d;

    public r5(v5 v5Var, aa aaVar, la laVar) {
        this.f14278d = v5Var;
        this.f14276b = aaVar;
        this.f14277c = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14278d.f14388b.p();
        if (this.f14276b.I() == null) {
            this.f14278d.f14388b.t(this.f14276b, this.f14277c);
        } else {
            this.f14278d.f14388b.s(this.f14276b, this.f14277c);
        }
    }
}

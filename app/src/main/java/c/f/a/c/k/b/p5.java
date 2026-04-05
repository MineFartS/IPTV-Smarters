package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class p5 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f14216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v5 f14218d;

    public p5(v5 v5Var, t tVar, String str) {
        this.f14218d = v5Var;
        this.f14216b = tVar;
        this.f14217c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14218d.f14388b.p();
        this.f14218d.f14388b.o0(this.f14216b, this.f14217c);
    }
}

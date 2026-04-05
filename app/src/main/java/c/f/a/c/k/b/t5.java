package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class t5 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la f14321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v5 f14322c;

    public t5(v5 v5Var, la laVar) {
        this.f14322c = v5Var;
        this.f14321b = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14322c.f14388b.p();
        this.f14322c.f14388b.x(this.f14321b);
    }
}

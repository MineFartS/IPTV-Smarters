package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class y8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x9 f14486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f14487c;

    public y8(a9 a9Var, x9 x9Var, Runnable runnable) {
        this.f14486b = x9Var;
        this.f14487c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14486b.p();
        this.f14486b.o(this.f14487c);
        this.f14486b.k();
    }
}

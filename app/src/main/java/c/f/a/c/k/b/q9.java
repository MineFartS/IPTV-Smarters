package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class q9 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y9 f14264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x9 f14265c;

    public q9(x9 x9Var, y9 y9Var) {
        this.f14265c = x9Var;
        this.f14264b = y9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x9.G(this.f14265c, this.f14264b);
        this.f14265c.V();
    }
}

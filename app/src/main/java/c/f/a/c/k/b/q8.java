package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class q8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3 f14262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t8 f14263c;

    public q8(t8 t8Var, p3 p3Var) {
        this.f14263c = t8Var;
        this.f14262b = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14263c) {
            t8.d(this.f14263c, false);
            if (!this.f14263c.f14331c.H()) {
                this.f14263c.f14331c.f14413a.c().v().a("Connected to remote service");
                this.f14263c.f14331c.s(this.f14262b);
            }
        }
    }
}

package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class o8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3 f14196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t8 f14197c;

    public o8(t8 t8Var, p3 p3Var) {
        this.f14197c = t8Var;
        this.f14196b = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14197c) {
            t8.d(this.f14197c, false);
            if (!this.f14197c.f14331c.H()) {
                this.f14197c.f14331c.f14413a.c().w().a("Connected to service");
                this.f14197c.f14331c.s(this.f14196b);
            }
        }
    }
}

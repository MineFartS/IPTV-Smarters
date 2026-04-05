package c.f.a.c.o;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f14581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Callable f14582c;

    public h0(g0 g0Var, Callable callable) {
        this.f14581b = g0Var;
        this.f14582c = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f14581b.q(this.f14582c.call());
        } catch (Exception e2) {
            this.f14581b.s(e2);
        } catch (Throwable th) {
            this.f14581b.s(new RuntimeException(th));
        }
    }
}

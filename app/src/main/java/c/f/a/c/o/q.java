package c.f.a.c.o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f14592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f14593c;

    public q(r rVar, i iVar) {
        this.f14593c = rVar;
        this.f14592b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            i iVar = (i) this.f14593c.f14595b.a(this.f14592b);
            if (iVar == null) {
                this.f14593c.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = k.f14585b;
            iVar.g(executor, this.f14593c);
            iVar.e(executor, this.f14593c);
            iVar.a(executor, this.f14593c);
        } catch (g e2) {
            if (e2.getCause() instanceof Exception) {
                this.f14593c.f14596c.s((Exception) e2.getCause());
            } else {
                this.f14593c.f14596c.s(e2);
            }
        } catch (Exception e3) {
            this.f14593c.f14596c.s(e3);
        }
    }
}

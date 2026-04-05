package c.f.a.c.k.b;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class a8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la f13727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u8 f13728c;

    public a8(u8 u8Var, la laVar) {
        this.f13728c = u8Var;
        this.f13727b = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3 p3Var = this.f13728c.f14364d;
        if (p3Var == null) {
            this.f13728c.f14413a.c().o().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            c.f.a.c.f.q.o.i(this.f13727b);
            p3Var.f2(this.f13727b);
            this.f13728c.f14413a.I().u();
            this.f13728c.K(p3Var, null, this.f13727b);
            this.f13728c.D();
        } catch (RemoteException e2) {
            this.f13728c.f14413a.c().o().b("Failed to send app launch to the service", e2);
        }
    }
}

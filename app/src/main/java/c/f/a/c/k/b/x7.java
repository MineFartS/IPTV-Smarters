package c.f.a.c.k.b;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class x7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la f14441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u8 f14442c;

    public x7(u8 u8Var, la laVar) {
        this.f14442c = u8Var;
        this.f14441b = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3 p3Var = this.f14442c.f14364d;
        if (p3Var == null) {
            this.f14442c.f14413a.c().o().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            c.f.a.c.f.q.o.i(this.f14441b);
            p3Var.N0(this.f14441b);
        } catch (RemoteException e2) {
            this.f14442c.f14413a.c().o().b("Failed to reset data on the service: remote exception", e2);
        }
        this.f14442c.D();
    }
}

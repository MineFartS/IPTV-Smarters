package c.f.a.c.k.b;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class g8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la f13920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u8 f13921c;

    public g8(u8 u8Var, la laVar) {
        this.f13921c = u8Var;
        this.f13920b = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3 p3Var = this.f13921c.f14364d;
        if (p3Var == null) {
            this.f13921c.f14413a.c().o().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            c.f.a.c.f.q.o.i(this.f13920b);
            p3Var.o1(this.f13920b);
            this.f13921c.D();
        } catch (RemoteException e2) {
            this.f13921c.f14413a.c().o().b("Failed to send measurementEnabled to the service", e2);
        }
    }
}

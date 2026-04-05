package c.f.a.c.k.b;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class i8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la f13974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u8 f13975c;

    public i8(u8 u8Var, la laVar) {
        this.f13975c = u8Var;
        this.f13974b = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3 p3Var = this.f13975c.f14364d;
        if (p3Var == null) {
            this.f13975c.f14413a.c().o().a("Failed to send consent settings to service");
            return;
        }
        try {
            c.f.a.c.f.q.o.i(this.f13974b);
            p3Var.x(this.f13974b);
            this.f13975c.D();
        } catch (RemoteException e2) {
            this.f13975c.f14413a.c().o().b("Failed to send consent settings to the service", e2);
        }
    }
}

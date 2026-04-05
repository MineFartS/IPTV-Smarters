package c.f.a.c.k.b;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class c8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la f13802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f13803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u8 f13804d;

    public c8(u8 u8Var, la laVar, Bundle bundle) {
        this.f13804d = u8Var;
        this.f13802b = laVar;
        this.f13803c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3 p3Var = this.f13804d.f14364d;
        if (p3Var == null) {
            this.f13804d.f14413a.c().o().a("Failed to send default event parameters to service");
            return;
        }
        try {
            c.f.a.c.f.q.o.i(this.f13802b);
            p3Var.S0(this.f13803c, this.f13802b);
        } catch (RemoteException e2) {
            this.f13804d.f14413a.c().o().b("Failed to send default event parameters to service", e2);
        }
    }
}

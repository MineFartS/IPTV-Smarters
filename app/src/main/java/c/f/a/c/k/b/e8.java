package c.f.a.c.k.b;

import android.os.RemoteException;
import c.f.a.c.j.h.td;

/* JADX INFO: loaded from: classes2.dex */
public final class e8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f13843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ td f13845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u8 f13846e;

    public e8(u8 u8Var, t tVar, String str, td tdVar) {
        this.f13846e = u8Var;
        this.f13843b = tVar;
        this.f13844c = str;
        this.f13845d = tdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZ0 = null;
        try {
            try {
                p3 p3Var = this.f13846e.f14364d;
                if (p3Var == null) {
                    this.f13846e.f14413a.c().o().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArrZ0 = p3Var.Z0(this.f13843b, this.f13844c);
                    this.f13846e.D();
                }
            } catch (RemoteException e2) {
                this.f13846e.f14413a.c().o().b("Failed to send event to the service to bundle", e2);
            }
        } finally {
            this.f13846e.f14413a.G().U(this.f13845d, bArrZ0);
        }
    }
}

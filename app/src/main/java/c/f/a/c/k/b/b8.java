package c.f.a.c.k.b;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class b8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n7 f13765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u8 f13766c;

    public b8(u8 u8Var, n7 n7Var) {
        this.f13766c = u8Var;
        this.f13765b = n7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j2;
        String str;
        String str2;
        String packageName;
        p3 p3Var = this.f13766c.f14364d;
        if (p3Var == null) {
            this.f13766c.f14413a.c().o().a("Failed to send current screen to service");
            return;
        }
        try {
            n7 n7Var = this.f13765b;
            if (n7Var == null) {
                j2 = 0;
                str = null;
                str2 = null;
                packageName = this.f13766c.f14413a.b().getPackageName();
            } else {
                j2 = n7Var.f14150c;
                str = n7Var.f14148a;
                str2 = n7Var.f14149b;
                packageName = this.f13766c.f14413a.b().getPackageName();
            }
            p3Var.v0(j2, str, str2, packageName);
            this.f13766c.D();
        } catch (RemoteException e2) {
            this.f13766c.f14413a.c().o().b("Failed to send current screen to the service", e2);
        }
    }
}

package c.f.a.c.k.b;

import android.os.RemoteException;
import c.f.a.c.j.h.td;

/* JADX INFO: loaded from: classes2.dex */
public final class z7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la f14509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ td f14510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u8 f14511d;

    public z7(u8 u8Var, la laVar, td tdVar) {
        this.f14511d = u8Var;
        this.f14509b = laVar;
        this.f14510c = tdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strI = null;
        try {
            try {
                c.f.a.c.j.h.ha.a();
                if (!this.f14511d.f14413a.z().w(null, m3.G0) || this.f14511d.f14413a.A().t().h()) {
                    p3 p3Var = this.f14511d.f14364d;
                    if (p3Var == null) {
                        this.f14511d.f14413a.c().o().a("Failed to get app instance id");
                    } else {
                        c.f.a.c.f.q.o.i(this.f14509b);
                        strI = p3Var.I(this.f14509b);
                        if (strI != null) {
                            this.f14511d.f14413a.F().r(strI);
                            this.f14511d.f14413a.A().f14183m.b(strI);
                        }
                        this.f14511d.D();
                    }
                } else {
                    this.f14511d.f14413a.c().t().a("Analytics storage consent denied; will not get app instance id");
                    this.f14511d.f14413a.F().r(null);
                    this.f14511d.f14413a.A().f14183m.b(null);
                }
            } catch (RemoteException e2) {
                this.f14511d.f14413a.c().o().b("Failed to get app instance id", e2);
            }
        } finally {
            this.f14511d.f14413a.G().R(this.f14510c, null);
        }
    }
}

package c.f.a.c.k.b;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class y7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ la f14484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u8 f14485d;

    public y7(u8 u8Var, AtomicReference atomicReference, la laVar) {
        this.f14485d = u8Var;
        this.f14483b = atomicReference;
        this.f14484c = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f14483b) {
            try {
                try {
                    c.f.a.c.j.h.ha.a();
                } finally {
                    this.f14483b.notify();
                }
            } catch (RemoteException e2) {
                this.f14485d.f14413a.c().o().b("Failed to get app instance id", e2);
                atomicReference = this.f14483b;
            }
            if (this.f14485d.f14413a.z().w(null, m3.G0) && !this.f14485d.f14413a.A().t().h()) {
                this.f14485d.f14413a.c().t().a("Analytics storage consent denied; will not get app instance id");
                this.f14485d.f14413a.F().r(null);
                this.f14485d.f14413a.A().f14183m.b(null);
                this.f14483b.set(null);
                return;
            }
            p3 p3Var = this.f14485d.f14364d;
            if (p3Var == null) {
                this.f14485d.f14413a.c().o().a("Failed to get app instance id");
                return;
            }
            c.f.a.c.f.q.o.i(this.f14484c);
            this.f14483b.set(p3Var.I(this.f14484c));
            String str = (String) this.f14483b.get();
            if (str != null) {
                this.f14485d.f14413a.F().r(str);
                this.f14485d.f14413a.A().f14183m.b(str);
            }
            this.f14485d.D();
            atomicReference = this.f14483b;
            atomicReference.notify();
        }
    }
}

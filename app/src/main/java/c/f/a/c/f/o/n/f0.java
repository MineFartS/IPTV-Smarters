package c.f.a.c.f.o.n;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.f.a.c.f.b f12393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f12394c;

    public f0(g0 g0Var, c.f.a.c.f.b bVar) {
        this.f12394c = g0Var;
        this.f12393b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var = (d0) this.f12394c.f12415f.q.get(this.f12394c.f12411b);
        if (d0Var == null) {
            return;
        }
        if (!this.f12393b.M()) {
            d0Var.p(this.f12393b, null);
            return;
        }
        g0.e(this.f12394c, true);
        if (this.f12394c.f12410a.requiresSignIn()) {
            this.f12394c.h();
            return;
        }
        try {
            this.f12394c.f12410a.getRemoteService(null, this.f12394c.f12410a.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e2) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
            this.f12394c.f12410a.disconnect("Failed to get service from broker.");
            d0Var.p(new c.f.a.c.f.b(10), null);
        }
    }
}

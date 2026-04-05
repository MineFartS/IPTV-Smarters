package c.f.a.c.k.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class q6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f14259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f7 f14260c;

    public q6(f7 f7Var, Bundle bundle) {
        this.f14260c = f7Var;
        this.f14259b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f7 f7Var = this.f14260c;
        Bundle bundle = this.f14259b;
        f7Var.g();
        f7Var.i();
        c.f.a.c.f.q.o.i(bundle);
        c.f.a.c.f.q.o.e(bundle.getString("name"));
        if (!f7Var.f14413a.k()) {
            f7Var.f14413a.c().w().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        aa aaVar = new aa(bundle.getString("name"), 0L, null, null);
        try {
            ea eaVarG = f7Var.f14413a.G();
            String string = bundle.getString("app_id");
            String string2 = bundle.getString("expired_event_name");
            Bundle bundle2 = bundle.getBundle("expired_event_params");
            String string3 = bundle.getString("origin");
            long j2 = bundle.getLong("creation_timestamp");
            c.f.a.c.j.h.l9.a();
            f7Var.f14413a.R().M(new b(bundle.getString("app_id"), bundle.getString("origin"), aaVar, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), eaVarG.J(string, string2, bundle2, string3, j2, true, false, f7Var.f14413a.z().w(null, m3.K0))));
        } catch (IllegalArgumentException unused) {
        }
    }
}

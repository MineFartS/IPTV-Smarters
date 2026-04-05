package c.f.a.c.k.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class p6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f14219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f7 f14220c;

    public p6(f7 f7Var, Bundle bundle) {
        this.f14220c = f7Var;
        this.f14219b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f7 f7Var = this.f14220c;
        Bundle bundle = this.f14219b;
        f7Var.g();
        f7Var.i();
        c.f.a.c.f.q.o.i(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        c.f.a.c.f.q.o.e(string);
        c.f.a.c.f.q.o.e(string2);
        c.f.a.c.f.q.o.i(bundle.get("value"));
        if (!f7Var.f14413a.k()) {
            f7Var.f14413a.c().w().a("Conditional property not set since app measurement is disabled");
            return;
        }
        aa aaVar = new aa(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            ea eaVarG = f7Var.f14413a.G();
            String string3 = bundle.getString("app_id");
            String string4 = bundle.getString("triggered_event_name");
            Bundle bundle2 = bundle.getBundle("triggered_event_params");
            c.f.a.c.j.h.l9.a();
            f fVarZ = f7Var.f14413a.z();
            l3<Boolean> l3Var = m3.K0;
            t tVarJ = eaVarG.J(string3, string4, bundle2, string2, 0L, true, false, fVarZ.w(null, l3Var));
            ea eaVarG2 = f7Var.f14413a.G();
            String string5 = bundle.getString("app_id");
            String string6 = bundle.getString("timed_out_event_name");
            Bundle bundle3 = bundle.getBundle("timed_out_event_params");
            c.f.a.c.j.h.l9.a();
            t tVarJ2 = eaVarG2.J(string5, string6, bundle3, string2, 0L, true, false, f7Var.f14413a.z().w(null, l3Var));
            ea eaVarG3 = f7Var.f14413a.G();
            String string7 = bundle.getString("app_id");
            String string8 = bundle.getString("expired_event_name");
            Bundle bundle4 = bundle.getBundle("expired_event_params");
            c.f.a.c.j.h.l9.a();
            f7Var.f14413a.R().M(new b(bundle.getString("app_id"), string2, aaVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), tVarJ2, bundle.getLong("trigger_timeout"), tVarJ, bundle.getLong("time_to_live"), eaVarG3.J(string7, string8, bundle4, string2, 0L, true, false, f7Var.f14413a.z().w(null, l3Var))));
        } catch (IllegalArgumentException unused) {
        }
    }
}

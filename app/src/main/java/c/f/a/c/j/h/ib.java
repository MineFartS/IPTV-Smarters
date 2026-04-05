package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class ib implements hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Boolean> f13375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3<Boolean> f13376c;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13374a = v3Var.b("measurement.client.sessions.check_on_reset_and_enable2", true);
        f13375b = v3Var.b("measurement.client.sessions.check_on_startup", true);
        f13376c = v3Var.b("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // c.f.a.c.j.h.hb
    public final boolean k() {
        return f13374a.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.hb
    public final boolean zza() {
        return true;
    }
}

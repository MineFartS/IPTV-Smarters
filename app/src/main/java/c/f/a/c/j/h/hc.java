package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class hc implements gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Boolean> f13357b;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13356a = v3Var.b("measurement.sdk.screen.manual_screen_view_logging", true);
        f13357b = v3Var.b("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    @Override // c.f.a.c.j.h.gc
    public final boolean k() {
        return f13356a.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.gc
    public final boolean l() {
        return f13357b.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.gc
    public final boolean zza() {
        return true;
    }
}

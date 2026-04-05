package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class ma implements la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Boolean> f13441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3<Boolean> f13442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x3<Long> f13443d;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13440a = v3Var.b("measurement.sdk.dynamite.allow_remote_dynamite3", true);
        f13441b = v3Var.b("measurement.collection.init_params_control_enabled", true);
        f13442c = v3Var.b("measurement.sdk.dynamite.use_dynamite3", true);
        f13443d = v3Var.a("measurement.id.sdk.dynamite.use_dynamite", 0L);
    }

    @Override // c.f.a.c.j.h.la
    public final boolean zza() {
        return f13440a.e().booleanValue();
    }
}

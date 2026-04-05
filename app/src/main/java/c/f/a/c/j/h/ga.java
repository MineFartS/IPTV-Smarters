package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class ga implements fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Boolean> f13340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3<Long> f13341c;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13339a = v3Var.b("measurement.service.configurable_service_limits", true);
        f13340b = v3Var.b("measurement.client.configurable_service_limits", true);
        f13341c = v3Var.a("measurement.id.service.configurable_service_limits", 0L);
    }

    @Override // c.f.a.c.j.h.fa
    public final boolean k() {
        return f13339a.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.fa
    public final boolean l() {
        return f13340b.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.fa
    public final boolean zza() {
        return true;
    }
}

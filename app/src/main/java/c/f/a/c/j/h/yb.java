package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class yb implements xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Boolean> f13668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3<Boolean> f13669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x3<Long> f13670d;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13667a = v3Var.b("measurement.client.global_params", true);
        f13668b = v3Var.b("measurement.service.global_params_in_payload", true);
        f13669c = v3Var.b("measurement.service.global_params", true);
        f13670d = v3Var.a("measurement.id.service.global_params", 0L);
    }

    @Override // c.f.a.c.j.h.xb
    public final boolean b() {
        return f13669c.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.xb
    public final boolean k() {
        return f13667a.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.xb
    public final boolean l() {
        return f13668b.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.xb
    public final boolean zza() {
        return true;
    }
}

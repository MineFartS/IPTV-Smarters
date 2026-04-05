package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class ja implements ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Boolean> f13386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3<Boolean> f13387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x3<Long> f13388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x3<Long> f13389e;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13385a = v3Var.b("measurement.client.consent_state_v1", false);
        f13386b = v3Var.b("measurement.client.3p_consent_state_v1", false);
        f13387c = v3Var.b("measurement.service.consent_state_v1_W36", true);
        f13388d = v3Var.a("measurement.id.service.consent_state_v1_W36", 0L);
        f13389e = v3Var.a("measurement.service.storage_consent_support_version", 203590L);
    }

    @Override // c.f.a.c.j.h.ia
    public final boolean b() {
        return f13387c.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.ia
    public final long d() {
        return f13389e.e().longValue();
    }

    @Override // c.f.a.c.j.h.ia
    public final boolean k() {
        return f13385a.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.ia
    public final boolean l() {
        return f13386b.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.ia
    public final boolean zza() {
        return true;
    }
}

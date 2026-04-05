package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class aa implements z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Long> f13202b;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13201a = v3Var.b("measurement.sdk.attribution.cache", true);
        f13202b = v3Var.a("measurement.sdk.attribution.cache.ttl", 604800000L);
    }

    @Override // c.f.a.c.j.h.z9
    public final long k() {
        return f13202b.e().longValue();
    }

    @Override // c.f.a.c.j.h.z9
    public final boolean zza() {
        return f13201a.e().booleanValue();
    }
}

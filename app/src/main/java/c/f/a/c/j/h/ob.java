package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class ob implements nb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Boolean> f13475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3<Long> f13476c;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13474a = v3Var.b("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f13475b = v3Var.b("measurement.collection.redundant_engagement_removal_enabled", false);
        f13476c = v3Var.a("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override // c.f.a.c.j.h.nb
    public final boolean zza() {
        return f13475b.e().booleanValue();
    }
}

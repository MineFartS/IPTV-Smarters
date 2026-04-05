package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class ec implements dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Long> f13310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Boolean> f13311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3<Boolean> f13312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x3<Boolean> f13313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x3<Long> f13314e;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13310a = v3Var.a("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f13311b = v3Var.b("measurement.lifecycle.app_backgrounded_engagement", false);
        f13312c = v3Var.b("measurement.lifecycle.app_backgrounded_tracking", true);
        f13313d = v3Var.b("measurement.lifecycle.app_in_background_parameter", false);
        f13314e = v3Var.a("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // c.f.a.c.j.h.dc
    public final boolean k() {
        return f13313d.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.dc
    public final boolean zza() {
        return f13311b.e().booleanValue();
    }
}

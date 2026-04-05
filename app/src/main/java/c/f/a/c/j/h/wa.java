package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class wa implements ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Boolean> f13612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3<Boolean> f13613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x3<Boolean> f13614d;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13611a = v3Var.b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f13612b = v3Var.b("measurement.audience.refresh_event_count_filters_timestamp", false);
        f13613c = v3Var.b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f13614d = v3Var.b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // c.f.a.c.j.h.ua
    public final boolean b() {
        return f13614d.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.ua
    public final boolean k() {
        return f13612b.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.ua
    public final boolean l() {
        return f13613c.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.ua
    public final boolean zza() {
        return true;
    }
}

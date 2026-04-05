package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class bc implements ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Boolean> f13224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3<Boolean> f13225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x3<Boolean> f13226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x3<Long> f13227e;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13223a = v3Var.b("measurement.sdk.collection.enable_extend_user_property_size", true);
        f13224b = v3Var.b("measurement.sdk.collection.last_deep_link_referrer2", true);
        f13225c = v3Var.b("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f13226d = v3Var.b("measurement.sdk.collection.last_gclid_from_referrer2", false);
        f13227e = v3Var.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // c.f.a.c.j.h.ac
    public final boolean b() {
        return f13226d.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.ac
    public final boolean k() {
        return f13224b.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.ac
    public final boolean l() {
        return f13225c.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.ac
    public final boolean zza() {
        return f13223a.e().booleanValue();
    }
}

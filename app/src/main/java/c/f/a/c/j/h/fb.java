package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class fb implements eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Long> f13328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Boolean> f13329b;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13328a = v3Var.a("measurement.id.service.use_appinfo_modified", 0L);
        f13329b = v3Var.b("measurement.service.use_appinfo_modified", false);
    }

    @Override // c.f.a.c.j.h.eb
    public final boolean k() {
        return f13329b.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.eb
    public final boolean zza() {
        return true;
    }
}

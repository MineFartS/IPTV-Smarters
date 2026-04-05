package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class n9 implements m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Boolean> f13460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3<Boolean> f13461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x3<Long> f13462d;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13459a = v3Var.b("measurement.client.ad_impression", true);
        f13460b = v3Var.b("measurement.service.separate_public_internal_event_blacklisting", true);
        f13461c = v3Var.b("measurement.service.ad_impression", true);
        f13462d = v3Var.a("measurement.id.service.ad_impression", 0L);
    }

    @Override // c.f.a.c.j.h.m9
    public final boolean b() {
        return f13461c.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.m9
    public final boolean k() {
        return f13459a.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.m9
    public final boolean l() {
        return f13460b.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.m9
    public final boolean zza() {
        return true;
    }
}

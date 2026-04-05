package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class za implements ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Long> f13691b;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13690a = v3Var.b("measurement.sdk.referrer.delayed_install_referrer_api", false);
        f13691b = v3Var.a("measurement.id.sdk.referrer.delayed_install_referrer_api", 0L);
    }

    @Override // c.f.a.c.j.h.ya
    public final boolean k() {
        return f13690a.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.ya
    public final boolean zza() {
        return true;
    }
}

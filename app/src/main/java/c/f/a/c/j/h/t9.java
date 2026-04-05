package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class t9 implements s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Boolean> f13534b;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13533a = v3Var.b("measurement.androidId.delete_feature", true);
        f13534b = v3Var.b("measurement.log_androidId_enabled", false);
    }

    @Override // c.f.a.c.j.h.s9
    public final boolean zza() {
        return f13533a.e().booleanValue();
    }
}

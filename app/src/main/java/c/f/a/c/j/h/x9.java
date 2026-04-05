package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class x9 implements w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Long> f13635b;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13634a = v3Var.b("measurement.service.directly_maybe_log_error_events", false);
        f13635b = v3Var.a("measurement.id.service.directly_maybe_log_error_events", 0L);
    }

    @Override // c.f.a.c.j.h.w9
    public final boolean k() {
        return f13634a.e().booleanValue();
    }

    @Override // c.f.a.c.j.h.w9
    public final boolean zza() {
        return true;
    }
}

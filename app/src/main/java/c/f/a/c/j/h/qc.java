package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class qc implements pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Double> f13498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3<Long> f13499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x3<Long> f13500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x3<String> f13501e;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13497a = v3Var.b("measurement.test.boolean_flag", false);
        f13498b = v3Var.c("measurement.test.double_flag", -3.0d);
        f13499c = v3Var.a("measurement.test.int_flag", -2L);
        f13500d = v3Var.a("measurement.test.long_flag", -1L);
        f13501e = v3Var.d("measurement.test.string_flag", "---");
    }

    @Override // c.f.a.c.j.h.pc
    public final long b() {
        return f13500d.e().longValue();
    }

    @Override // c.f.a.c.j.h.pc
    public final String d() {
        return f13501e.e();
    }

    @Override // c.f.a.c.j.h.pc
    public final double k() {
        return f13498b.e().doubleValue();
    }

    @Override // c.f.a.c.j.h.pc
    public final long l() {
        return f13499c.e().longValue();
    }

    @Override // c.f.a.c.j.h.pc
    public final boolean zza() {
        return f13497a.e().booleanValue();
    }
}

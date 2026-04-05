package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class pd implements od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Boolean> f13485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Long> f13486b;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13485a = v3Var.b("measurement.upload.file_lock_state_check", false);
        f13486b = v3Var.a("measurement.id.upload.file_lock_state_check", 0L);
    }

    @Override // c.f.a.c.j.h.od
    public final boolean zza() {
        return f13485a.e().booleanValue();
    }
}

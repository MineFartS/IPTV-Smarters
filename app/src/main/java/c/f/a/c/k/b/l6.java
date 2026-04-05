package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class l6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f7 f14062c;

    public l6(f7 f7Var, long j2) {
        this.f14062c = f7Var;
        this.f14061b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14062c.f14413a.A().q.b(this.f14061b);
        this.f14062c.f14413a.c().v().b("Session timeout duration set", Long.valueOf(this.f14061b));
    }
}

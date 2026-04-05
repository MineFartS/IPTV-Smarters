package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class s7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n7 f14299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u7 f14301d;

    public s7(u7 u7Var, n7 n7Var, long j2) {
        this.f14301d = u7Var;
        this.f14299b = n7Var;
        this.f14300c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14301d.q(this.f14299b, false, this.f14300c);
        u7 u7Var = this.f14301d;
        u7Var.f14353e = null;
        u7Var.f14413a.R().W(null);
    }
}

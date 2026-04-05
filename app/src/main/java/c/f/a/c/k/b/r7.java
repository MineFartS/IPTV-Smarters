package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class r7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u7 f14282c;

    public r7(u7 u7Var, long j2) {
        this.f14282c = u7Var;
        this.f14281b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14282c.f14413a.g().j(this.f14281b);
        this.f14282c.f14353e = null;
    }
}

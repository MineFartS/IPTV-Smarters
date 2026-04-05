package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class z6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f14507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f7 f14508c;

    public z6(f7 f7Var, Boolean bool) {
        this.f14508c = f7Var;
        this.f14507b = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14508c.L(this.f14507b, true);
    }
}

package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0 f13575e;

    public v(e0 e0Var, boolean z) {
        this.f13575e = e0Var;
        this.f13572b = e0Var.f13292d.a();
        this.f13573c = e0Var.f13292d.b();
        this.f13574d = z;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13575e.f13297i) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e2) {
            this.f13575e.q(e2, false, this.f13574d);
            b();
        }
    }
}

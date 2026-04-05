package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class j6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f7 f14003c;

    public j6(f7 f7Var, boolean z) {
        this.f14003c = f7Var;
        this.f14002b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zK = this.f14003c.f14413a.k();
        boolean zJ = this.f14003c.f14413a.j();
        this.f14003c.f14413a.i(this.f14002b);
        if (zJ == this.f14002b) {
            this.f14003c.f14413a.c().w().b("Default data collection state already set to", Boolean.valueOf(this.f14002b));
        }
        if (this.f14003c.f14413a.k() == zK || this.f14003c.f14413a.k() != this.f14003c.f14413a.j()) {
            this.f14003c.f14413a.c().t().c("Default data collection is different than actual status", Boolean.valueOf(this.f14002b), Boolean.valueOf(zK));
        }
        this.f14003c.M();
    }
}

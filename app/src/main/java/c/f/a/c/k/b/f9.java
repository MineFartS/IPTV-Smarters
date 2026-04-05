package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e9 f13891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k9 f13892b;

    public f9(k9 k9Var) {
        this.f13892b = k9Var;
    }

    public final void a() {
        this.f13892b.g();
        if (this.f13891a != null) {
            this.f13892b.f14035c.removeCallbacks(this.f13891a);
        }
        if (this.f13892b.f14413a.z().w(null, m3.v0)) {
            this.f13892b.f14413a.A().w.b(false);
        }
    }

    public final void b(long j2) {
        this.f13891a = new e9(this, this.f13892b.f14413a.a().a(), j2);
        this.f13892b.f14035c.postDelayed(this.f13891a, 2000L);
    }
}

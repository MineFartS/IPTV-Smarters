package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f4 extends e3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13864b;

    public f4(c5 c5Var) {
        super(c5Var);
        this.f14413a.o();
    }

    public final boolean h() {
        return this.f13864b;
    }

    public final void i() {
        if (!h()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f13864b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (l()) {
            return;
        }
        this.f14413a.p();
        this.f13864b = true;
    }

    public final void k() {
        if (this.f13864b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        m();
        this.f14413a.p();
        this.f13864b = true;
    }

    public abstract boolean l();

    public void m() {
    }
}

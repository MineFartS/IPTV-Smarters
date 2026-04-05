package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x5 extends w5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14438b;

    public x5(c5 c5Var) {
        super(c5Var);
        this.f14413a.o();
    }

    public abstract boolean h();

    public void i() {
    }

    public final boolean j() {
        return this.f14438b;
    }

    public final void k() {
        if (!j()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (this.f14438b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (h()) {
            return;
        }
        this.f14413a.p();
        this.f14438b = true;
    }

    public final void m() {
        if (this.f14438b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        i();
        this.f14413a.p();
        this.f14438b = true;
    }
}

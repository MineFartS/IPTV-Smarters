package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p9 extends o9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14228c;

    public p9(x9 x9Var) {
        super(x9Var);
        this.f14198b.u();
    }

    public final boolean h() {
        return this.f14228c;
    }

    public final void i() {
        if (!h()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f14228c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        k();
        this.f14198b.v();
        this.f14228c = true;
    }

    public abstract boolean k();
}

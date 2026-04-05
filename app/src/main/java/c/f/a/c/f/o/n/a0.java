package c.f.a.c.f.o.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f12364c;

    public a0(d0 d0Var, int i2) {
        this.f12364c = d0Var;
        this.f12363b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12364c.c(this.f12363b);
    }
}

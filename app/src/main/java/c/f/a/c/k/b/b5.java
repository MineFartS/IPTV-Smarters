package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class b5 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f6 f13754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c5 f13755c;

    public b5(c5 c5Var, f6 f6Var) {
        this.f13755c = c5Var;
        this.f13754b = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c5.t(this.f13755c, this.f13754b);
        this.f13755c.y(this.f13754b.f13873g);
    }
}

package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class l5 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la f14059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v5 f14060c;

    public l5(v5 v5Var, la laVar) {
        this.f14060c = v5Var;
        this.f14059b = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14060c.f14388b.p();
        this.f14060c.f14388b.r(this.f14059b);
    }
}

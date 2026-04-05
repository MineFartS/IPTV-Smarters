package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d2 f13771c;

    public c1(d2 d2Var, long j2) {
        this.f13771c = d2Var;
        this.f13770b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13771c.q(this.f13770b);
    }
}

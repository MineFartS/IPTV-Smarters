package c.f.a.c.o;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f14606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f14607c;

    public w(x xVar, i iVar) {
        this.f14607c = xVar;
        this.f14606b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14607c.f14609b) {
            if (this.f14607c.f14610c != null) {
                this.f14607c.f14610c.onFailure((Exception) c.f.a.c.f.q.o.i(this.f14606b.j()));
            }
        }
    }
}

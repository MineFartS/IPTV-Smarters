package c.f.a.c.o;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f14601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f14602c;

    public u(v vVar, i iVar) {
        this.f14602c = vVar;
        this.f14601b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14602c.f14604b) {
            if (this.f14602c.f14605c != null) {
                this.f14602c.f14605c.a(this.f14601b);
            }
        }
    }
}

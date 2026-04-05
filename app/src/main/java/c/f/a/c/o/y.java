package c.f.a.c.o;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f14611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f14612c;

    public y(z zVar, i iVar) {
        this.f14612c = zVar;
        this.f14611b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14612c.f14614b) {
            if (this.f14612c.f14615c != null) {
                this.f14612c.f14615c.a(this.f14611b.k());
            }
        }
    }
}

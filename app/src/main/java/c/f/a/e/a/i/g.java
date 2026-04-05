package c.f.a.e.a.i;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f15755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f15756c;

    public g(h hVar, d dVar) {
        this.f15756c = hVar;
        this.f15755b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15756c.f15758b) {
            if (this.f15756c.f15759c != null) {
                this.f15756c.f15759c.onFailure(this.f15755b.c());
            }
        }
    }
}

package c.f.a.e.a.i;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f15760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f15761c;

    public i(j jVar, d dVar) {
        this.f15761c = jVar;
        this.f15760b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15761c.f15763b) {
            if (this.f15761c.f15764c != null) {
                this.f15761c.f15764c.a(this.f15760b.d());
            }
        }
    }
}

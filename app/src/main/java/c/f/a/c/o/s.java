package c.f.a.c.o;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f14597b;

    public s(t tVar) {
        this.f14597b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f14597b.f14599b) {
            if (this.f14597b.f14600c != null) {
                this.f14597b.f14600c.c();
            }
        }
    }
}

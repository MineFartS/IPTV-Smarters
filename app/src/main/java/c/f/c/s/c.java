package c.f.c.s;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f16250b;

    public c(f fVar) {
        this.f16250b = fVar;
    }

    public static Runnable a(f fVar) {
        return new c(fVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16250b.f(false);
    }
}

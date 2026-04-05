package k.g0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30554b;

    public b(String str, Object... objArr) {
        this.f30554b = c.l(str, objArr);
    }

    public abstract void k();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f30554b);
        try {
            k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}

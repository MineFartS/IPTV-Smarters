package c.k.a.y;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18346b;

    public d(String str, Object... objArr) {
        this.f18346b = String.format(str, objArr);
    }

    public abstract void k();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f18346b);
        try {
            k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}

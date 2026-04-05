package c.f.a.e.a.e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.e.a.i.m<?> f15708b;

    public b() {
        this.f15708b = null;
    }

    public b(c.f.a.e.a.i.m<?> mVar) {
        this.f15708b = mVar;
    }

    public abstract void a();

    public final c.f.a.e.a.i.m<?> b() {
        return this.f15708b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e2) {
            c.f.a.e.a.i.m<?> mVar = this.f15708b;
            if (mVar != null) {
                mVar.d(e2);
            }
        }
    }
}

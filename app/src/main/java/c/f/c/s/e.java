package c.f.c.s;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f16253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16254c;

    public e(f fVar, boolean z) {
        this.f16253b = fVar;
        this.f16254c = z;
    }

    public static Runnable a(f fVar, boolean z) {
        return new e(fVar, z);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16253b.e(this.f16254c);
    }
}

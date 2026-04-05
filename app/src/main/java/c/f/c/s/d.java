package c.f.c.s;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f16251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16252c;

    public d(f fVar, boolean z) {
        this.f16251b = fVar;
        this.f16252c = z;
    }

    public static Runnable a(f fVar, boolean z) {
        return new d(fVar, z);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16251b.f(this.f16252c);
    }
}

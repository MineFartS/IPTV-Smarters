package c.f.a.e.a.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f15592b;

    public r1(v vVar) {
        this.f15592b = vVar;
    }

    public static Runnable a(v vVar) {
        return new r1(vVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15592b.F();
    }
}

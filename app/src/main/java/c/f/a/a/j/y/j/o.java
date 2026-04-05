package c.f.a.a.j.y.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f6305b;

    public o(q qVar) {
        this.f6305b = qVar;
    }

    public static Runnable a(q qVar) {
        return new o(qVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        q qVar = this.f6305b;
        qVar.f6310d.d(p.a(qVar));
    }
}

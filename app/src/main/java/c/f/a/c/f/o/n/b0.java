package c.f.a.c.f.o.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f12369b;

    public b0(c0 c0Var) {
        this.f12369b = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12369b.f12376a.f12378c.disconnect(this.f12369b.f12376a.f12378c.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}

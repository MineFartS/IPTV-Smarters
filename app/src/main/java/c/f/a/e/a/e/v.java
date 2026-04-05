package c.f.a.e.a.e;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f15741a = new u();

    @Override // c.f.a.e.a.e.s
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.f15741a.a(th).add(th2);
    }
}

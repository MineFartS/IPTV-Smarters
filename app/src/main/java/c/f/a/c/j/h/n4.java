package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class n4 extends k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4 f13454a = new m4();

    @Override // c.f.a.c.j.h.k4
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        this.f13454a.a(th, true).add(th2);
    }
}

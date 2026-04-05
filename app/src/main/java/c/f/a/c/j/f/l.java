package c.f.a.c.j.f;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f13184a = new k();

    @Override // c.f.a.c.j.f.i
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        this.f13184a.a(th, true).add(th2);
    }
}

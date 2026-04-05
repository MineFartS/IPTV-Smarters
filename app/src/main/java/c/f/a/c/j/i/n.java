package c.f.a.c.j.i;

/* JADX INFO: loaded from: classes2.dex */
public final class n<E> extends l<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<E> f13701d;

    public n(p<E> pVar, int i2) {
        super(pVar.size(), i2);
        this.f13701d = pVar;
    }

    @Override // c.f.a.c.j.i.l
    public final E a(int i2) {
        return this.f13701d.get(i2);
    }
}

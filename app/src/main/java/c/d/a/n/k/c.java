package c.d.a.n.k;

import c.d.a.n.i.l;

/* JADX INFO: loaded from: classes.dex */
public class c<T> implements l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f5708a;

    public c(T t) {
        if (t == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.f5708a = t;
    }

    @Override // c.d.a.n.i.l
    public void b() {
    }

    @Override // c.d.a.n.i.l
    public final T get() {
        return this.f5708a;
    }

    @Override // c.d.a.n.i.l
    public final int getSize() {
        return 1;
    }
}

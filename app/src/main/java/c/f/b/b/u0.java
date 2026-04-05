package c.f.b.b;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u0<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<? extends F> f15966b;

    public u0(Iterator<? extends F> it) {
        this.f15966b = (Iterator) c.f.b.a.k.j(it);
    }

    public abstract T a(F f2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15966b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f15966b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f15966b.remove();
    }
}

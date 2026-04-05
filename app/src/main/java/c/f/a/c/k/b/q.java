package c.f.a.c.k.b;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Iterator<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<String> f14237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f14238c;

    public q(r rVar) {
        this.f14238c = rVar;
        this.f14237b = rVar.f14270b.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return this.f14237b.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14237b.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}

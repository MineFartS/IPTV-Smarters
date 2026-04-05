package c.f.a.c.j.c;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class pd implements Iterator<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator<String> f13029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ md f13030c;

    public pd(md mdVar) {
        this.f13030c = mdVar;
        this.f13029b = mdVar.f12949b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13029b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f13029b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

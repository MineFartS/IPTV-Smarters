package c.f.a.c.j.h;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class v8 implements Iterator<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<String> f13594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w8 f13595c;

    public v8(w8 w8Var) {
        this.f13595c = w8Var;
        this.f13594b = w8Var.f13610b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13594b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f13594b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

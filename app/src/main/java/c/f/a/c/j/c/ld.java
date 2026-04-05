package c.f.a.c.j.c;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ld implements ListIterator<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListIterator<String> f12934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md f12936d;

    public ld(md mdVar, int i2) {
        this.f12936d = mdVar;
        this.f12935c = i2;
        this.f12934b = mdVar.f12949b.listIterator(i2);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12934b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12934b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f12934b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12934b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f12934b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12934b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}

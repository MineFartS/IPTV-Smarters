package c.f.a.c.j.h;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class u8 implements ListIterator<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListIterator<String> f13566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w8 f13568d;

    public u8(w8 w8Var, int i2) {
        this.f13568d = w8Var;
        this.f13567c = i2;
        this.f13566b = w8Var.f13610b.listIterator(i2);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f13566b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13566b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f13566b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13566b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f13566b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13566b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}

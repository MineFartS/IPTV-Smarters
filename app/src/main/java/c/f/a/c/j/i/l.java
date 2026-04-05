package c.f.a.c.j.i;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l<E> extends s<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13699c;

    public l(int i2, int i3) {
        j.b(i3, i2, "index");
        this.f13698b = i2;
        this.f13699c = i3;
    }

    public abstract E a(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f13699c < this.f13698b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13699c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f13699c;
        this.f13699c = i2 + 1;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13699c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f13699c - 1;
        this.f13699c = i2;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13699c - 1;
    }
}

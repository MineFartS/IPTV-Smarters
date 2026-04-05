package c.f.b.b;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<E> extends x0<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15805c;

    public a(int i2, int i3) {
        c.f.b.a.k.l(i3, i2);
        this.f15804b = i2;
        this.f15805c = i3;
    }

    public abstract E a(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f15805c < this.f15804b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15805c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f15805c;
        this.f15805c = i2 + 1;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15805c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f15805c - 1;
        this.f15805c = i2;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15805c - 1;
    }
}

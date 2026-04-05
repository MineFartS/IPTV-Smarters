package c.f.a.c.j.c;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h1<E> extends z1<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12857c;

    public h1(int i2, int i3) {
        c1.e(i3, i2);
        this.f12856b = i2;
        this.f12857c = i3;
    }

    public abstract E a(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f12857c < this.f12856b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12857c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f12857c;
        this.f12857c = i2 + 1;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12857c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f12857c - 1;
        this.f12857c = i2;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12857c - 1;
    }
}

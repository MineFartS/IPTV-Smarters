package com.google.ads.interactivemedia.v3.internal;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class avu<E> extends avt<E> implements ListIterator<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20629b;

    public avu() {
    }

    public avu(int i2, int i3) {
        this();
        ars.h(i3, i2);
        this.f20628a = i2;
        this.f20629b = i3;
    }

    public abstract Object a(int i2);

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f20629b < this.f20628a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20629b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f20629b;
        this.f20629b = i2 + 1;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20629b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f20629b - 1;
        this.f20629b = i2;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20629b - 1;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e2) {
        throw new UnsupportedOperationException();
    }
}

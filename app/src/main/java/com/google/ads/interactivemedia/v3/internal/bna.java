package com.google.ads.interactivemedia.v3.internal;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class bna implements ListIterator<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListIterator<String> f21441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bnc f21443c;

    public bna(bnc bncVar, int i2) {
        this.f21443c = bncVar;
        this.f21442b = i2;
        this.f21441a = bncVar.f21446a.listIterator(i2);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f21441a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21441a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f21441a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21441a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f21441a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21441a.previousIndex();
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

package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class bnc extends AbstractList<String> implements RandomAccess, blk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final blk f21446a;

    public bnc(blk blkVar) {
        this.f21446a = blkVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blk
    public final blk e() {
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blk
    public final Object f(int i2) {
        return this.f21446a.f(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return ((blj) this.f21446a).get(i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blk
    public final List<?> h() {
        return this.f21446a.h();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blk
    public final void i(bkd bkdVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new bnb(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i2) {
        return new bna(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21446a.size();
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class avs<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator<? extends F> f20627a;

    public avs(Iterator<? extends F> it) {
        ars.g(it);
        this.f20627a = it;
    }

    public abstract T a(F f2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20627a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f20627a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f20627a.remove();
    }
}

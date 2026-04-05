package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class atp<K, V, T> extends AbstractSet<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final atq<K, V> f20530b;

    public atp(atq<K, V> atqVar) {
        this.f20530b = atqVar;
    }

    public abstract T a(int i2);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f20530b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<T> iterator() {
        return new ato(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20530b.f20533c;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ave<T> implements Comparator<T> {
    public static <T> ave<T> b(Comparator<T> comparator) {
        return comparator instanceof ave ? (ave) comparator : new atb(comparator);
    }

    public static <C extends Comparable> ave<C> c() {
        return avd.f20598a;
    }

    public <S extends T> ave<S> a() {
        return new avn(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);
}

package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class aun implements Iterator<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aun f20582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ aun[] f20583b;

    static {
        aun aunVar = new aun();
        f20582a = aunVar;
        f20583b = new aun[]{aunVar};
    }

    private aun() {
    }

    public static aun[] values() {
        return (aun[]) f20583b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        auv.p(false);
    }
}

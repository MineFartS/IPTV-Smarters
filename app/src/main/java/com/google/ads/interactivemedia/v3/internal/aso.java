package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class aso extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ asp f20476a;

    public aso(asp aspVar) {
        this.f20476a = aspVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f20476a.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20476a.y(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f20476a.f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f20476a.d();
    }
}

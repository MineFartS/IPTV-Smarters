package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class asz extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ata f20492a;

    public asz(ata ataVar) {
        this.f20492a = ataVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f20492a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ata ataVar = this.f20492a;
        Map mapK = ataVar.k();
        return mapK != null ? mapK.values().iterator() : new asu(ataVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f20492a.size();
    }
}

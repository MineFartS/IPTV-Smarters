package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bnb implements Iterator<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator<String> f21444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bnc f21445b;

    public bnb(bnc bncVar) {
        this.f21445b = bncVar;
        this.f21444a = bncVar.f21446a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21444a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f21444a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

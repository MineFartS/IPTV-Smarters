package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class asb implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map.Entry f20455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f20456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ asc f20457c;

    public asb(asc ascVar, Iterator it) {
        this.f20457c = ascVar;
        this.f20456b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20456b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f20456b.next();
        this.f20455a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        auv.p(this.f20455a != null);
        Collection collection = (Collection) this.f20455a.getValue();
        this.f20456b.remove();
        asm.t(this.f20457c.f20458a, collection.size());
        collection.clear();
        this.f20455a = null;
    }
}

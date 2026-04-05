package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class asi implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f20464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f20465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ asj f20466c;

    public asi(asj asjVar) {
        this.f20466c = asjVar;
        Collection collection = asjVar.f20468b;
        this.f20465b = collection;
        this.f20464a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public asi(asj asjVar, Iterator it) {
        this.f20466c = asjVar;
        this.f20465b = asjVar.f20468b;
        this.f20464a = it;
    }

    public final void a() {
        this.f20466c.b();
        if (this.f20466c.f20468b != this.f20465b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f20464a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f20464a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f20464a.remove();
        asm.r(this.f20466c.f20471e);
        this.f20466c.c();
    }
}

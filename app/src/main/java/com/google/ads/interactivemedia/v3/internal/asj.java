package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class asj extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f20468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final asj f20469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection f20470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ asm f20471e;

    public asj(asm asmVar, Object obj, Collection collection, asj asjVar) {
        this.f20471e = asmVar;
        this.f20467a = obj;
        this.f20468b = collection;
        this.f20469c = asjVar;
        this.f20470d = asjVar == null ? null : asjVar.f20468b;
    }

    public final void a() {
        asj asjVar = this.f20469c;
        if (asjVar != null) {
            asjVar.a();
        } else {
            this.f20471e.f20474a.put(this.f20467a, this.f20468b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.f20468b.isEmpty();
        boolean zAdd = this.f20468b.add(obj);
        if (!zAdd) {
            return zAdd;
        }
        asm.q(this.f20471e);
        if (!zIsEmpty) {
            return zAdd;
        }
        a();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f20468b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        asm.s(this.f20471e, this.f20468b.size() - size);
        if (size != 0) {
            return zAddAll;
        }
        a();
        return true;
    }

    public final void b() {
        Collection collection;
        asj asjVar = this.f20469c;
        if (asjVar != null) {
            asjVar.b();
            if (this.f20469c.f20468b != this.f20470d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f20468b.isEmpty() || (collection = (Collection) this.f20471e.f20474a.get(this.f20467a)) == null) {
                return;
            }
            this.f20468b = collection;
        }
    }

    public final void c() {
        asj asjVar = this.f20469c;
        if (asjVar != null) {
            asjVar.c();
        } else if (this.f20468b.isEmpty()) {
            this.f20471e.f20474a.remove(this.f20467a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f20468b.clear();
        asm.t(this.f20471e, size);
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.f20468b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        b();
        return this.f20468b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f20468b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.f20468b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new asi(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.f20468b.remove(obj);
        if (zRemove) {
            asm.r(this.f20471e);
            c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f20468b.removeAll(collection);
        if (zRemoveAll) {
            asm.s(this.f20471e, this.f20468b.size() - size);
            c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        ars.g(collection);
        int size = size();
        boolean zRetainAll = this.f20468b.retainAll(collection);
        if (zRetainAll) {
            asm.s(this.f20471e, this.f20468b.size() - size);
            c();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.f20468b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f20468b.toString();
    }
}

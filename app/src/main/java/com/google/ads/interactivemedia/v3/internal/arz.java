package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class arz extends auu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Map f20439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ asm f20440b;

    public arz(asm asmVar, Map map) {
        this.f20440b = asmVar;
        this.f20439a = map;
    }

    public final Map.Entry a(Map.Entry entry) {
        Object key = entry.getKey();
        return auv.d(key, this.f20440b.c(key, (Collection) entry.getValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auu
    public final Set<Map.Entry> b() {
        return new arx(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.f20439a == this.f20440b.f20474a) {
            this.f20440b.o();
        } else {
            auv.g(new ary(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f20439a;
        ars.g(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f20439a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) auv.b(this.f20439a, obj);
        if (collection == null) {
            return null;
        }
        return this.f20440b.c(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f20439a.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auu, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f20440b.x();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f20439a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionA = this.f20440b.a();
        collectionA.addAll(collection);
        asm.t(this.f20440b, collection.size());
        collection.clear();
        return collectionA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20439a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f20439a.toString();
    }
}

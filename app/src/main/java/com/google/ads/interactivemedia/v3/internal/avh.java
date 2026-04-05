package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class avh<K, V> extends auk<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient aud<K, V> f20603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient Object[] f20604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f20605c;

    public avh(aud<K, V> audVar, Object[] objArr, int i2) {
        this.f20603a = audVar;
        this.f20604b = objArr;
        this.f20605c = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final int a(Object[] objArr, int i2) {
        return d().a(objArr, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f20603a.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, com.google.ads.interactivemedia.v3.internal.ats, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final avt<Map.Entry<K, V>> listIterator() {
        return d().iterator();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final boolean f() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk
    public final aty<Map.Entry<K, V>> i() {
        return new avg(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20605c;
    }
}

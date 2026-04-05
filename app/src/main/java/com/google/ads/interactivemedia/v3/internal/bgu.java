package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bgu<K, V> implements Map.Entry<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bgu<K, V> f21094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bgu<K, V> f21095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bgu<K, V> f21096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bgu<K, V> f21097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bgu<K, V> f21098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K f21099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public V f21100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21101h;

    public bgu() {
        this.f21099f = null;
        this.f21098e = this;
        this.f21097d = this;
    }

    public bgu(bgu<K, V> bguVar, K k2, bgu<K, V> bguVar2, bgu<K, V> bguVar3) {
        this.f21094a = bguVar;
        this.f21099f = k2;
        this.f21101h = 1;
        this.f21097d = bguVar2;
        this.f21098e = bguVar3;
        bguVar3.f21097d = this;
        bguVar2.f21098e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.f21099f;
            if (k2 != null ? k2.equals(entry.getKey()) : entry.getKey() == null) {
                V v = this.f21100g;
                Object value = entry.getValue();
                if (v == null) {
                    if (value == null) {
                        return true;
                    }
                } else if (v.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f21099f;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f21100g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k2 = this.f21099f;
        int iHashCode = k2 == null ? 0 : k2.hashCode();
        V v = this.f21100g;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.f21100g;
        this.f21100g = v;
        return v2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f21099f);
        String strValueOf2 = String.valueOf(this.f21100g);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}

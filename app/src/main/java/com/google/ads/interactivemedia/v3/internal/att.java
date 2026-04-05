package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class att<K, V> extends asn<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f20550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f20551b;

    public att(K k2, V v) {
        this.f20550a = k2;
        this.f20551b = v;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asn, java.util.Map.Entry
    public final K getKey() {
        return this.f20550a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asn, java.util.Map.Entry
    public final V getValue() {
        return this.f20551b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asn, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}

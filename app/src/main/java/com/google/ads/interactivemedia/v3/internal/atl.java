package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class atl<K, V> extends atp<K, V, Map.Entry<V, K>> {
    public atl(atq<K, V> atqVar) {
        super(atqVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atp
    public final /* bridge */ /* synthetic */ Object a(int i2) {
        return new ati(this.f20530b, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iE = this.f20530b.e(key);
            if (iE != -1 && auv.w(this.f20530b.f20531a[iE], value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int iU = auv.u(key);
        int iF = this.f20530b.f(key, iU);
        if (iF == -1 || !auv.w(this.f20530b.f20531a[iF], value)) {
            return false;
        }
        this.f20530b.k(iF, iU);
        return true;
    }
}

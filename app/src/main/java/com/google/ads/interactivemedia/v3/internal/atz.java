package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class atz<K, V> extends auf<K, V> {
    public final aua<K, V> a() {
        Set<Map.Entry<K, Collection<V>>> setEntrySet = this.f20570a.entrySet();
        if (setEntrySet.isEmpty()) {
            return atf.f20513a;
        }
        aub aubVar = new aub(setEntrySet.size());
        int size = 0;
        for (Map.Entry<K, Collection<V>> entry : setEntrySet) {
            K key = entry.getKey();
            aty atyVarL = aty.l(entry.getValue());
            if (!atyVarL.isEmpty()) {
                aubVar.b(key, atyVarL);
                size += atyVarL.size();
            }
        }
        return new aua<>(aubVar.a(), size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.auf
    public final /* bridge */ /* synthetic */ void b(Object obj, Iterable iterable) {
        super.b(obj, iterable);
    }

    public final void c(K k2, V... vArr) {
        b(k2, Arrays.asList(vArr));
    }
}

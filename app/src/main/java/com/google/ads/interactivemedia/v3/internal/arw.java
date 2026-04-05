package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class arw<K, V> extends asm<K, V> implements auo<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public arw(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asm
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.asm
    public final <E> Collection<E> b(Collection<E> collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asm
    public final Collection<V> c(K k2, Collection<V> collection) {
        return g(k2, (List) collection, null);
    }
}

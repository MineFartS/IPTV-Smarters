package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class auf<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<K, Collection<V>> f20570a = ata.f();

    public void b(K k2, Iterable<? extends V> iterable) {
        Collection<V> collection = this.f20570a.get(k2);
        Iterator<? extends V> it = iterable.iterator();
        if (collection != null) {
            while (it.hasNext()) {
                V next = it.next();
                auv.o(k2, next);
                collection.add(next);
            }
            return;
        }
        if (it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                V next2 = it.next();
                auv.o(k2, next2);
                arrayList.add(next2);
            }
            this.f20570a.put(k2, arrayList);
        }
    }
}

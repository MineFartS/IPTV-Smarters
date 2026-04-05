package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class auz<K0> {
    public abstract <K extends K0, V> Map<K, Collection<V>> a();

    public final ava b() {
        auv.q(2, "expectedValuesPerKey");
        return new ava(this);
    }
}

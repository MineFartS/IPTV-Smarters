package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aub<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f20560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20561b;

    public aub() {
        this(4);
    }

    public aub(int i2) {
        this.f20560a = new Object[i2 + i2];
        this.f20561b = 0;
    }

    private final void d(int i2) {
        int i3 = i2 + i2;
        Object[] objArr = this.f20560a;
        int length = objArr.length;
        if (i3 > length) {
            this.f20560a = Arrays.copyOf(objArr, atr.a(length, i3));
        }
    }

    public final aud<K, V> a() {
        return avk.l(this.f20561b, this.f20560a);
    }

    public final void b(K k2, V v) {
        d(this.f20561b + 1);
        auv.o(k2, v);
        Object[] objArr = this.f20560a;
        int i2 = this.f20561b;
        int i3 = i2 + i2;
        objArr[i3] = k2;
        objArr[i3 + 1] = v;
        this.f20561b = i2 + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            d(this.f20561b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            b(entry.getKey(), entry.getValue());
        }
    }
}

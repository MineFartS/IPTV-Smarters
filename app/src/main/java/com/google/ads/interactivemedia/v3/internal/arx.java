package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class arx extends aur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ arz f20435a;

    public arx(arz arzVar) {
        this.f20435a = arzVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aur
    public final Map a() {
        return this.f20435a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aur, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f20435a.f20439a.entrySet();
        ars.g(setEntrySet);
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new ary(this.f20435a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aur, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        asm.n(this.f20435a.f20440b, ((Map.Entry) obj).getKey());
        return true;
    }
}

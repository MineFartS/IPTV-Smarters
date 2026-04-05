package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class asv extends AbstractSet<Map.Entry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ata f20483a;

    public asv(ata ataVar) {
        this.f20483a = ataVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f20483a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapK = this.f20483a.k();
        if (mapK != null) {
            return mapK.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iR = this.f20483a.r(entry.getKey());
            if (iR != -1 && auv.w(this.f20483a.f20501c[iR], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return this.f20483a.j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapK = this.f20483a.k();
        if (mapK != null) {
            return mapK.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f20483a.o()) {
            return false;
        }
        int iQ = this.f20483a.q();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = this.f20483a.f20502e;
        ata ataVar = this.f20483a;
        int iK = auv.k(key, value, iQ, obj2, ataVar.f20499a, ataVar.f20500b, ataVar.f20501c);
        if (iK == -1) {
            return false;
        }
        this.f20483a.n(iK, iQ);
        ata.p(this.f20483a);
        this.f20483a.l();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20483a.size();
    }
}

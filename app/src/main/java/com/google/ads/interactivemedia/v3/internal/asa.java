package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class asa<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator<Map.Entry> f20451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f20452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f20453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ asm f20454d;

    public asa(asm asmVar) {
        this.f20454d = asmVar;
        this.f20451a = asmVar.f20474a.entrySet().iterator();
        this.f20452b = null;
        this.f20453c = aun.f20582a;
    }

    public asa(asm asmVar, byte[] bArr) {
        this(asmVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20451a.hasNext() || this.f20453c.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.f20453c.hasNext()) {
            Map.Entry next = this.f20451a.next();
            next.getKey();
            Collection collection = (Collection) next.getValue();
            this.f20452b = collection;
            this.f20453c = collection.iterator();
        }
        return (T) this.f20453c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f20453c.remove();
        if (this.f20452b.isEmpty()) {
            this.f20451a.remove();
        }
        asm.r(this.f20454d);
    }
}

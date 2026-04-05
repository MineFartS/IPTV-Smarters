package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ary implements Iterator<Map.Entry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator<Map.Entry> f20436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f20437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ arz f20438c;

    public ary(arz arzVar) {
        this.f20438c = arzVar;
        this.f20436a = arzVar.f20439a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20436a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        Map.Entry next = this.f20436a.next();
        this.f20437b = (Collection) next.getValue();
        return this.f20438c.a(next);
    }

    @Override // java.util.Iterator
    public final void remove() {
        auv.p(this.f20437b != null);
        this.f20436a.remove();
        asm.t(this.f20438c.f20440b, this.f20437b.size());
        this.f20437b.clear();
        this.f20437b = null;
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bgq extends AbstractSet<Map.Entry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bgv f21088a;

    public bgq(bgv bgvVar) {
        this.f21088a = bgvVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f21088a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.f21088a.b((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new bgp(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        bgu bguVarB;
        if (!(obj instanceof Map.Entry) || (bguVarB = this.f21088a.b((Map.Entry) obj)) == null) {
            return false;
        }
        this.f21088a.e(bguVarB, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21088a.f21105c;
    }
}

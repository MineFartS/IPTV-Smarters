package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class aui<K, V> extends asq<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient aud<K, ? extends ats<V>> f20574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f20575c;

    public aui(aud<K, ? extends ats<V>> audVar, int i2) {
        this.f20574b = audVar;
        this.f20575c = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auw
    public final int d() {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asp
    public final /* bridge */ /* synthetic */ Collection e() {
        return new auh(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asp
    public final Map<K, Collection<V>> j() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asp
    public final Set<K> l() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auw
    @Deprecated
    public final void o() {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asp, com.google.ads.interactivemedia.v3.internal.auw
    @Deprecated
    public final void u(K k2, V v) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asp, com.google.ads.interactivemedia.v3.internal.auw
    public final /* bridge */ /* synthetic */ Collection v() {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asp, com.google.ads.interactivemedia.v3.internal.auw
    public final /* bridge */ /* synthetic */ Map w() {
        return this.f20574b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asp
    public final boolean y(Object obj) {
        return obj != null && super.y(obj);
    }
}

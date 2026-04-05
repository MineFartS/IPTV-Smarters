package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class avi<K> extends auk<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient aud<K, ?> f20606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient aty<K> f20607b;

    public avi(aud<K, ?> audVar, aty<K> atyVar) {
        this.f20606a = audVar;
        this.f20607b = atyVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final int a(Object[] objArr, int i2) {
        return this.f20607b.a(objArr, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20606a.get(obj) != null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, com.google.ads.interactivemedia.v3.internal.ats
    public final aty<K> d() {
        return this.f20607b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, com.google.ads.interactivemedia.v3.internal.ats, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final avt<K> listIterator() {
        return this.f20607b.iterator();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final boolean f() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20606a.size();
    }
}

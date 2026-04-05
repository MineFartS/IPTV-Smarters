package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class auh<K, V> extends ats<V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient aui<K, V> f20573a;

    public auh(aui<K, V> auiVar) {
        this.f20573a = auiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final int a(Object[] objArr, int i2) {
        avu it = ((aty) this.f20573a.f20574b.values()).iterator();
        while (it.hasNext()) {
            i2 = ((ats) it.next()).a(objArr, i2);
        }
        return i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20573a.y(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final avt<V> listIterator() {
        return new aue(this.f20573a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final boolean f() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f20573a.f20575c;
    }
}

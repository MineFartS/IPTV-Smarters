package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class avr<E> extends auk<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient E f20625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f20626b;

    public avr(E e2) {
        ars.g(e2);
        this.f20625a = e2;
    }

    public avr(E e2, int i2) {
        this.f20625a = e2;
        this.f20626b = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final int a(Object[] objArr, int i2) {
        objArr[i2] = this.f20625a;
        return i2 + 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20625a.equals(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, com.google.ads.interactivemedia.v3.internal.ats, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final avt<E> listIterator() {
        return new aul(this.f20625a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final boolean f() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i2 = this.f20626b;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.f20625a.hashCode();
        this.f20626b = iHashCode;
        return iHashCode;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk
    public final aty<E> i() {
        return aty.o(this.f20625a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk
    public final boolean m() {
        return this.f20626b != 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f20625a.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class avf<E> extends aty<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aty<Object> f20599a = new avf(new Object[0], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Object[] f20600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f20601c;

    public avf(Object[] objArr, int i2) {
        this.f20600b = objArr;
        this.f20601c = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aty, com.google.ads.interactivemedia.v3.internal.ats
    public final int a(Object[] objArr, int i2) {
        System.arraycopy(this.f20600b, 0, objArr, i2, this.f20601c);
        return i2 + this.f20601c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final int b() {
        return this.f20601c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final int c() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final boolean f() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final Object[] g() {
        return this.f20600b;
    }

    @Override // java.util.List
    public final E get(int i2) {
        ars.f(i2, this.f20601c);
        E e2 = (E) this.f20600b[i2];
        e2.getClass();
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20601c;
    }
}

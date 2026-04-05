package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class avl<E> extends auk<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final avl<Object> f20615a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f20616d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Object[] f20617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f20618c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f20619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f20620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f20621g;

    static {
        Object[] objArr = new Object[0];
        f20616d = objArr;
        f20615a = new avl<>(objArr, 0, objArr, 0, 0);
    }

    public avl(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.f20617b = objArr;
        this.f20619e = i2;
        this.f20618c = objArr2;
        this.f20620f = i3;
        this.f20621g = i4;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final int a(Object[] objArr, int i2) {
        System.arraycopy(this.f20617b, 0, objArr, i2, this.f20621g);
        return i2 + this.f20621g;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final int b() {
        return this.f20621g;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final int c() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.f20618c;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iU = auv.u(obj);
        while (true) {
            int i2 = iU & this.f20620f;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iU = i2 + 1;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, com.google.ads.interactivemedia.v3.internal.ats, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final avt<E> listIterator() {
        return d().iterator();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final boolean f() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final Object[] g() {
        return this.f20617b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f20619e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk
    public final aty<E> i() {
        return aty.k(this.f20617b, this.f20621g);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20621g;
    }
}

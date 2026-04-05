package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class bkt extends bjr<Float> implements RandomAccess, blc, bmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bkt f21326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f21327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21328c;

    static {
        bkt bktVar = new bkt(new float[0], 0);
        f21326a = bktVar;
        bktVar.b();
    }

    public bkt() {
        this(new float[10], 0);
    }

    private bkt(float[] fArr, int i2) {
        this.f21327b = fArr;
        this.f21328c = i2;
    }

    private final String f(int i2) {
        int i3 = this.f21328c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    private final void g(int i2) {
        if (i2 < 0 || i2 >= this.f21328c) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f21328c)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        float[] fArr = this.f21327b;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[((i3 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f21327b, i2, fArr2, i2 + 1, this.f21328c - i2);
            this.f21327b = fArr2;
        }
        this.f21327b[i2] = fFloatValue;
        this.f21328c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        bld.i(collection);
        if (!(collection instanceof bkt)) {
            return super.addAll(collection);
        }
        bkt bktVar = (bkt) collection;
        int i2 = bktVar.f21328c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f21328c;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f21327b;
        if (i4 > fArr.length) {
            this.f21327b = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(bktVar.f21327b, 0, this.f21327b, this.f21328c, bktVar.f21328c);
        this.f21328c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blc
    public final /* bridge */ /* synthetic */ blc d(int i2) {
        if (i2 >= this.f21328c) {
            return new bkt(Arrays.copyOf(this.f21327b, i2), this.f21328c);
        }
        throw new IllegalArgumentException();
    }

    public final void e(float f2) {
        a();
        int i2 = this.f21328c;
        float[] fArr = this.f21327b;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f21327b = fArr2;
        }
        float[] fArr3 = this.f21327b;
        int i3 = this.f21328c;
        this.f21328c = i3 + 1;
        fArr3[i3] = f2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkt)) {
            return super.equals(obj);
        }
        bkt bktVar = (bkt) obj;
        if (this.f21328c != bktVar.f21328c) {
            return false;
        }
        float[] fArr = bktVar.f21327b;
        for (int i2 = 0; i2 < this.f21328c; i2++) {
            if (Float.floatToIntBits(this.f21327b[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        g(i2);
        return Float.valueOf(this.f21327b[i2]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.f21328c; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f21327b[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i2 = this.f21328c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f21327b[i3] == fFloatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        a();
        g(i2);
        float[] fArr = this.f21327b;
        float f2 = fArr[i2];
        if (i2 < this.f21328c - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.f21328c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f21327b;
        System.arraycopy(fArr, i3, fArr, i2, this.f21328c - i3);
        this.f21328c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        g(i2);
        float[] fArr = this.f21327b;
        float f2 = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21328c;
    }
}

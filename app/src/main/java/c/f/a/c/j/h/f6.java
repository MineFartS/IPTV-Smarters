package c.f.a.c.j.h;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class f6 extends u4<Float> implements RandomAccess, t6, y7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f6 f13322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f13323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13324e;

    static {
        f6 f6Var = new f6(new float[0], 0);
        f13322c = f6Var;
        f6Var.k();
    }

    public f6() {
        this(new float[10], 0);
    }

    public f6(float[] fArr, int i2) {
        this.f13323d = fArr;
        this.f13324e = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        float fFloatValue = ((Float) obj).floatValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f13324e)) {
            throw new IndexOutOfBoundsException(h(i2));
        }
        float[] fArr = this.f13323d;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[((i3 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f13323d, i2, fArr2, i2 + 1, this.f13324e - i2);
            this.f13323d = fArr2;
        }
        this.f13323d[i2] = fFloatValue;
        this.f13324e++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        d();
        u6.a(collection);
        if (!(collection instanceof f6)) {
            return super.addAll(collection);
        }
        f6 f6Var = (f6) collection;
        int i2 = f6Var.f13324e;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f13324e;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f13323d;
        if (i4 > fArr.length) {
            this.f13323d = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(f6Var.f13323d, 0, this.f13323d, this.f13324e, f6Var.f13324e);
        this.f13324e = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f2) {
        d();
        int i2 = this.f13324e;
        float[] fArr = this.f13323d;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f13323d = fArr2;
        }
        float[] fArr3 = this.f13323d;
        int i3 = this.f13324e;
        this.f13324e = i3 + 1;
        fArr3[i3] = f2;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6)) {
            return super.equals(obj);
        }
        f6 f6Var = (f6) obj;
        if (this.f13324e != f6Var.f13324e) {
            return false;
        }
        float[] fArr = f6Var.f13323d;
        for (int i2 = 0; i2 < this.f13324e; i2++) {
            if (Float.floatToIntBits(this.f13323d[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i2) {
        if (i2 < 0 || i2 >= this.f13324e) {
            throw new IndexOutOfBoundsException(h(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        g(i2);
        return Float.valueOf(this.f13323d[i2]);
    }

    public final String h(int i2) {
        int i3 = this.f13324e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.f13324e; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f13323d[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i2 = this.f13324e;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f13323d[i3] == fFloatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // c.f.a.c.j.h.t6
    public final /* bridge */ /* synthetic */ t6 n(int i2) {
        if (i2 >= this.f13324e) {
            return new f6(Arrays.copyOf(this.f13323d, i2), this.f13324e);
        }
        throw new IllegalArgumentException();
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        g(i2);
        float[] fArr = this.f13323d;
        float f2 = fArr[i2];
        if (i2 < this.f13324e - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.f13324e--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        d();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f13323d;
        System.arraycopy(fArr, i3, fArr, i2, this.f13324e - i3);
        this.f13324e -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        d();
        g(i2);
        float[] fArr = this.f13323d;
        float f2 = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13324e;
    }
}

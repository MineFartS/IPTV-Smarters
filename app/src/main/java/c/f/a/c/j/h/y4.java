package c.f.a.c.j.h;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class y4 extends u4<Boolean> implements RandomAccess, t6, y7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y4 f13655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean[] f13656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13657e;

    static {
        y4 y4Var = new y4(new boolean[0], 0);
        f13655c = y4Var;
        y4Var.k();
    }

    public y4() {
        this(new boolean[10], 0);
    }

    public y4(boolean[] zArr, int i2) {
        this.f13656d = zArr;
        this.f13657e = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f13657e)) {
            throw new IndexOutOfBoundsException(h(i2));
        }
        boolean[] zArr = this.f13656d;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f13656d, i2, zArr2, i2 + 1, this.f13657e - i2);
            this.f13656d = zArr2;
        }
        this.f13656d[i2] = zBooleanValue;
        this.f13657e++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        d();
        u6.a(collection);
        if (!(collection instanceof y4)) {
            return super.addAll(collection);
        }
        y4 y4Var = (y4) collection;
        int i2 = y4Var.f13657e;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f13657e;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f13656d;
        if (i4 > zArr.length) {
            this.f13656d = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(y4Var.f13656d, 0, this.f13656d, this.f13657e, y4Var.f13657e);
        this.f13657e = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(boolean z) {
        d();
        int i2 = this.f13657e;
        boolean[] zArr = this.f13656d;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f13656d = zArr2;
        }
        boolean[] zArr3 = this.f13656d;
        int i3 = this.f13657e;
        this.f13657e = i3 + 1;
        zArr3[i3] = z;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return super.equals(obj);
        }
        y4 y4Var = (y4) obj;
        if (this.f13657e != y4Var.f13657e) {
            return false;
        }
        boolean[] zArr = y4Var.f13656d;
        for (int i2 = 0; i2 < this.f13657e; i2++) {
            if (this.f13656d[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i2) {
        if (i2 < 0 || i2 >= this.f13657e) {
            throw new IndexOutOfBoundsException(h(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        g(i2);
        return Boolean.valueOf(this.f13656d[i2]);
    }

    public final String h(int i2) {
        int i3 = this.f13657e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iF = 1;
        for (int i2 = 0; i2 < this.f13657e; i2++) {
            iF = (iF * 31) + u6.f(this.f13656d[i2]);
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.f13657e;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f13656d[i3] == zBooleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // c.f.a.c.j.h.t6
    public final /* bridge */ /* synthetic */ t6 n(int i2) {
        if (i2 >= this.f13657e) {
            return new y4(Arrays.copyOf(this.f13656d, i2), this.f13657e);
        }
        throw new IllegalArgumentException();
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        g(i2);
        boolean[] zArr = this.f13656d;
        boolean z = zArr[i2];
        if (i2 < this.f13657e - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.f13657e--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        d();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f13656d;
        System.arraycopy(zArr, i3, zArr, i2, this.f13657e - i3);
        this.f13657e -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        g(i2);
        boolean[] zArr = this.f13656d;
        boolean z = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13657e;
    }
}

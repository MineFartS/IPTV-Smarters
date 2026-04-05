package c.f.a.c.j.h;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class m6 extends u4<Integer> implements RandomAccess, q6, y7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m6 f13429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f13430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13431e;

    static {
        m6 m6Var = new m6(new int[0], 0);
        f13429c = m6Var;
        m6Var.k();
    }

    public m6() {
        this(new int[10], 0);
    }

    public m6(int[] iArr, int i2) {
        this.f13430d = iArr;
        this.f13431e = i2;
    }

    public static m6 f() {
        return f13429c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f13431e)) {
            throw new IndexOutOfBoundsException(s(i2));
        }
        int[] iArr = this.f13430d;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f13430d, i2, iArr2, i2 + 1, this.f13431e - i2);
            this.f13430d = iArr2;
        }
        this.f13430d[i2] = iIntValue;
        this.f13431e++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        u6.a(collection);
        if (!(collection instanceof m6)) {
            return super.addAll(collection);
        }
        m6 m6Var = (m6) collection;
        int i2 = m6Var.f13431e;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f13431e;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f13430d;
        if (i4 > iArr.length) {
            this.f13430d = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(m6Var.f13430d, 0, this.f13430d, this.f13431e, m6Var.f13431e);
        this.f13431e = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return super.equals(obj);
        }
        m6 m6Var = (m6) obj;
        if (this.f13431e != m6Var.f13431e) {
            return false;
        }
        int[] iArr = m6Var.f13430d;
        for (int i2 = 0; i2 < this.f13431e; i2++) {
            if (this.f13430d[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int g(int i2) {
        i(i2);
        return this.f13430d[i2];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        i(i2);
        return Integer.valueOf(this.f13430d[i2]);
    }

    public final void h(int i2) {
        d();
        int i3 = this.f13431e;
        int[] iArr = this.f13430d;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f13430d = iArr2;
        }
        int[] iArr3 = this.f13430d;
        int i4 = this.f13431e;
        this.f13431e = i4 + 1;
        iArr3[i4] = i2;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f13431e; i3++) {
            i2 = (i2 * 31) + this.f13430d[i3];
        }
        return i2;
    }

    public final void i(int i2) {
        if (i2 < 0 || i2 >= this.f13431e) {
            throw new IndexOutOfBoundsException(s(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.f13431e;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f13430d[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // c.f.a.c.j.h.t6
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final q6 n(int i2) {
        if (i2 >= this.f13431e) {
            return new m6(Arrays.copyOf(this.f13430d, i2), this.f13431e);
        }
        throw new IllegalArgumentException();
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        i(i2);
        int[] iArr = this.f13430d;
        int i3 = iArr[i2];
        if (i2 < this.f13431e - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f13431e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        d();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f13430d;
        System.arraycopy(iArr, i3, iArr, i2, this.f13431e - i3);
        this.f13431e -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    public final String s(int i2) {
        int i3 = this.f13431e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        i(i2);
        int[] iArr = this.f13430d;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13431e;
    }
}

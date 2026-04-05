package c.f.a.c.j.h;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class f7 extends u4<Long> implements RandomAccess, r6, y7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f7 f13325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f13326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13327e;

    static {
        f7 f7Var = new f7(new long[0], 0);
        f13325c = f7Var;
        f7Var.k();
    }

    public f7() {
        this(new long[10], 0);
    }

    public f7(long[] jArr, int i2) {
        this.f13326d = jArr;
        this.f13327e = i2;
    }

    public static f7 f() {
        return f13325c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long jLongValue = ((Long) obj).longValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f13327e)) {
            throw new IndexOutOfBoundsException(i(i2));
        }
        long[] jArr = this.f13326d;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f13326d, i2, jArr2, i2 + 1, this.f13327e - i2);
            this.f13326d = jArr2;
        }
        this.f13326d[i2] = jLongValue;
        this.f13327e++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        u6.a(collection);
        if (!(collection instanceof f7)) {
            return super.addAll(collection);
        }
        f7 f7Var = (f7) collection;
        int i2 = f7Var.f13327e;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f13327e;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f13326d;
        if (i4 > jArr.length) {
            this.f13326d = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(f7Var.f13326d, 0, this.f13326d, this.f13327e, f7Var.f13327e);
        this.f13327e = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // c.f.a.c.j.h.t6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final r6 n(int i2) {
        if (i2 >= this.f13327e) {
            return new f7(Arrays.copyOf(this.f13326d, i2), this.f13327e);
        }
        throw new IllegalArgumentException();
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
        if (!(obj instanceof f7)) {
            return super.equals(obj);
        }
        f7 f7Var = (f7) obj;
        if (this.f13327e != f7Var.f13327e) {
            return false;
        }
        long[] jArr = f7Var.f13326d;
        for (int i2 = 0; i2 < this.f13327e; i2++) {
            if (this.f13326d[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void g(long j2) {
        d();
        int i2 = this.f13327e;
        long[] jArr = this.f13326d;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f13326d = jArr2;
        }
        long[] jArr3 = this.f13326d;
        int i3 = this.f13327e;
        this.f13327e = i3 + 1;
        jArr3[i3] = j2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        h(i2);
        return Long.valueOf(this.f13326d[i2]);
    }

    public final void h(int i2) {
        if (i2 < 0 || i2 >= this.f13327e) {
            throw new IndexOutOfBoundsException(i(i2));
        }
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iE = 1;
        for (int i2 = 0; i2 < this.f13327e; i2++) {
            iE = (iE * 31) + u6.e(this.f13326d[i2]);
        }
        return iE;
    }

    public final String i(int i2) {
        int i3 = this.f13327e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i2 = this.f13327e;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f13326d[i3] == jLongValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        h(i2);
        long[] jArr = this.f13326d;
        long j2 = jArr[i2];
        if (i2 < this.f13327e - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f13327e--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        d();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f13326d;
        System.arraycopy(jArr, i3, jArr, i2, this.f13327e - i3);
        this.f13327e -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        h(i2);
        long[] jArr = this.f13326d;
        long j2 = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13327e;
    }

    @Override // c.f.a.c.j.h.r6
    public final long w(int i2) {
        h(i2);
        return this.f13326d[i2];
    }
}

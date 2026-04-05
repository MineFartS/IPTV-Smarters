package c.f.a.c.j.c;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class pb extends g9<Long> implements xa<Long>, kc, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pb f13026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f13027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13028e;

    static {
        pb pbVar = new pb(new long[0], 0);
        f13026c = pbVar;
        pbVar.l();
    }

    public pb() {
        this(new long[10], 0);
    }

    public pb(long[] jArr, int i2) {
        this.f13027d = jArr;
        this.f13028e = i2;
    }

    public static pb i() {
        return f13026c;
    }

    @Override // c.f.a.c.j.c.xa
    public final /* synthetic */ xa<Long> E(int i2) {
        if (i2 >= this.f13028e) {
            return new pb(Arrays.copyOf(this.f13027d, i2), this.f13028e);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long jLongValue = ((Long) obj).longValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f13028e)) {
            throw new IndexOutOfBoundsException(h(i2));
        }
        long[] jArr = this.f13027d;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f13027d, i2, jArr2, i2 + 1, this.f13028e - i2);
            this.f13027d = jArr2;
        }
        this.f13027d[i2] = jLongValue;
        this.f13028e++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        int i2 = this.f13028e;
        long[] jArr = this.f13027d;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f13027d = jArr2;
        }
        long[] jArr3 = this.f13027d;
        int i3 = this.f13028e;
        this.f13028e = i3 + 1;
        jArr3[i3] = jLongValue;
        return true;
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        sa.a(collection);
        if (!(collection instanceof pb)) {
            return super.addAll(collection);
        }
        pb pbVar = (pb) collection;
        int i2 = pbVar.f13028e;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f13028e;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f13027d;
        if (i4 > jArr.length) {
            this.f13027d = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(pbVar.f13027d, 0, this.f13027d, this.f13028e, pbVar.f13028e);
        this.f13028e = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i2) {
        g(i2);
        return this.f13027d[i2];
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb)) {
            return super.equals(obj);
        }
        pb pbVar = (pb) obj;
        if (this.f13028e != pbVar.f13028e) {
            return false;
        }
        long[] jArr = pbVar.f13027d;
        for (int i2 = 0; i2 < this.f13028e; i2++) {
            if (this.f13027d[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i2) {
        if (i2 < 0 || i2 >= this.f13028e) {
            throw new IndexOutOfBoundsException(h(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return Long.valueOf(e(i2));
    }

    public final String h(int i2) {
        int i3 = this.f13028e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iJ = 1;
        for (int i2 = 0; i2 < this.f13028e; i2++) {
            iJ = (iJ * 31) + sa.j(this.f13027d[i2]);
        }
        return iJ;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f13027d[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        d();
        g(i2);
        long[] jArr = this.f13027d;
        long j2 = jArr[i2];
        if (i2 < this.f13028e - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f13028e--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        for (int i2 = 0; i2 < this.f13028e; i2++) {
            if (obj.equals(Long.valueOf(this.f13027d[i2]))) {
                long[] jArr = this.f13027d;
                System.arraycopy(jArr, i2 + 1, jArr, i2, (this.f13028e - i2) - 1);
                this.f13028e--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        d();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f13027d;
        System.arraycopy(jArr, i3, jArr, i2, this.f13028e - i3);
        this.f13028e -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        g(i2);
        long[] jArr = this.f13027d;
        long j2 = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13028e;
    }
}

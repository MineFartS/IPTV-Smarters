package c.f.a.c.j.c;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class qa extends g9<Integer> implements wa, kc, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qa f13042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f13043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13044e;

    static {
        qa qaVar = new qa(new int[0], 0);
        f13042c = qaVar;
        qaVar.l();
    }

    public qa() {
        this(new int[10], 0);
    }

    public qa(int[] iArr, int i2) {
        this.f13043d = iArr;
        this.f13044e = i2;
    }

    public static qa i() {
        return f13042c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f13044e)) {
            throw new IndexOutOfBoundsException(h(i2));
        }
        int[] iArr = this.f13043d;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f13043d, i2, iArr2, i2 + 1, this.f13044e - i2);
            this.f13043d = iArr2;
        }
        this.f13043d[i2] = iIntValue;
        this.f13044e++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        y(((Integer) obj).intValue());
        return true;
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        sa.a(collection);
        if (!(collection instanceof qa)) {
            return super.addAll(collection);
        }
        qa qaVar = (qa) collection;
        int i2 = qaVar.f13044e;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f13044e;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f13043d;
        if (i4 > iArr.length) {
            this.f13043d = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(qaVar.f13043d, 0, this.f13043d, this.f13044e, qaVar.f13044e);
        this.f13044e = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i2) {
        g(i2);
        return this.f13043d[i2];
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return super.equals(obj);
        }
        qa qaVar = (qa) obj;
        if (this.f13044e != qaVar.f13044e) {
            return false;
        }
        int[] iArr = qaVar.f13043d;
        for (int i2 = 0; i2 < this.f13044e; i2++) {
            if (this.f13043d[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i2) {
        if (i2 < 0 || i2 >= this.f13044e) {
            throw new IndexOutOfBoundsException(h(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return Integer.valueOf(e(i2));
    }

    public final String h(int i2) {
        int i3 = this.f13044e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f13044e; i3++) {
            i2 = (i2 * 31) + this.f13043d[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f13043d[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        d();
        g(i2);
        int[] iArr = this.f13043d;
        int i3 = iArr[i2];
        if (i2 < this.f13044e - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f13044e--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        for (int i2 = 0; i2 < this.f13044e; i2++) {
            if (obj.equals(Integer.valueOf(this.f13043d[i2]))) {
                int[] iArr = this.f13043d;
                System.arraycopy(iArr, i2 + 1, iArr, i2, (this.f13044e - i2) - 1);
                this.f13044e--;
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
        int[] iArr = this.f13043d;
        System.arraycopy(iArr, i3, iArr, i2, this.f13044e - i3);
        this.f13044e -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        g(i2);
        int[] iArr = this.f13043d;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13044e;
    }

    @Override // c.f.a.c.j.c.xa
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final wa E(int i2) {
        if (i2 >= this.f13044e) {
            return new qa(Arrays.copyOf(this.f13043d, i2), this.f13044e);
        }
        throw new IllegalArgumentException();
    }

    @Override // c.f.a.c.j.c.wa
    public final void y(int i2) {
        d();
        int i3 = this.f13044e;
        int[] iArr = this.f13043d;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f13043d = iArr2;
        }
        int[] iArr3 = this.f13043d;
        int i4 = this.f13044e;
        this.f13044e = i4 + 1;
        iArr3[i4] = i2;
    }
}

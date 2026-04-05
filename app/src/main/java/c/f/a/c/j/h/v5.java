package c.f.a.c.j.h;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class v5 extends u4<Double> implements RandomAccess, t6, y7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v5 f13587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double[] f13588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13589e;

    static {
        v5 v5Var = new v5(new double[0], 0);
        f13587c = v5Var;
        v5Var.k();
    }

    public v5() {
        this(new double[10], 0);
    }

    public v5(double[] dArr, int i2) {
        this.f13588d = dArr;
        this.f13589e = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f13589e)) {
            throw new IndexOutOfBoundsException(h(i2));
        }
        double[] dArr = this.f13588d;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f13588d, i2, dArr2, i2 + 1, this.f13589e - i2);
            this.f13588d = dArr2;
        }
        this.f13588d[i2] = dDoubleValue;
        this.f13589e++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        d();
        u6.a(collection);
        if (!(collection instanceof v5)) {
            return super.addAll(collection);
        }
        v5 v5Var = (v5) collection;
        int i2 = v5Var.f13589e;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f13589e;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f13588d;
        if (i4 > dArr.length) {
            this.f13588d = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(v5Var.f13588d, 0, this.f13588d, this.f13589e, v5Var.f13589e);
        this.f13589e = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(double d2) {
        d();
        int i2 = this.f13589e;
        double[] dArr = this.f13588d;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f13588d = dArr2;
        }
        double[] dArr3 = this.f13588d;
        int i3 = this.f13589e;
        this.f13589e = i3 + 1;
        dArr3[i3] = d2;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5)) {
            return super.equals(obj);
        }
        v5 v5Var = (v5) obj;
        if (this.f13589e != v5Var.f13589e) {
            return false;
        }
        double[] dArr = v5Var.f13588d;
        for (int i2 = 0; i2 < this.f13589e; i2++) {
            if (Double.doubleToLongBits(this.f13588d[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i2) {
        if (i2 < 0 || i2 >= this.f13589e) {
            throw new IndexOutOfBoundsException(h(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        g(i2);
        return Double.valueOf(this.f13588d[i2]);
    }

    public final String h(int i2) {
        int i3 = this.f13589e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iE = 1;
        for (int i2 = 0; i2 < this.f13589e; i2++) {
            iE = (iE * 31) + u6.e(Double.doubleToLongBits(this.f13588d[i2]));
        }
        return iE;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i2 = this.f13589e;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f13588d[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // c.f.a.c.j.h.t6
    public final /* bridge */ /* synthetic */ t6 n(int i2) {
        if (i2 >= this.f13589e) {
            return new v5(Arrays.copyOf(this.f13588d, i2), this.f13589e);
        }
        throw new IllegalArgumentException();
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        g(i2);
        double[] dArr = this.f13588d;
        double d2 = dArr[i2];
        if (i2 < this.f13589e - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.f13589e--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        d();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f13588d;
        System.arraycopy(dArr, i3, dArr, i2, this.f13589e - i3);
        this.f13589e -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        g(i2);
        double[] dArr = this.f13588d;
        double d2 = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13589e;
    }
}

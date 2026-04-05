package c.f.b.f;

import c.f.b.a.k;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: loaded from: classes.dex */
    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f16008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f16009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f16010d;

        public a(int[] iArr, int i2, int i3) {
            this.f16008b = iArr;
            this.f16009c = i2;
            this.f16010d = i3;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int i2) {
            k.h(i2, size());
            return Integer.valueOf(this.f16008b[this.f16009c + i2]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer set(int i2, Integer num) {
            k.h(i2, size());
            int[] iArr = this.f16008b;
            int i3 = this.f16009c;
            int i4 = iArr[i3 + i2];
            iArr[i3 + i2] = ((Integer) k.j(num)).intValue();
            return Integer.valueOf(i4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && c.g(this.f16008b, ((Integer) obj).intValue(), this.f16009c, this.f16010d) != -1;
        }

        public int[] d() {
            return Arrays.copyOfRange(this.f16008b, this.f16009c, this.f16010d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f16008b[this.f16009c + i2] != aVar.f16008b[aVar.f16009c + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iE = 1;
            for (int i2 = this.f16009c; i2 < this.f16010d; i2++) {
                iE = (iE * 31) + c.e(this.f16008b[i2]);
            }
            return iE;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iG;
            if (!(obj instanceof Integer) || (iG = c.g(this.f16008b, ((Integer) obj).intValue(), this.f16009c, this.f16010d)) < 0) {
                return -1;
            }
            return iG - this.f16009c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iH;
            if (!(obj instanceof Integer) || (iH = c.h(this.f16008b, ((Integer) obj).intValue(), this.f16009c, this.f16010d)) < 0) {
                return -1;
            }
            return iH - this.f16009c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f16010d - this.f16009c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i2, int i3) {
            k.n(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            int[] iArr = this.f16008b;
            int i4 = this.f16009c;
            return new a(iArr, i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f16008b[this.f16009c]);
            int i2 = this.f16009c;
            while (true) {
                i2++;
                if (i2 >= this.f16010d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f16008b[i2]);
            }
        }
    }

    public static int c(long j2) {
        int i2 = (int) j2;
        k.f(((long) i2) == j2, "Out of range: %s", j2);
        return i2;
    }

    public static int d(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 > i3 ? 1 : 0;
    }

    public static int e(int i2) {
        return i2;
    }

    public static int f(int[] iArr, int i2) {
        return g(iArr, i2, 0, iArr.length);
    }

    public static int g(int[] iArr, int i2, int i3, int i4) {
        while (i3 < i4) {
            if (iArr[i3] == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static int h(int[] iArr, int i2, int i3, int i4) {
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            if (iArr[i5] == i2) {
                return i5;
            }
        }
        return -1;
    }

    public static int i(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static int[] j(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = ((Number) k.j(array[i2])).intValue();
        }
        return iArr;
    }
}

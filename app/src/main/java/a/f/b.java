package a.f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f1247b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f1248c = new Object[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Object[] f1249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f1250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Object[] f1251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f1252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f1253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object[] f1254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h<E, E> f1256k;

    public class a extends h<E, E> {
        public a() {
        }

        @Override // a.f.h
        public void a() {
            b.this.clear();
        }

        @Override // a.f.h
        public Object b(int i2, int i3) {
            return b.this.f1254i[i2];
        }

        @Override // a.f.h
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // a.f.h
        public int d() {
            return b.this.f1255j;
        }

        @Override // a.f.h
        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // a.f.h
        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // a.f.h
        public void g(E e2, E e3) {
            b.this.add(e2);
        }

        @Override // a.f.h
        public void h(int i2) {
            b.this.s(i2);
        }

        @Override // a.f.h
        public E i(int i2, E e2) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f1253h = f1247b;
            this.f1254i = f1248c;
        } else {
            a(i2);
        }
        this.f1255j = 0;
    }

    public static void d(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f1252g < 10) {
                    objArr[0] = f1251f;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1251f = objArr;
                    f1252g++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f1250e < 10) {
                    objArr[0] = f1249d;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1249d = objArr;
                    f1250e++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                Object[] objArr = f1251f;
                if (objArr != null) {
                    this.f1254i = objArr;
                    f1251f = (Object[]) objArr[0];
                    this.f1253h = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1252g--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f1249d;
                if (objArr2 != null) {
                    this.f1254i = objArr2;
                    f1249d = (Object[]) objArr2[0];
                    this.f1253h = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1250e--;
                    return;
                }
            }
        }
        this.f1253h = new int[i2];
        this.f1254i = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int iG;
        if (e2 == null) {
            iG = i();
            i2 = 0;
        } else {
            int iHashCode = e2.hashCode();
            i2 = iHashCode;
            iG = g(e2, iHashCode);
        }
        if (iG >= 0) {
            return false;
        }
        int i3 = iG ^ (-1);
        int i4 = this.f1255j;
        int[] iArr = this.f1253h;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f1254i;
            a(i5);
            int[] iArr2 = this.f1253h;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1254i, 0, objArr.length);
            }
            d(iArr, objArr, this.f1255j);
        }
        int i6 = this.f1255j;
        if (i3 < i6) {
            int[] iArr3 = this.f1253h;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f1254i;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f1255j - i3);
        }
        this.f1253h[i3] = i2;
        this.f1254i[i3] = e2;
        this.f1255j++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        b(this.f1255j + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public void b(int i2) {
        int[] iArr = this.f1253h;
        if (iArr.length < i2) {
            Object[] objArr = this.f1254i;
            a(i2);
            int i3 = this.f1255j;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f1253h, 0, i3);
                System.arraycopy(objArr, 0, this.f1254i, 0, this.f1255j);
            }
            d(iArr, objArr, this.f1255j);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f1255j;
        if (i2 != 0) {
            d(this.f1253h, this.f1254i, i2);
            this.f1253h = f1247b;
            this.f1254i = f1248c;
            this.f1255j = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1255j; i2++) {
                try {
                    if (!set.contains(t(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final h<E, E> f() {
        if (this.f1256k == null) {
            this.f1256k = new a();
        }
        return this.f1256k;
    }

    public final int g(Object obj, int i2) {
        int i3 = this.f1255j;
        if (i3 == 0) {
            return -1;
        }
        int iA = e.a(this.f1253h, i3, i2);
        if (iA < 0 || obj.equals(this.f1254i[iA])) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.f1253h[i4] == i2) {
            if (obj.equals(this.f1254i[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.f1253h[i5] == i2; i5--) {
            if (obj.equals(this.f1254i[i5])) {
                return i5;
            }
        }
        return i4 ^ (-1);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1253h;
        int i2 = this.f1255j;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final int i() {
        int i2 = this.f1255j;
        if (i2 == 0) {
            return -1;
        }
        int iA = e.a(this.f1253h, i2, 0);
        if (iA < 0 || this.f1254i[iA] == null) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.f1253h[i3] == 0) {
            if (this.f1254i[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.f1253h[i4] == 0; i4--) {
            if (this.f1254i[i4] == null) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    public int indexOf(Object obj) {
        return obj == null ? i() : g(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1255j <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return f().m().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        s(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f1255j - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f1254i[i2])) {
                s(i2);
                z = true;
            }
        }
        return z;
    }

    public E s(int i2) {
        Object[] objArr = this.f1254i;
        E e2 = (E) objArr[i2];
        int i3 = this.f1255j;
        if (i3 <= 1) {
            d(this.f1253h, objArr, i3);
            this.f1253h = f1247b;
            this.f1254i = f1248c;
            this.f1255j = 0;
        } else {
            int[] iArr = this.f1253h;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i4 = i3 - 1;
                this.f1255j = i4;
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                    Object[] objArr2 = this.f1254i;
                    System.arraycopy(objArr2, i5, objArr2, i2, this.f1255j - i2);
                }
                this.f1254i[this.f1255j] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                this.f1255j--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f1253h, 0, i2);
                    System.arraycopy(objArr, 0, this.f1254i, 0, i2);
                }
                int i6 = this.f1255j;
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    System.arraycopy(iArr, i7, this.f1253h, i2, i6 - i2);
                    System.arraycopy(objArr, i7, this.f1254i, i2, this.f1255j - i2);
                }
            }
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1255j;
    }

    public E t(int i2) {
        return (E) this.f1254i[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f1255j;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f1254i, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1255j) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1255j));
        }
        System.arraycopy(this.f1254i, 0, tArr, 0, this.f1255j);
        int length = tArr.length;
        int i2 = this.f1255j;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1255j * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1255j; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E eT = t(i2);
            if (eT != this) {
                sb.append(eT);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

package c.f.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public class l<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient int[] f15863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient long[] f15864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Object[] f15865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Object[] f15866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient float f15867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f15868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int f15869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int f15870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<K> f15871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<Map.Entry<K, V>> f15872k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Collection<V> f15873l;

    /* JADX INFO: loaded from: classes2.dex */
    public class a extends l<K, V>.e<K> {
        public a() {
            super(l.this, null);
        }

        @Override // c.f.b.b.l.e
        public K b(int i2) {
            return (K) l.this.f15865d[i2];
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class b extends l<K, V>.e<Map.Entry<K, V>> {
        public b() {
            super(l.this, null);
        }

        @Override // c.f.b.b.l.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(int i2) {
            return new g(i2);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class c extends l<K, V>.e<V> {
        public c() {
            super(l.this, null);
        }

        @Override // c.f.b.b.l.e
        public V b(int i2) {
            return (V) l.this.f15866e[i2];
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iR = l.this.r(entry.getKey());
            return iR != -1 && c.f.b.a.h.a(l.this.f15866e[iR], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return l.this.l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iR = l.this.r(entry.getKey());
            if (iR == -1 || !c.f.b.a.h.a(l.this.f15866e[iR], entry.getValue())) {
                return false;
            }
            l.this.z(iR);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l.this.f15870i;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public abstract class e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15880d;

        public e() {
            this.f15878b = l.this.f15868g;
            this.f15879c = l.this.m();
            this.f15880d = -1;
        }

        public /* synthetic */ e(l lVar, a aVar) {
            this();
        }

        public final void a() {
            if (l.this.f15868g != this.f15878b) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract T b(int i2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15879c >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i2 = this.f15879c;
            this.f15880d = i2;
            T tB = b(i2);
            this.f15879c = l.this.p(this.f15879c);
            return tB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            j.c(this.f15880d >= 0);
            this.f15878b++;
            l.this.z(this.f15880d);
            this.f15879c = l.this.f(this.f15879c, this.f15880d);
            this.f15880d = -1;
        }
    }

    public class f extends AbstractSet<K> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return l.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return l.this.u();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int iR = l.this.r(obj);
            if (iR == -1) {
                return false;
            }
            l.this.z(iR);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l.this.f15870i;
        }
    }

    public final class g extends c.f.b.b.e<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NullableDecl
        public final K f15883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15884c;

        public g(int i2) {
            this.f15883b = (K) l.this.f15865d[i2];
            this.f15884c = i2;
        }

        public final void a() {
            int i2 = this.f15884c;
            if (i2 == -1 || i2 >= l.this.size() || !c.f.b.a.h.a(this.f15883b, l.this.f15865d[this.f15884c])) {
                this.f15884c = l.this.r(this.f15883b);
            }
        }

        @Override // c.f.b.b.e, java.util.Map.Entry
        public K getKey() {
            return this.f15883b;
        }

        @Override // c.f.b.b.e, java.util.Map.Entry
        public V getValue() {
            a();
            int i2 = this.f15884c;
            if (i2 == -1) {
                return null;
            }
            return (V) l.this.f15866e[i2];
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            a();
            int i2 = this.f15884c;
            if (i2 == -1) {
                l.this.put(this.f15883b, v);
                return null;
            }
            Object[] objArr = l.this.f15866e;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class h extends AbstractCollection<V> {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return l.this.F();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return l.this.f15870i;
        }
    }

    public l() {
        s(3, 1.0f);
    }

    public l(int i2) {
        this(i2, 1.0f);
    }

    public l(int i2, float f2) {
        s(i2, f2);
    }

    public static long E(long j2, int i2) {
        return (j2 & (-4294967296L)) | (((long) i2) & 4294967295L);
    }

    public static <K, V> l<K, V> g() {
        return new l<>();
    }

    public static <K, V> l<K, V> k(int i2) {
        return new l<>(i2);
    }

    public static int n(long j2) {
        return (int) (j2 >>> 32);
    }

    public static int o(long j2) {
        return (int) j2;
    }

    public static long[] w(int i2) {
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    public static int[] x(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public void A(int i2) {
        this.f15865d = Arrays.copyOf(this.f15865d, i2);
        this.f15866e = Arrays.copyOf(this.f15866e, i2);
        long[] jArr = this.f15864c;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(jArrCopyOf, length, i2, -1L);
        }
        this.f15864c = jArrCopyOf;
    }

    public final void C(int i2) {
        int length = this.f15864c.length;
        if (i2 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                A(iMax);
            }
        }
    }

    public final void D(int i2) {
        if (this.f15863b.length >= 1073741824) {
            this.f15869h = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (i2 * this.f15867f)) + 1;
        int[] iArrX = x(i2);
        long[] jArr = this.f15864c;
        int length = iArrX.length - 1;
        for (int i4 = 0; i4 < this.f15870i; i4++) {
            int iN = n(jArr[i4]);
            int i5 = iN & length;
            int i6 = iArrX[i5];
            iArrX[i5] = i4;
            jArr[i4] = (((long) iN) << 32) | (4294967295L & ((long) i6));
        }
        this.f15869h = i3;
        this.f15863b = iArrX;
    }

    public Iterator<V> F() {
        return new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f15868g++;
        Arrays.fill(this.f15865d, 0, this.f15870i, (Object) null);
        Arrays.fill(this.f15866e, 0, this.f15870i, (Object) null);
        Arrays.fill(this.f15863b, -1);
        Arrays.fill(this.f15864c, -1L);
        this.f15870i = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return r(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        for (int i2 = 0; i2 < this.f15870i; i2++) {
            if (c.f.b.a.h.a(obj, this.f15866e[i2])) {
                return true;
            }
        }
        return false;
    }

    public void e(int i2) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f15872k;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setH = h();
        this.f15872k = setH;
        return setH;
    }

    public int f(int i2, int i3) {
        return i2 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        int iR = r(obj);
        e(iR);
        if (iR == -1) {
            return null;
        }
        return (V) this.f15866e[iR];
    }

    public Set<Map.Entry<K, V>> h() {
        return new d();
    }

    public Set<K> i() {
        return new f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f15870i == 0;
    }

    public Collection<V> j() {
        return new h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f15871j;
        if (set != null) {
            return set;
        }
        Set<K> setI = i();
        this.f15871j = setI;
        return setI;
    }

    public Iterator<Map.Entry<K, V>> l() {
        return new b();
    }

    public int m() {
        return isEmpty() ? -1 : 0;
    }

    public int p(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f15870i) {
            return i3;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V put(@NullableDecl K k2, @NullableDecl V v) {
        long[] jArr = this.f15864c;
        Object[] objArr = this.f15865d;
        Object[] objArr2 = this.f15866e;
        int iC = q.c(k2);
        int iQ = q() & iC;
        int i2 = this.f15870i;
        int[] iArr = this.f15863b;
        int i3 = iArr[iQ];
        if (i3 == -1) {
            iArr[iQ] = i2;
        } else {
            while (true) {
                long j2 = jArr[i3];
                if (n(j2) == iC && c.f.b.a.h.a(k2, objArr[i3])) {
                    V v2 = (V) objArr2[i3];
                    objArr2[i3] = v;
                    e(i3);
                    return v2;
                }
                int iO = o(j2);
                if (iO == -1) {
                    jArr[i3] = E(j2, i2);
                    break;
                }
                i3 = iO;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i4 = i2 + 1;
        C(i4);
        t(i2, k2, v, iC);
        this.f15870i = i4;
        if (i2 >= this.f15869h) {
            D(this.f15863b.length * 2);
        }
        this.f15868g++;
        return null;
    }

    public final int q() {
        return this.f15863b.length - 1;
    }

    public final int r(@NullableDecl Object obj) {
        int iC = q.c(obj);
        int iO = this.f15863b[q() & iC];
        while (iO != -1) {
            long j2 = this.f15864c[iO];
            if (n(j2) == iC && c.f.b.a.h.a(obj, this.f15865d[iO])) {
                return iO;
            }
            iO = o(j2);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        return y(obj, q.c(obj));
    }

    public void s(int i2, float f2) {
        c.f.b.a.k.e(i2 >= 0, "Initial capacity must be non-negative");
        c.f.b.a.k.e(f2 > 0.0f, "Illegal load factor");
        int iA = q.a(i2, f2);
        this.f15863b = x(iA);
        this.f15867f = f2;
        this.f15865d = new Object[i2];
        this.f15866e = new Object[i2];
        this.f15864c = w(i2);
        this.f15869h = Math.max(1, (int) (iA * f2));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f15870i;
    }

    public void t(int i2, @NullableDecl K k2, @NullableDecl V v, int i3) {
        this.f15864c[i2] = (((long) i3) << 32) | 4294967295L;
        this.f15865d[i2] = k2;
        this.f15866e[i2] = v;
    }

    public Iterator<K> u() {
        return new a();
    }

    public void v(int i2) {
        int size = size() - 1;
        if (i2 >= size) {
            this.f15865d[i2] = null;
            this.f15866e[i2] = null;
            this.f15864c[i2] = -1;
            return;
        }
        Object[] objArr = this.f15865d;
        objArr[i2] = objArr[size];
        Object[] objArr2 = this.f15866e;
        objArr2[i2] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        long[] jArr = this.f15864c;
        long j2 = jArr[size];
        jArr[i2] = j2;
        jArr[size] = -1;
        int iN = n(j2) & q();
        int[] iArr = this.f15863b;
        int i3 = iArr[iN];
        if (i3 == size) {
            iArr[iN] = i2;
            return;
        }
        while (true) {
            long j3 = this.f15864c[i3];
            int iO = o(j3);
            if (iO == size) {
                this.f15864c[i3] = E(j3, i2);
                return;
            }
            i3 = iO;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f15873l;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionJ = j();
        this.f15873l = collectionJ;
        return collectionJ;
    }

    @NullableDecl
    public final V y(@NullableDecl Object obj, int i2) {
        int iQ = q() & i2;
        int i3 = this.f15863b[iQ];
        if (i3 == -1) {
            return null;
        }
        int i4 = -1;
        while (true) {
            if (n(this.f15864c[i3]) == i2 && c.f.b.a.h.a(obj, this.f15865d[i3])) {
                V v = (V) this.f15866e[i3];
                if (i4 == -1) {
                    this.f15863b[iQ] = o(this.f15864c[i3]);
                } else {
                    long[] jArr = this.f15864c;
                    jArr[i4] = E(jArr[i4], o(jArr[i3]));
                }
                v(i3);
                this.f15870i--;
                this.f15868g++;
                return v;
            }
            int iO = o(this.f15864c[i3]);
            if (iO == -1) {
                return null;
            }
            i4 = i3;
            i3 = iO;
        }
    }

    @CanIgnoreReturnValue
    public final V z(int i2) {
        return y(this.f15865d[i2], n(this.f15864c[i2]));
    }
}

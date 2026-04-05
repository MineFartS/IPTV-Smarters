package c.f.b.b;

import c.f.b.b.r;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class v<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map.Entry<?, ?>[] f15967b = new Map.Entry[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @LazyInit
    public transient x<Map.Entry<K, V>> f15968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @RetainedWith
    @LazyInit
    public transient x<K> f15969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RetainedWith
    @LazyInit
    public transient r<V> f15970e;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @MonotonicNonNullDecl
        public Comparator<? super V> f15971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object[] f15972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15974d;

        public a() {
            this(4);
        }

        public a(int i2) {
            this.f15972b = new Object[i2 * 2];
            this.f15973c = 0;
            this.f15974d = false;
        }

        public v<K, V> a() {
            f();
            this.f15974d = true;
            return n0.n(this.f15973c, this.f15972b);
        }

        public final void b(int i2) {
            int i3 = i2 * 2;
            Object[] objArr = this.f15972b;
            if (i3 > objArr.length) {
                this.f15972b = Arrays.copyOf(objArr, r.b.a(objArr.length, i3));
                this.f15974d = false;
            }
        }

        @CanIgnoreReturnValue
        public a<K, V> c(K k2, V v) {
            b(this.f15973c + 1);
            j.a(k2, v);
            Object[] objArr = this.f15972b;
            int i2 = this.f15973c;
            objArr[i2 * 2] = k2;
            objArr[(i2 * 2) + 1] = v;
            this.f15973c = i2 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public a<K, V> d(Map.Entry<? extends K, ? extends V> entry) {
            return c(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        public a<K, V> e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                b(this.f15973c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                d(it.next());
            }
            return this;
        }

        public void f() {
            int i2;
            if (this.f15971a != null) {
                if (this.f15974d) {
                    this.f15972b = Arrays.copyOf(this.f15972b, this.f15973c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f15973c];
                int i3 = 0;
                while (true) {
                    i2 = this.f15973c;
                    if (i3 >= i2) {
                        break;
                    }
                    Object[] objArr = this.f15972b;
                    int i4 = i3 * 2;
                    entryArr[i3] = new AbstractMap.SimpleImmutableEntry(objArr[i4], objArr[i4 + 1]);
                    i3++;
                }
                Arrays.sort(entryArr, 0, i2, k0.a(this.f15971a).e(d0.l()));
                for (int i5 = 0; i5 < this.f15973c; i5++) {
                    int i6 = i5 * 2;
                    this.f15972b[i6] = entryArr[i5].getKey();
                    this.f15972b[i6 + 1] = entryArr[i5].getValue();
                }
            }
        }
    }

    public static <K, V> a<K, V> b() {
        return new a<>();
    }

    public static <K, V> v<K, V> c(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.e(iterable);
        return aVar.a();
    }

    public static <K, V> v<K, V> d(Map<? extends K, ? extends V> map) {
        if ((map instanceof v) && !(map instanceof SortedMap)) {
            v<K, V> vVar = (v) map;
            if (!vVar.i()) {
                return vVar;
            }
        }
        return c(map.entrySet());
    }

    public static <K, V> v<K, V> k() {
        return (v<K, V>) n0.f15895f;
    }

    public static <K, V> v<K, V> l(K k2, V v) {
        j.a(k2, v);
        return n0.n(1, new Object[]{k2, v});
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    public abstract x<Map.Entry<K, V>> e();

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        return d0.b(this, obj);
    }

    public abstract x<K> f();

    public abstract r<V> g();

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public x<Map.Entry<K, V>> entrySet() {
        x<Map.Entry<K, V>> xVar = this.f15968c;
        if (xVar != null) {
            return xVar;
        }
        x<Map.Entry<K, V>> xVarE = e();
        this.f15968c = xVarE;
        return xVarE;
    }

    @Override // java.util.Map
    public int hashCode() {
        return s0.b(entrySet());
    }

    public abstract boolean i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public x<K> keySet() {
        x<K> xVar = this.f15969d;
        if (xVar != null) {
            return xVar;
        }
        x<K> xVarF = f();
        this.f15969d = xVarF;
        return xVarF;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public r<V> values() {
        r<V> rVar = this.f15970e;
        if (rVar != null) {
            return rVar;
        }
        r<V> rVarG = g();
        this.f15970e = rVarG;
        return rVarG;
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return d0.k(this);
    }
}

package c.f.b.b;

import c.f.b.b.r;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class p<K, V> extends AbstractMap<K, V> implements c.f.b.b.h<K, V>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient K[] f15916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient V[] f15917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f15918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f15919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int[] f15920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int[] f15921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int[] f15922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int[] f15923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NullableDecl
    public transient int f15924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NullableDecl
    public transient int f15925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient int[] f15926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient int[] f15927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient Set<K> f15928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient Set<V> f15929o;
    public transient Set<Map.Entry<K, V>> p;

    @RetainedWith
    @MonotonicNonNullDecl
    public transient c.f.b.b.h<V, K> q;

    public final class a extends c.f.b.b.e<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NullableDecl
        public final K f15930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15931c;

        public a(int i2) {
            this.f15930b = p.this.f15916b[i2];
            this.f15931c = i2;
        }

        public void a() {
            int i2 = this.f15931c;
            if (i2 != -1) {
                p pVar = p.this;
                if (i2 <= pVar.f15918d && c.f.b.a.h.a(pVar.f15916b[i2], this.f15930b)) {
                    return;
                }
            }
            this.f15931c = p.this.o(this.f15930b);
        }

        @Override // c.f.b.b.e, java.util.Map.Entry
        public K getKey() {
            return this.f15930b;
        }

        @Override // c.f.b.b.e, java.util.Map.Entry
        @NullableDecl
        public V getValue() {
            a();
            int i2 = this.f15931c;
            if (i2 == -1) {
                return null;
            }
            return p.this.f15917c[i2];
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            a();
            int i2 = this.f15931c;
            if (i2 == -1) {
                return (V) p.this.put(this.f15930b, v);
            }
            V v2 = p.this.f15917c[i2];
            if (c.f.b.a.h.a(v2, v)) {
                return v;
            }
            p.this.G(this.f15931c, v, false);
            return v2;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class b<K, V> extends c.f.b.b.e<V, K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p<K, V> f15933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final V f15934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15935d;

        public b(p<K, V> pVar, int i2) {
            this.f15933b = pVar;
            this.f15934c = pVar.f15917c[i2];
            this.f15935d = i2;
        }

        public final void a() {
            int i2 = this.f15935d;
            if (i2 != -1) {
                p<K, V> pVar = this.f15933b;
                if (i2 <= pVar.f15918d && c.f.b.a.h.a(this.f15934c, pVar.f15917c[i2])) {
                    return;
                }
            }
            this.f15935d = this.f15933b.q(this.f15934c);
        }

        @Override // c.f.b.b.e, java.util.Map.Entry
        public V getKey() {
            return this.f15934c;
        }

        @Override // c.f.b.b.e, java.util.Map.Entry
        public K getValue() {
            a();
            int i2 = this.f15935d;
            if (i2 == -1) {
                return null;
            }
            return this.f15933b.f15916b[i2];
        }

        @Override // java.util.Map.Entry
        public K setValue(K k2) {
            a();
            int i2 = this.f15935d;
            if (i2 == -1) {
                return this.f15933b.y(this.f15934c, k2, false);
            }
            K k3 = this.f15933b.f15916b[i2];
            if (c.f.b.a.h.a(k3, k2)) {
                return k2;
            }
            this.f15933b.F(this.f15935d, k2, false);
            return k3;
        }
    }

    public final class c extends h<K, V, Map.Entry<K, V>> {
        public c() {
            super(p.this);
        }

        @Override // c.f.b.b.p.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(int i2) {
            return new a(i2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iO = p.this.o(key);
            return iO != -1 && c.f.b.a.h.a(value, p.this.f15917c[iO]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC = q.c(key);
            int iP = p.this.p(key, iC);
            if (iP == -1 || !c.f.b.a.h.a(value, p.this.f15917c[iP])) {
                return false;
            }
            p.this.C(iP, iC);
            return true;
        }
    }

    public static class d<K, V> extends AbstractMap<V, K> implements c.f.b.b.h<V, K>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p<K, V> f15937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient Set<Map.Entry<V, K>> f15938c;

        public d(p<K, V> pVar) {
            this.f15937b = pVar;
        }

        @Override // c.f.b.b.h
        public c.f.b.b.h<K, V> B() {
            return this.f15937b;
        }

        @Override // c.f.b.b.h
        @CanIgnoreReturnValue
        @NullableDecl
        public K a(@NullableDecl V v, @NullableDecl K k2) {
            return this.f15937b.y(v, k2, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Set<K> values() {
            return this.f15937b.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f15937b.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return this.f15937b.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@NullableDecl Object obj) {
            return this.f15937b.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f15938c;
            if (set != null) {
                return set;
            }
            e eVar = new e(this.f15937b);
            this.f15938c = eVar;
            return eVar;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @NullableDecl
        public K get(@NullableDecl Object obj) {
            return this.f15937b.s(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.f15937b.values();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        @NullableDecl
        public K put(@NullableDecl V v, @NullableDecl K k2) {
            return this.f15937b.y(v, k2, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        @NullableDecl
        public K remove(@NullableDecl Object obj) {
            return this.f15937b.E(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f15937b.f15918d;
        }
    }

    public static class e<K, V> extends h<K, V, Map.Entry<V, K>> {
        public e(p<K, V> pVar) {
            super(pVar);
        }

        @Override // c.f.b.b.p.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> a(int i2) {
            return new b(this.f15941b, i2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iQ = this.f15941b.q(key);
            return iQ != -1 && c.f.b.a.h.a(this.f15941b.f15916b[iQ], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC = q.c(key);
            int iR = this.f15941b.r(key, iC);
            if (iR == -1 || !c.f.b.a.h.a(this.f15941b.f15916b[iR], value)) {
                return false;
            }
            this.f15941b.D(iR, iC);
            return true;
        }
    }

    public final class f extends h<K, V, K> {
        public f() {
            super(p.this);
        }

        @Override // c.f.b.b.p.h
        public K a(int i2) {
            return p.this.f15916b[i2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return p.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int iC = q.c(obj);
            int iP = p.this.p(obj, iC);
            if (iP == -1) {
                return false;
            }
            p.this.C(iP, iC);
            return true;
        }
    }

    public final class g extends h<K, V, V> {
        public g() {
            super(p.this);
        }

        @Override // c.f.b.b.p.h
        public V a(int i2) {
            return p.this.f15917c[i2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return p.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int iC = q.c(obj);
            int iR = p.this.r(obj, iC);
            if (iR == -1) {
                return false;
            }
            p.this.D(iR, iC);
            return true;
        }
    }

    public static abstract class h<K, V, T> extends AbstractSet<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p<K, V> f15941b;

        /* JADX INFO: loaded from: classes2.dex */
        public class a implements Iterator<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f15942b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f15943c = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f15944d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f15945e;

            public a() {
                this.f15942b = h.this.f15941b.f15924j;
                p<K, V> pVar = h.this.f15941b;
                this.f15944d = pVar.f15919e;
                this.f15945e = pVar.f15918d;
            }

            public final void a() {
                if (h.this.f15941b.f15919e != this.f15944d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f15942b != -2 && this.f15945e > 0;
            }

            @Override // java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T t = (T) h.this.a(this.f15942b);
                this.f15943c = this.f15942b;
                this.f15942b = h.this.f15941b.f15927m[this.f15942b];
                this.f15945e--;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                a();
                j.c(this.f15943c != -1);
                h.this.f15941b.z(this.f15943c);
                int i2 = this.f15942b;
                p<K, V> pVar = h.this.f15941b;
                if (i2 == pVar.f15918d) {
                    this.f15942b = this.f15943c;
                }
                this.f15943c = -1;
                this.f15944d = pVar.f15919e;
            }
        }

        public h(p<K, V> pVar) {
            this.f15941b = pVar;
        }

        public abstract T a(int i2);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f15941b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f15941b.f15918d;
        }
    }

    public p(int i2) {
        t(i2);
    }

    public static <K, V> p<K, V> g() {
        return h(16);
    }

    public static <K, V> p<K, V> h(int i2) {
        return new p<>(i2);
    }

    public static int[] i(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public static int[] m(int[] iArr, int i2) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
        Arrays.fill(iArrCopyOf, length, i2, -1);
        return iArrCopyOf;
    }

    public final void A(int i2, int i3, int i4) {
        c.f.b.a.k.d(i2 != -1);
        j(i2, i3);
        k(i2, i4);
        H(this.f15926l[i2], this.f15927m[i2]);
        w(this.f15918d - 1, i2);
        K[] kArr = this.f15916b;
        int i5 = this.f15918d;
        kArr[i5 - 1] = null;
        this.f15917c[i5 - 1] = null;
        this.f15918d = i5 - 1;
        this.f15919e++;
    }

    @Override // c.f.b.b.h
    public c.f.b.b.h<V, K> B() {
        c.f.b.b.h<V, K> hVar = this.q;
        if (hVar != null) {
            return hVar;
        }
        d dVar = new d(this);
        this.q = dVar;
        return dVar;
    }

    public void C(int i2, int i3) {
        A(i2, i3, q.c(this.f15917c[i2]));
    }

    public void D(int i2, int i3) {
        A(i2, q.c(this.f15916b[i2]), i3);
    }

    @NullableDecl
    public K E(@NullableDecl Object obj) {
        int iC = q.c(obj);
        int iR = r(obj, iC);
        if (iR == -1) {
            return null;
        }
        K k2 = this.f15916b[iR];
        D(iR, iC);
        return k2;
    }

    public final void F(int i2, @NullableDecl K k2, boolean z) {
        c.f.b.a.k.d(i2 != -1);
        int iC = q.c(k2);
        int iP = p(k2, iC);
        int i3 = this.f15925k;
        int i4 = -2;
        if (iP != -1) {
            if (!z) {
                throw new IllegalArgumentException("Key already present in map: " + k2);
            }
            i3 = this.f15926l[iP];
            i4 = this.f15927m[iP];
            C(iP, iC);
            if (i2 == this.f15918d) {
                i2 = iP;
            }
        }
        if (i3 == i2) {
            i3 = this.f15926l[i2];
        } else if (i3 == this.f15918d) {
            i3 = iP;
        }
        if (i4 == i2) {
            iP = this.f15927m[i2];
        } else if (i4 != this.f15918d) {
            iP = i4;
        }
        H(this.f15926l[i2], this.f15927m[i2]);
        j(i2, q.c(this.f15916b[i2]));
        this.f15916b[i2] = k2;
        u(i2, q.c(k2));
        H(i3, i2);
        H(i2, iP);
    }

    public final void G(int i2, @NullableDecl V v, boolean z) {
        c.f.b.a.k.d(i2 != -1);
        int iC = q.c(v);
        int iR = r(v, iC);
        if (iR != -1) {
            if (!z) {
                throw new IllegalArgumentException("Value already present in map: " + v);
            }
            D(iR, iC);
            if (i2 == this.f15918d) {
                i2 = iR;
            }
        }
        k(i2, q.c(this.f15917c[i2]));
        this.f15917c[i2] = v;
        v(i2, iC);
    }

    public final void H(int i2, int i3) {
        if (i2 == -2) {
            this.f15924j = i3;
        } else {
            this.f15927m[i2] = i3;
        }
        if (i3 == -2) {
            this.f15925k = i2;
        } else {
            this.f15926l[i3] = i2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Set<V> values() {
        Set<V> set = this.f15929o;
        if (set != null) {
            return set;
        }
        g gVar = new g();
        this.f15929o = gVar;
        return gVar;
    }

    @Override // c.f.b.b.h
    @CanIgnoreReturnValue
    @NullableDecl
    public V a(@NullableDecl K k2, @NullableDecl V v) {
        return x(k2, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f15916b, 0, this.f15918d, (Object) null);
        Arrays.fill(this.f15917c, 0, this.f15918d, (Object) null);
        Arrays.fill(this.f15920f, -1);
        Arrays.fill(this.f15921g, -1);
        Arrays.fill(this.f15922h, 0, this.f15918d, -1);
        Arrays.fill(this.f15923i, 0, this.f15918d, -1);
        Arrays.fill(this.f15926l, 0, this.f15918d, -1);
        Arrays.fill(this.f15927m, 0, this.f15918d, -1);
        this.f15918d = 0;
        this.f15924j = -2;
        this.f15925k = -2;
        this.f15919e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return o(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return q(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.p;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.p = cVar;
        return cVar;
    }

    public final int f(int i2) {
        return i2 & (this.f15920f.length - 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        int iO = o(obj);
        if (iO == -1) {
            return null;
        }
        return this.f15917c[iO];
    }

    public final void j(int i2, int i3) {
        c.f.b.a.k.d(i2 != -1);
        int iF = f(i3);
        int[] iArr = this.f15920f;
        if (iArr[iF] == i2) {
            int[] iArr2 = this.f15922h;
            iArr[iF] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i4 = iArr[iF];
        int i5 = this.f15922h[i4];
        while (true) {
            int i6 = i5;
            int i7 = i4;
            i4 = i6;
            if (i4 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.f15916b[i2]);
            }
            if (i4 == i2) {
                int[] iArr3 = this.f15922h;
                iArr3[i7] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
            i5 = this.f15922h[i4];
        }
    }

    public final void k(int i2, int i3) {
        c.f.b.a.k.d(i2 != -1);
        int iF = f(i3);
        int[] iArr = this.f15921g;
        if (iArr[iF] == i2) {
            int[] iArr2 = this.f15923i;
            iArr[iF] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i4 = iArr[iF];
        int i5 = this.f15923i[i4];
        while (true) {
            int i6 = i5;
            int i7 = i4;
            i4 = i6;
            if (i4 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.f15917c[i2]);
            }
            if (i4 == i2) {
                int[] iArr3 = this.f15923i;
                iArr3[i7] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
            i5 = this.f15923i[i4];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f15928n;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f15928n = fVar;
        return fVar;
    }

    public final void l(int i2) {
        int[] iArr = this.f15922h;
        if (iArr.length < i2) {
            int iA = r.b.a(iArr.length, i2);
            this.f15916b = (K[]) Arrays.copyOf(this.f15916b, iA);
            this.f15917c = (V[]) Arrays.copyOf(this.f15917c, iA);
            this.f15922h = m(this.f15922h, iA);
            this.f15923i = m(this.f15923i, iA);
            this.f15926l = m(this.f15926l, iA);
            this.f15927m = m(this.f15927m, iA);
        }
        if (this.f15920f.length < i2) {
            int iA2 = q.a(i2, 1.0d);
            this.f15920f = i(iA2);
            this.f15921g = i(iA2);
            for (int i3 = 0; i3 < this.f15918d; i3++) {
                int iF = f(q.c(this.f15916b[i3]));
                int[] iArr2 = this.f15922h;
                int[] iArr3 = this.f15920f;
                iArr2[i3] = iArr3[iF];
                iArr3[iF] = i3;
                int iF2 = f(q.c(this.f15917c[i3]));
                int[] iArr4 = this.f15923i;
                int[] iArr5 = this.f15921g;
                iArr4[i3] = iArr5[iF2];
                iArr5[iF2] = i3;
            }
        }
    }

    public int n(@NullableDecl Object obj, int i2, int[] iArr, int[] iArr2, Object[] objArr) {
        int i3 = iArr[f(i2)];
        while (i3 != -1) {
            if (c.f.b.a.h.a(objArr[i3], obj)) {
                return i3;
            }
            i3 = iArr2[i3];
        }
        return -1;
    }

    public int o(@NullableDecl Object obj) {
        return p(obj, q.c(obj));
    }

    public int p(@NullableDecl Object obj, int i2) {
        return n(obj, i2, this.f15920f, this.f15922h, this.f15916b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k2, @NullableDecl V v) {
        return x(k2, v, false);
    }

    public int q(@NullableDecl Object obj) {
        return r(obj, q.c(obj));
    }

    public int r(@NullableDecl Object obj, int i2) {
        return n(obj, i2, this.f15921g, this.f15923i, this.f15917c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        int iC = q.c(obj);
        int iP = p(obj, iC);
        if (iP == -1) {
            return null;
        }
        V v = this.f15917c[iP];
        C(iP, iC);
        return v;
    }

    @NullableDecl
    public K s(@NullableDecl Object obj) {
        int iQ = q(obj);
        if (iQ == -1) {
            return null;
        }
        return this.f15916b[iQ];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f15918d;
    }

    public void t(int i2) {
        j.b(i2, "expectedSize");
        int iA = q.a(i2, 1.0d);
        this.f15918d = 0;
        this.f15916b = (K[]) new Object[i2];
        this.f15917c = (V[]) new Object[i2];
        this.f15920f = i(iA);
        this.f15921g = i(iA);
        this.f15922h = i(i2);
        this.f15923i = i(i2);
        this.f15924j = -2;
        this.f15925k = -2;
        this.f15926l = i(i2);
        this.f15927m = i(i2);
    }

    public final void u(int i2, int i3) {
        c.f.b.a.k.d(i2 != -1);
        int iF = f(i3);
        int[] iArr = this.f15922h;
        int[] iArr2 = this.f15920f;
        iArr[i2] = iArr2[iF];
        iArr2[iF] = i2;
    }

    public final void v(int i2, int i3) {
        c.f.b.a.k.d(i2 != -1);
        int iF = f(i3);
        int[] iArr = this.f15923i;
        int[] iArr2 = this.f15921g;
        iArr[i2] = iArr2[iF];
        iArr2[iF] = i2;
    }

    public final void w(int i2, int i3) {
        int i4;
        int i5;
        if (i2 == i3) {
            return;
        }
        int i6 = this.f15926l[i2];
        int i7 = this.f15927m[i2];
        H(i6, i3);
        H(i3, i7);
        K[] kArr = this.f15916b;
        K k2 = kArr[i2];
        V[] vArr = this.f15917c;
        V v = vArr[i2];
        kArr[i3] = k2;
        vArr[i3] = v;
        int iF = f(q.c(k2));
        int[] iArr = this.f15920f;
        if (iArr[iF] == i2) {
            iArr[iF] = i3;
        } else {
            int i8 = iArr[iF];
            int i9 = this.f15922h[i8];
            while (true) {
                int i10 = i9;
                i4 = i8;
                i8 = i10;
                if (i8 == i2) {
                    break;
                } else {
                    i9 = this.f15922h[i8];
                }
            }
            this.f15922h[i4] = i3;
        }
        int[] iArr2 = this.f15922h;
        iArr2[i3] = iArr2[i2];
        iArr2[i2] = -1;
        int iF2 = f(q.c(v));
        int[] iArr3 = this.f15921g;
        if (iArr3[iF2] == i2) {
            iArr3[iF2] = i3;
        } else {
            int i11 = iArr3[iF2];
            int i12 = this.f15923i[i11];
            while (true) {
                int i13 = i12;
                i5 = i11;
                i11 = i13;
                if (i11 == i2) {
                    break;
                } else {
                    i12 = this.f15923i[i11];
                }
            }
            this.f15923i[i5] = i3;
        }
        int[] iArr4 = this.f15923i;
        iArr4[i3] = iArr4[i2];
        iArr4[i2] = -1;
    }

    @NullableDecl
    public V x(@NullableDecl K k2, @NullableDecl V v, boolean z) {
        int iC = q.c(k2);
        int iP = p(k2, iC);
        if (iP != -1) {
            V v2 = this.f15917c[iP];
            if (c.f.b.a.h.a(v2, v)) {
                return v;
            }
            G(iP, v, z);
            return v2;
        }
        int iC2 = q.c(v);
        int iR = r(v, iC2);
        if (!z) {
            c.f.b.a.k.g(iR == -1, "Value already present: %s", v);
        } else if (iR != -1) {
            D(iR, iC2);
        }
        l(this.f15918d + 1);
        K[] kArr = this.f15916b;
        int i2 = this.f15918d;
        kArr[i2] = k2;
        this.f15917c[i2] = v;
        u(i2, iC);
        v(this.f15918d, iC2);
        H(this.f15925k, this.f15918d);
        H(this.f15918d, -2);
        this.f15918d++;
        this.f15919e++;
        return null;
    }

    @NullableDecl
    public K y(@NullableDecl V v, @NullableDecl K k2, boolean z) {
        int iC = q.c(v);
        int iR = r(v, iC);
        if (iR != -1) {
            K k3 = this.f15916b[iR];
            if (c.f.b.a.h.a(k3, k2)) {
                return k2;
            }
            F(iR, k2, z);
            return k3;
        }
        int i2 = this.f15925k;
        int iC2 = q.c(k2);
        int iP = p(k2, iC2);
        if (!z) {
            c.f.b.a.k.g(iP == -1, "Key already present: %s", k2);
        } else if (iP != -1) {
            i2 = this.f15926l[iP];
            C(iP, iC2);
        }
        l(this.f15918d + 1);
        K[] kArr = this.f15916b;
        int i3 = this.f15918d;
        kArr[i3] = k2;
        this.f15917c[i3] = v;
        u(i3, iC2);
        v(this.f15918d, iC);
        int i4 = i2 == -2 ? this.f15924j : this.f15927m[i2];
        H(i2, this.f15918d);
        H(this.f15918d, i4);
        this.f15918d++;
        this.f15919e++;
        return null;
    }

    public void z(int i2) {
        C(i2, q.c(this.f15916b[i2]));
    }
}

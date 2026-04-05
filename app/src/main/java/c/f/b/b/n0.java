package c.f.b.b;

import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class n0<K, V> extends v<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v<Object, Object> f15895f = new n0(null, new Object[0], 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int[] f15896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient Object[] f15897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient int f15898i;

    /* JADX INFO: loaded from: classes2.dex */
    public static class a<K, V> extends x<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient v<K, V> f15899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient Object[] f15900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final transient int f15901f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final transient int f15902g;

        /* JADX INFO: renamed from: c.f.b.b.n0$a$a, reason: collision with other inner class name */
        public class C0188a extends t<Map.Entry<K, V>> {
            public C0188a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i2) {
                c.f.b.a.k.h(i2, a.this.f15902g);
                int i3 = i2 * 2;
                return new AbstractMap.SimpleImmutableEntry(a.this.f15900e[a.this.f15901f + i3], a.this.f15900e[i3 + (a.this.f15901f ^ 1)]);
            }

            @Override // c.f.b.b.r
            public boolean s() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f15902g;
            }
        }

        public a(v<K, V> vVar, Object[] objArr, int i2, int i3) {
            this.f15899d = vVar;
            this.f15900e = objArr;
            this.f15901f = i2;
            this.f15902g = i3;
        }

        @Override // c.f.b.b.x
        public t<Map.Entry<K, V>> D() {
            return new C0188a();
        }

        @Override // c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f15899d.get(key));
        }

        @Override // c.f.b.b.r
        public int e(Object[] objArr, int i2) {
            return d().e(objArr, i2);
        }

        @Override // c.f.b.b.r
        public boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f15902g;
        }

        @Override // c.f.b.b.x, c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: t */
        public w0<Map.Entry<K, V>> iterator() {
            return d().iterator();
        }
    }

    public static final class b<K> extends x<K> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient v<K, ?> f15904d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient t<K> f15905e;

        public b(v<K, ?> vVar, t<K> tVar) {
            this.f15904d = vVar;
            this.f15905e = tVar;
        }

        @Override // c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f15904d.get(obj) != null;
        }

        @Override // c.f.b.b.x, c.f.b.b.r
        public t<K> d() {
            return this.f15905e;
        }

        @Override // c.f.b.b.r
        public int e(Object[] objArr, int i2) {
            return d().e(objArr, i2);
        }

        @Override // c.f.b.b.r
        public boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f15904d.size();
        }

        @Override // c.f.b.b.x, c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: t */
        public w0<K> iterator() {
            return d().iterator();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c extends t<Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient Object[] f15906d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient int f15907e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final transient int f15908f;

        public c(Object[] objArr, int i2, int i3) {
            this.f15906d = objArr;
            this.f15907e = i2;
            this.f15908f = i3;
        }

        @Override // java.util.List
        public Object get(int i2) {
            c.f.b.a.k.h(i2, this.f15908f);
            return this.f15906d[(i2 * 2) + this.f15907e];
        }

        @Override // c.f.b.b.r
        public boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f15908f;
        }
    }

    public n0(int[] iArr, Object[] objArr, int i2) {
        this.f15896g = iArr;
        this.f15897h = objArr;
        this.f15898i = i2;
    }

    public static <K, V> n0<K, V> n(int i2, Object[] objArr) {
        if (i2 == 0) {
            return (n0) f15895f;
        }
        if (i2 == 1) {
            j.a(objArr[0], objArr[1]);
            return new n0<>(null, objArr, 1);
        }
        c.f.b.a.k.l(i2, objArr.length >> 1);
        return new n0<>(o(objArr, i2, x.v(i2), 0), objArr, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] o(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto Le
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            c.f.b.b.j.a(r11, r10)
            r10 = 0
            return r10
        Le:
            int r1 = r12 + (-1)
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L17:
            if (r3 >= r11) goto L77
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            c.f.b.b.j.a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = c.f.b.b.q.b(r7)
        L2f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L39
            r12[r7] = r5
            int r3 = r3 + 1
            goto L17
        L39:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L44
            int r7 = r7 + 1
            goto L2f
        L44:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Multiple entries with same key: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L77:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.b.n0.o(java.lang.Object[], int, int, int):int[]");
    }

    public static Object p(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i2, int i3, @NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        if (i2 == 1) {
            if (objArr[i3].equals(obj)) {
                return objArr[i3 ^ 1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int iB = q.b(obj.hashCode());
        while (true) {
            int i4 = iB & length;
            int i5 = iArr[i4];
            if (i5 == -1) {
                return null;
            }
            if (objArr[i5].equals(obj)) {
                return objArr[i5 ^ 1];
            }
            iB = i4 + 1;
        }
    }

    @Override // c.f.b.b.v
    public x<Map.Entry<K, V>> e() {
        return new a(this, this.f15897h, 0, this.f15898i);
    }

    @Override // c.f.b.b.v
    public x<K> f() {
        return new b(this, new c(this.f15897h, 0, this.f15898i));
    }

    @Override // c.f.b.b.v
    public r<V> g() {
        return new c(this.f15897h, 1, this.f15898i);
    }

    @Override // c.f.b.b.v, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return (V) p(this.f15896g, this.f15897h, this.f15898i, 0, obj);
    }

    @Override // c.f.b.b.v
    public boolean i() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f15898i;
    }
}

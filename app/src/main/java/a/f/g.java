package a.f;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<K, V> f1274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1281h;

    public g(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1276c = i2;
        this.f1274a = new LinkedHashMap<>(0, 0.75f, true);
    }

    public V a(K k2) {
        return null;
    }

    public void b(boolean z, K k2, V v, V v2) {
    }

    public final void c() {
        l(-1);
    }

    public final V d(K k2) {
        V vPut;
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.f1274a.get(k2);
            if (v != null) {
                this.f1280g++;
                return v;
            }
            this.f1281h++;
            V vA = a(k2);
            if (vA == null) {
                return null;
            }
            synchronized (this) {
                this.f1278e++;
                vPut = this.f1274a.put(k2, vA);
                if (vPut != null) {
                    this.f1274a.put(k2, vPut);
                } else {
                    this.f1275b += h(k2, vA);
                }
            }
            if (vPut != null) {
                b(false, k2, vA, vPut);
                return vPut;
            }
            l(this.f1276c);
            return vA;
        }
    }

    public final synchronized int e() {
        return this.f1276c;
    }

    public final V f(K k2, V v) {
        V vPut;
        if (k2 == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1277d++;
            this.f1275b += h(k2, v);
            vPut = this.f1274a.put(k2, v);
            if (vPut != null) {
                this.f1275b -= h(k2, vPut);
            }
        }
        if (vPut != null) {
            b(false, k2, vPut, v);
        }
        l(this.f1276c);
        return vPut;
    }

    public final V g(K k2) {
        V vRemove;
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            vRemove = this.f1274a.remove(k2);
            if (vRemove != null) {
                this.f1275b -= h(k2, vRemove);
            }
        }
        if (vRemove != null) {
            b(false, k2, vRemove, null);
        }
        return vRemove;
    }

    public final int h(K k2, V v) {
        int iJ = j(k2, v);
        if (iJ >= 0) {
            return iJ;
        }
        throw new IllegalStateException("Negative size: " + k2 + "=" + v);
    }

    public final synchronized int i() {
        return this.f1275b;
    }

    public int j(K k2, V v) {
        return 1;
    }

    public final synchronized Map<K, V> k() {
        return new LinkedHashMap(this.f1274a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f1275b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f1274a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f1275b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f1275b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f1274a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f1274a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f1274a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1275b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.h(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f1275b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1279f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f1279f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            goto L75
        L74:
            throw r5
        L75:
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.g.l(int):void");
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f1280g;
        i3 = this.f1281h + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1276c), Integer.valueOf(this.f1280g), Integer.valueOf(this.f1281h), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }
}

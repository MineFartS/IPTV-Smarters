package a.f;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Object[] f1297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f1298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Object[] f1299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f1300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f1301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f1302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1303h;

    public i() {
        this.f1301f = e.f1266a;
        this.f1302g = e.f1268c;
        this.f1303h = 0;
    }

    public i(int i2) {
        if (i2 == 0) {
            this.f1301f = e.f1266a;
            this.f1302g = e.f1268c;
        } else {
            b(i2);
        }
        this.f1303h = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(i<K, V> iVar) {
        this();
        if (iVar != 0) {
            k(iVar);
        }
    }

    public static int c(int[] iArr, int i2, int i3) {
        try {
            return e.a(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void e(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (i.class) {
                if (f1300e < 10) {
                    objArr[0] = f1299d;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1299d = objArr;
                    f1300e++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (i.class) {
                if (f1298c < 10) {
                    objArr[0] = f1297b;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1297b = objArr;
                    f1298c++;
                }
            }
        }
    }

    public final void b(int i2) {
        if (i2 == 8) {
            synchronized (i.class) {
                Object[] objArr = f1299d;
                if (objArr != null) {
                    this.f1302g = objArr;
                    f1299d = (Object[]) objArr[0];
                    this.f1301f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1300e--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (i.class) {
                Object[] objArr2 = f1297b;
                if (objArr2 != null) {
                    this.f1302g = objArr2;
                    f1297b = (Object[]) objArr2[0];
                    this.f1301f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1298c--;
                    return;
                }
            }
        }
        this.f1301f = new int[i2];
        this.f1302g = new Object[i2 << 1];
    }

    public void clear() {
        int i2 = this.f1303h;
        if (i2 > 0) {
            int[] iArr = this.f1301f;
            Object[] objArr = this.f1302g;
            this.f1301f = e.f1266a;
            this.f1302g = e.f1268c;
            this.f1303h = 0;
            e(iArr, objArr, i2);
        }
        if (this.f1303h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public void d(int i2) {
        int i3 = this.f1303h;
        int[] iArr = this.f1301f;
        if (iArr.length < i2) {
            Object[] objArr = this.f1302g;
            b(i2);
            if (this.f1303h > 0) {
                System.arraycopy(iArr, 0, this.f1301f, 0, i3);
                System.arraycopy(objArr, 0, this.f1302g, 0, i3 << 1);
            }
            e(iArr, objArr, i3);
        }
        if (this.f1303h != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (size() != iVar.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1303h; i2++) {
                try {
                    K kJ = j(i2);
                    V vN = n(i2);
                    Object obj2 = iVar.get(kJ);
                    if (vN == null) {
                        if (obj2 != null || !iVar.containsKey(kJ)) {
                            return false;
                        }
                    } else if (!vN.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f1303h; i3++) {
                try {
                    K kJ2 = j(i3);
                    V vN2 = n(i3);
                    Object obj3 = map.get(kJ2);
                    if (vN2 == null) {
                        if (obj3 != null || !map.containsKey(kJ2)) {
                            return false;
                        }
                    } else if (!vN2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj, int i2) {
        int i3 = this.f1303h;
        if (i3 == 0) {
            return -1;
        }
        int iC = c(this.f1301f, i3, i2);
        if (iC < 0 || obj.equals(this.f1302g[iC << 1])) {
            return iC;
        }
        int i4 = iC + 1;
        while (i4 < i3 && this.f1301f[i4] == i2) {
            if (obj.equals(this.f1302g[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iC - 1; i5 >= 0 && this.f1301f[i5] == i2; i5--) {
            if (obj.equals(this.f1302g[i5 << 1])) {
                return i5;
            }
        }
        return i4 ^ (-1);
    }

    public int g(Object obj) {
        return obj == null ? h() : f(obj, obj.hashCode());
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int iG = g(obj);
        return iG >= 0 ? (V) this.f1302g[(iG << 1) + 1] : v;
    }

    public int h() {
        int i2 = this.f1303h;
        if (i2 == 0) {
            return -1;
        }
        int iC = c(this.f1301f, i2, 0);
        if (iC < 0 || this.f1302g[iC << 1] == null) {
            return iC;
        }
        int i3 = iC + 1;
        while (i3 < i2 && this.f1301f[i3] == 0) {
            if (this.f1302g[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iC - 1; i4 >= 0 && this.f1301f[i4] == 0; i4--) {
            if (this.f1302g[i4 << 1] == null) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    public int hashCode() {
        int[] iArr = this.f1301f;
        Object[] objArr = this.f1302g;
        int i2 = this.f1303h;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    public int i(Object obj) {
        int i2 = this.f1303h * 2;
        Object[] objArr = this.f1302g;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f1303h <= 0;
    }

    public K j(int i2) {
        return (K) this.f1302g[i2 << 1];
    }

    public void k(i<? extends K, ? extends V> iVar) {
        int i2 = iVar.f1303h;
        d(this.f1303h + i2);
        if (this.f1303h != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(iVar.j(i3), iVar.n(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(iVar.f1301f, 0, this.f1301f, 0, i2);
            System.arraycopy(iVar.f1302g, 0, this.f1302g, 0, i2 << 1);
            this.f1303h = i2;
        }
    }

    public V l(int i2) {
        Object[] objArr = this.f1302g;
        int i3 = i2 << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.f1303h;
        int i5 = 0;
        if (i4 <= 1) {
            e(this.f1301f, objArr, i4);
            this.f1301f = e.f1266a;
            this.f1302g = e.f1268c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f1301f;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f1302g;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f1302g;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                b(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f1303h) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f1301f, 0, i2);
                    System.arraycopy(objArr, 0, this.f1302g, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f1301f, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f1302g, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f1303h) {
            throw new ConcurrentModificationException();
        }
        this.f1303h = i5;
        return v;
    }

    public V m(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f1302g;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    public V n(int i2) {
        return (V) this.f1302g[(i2 << 1) + 1];
    }

    public V put(K k2, V v) {
        int i2;
        int iF;
        int i3 = this.f1303h;
        if (k2 == null) {
            iF = h();
            i2 = 0;
        } else {
            int iHashCode = k2.hashCode();
            i2 = iHashCode;
            iF = f(k2, iHashCode);
        }
        if (iF >= 0) {
            int i4 = (iF << 1) + 1;
            Object[] objArr = this.f1302g;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = iF ^ (-1);
        int[] iArr = this.f1301f;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f1302g;
            b(i6);
            if (i3 != this.f1303h) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1301f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f1302g, 0, objArr2.length);
            }
            e(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f1301f;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f1302g;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f1303h - i5) << 1);
        }
        int i8 = this.f1303h;
        if (i3 == i8) {
            int[] iArr4 = this.f1301f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f1302g;
                int i9 = i5 << 1;
                objArr4[i9] = k2;
                objArr4[i9 + 1] = v;
                this.f1303h = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k2, V v) {
        V v2 = get(k2);
        return v2 == null ? put(k2, v) : v2;
    }

    public V remove(Object obj) {
        int iG = g(obj);
        if (iG >= 0) {
            return l(iG);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        V vN = n(iG);
        if (obj2 != vN && (obj2 == null || !obj2.equals(vN))) {
            return false;
        }
        l(iG);
        return true;
    }

    public V replace(K k2, V v) {
        int iG = g(k2);
        if (iG >= 0) {
            return m(iG, v);
        }
        return null;
    }

    public boolean replace(K k2, V v, V v2) {
        int iG = g(k2);
        if (iG < 0) {
            return false;
        }
        V vN = n(iG);
        if (vN != v && (v == null || !v.equals(vN))) {
            return false;
        }
        m(iG, v2);
        return true;
    }

    public int size() {
        return this.f1303h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1303h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1303h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kJ = j(i2);
            if (kJ != this) {
                sb.append(kJ);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vN = n(i2);
            if (vN != this) {
                sb.append(vN);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

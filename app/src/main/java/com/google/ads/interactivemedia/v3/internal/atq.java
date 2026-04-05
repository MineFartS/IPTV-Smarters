package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class atq<K, V> extends AbstractMap<K, V> implements Serializable, asr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient K[] f20531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient V[] f20532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f20533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f20534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int[] f20535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int[] f20536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient int[] f20537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient int[] f20538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient int f20539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient int f20540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient int[] f20541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private transient int[] f20542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private transient Set<K> f20543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient Set<V> f20544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f20545o;
    private transient asr<V, K> p;

    private atq() {
        i(2);
    }

    private static int[] A(int[] iArr, int i2) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
        Arrays.fill(iArrCopyOf, length, i2, -1);
        return iArrCopyOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(int i2, K k2) {
        ars.a(i2 != -1);
        int iD = d(k2, auv.u(k2));
        int i3 = this.f20540j;
        if (iD != -1) {
            String strValueOf = String.valueOf(k2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 28);
            sb.append("Key already present in map: ");
            sb.append(strValueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i3 == i2) {
            i3 = this.f20541k[i2];
        } else if (i3 == this.f20533c) {
            i3 = iD;
        }
        if (i2 == -2) {
            iD = this.f20542l[-2];
        } else if (this.f20533c != -2) {
            iD = -2;
        }
        y(this.f20541k[i2], this.f20542l[i2]);
        s(i2, auv.u(this.f20531a[i2]));
        this.f20531a[i2] = k2;
        v(i2, auv.u(k2));
        y(i3, i2);
        y(i2, iD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(int i2, V v) {
        ars.a(i2 != -1);
        int iU = auv.u(v);
        if (f(v, iU) == -1) {
            t(i2, auv.u(this.f20532b[i2]));
            this.f20532b[i2] = v;
            w(i2, iU);
        } else {
            String strValueOf = String.valueOf(v);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 30);
            sb.append("Value already present in map: ");
            sb.append(strValueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static <K, V> atq<K, V> p() {
        return new atq<>();
    }

    private final int r(int i2) {
        return i2 & (this.f20535e.length - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        i(16);
        for (int i3 = 0; i3 < i2; i3++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final void s(int i2, int i3) {
        ars.a(i2 != -1);
        int iR = r(i3);
        int[] iArr = this.f20535e;
        int i4 = iArr[iR];
        if (i4 == i2) {
            int[] iArr2 = this.f20537g;
            iArr[iR] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i5 = this.f20537g[i4];
        while (true) {
            int i6 = i4;
            i4 = i5;
            if (i4 == -1) {
                String strValueOf = String.valueOf(this.f20531a[i2]);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(strValueOf);
                throw new AssertionError(sb.toString());
            }
            if (i4 == i2) {
                int[] iArr3 = this.f20537g;
                iArr3[i6] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
            i5 = this.f20537g[i4];
        }
    }

    private final void t(int i2, int i3) {
        ars.a(i2 != -1);
        int iR = r(i3);
        int[] iArr = this.f20536f;
        int i4 = iArr[iR];
        if (i4 == i2) {
            int[] iArr2 = this.f20538h;
            iArr[iR] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i5 = this.f20538h[i4];
        while (true) {
            int i6 = i4;
            i4 = i5;
            if (i4 == -1) {
                String strValueOf = String.valueOf(this.f20532b[i2]);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                sb.append("Expected to find entry with value ");
                sb.append(strValueOf);
                throw new AssertionError(sb.toString());
            }
            if (i4 == i2) {
                int[] iArr3 = this.f20538h;
                iArr3[i6] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
            i5 = this.f20538h[i4];
        }
    }

    private final void u(int i2) {
        int length = this.f20537g.length;
        if (length < i2) {
            int iA = atr.a(length, i2);
            this.f20531a = (K[]) Arrays.copyOf(this.f20531a, iA);
            this.f20532b = (V[]) Arrays.copyOf(this.f20532b, iA);
            this.f20537g = A(this.f20537g, iA);
            this.f20538h = A(this.f20538h, iA);
            this.f20541k = A(this.f20541k, iA);
            this.f20542l = A(this.f20542l, iA);
        }
        if (this.f20535e.length < i2) {
            int iV = auv.v(i2);
            this.f20535e = z(iV);
            this.f20536f = z(iV);
            for (int i3 = 0; i3 < this.f20533c; i3++) {
                int iR = r(auv.u(this.f20531a[i3]));
                int[] iArr = this.f20537g;
                int[] iArr2 = this.f20535e;
                iArr[i3] = iArr2[iR];
                iArr2[iR] = i3;
                int iR2 = r(auv.u(this.f20532b[i3]));
                int[] iArr3 = this.f20538h;
                int[] iArr4 = this.f20536f;
                iArr3[i3] = iArr4[iR2];
                iArr4[iR2] = i3;
            }
        }
    }

    private final void v(int i2, int i3) {
        ars.a(i2 != -1);
        int iR = r(i3);
        int[] iArr = this.f20537g;
        int[] iArr2 = this.f20535e;
        iArr[i2] = iArr2[iR];
        iArr2[iR] = i2;
    }

    private final void w(int i2, int i3) {
        ars.a(i2 != -1);
        int iR = r(i3);
        int[] iArr = this.f20538h;
        int[] iArr2 = this.f20536f;
        iArr[i2] = iArr2[iR];
        iArr2[iR] = i2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f20533c);
        for (Map.Entry<K, V> entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private final void x(int i2, int i3, int i4) {
        int i5;
        int i6;
        ars.a(i2 != -1);
        s(i2, i3);
        t(i2, i4);
        y(this.f20541k[i2], this.f20542l[i2]);
        int i7 = this.f20533c - 1;
        if (i7 != i2) {
            int i8 = this.f20541k[i7];
            int i9 = this.f20542l[i7];
            y(i8, i2);
            y(i2, i9);
            K[] kArr = this.f20531a;
            K k2 = kArr[i7];
            V[] vArr = this.f20532b;
            V v = vArr[i7];
            kArr[i2] = k2;
            vArr[i2] = v;
            int iR = r(auv.u(k2));
            int[] iArr = this.f20535e;
            int i10 = iArr[iR];
            if (i10 == i7) {
                iArr[iR] = i2;
            } else {
                int i11 = this.f20537g[i10];
                while (true) {
                    i5 = i10;
                    i10 = i11;
                    if (i10 == i7) {
                        break;
                    } else {
                        i11 = this.f20537g[i10];
                    }
                }
                this.f20537g[i5] = i2;
            }
            int[] iArr2 = this.f20537g;
            iArr2[i2] = iArr2[i7];
            iArr2[i7] = -1;
            int iR2 = r(auv.u(v));
            int[] iArr3 = this.f20536f;
            int i12 = iArr3[iR2];
            if (i12 == i7) {
                iArr3[iR2] = i2;
            } else {
                int i13 = this.f20538h[i12];
                while (true) {
                    i6 = i12;
                    i12 = i13;
                    if (i12 == i7) {
                        break;
                    } else {
                        i13 = this.f20538h[i12];
                    }
                }
                this.f20538h[i6] = i2;
            }
            int[] iArr4 = this.f20538h;
            iArr4[i2] = iArr4[i7];
            iArr4[i7] = -1;
        }
        K[] kArr2 = this.f20531a;
        int i14 = this.f20533c - 1;
        kArr2[i14] = null;
        this.f20532b[i14] = null;
        this.f20533c = i14;
        this.f20534d++;
    }

    private final void y(int i2, int i3) {
        if (i2 == -2) {
            this.f20539i = i3;
        } else {
            this.f20542l[i2] = i3;
        }
        if (i3 == -2) {
            this.f20540j = i2;
        } else {
            this.f20541k[i3] = i2;
        }
    }

    private static int[] z(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final int b(Object obj, int i2, int[] iArr, int[] iArr2, Object[] objArr) {
        int i3 = iArr[r(i2)];
        while (i3 != -1) {
            if (auv.w(objArr[i3], obj)) {
                return i3;
            }
            i3 = iArr2[i3];
        }
        return -1;
    }

    public final int c(Object obj) {
        return d(obj, auv.u(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f20531a, 0, this.f20533c, (Object) null);
        Arrays.fill(this.f20532b, 0, this.f20533c, (Object) null);
        Arrays.fill(this.f20535e, -1);
        Arrays.fill(this.f20536f, -1);
        Arrays.fill(this.f20537g, 0, this.f20533c, -1);
        Arrays.fill(this.f20538h, 0, this.f20533c, -1);
        Arrays.fill(this.f20541k, 0, this.f20533c, -1);
        Arrays.fill(this.f20542l, 0, this.f20533c, -1);
        this.f20533c = 0;
        this.f20539i = -2;
        this.f20540j = -2;
        this.f20534d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return e(obj) != -1;
    }

    public final int d(Object obj, int i2) {
        return b(obj, i2, this.f20535e, this.f20537g, this.f20531a);
    }

    public final int e(Object obj) {
        return f(obj, auv.u(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f20545o;
        if (set != null) {
            return set;
        }
        atj atjVar = new atj(this);
        this.f20545o = atjVar;
        return atjVar;
    }

    public final int f(Object obj, int i2) {
        return b(obj, i2, this.f20536f, this.f20538h, this.f20532b);
    }

    public final asr<V, K> g() {
        asr<V, K> asrVar = this.p;
        if (asrVar != null) {
            return asrVar;
        }
        atk atkVar = new atk(this);
        this.p = atkVar;
        return atkVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        int iC = c(obj);
        if (iC == -1) {
            return null;
        }
        return this.f20532b[iC];
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Set<V> values() {
        Set<V> set = this.f20544n;
        if (set != null) {
            return set;
        }
        atn atnVar = new atn(this);
        this.f20544n = atnVar;
        return atnVar;
    }

    public final void i(int i2) {
        auv.q(i2, "expectedSize");
        int iV = auv.v(i2);
        this.f20533c = 0;
        this.f20531a = (K[]) new Object[i2];
        this.f20532b = (V[]) new Object[i2];
        this.f20535e = z(iV);
        this.f20536f = z(iV);
        this.f20537g = z(i2);
        this.f20538h = z(i2);
        this.f20539i = -2;
        this.f20540j = -2;
        this.f20541k = z(i2);
        this.f20542l = z(i2);
    }

    public final void j(int i2, int i3) {
        x(i2, i3, auv.u(this.f20532b[i2]));
    }

    public final void k(int i2, int i3) {
        x(i2, auv.u(this.f20531a[i2]), i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f20543m;
        if (set != null) {
            return set;
        }
        atm atmVar = new atm(this);
        this.f20543m = atmVar;
        return atmVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        int iU = auv.u(k2);
        int iD = d(k2, iU);
        if (iD != -1) {
            V v2 = this.f20532b[iD];
            if (auv.w(v2, v)) {
                return v;
            }
            C(iD, v);
            return v2;
        }
        int iU2 = auv.u(v);
        ars.c(f(v, iU2) == -1, "Value already present: %s", v);
        u(this.f20533c + 1);
        K[] kArr = this.f20531a;
        int i2 = this.f20533c;
        kArr[i2] = k2;
        this.f20532b[i2] = v;
        v(i2, iU);
        w(this.f20533c, iU2);
        y(this.f20540j, this.f20533c);
        y(this.f20533c, -2);
        this.f20533c++;
        this.f20534d++;
        return null;
    }

    public final K q(V v, K k2) {
        int iU = auv.u(v);
        int iF = f(v, iU);
        if (iF != -1) {
            K k3 = this.f20531a[iF];
            if (auv.w(k3, k2)) {
                return k2;
            }
            B(iF, k2);
            return k3;
        }
        int i2 = this.f20540j;
        int iU2 = auv.u(k2);
        ars.c(d(k2, iU2) == -1, "Key already present: %s", k2);
        u(this.f20533c + 1);
        K[] kArr = this.f20531a;
        int i3 = this.f20533c;
        kArr[i3] = k2;
        this.f20532b[i3] = v;
        v(i3, iU2);
        w(this.f20533c, iU);
        int i4 = i2 == -2 ? this.f20539i : this.f20542l[i2];
        y(i2, this.f20533c);
        y(this.f20533c, i4);
        this.f20533c++;
        this.f20534d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        int iU = auv.u(obj);
        int iD = d(obj, iU);
        if (iD == -1) {
            return null;
        }
        V v = this.f20532b[iD];
        j(iD, iU);
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20533c;
    }
}

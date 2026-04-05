package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ata<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f20498d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient int[] f20499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Object[] f20500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object[] f20501c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient Object f20502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f20503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient int f20504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Set<K> f20505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f20506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient Collection<V> f20507j;

    public ata() {
        m(3);
    }

    public static <K, V> ata<K, V> f() {
        return new ata<>();
    }

    public static /* synthetic */ void p(ata ataVar) {
        ataVar.f20504g--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int q() {
        return (1 << (this.f20503f & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(Object obj) {
        if (o()) {
            return -1;
        }
        int iU = auv.u(obj);
        int iQ = q();
        int iL = auv.l(this.f20502e, iU & iQ);
        if (iL == 0) {
            return -1;
        }
        int iH = auv.h(iU, iQ);
        do {
            int i2 = iL - 1;
            int i3 = this.f20499a[i2];
            if (auv.h(i3, iQ) == iH && auv.w(obj, this.f20500b[i2])) {
                return i2;
            }
            iL = i3 & iQ;
        } while (iL != 0);
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid size: ");
            sb.append(i2);
            throw new InvalidObjectException(sb.toString());
        }
        m(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final int s(int i2, int i3, int i4, int i5) {
        Object objM = auv.m(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            auv.n(objM, i4 & i6, i5 + 1);
        }
        Object obj = this.f20502e;
        int[] iArr = this.f20499a;
        for (int i7 = 0; i7 <= i2; i7++) {
            int iL = auv.l(obj, i7);
            while (iL != 0) {
                int i8 = iL - 1;
                int i9 = iArr[i8];
                int iH = auv.h(i9, i2) | i7;
                int i10 = iH & i6;
                int iL2 = auv.l(objM, i10);
                auv.n(objM, i10, iL);
                iArr[i8] = auv.i(iH, iL2, i6);
                iL = i9 & i2;
            }
        }
        this.f20502e = objM;
        u(i6);
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(Object obj) {
        if (o()) {
            return f20498d;
        }
        int iQ = q();
        int iK = auv.k(obj, null, iQ, this.f20502e, this.f20499a, this.f20500b, null);
        if (iK == -1) {
            return f20498d;
        }
        Object obj2 = this.f20501c[iK];
        n(iK, iQ);
        this.f20504g--;
        l();
        return obj2;
    }

    private final void u(int i2) {
        this.f20503f = auv.i(this.f20503f, 32 - Integer.numberOfLeadingZeros(i2), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itJ = j();
        while (itJ.hasNext()) {
            Map.Entry<K, V> next = itJ.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (o()) {
            return;
        }
        l();
        Map<K, V> mapK = k();
        if (mapK != null) {
            this.f20503f = awa.c(size(), 3);
            mapK.clear();
            this.f20502e = null;
        } else {
            Arrays.fill(this.f20500b, 0, this.f20504g, (Object) null);
            Arrays.fill(this.f20501c, 0, this.f20504g, (Object) null);
            Object obj = this.f20502e;
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(this.f20499a, 0, this.f20504g, 0);
        }
        this.f20504g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> mapK = k();
        return mapK != null ? mapK.containsKey(obj) : r(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> mapK = k();
        if (mapK != null) {
            return mapK.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.f20504g; i2++) {
            if (auv.w(obj, this.f20501c[i2])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return isEmpty() ? -1 : 0;
    }

    public final int e(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f20504g) {
            return i3;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f20506i;
        if (set != null) {
            return set;
        }
        asv asvVar = new asv(this);
        this.f20506i = asvVar;
        return asvVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> mapK = k();
        if (mapK != null) {
            return mapK.get(obj);
        }
        int iR = r(obj);
        if (iR == -1) {
            return null;
        }
        return (V) this.f20501c[iR];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Iterator<Map.Entry<K, V>> j() {
        Map<K, V> mapK = k();
        return mapK != null ? mapK.entrySet().iterator() : new ast(this);
    }

    public final Map<K, V> k() {
        Object obj = this.f20502e;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f20505h;
        if (set != null) {
            return set;
        }
        asx asxVar = new asx(this);
        this.f20505h = asxVar;
        return asxVar;
    }

    public final void l() {
        this.f20503f += 32;
    }

    public final void m(int i2) {
        ars.b(true, "Expected size must be >= 0");
        this.f20503f = awa.c(i2, 1);
    }

    public final void n(int i2, int i3) {
        int size = size() - 1;
        if (i2 >= size) {
            this.f20500b[i2] = null;
            this.f20501c[i2] = null;
            this.f20499a[i2] = 0;
            return;
        }
        Object[] objArr = this.f20500b;
        Object obj = objArr[size];
        objArr[i2] = obj;
        Object[] objArr2 = this.f20501c;
        objArr2[i2] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        int[] iArr = this.f20499a;
        iArr[i2] = iArr[size];
        iArr[size] = 0;
        int iU = auv.u(obj) & i3;
        int iL = auv.l(this.f20502e, iU);
        int i4 = size + 1;
        if (iL == i4) {
            auv.n(this.f20502e, iU, i2 + 1);
            return;
        }
        while (true) {
            int i5 = iL - 1;
            int[] iArr2 = this.f20499a;
            int i6 = iArr2[i5];
            int i7 = i6 & i3;
            if (i7 == i4) {
                iArr2[i5] = auv.i(i6, i2 + 1, i3);
                return;
            }
            iL = i7;
        }
    }

    public final boolean o() {
        return this.f20502e == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        int iMin;
        if (o()) {
            ars.e(o(), "Arrays already allocated");
            int i2 = this.f20503f;
            int iMax = Math.max(4, auv.v(i2 + 1));
            this.f20502e = auv.m(iMax);
            u(iMax - 1);
            this.f20499a = new int[i2];
            this.f20500b = new Object[i2];
            this.f20501c = new Object[i2];
        }
        Map<K, V> mapK = k();
        if (mapK != null) {
            return mapK.put(k2, v);
        }
        int[] iArr = this.f20499a;
        Object[] objArr = this.f20500b;
        Object[] objArr2 = this.f20501c;
        int i3 = this.f20504g;
        int i4 = i3 + 1;
        int iU = auv.u(k2);
        int iQ = q();
        int i5 = iU & iQ;
        int iL = auv.l(this.f20502e, i5);
        if (iL != 0) {
            int iH = auv.h(iU, iQ);
            int i6 = 0;
            while (true) {
                int i7 = iL - 1;
                int i8 = iArr[i7];
                if (auv.h(i8, iQ) == iH && auv.w(k2, objArr[i7])) {
                    V v2 = (V) objArr2[i7];
                    objArr2[i7] = v;
                    return v2;
                }
                int i9 = i8 & iQ;
                i6++;
                if (i9 != 0) {
                    iL = i9;
                } else {
                    if (i6 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q() + 1, 1.0f);
                        int iD = d();
                        while (iD >= 0) {
                            linkedHashMap.put(this.f20500b[iD], this.f20501c[iD]);
                            iD = e(iD);
                        }
                        this.f20502e = linkedHashMap;
                        this.f20499a = null;
                        this.f20500b = null;
                        this.f20501c = null;
                        l();
                        return (V) linkedHashMap.put(k2, v);
                    }
                    if (i4 <= iQ) {
                        iArr[i7] = auv.i(i8, i4, iQ);
                    }
                }
            }
        } else if (i4 > iQ) {
            iQ = s(iQ, auv.j(iQ), iU, i3);
        } else {
            auv.n(this.f20502e, i5, i4);
        }
        int length = this.f20499a.length;
        if (i4 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f20499a = Arrays.copyOf(this.f20499a, iMin);
            this.f20500b = Arrays.copyOf(this.f20500b, iMin);
            this.f20501c = Arrays.copyOf(this.f20501c, iMin);
        }
        this.f20499a[i3] = auv.i(iU, 0, iQ);
        this.f20500b[i3] = k2;
        this.f20501c[i3] = v;
        this.f20504g = i4;
        l();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> mapK = k();
        if (mapK != null) {
            return mapK.remove(obj);
        }
        V v = (V) t(obj);
        if (v == f20498d) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapK = k();
        return mapK != null ? mapK.size() : this.f20504g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f20507j;
        if (collection != null) {
            return collection;
        }
        asz aszVar = new asz(this);
        this.f20507j = aszVar;
        return aszVar;
    }
}

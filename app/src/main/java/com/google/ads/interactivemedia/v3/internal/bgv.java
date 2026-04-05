package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bgv<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Comparator<Comparable> f21102f = new bgo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<? super K> f21103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bgu<K, V> f21104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bgu<K, V> f21107e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bgq f21108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private bgs f21109h;

    public bgv() {
        Comparator<Comparable> comparator = f21102f;
        this.f21105c = 0;
        this.f21106d = 0;
        this.f21107e = new bgu<>();
        this.f21103a = comparator;
    }

    private final void f(bgu<K, V> bguVar, boolean z) {
        while (bguVar != null) {
            bgu<K, V> bguVar2 = bguVar.f21095b;
            bgu<K, V> bguVar3 = bguVar.f21096c;
            int i2 = bguVar2 != null ? bguVar2.f21101h : 0;
            int i3 = bguVar3 != null ? bguVar3.f21101h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                bgu<K, V> bguVar4 = bguVar3.f21095b;
                bgu<K, V> bguVar5 = bguVar3.f21096c;
                int i5 = (bguVar4 != null ? bguVar4.f21101h : 0) - (bguVar5 != null ? bguVar5.f21101h : 0);
                if (i5 != -1 && (i5 != 0 || z)) {
                    i(bguVar3);
                }
                h(bguVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                bgu<K, V> bguVar6 = bguVar2.f21095b;
                bgu<K, V> bguVar7 = bguVar2.f21096c;
                int i6 = (bguVar6 != null ? bguVar6.f21101h : 0) - (bguVar7 != null ? bguVar7.f21101h : 0);
                if (i6 != 1 && (i6 != 0 || z)) {
                    h(bguVar2);
                }
                i(bguVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                bguVar.f21101h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                bguVar.f21101h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            bguVar = bguVar.f21094a;
        }
    }

    private final void g(bgu<K, V> bguVar, bgu<K, V> bguVar2) {
        bgu<K, V> bguVar3 = bguVar.f21094a;
        bguVar.f21094a = null;
        if (bguVar2 != null) {
            bguVar2.f21094a = bguVar3;
        }
        if (bguVar3 == null) {
            this.f21104b = bguVar2;
        } else if (bguVar3.f21095b == bguVar) {
            bguVar3.f21095b = bguVar2;
        } else {
            bguVar3.f21096c = bguVar2;
        }
    }

    private final void h(bgu<K, V> bguVar) {
        bgu<K, V> bguVar2 = bguVar.f21095b;
        bgu<K, V> bguVar3 = bguVar.f21096c;
        bgu<K, V> bguVar4 = bguVar3.f21095b;
        bgu<K, V> bguVar5 = bguVar3.f21096c;
        bguVar.f21096c = bguVar4;
        if (bguVar4 != null) {
            bguVar4.f21094a = bguVar;
        }
        g(bguVar, bguVar3);
        bguVar3.f21095b = bguVar;
        bguVar.f21094a = bguVar3;
        int iMax = Math.max(bguVar2 != null ? bguVar2.f21101h : 0, bguVar4 != null ? bguVar4.f21101h : 0) + 1;
        bguVar.f21101h = iMax;
        bguVar3.f21101h = Math.max(iMax, bguVar5 != null ? bguVar5.f21101h : 0) + 1;
    }

    private final void i(bgu<K, V> bguVar) {
        bgu<K, V> bguVar2 = bguVar.f21095b;
        bgu<K, V> bguVar3 = bguVar.f21096c;
        bgu<K, V> bguVar4 = bguVar2.f21095b;
        bgu<K, V> bguVar5 = bguVar2.f21096c;
        bguVar.f21095b = bguVar5;
        if (bguVar5 != null) {
            bguVar5.f21094a = bguVar;
        }
        g(bguVar, bguVar2);
        bguVar2.f21096c = bguVar;
        bguVar.f21094a = bguVar2;
        int iMax = Math.max(bguVar3 != null ? bguVar3.f21101h : 0, bguVar5 != null ? bguVar5.f21101h : 0) + 1;
        bguVar.f21101h = iMax;
        bguVar2.f21101h = Math.max(iMax, bguVar4 != null ? bguVar4.f21101h : 0) + 1;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final bgu<K, V> a(K k2, boolean z) {
        int iCompareTo;
        bgu<K, V> bguVar;
        Comparator<? super K> comparator = this.f21103a;
        bgu<K, V> bguVar2 = this.f21104b;
        if (bguVar2 != null) {
            Comparable comparable = comparator == f21102f ? (Comparable) k2 : null;
            while (true) {
                K k3 = bguVar2.f21099f;
                iCompareTo = comparable != null ? comparable.compareTo(k3) : comparator.compare(k2, k3);
                if (iCompareTo == 0) {
                    return bguVar2;
                }
                bgu<K, V> bguVar3 = iCompareTo < 0 ? bguVar2.f21095b : bguVar2.f21096c;
                if (bguVar3 == null) {
                    break;
                }
                bguVar2 = bguVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        bgu<K, V> bguVar4 = this.f21107e;
        if (bguVar2 != null) {
            bguVar = new bgu<>(bguVar2, k2, bguVar4, bguVar4.f21098e);
            if (iCompareTo < 0) {
                bguVar2.f21095b = bguVar;
            } else {
                bguVar2.f21096c = bguVar;
            }
            f(bguVar2, true);
        } else {
            if (comparator == f21102f && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName().concat(" is not Comparable"));
            }
            bguVar = new bgu<>(null, k2, bguVar4, bguVar4.f21098e);
            this.f21104b = bguVar;
        }
        this.f21105c++;
        this.f21106d++;
        return bguVar;
    }

    public final bgu<K, V> b(Map.Entry<?, ?> entry) {
        bgu<K, V> bguVarC = c(entry.getKey());
        if (bguVarC == null) {
            return null;
        }
        V v = bguVarC.f21100g;
        Object value = entry.getValue();
        if (v == value || (v != null && v.equals(value))) {
            return bguVarC;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bgu<K, V> c(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f21104b = null;
        this.f21105c = 0;
        this.f21106d++;
        bgu<K, V> bguVar = this.f21107e;
        bguVar.f21098e = bguVar;
        bguVar.f21097d = bguVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    public final bgu<K, V> d(Object obj) {
        bgu<K, V> bguVarC = c(obj);
        if (bguVarC != null) {
            e(bguVarC, true);
        }
        return bguVarC;
    }

    public final void e(bgu<K, V> bguVar, boolean z) {
        bgu<K, V> bguVar2;
        bgu<K, V> bguVar3;
        int i2;
        if (z) {
            bgu<K, V> bguVar4 = bguVar.f21098e;
            bguVar4.f21097d = bguVar.f21097d;
            bguVar.f21097d.f21098e = bguVar4;
        }
        bgu<K, V> bguVar5 = bguVar.f21095b;
        bgu<K, V> bguVar6 = bguVar.f21096c;
        bgu<K, V> bguVar7 = bguVar.f21094a;
        int i3 = 0;
        if (bguVar5 == null || bguVar6 == null) {
            if (bguVar5 != null) {
                g(bguVar, bguVar5);
                bguVar.f21095b = null;
            } else if (bguVar6 != null) {
                g(bguVar, bguVar6);
                bguVar.f21096c = null;
            } else {
                g(bguVar, null);
            }
            f(bguVar7, false);
            this.f21105c--;
            this.f21106d++;
            return;
        }
        if (bguVar5.f21101h > bguVar6.f21101h) {
            do {
                bguVar3 = bguVar5;
                bguVar5 = bguVar5.f21096c;
            } while (bguVar5 != null);
        } else {
            do {
                bguVar2 = bguVar6;
                bguVar6 = bguVar6.f21095b;
            } while (bguVar6 != null);
            bguVar3 = bguVar2;
        }
        e(bguVar3, false);
        bgu<K, V> bguVar8 = bguVar.f21095b;
        if (bguVar8 != null) {
            i2 = bguVar8.f21101h;
            bguVar3.f21095b = bguVar8;
            bguVar8.f21094a = bguVar3;
            bguVar.f21095b = null;
        } else {
            i2 = 0;
        }
        bgu<K, V> bguVar9 = bguVar.f21096c;
        if (bguVar9 != null) {
            i3 = bguVar9.f21101h;
            bguVar3.f21096c = bguVar9;
            bguVar9.f21094a = bguVar3;
            bguVar.f21096c = null;
        }
        bguVar3.f21101h = Math.max(i2, i3) + 1;
        g(bguVar, bguVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        bgq bgqVar = this.f21108g;
        if (bgqVar != null) {
            return bgqVar;
        }
        bgq bgqVar2 = new bgq(this);
        this.f21108g = bgqVar2;
        return bgqVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        bgu<K, V> bguVarC = c(obj);
        if (bguVarC != null) {
            return bguVarC.f21100g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        bgs bgsVar = this.f21109h;
        if (bgsVar != null) {
            return bgsVar;
        }
        bgs bgsVar2 = new bgs(this);
        this.f21109h = bgsVar2;
        return bgsVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        bgu<K, V> bguVarA = a(k2, true);
        V v2 = bguVarA.f21100g;
        bguVarA.f21100g = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        bgu<K, V> bguVarD = d(obj);
        if (bguVarD != null) {
            return bguVarD.f21100g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f21105c;
    }
}

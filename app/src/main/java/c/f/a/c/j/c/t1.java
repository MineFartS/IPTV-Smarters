package c.f.a.c.j.c;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class t1<K, V> extends s1<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient o1<K, V> f13080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f13081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f13082f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f13083g = 0;

    public t1(o1<K, V> o1Var, Object[] objArr, int i2, int i3) {
        this.f13080d = o1Var;
        this.f13081e = objArr;
    }

    @Override // c.f.a.c.j.c.j1
    public final int a(Object[] objArr, int i2) {
        return s().a(objArr, i2);
    }

    @Override // c.f.a.c.j.c.j1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f13080d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // c.f.a.c.j.c.j1
    /* JADX INFO: renamed from: d */
    public final a2<Map.Entry<K, V>> iterator() {
        return (a2) s().iterator();
    }

    @Override // c.f.a.c.j.c.s1, c.f.a.c.j.c.j1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13083g;
    }

    @Override // c.f.a.c.j.c.s1
    public final k1<Map.Entry<K, V>> t() {
        return new w1(this);
    }
}

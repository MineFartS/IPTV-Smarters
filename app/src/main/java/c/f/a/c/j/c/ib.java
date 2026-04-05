package c.f.a.c.j.c;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class ib extends g9<String> implements hb, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ib f12881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hb f12882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Object> f12883e;

    static {
        ib ibVar = new ib();
        f12881c = ibVar;
        ibVar.l();
        f12882d = ibVar;
    }

    public ib() {
        this(10);
    }

    public ib(int i2) {
        this((ArrayList<Object>) new ArrayList(i2));
    }

    public ib(ArrayList<Object> arrayList) {
        this.f12883e = arrayList;
    }

    public static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof m9 ? ((m9) obj).B() : sa.g((byte[]) obj);
    }

    @Override // c.f.a.c.j.c.hb
    public final hb A() {
        return z() ? new md(this) : this;
    }

    @Override // c.f.a.c.j.c.xa
    public final /* synthetic */ xa E(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.f12883e);
        return new ib((ArrayList<Object>) arrayList);
    }

    @Override // c.f.a.c.j.c.hb
    public final Object G(int i2) {
        return this.f12883e.get(i2);
    }

    @Override // c.f.a.c.j.c.hb
    public final List<?> H() {
        return Collections.unmodifiableList(this.f12883e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        d();
        this.f12883e.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        d();
        if (collection instanceof hb) {
            collection = ((hb) collection).H();
        }
        boolean zAddAll = this.f12883e.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f12883e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        Object obj = this.f12883e.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof m9) {
            m9 m9Var = (m9) obj;
            String strB = m9Var.B();
            if (m9Var.C()) {
                this.f12883e.set(i2, strB);
            }
            return strB;
        }
        byte[] bArr = (byte[]) obj;
        String strG = sa.g(bArr);
        if (sa.f(bArr)) {
            this.f12883e.set(i2, strG);
        }
        return strG;
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        d();
        Object objRemove = this.f12883e.remove(i2);
        ((AbstractList) this).modCount++;
        return e(objRemove);
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        d();
        return e(this.f12883e.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12883e.size();
    }

    @Override // c.f.a.c.j.c.g9, c.f.a.c.j.c.xa
    public final /* bridge */ /* synthetic */ boolean z() {
        return super.z();
    }
}

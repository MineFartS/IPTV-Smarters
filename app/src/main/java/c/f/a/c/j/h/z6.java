package c.f.a.c.j.h;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class z6 extends u4<String> implements RandomAccess, a7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z6 f13684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a7 f13685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Object> f13686e;

    static {
        z6 z6Var = new z6(10);
        f13684c = z6Var;
        z6Var.k();
        f13685d = z6Var;
    }

    public z6() {
        this(10);
    }

    public z6(int i2) {
        this.f13686e = new ArrayList(i2);
    }

    public z6(ArrayList<Object> arrayList) {
        this.f13686e = arrayList;
    }

    public static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof l5 ? ((l5) obj).x(u6.f13546a) : u6.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        d();
        this.f13686e.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        d();
        if (collection instanceof a7) {
            collection = ((a7) collection).j();
        }
        boolean zAddAll = this.f13686e.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f13686e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String get(int i2) {
        Object obj = this.f13686e.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof l5) {
            l5 l5Var = (l5) obj;
            String strX = l5Var.x(u6.f13546a);
            if (l5Var.i()) {
                this.f13686e.set(i2, strX);
            }
            return strX;
        }
        byte[] bArr = (byte[]) obj;
        String strD = u6.d(bArr);
        if (u6.c(bArr)) {
            this.f13686e.set(i2, strD);
        }
        return strD;
    }

    @Override // c.f.a.c.j.h.a7
    public final List<?> j() {
        return Collections.unmodifiableList(this.f13686e);
    }

    @Override // c.f.a.c.j.h.t6
    public final /* bridge */ /* synthetic */ t6 n(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.f13686e);
        return new z6((ArrayList<Object>) arrayList);
    }

    @Override // c.f.a.c.j.h.a7
    public final a7 o() {
        return zza() ? new w8(this) : this;
    }

    @Override // c.f.a.c.j.h.a7
    public final Object p(int i2) {
        return this.f13686e.get(i2);
    }

    @Override // c.f.a.c.j.h.a7
    public final void r(l5 l5Var) {
        d();
        this.f13686e.add(l5Var);
        ((AbstractList) this).modCount++;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        Object objRemove = this.f13686e.remove(i2);
        ((AbstractList) this).modCount++;
        return f(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        d();
        return f(this.f13686e.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13686e.size();
    }
}

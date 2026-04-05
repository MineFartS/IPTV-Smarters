package c.f.a.c.j.h;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class w8 extends AbstractList<String> implements RandomAccess, a7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a7 f13610b;

    public w8(a7 a7Var) {
        this.f13610b = a7Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return ((z6) this.f13610b).get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new v8(this);
    }

    @Override // c.f.a.c.j.h.a7
    public final List<?> j() {
        return this.f13610b.j();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i2) {
        return new u8(this, i2);
    }

    @Override // c.f.a.c.j.h.a7
    public final a7 o() {
        return this;
    }

    @Override // c.f.a.c.j.h.a7
    public final Object p(int i2) {
        return this.f13610b.p(i2);
    }

    @Override // c.f.a.c.j.h.a7
    public final void r(l5 l5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13610b.size();
    }
}

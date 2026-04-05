package c.f.a.c.j.c;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class md extends AbstractList<String> implements hb, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hb f12949b;

    public md(hb hbVar) {
        this.f12949b = hbVar;
    }

    @Override // c.f.a.c.j.c.hb
    public final hb A() {
        return this;
    }

    @Override // c.f.a.c.j.c.hb
    public final Object G(int i2) {
        return this.f12949b.G(i2);
    }

    @Override // c.f.a.c.j.c.hb
    public final List<?> H() {
        return this.f12949b.H();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return (String) this.f12949b.get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new pd(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i2) {
        return new ld(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12949b.size();
    }
}

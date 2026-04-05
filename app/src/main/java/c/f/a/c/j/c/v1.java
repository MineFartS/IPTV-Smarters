package c.f.a.c.j.c;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class v1<K> extends s1<K> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient o1<K, ?> f13114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient k1<K> f13115e;

    public v1(o1<K, ?> o1Var, k1<K> k1Var) {
        this.f13114d = o1Var;
        this.f13115e = k1Var;
    }

    @Override // c.f.a.c.j.c.j1
    public final int a(Object[] objArr, int i2) {
        return s().a(objArr, i2);
    }

    @Override // c.f.a.c.j.c.j1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        return this.f13114d.get(obj) != null;
    }

    @Override // c.f.a.c.j.c.j1
    /* JADX INFO: renamed from: d */
    public final a2<K> iterator() {
        return (a2) s().iterator();
    }

    @Override // c.f.a.c.j.c.s1, c.f.a.c.j.c.j1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // c.f.a.c.j.c.s1, c.f.a.c.j.c.j1
    public final k1<K> s() {
        return this.f13115e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13114d.size();
    }
}

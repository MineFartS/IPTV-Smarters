package c.f.a.c.j.c;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class s1<E> extends j1<E> implements Set<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NullableDecl
    public transient k1<E> f13068c;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        return x1.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return x1.b(this);
    }

    @Override // c.f.a.c.j.c.j1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // c.f.a.c.j.c.j1
    public k1<E> s() {
        k1<E> k1Var = this.f13068c;
        if (k1Var != null) {
            return k1Var;
        }
        k1<E> k1VarT = t();
        this.f13068c = k1VarT;
        return k1VarT;
    }

    public k1<E> t() {
        return k1.t(toArray());
    }
}

package c.f.b.b;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends k0<Comparable> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f15862b = new i0();

    @Override // c.f.b.b.k0
    public <S extends Comparable> k0<S> f() {
        return p0.f15947b;
    }

    @Override // c.f.b.b.k0, java.util.Comparator
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        c.f.b.a.k.j(comparable);
        c.f.b.a.k.j(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}

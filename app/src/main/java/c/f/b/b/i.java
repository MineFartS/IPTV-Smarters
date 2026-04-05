package c.f.b.b;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class i<F, T> extends k0<F> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.b.a.f<F, ? extends T> f15860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0<T> f15861c;

    public i(c.f.b.a.f<F, ? extends T> fVar, k0<T> k0Var) {
        this.f15860b = (c.f.b.a.f) c.f.b.a.k.j(fVar);
        this.f15861c = (k0) c.f.b.a.k.j(k0Var);
    }

    @Override // c.f.b.b.k0, java.util.Comparator
    public int compare(F f2, F f3) {
        return this.f15861c.compare(this.f15860b.apply(f2), this.f15860b.apply(f3));
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f15860b.equals(iVar.f15860b) && this.f15861c.equals(iVar.f15861c);
    }

    public int hashCode() {
        return c.f.b.a.h.b(this.f15860b, this.f15861c);
    }

    public String toString() {
        return this.f15861c + ".onResultOf(" + this.f15860b + ")";
    }
}

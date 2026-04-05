package c.f.b.b;

import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class m<T> extends k0<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator<T> f15887b;

    public m(Comparator<T> comparator) {
        this.f15887b = (Comparator) c.f.b.a.k.j(comparator);
    }

    @Override // c.f.b.b.k0, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f15887b.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.f15887b.equals(((m) obj).f15887b);
        }
        return false;
    }

    public int hashCode() {
        return this.f15887b.hashCode();
    }

    public String toString() {
        return this.f15887b.toString();
    }
}

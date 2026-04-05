package c.f.b.b;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class q0<T> extends k0<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0<? super T> f15948b;

    public q0(k0<? super T> k0Var) {
        this.f15948b = (k0) c.f.b.a.k.j(k0Var);
    }

    @Override // c.f.b.b.k0, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f15948b.compare(t2, t);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0) {
            return this.f15948b.equals(((q0) obj).f15948b);
        }
        return false;
    }

    @Override // c.f.b.b.k0
    public <S extends T> k0<S> f() {
        return this.f15948b;
    }

    public int hashCode() {
        return -this.f15948b.hashCode();
    }

    public String toString() {
        return this.f15948b + ".reverse()";
    }
}

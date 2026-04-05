package c.f.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0<T> implements Comparator<T> {
    public static <T> k0<T> a(Comparator<T> comparator) {
        return comparator instanceof k0 ? (k0) comparator : new m(comparator);
    }

    public static <C extends Comparable> k0<C> c() {
        return i0.f15862b;
    }

    public <E extends T> t<E> b(Iterable<E> iterable) {
        return t.P(this, iterable);
    }

    @Override // java.util.Comparator
    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);

    public <T2 extends T> k0<Map.Entry<T2, ?>> d() {
        return (k0<Map.Entry<T2, ?>>) e(d0.d());
    }

    public <F> k0<F> e(c.f.b.a.f<F, ? extends T> fVar) {
        return new i(fVar, this);
    }

    public <S extends T> k0<S> f() {
        return new q0(this);
    }
}

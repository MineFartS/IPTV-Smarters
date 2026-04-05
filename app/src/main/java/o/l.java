package o;

import javax.annotation.Nullable;
import k.c0;
import k.d0;

/* JADX INFO: loaded from: classes.dex */
public final class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f31310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final T f31311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final d0 f31312c;

    public l(c0 c0Var, @Nullable T t, @Nullable d0 d0Var) {
        this.f31310a = c0Var;
        this.f31311b = t;
        this.f31312c = d0Var;
    }

    public static <T> l<T> c(d0 d0Var, c0 c0Var) {
        o.b(d0Var, "body == null");
        o.b(c0Var, "rawResponse == null");
        if (c0Var.q()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new l<>(c0Var, null, d0Var);
    }

    public static <T> l<T> f(@Nullable T t, c0 c0Var) {
        o.b(c0Var, "rawResponse == null");
        if (c0Var.q()) {
            return new l<>(c0Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    public T a() {
        return this.f31311b;
    }

    public int b() {
        return this.f31310a.l();
    }

    public boolean d() {
        return this.f31310a.q();
    }

    public c0 e() {
        return this.f31310a;
    }

    public String toString() {
        return this.f31310a.toString();
    }
}

package c.f.a.c.j.h;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class b4<T> extends d4<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b4<Object> f13213b = new b4<>();

    @Override // c.f.a.c.j.h.d4
    public final boolean a() {
        return false;
    }

    @Override // c.f.a.c.j.h.d4
    public final T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}

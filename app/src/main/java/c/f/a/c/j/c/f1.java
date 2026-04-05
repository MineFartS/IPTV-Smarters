package c.f.a.c.j.c;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class f1<T> extends d1<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f12810b;

    public f1(T t) {
        this.f12810b = t;
    }

    @Override // c.f.a.c.j.c.d1
    public final T b() {
        return this.f12810b;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof f1) {
            return this.f12810b.equals(((f1) obj).f12810b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12810b.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12810b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}

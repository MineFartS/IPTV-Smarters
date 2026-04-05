package c.f.a.c.j.h;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class e4<T> extends d4<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f13300b;

    public e4(T t) {
        this.f13300b = t;
    }

    @Override // c.f.a.c.j.h.d4
    public final boolean a() {
        return true;
    }

    @Override // c.f.a.c.j.h.d4
    public final T b() {
        return this.f13300b;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof e4) {
            return this.f13300b.equals(((e4) obj).f13300b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13300b.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13300b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}

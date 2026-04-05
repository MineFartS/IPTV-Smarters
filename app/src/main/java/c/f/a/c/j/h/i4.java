package c.f.a.c.j.h;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class i4<T> implements Serializable, f4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NullableDecl
    public final T f13365b;

    public i4(@NullableDecl T t) {
        this.f13365b = t;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof i4)) {
            return false;
        }
        T t = this.f13365b;
        T t2 = ((i4) obj).f13365b;
        return t == t2 || t.equals(t2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13365b});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13365b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // c.f.a.c.j.h.f4
    public final T zza() {
        return this.f13365b;
    }
}

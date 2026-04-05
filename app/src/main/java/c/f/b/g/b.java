package c.f.b.g;

import c.f.b.a.k;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T> extends a<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f16011b;

    public b() {
        Type typeA = a();
        this.f16011b = typeA;
        k.q(!(typeA instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeA);
    }

    public final Type b() {
        return this.f16011b;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof b) {
            return this.f16011b.equals(((b) obj).f16011b);
        }
        return false;
    }

    public int hashCode() {
        return this.f16011b.hashCode();
    }

    public String toString() {
        return c.b(this.f16011b);
    }
}

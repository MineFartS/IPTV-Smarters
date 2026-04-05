package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13631b;

    public x5(Object obj, int i2) {
        this.f13630a = obj;
        this.f13631b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj;
        return this.f13630a == x5Var.f13630a && this.f13631b == x5Var.f13631b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f13630a) * 65535) + this.f13631b;
    }
}

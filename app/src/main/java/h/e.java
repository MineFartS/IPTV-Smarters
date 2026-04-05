package h;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e<A, B> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f30356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f30357c;

    public e(A a2, B b2) {
        this.f30356b = a2;
        this.f30357c = b2;
    }

    public final A a() {
        return this.f30356b;
    }

    public final B b() {
        return this.f30357c;
    }

    public final A c() {
        return this.f30356b;
    }

    public final B d() {
        return this.f30357c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.l.c.g.a(this.f30356b, eVar.f30356b) && h.l.c.g.a(this.f30357c, eVar.f30357c);
    }

    public int hashCode() {
        A a2 = this.f30356b;
        int iHashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.f30357c;
        return iHashCode + (b2 != null ? b2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return '(' + this.f30356b + ", " + this.f30357c + ')';
    }
}

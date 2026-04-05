package c.f.c.n;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Object> f16130b;

    public d(String str, Map<Class<?>, Object> map) {
        this.f16129a = str;
        this.f16130b = map;
    }

    public static d b(String str) {
        return new d(str, Collections.emptyMap());
    }

    public String a() {
        return this.f16129a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f16129a.equals(dVar.f16129a) && this.f16130b.equals(dVar.f16130b);
    }

    public int hashCode() {
        return (this.f16129a.hashCode() * 31) + this.f16130b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f16129a + ", properties=" + this.f16130b.values() + "}";
    }
}

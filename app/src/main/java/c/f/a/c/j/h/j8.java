package c.f.a.c.j.h;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j8 implements Map.Entry, Comparable<j8> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparable f13382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m8 f13384d;

    public j8(m8 m8Var, Comparable comparable, Object obj) {
        this.f13384d = m8Var;
        this.f13382b = comparable;
        this.f13383c = obj;
    }

    public static final boolean g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(j8 j8Var) {
        return this.f13382b.compareTo(j8Var.f13382b);
    }

    public final Comparable d() {
        return this.f13382b;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return g(this.f13382b, entry.getKey()) && g(this.f13383c, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f13382b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13383c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f13382b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f13383c;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f13384d.n();
        Object obj2 = this.f13383c;
        this.f13383c = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13382b);
        String strValueOf2 = String.valueOf(this.f13383c);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}

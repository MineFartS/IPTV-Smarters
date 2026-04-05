package c.f.a.c.j.c;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes2.dex */
public final class zc<K, V> implements Comparable<zc>, Map.Entry<K, V> {

    /* JADX INFO: Incorrect field signature: TK; */
    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparable f13162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f13163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc f13164d;

    /* JADX WARN: Multi-variable type inference failed */
    public zc(uc ucVar, K k2, V v) {
        this.f13164d = ucVar;
        this.f13162b = k2;
        this.f13163c = v;
    }

    public zc(uc ucVar, Map.Entry<K, V> entry) {
        this(ucVar, (Comparable) entry.getKey(), entry.getValue());
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zc zcVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zcVar.getKey());
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
        return a(this.f13162b, entry.getKey()) && a(this.f13163c, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f13162b;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f13163c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f13162b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.f13163c;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f13164d.q();
        V v2 = this.f13163c;
        this.f13163c = v;
        return v2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13162b);
        String strValueOf2 = String.valueOf(this.f13163c);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bmr implements Map.Entry, Comparable<bmr> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bmu f21418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Comparable f21419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f21420c;

    public bmr(bmu bmuVar, Comparable comparable, Object obj) {
        this.f21418a = bmuVar;
        this.f21419b = comparable;
        this.f21420c = obj;
    }

    private static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f21419b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(bmr bmrVar) {
        return this.f21419b.compareTo(bmrVar.f21419b);
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
        return b(this.f21419b, entry.getKey()) && b(this.f21420c, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f21419b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21420c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f21419b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f21420c;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f21418a.o();
        Object obj2 = this.f21420c;
        this.f21420c = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f21419b);
        String strValueOf2 = String.valueOf(this.f21420c);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}

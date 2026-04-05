package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class bnz<L, R> implements Map.Entry<L, R>, Comparable<bnz<L, R>>, Serializable {
    private static final long serialVersionUID = 4954918890077093841L;

    public static <L, R> bnz<L, R> c(L l2, R r) {
        return new bny(l2, r);
    }

    public abstract L a();

    public abstract R b();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bnz bnzVar = (bnz) obj;
        return new bns().b(a(), bnzVar.a()).b(b(), bnzVar.b()).a();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (awa.d(a(), entry.getKey()) && awa.d(b(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final L getKey() {
        return a();
    }

    @Override // java.util.Map.Entry
    public final R getValue() {
        return b();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return (a() == null ? 0 : a().hashCode()) ^ (b() != null ? b().hashCode() : 0);
    }

    public final String toString() {
        return "(" + a() + ',' + b() + ')';
    }
}

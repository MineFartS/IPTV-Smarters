package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class avm extends ave<Comparable> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final avm f20622a = new avm();
    private static final long serialVersionUID = 0;

    private avm() {
    }

    private Object readResolve() {
        return f20622a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ave
    public final <S extends Comparable> ave<S> a() {
        return avd.f20598a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ave, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        ars.g(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}

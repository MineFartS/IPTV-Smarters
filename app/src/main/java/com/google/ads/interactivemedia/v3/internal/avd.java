package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class avd extends ave<Comparable> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final avd f20598a = new avd();
    private static final long serialVersionUID = 0;

    private avd() {
    }

    private Object readResolve() {
        return f20598a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ave
    public final <S extends Comparable> ave<S> a() {
        return avm.f20622a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ave, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        ars.g(comparable);
        ars.g(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}

package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class avn<T> extends ave<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ave<? super T> f20623a;

    public avn(ave<? super T> aveVar) {
        this.f20623a = aveVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ave
    public final <S extends T> ave<S> a() {
        return this.f20623a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ave, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.f20623a.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avn) {
            return this.f20623a.equals(((avn) obj).f20623a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f20623a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f20623a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 10);
        sb.append(strValueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}

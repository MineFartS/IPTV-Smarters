package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class atb<T> extends ave<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<T> f20508a;

    public atb(Comparator<T> comparator) {
        ars.g(comparator);
        this.f20508a = comparator;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ave, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.f20508a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof atb) {
            return this.f20508a.equals(((atb) obj).f20508a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20508a.hashCode();
    }

    public final String toString() {
        return this.f20508a.toString();
    }
}

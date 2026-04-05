package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class ala {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f20027a;

    public final int a(int i2) {
        ajr.g(i2, b());
        return this.f20027a.keyAt(i2);
    }

    public final int b() {
        return this.f20027a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ala) {
            return this.f20027a.equals(((ala) obj).f20027a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20027a.hashCode();
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bnx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21495b;

    public bnx(Object obj) {
        this.f21495b = System.identityHashCode(obj);
        this.f21494a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bnx)) {
            return false;
        }
        bnx bnxVar = (bnx) obj;
        return this.f21495b == bnxVar.f21495b && this.f21494a == bnxVar.f21494a;
    }

    public final int hashCode() {
        return this.f21495b;
    }
}

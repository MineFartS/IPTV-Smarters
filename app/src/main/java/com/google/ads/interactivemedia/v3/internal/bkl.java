package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21291b;

    public bkl(Object obj, int i2) {
        this.f21290a = obj;
        this.f21291b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bkl)) {
            return false;
        }
        bkl bklVar = (bkl) obj;
        return this.f21290a == bklVar.f21290a && this.f21291b == bklVar.f21291b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f21290a) * 65535) + this.f21291b;
    }
}

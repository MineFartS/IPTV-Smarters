package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19741b;

    public aht(long j2, long j3) {
        this.f19740a = j2;
        this.f19741b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aht)) {
            return false;
        }
        aht ahtVar = (aht) obj;
        return this.f19740a == ahtVar.f19740a && this.f19741b == ahtVar.f19741b;
    }

    public final int hashCode() {
        return (((int) this.f19740a) * 31) + ((int) this.f19741b);
    }
}

package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19482b;

    public aff(long j2, long j3) {
        this.f19481a = j2;
        this.f19482b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aff.class == obj.getClass()) {
            aff affVar = (aff) obj;
            if (this.f19481a == affVar.f19481a && this.f19482b == affVar.f19482b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f19481a) * 31) + ((int) this.f19482b);
    }
}

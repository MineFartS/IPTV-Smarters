package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class kl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f22183e;

    static {
        new kl(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    }

    public kl(long j2, long j3, long j4, float f2, float f3) {
        this.f22179a = j2;
        this.f22180b = j3;
        this.f22181c = j4;
        this.f22182d = f2;
        this.f22183e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl)) {
            return false;
        }
        kl klVar = (kl) obj;
        return this.f22179a == klVar.f22179a && this.f22180b == klVar.f22180b && this.f22181c == klVar.f22181c && this.f22182d == klVar.f22182d && this.f22183e == klVar.f22183e;
    }

    public final int hashCode() {
        long j2 = this.f22179a;
        long j3 = this.f22180b;
        long j4 = this.f22181c;
        int i2 = ((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31;
        float f2 = this.f22182d;
        int iFloatToIntBits = (i2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.f22183e;
        return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }
}

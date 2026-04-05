package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class anq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final anq f20261a = new anq(0, 0, 0, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f20265e;

    public anq(int i2, int i3, int i4, float f2) {
        this.f20262b = i2;
        this.f20263c = i3;
        this.f20264d = i4;
        this.f20265e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof anq) {
            anq anqVar = (anq) obj;
            if (this.f20262b == anqVar.f20262b && this.f20263c == anqVar.f20263c && this.f20264d == anqVar.f20264d && this.f20265e == anqVar.f20265e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f20262b + 217) * 31) + this.f20263c) * 31) + this.f20264d) * 31) + Float.floatToRawIntBits(this.f20265e);
    }
}

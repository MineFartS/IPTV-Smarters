package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f22938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22940d;

    public se(int i2, byte[] bArr, int i3, int i4) {
        this.f22937a = i2;
        this.f22938b = bArr;
        this.f22939c = i3;
        this.f22940d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && se.class == obj.getClass()) {
            se seVar = (se) obj;
            if (this.f22937a == seVar.f22937a && this.f22939c == seVar.f22939c && this.f22940d == seVar.f22940d && Arrays.equals(this.f22938b, seVar.f22938b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f22937a * 31) + Arrays.hashCode(this.f22938b)) * 31) + this.f22939c) * 31) + this.f22940d;
    }
}

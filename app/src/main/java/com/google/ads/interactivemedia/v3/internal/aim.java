package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class aim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ail[] f19839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19840b;

    public aim(ail... ailVarArr) {
        this.f19839a = ailVarArr;
        int length = ailVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aim.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f19839a, ((aim) obj).f19839a);
    }

    public final int hashCode() {
        int i2 = this.f19840b;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f19839a) + 527;
        this.f19840b = iHashCode;
        return iHashCode;
    }
}

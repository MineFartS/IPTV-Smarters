package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class acw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final acw f19217a = new acw(new acv[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final acv f19218c = new acv().c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19219b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final acv[] f19220d;

    private acw(acv[] acvVarArr) {
        this.f19220d = acvVarArr;
    }

    public final acv a(int i2) {
        return i2 < 0 ? f19218c : this.f19220d[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && acw.class == obj.getClass()) {
            acw acwVar = (acw) obj;
            if (amn.O(null, null) && Arrays.equals(this.f19220d, acwVar.f19220d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f19220d);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}

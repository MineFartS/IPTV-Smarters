package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class aey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19459d;

    public aey(String str, long j2, long j3) {
        this.f19458c = str == null ? BuildConfig.FLAVOR : str;
        this.f19456a = j2;
        this.f19457b = j3;
    }

    public final Uri a(String str) {
        return arj.l(str, this.f19458c);
    }

    public final aey b(aey aeyVar, String str) {
        String strC = c(str);
        if (aeyVar != null && strC.equals(aeyVar.c(str))) {
            long j2 = this.f19457b;
            if (j2 != -1) {
                long j3 = this.f19456a;
                if (j3 + j2 == aeyVar.f19456a) {
                    long j4 = aeyVar.f19457b;
                    return new aey(strC, j3, j4 != -1 ? j2 + j4 : -1L);
                }
            }
            long j5 = aeyVar.f19457b;
            if (j5 != -1) {
                long j6 = aeyVar.f19456a;
                if (j6 + j5 == this.f19456a) {
                    return new aey(strC, j6, j2 != -1 ? j5 + j2 : -1L);
                }
            }
        }
        return null;
    }

    public final String c(String str) {
        return arj.m(str, this.f19458c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aey.class == obj.getClass()) {
            aey aeyVar = (aey) obj;
            if (this.f19456a == aeyVar.f19456a && this.f19457b == aeyVar.f19457b && this.f19458c.equals(aeyVar.f19458c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f19459d;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((((((int) this.f19456a) + 527) * 31) + ((int) this.f19457b)) * 31) + this.f19458c.hashCode();
        this.f19459d = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str = this.f19458c;
        long j2 = this.f19456a;
        long j3 = this.f19457b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 81);
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(j2);
        sb.append(", length=");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }
}

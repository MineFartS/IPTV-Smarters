package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class re implements sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f22874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f22875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f22876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f22877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f22878f;

    public re(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f22874b = iArr;
        this.f22875c = jArr;
        this.f22876d = jArr2;
        this.f22877e = jArr3;
        int length = iArr.length;
        this.f22873a = length;
        if (length <= 0) {
            this.f22878f = 0L;
        } else {
            int i2 = length - 1;
            this.f22878f = jArr2[i2] + jArr3[i2];
        }
    }

    public final int a(long j2) {
        return amn.ak(this.f22877e, j2, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final long e() {
        return this.f22878f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final sa g(long j2) {
        int iA = a(j2);
        sd sdVar = new sd(this.f22877e[iA], this.f22875c[iA]);
        if (sdVar.f22935b >= j2 || iA == this.f22873a - 1) {
            return new sa(sdVar, sdVar);
        }
        int i2 = iA + 1;
        return new sa(sdVar, new sd(this.f22877e[i2], this.f22875c[i2]));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final boolean h() {
        return true;
    }

    public final String toString() {
        int i2 = this.f22873a;
        String string = Arrays.toString(this.f22874b);
        String string2 = Arrays.toString(this.f22875c);
        String string3 = Arrays.toString(this.f22877e);
        String string4 = Arrays.toString(this.f22876d);
        int length = String.valueOf(string).length();
        int length2 = String.valueOf(string2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(string3).length() + String.valueOf(string4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i2);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        sb.append(string2);
        sb.append(", timeUs=");
        sb.append(string3);
        sb.append(", durationsUs=");
        sb.append(string4);
        sb.append(")");
        return sb.toString();
    }
}

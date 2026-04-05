package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class alk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f20045b = new long[32];

    public final int a() {
        return this.f20044a;
    }

    public final long b(int i2) {
        if (i2 >= 0 && i2 < this.f20044a) {
            return this.f20045b[i2];
        }
        int i3 = this.f20044a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i2);
        sb.append(", size is ");
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void c(long j2) {
        int i2 = this.f20044a;
        long[] jArr = this.f20045b;
        if (i2 == jArr.length) {
            this.f20045b = Arrays.copyOf(jArr, i2 + i2);
        }
        long[] jArr2 = this.f20045b;
        int i3 = this.f20044a;
        this.f20044a = i3 + 1;
        jArr2[i3] = j2;
    }
}

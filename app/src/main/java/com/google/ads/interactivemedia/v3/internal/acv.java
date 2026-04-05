package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class acv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri[] f19212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f19213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f19214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19216g;

    public acv() {
        this(-1, new int[0], new Uri[0], new long[0]);
    }

    private acv(int i2, int[] iArr, Uri[] uriArr, long[] jArr) {
        ajr.d(iArr.length == uriArr.length);
        this.f19210a = 0L;
        this.f19211b = i2;
        this.f19213d = iArr;
        this.f19212c = uriArr;
        this.f19214e = jArr;
        this.f19215f = 0L;
        this.f19216g = false;
    }

    public final int a() {
        return b(-1);
    }

    public final int b(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.f19213d;
            if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public final acv c() {
        int[] iArr = this.f19213d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f19214e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new acv(0, iArrCopyOf, (Uri[]) Arrays.copyOf(this.f19212c, 0), jArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && acv.class == obj.getClass()) {
            acv acvVar = (acv) obj;
            if (this.f19211b == acvVar.f19211b && Arrays.equals(this.f19212c, acvVar.f19212c) && Arrays.equals(this.f19213d, acvVar.f19213d) && Arrays.equals(this.f19214e, acvVar.f19214e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f19211b * 961) + Arrays.hashCode(this.f19212c)) * 31) + Arrays.hashCode(this.f19213d)) * 31) + Arrays.hashCode(this.f19214e)) * 961;
    }
}

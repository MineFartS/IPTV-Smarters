package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final alx f23098a = new alx(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23099b;

    private final long b(rk rkVar) {
        int i2 = 0;
        rkVar.g(this.f23098a.K(), 0, 1);
        int i3 = this.f23098a.K()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while ((i3 & i4) == 0) {
            i4 >>= 1;
            i5++;
        }
        int i6 = i3 & (i4 ^ (-1));
        rkVar.g(this.f23098a.K(), 1, i5);
        while (i2 < i5) {
            i2++;
            i6 = (this.f23098a.K()[i2] & 255) + (i6 << 8);
        }
        this.f23099b += i5 + 1;
        return i6;
    }

    public final boolean a(rk rkVar) {
        long jC = rkVar.c();
        long j2 = 1024;
        if (jC != -1 && jC <= 1024) {
            j2 = jC;
        }
        int i2 = (int) j2;
        rkVar.g(this.f23098a.K(), 0, 4);
        long jS = this.f23098a.s();
        this.f23099b = 4;
        while (jS != 440786851) {
            int i3 = this.f23099b + 1;
            this.f23099b = i3;
            if (i3 == i2) {
                return false;
            }
            rkVar.g(this.f23098a.K(), 0, 1);
            jS = ((jS << 8) & (-256)) | ((long) (this.f23098a.K()[0] & 255));
        }
        long jB = b(rkVar);
        long j3 = this.f23099b;
        if (jB != Long.MIN_VALUE && (jC == -1 || j3 + jB < jC)) {
            while (true) {
                long j4 = this.f23099b;
                long j5 = j3 + jB;
                if (j4 < j5) {
                    if (b(rkVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jB2 = b(rkVar);
                    if (jB2 < 0) {
                        return false;
                    }
                    if (jB2 != 0) {
                        int i4 = (int) jB2;
                        rkVar.f(i4);
                        this.f23099b += i4;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }
}

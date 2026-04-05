package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class amk<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f20126a = new long[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V[] f20127b = (V[]) new Object[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20129d;

    private final V f() {
        ajr.f(this.f20129d > 0);
        V[] vArr = this.f20127b;
        int i2 = this.f20128c;
        V v = vArr[i2];
        vArr[i2] = null;
        this.f20128c = (i2 + 1) % vArr.length;
        this.f20129d--;
        return v;
    }

    public final synchronized int a() {
        return this.f20129d;
    }

    public final synchronized V b() {
        if (this.f20129d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized V c(long j2) {
        V vF;
        vF = null;
        while (this.f20129d > 0 && j2 - this.f20126a[this.f20128c] >= 0) {
            vF = f();
        }
        return vF;
    }

    public final synchronized void d(long j2, V v) {
        if (this.f20129d > 0) {
            if (j2 <= this.f20126a[((this.f20128c + r0) - 1) % this.f20127b.length]) {
                e();
            }
        }
        int length = this.f20127b.length;
        if (this.f20129d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            V[] vArr = (V[]) new Object[i2];
            int i3 = this.f20128c;
            int i4 = length - i3;
            System.arraycopy(this.f20126a, i3, jArr, 0, i4);
            System.arraycopy(this.f20127b, this.f20128c, vArr, 0, i4);
            int i5 = this.f20128c;
            if (i5 > 0) {
                System.arraycopy(this.f20126a, 0, jArr, i4, i5);
                System.arraycopy(this.f20127b, 0, vArr, i4, this.f20128c);
            }
            this.f20126a = jArr;
            this.f20127b = vArr;
            this.f20128c = 0;
        }
        int i6 = this.f20128c;
        int i7 = this.f20129d;
        V[] vArr2 = this.f20127b;
        int length2 = (i6 + i7) % vArr2.length;
        this.f20126a[length2] = j2;
        vArr2[length2] = v;
        this.f20129d = i7 + 1;
    }

    public final synchronized void e() {
        this.f20128c = 0;
        this.f20129d = 0;
        Arrays.fill(this.f20127b, (Object) null);
    }
}

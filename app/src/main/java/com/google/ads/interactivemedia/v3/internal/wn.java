package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f23596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23600e;

    public wn(int i2) {
        this.f23598c = i2;
        byte[] bArr = new byte[131];
        this.f23596a = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i2, int i3) {
        if (this.f23599d) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.f23596a;
            int length = bArr2.length;
            int i5 = this.f23597b + i4;
            if (length < i5) {
                this.f23596a = Arrays.copyOf(bArr2, i5 + i5);
            }
            System.arraycopy(bArr, i2, this.f23596a, this.f23597b, i4);
            this.f23597b += i4;
        }
    }

    public final void b() {
        this.f23599d = false;
        this.f23600e = false;
    }

    public final void c(int i2) {
        ajr.f(!this.f23599d);
        boolean z = i2 == this.f23598c;
        this.f23599d = z;
        if (z) {
            this.f23597b = 3;
            this.f23600e = false;
        }
    }

    public final boolean d(int i2) {
        if (!this.f23599d) {
            return false;
        }
        this.f23597b -= i2;
        this.f23599d = false;
        this.f23600e = true;
        return true;
    }

    public final boolean e() {
        return this.f23600e;
    }
}

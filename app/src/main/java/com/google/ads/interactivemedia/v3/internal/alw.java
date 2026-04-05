package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class alw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f20082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20085d;

    public alw() {
        this.f20082a = amn.f20140f;
    }

    public alw(byte[] bArr) {
        int length = bArr.length;
        this.f20082a = bArr;
        this.f20085d = length;
    }

    private final void n() {
        int i2;
        int i3 = this.f20083b;
        boolean z = true;
        if (i3 < 0 || (i3 >= (i2 = this.f20085d) && (i3 != i2 || this.f20084c != 0))) {
            z = false;
        }
        ajr.f(z);
    }

    public final int a() {
        return ((this.f20085d - this.f20083b) * 8) - this.f20084c;
    }

    public final int b() {
        return (this.f20083b * 8) + this.f20084c;
    }

    public final int c(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        this.f20084c += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f20084c;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.f20084c = i5;
            byte[] bArr = this.f20082a;
            int i6 = this.f20083b;
            this.f20083b = i6 + 1;
            i4 |= (bArr[i6] & 255) << i5;
        }
        byte[] bArr2 = this.f20082a;
        int i7 = this.f20083b;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.f20084c = 0;
            this.f20083b = i7 + 1;
        }
        n();
        return i8;
    }

    public final void d() {
        if (this.f20084c == 0) {
            return;
        }
        this.f20084c = 0;
        this.f20083b++;
        n();
    }

    public final void e(byte[] bArr) {
        f(bArr, bArr.length);
    }

    public final void f(byte[] bArr, int i2) {
        this.f20082a = bArr;
        this.f20083b = 0;
        this.f20084c = 0;
        this.f20085d = i2;
    }

    public final void g(int i2) {
        int i3 = i2 / 8;
        this.f20083b = i3;
        this.f20084c = i2 - (i3 * 8);
        n();
    }

    public final void h() {
        int i2 = this.f20084c + 1;
        this.f20084c = i2;
        if (i2 == 8) {
            this.f20084c = 0;
            this.f20083b++;
        }
        n();
    }

    public final void i(int i2) {
        int i3 = i2 / 8;
        int i4 = this.f20083b + i3;
        this.f20083b = i4;
        int i5 = this.f20084c + (i2 - (i3 * 8));
        this.f20084c = i5;
        if (i5 > 7) {
            this.f20083b = i4 + 1;
            this.f20084c = i5 - 8;
        }
        n();
    }

    public final void j(int i2) {
        ajr.f(this.f20084c == 0);
        this.f20083b += i2;
        n();
    }

    public final boolean k() {
        boolean z = (this.f20082a[this.f20083b] & (128 >> this.f20084c)) != 0;
        h();
        return z;
    }

    public final void l(int i2) {
        int i3 = i2 & 16383;
        int iMin = Math.min(8 - this.f20084c, 14);
        int i4 = this.f20084c;
        int i5 = (8 - i4) - iMin;
        byte[] bArr = this.f20082a;
        int i6 = this.f20083b;
        byte b2 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr[i6]);
        bArr[i6] = b2;
        int i7 = 14 - iMin;
        bArr[i6] = (byte) (b2 | ((i3 >>> i7) << i5));
        int i8 = i6 + 1;
        while (i7 > 8) {
            i7 -= 8;
            this.f20082a[i8] = (byte) (i3 >>> i7);
            i8++;
        }
        byte[] bArr2 = this.f20082a;
        byte b3 = (byte) (bArr2[i8] & ((1 << r1) - 1));
        bArr2[i8] = b3;
        bArr2[i8] = (byte) (((i3 & ((1 << i7) - 1)) << (8 - i7)) | b3);
        i(14);
        n();
    }

    public final void m(byte[] bArr, int i2) {
        int i3 = i2 >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.f20082a;
            int i5 = this.f20083b;
            int i6 = i5 + 1;
            this.f20083b = i6;
            byte b2 = bArr2[i5];
            int i7 = this.f20084c;
            byte b3 = (byte) (b2 << i7);
            bArr[i4] = b3;
            bArr[i4] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | b3);
        }
        int i8 = i2 & 7;
        if (i8 == 0) {
            return;
        }
        byte b4 = (byte) (bArr[i3] & (255 >> i8));
        bArr[i3] = b4;
        int i9 = this.f20084c;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.f20082a;
            int i10 = this.f20083b;
            this.f20083b = i10 + 1;
            b4 = (byte) (b4 | ((bArr3[i10] & 255) << i9));
            bArr[i3] = b4;
            i9 -= 8;
        }
        int i11 = i9 + i8;
        this.f20084c = i11;
        byte[] bArr4 = this.f20082a;
        int i12 = this.f20083b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b4);
        if (i11 == 8) {
            this.f20084c = 0;
            this.f20083b = i12 + 1;
        }
        n();
    }
}

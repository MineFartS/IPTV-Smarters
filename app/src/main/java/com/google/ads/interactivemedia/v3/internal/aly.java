package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aly {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f20089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20092d;

    public aly(byte[] bArr, int i2, int i3) {
        d(bArr, i2, i3);
    }

    private final int j() {
        int i2 = 0;
        while (!i()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? a(i2) : 0);
    }

    private final void k() {
        int i2;
        int i3 = this.f20091c;
        boolean z = true;
        if (i3 < 0 || (i3 >= (i2 = this.f20090b) && (i3 != i2 || this.f20092d != 0))) {
            z = false;
        }
        ajr.f(z);
    }

    private final boolean l(int i2) {
        if (i2 < 2 || i2 >= this.f20090b) {
            return false;
        }
        byte[] bArr = this.f20089a;
        return bArr[i2] == 3 && bArr[i2 + (-2)] == 0 && bArr[i2 + (-1)] == 0;
    }

    public final int a(int i2) {
        int i3;
        this.f20092d += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f20092d;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.f20092d = i5;
            byte[] bArr = this.f20089a;
            int i6 = this.f20091c;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != l(i6 + 1)) {
                i = 1;
            }
            this.f20091c = i6 + i;
        }
        byte[] bArr2 = this.f20089a;
        int i7 = this.f20091c;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.f20092d = 0;
            this.f20091c = i7 + (true != l(i7 + 1) ? 1 : 2);
        }
        k();
        return i8;
    }

    public final int b() {
        int iJ = j();
        return (iJ % 2 == 0 ? -1 : 1) * ((iJ + 1) / 2);
    }

    public final int c() {
        return j();
    }

    public final void d(byte[] bArr, int i2, int i3) {
        this.f20089a = bArr;
        this.f20091c = i2;
        this.f20090b = i3;
        this.f20092d = 0;
        k();
    }

    public final void e() {
        int i2 = this.f20092d + 1;
        this.f20092d = i2;
        if (i2 == 8) {
            this.f20092d = 0;
            int i3 = this.f20091c;
            this.f20091c = i3 + (true == l(i3 + 1) ? 2 : 1);
        }
        k();
    }

    public final void f(int i2) {
        int i3 = this.f20091c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.f20091c = i5;
        int i6 = this.f20092d + (i2 - (i4 * 8));
        this.f20092d = i6;
        if (i6 > 7) {
            this.f20091c = i5 + 1;
            this.f20092d = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.f20091c) {
                k();
                return;
            } else if (l(i3)) {
                this.f20091c++;
                i3 += 2;
            }
        }
    }

    public final boolean g(int i2) {
        int i3 = this.f20091c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.f20092d + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i5 || i5 >= this.f20090b) {
                break;
            }
            if (l(i3)) {
                i5++;
                i3 += 2;
            }
        }
        int i7 = this.f20090b;
        if (i5 >= i7) {
            return i5 == i7 && i6 == 0;
        }
        return true;
    }

    public final boolean h() {
        int i2 = this.f20091c;
        int i3 = this.f20092d;
        int i4 = 0;
        while (this.f20091c < this.f20090b && !i()) {
            i4++;
        }
        int i5 = this.f20091c;
        int i6 = this.f20090b;
        this.f20091c = i2;
        this.f20092d = i3;
        return i5 != i6 && g((i4 + i4) + 1);
    }

    public final boolean i() {
        boolean z = (this.f20089a[this.f20091c] & (128 >> this.f20092d)) != 0;
        e();
        return z;
    }
}

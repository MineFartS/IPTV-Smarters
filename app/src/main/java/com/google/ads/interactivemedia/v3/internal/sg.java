package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f22941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22944d;

    public sg(byte[] bArr) {
        this.f22941a = bArr;
        this.f22942b = bArr.length;
    }

    public final int a() {
        return (this.f22943c * 8) + this.f22944d;
    }

    public final int b(int i2) {
        int i3 = this.f22943c;
        int iMin = Math.min(i2, 8 - this.f22944d);
        int i4 = i3 + 1;
        int i5 = ((this.f22941a[i3] & 255) >> this.f22944d) & (255 >> (8 - iMin));
        while (iMin < i2) {
            i5 |= (this.f22941a[i4] & 255) << iMin;
            iMin += 8;
            i4++;
        }
        c(i2);
        return ((-1) >>> (32 - i2)) & i5;
    }

    public final void c(int i2) {
        int i3;
        int i4 = i2 / 8;
        int i5 = this.f22943c + i4;
        this.f22943c = i5;
        int i6 = this.f22944d + (i2 - (i4 * 8));
        this.f22944d = i6;
        if (i6 > 7) {
            i5++;
            this.f22943c = i5;
            i6 -= 8;
            this.f22944d = i6;
        }
        boolean z = false;
        if (i5 >= 0 && (i5 < (i3 = this.f22942b) || (i5 == i3 && i6 == 0))) {
            z = true;
        }
        ajr.f(z);
    }

    public final boolean d() {
        byte b2 = this.f22941a[this.f22943c];
        int i2 = this.f22944d;
        c(1);
        return 1 == (((b2 & 255) >> i2) & 1);
    }
}

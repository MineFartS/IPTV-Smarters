package com.google.ads.interactivemedia.v3.internal;

import java.nio.charset.Charset;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class alx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f20086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20088c;

    public alx() {
        this.f20086a = amn.f20140f;
    }

    public alx(int i2) {
        this.f20086a = new byte[i2];
        this.f20088c = i2;
    }

    public alx(byte[] bArr) {
        this.f20086a = bArr;
        this.f20088c = bArr.length;
    }

    public alx(byte[] bArr, int i2) {
        this.f20086a = bArr;
        this.f20088c = i2;
    }

    public final short A() {
        byte[] bArr = this.f20086a;
        int i2 = this.f20087b;
        int i3 = i2 + 1;
        this.f20087b = i3;
        byte b2 = bArr[i2];
        this.f20087b = i3 + 1;
        return (short) ((bArr[i3] & 255) | ((b2 & 255) << 8));
    }

    public final void B(int i2) {
        if (i2 > b()) {
            this.f20086a = Arrays.copyOf(this.f20086a, i2);
        }
    }

    public final void C(alw alwVar, int i2) {
        D(alwVar.f20082a, 0, i2);
        alwVar.g(0);
    }

    public final void D(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f20086a, this.f20087b, bArr, i2, i3);
        this.f20087b += i3;
    }

    public final void E(int i2) {
        G(b() < i2 ? new byte[i2] : this.f20086a, i2);
    }

    public final void F(byte[] bArr) {
        G(bArr, bArr.length);
    }

    public final void G(byte[] bArr, int i2) {
        this.f20086a = bArr;
        this.f20088c = i2;
        this.f20087b = 0;
    }

    public final void H(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.f20086a.length) {
            z = true;
        }
        ajr.d(z);
        this.f20088c = i2;
    }

    public final void I(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.f20088c) {
            z = true;
        }
        ajr.d(z);
        this.f20087b = i2;
    }

    public final void J(int i2) {
        I(this.f20087b + i2);
    }

    public final byte[] K() {
        return this.f20086a;
    }

    public final int a() {
        return this.f20088c - this.f20087b;
    }

    public final int b() {
        return this.f20086a.length;
    }

    public final int c() {
        return this.f20087b;
    }

    public final int d() {
        return this.f20088c;
    }

    public final int e() {
        byte[] bArr = this.f20086a;
        int i2 = this.f20087b;
        int i3 = i2 + 1;
        this.f20087b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20087b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f20087b = i5;
        byte b4 = bArr[i4];
        this.f20087b = i5 + 1;
        return (bArr[i5] & 255) | ((b2 & 255) << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8);
    }

    public final int f() {
        byte[] bArr = this.f20086a;
        int i2 = this.f20087b;
        int i3 = i2 + 1;
        this.f20087b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20087b = i4;
        byte b3 = bArr[i3];
        this.f20087b = i4 + 1;
        return (bArr[i4] & 255) | (((b2 & 255) << 24) >> 8) | ((b3 & 255) << 8);
    }

    public final int g() {
        byte[] bArr = this.f20086a;
        int i2 = this.f20087b;
        int i3 = i2 + 1;
        this.f20087b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20087b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f20087b = i5;
        byte b4 = bArr[i4];
        this.f20087b = i5 + 1;
        return ((bArr[i5] & 255) << 24) | (b2 & 255) | ((b3 & 255) << 8) | ((b4 & 255) << 16);
    }

    public final int h() {
        int iG = g();
        if (iG >= 0) {
            return iG;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iG);
        throw new IllegalStateException(sb.toString());
    }

    public final int i() {
        byte[] bArr = this.f20086a;
        int i2 = this.f20087b;
        int i3 = i2 + 1;
        this.f20087b = i3;
        byte b2 = bArr[i2];
        this.f20087b = i3 + 1;
        return ((bArr[i3] & 255) << 8) | (b2 & 255);
    }

    public final int j() {
        return (k() << 21) | (k() << 14) | (k() << 7) | k();
    }

    public final int k() {
        byte[] bArr = this.f20086a;
        int i2 = this.f20087b;
        this.f20087b = i2 + 1;
        return bArr[i2] & 255;
    }

    public final int l() {
        byte[] bArr = this.f20086a;
        int i2 = this.f20087b;
        int i3 = i2 + 1;
        this.f20087b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20087b = i4;
        byte b3 = bArr[i3];
        this.f20087b = i4 + 2;
        return (b3 & 255) | ((b2 & 255) << 8);
    }

    public final int m() {
        byte[] bArr = this.f20086a;
        int i2 = this.f20087b;
        int i3 = i2 + 1;
        this.f20087b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20087b = i4;
        byte b3 = bArr[i3];
        this.f20087b = i4 + 1;
        return (bArr[i4] & 255) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    public final int n() {
        int iE = e();
        if (iE >= 0) {
            return iE;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iE);
        throw new IllegalStateException(sb.toString());
    }

    public final int o() {
        byte[] bArr = this.f20086a;
        int i2 = this.f20087b;
        int i3 = i2 + 1;
        this.f20087b = i3;
        byte b2 = bArr[i2];
        this.f20087b = i3 + 1;
        return (bArr[i3] & 255) | ((b2 & 255) << 8);
    }

    public final long p() {
        byte[] bArr = this.f20086a;
        int i2 = this.f20087b;
        int i3 = i2 + 1;
        this.f20087b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20087b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f20087b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f20087b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f20087b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f20087b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f20087b = i9;
        byte b8 = bArr[i8];
        this.f20087b = i9 + 1;
        return ((((long) b3) & 255) << 8) | (((long) b2) & 255) | ((((long) b4) & 255) << 16) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 32) | ((((long) b7) & 255) << 40) | ((((long) b8) & 255) << 48) | ((((long) bArr[i9]) & 255) << 56);
    }

    public final long q() {
        byte[] bArr = this.f20086a;
        int i2 = this.f20087b;
        int i3 = i2 + 1;
        this.f20087b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20087b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f20087b = i5;
        byte b4 = bArr[i4];
        this.f20087b = i5 + 1;
        return ((((long) b3) & 255) << 8) | (((long) b2) & 255) | ((((long) b4) & 255) << 16) | ((((long) bArr[i5]) & 255) << 24);
    }

    public final long r() {
        byte[] bArr = this.f20086a;
        int i2 = this.f20087b;
        int i3 = i2 + 1;
        this.f20087b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20087b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f20087b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f20087b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f20087b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f20087b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f20087b = i9;
        byte b8 = bArr[i8];
        this.f20087b = i9 + 1;
        return ((((long) b3) & 255) << 48) | ((((long) b2) & 255) << 56) | ((((long) b4) & 255) << 40) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 24) | ((((long) b7) & 255) << 16) | ((((long) b8) & 255) << 8) | (((long) bArr[i9]) & 255);
    }

    public final long s() {
        byte[] bArr = this.f20086a;
        int i2 = this.f20087b;
        int i3 = i2 + 1;
        this.f20087b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20087b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f20087b = i5;
        byte b4 = bArr[i4];
        this.f20087b = i5 + 1;
        return ((((long) b3) & 255) << 16) | ((((long) b2) & 255) << 24) | ((((long) b4) & 255) << 8) | (((long) bArr[i5]) & 255);
    }

    public final long t() {
        long jR = r();
        if (jR >= 0) {
            return jR;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(jR);
        throw new IllegalStateException(sb.toString());
    }

    public final long u() {
        int i2;
        int i3;
        long j2 = this.f20086a[this.f20087b];
        int i4 = 7;
        while (true) {
            i2 = 0;
            if (i4 < 0) {
                break;
            }
            int i5 = 1 << i4;
            if ((((long) i5) & j2) != 0) {
                i4--;
            } else if (i4 < 6) {
                j2 &= (long) (i5 - 1);
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j2);
            throw new NumberFormatException(sb.toString());
        }
        for (i3 = 1; i3 < i2; i3++) {
            byte b2 = this.f20086a[this.f20087b + i3];
            if ((b2 & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j2);
                throw new NumberFormatException(sb2.toString());
            }
            j2 = (j2 << 6) | ((long) (b2 & 63));
        }
        this.f20087b += i2;
        return j2;
    }

    public final String v() {
        if (a() == 0) {
            return null;
        }
        int i2 = this.f20087b;
        while (i2 < this.f20088c && !amn.S(this.f20086a[i2])) {
            i2++;
        }
        int i3 = this.f20087b;
        if (i2 - i3 >= 3) {
            byte[] bArr = this.f20086a;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                i3 += 3;
                this.f20087b = i3;
            }
        }
        String strD = amn.D(this.f20086a, i3, i2 - i3);
        this.f20087b = i2;
        int i4 = this.f20088c;
        if (i2 == i4) {
            return strD;
        }
        byte[] bArr2 = this.f20086a;
        if (bArr2[i2] == 13) {
            i2++;
            this.f20087b = i2;
            if (i2 == i4) {
                return strD;
            }
        }
        if (bArr2[i2] == 10) {
            this.f20087b = i2 + 1;
        }
        return strD;
    }

    public final String w() {
        if (a() == 0) {
            return null;
        }
        int i2 = this.f20087b;
        while (i2 < this.f20088c && this.f20086a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f20086a;
        int i3 = this.f20087b;
        String strD = amn.D(bArr, i3, i2 - i3);
        this.f20087b = i2;
        if (i2 >= this.f20088c) {
            return strD;
        }
        this.f20087b = i2 + 1;
        return strD;
    }

    public final String x(int i2) {
        if (i2 == 0) {
            return BuildConfig.FLAVOR;
        }
        int i3 = this.f20087b;
        int i4 = (i3 + i2) - 1;
        String strD = amn.D(this.f20086a, i3, (i4 >= this.f20088c || this.f20086a[i4] != 0) ? i2 : i2 - 1);
        this.f20087b += i2;
        return strD;
    }

    public final String y(int i2) {
        return z(i2, arm.f20427b);
    }

    public final String z(int i2, Charset charset) {
        String str = new String(this.f20086a, this.f20087b, i2, charset);
        this.f20087b += i2;
        return str;
    }
}

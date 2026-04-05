package c.f.a.b.t2;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f10103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f10104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f10106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f10108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10109o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    public l0(int i2, int i3, float f2, float f3, int i4) {
        this.f10095a = i2;
        this.f10096b = i3;
        this.f10097c = f2;
        this.f10098d = f3;
        this.f10099e = i2 / i4;
        this.f10100f = i2 / 400;
        int i5 = i2 / 65;
        this.f10101g = i5;
        int i6 = i5 * 2;
        this.f10102h = i6;
        this.f10103i = new short[i6];
        this.f10104j = new short[i6 * i3];
        this.f10106l = new short[i6 * i3];
        this.f10108n = new short[i6 * i3];
    }

    public static void p(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr2[i10] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    public final void a(float f2, int i2) {
        int i3;
        int i4;
        if (this.f10107m == i2) {
            return;
        }
        int i5 = this.f10095a;
        int i6 = (int) (i5 / f2);
        while (true) {
            if (i6 <= 16384 && i5 <= 16384) {
                break;
            }
            i6 /= 2;
            i5 /= 2;
        }
        o(i2);
        int i7 = 0;
        while (true) {
            int i8 = this.f10109o;
            if (i7 >= i8 - 1) {
                u(i8 - 1);
                return;
            }
            while (true) {
                i3 = this.p;
                int i9 = (i3 + 1) * i6;
                i4 = this.q;
                if (i9 <= i4 * i5) {
                    break;
                }
                this.f10106l = f(this.f10106l, this.f10107m, 1);
                int i10 = 0;
                while (true) {
                    int i11 = this.f10096b;
                    if (i10 < i11) {
                        this.f10106l[(this.f10107m * i11) + i10] = n(this.f10108n, (i11 * i7) + i10, i5, i6);
                        i10++;
                    }
                }
                this.q++;
                this.f10107m++;
            }
            int i12 = i3 + 1;
            this.p = i12;
            if (i12 == i5) {
                this.p = 0;
                c.f.a.b.j3.g.g(i4 == i6);
                this.q = 0;
            }
            i7++;
        }
    }

    public final void b(float f2) {
        int iW;
        int i2 = this.f10105k;
        if (i2 < this.f10102h) {
            return;
        }
        int i3 = 0;
        do {
            if (this.r > 0) {
                iW = c(i3);
            } else {
                int iG = g(this.f10104j, i3);
                double d2 = f2;
                short[] sArr = this.f10104j;
                iW = d2 > 1.0d ? iG + w(sArr, i3, f2, iG) : m(sArr, i3, f2, iG);
            }
            i3 += iW;
        } while (this.f10102h + i3 <= i2);
        v(i3);
    }

    public final int c(int i2) {
        int iMin = Math.min(this.f10102h, this.r);
        d(this.f10104j, i2, iMin);
        this.r -= iMin;
        return iMin;
    }

    public final void d(short[] sArr, int i2, int i3) {
        short[] sArrF = f(this.f10106l, this.f10107m, i3);
        this.f10106l = sArrF;
        int i4 = this.f10096b;
        System.arraycopy(sArr, i2 * i4, sArrF, this.f10107m * i4, i4 * i3);
        this.f10107m += i3;
    }

    public final void e(short[] sArr, int i2, int i3) {
        int i4 = this.f10102h / i3;
        int i5 = this.f10096b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.f10103i[i8] = (short) (i9 / i6);
        }
    }

    public final short[] f(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.f10096b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    public final int g(short[] sArr, int i2) {
        int iH;
        int i3 = this.f10095a;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.f10096b == 1 && i4 == 1) {
            iH = h(sArr, i2, this.f10100f, this.f10101g);
        } else {
            e(sArr, i2, i4);
            int iH2 = h(this.f10103i, 0, this.f10100f / i4, this.f10101g / i4);
            if (i4 != 1) {
                int i5 = iH2 * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.f10100f;
                if (i7 < i9) {
                    i7 = i9;
                }
                int i10 = this.f10101g;
                if (i8 > i10) {
                    i8 = i10;
                }
                if (this.f10096b == 1) {
                    iH = h(sArr, i2, i7, i8);
                } else {
                    e(sArr, i2, 1);
                    iH = h(this.f10103i, 0, i7, i8);
                }
            } else {
                iH = iH2;
            }
        }
        int i11 = q(this.u, this.v) ? this.s : iH;
        this.t = this.u;
        this.s = iH;
        return i11;
    }

    public final int h(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f10096b;
        int i6 = 1;
        int i7 = 255;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int iAbs = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                iAbs += Math.abs(sArr[i5 + i10] - sArr[(i5 + i3) + i10]);
            }
            if (iAbs * i8 < i6 * i3) {
                i8 = i3;
                i6 = iAbs;
            }
            if (iAbs * i7 > i9 * i3) {
                i7 = i3;
                i9 = iAbs;
            }
            i3++;
        }
        this.u = i6 / i8;
        this.v = i9 / i7;
        return i8;
    }

    public void i() {
        this.f10105k = 0;
        this.f10107m = 0;
        this.f10109o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f10096b, this.f10107m);
        shortBuffer.put(this.f10106l, 0, this.f10096b * iMin);
        int i2 = this.f10107m - iMin;
        this.f10107m = i2;
        short[] sArr = this.f10106l;
        int i3 = this.f10096b;
        System.arraycopy(sArr, iMin * i3, sArr, 0, i2 * i3);
    }

    public int k() {
        return this.f10107m * this.f10096b * 2;
    }

    public int l() {
        return this.f10105k * this.f10096b * 2;
    }

    public final int m(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 < 0.5f) {
            i4 = (int) ((i3 * f2) / (1.0f - f2));
        } else {
            this.r = (int) ((i3 * ((2.0f * f2) - 1.0f)) / (1.0f - f2));
            i4 = i3;
        }
        int i5 = i3 + i4;
        short[] sArrF = f(this.f10106l, this.f10107m, i5);
        this.f10106l = sArrF;
        int i6 = this.f10096b;
        System.arraycopy(sArr, i2 * i6, sArrF, this.f10107m * i6, i6 * i3);
        p(i4, this.f10096b, this.f10106l, this.f10107m + i3, sArr, i2 + i3, sArr, i2);
        this.f10107m += i5;
        return i4;
    }

    public final short n(short[] sArr, int i2, int i3, int i4) {
        short s = sArr[i2];
        short s2 = sArr[i2 + this.f10096b];
        int i5 = this.q * i3;
        int i6 = this.p;
        int i7 = i6 * i4;
        int i8 = (i6 + 1) * i4;
        int i9 = i8 - i5;
        int i10 = i8 - i7;
        return (short) (((s * i9) + ((i10 - i9) * s2)) / i10);
    }

    public final void o(int i2) {
        int i3 = this.f10107m - i2;
        short[] sArrF = f(this.f10108n, this.f10109o, i3);
        this.f10108n = sArrF;
        short[] sArr = this.f10106l;
        int i4 = this.f10096b;
        System.arraycopy(sArr, i2 * i4, sArrF, this.f10109o * i4, i4 * i3);
        this.f10107m = i2;
        this.f10109o += i3;
    }

    public final boolean q(int i2, int i3) {
        return i2 != 0 && this.s != 0 && i3 <= i2 * 3 && i2 * 2 > this.t * 3;
    }

    public final void r() {
        int i2 = this.f10107m;
        float f2 = this.f10097c;
        float f3 = this.f10098d;
        float f4 = f2 / f3;
        float f5 = this.f10099e * f3;
        double d2 = f4;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            b(f4);
        } else {
            d(this.f10104j, 0, this.f10105k);
            this.f10105k = 0;
        }
        if (f5 != 1.0f) {
            a(f5, i2);
        }
    }

    public void s() {
        int i2;
        int i3 = this.f10105k;
        float f2 = this.f10097c;
        float f3 = this.f10098d;
        int i4 = this.f10107m + ((int) ((((i3 / (f2 / f3)) + this.f10109o) / (this.f10099e * f3)) + 0.5f));
        this.f10104j = f(this.f10104j, i3, (this.f10102h * 2) + i3);
        int i5 = 0;
        while (true) {
            i2 = this.f10102h;
            int i6 = this.f10096b;
            if (i5 >= i2 * 2 * i6) {
                break;
            }
            this.f10104j[(i6 * i3) + i5] = 0;
            i5++;
        }
        this.f10105k += i2 * 2;
        r();
        if (this.f10107m > i4) {
            this.f10107m = i4;
        }
        this.f10105k = 0;
        this.r = 0;
        this.f10109o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i2 = this.f10096b;
        int i3 = iRemaining / i2;
        short[] sArrF = f(this.f10104j, this.f10105k, i3);
        this.f10104j = sArrF;
        shortBuffer.get(sArrF, this.f10105k * this.f10096b, ((i2 * i3) * 2) / 2);
        this.f10105k += i3;
        r();
    }

    public final void u(int i2) {
        if (i2 == 0) {
            return;
        }
        short[] sArr = this.f10108n;
        int i3 = this.f10096b;
        System.arraycopy(sArr, i2 * i3, sArr, 0, (this.f10109o - i2) * i3);
        this.f10109o -= i2;
    }

    public final void v(int i2) {
        int i3 = this.f10105k - i2;
        short[] sArr = this.f10104j;
        int i4 = this.f10096b;
        System.arraycopy(sArr, i2 * i4, sArr, 0, i4 * i3);
        this.f10105k = i3;
    }

    public final int w(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 >= 2.0f) {
            i4 = (int) (i3 / (f2 - 1.0f));
        } else {
            this.r = (int) ((i3 * (2.0f - f2)) / (f2 - 1.0f));
            i4 = i3;
        }
        short[] sArrF = f(this.f10106l, this.f10107m, i4);
        this.f10106l = sArrF;
        p(i4, this.f10096b, sArrF, this.f10107m, sArr, i2, sArr, i2 + i3);
        this.f10107m += i4;
        return i4;
    }
}

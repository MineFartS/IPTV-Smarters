package com.google.ads.interactivemedia.v3.internal;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f22747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f22748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f22749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f22750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f22751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f22752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f22753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f22754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f22755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f22756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f22757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f22758n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f22759o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    public pq(int i2, int i3, float f2, float f3, int i4) {
        this.f22745a = i2;
        this.f22746b = i3;
        this.f22747c = f2;
        this.f22748d = f3;
        this.f22749e = i2 / i4;
        this.f22750f = i2 / 400;
        int i5 = i2 / 65;
        this.f22751g = i5;
        int i6 = i5 + i5;
        this.f22752h = i6;
        this.f22753i = new short[i6];
        int i7 = i6 * i3;
        this.f22754j = new short[i7];
        this.f22756l = new short[i7];
        this.f22758n = new short[i7];
    }

    private final int g(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f22746b;
        int i6 = 1;
        int i7 = 255;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int iAbs = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                iAbs += Math.abs(sArr[i5 + i10] - sArr[(i5 + i3) + i10]);
            }
            int i11 = iAbs * i8;
            int i12 = i6 * i3;
            if (i11 < i12) {
                i6 = iAbs;
            }
            if (i11 < i12) {
                i8 = i3;
            }
            int i13 = iAbs * i7;
            int i14 = i9 * i3;
            if (i13 > i14) {
                i9 = iAbs;
            }
            if (i13 > i14) {
                i7 = i3;
            }
            i3++;
        }
        this.u = i6 / i8;
        this.v = i9 / i7;
        return i8;
    }

    private final void h(short[] sArr, int i2, int i3) {
        short[] sArrL = l(this.f22756l, this.f22757m, i3);
        this.f22756l = sArrL;
        int i4 = this.f22746b;
        System.arraycopy(sArr, i2 * i4, sArrL, this.f22757m * i4, i4 * i3);
        this.f22757m += i3;
    }

    private final void i(short[] sArr, int i2, int i3) {
        int i4 = this.f22752h / i3;
        int i5 = this.f22746b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.f22753i[i8] = (short) (i9 / i6);
        }
    }

    private static void j(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
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

    private final void k() {
        int iG;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f22757m;
        float f2 = this.f22747c;
        float f3 = this.f22748d;
        float f4 = f2 / f3;
        float f5 = this.f22749e * f3;
        double d2 = f4;
        float f6 = 1.0f;
        int i10 = 1;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            int i11 = this.f22755k;
            if (i11 >= this.f22752h) {
                int i12 = 0;
                while (true) {
                    int i13 = this.r;
                    if (i13 > 0) {
                        int iMin = Math.min(this.f22752h, i13);
                        h(this.f22754j, i12, iMin);
                        this.r -= iMin;
                        i12 += iMin;
                    } else {
                        short[] sArr = this.f22754j;
                        int i14 = this.f22745a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f22746b == i10 && i15 == i10) {
                            iG = g(sArr, i12, this.f22750f, this.f22751g);
                        } else {
                            i(sArr, i12, i15);
                            int iG2 = g(this.f22753i, 0, this.f22750f / i15, this.f22751g / i15);
                            if (i15 != i10) {
                                int i16 = iG2 * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f22750f;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f22751g;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f22746b == i10) {
                                    iG = g(sArr, i12, i18, i19);
                                } else {
                                    i(sArr, i12, i10);
                                    iG = g(this.f22753i, 0, i18, i19);
                                }
                            } else {
                                iG = iG2;
                            }
                        }
                        int i22 = this.u;
                        int i23 = (i22 == 0 || (i4 = this.s) == 0 || this.v > i22 * 3 || i22 + i22 <= this.t * 3) ? iG : i4;
                        this.t = i22;
                        this.s = iG;
                        if (d2 > 1.0d) {
                            short[] sArr2 = this.f22754j;
                            if (f4 >= 2.0f) {
                                i3 = (int) (i23 / ((-1.0f) + f4));
                            } else {
                                this.r = (int) ((i23 * (2.0f - f4)) / ((-1.0f) + f4));
                                i3 = i23;
                            }
                            short[] sArrL = l(this.f22756l, this.f22757m, i3);
                            this.f22756l = sArrL;
                            int i24 = i3;
                            j(i3, this.f22746b, sArrL, this.f22757m, sArr2, i12, sArr2, i12 + i23);
                            this.f22757m += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.f22754j;
                            if (f4 < 0.5f) {
                                i2 = (int) ((i25 * f4) / (f6 - f4));
                            } else {
                                this.r = (int) ((i25 * ((f4 + f4) - 1.0f)) / (f6 - f4));
                                i2 = i25;
                            }
                            int i26 = i25 + i2;
                            short[] sArrL2 = l(this.f22756l, this.f22757m, i26);
                            this.f22756l = sArrL2;
                            int i27 = this.f22746b;
                            System.arraycopy(sArr3, i12 * i27, sArrL2, this.f22757m * i27, i27 * i25);
                            j(i2, this.f22746b, this.f22756l, this.f22757m + i25, sArr3, i12 + i25, sArr3, i12);
                            this.f22757m += i26;
                            i12 += i2;
                        }
                    }
                    if (this.f22752h + i12 > i11) {
                        break;
                    }
                    f6 = 1.0f;
                    i10 = 1;
                }
                int i28 = this.f22755k - i12;
                short[] sArr4 = this.f22754j;
                int i29 = this.f22746b;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.f22755k = i28;
                f6 = 1.0f;
            }
        } else {
            h(this.f22754j, 0, this.f22755k);
            this.f22755k = 0;
        }
        if (f5 == f6 || this.f22757m == i9) {
            return;
        }
        int i30 = this.f22745a;
        int i31 = (int) (i30 / f5);
        while (true) {
            if (i31 <= 16384 && i30 <= 16384) {
                break;
            }
            i31 /= 2;
            i30 /= 2;
        }
        int i32 = this.f22757m - i9;
        short[] sArrL3 = l(this.f22758n, this.f22759o, i32);
        this.f22758n = sArrL3;
        short[] sArr5 = this.f22756l;
        int i33 = this.f22746b;
        System.arraycopy(sArr5, i9 * i33, sArrL3, this.f22759o * i33, i33 * i32);
        this.f22757m = i9;
        this.f22759o += i32;
        int i34 = 0;
        while (true) {
            i5 = this.f22759o;
            i6 = i5 - 1;
            if (i34 >= i6) {
                break;
            }
            while (true) {
                i7 = this.p + 1;
                i8 = this.q;
                if (i7 * i31 <= i8 * i30) {
                    break;
                }
                this.f22756l = l(this.f22756l, this.f22757m, 1);
                int i35 = 0;
                while (true) {
                    int i36 = this.f22746b;
                    if (i35 < i36) {
                        short[] sArr6 = this.f22756l;
                        int i37 = this.f22757m;
                        short[] sArr7 = this.f22758n;
                        int i38 = (i34 * i36) + i35;
                        short s = sArr7[i38];
                        short s2 = sArr7[i38 + i36];
                        int i39 = this.q;
                        int i40 = this.p;
                        int i41 = (i40 + 1) * i31;
                        int i42 = i41 - (i39 * i30);
                        int i43 = i41 - (i40 * i31);
                        sArr6[(i37 * i36) + i35] = (short) (((s * i42) + ((i43 - i42) * s2)) / i43);
                        i35++;
                    }
                }
                this.q++;
                this.f22757m++;
            }
            this.p = i7;
            if (i7 == i30) {
                this.p = 0;
                ajr.f(i8 == i31);
                this.q = 0;
            }
            i34++;
        }
        if (i6 != 0) {
            short[] sArr8 = this.f22758n;
            int i44 = this.f22746b;
            System.arraycopy(sArr8, i6 * i44, sArr8, 0, (i5 - i6) * i44);
            this.f22759o -= i6;
        }
    }

    private final short[] l(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.f22746b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    public final int a() {
        int i2 = this.f22757m * this.f22746b;
        return i2 + i2;
    }

    public final int b() {
        int i2 = this.f22755k * this.f22746b;
        return i2 + i2;
    }

    public final void c() {
        this.f22755k = 0;
        this.f22757m = 0;
        this.f22759o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public final void d(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f22746b, this.f22757m);
        shortBuffer.put(this.f22756l, 0, this.f22746b * iMin);
        int i2 = this.f22757m - iMin;
        this.f22757m = i2;
        short[] sArr = this.f22756l;
        int i3 = this.f22746b;
        System.arraycopy(sArr, iMin * i3, sArr, 0, i2 * i3);
    }

    public final void e() {
        int i2;
        int i3 = this.f22755k;
        float f2 = this.f22747c;
        float f3 = this.f22748d;
        int i4 = this.f22757m + ((int) ((((i3 / (f2 / f3)) + this.f22759o) / (this.f22749e * f3)) + 0.5f));
        short[] sArr = this.f22754j;
        int i5 = this.f22752h;
        this.f22754j = l(sArr, i3, i5 + i5 + i3);
        int i6 = 0;
        while (true) {
            int i7 = this.f22752h;
            i2 = i7 + i7;
            int i8 = this.f22746b;
            if (i6 >= i2 * i8) {
                break;
            }
            this.f22754j[(i8 * i3) + i6] = 0;
            i6++;
        }
        this.f22755k += i2;
        k();
        if (this.f22757m > i4) {
            this.f22757m = i4;
        }
        this.f22755k = 0;
        this.r = 0;
        this.f22759o = 0;
    }

    public final void f(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i2 = this.f22746b;
        int i3 = iRemaining / i2;
        int i4 = i2 * i3;
        short[] sArrL = l(this.f22754j, this.f22755k, i3);
        this.f22754j = sArrL;
        shortBuffer.get(sArrL, this.f22755k * this.f22746b, (i4 + i4) / 2);
        this.f22755k += i3;
        k();
    }
}

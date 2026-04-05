package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public final class bke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bkg f21266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f21267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21273j;

    private bke() {
        this.f21265b = 100;
    }

    public /* synthetic */ bke(byte[] bArr) {
        this.f21265b = 100;
    }

    public /* synthetic */ bke(byte[] bArr, int i2, int i3) {
        this(null);
        this.f21273j = Integer.MAX_VALUE;
        this.f21267d = bArr;
        this.f21268e = i3;
        this.f21270g = 0;
        this.f21271h = 0;
    }

    private final void I() {
        int i2 = this.f21268e + this.f21269f;
        this.f21268e = i2;
        int i3 = this.f21273j;
        if (i2 <= i3) {
            this.f21269f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f21269f = i4;
        this.f21268e = i2 - i4;
    }

    public static int a(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long b(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static bke c(byte[] bArr, int i2, int i3, boolean z) {
        bke bkeVar = new bke(bArr, 0, i3);
        try {
            bkeVar.h(i3);
            return bkeVar;
        } catch (blf e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final String A() throws blf {
        int iM = m();
        if (iM > 0) {
            int i2 = this.f21268e;
            int i3 = this.f21270g;
            if (iM <= i2 - i3) {
                String str = new String(this.f21267d, i3, iM, bld.f21341a);
                this.f21270g += iM;
                return str;
            }
        }
        if (iM == 0) {
            return BuildConfig.FLAVOR;
        }
        if (iM < 0) {
            throw blf.f();
        }
        throw blf.h();
    }

    public final String B() throws blf {
        int iM = m();
        if (iM > 0) {
            int i2 = this.f21268e;
            int i3 = this.f21270g;
            if (iM <= i2 - i3) {
                String strD = bnm.d(this.f21267d, i3, iM);
                this.f21270g += iM;
                return strD;
            }
        }
        if (iM == 0) {
            return BuildConfig.FLAVOR;
        }
        if (iM <= 0) {
            throw blf.f();
        }
        throw blf.h();
    }

    public final void C(int i2) {
        if (this.f21272i != i2) {
            throw blf.b();
        }
    }

    public final void D(int i2) {
        this.f21273j = i2;
        I();
    }

    public final void E(int i2) throws blf {
        if (i2 >= 0) {
            int i3 = this.f21268e;
            int i4 = this.f21270g;
            if (i2 <= i3 - i4) {
                this.f21270g = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw blf.h();
        }
        throw blf.f();
    }

    public final boolean F() {
        return this.f21270g == this.f21268e;
    }

    public final boolean G() {
        return u() != 0;
    }

    public final boolean H(int i2) throws blf {
        int iP;
        int iB = bnp.b(i2);
        int i3 = 0;
        if (iB == 0) {
            if (this.f21268e - this.f21270g < 10) {
                while (i3 < 10) {
                    if (d() < 0) {
                        i3++;
                    }
                }
                throw blf.e();
            }
            while (i3 < 10) {
                byte[] bArr = this.f21267d;
                int i4 = this.f21270g;
                this.f21270g = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw blf.e();
            return true;
        }
        if (iB == 1) {
            E(8);
            return true;
        }
        if (iB == 2) {
            E(m());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw blf.a();
            }
            E(4);
            return true;
        }
        do {
            iP = p();
            if (iP == 0) {
                break;
            }
        } while (H(iP));
        C(bnp.c(bnp.a(i2), 4));
        return true;
    }

    public final byte d() throws blf {
        int i2 = this.f21270g;
        if (i2 == this.f21268e) {
            throw blf.h();
        }
        byte[] bArr = this.f21267d;
        this.f21270g = i2 + 1;
        return bArr[i2];
    }

    public final double e() {
        return Double.longBitsToDouble(t());
    }

    public final float f() {
        return Float.intBitsToFloat(l());
    }

    public final int g() {
        return this.f21270g;
    }

    public final int h(int i2) throws blf {
        if (i2 < 0) {
            throw blf.f();
        }
        int iG = i2 + g();
        if (iG < 0) {
            throw blf.g();
        }
        int i3 = this.f21273j;
        if (iG > i3) {
            throw blf.h();
        }
        this.f21273j = iG;
        I();
        return i3;
    }

    public final int i() {
        return m();
    }

    public final int j() {
        return l();
    }

    public final int k() {
        return m();
    }

    public final int l() throws blf {
        int i2 = this.f21270g;
        if (this.f21268e - i2 < 4) {
            throw blf.h();
        }
        byte[] bArr = this.f21267d;
        this.f21270g = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2[r3] >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m() {
        /*
            r5 = this;
            int r0 = r5.f21270g
            int r1 = r5.f21268e
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f21267d
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f21270g = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.f21270g = r1
            return r0
        L6c:
            long r0 = r5.v()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bke.m():int");
    }

    public final int n() {
        return l();
    }

    public final int o() {
        return a(m());
    }

    public final int p() throws blf {
        if (F()) {
            this.f21272i = 0;
            return 0;
        }
        int iM = m();
        this.f21272i = iM;
        if (bnp.a(iM) != 0) {
            return this.f21272i;
        }
        throw blf.c();
    }

    public final int q() {
        return m();
    }

    public final long r() {
        return t();
    }

    public final long s() {
        return u();
    }

    public final long t() throws blf {
        int i2 = this.f21270g;
        if (this.f21268e - i2 < 8) {
            throw blf.h();
        }
        byte[] bArr = this.f21267d;
        this.f21270g = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public final long u() {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        int i3 = this.f21270g;
        int i4 = this.f21268e;
        if (i4 != i3) {
            byte[] bArr = this.f21267d;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f21270g = i5;
                return b2;
            }
            if (i4 - i5 >= 9) {
                int i6 = i5 + 1;
                int i7 = b2 ^ (bArr[i5] << 7);
                if (i7 >= 0) {
                    int i8 = i6 + 1;
                    int i9 = i7 ^ (bArr[i6] << DateTimeFieldType.HOUR_OF_HALFDAY);
                    if (i9 >= 0) {
                        j2 = i9 ^ 16256;
                    } else {
                        i6 = i8 + 1;
                        int i10 = i9 ^ (bArr[i8] << DateTimeFieldType.SECOND_OF_MINUTE);
                        if (i10 < 0) {
                            i2 = i10 ^ (-2080896);
                        } else {
                            i8 = i6 + 1;
                            long j6 = (((long) bArr[i6]) << 28) ^ ((long) i10);
                            if (j6 < 0) {
                                int i11 = i8 + 1;
                                long j7 = j6 ^ (((long) bArr[i8]) << 35);
                                if (j7 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i8 = i11 + 1;
                                    j6 = j7 ^ (((long) bArr[i11]) << 42);
                                    if (j6 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i11 = i8 + 1;
                                        j7 = j6 ^ (((long) bArr[i8]) << 49);
                                        if (j7 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i8 = i11 + 1;
                                            j2 = (j7 ^ (((long) bArr[i11]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i11 = i8 + 1;
                                                if (bArr[i8] >= 0) {
                                                    j3 = j2;
                                                    i6 = i11;
                                                    this.f21270g = i6;
                                                    return j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j4 ^ j7;
                                i6 = i11;
                                this.f21270g = i6;
                                return j3;
                            }
                            j5 = 266354560;
                            j2 = j6 ^ j5;
                        }
                    }
                    i6 = i8;
                    j3 = j2;
                    this.f21270g = i6;
                    return j3;
                }
                i2 = i7 ^ (-128);
                j3 = i2;
                this.f21270g = i6;
                return j3;
            }
        }
        return v();
    }

    public final long v() throws blf {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte bD = d();
            j2 |= ((long) (bD & 127)) << i2;
            if ((bD & 128) == 0) {
                return j2;
            }
        }
        throw blf.e();
    }

    public final long w() {
        return t();
    }

    public final long x() {
        return b(u());
    }

    public final long y() {
        return u();
    }

    public final bkd z() throws blf {
        int iM = m();
        if (iM > 0) {
            int i2 = this.f21268e;
            int i3 = this.f21270g;
            if (iM <= i2 - i3) {
                bkd bkdVarP = bkd.p(this.f21267d, i3, iM);
                this.f21270g += iM;
                return bkdVarP;
            }
        }
        if (iM == 0) {
            return bkd.f21262b;
        }
        if (iM > 0) {
            int i4 = this.f21268e;
            int i5 = this.f21270g;
            if (iM <= i4 - i5) {
                int i6 = iM + i5;
                this.f21270g = i6;
                return bkd.r(Arrays.copyOfRange(this.f21267d, i5, i6));
            }
        }
        if (iM <= 0) {
            throw blf.f();
        }
        throw blf.h();
    }
}
